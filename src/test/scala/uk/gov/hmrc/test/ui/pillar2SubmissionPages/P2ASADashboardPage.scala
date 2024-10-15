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

package uk.gov.hmrc.test.ui.pillar2SubmissionPages

import uk.gov.hmrc.test.ui.cucumber.PageObject
import uk.gov.hmrc.test.ui.pillar2SubmissionPages.ASAPillar2InputPage.p2SubRootUrl

object P2ASADashboardPage extends PageObject {
  val url: String      = s"$p2SubRootUrl"+"pillar2-top-up-tax-home"


  val ASALink   ="a[href*='/asa/home']"
  val inactiveStatus   =".govuk-notification-banner__heading"


}