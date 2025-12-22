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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object OnlinePaymentPages extends BasePage {

  override val url: String = "http://localhost:7802/pay-by-bank/payment-complete"

  def enterPaymentAmountPage(): Unit = {
    onPageContains("http://localhost:9056/pay/enter-payment-amount?traceId=")
    sendKeys(By.id("amountToPay"), "348")
    continue()
  }

  def openBankingOrBACSPage(): Unit = {
    onPageContains("http://localhost:9056/pay/choose-open-banking-or-bacs?traceId=")
    continue()
  }

  def enterBankNamePage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/choose-bank")
    sendKeys(By.id("selectedBankId"), "Chase")
    continue()
  }

  def enterEmailPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/email")
    sendKeys(By.id("email"), "payment_test@gmail.com")
    continue()
  }

  def checkYourDetailsPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/check-your-details")
    continue()
  }

  def readyApprovePaymentPage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/get-ready-approve-this-payment")
    continue()
  }

  def selectBankLoginOption(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/choose-bank-login")
    click(By.id("bankLoginOption_2"))
    continue()
  }

  def submitStubBankPaymentPage(): Unit = {
    onPageContains("http://localhost:9975/payments-stubs/open-banking/stub-bank/")
    continue()
  }

  def paymentCompletePage(): Unit = {
    onPage("http://localhost:7802/pay-by-bank/payment-complete")
    clickLink("a[href*='payment/history']")
  }

  def makeSuccessfulPayment(): Unit = {
    println("*********************************************")
    println("0")
    println("*********************************************")
    enterPaymentAmountPage()
    println("*********************************************")
    println("1")
    println("*********************************************")
    openBankingOrBACSPage()
    println("*********************************************")
    println("2")
    println("*********************************************")
    enterBankNamePage()
    println("*********************************************")
    println("3")
    println("*********************************************")
    enterEmailPage()
    println("*********************************************")
    println("4")
    println("*********************************************")
    checkYourDetailsPage()
    println("*********************************************")
    println("5")
    println("*********************************************")
    readyApprovePaymentPage()
    println("*********************************************")
    println("6")
    println("*********************************************")
    selectBankLoginOption()
    println("*********************************************")
    println("7")
    println("*********************************************")
    submitStubBankPaymentPage()
    println("*********************************************")
    println("8")
    println("*********************************************")
    paymentCompletePage()
  }
}
