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

object ContactAddressInputPage extends BasePage {
  val url: String = s"$baseUrl" + "contact-details/input-address"

  override val countryDropdown: By = By.id("countryCode")
  override val countryOption: By   = By.id("countryCode__option--0")

  private val addressLine1: By = By.id("addressLine1")
  private val addressLine2: By = By.id("addressLine2")
  private val city: By         = By.id("addressLine3")
  private val region: By       = By.id("addressLine4")
  private val postcode: By     = By.id("postalCode")

  def enterAddressUK(): Unit = {
    onPage()
    sendKeys(addressLine1, "Test Street")
    sendKeys(addressLine2, "Test Town")
    sendKeys(city, "Test City")
    sendKeys(region, "Test Region")
    sendKeys(postcode, "AA1 1AA")
    countryAutoSelect("United Kingdom")
    clickButtonByText(buttonSaveAndContinue)
  }

  def updateAddressUK(): Unit = {
    onPage(s"$baseUrl" + "contact-details/change-input-address")
    sendKeys(city, "Updated Test City")
    clickButtonByText(buttonSaveAndContinue)
  }
}
