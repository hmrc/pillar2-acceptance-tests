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
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.cucumber.{Check, Find, Forms, Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, BusinessActivityEQPage, ContactDetailsDisplayPage, ErrorPlaceHolderPage, FDGroupStatusPage, GlobalGrossRevenueEQPage, GroupAccountingPeriodPage, InitialGuidancePage, InputNFMTelephonePage, InputUPETelephonePage, NFMDetailsPage, NFMGRSRegistrationFailedErrorPage, NFMGRSRegistrationNotCalledErrorPage, NFMOrgTypePage, NFMRegistrationPage, NFMTelephonePage, SecondContactDetailsDisplayPage, TaskListPage, UPEContactEmailPage, UPEContactNamePage, UPEEQPage, UPEGRSRegistrationFailedErrorPage, UPEGRSRegistrationNotCalledErrorPage, UPEOrgTypePage, UPEPage, UPETelephonePage}


class StepDef extends BaseStepDef {

  Given("""^(.*) logs in to register for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User" => AuthLoginPage.loginAsInd(name)
      case "Agent User" => AuthLoginPage.loginAsAgent(name)
      case "Assistant User" => AuthLoginPage.loginAssistant(name)

    }
  }

  Given("""^(.*) logs in to subscribe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToSubscribe(name)
      case _ => AuthLoginPage.loginToSubscribe(name)
    }
  }

  Given("""^(.*) logs in as upe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPE(name)
      case _ => AuthLoginPage.loginToUPE(name)
    }
  }

  Given("""^(.*) logs in as upe with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEWithCredID(name, credId)
      case _ => AuthLoginPage.loginToUPEWithCredID(name, credId)
    }
  }

  Given("""^(.*) logs in with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginAsUserWithCredId(name, credId)
      case _ =>  AuthLoginPage.loginAsUserWithCredId(name, credId)
    }
  }
  Given("""^(.*) logs in to upe org page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToOrgWithCredID(name, credId)
      case _ =>  AuthLoginPage.loginToOrgWithCredID(name, credId)
    }
  }

  Given("""^(.*) logs in to nfm org page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
      case _ =>  AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
    }

  }
  Given("""^(.*) logs in to upe registered in UK page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToRegWithCredID(name, credId)
      case _ =>  AuthLoginPage.loginToRegWithCredID(name, credId)
    }
  }
  Given("""^(.*) logs in to upe name page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEName(name, credId)
      case _ =>  AuthLoginPage.loginToUPEName(name, credId)
    }
  }
  Given("""^(.*) logs in to nfm name page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
      case _ => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
    }
  }

  Given("""^Organisation User navigates to (.*) check your answer page with credId (.*)$""") { (name: String, credId: String) =>
    name match {
      case "UPE" => AuthLoginPage.loginToCA(name, credId)
      case "NFM" => AuthLoginPage.loginToNFMCA(name, credId)
      case "FD" => AuthLoginPage.loginToFDCA(name, credId)
    }
  }

  When("""^Organisation User logs in to (.*) page with credId (.*)$""") { (name: String, credId: String) =>
    name match {
      case "NFM email" => AuthLoginPage.loginToNFMEmail(name, credId)
      case "NFM address" => AuthLoginPage.loginToNFMInputAddress(name, credId)
    }
  }

  Then("""^I navigate to (.*) page$""") { page: String =>
    page match {
      case "start" =>
        Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes")
      case "individual" =>
        Nav.navigateTo(
          "http://localhost:10050/report-pillar2-top-up-taxes/register/problem/individual-sign-in-problem"
        )
    }
  }
  Then("""^I clear the cache$""") {
    Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes/test-only/eligibility/clear-session")
  }

  Then("""^The Heading should be (.*)$""") { header: String =>
    Check.checkH1(header)

  }

  Then("""^The page header should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(TaskListPage.pageHeader)
    assert(getTextOf(By.cssSelector(TaskListPage.pageHeader)).contains(header))
  }

  Then("""^The Body content should be (.*)$""") { text: String =>
    Check.checkBodyText(text)
  }

  Given("""^I fill (.*) and continue$""") { page: String =>
    page match {
      case "What is the main address of your business page" => Forms.addressNonUK()
    }
    Input.clickSubmit()
  }

  When(
    """^(I click Continue button|click Confirm and send|click Try Again)$""") { (negate: String) =>
    Input.clickSubmit()
  }
  When("""^(I click on Continue button)""") { (negate: String) =>
    InitialGuidancePage.clickContinue()
  }

  And("""^(I navigate from Name page to Telephone page)""") { (negate: String) =>
    for (i <- 1 to 5) {
      InitialGuidancePage.clickContinue()
    }
  }
  Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
    Input.sendKeysById(text, id)
  }

  And("""^I select (.*) and continue$""") { (id: String) =>
    Input.clickById(id)
    Input.clickSubmit()
  }

  And("""^click (.*)$""") { (id: String) =>
    Input.clickByLinkText(id)
  }

  And("""^I click start over CTA$""") { () =>
    Input.clickByCss(ErrorPlaceHolderPage.startOverCTA)
  }

  Given("""^I am on (.*) Page$""") { page: String =>
    page match {
      case "UPE EQ" =>
        navigateTo(UPEEQPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEEQPage.eqForm)
        isVisible(By.cssSelector(UPEEQPage.eq)) shouldBe true
      case "Business activity EQ" =>
        navigateTo(BusinessActivityEQPage.url)
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.eqForm)
        isVisible(By.cssSelector(BusinessActivityEQPage.eq)) shouldBe true
      case "Global gross revenue" =>
        navigateTo(GlobalGrossRevenueEQPage.url)
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.eqForm)
        isVisible(By.cssSelector(GlobalGrossRevenueEQPage.eq)) shouldBe true
      case "NFM registration failed error" =>
        navigateTo(NFMGRSRegistrationFailedErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationFailedErrorPage.content)
        isVisible(By.cssSelector(NFMGRSRegistrationFailedErrorPage.header)) shouldBe true
      case "NFM registration not called error" =>
        navigateTo(NFMGRSRegistrationNotCalledErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationNotCalledErrorPage.content)
        isVisible(By.cssSelector(NFMGRSRegistrationNotCalledErrorPage.header)) shouldBe true
      case "UPE registration failed error" =>
        navigateTo(UPEGRSRegistrationFailedErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationFailedErrorPage.content)
        isVisible(By.cssSelector(UPEGRSRegistrationFailedErrorPage.header)) shouldBe true
      case "UPE registration not called error" =>
        navigateTo(UPEGRSRegistrationNotCalledErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationNotCalledErrorPage.content)
        isVisible(By.cssSelector(UPEGRSRegistrationNotCalledErrorPage.header)) shouldBe true
    }
  }

  And("""^I should see error message (.*) on the (.*) Page$""") { (error: String, page: String) =>
    page match {
      case "Eligibility question" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorLink)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorMessage)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorMessage)) should include(error)

      case "Global gross revenue" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorLink)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorMessage)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorMessage)) should include(error)

      case "UPE business EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
        getTextOf(By cssSelector (UPEPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
        getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

      case "UPE Org type" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorLink)
        getTextOf(By cssSelector (UPEOrgTypePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorMessage)
        getTextOf(By cssSelector (UPEOrgTypePage.errorMessage)) should include(error)

      case "NFM Org type" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMOrgTypePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMOrgTypePage.errorLink)
        getTextOf(By cssSelector (NFMOrgTypePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMOrgTypePage.errorMessage)
        getTextOf(By cssSelector (NFMOrgTypePage.errorMessage)) should include(error)

      case "Input UPE Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
        getTextOf(By cssSelector (UPEPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
        getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

      case "UPE Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorLink)
        getTextOf(By cssSelector (UPETelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorMessage)
        getTextOf(By cssSelector (UPETelephonePage.errorMessage)) should include(error)

      case "Input Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(InputUPETelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(InputUPETelephonePage.errorLink)
        getTextOf(By cssSelector (InputUPETelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(InputUPETelephonePage.errorMessage)
        getTextOf(By cssSelector (InputUPETelephonePage.errorMessage)) should include(error)

      case "UPE Contact person/team name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorLink)
        getTextOf(By cssSelector (UPEContactNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorMessage)
        getTextOf(By cssSelector (UPEContactNamePage.errorMessage)) should include(error)

      case "UPE contact email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorLink)
        getTextOf(By cssSelector (UPEContactEmailPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorMessage)
        getTextOf(By cssSelector (UPEContactEmailPage.errorMessage)) should include(error)

      case "NFM details page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorLink)
        getTextOf(By cssSelector (NFMDetailsPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorMessage)
        getTextOf(By cssSelector (NFMDetailsPage.errorMessage)) should include(error)

      case "NFM registration page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorLink)
        getTextOf(By cssSelector (NFMRegistrationPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorMessage)
        getTextOf(By cssSelector (NFMRegistrationPage.errorMessage)) should include(error)

      case "NFM Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMTelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMTelephonePage.errorLink)
        getTextOf(By cssSelector (NFMTelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMTelephonePage.errorMessage)
        getTextOf(By cssSelector (NFMTelephonePage.errorMessage)) should include(error)

      case "Input Nfm Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(InputNFMTelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(InputNFMTelephonePage.errorLink)
        getTextOf(By cssSelector (InputNFMTelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(InputNFMTelephonePage.errorMessage)
        getTextOf(By cssSelector (InputNFMTelephonePage.errorMessage)) should include(error)

      case "Further Details Group Status" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorLink)
        getTextOf(By cssSelector (FDGroupStatusPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorMessage)
        getTextOf(By cssSelector (FDGroupStatusPage.errorMessage)) should include(error)

      case "Group Accounting Period Start Date" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorLinkStartDate)
        getTextOf(By cssSelector (GroupAccountingPeriodPage.errorLinkStartDate)) should be(error)

        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorMessageStartDate)
        getTextOf(By cssSelector (GroupAccountingPeriodPage.errorMessageStartDate)) should include(error)

      case "Group Accounting Period End Date" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorLinkEndDate)
        getTextOf(By cssSelector (GroupAccountingPeriodPage.errorLinkEndDate)) should be(error)

        Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorMessageEndDate)
        getTextOf(By cssSelector (GroupAccountingPeriodPage.errorMessageEndDate)) should include(error)

      case "Contact details display" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorLink)
        getTextOf(By cssSelector (ContactDetailsDisplayPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorMessage)
        getTextOf(By cssSelector (ContactDetailsDisplayPage.errorMessage)) should include(error)

      case "Second Contact details" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorLink)
        getTextOf(By cssSelector (SecondContactDetailsDisplayPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorMessage)
        getTextOf(By cssSelector (SecondContactDetailsDisplayPage.errorMessage)) should include(error)

    }
  }

  Then("""^The caption must be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
    assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).contains(caption))
  }

  And("""^I click (.*) link$""") { (linkText: String) =>
    Input.clickByLinkText(linkText)
  }

  And("""^I select option (.*) and continue to next$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No" => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  And("""^I select (.*) option and continue to next$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("nominateFilingMember_0")
      case "No" => Input.clickById("nominateFilingMember_1")
    }
    InitialGuidancePage.clickContinue()
  }

  And("""^I click the browser back button$""") { () =>
    Nav.browserBack()
  }

  And("""^I should see the contact details (.*) on use contact page""") { (details: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElement(By.cssSelector(ContactDetailsDisplayPage.contactDetails)).getText.contains(details))
  }

  And("""^The header should display (.*) banner$"""){ (beta: String) =>
    Find.findByXpath(UPEPage.betatag)
  }

  Then("""^I should be navigated to (.*) page$""") { (text: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElement(By.cssSelector(UPEPage.sendyourfeedback)).getText.contains(text))
  }

  And("""^I should see (.*) hyperLink$""") { (linkText: String) =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.inputUpeNamePageLink)
  }

  When("""^Organisation User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 service$""") { (enrolmentkey: String, identifiername:String, identifiervalue:String) =>
    AuthLoginPage.loginWithExistingEntity(enrolmentkey, identifiername, identifiervalue)
  }

      /*  Given("""^I fill (.*) and continue$""") { page: String =>
          page match {
            case "What is the main address of your business page" => Forms.addressNonUK()
          }
          Input.clickSubmit()

        And("""^I select SignOut link$""") { (id: String) =>
         Input.clickById(id)
         Input.clickSubmit
       }

       And("""^I click browser back$""") { (id: String) =>
        Input.clickByLinkText(id)
      }

        And(
          """^(click Continue button|click Confirm and send|click Try Again)$"""
        ) { (negate: String) =>
          Input.clickSubmit
        }

        Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
          Input.sendKeysById(text, id)
        }

        And("""^I select (.*) and continue$""") { (id: String) =>
          Input.clickById(id)
          Input.clickSubmit
        }

        And("""^I click (.*)$""") { (id: String) =>
          Input.clickByLinkText(id)
        }

        And("""^click (.*) element$""") { (id: String) =>
          Input.clickById(id)
        }

        Then("""^The Page should include (.*)$""") { text: String =>
          Check.checkBodyText(text)
        }

        Then("""wait for (.*) seconds$""") { (secs: Int) =>
          Wait.secondsWait(secs)
        }

        Given("""^the user should be on the new window with heading (.*)""") { (title: String) =>
          Input.switchToNewWindow
          Check.checkH1(title)
        }*/

}
