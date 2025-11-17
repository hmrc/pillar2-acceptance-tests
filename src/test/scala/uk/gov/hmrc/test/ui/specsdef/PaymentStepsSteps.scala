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
import uk.gov.hmrc.test.ui.helper.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.helper._
import uk.gov.hmrc.test.ui.pages._

object PaymentStepsSteps {
  def thenIShouldBeNavigatedToNewTab(): Unit = {
    val handles   = Driver.instance.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    Driver.instance.switchTo().window(newWindow)
  }

  def thenIShouldNavigateBackToMainTab(): Unit = {
    val handles    = Driver.instance.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    Driver.instance.switchTo().window(mainWindow)
  }

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

  def thenICloseNewTab(): Unit = {
    Driver.instance.close()
  }

  def thenTheCharacterLimitTextShouldDisplayX(header: String): Unit = {
    Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.charLimit)
    assert(getTextOf(By.cssSelector(RepaymentReasonPage.charLimit)).contains(header))
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
      case "Bank Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.bankNameField)
        Input.sendKeysByCss(name, NonUKBankAccountPaymentPage.bankNameField)

      case "Account Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.accountNameField)
        Input.sendKeysByCss(name, NonUKBankAccountPaymentPage.accountNameField)

      case "Swift Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.swiftCodeField)
        Input.sendKeysByCss(name, NonUKBankAccountPaymentPage.swiftCodeField)

      case "Iban" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.IbanField)
        Input.sendKeysByCss(name, NonUKBankAccountPaymentPage.IbanField)

      case "Refund Reason" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.reasonTextField)
        Input.sendKeysByCss(name, RepaymentReasonPage.reasonTextField)

      case "UK Bank Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.UkBankName)
        Input.sendKeysByCss(name, UKBankAccountPaymentPage.UkBankName)

      case "UK Account Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.UkAccountName)
        Input.sendKeysByCss(name, UKBankAccountPaymentPage.UkAccountName)

      case "Sort Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.sortCode)
        Input.sendKeysByCss(name, UKBankAccountPaymentPage.sortCode)

      case "UK Account number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.accountNumber)
        Input.sendKeysByCss(name, UKBankAccountPaymentPage.accountNumber)
    }
  }

  def andIProvideRefundReasonAsX(refundReason: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.reasonTextField)
    Input.sendKeysByCss(refundReason, RepaymentReasonPage.reasonTextField)
  }

  def IShouldSeeBankAccountErrorMessageXOnTheXElement(error: String, page: String): Unit = {
    page match {
      case "Name of the Bank" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBankNameLink)
        getTextOf(By cssSelector NonUKBankAccountPaymentPage.errorBankNameLink) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBankNameMessage)
        getTextOf(By cssSelector NonUKBankAccountPaymentPage.errorBankNameMessage) should include(error)

      case "Account Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorAccountNameLink)
        getTextOf(By cssSelector NonUKBankAccountPaymentPage.errorAccountNameLink) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorAccountNameMessage)
        getTextOf(By cssSelector NonUKBankAccountPaymentPage.errorAccountNameMessage) should include(error)

      case "Swift Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSwiftCodeLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorSwiftCodeLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBicOrSwiftCodeMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorBicOrSwiftCodeMessage)) should include(error)

      case "Iban" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorIbanLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorIbanLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorIbanMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorIbanMessage)) should include(error)

      case "UK Bank Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorUKBankNameLink)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorUKBankNameLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorMessage)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorMessage)) should include(error)

      case "UK Account Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorUKAccountNameLink)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorUKAccountNameLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorMessage)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorMessage)) should include(error)

      case "UK Sort Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorUKSortCodeLink)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorUKSortCodeLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorMessage)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorMessage)) should include(error)

      case "UK Account Number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorUKAccountLink)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorUKAccountLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UKBankAccountPaymentPage.errorMessage)
        getTextOf(By cssSelector (UKBankAccountPaymentPage.errorMessage)) should include(error)
    }
  }

  def andIProvideRefundAmountAs(refundAmount: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(refundAmount, RepaymentAmountPage.refundAmountField)
    clickByCss(RepaymentAmountPage.continue)
  }

  def IProvideRepaymentContactXAsX(page: String, Value: String): Unit = {
    page match {
      case "name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(Value, RepaymentContactPage.contactNameField)
        clickByCss(RepaymentContactPage.continue)

      case "email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(Value, RepaymentContactEmailPage.contactEmailField)
        clickByCss(RepaymentContactEmailPage.continue)

      case "phone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(Value, RepaymentPhoneInputPage.contactPhone)
        clickByCss(RepaymentPhoneInputPage.continue)
    }
  }

  def andIShouldSeeTheRepaymentMethodXRemainSelected(accountType: String): Unit = {
    accountType match {
      case "UK bank account"     => Find.findByCss("#value_0").isSelected
      case "Non-UK bank account" => Find.findByCss("#value_1").isSelected
    }
  }

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

  def givenIAccessRepaymentContactEmailPage(): Unit = {
    Nav.navigateTo(RepaymentContactEmailPage.url)
  }

  def whenIAccessRepaymentCYAPage(): Unit = {
    Nav.navigateTo(RepaymentCYAPage.url)
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

  def andINavigateFromContactPageToCYAPage(negate: String): Unit = {
    for (i <- 1 to 4) {
      UKBankAccountPaymentPage.clickContinue()
    }
  }

  def andIEnterUKBankAccountDetailsAs(details: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
    UKBankAccountPaymentPage.clickContinue()
  }

  def andIEnterNonUKBankAccountDetailsAs(details: Map[String, String]): Unit = {
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

  def thenIShouldBeAbleToNavigateBackToMakeAPaymentPage(): Unit = {
    Nav.browserBack()
    for (i <- 1 to 7) {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }

  def thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage(): Unit = {
    Nav.browserBack()
    for (i <- 1 to 7) {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
}
