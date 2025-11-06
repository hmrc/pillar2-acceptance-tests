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

package uk.gov.hmrc.test.ui.specpages.eligibility

import uk.gov.hmrc.test.ui.specpages.BasePage

object EligibilityGlobalGrossRevenueEQPage extends BasePage {
  val url: String = s"$baseUrl" + "eligibility/group-consolidated-annual-revenues"

//  val eqForm       = "form[action*='eligibility']"
//  val eq           = "form[action*='eligibility'] .govuk-fieldset"
//  val errorSummary = ".govuk-error-summary__list"
//  val errorLink    = "[href*='#value']"
//  val errorMessage = ".govuk-error-message"

  def selectYes(): Unit = {
    onPage()
    click(yesRadioId)
    clickByClass(continue)
  }

  def selectNo(): Unit = {
    onPage()
    click(noRadioId)
    clickByClass(continue)
  }
}
