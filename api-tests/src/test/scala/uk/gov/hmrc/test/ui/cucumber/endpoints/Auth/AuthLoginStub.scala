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

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._

object AuthLoginStub {

  def loginClientUsingAuthLoginStub(affinityGroup: String, nino: String, mtditid: String): Unit = {

    navigateTo(authLoginStubUrl)

    findElementByName("affinityGroup").sendKeys(affinityGroup)
    findElementByName("credentialStrength").sendKeys("Strong")
    findElementByName("redirectionUrl").sendKeys(oauthAuthorizeUrl)
    new Select(findElementByName("confidenceLevel")).selectByVisibleText(confidenceLevel.toString)
    if (affinityGroup == AffinityGroup.Individual) {
      findElementByName("nino").sendKeys(nino)
    }
    findElementByName(s"enrolment[0].name").sendKeys("HMRC-MTD-IT")
    findElementByName(s"enrolment[0].taxIdentifier[0].name").sendKeys("MTDITID")
    findElementByName(s"enrolment[0].taxIdentifier[0].value").sendKeys(mtditid)
    findElementByName(s"enrolment[0].state").sendKeys("Activated")

    findElementById("submit").click()
  }

  def loginAgentUsingAuthLoginStub(arn: String): Unit = {

    navigateTo(authLoginStubUrl)

    findElementByName("redirectionUrl").sendKeys(oauthAuthorizeUrl)
    findElementByName("credentialStrength").sendKeys("Strong")
    findElementByName("affinityGroup").sendKeys(AffinityGroup.Agent)
    findElementByName(s"enrolment[0].name").sendKeys("HMRC-AS-AGENT")
    findElementByName(s"enrolment[0].taxIdentifier[0].name").sendKeys("AgentReferenceNumber")
    findElementByName(s"enrolment[0].taxIdentifier[0].value").sendKeys(arn)
    findElementByName(s"enrolment[0].state").sendKeys("Activated")

    findElementById("submit").click()
  }

}
