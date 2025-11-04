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

package uk.gov.hmrc.test.ui.specpages.rfm

import uk.gov.hmrc.test.ui.cucumber.PageObject

object RFMFinalReviewCYAPage extends PageObject {
  val url: String                   = s"$rootUrl" + "replace-filing-member/review-submit/check-answers"
  val valueList                     = ".govuk-summary-list__value"
  val changeCorporatePosition       = "a[href*='/change-corporate-position']"
  val changeCompany                 = "a[href*='/change-registered-in-uk']"
  val changeInputName               = "a[href*='/change-input-name']"
  val changeInputAddress            = "a[href*='/change-input-address']"
  val changeAddress                 = "[href*='address/change-input']"
  val changePhoneContact            = "a[href*='/change-phone']"
  val changeSecondContactPreference = "[href*='change-second-contact']"
}