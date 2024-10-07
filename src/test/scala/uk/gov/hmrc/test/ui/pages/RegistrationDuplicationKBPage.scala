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

object RegistrationDuplicationKBPage extends PageObject{
  val url: String       = s"$rootUrl"+"review-submit/error/duplicate-details"
  val header: String    = "h1.govuk-panel__title"
  val header2           = "h2.govuk-heading-m"
  val pageHeader        = "a[href='/report-pillar2-top-up-taxes']"

  def clickContinue(): Unit = findByCss(continue).click()

}
