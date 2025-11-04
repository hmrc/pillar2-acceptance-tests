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

package uk.gov.hmrc.test.ui.specpages.contactDetails

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.specpages.BasePage

object ContactDetailsInputPhonePage extends BasePage {
  val url: String  = s"$baseUrl" + "contact-details/input-phone"
  val contactPhone = "#phoneNumber"

  override val textInputField: By      = By.id("phoneNumber")
  private val phoneNumberValue: String = "01234 567890"

  def enterPhoneNumber(): Unit = {
    onPage()
    sendKeys(textInputField, phoneNumberValue)
    clickButtonByText(buttonSaveAndContinue)
  }
}