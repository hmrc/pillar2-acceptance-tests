/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specstepdef

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Check.{be, convertToAnyShouldWrapper, include}
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.specpages._

object CommonStepsSteps {

  // ^(.*) logs in to register for Pillar2$
  def givenXLogsInToRegisterForPillar2(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User"   => AuthLoginPage.loginAsInd(name)
      case "Agent User"        => AuthLoginPage.loginAsAgent(name)
      case "Assistant User"    => AuthLoginPage.loginAssistant(name)
    }
  }

  // ^(.*) logs in to register for Pillar2 Agent service$
  def givenXLogsInToRegisterForPillar2AgentService(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginAsOrgToASA(name)
      case "Individual User"   => AuthLoginPage.loginAsIndToASA(name)
      case "Assistant User"    => AuthLoginPage.loginAsAssistantToASA(name)

    }
  }

  // ^(.*) logs in to subscribe for Pillar2$
  def givenXLogsInToSubscribeForPillar2(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToSubscribe(name)
      case _                   => AuthLoginPage.loginToSubscribe(name)
    }
  }

  // ^(.*) logs in with BTA for Pillar2$
  def givenXLogsInWithBTAForPillar2(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginUsingBta(name)
      case _                   => AuthLoginPage.loginToSubscribe(name)
    }
  }

  // ^.* logs in without Pillar2 enrolment$
  def givenXLogsInWithoutPillar2Enrolment(): Unit = {
    AuthLoginPage.loginToUPE()
  }

  // ^.* logs in and navigates to RFM start page without Pillar2 enrolment with groupId (.*)$
  def givenXLogsInAndNavigatesToRFMStartPageWithoutPillar2EnrolmentWithGroupIdX(groupId: String): Unit = {
    AuthLoginPage.loginToRFMWithGroupId(groupId)
  }

  // ^(.*) logs in as upe with credId (.*) for Pillar2$
  def givenXLogsInAsUpeWithCredIdXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToUPEWithCredID(name, credId)
    }
  }

  // ^(.*) logs in with credId (.*) for Pillar2$
  def givenXLogsInWithCredIdXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginAsUserWithCredId(name, credId)
      case _                   => AuthLoginPage.loginAsUserWithCredId(name, credId)
    }
  }

  // ^(.*) logs in to upe org page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeOrgPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToOrgWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToOrgWithCredID(name, credId)
    }
  }

  // ^(.*) logs in to nfm org page with CredID (.*) for Pillar2$
  def givenXLogsInToNfmOrgPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
    }
  }

  // ^(.*) logs in to upe registered in UK page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeRegisteredInUKPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToRegWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToRegWithCredID(name, credId)
    }
  }

  // ^(.*) logs in to upe name page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeNamePageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEName(name, credId)
      case _                   => AuthLoginPage.loginToUPEName(name, credId)
    }
  }

  // ^(.*) logs in to nfm name page with CredID (.*) for Pillar2$
  def givenXLogsInToNfmNamePageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
      case _                   => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
    }
  }

  // ^Organisation User navigates to (.*) check your answer page with credId (.*)$
  def givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX(name: String, credId: String): Unit = {
    name match {
      case "UPE"                      => AuthLoginPage.loginToCA(name, credId)
      case "NFM"                      => AuthLoginPage.loginToNFMCA(name, credId)
      case "FD"                       => AuthLoginPage.loginToFDCA(name, credId)
      case "Contact Details"          => AuthLoginPage.loginToCDCA(name, credId)
      case "Final Check Your Answers" => AuthLoginPage.loginToFinalCA(name, credId)
    }
  }

  // ^I clear the cache$
  def thenIClearTheCache(): Unit = {
    Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes/test-only/eligibility/clear-session")
  }

  // ^The Heading should be (.*)$
  def thenTheHeadingShouldBeX(header: String): Unit = {
    Check.checkH1(header)
  }

  // ^The Body content should be (.*)$
  def thenTheBodyContentShouldBeX(text: String): Unit = {
    Check.checkBodyText(text)
  }
//commented by Priti and rewritten the step in scalatest
  // ^(I click Continue button|click Confirm and send|click Try Again)$
//  def when(IClickContinueButton|clickConfirmAndSend|clickTryAgain)(negate: String): Unit = {
//    Input.clickSubmit()
//  }
  def clickAction(action: String): Unit = {
    action match {
      case "I click Continue button" | "click Continue button" | "click Confirm and send" | "click Try Again" =>
        Input.clickSubmit()
      case _ =>
        throw new IllegalArgumentException(s"Unknown action: $action")
    }
  }

  // ^(I click on Continue button)
  def whenIClickOnContinueButton(negate: String): Unit = {
    InitialGuidancePage.clickContinue()
  }

  // I select CurrentAccountingPeriod
  def whenISelectCurrentAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectCurrentAccountingPeriod()
  }

  // I select PreviousAccountingPeriodBTNSubmitted
  def whenISelectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodBTNSubmitted()
  }

  // I select PreviousAccountingPeriodUKTRSubmitted
  def whenISelectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodUKTRSubmitted()
  }

  // I select PreviousAccountingPeriod
  def thenISelectPreviousAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriod()
  }

