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

import org.openqa.selenium.By
import org.openqa.selenium.By.ById
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getAttributeOf, getAttributeOfId, getTextOf}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._

class RFMPagesStepDef extends BaseStepDef with BrowserDriver {

  Given("""^(.*) logs in with rfm URL to Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUserToRFM(name)
      case "Individual User" => AuthLoginPage.loginAsIndToRFM(name)
      case "Agent User" => AuthLoginPage.loginAsAgentToRFM(name)
      case "Assistant User" => AuthLoginPage.loginAssistantToRFM(name)

    }
  }

  Given("""^I access RFM (.*) page$""") { (name: String) =>
    name match {
      case "start" => Nav.navigateTo(RFMStartPage.url)
      case "corporate position" => Nav.navigateTo(RFMCorpPositionPage.url)
      case "New NFM guidance" => Nav.navigateTo(NewNFMGuidancePage.url)
      case "Contact Guidance" => Nav.navigateTo(RFMContactGuidancePage.url)
      case "CYA NFM" => Nav.navigateTo(RFMNewNFMContactNamePage.url)
      case "Saving Progress" => Nav.navigateTo(RFMSavingProgressPage.url)
      case "contact email" => Nav.navigateTo(RFMContactEmailPage.url)


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
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.pillar2topuptaxid)
        Input.sendKeysByCss(name, RFMEnterPillar2IdPage.pillar2topuptaxid)

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

      case "contact name change" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorLink)
        getTextOf(By cssSelector (RFMNewNFMContactNameChangePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorMessage)
        getTextOf(By cssSelector (RFMNewNFMContactNameChangePage.errorMessage)) should include(error)

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
        Input.sendKeysById(name, RFMRegistrationDatePage.regDay)

      case "Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regMonth)
        Input.sendKeysById(name, RFMRegistrationDatePage.regMonth)

      case "Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regYear)
        Input.sendKeysById(name, RFMRegistrationDatePage.regYear)

    }
  }

  When("""^Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service$""") { (enrolmentkey: String, identifiername:String, identifiervalue:String) =>
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
      case "Pillar 2 top-up taxes ID" =>
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
    option match {
      case "UPE" => Input.clickById("value_0")
      case "NFM" => Input.clickById("value_1")
    }
  }
  And("""^I should see the row (\d+) value (.*)$""") { (row: Int, value: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElements(By.cssSelector(RFMFinalReviewCYAPage.valueList)).get(row - 1).getText.contains(value))
  }

  Given("""^(.*) logs in to RFM with credId (.*) for Pillar2""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUserToRFMWithCredId(name, credId)
      case _ =>  AuthLoginPage.loginWithUserToRFMWithCredId(name, credId)
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
}
