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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.{Find, Input, Nav, PageObject}

object AuthLoginPage extends BasePage with PageObject {
  val url: String              = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String      = TestConfiguration.url("pillar2-frontend")
  val redirectUrlField: String = "redirectionUrl"

  def loginWithUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginAsInd(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    clickSubmitButton
  }

  def loginAssistant(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant
    clickSubmitButton
  }

  private def selectAffinityGroupOrg() =
    new Select(findAffinityGroup()).selectByVisibleText("Organisation")

  private def selectCredRoleAssistant() =
    new Select(findCredentialRole()).selectByVisibleText("Assistant")

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  private def findCredentialRole() = Find.findByName("credentialRole")

  def clickSubmitButton = Find.findById("submit").click()

}
