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

import uk.gov.hmrc.test.ui.cucumber.PageObject

object RFMEnterPillar2IdPage extends PageObject {
  val url: String = s"$rootUrl" + "replace-filing-member/security/enter-pillar2-id"

  val caption               = ".govuk-caption-l"
  val continue              = ".govuk-button"
  val header: String        = "h1.govuk-label-wrapper"
  val hintText              = "value-hint"
  val pillar2topuptaxid     = "#value"

  val errorMessage          = ".govuk-error-message"
  val errorLink             = "[href*='#value']"
  //val errorLink1            = "div.govuk-error-summary>div> div>ul >li:nth-child(1)>a"
  //val errorLink2            = "div.govuk-error-summary>div> div>ul >li:nth-child(2)>a"
  val errorSummary          = ".govuk-error-summary__list"

}