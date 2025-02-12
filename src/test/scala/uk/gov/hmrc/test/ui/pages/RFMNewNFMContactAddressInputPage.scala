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

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object RFMNewNFMContactAddressInputPage extends PageObject {
  val url: String              = s"$rootUrl" + "replace-filing-member/business-matching/filing-member/no-id/input-address"
  val continue                 = ".govuk-button"
  val errorSummary             = ".govuk-error-summary__list"
  val addressLine1ErrorLink    = "[href='#addressLine1']"
  val addressLine2ErrorLink    = "[href='#addressLine2']"
  val cityErrorLink            = "[href='#addressLine3']"
  val regionErrorLink          = "[href='#addressLine4']"
  val postcodeErrorLink        = "[href='#postalCode']"
  val countryErrorLink         = "[href='#countryCode']"
  val country                  = "#countryCode"
  val backLink                 = ".govuk-back-link"
  val addressLine1ErrorMessage = "#addressLine1-error"
  val addressLine2ErrorMessage = "#addressLine2-error"
  val cityErrorMessage         = "#addressLine3-error"
  val regionErrorMessage       = "#addressLine4-error"
  val postcodeErrorMessage     = "#postalCode-error"
  val countryErrorMessage      = "#countryCode-error"

  def clickContinue(): Unit = findByCss(continue).click()

}
