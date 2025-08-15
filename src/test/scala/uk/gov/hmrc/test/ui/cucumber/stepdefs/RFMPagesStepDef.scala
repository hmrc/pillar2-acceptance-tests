/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Check.assertNavigationUrl
import uk.gov.hmrc.test.ui.cucumber.Find.findURL
import uk.gov.hmrc.test.ui.cucumber.Input._
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._
import java.time.LocalDate
import scala.util.Try
import scala.collection.JavaConverters._

class RFMPagesStepDef extends BaseStepDef with BrowserDriver with CommonFunctions {

  Given("""^(.*) logs in with rfm URL to Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUserToRFM(name)
      case "Individual User"   => AuthLoginPage.loginAsIndToRFM(name)
      case "Agent User"        => AuthLoginPage.loginAsAgentToRFM(name)
      case "Assistant User"    => AuthLoginPage.loginAssistantToRFM(name)

    }
  }

  Given("""^I access RFM (.*) page$""") { (name: String) =>
    name match {
      case "start"              => Nav.navigateTo(RFMStartPage.url)
      case "corporate position" => Nav.navigateTo(RFMCorpPositionPage.url)
      case "New NFM guidance"   => Nav.navigateTo(NewNFMGuidancePage.url)
      case "Contact Guidance"   => Nav.navigateTo(RFMContactGuidancePage.url)
      case "CYA NFM"            => Nav.navigateTo(RFMNewNFMContactNamePage.url)
      case "Saving Progress"    => Nav.navigateTo(RFMSavingProgressPage.url)
      case "contact email"      => Nav.navigateTo(RFMContactEmailPage.url)

    }
  }

  And("""^I should see RFM field (.*) is pre-populated with (.*)$""") { (field: String, name: String) =>
    field match {
      case "pillar2 id" =>
        assert(getAttributeOf(RFMEnterPillar2IdPage.pillar2topuptaxid, "value").equals(name))
    }
  }

  And("""^I should see RFM date field (.*) is pre-populated with (.*)$""") { (field: String, name: String) =>
    field match {
      case "Start Day" =>
        assert(getAttributeOfId(RFMRegistrationDatePage.regDay, "value").equals(name))

      case "Start Month" =>
        assert(getAttributeOfId(RFMRegistrationDatePage.regMonth, "value").equals(name))

      case "Start Year" =>
        assert(getAttributeOfId(RFMRegistrationDatePage.regYear, "value").equals(name))
    }
  }

  And("""^I should see the corporate position (.*) remain selected$""") { (answer: String) =>
    Check.checkOptionSelected(answer)
  }

  And("""^I provide RFM (.*) as (.*)$""") { (field: String, name: String) =>
    field match {
      case "pillar2 id" =>
        val targetUrl = RFMEnterPillar2IdPage.url
        val current0  = driver.getCurrentUrl
        if (!current0.contains("/replace-filing-member/security/enter-pillar2-id")) {
          Nav.navigateTo(targetUrl)
          WaitUtils.waitForPageToFullyLoad()
        }
        WaitUtils.waitForPageStability()
        WaitUtils.waitForPageToFullyLoad()
        
        var attempts = 0
        var foundPillar2Field = false
        
        while (!foundPillar2Field && attempts < 3) {
          val currentUrl = driver.getCurrentUrl
          
          if (currentUrl.contains("auth-login-stub") || currentUrl.contains("gg-sign-in")) {
            Try {
          
              val submitElements = driver.findElements(By.cssSelector("button[type='submit'], input[type='submit'], button:not([type]), .govuk-button, a.govuk-button"))
              if (submitElements.size() > 0) {
      
                Try {
                  val redirectField = driver.findElement(By.name("redirectionUrl"))
                  if (redirectField != null) {
                    val currentValue = redirectField.getAttribute("value")
                    if (!currentValue.contains("enter-pillar2-id")) {
                      redirectField.clear()
                      redirectField.sendKeys("http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/security/enter-pillar2-id")
                    }
                  }
                }.recover(_ => ())
                 val element = submitElements.get(0)
                 WaitUtils.scrollToElement(element)
                 WaitUtils.clickWithRetry(element)
              
                WaitUtils.waitForUrlToChange(currentUrl)
                WaitUtils.waitForPageToFullyLoad()
              }
            }.recover {
              case e =>
                println(s"Auth stub handling attempt $attempts failed: ${e.getMessage}")
            }
          }
          
          
          Try {
            val elements = driver.findElements(By.cssSelector("#value, #pillar2topuptaxid, input[name='value'], input[id*='pillar2']"))
            if (elements.size() > 0) {
              
              val field = elements.get(0)
              WaitUtils.scrollToElement(field)
              WaitUtils.sendKeysWithRetry(field, name)
              foundPillar2Field = true
            } else {
              throw new NoSuchElementException("Pillar2 field not present yet")
            }
          }.recover {
            case _ =>
              val current = driver.getCurrentUrl
              val h1      = Try(driver.findElement(By.tagName("h1")).getText).getOrElse("-")
              println(s"[DEBUG] Pillar2 field missing. URL=$current H1=$h1")
            
              if (current.contains("auth-login-stub") || current.contains("gg-sign-in") || current.contains("restart-error") || current.contains("incomplete")) {
                driver.findElements(By.cssSelector("button[type='submit'], .govuk-button, a.govuk-button"))
                  .asScala
                  .headOption
                  .foreach { btn =>
                    WaitUtils.scrollToElement(btn)
                    WaitUtils.clickWithRetry(btn)
                    WaitUtils.waitForUrlToChange(current)
                    WaitUtils.waitForPageToFullyLoad()
                  }
              } else if (!current.contains("/replace-filing-member/security/enter-pillar2-id")) {
            
                Nav.navigateTo(targetUrl)
                WaitUtils.waitForPageToFullyLoad()
              }
          }
          
          attempts += 1
          
          if (!foundPillar2Field && attempts < 3) {
          
            WaitUtils.waitForPageStability()
          }
        }
        
    
        if (!foundPillar2Field) {
          val pillar2Field = WaitUtils.waitForElementWithRetry(By.cssSelector(RFMEnterPillar2IdPage.pillar2topuptaxid))
          WaitUtils.sendKeysWithRetry(pillar2Field, name)
        }

      case "contact name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.nameField)
        Input.sendKeysByCss(name, RFMContactDetailNamePage.nameField)

      case "contact email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactEmailPage.emailField)
        Input.sendKeysByCss(name, RFMContactEmailPage.emailField)

      case "contact number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactInputPage.telephoneField)
        Input.sendKeysByCss(name, RFMContactInputPage.telephoneField)

      case "New NFM Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.nameField)
        Input.sendKeysByCss(name, RFMNewNFMContactNamePage.nameField)

      case "second contact number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMSecondContactTelephonePage.telephoneField)
        Input.sendKeysByCss(name, RFMSecondContactTelephonePage.telephoneField)

    }
    RFMStartPage.clickContinue()
  }

  And("""^I should see an error message (.*) on the RFM (.*) Page$""") { (error: String, page: String) =>
    page match {
      case "start" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorLink)
        getTextOf(By cssSelector (RFMStartPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorMessage)
        getTextOf(By cssSelector (RFMStartPage.errorMessage)) should include(error)

      case "enter pillar2 id" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorLink)
        getTextOf(By cssSelector (RFMEnterPillar2IdPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorMessage)
        getTextOf(By cssSelector (RFMEnterPillar2IdPage.errorMessage)) should include(error)

      case "Registration Date" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorLink)
        getTextOf(By cssSelector (RFMRegistrationDatePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorMessage)
        getTextOf(By cssSelector (RFMRegistrationDatePage.errorMessage)) should include(error)

      case "journey error" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorLink)
        getTextOf(By cssSelector (RFMCorpPositionPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorMessage)
        getTextOf(By cssSelector (RFMCorpPositionPage.errorMessage)) should include(error)

      case "contact detail" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorLink)
        getTextOf(By cssSelector (RFMContactDetailNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorMessage)
        getTextOf(By cssSelector (RFMContactDetailNamePage.errorMessage)) should include(error)

      case "contact name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.errorLink)
        getTextOf(By cssSelector (RFMNewNFMContactNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.errorMessage)
        getTextOf(By cssSelector (RFMNewNFMContactNamePage.errorMessage)) should include(error)

      case "second contact name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMSecondContactNamePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactNamePage.errorLink)
        getTextOf(By cssSelector (RFMSecondContactNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactNamePage.errorMessage)
        getTextOf(By cssSelector (RFMSecondContactNamePage.errorMessage)) should include(error)

      case "contact address change" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorLink)
        getTextOf(By cssSelector (RFMNewNFMContactAddressChange.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorMessage)
        getTextOf(By cssSelector (RFMNewNFMContactAddressChange.errorMessage)) should include(error)

      case "contact email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMSecondContactEmailPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactEmailPage.errorLink)
        getTextOf(By cssSelector (RFMSecondContactEmailPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactEmailPage.errorMessage)
        getTextOf(By cssSelector (RFMSecondContactEmailPage.errorMessage)) should include(error)

      case "input telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMSecondContactTelephoneQuestionPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactTelephoneQuestionPage.errorLink)
        getTextOf(By cssSelector (RFMSecondContactTelephoneQuestionPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMSecondContactTelephoneQuestionPage.errorMessage)
        getTextOf(By cssSelector (RFMSecondContactTelephoneQuestionPage.errorMessage)) should include(error)
    }
  }

  And("""^Registration (.*) is entered as (.*)$""") { (field: String, name: String) =>
    field match {
      case "Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regDay)
        Input.sendKeysById(RFMRegistrationDatePage.regDay, name)

      case "Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regMonth)
        Input.sendKeysById(RFMRegistrationDatePage.regMonth, name)

      case "Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regYear)
        Input.sendKeysById(RFMRegistrationDatePage.regYear, name)
    }
  }

  When("""I enter future date""") { () =>
    val futureDate: LocalDate = LocalDate.now().plusDays(1)
    Input.sendKeysById(RFMRegistrationDatePage.regDay, futureDate.getDayOfMonth.toString)
    Input.sendKeysById(RFMRegistrationDatePage.regMonth, futureDate.getMonthValue.toString)
    Input.sendKeysById(RFMRegistrationDatePage.regYear, futureDate.getYear.toString)
  }

  When("""^Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service$""") {
    (enrolmentkey: String, identifiername: String, identifiervalue: String) =>
      AuthLoginPage.loginWithExistingEntity(enrolmentkey, identifiername, identifiervalue)
      AuthLoginPage.loginWithExistingEntityWithRFM(enrolmentkey, identifiername, identifiervalue)
  }

  And("""^I should see 4 sections on RFM start page""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(RFMStartPage.sections)
    assert(driver.findElements(By.cssSelector(RFMStartPage.sections)).size() == 4)
  }