//  // ^(I click on Country selected)
//  def whenIClickOnCountrySelected(negate: String): Unit = {
//    UPEAddressPage.clickCountrySelected()
//  }

  // ^I am on (.*) Page$
  def givenIAmOnXPage(page: String): Unit = {
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

  // ^I should see error message (.*) on the (.*) Page$
  def andIShouldSeeErrorMessageXOnTheXPage(error: String, page: String): Unit = {
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

      case "NFM Phone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorLink)
        getTextOf(By cssSelector (NFMPhonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorMessage)
        getTextOf(By cssSelector (NFMPhonePage.errorMessage)) should include(error)

      case "Input Nfm Phone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorLink)
        getTextOf(By cssSelector (InputNFMPhonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorMessage)
        getTextOf(By cssSelector (InputNFMPhonePage.errorMessage)) should include(error)

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
        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorLink)
        getTextOf(By cssSelector (RepaymentMethodPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)
        getTextOf(By cssSelector (RepaymentMethodPage.errorMessage)) should include(error)
    }
  }

  // ^The caption must be (.*)$
  def thenTheCaptionMustBeX(caption: String): Unit = {
    Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
    assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).equals(caption))
  }

  // ^I click (.*) link$
  def andIClickXLink(linkText: String): Unit = {
    Input.clickByLinkText(linkText)
  }

  // ^I select option (.*) and continue to next$
  def andISelectOptionXAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No"  => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  // ^I select (.*) option and continue to next$
  def andISelectXOptionAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("nominateFilingMember_0")
      case "No"  => Input.clickById("nominateFilingMember_1")
    }
    InitialGuidancePage.clickContinue()
  }

  // ^I click the browser back button$
  def andIClickTheBrowserBackButton(): Unit = {
    Nav.browserBack()
  }

  // ^(.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 service$
  def whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
      userType: String,
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String): Unit = {
    userType match {
      case "Organisation" => AuthLoginPage.loginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
      case "Agent"        => AuthLoginPage.agentLoginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
    }
  }

  // ^I add delegated enrolment with (.*), (.*), (.*) and (.*) for Pillar2 service$
  def whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    AuthLoginPage.addDelegatedEnrolment(enrolmentKey, identifierName, identifierValue, authRule)
  }

  // ^I refresh the page$
  def whenIRefreshThePage(): Unit = {
    Driver.instance.navigate().refresh()
  }

  // ^I refresh the registration in progress page$
  def whenIRefreshTheRegistrationInProgressPage(): Unit = {
    val count = 5
    var i     = 0
    while (i < count) {
      Driver.instance.navigate().refresh()
      i += 1
    }
  }

  // ^I access random page$
  def givenIAccessRandomPage(): Unit = {
    Nav.navigateTo(AuthLoginPage.incorrectUrl)
  }

  // ^I can see (.*) link$
  def thenICanSeeXLink(linkText: String): Unit = {
    linkText match {
      case "Print this page" =>
        Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.printThisPage)
        assert(Driver.instance.findElement(By.cssSelector(RegistrationConfirmationPage.printThisPage)).getText.contains(linkText))
      case "Sign out" =>
        Wait.waitForElementToPresentByCssSelector(RepaymentConfirmationPage.signOut)
        assert(Driver.instance.findElement(By.cssSelector(RepaymentConfirmationPage.signOut)).getText.contains(linkText))
    }
  }

  // ^I should see (.*) link on (.*)$
  def andIShouldSeeXLinkOnX(linkText: String, page: String): Unit = {
    page match {
      case "Review answers page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ReviewAnswersPage.printThisPage)
        assert(Driver.instance.findElement(By.cssSelector(ReviewAnswersPage.printThisPage)).getText.contains(linkText))
    }
  }

  // ^I access the (.*) page$
  def givenIAccessTheXPage(page: String): Unit = {
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
      case "repayment phone" =>
        Nav.navigateTo(RepaymentPhonePage.url)
      case "repayment phone input" =>
        Nav.navigateTo(RepaymentPhoneInputPage.url)
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

  // ^I should see (.*) CTA$
  def thenIShouldSeeXCTA(pageNumber: String): Unit = {
    pageNumber match {
      case "Next" =>
        assert(Driver.instance.findElement(By.cssSelector(TransactionHistoryPage.nextPageCTA)).isDisplayed)
      case "Previous" =>
        assert(Driver.instance.findElement(By.cssSelector(TransactionHistorySecondPage.previousPageCTA)).isDisplayed)
    }
  }

  // ^I click (.*) CTA$
  def whenIClickXCTA(pageNumber: String): Unit = {
    pageNumber match {
      case "Next" =>
        TransactionHistoryPage.clickNext()
      case "Previous" =>
        TransactionHistorySecondPage.clickPrevious()
    }
  }
}
