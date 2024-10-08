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

object AccountsSummaryPage extends PageObject {
  val url: String        = s"$rootUrl"+"manage-account/account-details/summary"

  val caption            = ".govuk-caption-l"
  val continue           = ".govuk-button"
  val header: String     = "h1.govuk-heading-l"
  val keyList            = ".govuk-summary-list__key"
  val valueList          = ".govuk-summary-list__value"
  val actionsList        = ".govuk-summary-list__actions"
  val rowNumber          = "govuk-summary-list__row"

  def clickContinue()    = findByCss(continue).click()

}
