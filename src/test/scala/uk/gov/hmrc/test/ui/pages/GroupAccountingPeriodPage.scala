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

object GroupAccountingPeriodPage extends PageObject {
  val url: String      = s"$rootUrl"+"further-details/accounting-period"

  val caption            = ".govuk-caption-l"
  val form               = ".govuk-form-group"
  val continue           = ".govuk-button"
  val errorSummary       = ".govuk-error-summary__list"
  val errorLinkStartDate = "[href='#startDate']"
  val errorLinkEndDate   = "[href='#endDate']"
  val backLink           = ".govuk-back-link"
  val errorMessageStartDate= "#startDate-error"
  val errorMessageEndDate= "#endDate-error"
  val startDay           = "startDate.day"
  val startMonth         = "startDate.month"
  val startYear          = "startDate.year"
  val endDay             = "endDate.day"
  val endMonth           = "endDate.month"
  val endYear            = "endDate.year"
  val dateMessage        =".govuk-fieldset__heading"

  def clickContinue()  = findByCss(continue).click()

}
