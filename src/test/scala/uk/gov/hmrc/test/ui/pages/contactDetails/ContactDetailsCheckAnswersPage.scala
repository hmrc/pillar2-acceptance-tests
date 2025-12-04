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

package uk.gov.hmrc.test.ui.pages.contactDetails

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object ContactDetailsCheckAnswersPage extends BasePage {
  override val url: String = s"${baseUrl}contact-details/check-answers"

  val changePrimaryContactName           = "a[href*='/change-input-name']"
  val changePrimaryContactEmailAddress   = "a[href*='/change-input-email']"
  val changePrimaryContactPhoneNumber    = "a[href*='/change-input-phone']"
  val changeSecondaryContact             = "a[href*='/change-second-contact']"
  val changeSecondaryContactName         = "a[href*='/change-second-input-name']"
  val changeSecondaryContactEmailAddress = "a[href*='/change-second-input-email']"
  val changeSecondaryContactPhoneNumber  = "a[href*='/change-second-input-phone']"
  val changeContactAddress               = "a[href*='/change-input-address']"

  def clickChangeLink(changeLink: String): Unit = {
    onPage()
    click(By.cssSelector(changeLink))
  }
}
