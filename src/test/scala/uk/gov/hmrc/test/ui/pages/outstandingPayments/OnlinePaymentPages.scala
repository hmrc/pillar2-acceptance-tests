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

package uk.gov.hmrc.test.ui.pages.outstandingPayments

import uk.gov.hmrc.test.ui.pages.BasePage

object OnlinePaymentPages extends BasePage {

  override val url: String = "http://localhost:7802/pay-by-bank/payment-complete"

  def enterPaymentAmountPage(): Unit = {
    onPageContains("http://localhost:9056/pay/enter-payment-amount?traceId=")
    sendKeysById("amountToPay", "348")
    clickByClassName(continue)
  }

  def openBankingOrBACSPage(): Unit = {
    onPageContains("http://localhost:9056/pay/choose-open-banking-or-bacs?traceId=")
    clickByClassName(continue)
  }

  def enterBankNamePage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/choose-bank")
    sendKeysById("selectedBankId", "Chase")
    clickByClassName(continue)
  }

  def enterEmailPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/email")
    sendKeysById("email", "payment_test@gmail.com")
    clickByClassName(continue)
  }

  def checkYourDetailsPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/check-your-details")
    clickByClassName(continue)
  }

  def readyApprovePaymentPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/get-ready-approve-this-payment")
    clickByClassName(continue)
  }

  def selectBankLoginOption(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/choose-bank-login")
    clickById("bankLoginOption_2")
    clickByClassName(continue)
  }

  def submitStubBankPaymentPage(): Unit = {
    onPageContains("http://localhost:9975/payments-stubs/open-banking/stub-bank/")
    clickByClassName(continue)
  }

  def paymentCompletePage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/payment-complete")
    clickLink("a[href*='payment/history']")
  }

  def makeSuccessfulPayment(): Unit = {
    enterPaymentAmountPage()
    openBankingOrBACSPage()
    enterBankNamePage()
    enterEmailPage()
    checkYourDetailsPage()
    readyApprovePaymentPage()
    selectBankLoginOption()
    submitStubBankPaymentPage()
    paymentCompletePage()
  }
}
