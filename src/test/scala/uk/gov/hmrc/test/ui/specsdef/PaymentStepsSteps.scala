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
import uk.gov.hmrc.test.ui.helper.*
import uk.gov.hmrc.test.ui.helper.Input.clickByCss
import uk.gov.hmrc.test.ui.pages.*

object PaymentStepsSteps {

  def thenIShouldBeRedirectedToGuidancePageInANewTab(): Unit = {
    val handles    = Driver.instance.getWindowHandles.toArray().toSeq
    val newWindow  = handles(1).toString
    val mainWindow = handles.head.toString
    Driver.instance.switchTo().window(newWindow)
    Wait.waitForElementToPresentByCssSelector(GGRGuidancePage.header)
    assert(Driver.instance.findElement(By.cssSelector(GGRGuidancePage.header)).isDisplayed)
    Driver.instance.close()
    Driver.instance.switchTo().window(mainWindow)
  }

  def andISelectRepaymentMethodAs(option: String): Unit = {
    option match {
      case "UK bank account"     => Input.clickById("value_0")
      case "Non-UK bank account" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  def andIProvideValueForAs(field: String, name: String): Unit = {
    field match {

      case "Refund Reason" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.reasonTextField)
        Input.sendKeysByCss(name, RepaymentReasonPage.reasonTextField)
    }
  }

  def andIProvideRefundAmountAs(refundAmount: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(refundAmount, RepaymentAmountPage.refundAmountField)
    clickByCss(RepaymentAmountPage.continue)
  }

  def andIAccessPaymentPage(page: String): Unit = {
    page match {
      case "Non UK" =>
        Nav.navigateTo(NonUKBankAccountPaymentPage.url)
      case "UK" =>
        Nav.navigateTo((UKBankAccountPaymentPage.url))
    }
  }

  def andISelectOptionOnPartialNameErrorPage(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("confirmRepaymentAccountName_0")
      case "No"  => Input.clickById("confirmRepaymentAccountName_1")
    }
    UKBankAccountPaymentPage.clickContinue()
  }

  def andIEnterUKBankAccountDetailsAs(details: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
    UKBankAccountPaymentPage.clickContinue()
  }

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

  def thenIGoTillGetReadyToApproveYourPaymentPage(): Unit = {
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
  }

  def thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage(): Unit = {
    Nav.browserBack()
    for i <- 1 to 7 do {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
}
