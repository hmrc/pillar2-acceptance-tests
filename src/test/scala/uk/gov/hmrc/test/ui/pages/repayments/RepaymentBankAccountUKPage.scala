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

package uk.gov.hmrc.test.ui.pages.repayments

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object RepaymentBankAccountUKPage extends BasePage {
  override val url: String = s"${baseUrl}repayment/uk-details"

  val bankNameInputField: By          = By.id("bankName")
  val accountHolderNameInputField: By = By.id("accountHolderName")
  val sortCodeInputField: By          = By.id("sortCode")
  val accountNumberInputField: By     = By.id("accountNumber")

  case class BankDetails(
      bankName: String,
      accountHolderName: String,
      sortCode: String,
      accountNumber: String
  )

  val validBankDetails: BankDetails = BankDetails("Natwest", "Epic Adventure Inc", "206705", "86473611")
  val couldNotConfirmBankDetails: BankDetails = BankDetails("Test", "Eco Focus", "206705", "56945688")
  val bankDetailsError: BankDetails = BankDetails("Test", "Innovation Arch", "206705", "56523611")
  val barsError: BankDetails = BankDetails("Test", "Flux Water Gear", "207102", "86473611")
  val partialNameError: BankDetails = BankDetails("Test", "Epic", "206705", "86473611")

  def enterBankDetails(details: BankDetails): Unit = {
    onPage()
    sendKeys(bankNameInputField, details.bankName)
    sendKeys(accountHolderNameInputField, details.accountHolderName)
    sendKeys(sortCodeInputField, details.sortCode)
    sendKeys(accountNumberInputField, details.accountNumber)
    clickByClass(continue)
  }
}
