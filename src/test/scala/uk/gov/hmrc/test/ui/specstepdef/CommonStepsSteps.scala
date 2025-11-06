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
import uk.gov.hmrc.test.ui.specpages.contactDetails.{ContactDetailsPrimaryContactPage, ContactDetailsSummaryPage}
import uk.gov.hmrc.test.ui.specpages.repayments.{RepaymentAmountPage, RepaymentCYAPage, RepaymentChangeAmountPage, RepaymentChangeMethodPage, RepaymentChangeNamePage, RepaymentConfirmationPage, RepaymentContactEmailPage, RepaymentContactPage, RepaymentGuidancePage, RepaymentMethodPage, RepaymentPhoneInputPage, RepaymentPhonePage, RepaymentReasonPage}

object CommonStepsSteps {

  // ^I clear the cache$
  def thenIClearTheCache(): Unit = {
    Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes/test-only/eligibility/clear-session")
  }

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
    }
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
    AuthLoginPage.addDelegatedEnrolmentOld(enrolmentKey, identifierName, identifierValue, authRule)
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
