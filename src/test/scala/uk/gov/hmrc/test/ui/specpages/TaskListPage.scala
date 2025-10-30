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

package uk.gov.hmrc.test.ui.specpages

import org.openqa.selenium.By

object TaskListPage extends BasePage {

  override val url: String = s"$baseUrl" + "check-progress/register-your-group"

  val taskList    = ".app-task-list"
  val taskSection = ".app-task-list__section"
  val taskItems   = ".app-task-list__items"
  val taskItem    = ".app-task-list__item"
  val status      = ".hmrc-status-tag"

  private val addFilingMember        = "a[href*='/nominate']"
  private val addFurtherGroupDetails = "a[href*='/group-status']"
  private val addContactDetails      = "a[href*='/contact-details']"
  private val reviewAndSubmit        = "a[href*='/check-answers']"

  def clickAddFilingMemberLink(): Unit = {
    onPage()
    click(By.cssSelector(addFilingMember))
  }

  def clickAddFurtherGroupDetailsLink(): Unit = {
    onPage()
    click(By.cssSelector(addFurtherGroupDetails))
  }

  def clickAddContactDetailsLink(): Unit = {
    onPage()
    click(By.cssSelector(addContactDetails))
  }

  def clickReviewAndSubmitLink(): Unit = {
    onPage()
    click(By.cssSelector(reviewAndSubmit))
  }
}
