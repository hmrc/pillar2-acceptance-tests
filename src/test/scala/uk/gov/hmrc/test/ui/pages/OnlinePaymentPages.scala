package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.WebElement
import uk.gov.hmrc.test.ui.cucumber.Find._
import uk.gov.hmrc.test.ui.cucumber.{Input, PageObject, Wait}
import uk.gov.hmrc.test.ui.driver.BrowserDriver

object OnlinePaymentPages extends PageObject with BrowserDriver {

  val url: String              = driver.getCurrentUrl
  val paymentInput: WebElement = findById("amountToPay")
  val continueButton           = ".govuk-button"

  def enterAmountAncClickContinueOnEnterPaymentAmountPage(): Unit = {
    Wait.waitForUrl("http://localhost:9056/pay/enter-payment-amount?traceId=")
    Wait.waitForElementToPresentById("amountToPay")
    Input.sendKeysById("amountToPay", "348")
    Input.clickByCss(".govuk-button")
  }

  def clickContinueOnChooseOpenBankingOrBacsPage(): Unit = {
    Wait.waitForUrl("http://localhost:9056/pay/choose-open-banking-or-bacs?traceId=")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'Pay by bank account')]")
    Input.clickByCss(".govuk-button")
  }

  def enterBankNameAndClickContinueOnChooseBankPage(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/choose-bank")
    Wait.waitForElementByXpathContainsText("//label[contains(text(), 'What is the name of your bank?')]")
    Wait.waitForElementToPresentById("selectedBankId")
    Input.sendKeysById("selectedBankId", "Chase")
    Input.clickByCss(".govuk-button")
  }

  def enterEmailAndClickContinueOnEmailPage(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/email")
    Wait.waitForElementByXpathContainsText("//label[contains(text(), 'What is your email address? (optional)')]")
    Wait.waitForElementToPresentById("email")
    Input.sendKeysById("email", "payment_test@gmail.com")
    Input.clickByCss(".govuk-button")
  }

  def clickContinueOnCheckYourDetailsPage(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/check-your-details")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'Check your details')]")
    Input.clickByCss(".govuk-button")
  }

  def clickContinueOnGetReadyApproveThisPaymentPage(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/get-ready-approve-this-payment")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'Get ready to approve your payment')]")
    Input.clickByCss(".govuk-button")
  }

  def selectBankLoginOptionAndClickContinue(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/choose-bank-login")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'How do you want to log in to your Chase account?')]")
    Input.clickById("bankLoginOption_2")
    Input.clickByCss(".govuk-button")
  }

  def clickSubmitOnStubBankPaymentPage(): Unit = {
    Wait.waitForUrl("http://localhost:9975/payments-stubs/open-banking/stub-bank/")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'Stub bank payment page')]")
    Input.clickByCss(".govuk-button")
  }
  def verifyPaymentAndClickHmrcOnlineAccountLinkOnPaymentCompletePage(): Unit = {
    Wait.waitForUrl("http://localhost:7802/pay-by-bank/payment-complete")
    Wait.waitForElementByXpathContainsText("//h1[contains(text(), 'Payment complete')]")
    Input.clickByLinkText("HMRC online account.")
  }
}
