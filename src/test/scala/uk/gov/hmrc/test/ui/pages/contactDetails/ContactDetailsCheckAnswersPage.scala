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

  private val changePrimaryContactNameLink: By           = By.cssSelector("a[href*='/change-input-name']")
  private val changePrimaryContactEmailAddressLink: By   = By.cssSelector("a[href*='/change-input-email']")
  private val changePrimaryContactPhoneNumberLink: By    = By.cssSelector("a[href*='/change-input-phone']")
  private val changePrimaryContactByPhoneLink: By        = By.cssSelector("a[href*='/change-phone']")
  private val changeSecondaryContactLink: By             = By.cssSelector("a[href*='/change-second-contact']")
  private val changeSecondaryContactNameLink: By         = By.cssSelector("a[href*='/change-second-input-name']")
  private val changeSecondaryContactEmailAddressLink: By = By.cssSelector("a[href*='/change-second-input-email']")
  private val changeSecondaryContactPhoneNumberLink: By  = By.cssSelector("a[href*='/change-second-input-phone']")
  private val changeContactAddressLink: By               = By.cssSelector("a[href*='/change-input-address']")

  def clickLinkChangePrimaryContactName(): Unit           = clickLink(changePrimaryContactNameLink)
  def clickLinkChangePrimaryContactEmailAddress(): Unit   = clickLink(changePrimaryContactEmailAddressLink)
  def clickLinkChangePrimaryContactPhoneNumber(): Unit    = clickLink(changePrimaryContactPhoneNumberLink)
  def clickLinkChangePrimaryContactByPhone(): Unit        = clickLink(changePrimaryContactByPhoneLink)
  def clickLinkChangeSecondaryContact(): Unit             = clickLink(changeSecondaryContactLink)
  def clickLinkChangeSecondaryContactName(): Unit         = clickLink(changeSecondaryContactNameLink)
  def clickLinkChangeSecondaryContactEmailAddress(): Unit = clickLink(changeSecondaryContactEmailAddressLink)
  def clickLinkChangeSecondaryContactPhoneNumber(): Unit  = clickLink(changeSecondaryContactPhoneNumberLink)
  def clickLinkChangeContactAddress(): Unit               = clickLink(changeContactAddressLink)
}
