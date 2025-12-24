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

package uk.gov.hmrc.test.ui.pages.registration

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object TaskListPage extends BasePage {
  override val url: String = s"${baseUrl}check-progress/register-your-group"

  private val addUltimateFilingMemberLink: By = By.cssSelector("a[href*='/match-hmrc-records']")
  private val addFilingMemberLink: By         = By.cssSelector("a[href*='/nominate']")
  private val addFurtherGroupDetailsLink: By  = By.cssSelector("a[href*='/group-status']")
  private val addContactDetailsLink: By       = By.cssSelector("a[href*='/contact-details']")
  private val reviewAndSubmitLink: By         = By.cssSelector("a[href*='/check-answers']")

  def clickLinkAddUltimateFilingMember(): Unit = clickLink(addUltimateFilingMemberLink)
  def clickLinkAddFilingMember(): Unit         = clickLink(addFilingMemberLink)
  def clickLinkAddFurtherGroupDetails(): Unit  = clickLink(addFurtherGroupDetailsLink)
  def clickLinkAddContactDetails(): Unit       = clickLink(addContactDetailsLink)
  def clickLinkReviewAndSubmit(): Unit         = clickLink(reviewAndSubmitLink)
}
