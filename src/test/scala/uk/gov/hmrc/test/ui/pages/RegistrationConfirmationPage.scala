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
import uk.gov.hmrc.test.ui.pages.UPEAddressPage.continue
import uk.gov.hmrc.test.ui.pages.UPEPage.rootUrl

object RegistrationConfirmationPage extends PageObject{
  val url: String      = s"$rootUrl"+"review-submit/confirmation"
  val header: String = "h1.govuk-panel__title"
  val registrationID = ".govuk-panel__body"
  val header2        = "h2.govuk-heading-m"
  val pageHeader     = "a[href='/report-pillar2-top-up-taxes']"
  val surveylink     = "a[href='/report-pillar2-top-up-taxes/under-construction']"

  def clickContinue() = findByCss(continue).click()

}
