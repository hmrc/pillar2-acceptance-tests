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


object TaskListPage extends PageObject {
  val url: String      = s"$rootUrl" + "task-list/register-for-global-minimum-tax"
  val header: String   = "h1.govuk-heading-xl"
  val taskList         = ".app-task-list"
  val taskSection      = ".app-task-list__section"
  val taskItems        = ".app-task-list__items"
  val taskItem         = ".app-task-list__item"
  val empStatusLink    = "[aria-describedby='eligibility-status']"
  val status          = ".hmrc-status-tag"
  val completedsection = ".govuk-body govuk-!-margin-bottom-7"
  //val status           = "strong.govuk-tag.govuk-tag--grey.app-task-list__tag"

}