  And("""^I should see the section (\d+) as (.*)""") { (sectionNumber: Int, sectionName: String) =>
    assert(driver.findElements(By.cssSelector(RFMStartPage.sections)).get(sectionNumber - 1).getText.contains(sectionName))
  }

  And("""^I click change link for RFM (.*)""") { (link: String) =>
    link match {
      case "Pillar 2 Top-up Taxes ID" =>
        clickByCss(RFMCYAPage.changePID)
      case "Registration date" =>
        clickByCss(RFMCYAPage.changeRegistrationDate)
      case "New NFM Name" =>
        clickByCss(RFMNoIDCYAPage.changeName)
      case "Corporate Position" =>
        clickByCss(RFMFinalReviewCYAPage.changeCorporatePosition)
      case "Company" =>
        clickByCss(RFMFinalReviewCYAPage.changeCompany)
      case "Input Name" =>
        clickByCss(RFMFinalReviewCYAPage.changeInputName)
      case "Input Address" =>
        clickByCss(RFMFinalReviewCYAPage.changeInputAddress)
      case "New RFM CYA Change Contact preference" =>
        clickByCss(RFMFinalReviewCYAPage.changeTelephonecontact)
      case "Change Second Contact Preference" =>
        clickByCss(RFMFinalReviewCYAPage.changeSecondContactPreference)
      case "Change Address" =>
        clickByCss(RFMFinalReviewCYAPage.changeAddress)
    }
  }
  And("""^I select corp position as (.*)$""") { (option: String) =>
    import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
    import org.openqa.selenium.By
    
    WaitUtils.waitForPageToFullyLoad()
    WaitUtils.stabilizeAndWait()
    
    val radioId = option match {
      case "UPE" => "value_0"
      case "NFM" => "value_1"
    }
    
   
    try {
      val radioLabel = WaitUtils.waitForElementWithRetry(By.cssSelector(s"label[for='$radioId']"))
      WaitUtils.clickWithRetry(radioLabel)
    } catch {
      case _: Exception =>
        try {
          val radioInput = WaitUtils.waitForElementWithRetry(By.id(radioId))
          WaitUtils.clickWithRetry(radioInput)
        } catch {
          case _: Exception =>
        
            Input.clickById(radioId)
        }
    }
    
    RFMStartPage.clickContinue()
  }

