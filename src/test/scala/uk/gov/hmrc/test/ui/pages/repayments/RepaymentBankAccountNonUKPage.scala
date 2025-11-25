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

object RepaymentBankAccountNonUKPage extends BasePage {

  override val url: String = s"${baseUrl}repayment/non-uk-details"

  val bankNameInputField: By          = By.id("bankName")
  val accountHolderNameInputField: By = By.id("nameOnBankAccount")
  val bicOrSwiftInputField: By        = By.id("bic")
  val ibanInputField: By              = By.id("iban")

  val bankNameValue          = "HSBC"
  val accountHolderNameValue = "HMRC Shipley"
  val bicOrSwiftValue        = "HBUKGB4B"
  val ibanValue              = "GB29NWBK60161331926819"

  def enterBankDetails(): Unit = {
    onPage()
    sendKeys(bankNameInputField, bankNameValue)
    sendKeys(accountHolderNameInputField, accountHolderNameValue)
    sendKeys(bicOrSwiftInputField, bicOrSwiftValue)
    sendKeys(ibanInputField, ibanValue)
    clickByClass(continue)
  }
}
