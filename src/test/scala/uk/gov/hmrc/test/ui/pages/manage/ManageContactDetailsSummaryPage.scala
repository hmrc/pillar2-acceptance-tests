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

package uk.gov.hmrc.test.ui.pages.manage

import uk.gov.hmrc.test.ui.pages.BasePage

object ManageContactDetailsSummaryPage extends BasePage {
  override val url: String = s"${baseUrl}manage-account/contact-details/summary"

  val changePrimaryContactName             = "a[href*='/change-input-name']"
  val changePrimaryContactEmail            = "a[href*='/change-input-email']"
  val changePrimaryContactPhoneAsContact   = "a[href*='/change-phone']"
  val changePrimaryContactPhoneNumber      = "a[href*='/change-input-phone']"
  val changeSecondaryContact               = "a[href*='/change-second-contact']"
  val changeSecondaryContactName           = "a[href*='/change-second-input-name']"
  val changeSecondaryContactEmail          = "a[href*='/change-second-input-email']"
  val changeSecondaryContactPhoneAsContact = "a[href*='/change-second-phone']"
  val changeSecondaryContactPhoneNumber    = "a[href*='/change-second-input-phone']"
  val changeAddress                        = "a[href*='/address/change-input']"
}
