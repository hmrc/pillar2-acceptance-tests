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

package uk.gov.hmrc.test.ui.specpages.upe
import uk.gov.hmrc.test.ui.specpages.BasePage

object UPEContactNamePage extends BasePage {
  val url: String = s"$baseUrl" + "business-matching/ultimate-parent/no-id/input-business-name"

  private val nameValue: String       = "Contact Entity Name"
  private val nameUpdatedValue: String = "Updated Contact Entity Name"

  def enterName(): Unit = {
    onPage()
    sendKeys(textInputField, nameValue)
    clickButtonByText(buttonSaveAndContinue)
  }

  def updateName(): Unit = {
    onPage(s"$baseUrl" + "business-matching/ultimate-parent/no-id/change-input-business-name")
    sendKeys(textInputField, nameUpdatedValue)
    clickButtonByText(buttonSaveAndContinue)
  }
}
