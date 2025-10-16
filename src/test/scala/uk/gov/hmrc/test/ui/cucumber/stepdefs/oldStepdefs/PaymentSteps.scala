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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.oldStepdefs

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonFunctions
import uk.gov.hmrc.test.ui.pages._

class PaymentSteps extends CommonFunctions {

  Then("""^I should be navigated to new tab$""") { () =>
    val handles   = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    driver.switchTo().window(newWindow)
  }

  Then("""^I should navigate back to main tab""") { () =>
    val handles    = driver.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    driver.switchTo().window(mainWindow)
  }

  Then("""I should be redirected to guidance page in a new tab""") { () =>
    val handles    = driver.getWindowHandles.toArray().toSeq
    val newWindow  = handles(1).toString
    val mainWindow = handles.head.toString
    driver.switchTo().window(newWindow)
    Wait.waitForElementToPresentByCssSelector(GGRGuidancePage.header)
    assert(driver.findElement(By.cssSelector(GGRGuidancePage.header)).isDisplayed)
    driver.close()
    driver.switchTo().window(mainWindow)
  }

  Then("""^I close new tab""") { () =>
    driver.close()
  }

  Then("""^The character limit text should display (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.charLimit)
    assert(getTextOf(By.cssSelector(RepaymentReasonPage.charLimit)).contains(header))
  }

  And("""^I select repayment method as (.*)$""") { (option: String) =>
    option match {
      case "UK bank account"     => Input.clickById("value_0")
      case "Non-UK bank account" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  And("""^I provide value for (.*) as (.*)$""") { (field: String, name: String) =>
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

  And("""^I provide Refund Reason as (.*)$""")((refundReason: String) => {
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.reasonTextField)
    Input.sendKeysByCss(refundReason, RepaymentReasonPage.reasonTextField)
  })

  And("""^I should see bank account error message (.*) on the (.*) Element$""") { (error: String, page: String) =>
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

  And("""^I provide Refund Amount as (.*)$""")((refundAmount: String) => {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(refundAmount, RepaymentAmountPage.refundAmountField)
    clickByCss(RepaymentAmountPage.continue)
  })

  And("""^I provide Repayment contact (.*) as (.*)$""") { (page: String, Value: String) =>
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

  And("""^I should see the repayment method (.*) remain selected$""") { (accountType: String) =>
    accountType match {
      case "UK bank account"     => Find.findByCss("#value_0").isSelected
      case "Non-UK bank account" => Find.findByCss("#value_1").isSelected
    }
  }

  When("""^I click change link for Repayment (.*)""") { (link: String) =>
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

  Given("""^I access Repayment contact email page$""") { () =>
    Nav.navigateTo(RepaymentContactEmailPage.url)
  }

  When("""^I access Repayment CYA page$""") { () =>
    Nav.navigateTo(RepaymentCYAPage.url)
  }

  And("""^I access (.*) payment page$""") { (page: String) =>
    page match {
      case "Non UK" =>
        Nav.navigateTo(NonUKBankAccountPaymentPage.url)
      case "UK" =>
        Nav.navigateTo((UKBankAccountPaymentPage.url))
    }
  }

  And("""^I select option (.*) on partial name error page$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("confirmRepaymentAccountName_0")
      case "No"  => Input.clickById("confirmRepaymentAccountName_1")
    }
    UKBankAccountPaymentPage.clickContinue()
  }

  And("""^(I navigate from Contact page to CYA page)""") { (negate: String) =>
    for (i <- 1 to 4) {
      UKBankAccountPaymentPage.clickContinue()
    }
  }

  And("""^I enter UK Bank Account details as:$""") { (details: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
    UKBankAccountPaymentPage.clickContinue()
  }

  And("""^I enter Non UK Bank Account details as:$""") { (details: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(details)
    UKBankAccountPaymentPage.clickContinue()
  }

  Then("""I make successful payment""") { () =>
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

  Then("""I go till Get ready to approve your payment page""") { () =>
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
  }

  Then("""I should be able to navigate back to make a payment page""") { () =>
    Nav.browserBack()
    for (i <- 1 to 7) {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
  Then("""I should be able to navigate back to outstanding payment page""") { () =>
    Nav.browserBack()
    for (i <- 1 to 7) {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
}
