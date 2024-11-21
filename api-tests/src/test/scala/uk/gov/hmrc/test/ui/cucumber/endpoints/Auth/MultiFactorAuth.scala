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

package uk.gov.hmrc.test.ui.cucumber.endpoints.Auth

import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._
object MultiFactorAuth {

  def completeMultiFactorAuthenticationIfRequired(): Unit = {

    val currentUrl: String = driver.getCurrentUrl

    if (currentUrl.contains(multiFactorAuthenticationUrl)) {
      findElementById("continue").click()

      confirmUrl("/registration/choose-factor")
      findElementById("factor-mobile").click()
      findElementById("continue").click()

      confirmUrl("/registration/otp/phone-number/mobile")
      findElementById("uk-phone-number-toggle-close").click()
      findElementById("phoneNumber").sendKeys("7712345678")
      findElementById("continue").click()

      confirmUrl("/registration/otp/mobile")
      val accessCodeUrl: String = driver.getCurrentUrl
      val mfaCode: String       = accessCodeUrl.split("journey/")(1).split("/registration")(0)

      navigateTo(s"$multiFactorAuthenticationUrl/test-only/journey/$mfaCode/mobile/code")
      val accessCode: String = driver.getPageSource.split("\"accessCode\":\"")(1).split("\"")(0)

      navigateTo(accessCodeUrl)
      confirmUrl("/registration/otp/mobile")
      findElementById("accessCode").sendKeys(accessCode)
      findElementById("continue").click()

      confirmUrl("/registration/success")
      findElementById("continue").click()
    }
  }

}
