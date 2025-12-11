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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object ManageGroupStatusPage extends BasePage {
  override val url: String = s"${baseUrl}manage-account/account-details/change-group-status"

  private val onlyUk: By     = By.id("value_0")
  private val ukAndNonUk: By = By.id("value_1")

  def selectOnlyUk(): Unit = {
    onPage()
    click(onlyUk)
    clickByClassName(continue)
  }

  def selectUkAndNonUk(): Unit = {
    onPage(s"${baseUrl}further-details/change-group-status")
    click(ukAndNonUk)
    clickByClassName(continue)
  }
}
