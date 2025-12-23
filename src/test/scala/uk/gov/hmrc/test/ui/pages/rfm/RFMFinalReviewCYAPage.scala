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

  private val changePrimaryContactNameLink: By          = By.cssSelector("a[href*='/contact-details/change-input-name']")
  private val changePrimaryContactEmailLink: By         = By.cssSelector("a[href*='/contact-details/change-input-email']")
  private val changePrimaryContactPhoneNumberLink: By   = By.cssSelector("a[href*='/contact-details/change-input-phone']")
  private val changeSecondaryContactLink: By            = By.cssSelector("a[href*='/contact-details/change-second-contact']")
  private val changeSecondaryContactNameLink: By        = By.cssSelector("a[href*='/contact-details/change-second-input-name']")
  private val changeSecondaryContactEmailLink: By       = By.cssSelector("a[href*='/contact-details/change-second-input-email']")
  private val changeSecondaryContactPhoneNumberLink: By = By.cssSelector("a[href*='/contact-details/change-second-input-phone']")
  private val changeInputAddressLink: By                = By.cssSelector("a[href*='/change-input-address']")
  private val changeAddressLink: By                     = By.cssSelector("[href*='address/change-input']")

  def clickLinkChangePrimaryContactName(): Unit          = clickLink(changePrimaryContactNameLink)
  def clickLinkChangePrimaryContactEmail(): Unit         = clickLink(changePrimaryContactEmailLink)
  def clickLinkChangePrimaryContactPhoneNumber(): Unit   = clickLink(changePrimaryContactPhoneNumberLink)
  def clickLinkChangeSecondaryContact(): Unit            = clickLink(changeSecondaryContactLink)
  def clickLinkChangeSecondaryContactName(): Unit        = clickLink(changeSecondaryContactNameLink)
  def clickLinkChangeSecondaryContactEmail(): Unit       = clickLink(changeSecondaryContactEmailLink)
  def clickLinkChangeSecondaryContactPhoneNumber(): Unit = clickLink(changeSecondaryContactPhoneNumberLink)
  def clickLinkChangeInputAddress(): Unit                = clickLink(changeInputAddressLink)
  def clickLinkChangeAddress(): Unit                     = clickLink(changeAddressLink)
}
