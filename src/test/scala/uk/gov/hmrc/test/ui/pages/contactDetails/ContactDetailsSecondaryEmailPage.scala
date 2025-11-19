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

object ContactDetailsSecondaryEmailPage extends BasePage {
  override val url: String = s"${baseUrl}contact-details/second-input-email"

  override val textInputField: By = By.id("emailAddress")
  private val emailValue          = "xyz@cba.com"
  private val emailUpdatedValue   = "cbaxyz@cbaxyz.com"

  def enterEmail(): Unit = {
    onPage()
    sendKeys(textInputField, emailValue)
    clickByClass(continue)
  }

  def updateEmail(): Unit = {
    onPage(s"${baseUrl}contact-details/change-second-input-email")
    sendKeys(textInputField, emailUpdatedValue)
    clickByClass(continue)
  }
}
