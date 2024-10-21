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

object UPEAddressPage extends PageObject {
  val url: String =
    s"$rootUrl" + "business-matching/ultimate-parent/no-id/input-address"
  val continue                 = "#submit"
  val errorSummary             = ".govuk-error-summary__list"
  val addressErrorLink         = "[href='#addressLine1']"
  val addressLine2ErrorLink    = "[href='#addressLine2']"
  val cityErrorLink            = "[href='#addressLine3']"
  val regionLink               = "[href='#addressLine4']"
  val postalCodeErrorLink      = "[href='#postalCode']"
  val countryErrorLink         = "[href='#countryCode']"
  val addressLine1             = "#addressLine1"
  val townOrCity               = "#addressLine3"
  val country                  = "#countryCode"
  val addressLine2             = "#addressLine2"
  val region                   = "#addressLine4"
  val postalCode               = "#postalCode"
  val postalCodeErrorMessage   = "#postalCode-error"
  val backLink                 = ".govuk-back-link"
  val addressErrorMessage      = "#addressLine1-error"
  val addressLine2ErrorMessage = "#addressLine2-error"
  val cityErrorMessage         = "#addressLine3-error"
  val regionErrorMessage       = "#addressLine4-error"
  val countryErrorMessage      = "#countryCode-error"
  val selected                 = "#countryCode__option--0"
  val hintText                 = ".govuk-hint"

  def clickContinue(): Unit        = findByCss(continue).click()
  def clickCountrySelected(): Unit = findByCss(selected).click()

}
