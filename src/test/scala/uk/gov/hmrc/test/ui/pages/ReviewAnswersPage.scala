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

object ReviewAnswersPage extends PageObject {
  val url: String    = s"$rootUrl" + "review-submit/check-answers"
  val header: String = "h1.govuk-heading-l"
  val keyList        = ".govuk-summary-list__key"
  val valueList      = ".govuk-summary-list__value"
  val actionsList    = ".govuk-summary-list__actions"
  val rowNumber      = "govuk-summary-list__row"
  val continue       = "#continue"

  // UPE Section
  val changeUPEName          = "a[href*='ultimate-parent/no-id/change-input-name']"
  val changeUPEAddress       = "a[href*='ultimate-parent/no-id/change-input-address']"
  val changeUPEBName         = "a[href*='ultimate-parent/no-id/change-input-business-name']"
  val changeEmail            = "a[href*='ultimate-parent/no-id/change-input-email']"
  val changeUPEContact       = "a[href*='/change-telephone']"
  val changeUPEContactNumber = "a[href*='/change-input-telephone']"

  // NFM Section
  val changeNominate         = "a[href*='/change-nominate']"
  val changeNFMName          = "a[href*='filing-member/no-id/change-input-name']"
  val changeNFMAddress       = "a[href*='filing-member/no-id/change-input-name']"
  val changeNFMContactName   = "a[href*='filing-member/no-id/change-input-name']"
  val changeNFMContactEmail  = "a[href*='filing-member/no-id/change-input-name']"
  val changeNFMContact       = "a[href*='filing-member/no-id/change-input-name']"
  val changeNFMContactNumber = "a[href*='filing-member/no-id/change-input-name']"

  // Further Registration details Section
  val changeGroupStatus  = "a[href*='/change-group-status']"
  val changeAccountDates = "a[href*='/change-accounting-period']"

  // First Contact Section
  val changePCName          = "a[href*='/change-input-name']"
  val changePCEmail         = "a[href*='/change-input-email']"
  val changePCContact       = "a[href*='/change-phone']"
  val changePCContactNumber = "a[href*='/change-input-phone']"

  // Second Contact Section
  val changeSC              = "a[href*='/change-second-contact']"
  val changeSCName          = "a[href*='/change-second-input-name']"
  val changeSCEmail         = "a[href*='/change-second-input-email']"
  val changeSCContact       = "a[href*='/change-second-telephone']"
  val changeSCContactNumber = "a[href*='/change-second-input-telephone']"

  // Contact Address Section
  val changeContactAddress = "a[href*='address/change-input']"

  val printPreviewArea = "[src*='print.pdf']"
  val printthispage    = "[data-module='hmrc-print-link']"

  def saveAndContinue(): Unit = findByCss(continue).click()
}
