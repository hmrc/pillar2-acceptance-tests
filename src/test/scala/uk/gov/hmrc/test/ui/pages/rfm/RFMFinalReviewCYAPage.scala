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

package uk.gov.hmrc.test.ui.pages.rfm

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object RFMFinalReviewCYAPage extends BasePage {
  override val url: String        = s"${baseUrl}replace-filing-member/review-submit/check-answers"
  override val submitButtonId: By = By.id("send")

  val changePrimaryContactName          = "a[href*='/contact-details/change-input-name']"
  val changePrimaryContactEmail         = "a[href*='/contact-details/change-input-email']"
  val changePrimaryContactPhoneNumber   = "a[href*='/contact-details/change-input-phone']"
  val changeSecondaryContactName        = "a[href*='/contact-details/change-second-input-name']"
  val changeSecondaryContactEmail       = "a[href*='/contact-details/change-second-input-email']"
  val changeSecondaryContactPhoneNumber = "a[href*='/contact-details/change-second-input-phone']"
  val changeInputAddress                = "a[href*='/change-input-address']"
  val changeAddress                     = "[href*='address/change-input']"

  val changeSecondContactPreference = "[href*='change-second-contact']"

}
