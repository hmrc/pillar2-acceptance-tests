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
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pillar2SubmissionPages.{P2ConfirmationPage, P2SubBtnMultipleAccountingPage}

class StepDef extends BaseStepDef with BrowserDriver {

  Given("""^(.*) logs in to register for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User"   => AuthLoginPage.loginAsInd(name)
      case "Agent User"        => AuthLoginPage.loginAsAgent(name)
      case "Assistant User"    => AuthLoginPage.loginAssistant(name)
    }
  }

  Given("""^(.*) logs in to register for Pillar2 Agent service$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginAsOrgToASA(name)
      case "Individual User"   => AuthLoginPage.loginAsIndToASA(name)
      case "Assistant User"    => AuthLoginPage.loginAsAssistantToASA(name)

    }
  }

  Given("""^(.*) logs in to subscribe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToSubscribe(name)
      case _                   => AuthLoginPage.loginToSubscribe(name)
    }
  }

  Given("""^(.*) logs in with BTA for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginUsingBta(name)
      case _                   => AuthLoginPage.loginToSubscribe(name)
    }
  }

  Given("""^.* logs in without Pillar2 enrolment$""") {
    AuthLoginPage.loginToUPE()
  }

  Given("""^.* logs in and navigates to RFM start page without Pillar2 enrolment with groupId (.*)$""") { groupId: String =>
    AuthLoginPage.loginToRFMWithGroupId(groupId)
  }

  Given("""^(.*) logs in as upe with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToUPEWithCredID(name, credId)
    }
  }

  Given("""^(.*) logs in with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginAsUserWithCredId(name, credId)
      case _                   => AuthLoginPage.loginAsUserWithCredId(name, credId)
    }
  }
  Given("""^(.*) logs in to upe org page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToOrgWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToOrgWithCredID(name, credId)
    }
  }

  Given("""^(.*) logs in to nfm org page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
    }

  }
  Given("""^(.*) logs in to upe registered in UK page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToRegWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToRegWithCredID(name, credId)
    }
  }
  Given("""^(.*) logs in to upe name page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEName(name, credId)
      case _                   => AuthLoginPage.loginToUPEName(name, credId)
    }
  }
  Given("""^(.*) logs in to nfm name page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
    }
  }

  Given("""^Organisation User navigates to (.*) check your answer page with credId (.*)$""") { (name: String, credId: String) =>
    name match {
      case "UPE"                      => AuthLoginPage.loginToCA(name, credId)
      case "NFM"                      => AuthLoginPage.loginToNFMCA(name, credId)
      case "FD"                       => AuthLoginPage.loginToFDCA(name, credId)
      case "Contact Details"          => AuthLoginPage.loginToCDCA(name, credId)
      case "Final Check Your Answers" => AuthLoginPage.loginToFinalCA(name, credId)
    }
  }

  When("""^Organisation User logs in to (.*) page with credId (.*)$""") { (name: String, credId: String) =>
    name match {
      case "NFM email"   => AuthLoginPage.loginToNFMEmail(name, credId)
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
    assert(getTextOf(By.cssSelector(TaskListPage.pageHeader)).equals(header))
  }

  Then("""^The hint text should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.hintText)
    assert(getTextOf(By.cssSelector(BTAPillar2IDCheckPage.hintText)).contains(header))
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

  When("""I select CurrentAccountingPeriod""") { () =>
    P2SubBtnMultipleAccountingPage.selectCurrentAccountingPeriod()
  }

  When("""I select PreviousAccountingPeriodBTNSubmitted""") { () =>
    P2SubBtnMultipleAccountingPage.selectPreviousAccountingPeriodBTNSubmitted()
  }

  When("""I select PreviousAccountingPeriodUKTRSubmitted""") { () =>
    P2SubBtnMultipleAccountingPage.selectPreviousAccountingPeriodUKTRSubmitted()
  }

  Then("""I select PreviousAccountingPeriod""") { () =>
    // Write code here that turns the phrase above into concrete actions
    P2SubBtnMultipleAccountingPage.selectPreviousAccountingPeriod()
  }

  When("""^(I click on Country selected)""") { (negate: String) =>
    UPEAddressPage.clickCountrySelected()
  }

  And("""^(I navigate from Name page to Telephone page)""") { (negate: String) =>
    for (i <- 1 to 5) {
      InitialGuidancePage.clickContinue()
    }
  }
  Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
    Input.sendKeysById(id, text)
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

  And("""^I access reason for refund page$""") { () =>
    navigateTo(RepaymentReasonPage.url)
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
        Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorLink)
        getTextOf(By cssSelector (UPEEntityTypePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorMessage)
        getTextOf(By cssSelector (UPEEntityTypePage.errorMessage)) should include(error)

      case "NFM Org type" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorLink)
        getTextOf(By cssSelector (NFMEntityTypePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorMessage)
        getTextOf(By cssSelector (NFMEntityTypePage.errorMessage)) should include(error)

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

      case "Contact details email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorLink)
        getTextOf(By cssSelector (NFMContactEmailPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorMessage)
        getTextOf(By cssSelector (NFMContactEmailPage.errorMessage)) should include(error)

      case "BTA Pillar2 validation" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorLink)
        getTextOf(By cssSelector (BTAPillar2IDCheckPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorMessage)
        getTextOf(By cssSelector (BTAPillar2IDCheckPage.errorMessage)) should include(error)

      case "Reason For Refund" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorLink)
        getTextOf(By cssSelector (RepaymentReasonPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorMessage)
        getTextOf(By cssSelector (RepaymentReasonPage.errorMessage)) should include(error)

      case "Repayment Method" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorLink)
        getTextOf(By cssSelector (RepaymentMethodPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)
        getTextOf(By cssSelector (RepaymentMethodPage.errorMessage)) should include(error)

      case "Agent Repayment Method" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(AgentRepaymentMethodPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(AgentRepaymentMethodPage.errorLink)
        getTextOf(By cssSelector (AgentRepaymentMethodPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(AgentRepaymentMethodPage.errorMessage)
        getTextOf(By cssSelector (AgentRepaymentMethodPage.errorMessage)) should include(error)
    }
  }

  Then("""^The caption must be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
    assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).equals(caption))
  }

  Then("""^the page title should be (.*)$""") { pageTitle: String =>
    Wait.waitForElementToClickTagName("h1")
    assert(driver.getTitle.contains(pageTitle))
  }

  And("""^I click (.*) link$""") { (linkText: String) =>
    Input.clickByLinkText(linkText)
  }

  And("""^I select option (.*) and continue to next$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No"  => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  And("""^I select (.*) option and continue to next$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("nominateFilingMember_0")
      case "No"  => Input.clickById("nominateFilingMember_1")
    }
    InitialGuidancePage.clickContinue()
  }

  And("""^I click the browser back button$""") { () =>
    Nav.browserBack()
  }

  And("""^I should see the contact details row (\d+) as (.*) on use contact page""") { (row: Int, details: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElements(By.cssSelector(ContactDetailsDisplayPage.valueList)).get(row - 1).getText.contains(details))
  }

  And("""^The header should display (.*) banner$""") { (beta: String) =>
    Find.findByXpath(UPEPage.betatag)
  }

  Then("""^I should be navigated to (.*) page$""") { (text: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElement(By.cssSelector(UPEPage.sendyourfeedback)).getText.contains(text))
  }

  And("""^I should see (.*) hyperLink$""") { (linkText: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.inputUpeNamePageLink)
  }

  And("""^I should see (.*) link$""") { (linkText: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(BTARegisterGuidancePage.registerLink)
    assert(driver.findElement(By.cssSelector(BTARegisterGuidancePage.registerLink)).getText.contains(linkText))
  }

  And("""^I should see (.*) BTA button$""") { (option: String) =>
    option match {
      case "return to" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(BTARegisterGuidancePage.returnToBTA)
    }
  }

  When("""^(.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 service$""") {
    (userType: String, enrolmentkey: String, identifiername: String, identifiervalue: String) =>
      userType match {
        case "Organisation" => AuthLoginPage.loginWithExistingEntity(enrolmentkey, identifiername, identifiervalue)
        case "Agent"        => AuthLoginPage.agentLoginWithExistingEntity(enrolmentkey, identifiername, identifiervalue)
      }
  }

  When("""^I add delegated enrolment with (.*), (.*), (.*) and (.*) for Pillar2 service$""") {
    (enrolmentkey: String, identifiername: String, identifiervalue: String, authRule: String) =>
      AuthLoginPage.addDelegatedEnrolment(enrolmentkey, identifiername, identifiervalue, authRule)
  }

  When("""^I refresh the page$""") { () =>
    driver.navigate.refresh()
  }

  Given("""^I access random page$""") { () =>
    Nav.navigateTo(AuthLoginPage.incorrectUrl)
  }

  Then("""^I can see (.*) link$""") { (linkText: String) =>
    linkText match {
      case "Print this page" =>
        Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.printthispage)
        assert(driver.findElement(By.cssSelector(RegistrationConfirmationPage.printthispage)).getText.contains(linkText))
      case "Download as PDF" =>
        Wait.waitForElementToPresentByCssSelector(P2ConfirmationPage.downloadAsPDF)
        assert(driver.findElement(By.cssSelector(P2ConfirmationPage.downloadAsPDF)).getText.contains(linkText))
      case "Agent Services Account" =>
        Wait.waitForElementToPresentByCssSelector(ASADashboardPage.ASALink)
        assert(driver.findElement(By.cssSelector(ASADashboardPage.ASALink)).getText.contains(linkText))
      case "Sign out" =>
        Wait.waitForElementToPresentByCssSelector(RepaymentConfirmationPage.signOut)
        assert(driver.findElement(By.cssSelector(RepaymentConfirmationPage.signOut)).getText.contains(linkText))
    }
  }

  And("""^I should see (.*) link on (.*)$""") { (linkText: String, page: String) =>
    page match {
      case "Review answers page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ReviewAnswersPage.printthispage)
        assert(driver.findElement(By.cssSelector(ReviewAnswersPage.printthispage)).getText.contains(linkText))
    }
  }

  Given("""^I access the (.*) page$""") { (page: String) =>
    page match {
      case "contact details summary" =>
        Nav.navigateTo(ContactDetailsSummaryPage.url)
      case "account summary" =>
        Nav.navigateTo(AccountsSummaryPage.url)
      case "MakePayment" =>
        Nav.navigateTo(MakePaymentPage.url)
      case "repayment guidance" =>
        Nav.navigateTo(RepaymentGuidancePage.url)
      case "repayment amount" =>
        Nav.navigateTo(RepaymentAmountPage.url)
      case "repayment reason" =>
        Nav.navigateTo(RepaymentReasonPage.url)
      case "repayment method" =>
        Nav.navigateTo(RepaymentMethodPage.url)
      case "uk bank account" =>
        Nav.navigateTo(UKBankAccountPaymentPage.url)
      case "non-uk bank account" =>
        Nav.navigateTo(NonUKBankAccountPaymentPage.url)
      case "repayment contact name" =>
        Nav.navigateTo(RepaymentContactPage.url)
      case "repayment contact email" =>
        Nav.navigateTo(RepaymentContactEmailPage.url)
      case "repayment telephone" =>
        Nav.navigateTo(RepaymentTelephonePage.url)
      case "repayment telephone input" =>
        Nav.navigateTo(RepaymentTelephoneInputPage.url)
      case "repayment CYA" =>
        Nav.navigateTo(RepaymentCYAPage.url)
      case "manage contact name" =>
        Nav.navigateTo(ManageContactNamePage.url)
      case "manage second contact name" =>
        Nav.navigateTo(ManageSecondContactNamePage.url)
      case "manage contact address" =>
        Nav.navigateTo(ManageContactAddressPage.url)
      case "manage group status" =>
        Nav.navigateTo(ManageGroupStatusPage.url)
      case "manage accounting period" =>
        Nav.navigateTo(ManageAccountPeriodPage.url)
      case "repayment change amount" =>
        Nav.navigateTo(RepaymentChangeAmountPage.url)
      case "repayment change method" =>
        Nav.navigateTo(RepaymentChangeMethodPage.url)
      case "repayment change name" =>
        Nav.navigateTo(RepaymentChangeNamePage.url)
      case "transaction history" =>
        Nav.navigateTo(TransactionHistoryPage.url)

    }
  }

  Given("""^I access accounts summary page$""") { () =>
    Nav.navigateTo(AccountsSummaryPage.url)
  }

  Then("""^I should see (.*) CTA$""") { (pageNumber: String) =>
    pageNumber match {
      case "Next" =>
        assert(driver.findElement(By.cssSelector(TransactionHistoryPage.nextPageCTA)).isDisplayed)
      case "Previous" =>
        assert(driver.findElement(By.cssSelector(TransactionHistorySecondPage.previousPageCTA)).isDisplayed)
    }
  }

  When("""^I click (.*) CTA$""") { (pageNumber: String) =>
    pageNumber match {
      case "Next" =>
        TransactionHistoryPage.clickNext()
      case "Previous" =>
        TransactionHistorySecondPage.clickPrevious()
    }
  }

}
