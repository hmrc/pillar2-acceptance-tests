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

package uk.gov.hmrc.test.ui.specsdef

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.Check.{be, convertToAnyShouldWrapper, include}
import uk.gov.hmrc.test.ui.helper.Input.getTextOf
import uk.gov.hmrc.test.ui.helper.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.helper._
import uk.gov.hmrc.test.ui.pages._

object CommonStepsSteps {

  def givenLogsInToRegisterForPillar2AgentService(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginOldPage.loginAsOrgToASA(name)
      case "Individual User"   => AuthLoginOldPage.loginAsIndToASA(name)
      case "Assistant User"    => AuthLoginOldPage.loginAsAssistantToASA(name)

    }
  }


  def givenLogsInWithoutPillar2Enrolment(): Unit = {
    AuthLoginOldPage.loginToUPE()
  }

  def givenLogsInAndNavigatesToRFMStartPageWithoutPillar2EnrolmentWithGroupId(groupId: String): Unit = {
    AuthLoginOldPage.loginToRFMWithGroupId(groupId)
  }

  def givenLogsInAsUpeWithCredIdForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginOldPage.loginToUPEWithCredID(name, credId)
      case _                   => AuthLoginOldPage.loginToUPEWithCredID(name, credId)
    }
  }

  def givenLogsInWithCredIdForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginOldPage.loginAsUserWithCredId(name, credId)
      case _                   => AuthLoginOldPage.loginAsUserWithCredId(name, credId)
    }
  }


  def thenIClearTheCache(): Unit = {
    Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes/test-only/eligibility/clear-session")
  }

  def thenTheHeadingShouldBe(header: String): Unit = {
    Check.checkH1(header)
  }


  def clickAction(action: String): Unit = {
    action match {
      case "I click Continue button" | "click Continue button" | "click Confirm and send" | "click Try Again" =>
        Input.clickSubmit()
      case _ =>
        throw new IllegalArgumentException(s"Unknown action: $action")
    }
  }

  def whenIClickOnContinueButton(negate: String): Unit = {
    InitialGuidancePage.clickContinue()
  }

  def whenISelectCurrentAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectCurrentAccountingPeriod()
  }

  def whenISelectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodBTNSubmitted()
  }

  def whenISelectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodUKTRSubmitted()
  }

  def thenISelectPreviousAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriod()
  }

  def whenIClickOnCountrySelected(negate: String): Unit = {
    UPEAddressPage.clickCountrySelected()
  }

  def givenIAmOnPage(page: String): Unit = {
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

  def andIClickLink(linkText: String): Unit = {
    Input.clickByLinkText(linkText)
  }

  def andISelectOptionAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No"  => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  def andISelectNfmOptionAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("nominateFilingMember_0")
      case "No"  => Input.clickById("nominateFilingMember_1")
    }
    InitialGuidancePage.clickContinue()
  }

  def andIClickTheBrowserBackButton(): Unit = {
    Nav.browserBack()
  }

  def whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
      userType: String,
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String): Unit = {
    userType match {
      case "Organisation" => AuthLoginOldPage.loginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
      case "Agent"        => AuthLoginOldPage.agentLoginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
    }
  }

  def whenIAddDelegatedEnrolmentWithAndForPillar2Service(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    AuthLoginOldPage.addDelegatedEnrolment(enrolmentKey, identifierName, identifierValue, authRule)
  }

  def whenIRefreshThePage(): Unit = {
    Driver.instance.navigate().refresh()
  }

  def thenICanSeeLink(linkText: String): Unit = {
    linkText match {
      case "Print this page" =>
        Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.printThisPage)
        assert(Driver.instance.findElement(By.cssSelector(RegistrationConfirmationPage.printThisPage)).getText.contains(linkText))
      case "Agent Services Account" =>
        Wait.waitForElementToPresentByCssSelector(DashboardOldPage.ASALink)
        assert(Driver.instance.findElement(By.cssSelector(DashboardOldPage.ASALink)).getText.contains(linkText))
      case "Sign out" =>
        Wait.waitForElementToPresentByCssSelector(RepaymentConfirmationPage.signOut)
        assert(Driver.instance.findElement(By.cssSelector(RepaymentConfirmationPage.signOut)).getText.contains(linkText))
    }
  }

  def andIShouldSeeLinkOn(linkText: String, page: String): Unit = {
    page match {
      case "Review answers page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ReviewAnswersPage.printThisPage)
        assert(Driver.instance.findElement(By.cssSelector(ReviewAnswersPage.printThisPage)).getText.contains(linkText))
    }
  }

  def givenIAccessThePage(page: String): Unit = {
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
}
