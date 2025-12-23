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

package uk.gov.hmrc.test.ui.pages.upe

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object UPECheckYourAnswersPage extends BasePage {
  override val url: String = s"${baseUrl}business-matching/ultimate-parent/no-id/check-answers"

  private val changeNameLink: By         = By.cssSelector("a[href*='/change-input-name']")
  private val changeAddressLink: By      = By.cssSelector("a[href*='/change-input-address']")
  private val changeContactNameLink: By  = By.cssSelector("a[href*='/change-input-business-name']")
  private val changeEmailAddressLink: By = By.cssSelector("a[href*='/change-input-email']")
  private val changePhoneNumberLink: By  = By.cssSelector("a[href*='/change-input-phone']")

  def clickLinkChangeName(): Unit         = clickLink(changeNameLink)
  def clickLinkChangeAddress(): Unit      = clickLink(changeAddressLink)
  def clickLinkChangeContactName(): Unit  = clickLink(changeContactNameLink)
  def clickLinkChangeEmailAddress(): Unit = clickLink(changeEmailAddressLink)
  def clickLinkChangePhoneNumber(): Unit  = clickLink(changePhoneNumberLink)
}
