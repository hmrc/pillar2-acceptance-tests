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

object SecondContactDetailsPage extends PageObject {
  val url: String = s"$rootUrl" + "contact-details/second-contact"

  val caption  = ".govuk-caption-l"
  val continue = ".govuk-button"

  val eqForm       = ".govuk-form-group"
  val eq           = ".govuk-form-group .govuk-fieldset"
  val errorSummary = ".govuk-error-summary__list"
  val errorLink    = "[href*='#value_0']"
  val backLink     = ".govuk-back-link"
  val errorMessage = ".govuk-error-message"

  def clickContinue(): Unit = findByCss(continue).click()
}