  And("""^I should see the row (\d+) value (.*)$""") { (row: Int, value: String) =>
    WaitUtils.waitForPageToFullyLoad()
    WaitUtils.stabilizeAndWait()
    Wait.waitForElementToPresentByCssSelector(RFMFinalReviewCYAPage.valueList)
    
    val elements = driver.findElements(By.cssSelector(RFMFinalReviewCYAPage.valueList))
    val index = row - 1
    
    assert(elements.size() > index, s"Expected at least $row elements but found ${elements.size()}")
    assert(elements.get(index).getText.contains(value), s"Row $row did not contain expected value: $value")
  }

  Given("""^(.*) logs in to RFM with credId (.*) for Pillar2""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUserToRFMWithCredId(name, credId)
      case _                   => AuthLoginPage.loginWithUserToRFMWithCredId(name, credId)
    }
  }

  And("""^I should see RFM (.*) field as blank$""") { (value: String) =>
    value match {
      case "Pillar2 Id" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElement(By.cssSelector(RFMEnterPillar2IdPage.pillar2topuptaxid)).getAttribute("value").isEmpty())

      case "Registration Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElement(By.id(RFMRegistrationDatePage.regDay)).getAttribute("value").isEmpty())

      case "Registration Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElement(By.id(RFMRegistrationDatePage.regMonth)).getAttribute("value").isEmpty())

      case "Registration Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElement(By.id(RFMRegistrationDatePage.regYear)).getAttribute("value").isEmpty())
    }
  }

  Then("""^I navigate back to RFM CYA Page from GRS Page""") { () =>
    for (i <- 1 to 5) {
      clickByCss(BusinessActivityEQPage.backLink)
    }
  }

  Then("""^I should see (.*) text is not clickable""") { (linkText: String) =>
    Wait.waitForCSSElementNotToPresent("[href='report-pillar2-top-up-taxes/banner']")
  }

  And("""^I continue to RFM contact name Page""") { () =>
    for (i <- 0 to 2) {
      InitialGuidancePage.clickContinue()
    }
  }

  And("""^I enter registration date as:$""") { (registrationDate: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(registrationDate)
    UPEEntityTypePage.clickContinue()
  }

  Then("""I should be redirected to {string} or {string}""") { (page1: String, page2: String) =>
    Wait.waitForElementToClickTagName("h1")

    val pageOption1 = pageMatch(page1)
    val pageOption2 = pageMatch(page2)

    val navigated = Try { assertNavigationUrl(pageOption1) }.getOrElse(false) || Try { assertNavigationUrl(pageOption2) }.getOrElse(false)

    assert(
      navigated,
      s"Navigation failed. Expected URL to match either '${pageOption1.url}' or '${pageOption2.url}', but current URL was '${findURL()}'"
    )
  }
}
