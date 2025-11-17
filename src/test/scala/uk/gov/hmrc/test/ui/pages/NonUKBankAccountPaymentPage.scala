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

package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.helper.PageObject

object NonUKBankAccountPaymentPage extends PageObject {

  val url: String                = s"$rootUrl" + "repayment/non-uk-details"
  val errorSummary               = ".govuk-error-summary__list"
  val bankNameField              = "#bankName"
  val accountNameField           = "#nameOnBankAccount"
  val swiftCodeField             = "#bic"
  val IbanField                  = "#iban"
  val errorBankNameLink          = "[href='#bankName']"
  val errorAccountNameLink       = "[href='#nameOnBankAccount']"
  val errorSwiftCodeLink         = "[href='#bic']"
  val errorIbanLink              = "[href='#iban']"
  val errorBankNameMessage       = "#bankName-error"
  val errorAccountNameMessage    = "#nameOnBankAccount-error"
  val errorBicOrSwiftCodeMessage = "#bic-error"
  val errorIbanMessage           = "#iban-error"
}