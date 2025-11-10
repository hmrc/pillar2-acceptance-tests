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
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.btn.BtnAgdKBPage
import uk.gov.hmrc.test.ui.specpages.repayments._
import uk.gov.hmrc.test.ui.specpages.upe.UPEEntityTypePage

object PaymentStepsSteps {

  // I should be redirected to guidance page in a new tab
  def thenIShouldBeRedirectedToGuidancePageInANewTab(): Unit = {
    val handles    = Driver.instance.getWindowHandles.toArray().toSeq
    val newWindow  = handles(1).toString
    val mainWindow = handles.head.toString
    Driver.instance.switchTo().window(newWindow)
//    Wait.waitForElementToPresentByCssSelector(EligibilityNotSuitableAsUnder750MillionPage.header)
//    assert(Driver.instance.findElement(By.cssSelector(EligibilityNotSuitableAsUnder750MillionPage.header)).isDisplayed)
    Driver.instance.close()
    Driver.instance.switchTo().window(mainWindow)
  }

  // ^I select repayment method as (.*)$
  def andISelectRepaymentMethodAsX(option: String): Unit = {
    option match {
      case "UK bank account"     => Input.clickById("value_0")
      case "Non-UK bank account" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  // ^I provide value for (.*) as (.*)$
  def andIProvideValueForXAsX(field: String, name: String): Unit = {
    field match {
      case "Bank Name" =>

      case "Account Name" =>

      case "Swift Code" =>

      case "Iban" =>

      case "Refund Reason" =>

      case "UK Bank Name" =>

      case "UK Account Name" =>

      case "Sort Code" =>

      case "UK Account number" =>

    }
  }

  // ^I provide Refund Reason as (.*)$""")((refundReason: String)
  def andIProvideRefundReasonAsX(refundReason: String): Unit = {
//    Wait.waitForTagNameToBeRefreshed("h1")
//    Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.reasonTextField)
//    Input.sendKeysByCss(refundReason, RepaymentReasonPage.reasonTextField)
  }

  // And("""^I should see bank account error message (.*) on the (.*) Element$

  def IShouldSeeBankAccountErrorMessageXOnTheXElement(error: String, page: String): Unit = {
    page match {
      case "Name of the Bank" =>

      case "Account Name" =>

      case "Swift Code" =>

      case "Iban" =>

      case "UK Bank Name" =>

      case "UK Account Name" =>

      case "UK Sort Code" =>

      case "UK Account Number" =>
    }
  }

  // ^I provide Refund Amount as (.*)$""")((refundAmount: String) => {
  def andIProvideRefundAmountAs(refundAmount: String): Unit = {
//    Wait.waitForTagNameToBeRefreshed("h1")
//    Input.sendKeysByCss(refundAmount, RepaymentAmountPage.refundAmountField)
//    clickByCss(RepaymentAmountPage.continue)
  }

  // And("""^I provide Repayment contact (.*) as (.*)$

  def IProvideRepaymentContactXAsX(page: String, Value: String): Unit = {
    page match {
      case "name" =>
//        Wait.waitForTagNameToBeRefreshed("h1")
//        Input.sendKeysByCss(Value, RepaymentContactPage.contactNameField)
//        clickByCss(RepaymentContactPage.continue)

//      case "email" =>
//        Wait.waitForTagNameToBeRefreshed("h1")
//        Input.sendKeysByCss(Value, RepaymentContactEmailPage.contactEmailField)
//        clickByCss(RepaymentContactEmailPage.continue)

      case "phone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(Value, RepaymentPhoneInputPage.contactPhone)
        clickByCss(RepaymentPhoneInputPage.continue)
    }
  }

  // ^I click change link for Repayment (.*)
  def whenIClickChangeLinkForRepaymentX(link: String): Unit = {
    link match {
      case "Amount" =>
        clickByCss(RepaymentCYAPage.changeRefundAmount)
      case "Reason" =>
        clickByCss(RepaymentCYAPage.changeRefundReason)
      case "Method Page" =>
        clickByCss(RepaymentCYAPage.changeRepaymentMethod)
      case "Bank Name" =>
        clickByCss(RepaymentCYAPage.changeNonUKBankDetails)
      case "Account Name" =>
        clickByCss(RepaymentCYAPage.changeNonUKBankDetails)
      case "Account SWIFT" =>
        clickByCss(RepaymentCYAPage.changeNonUKBankDetails)
      case "Account IBAN" =>
        clickByCss(RepaymentCYAPage.changeNonUKBankDetails)
      case "Contact Name" =>
        clickByCss(RepaymentCYAPage.changeContactName)
      case "Contact Email" =>
        clickByCss(RepaymentCYAPage.changeContactEmail)
      case "Contact Phone" =>
        clickByCss(RepaymentCYAPage.changePhone)
      case "Contact Phone Number" =>
        clickByCss(RepaymentCYAPage.changePhoneNumber)
      case "UK Bank Name" =>
        clickByCss(RepaymentCYAPage.changeUKBankDetails)
      case "UK Bank Method" =>
        clickByCss(RepaymentCYAPage.changeBankAccountType)
    }
  }

  // ^I access Repayment contact email page$
  def givenIAccessRepaymentContactEmailPage(): Unit = {
    Nav.navigateTo(RepaymentContactEmailPage.url)
  }

  // ^I access Repayment CYA page$
  def whenIAccessRepaymentCYAPage(): Unit = {
    Nav.navigateTo(RepaymentCYAPage.url)
  }

  // ^I access (.*) payment page$
  def andIAccessXPaymentPage(page: String): Unit = {
    page match {
      case "Non UK" =>
        Nav.navigateTo(RepaymentBankAccountNonUKPage.url)
      case "UK" =>
        Nav.navigateTo((RepaymentBankAccountUKPage.url))
    }
  }

  // ^I select option (.*) on partial name error page$
  def andISelectOptionXOnPartialNameErrorPage(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("confirmRepaymentAccountName_0")
      case "No"  => Input.clickById("confirmRepaymentAccountName_1")
    }
  }

  // ^(I navigate from Contact page to CYA page)
  def andINavigateFromContactPageToCYAPage(negate: String): Unit = {
    for (i <- 1 to 4) {
    }
  }

  // ^I enter UK Bank Account details as:$
  def andIEnterUKBankAccountDetailsAs(details: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
  }

  // ^I enter Non UK Bank Account details as:$
  def andIEnterNonUKBankAccountDetailsAs(details: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
  }

  // I make successful payment
  def thenIMakeSuccessfulPayment(): Unit = {
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
    OnlinePaymentPages.clickContinueOnGetReadyApproveThisPaymentPage()
    OnlinePaymentPages.selectBankLoginOptionAndClickContinue()
    OnlinePaymentPages.clickSubmitOnStubBankPaymentPage()
    OnlinePaymentPages.verifyPaymentAndClickHmrcOnlineAccountLinkOnPaymentCompletePage()
  }

  // I go till Get ready to approve your payment page
  def thenIGoTillGetReadyToApproveYourPaymentPage(): Unit = {
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
  }

  // I should be able to navigate back to outstanding payment page
  def thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage(): Unit = {
    Nav.browserBack()
    for (i <- 1 to 7) {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
}
