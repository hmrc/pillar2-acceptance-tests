/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specs

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{Enrolment, login}
import uk.gov.hmrc.test.ui.pages.rfm.*
import uk.gov.hmrc.test.ui.specs.tags.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*

class RFMKBSpec extends BaseSpec {

  Feature("RFM Start page") {

    Scenario(
      "1 - Individual RFM KB journey",
      AcceptanceTests
    ) {

      Given("Individual User logs into RFM")
      login(
        userType = "Individual",
        page = "rfm"
      )

      Then("The individual is taken to the individual kb page")
      RFMKBIndividualPage.onPage()
    }

    Scenario(
      "2 - Agent RFM KB journey",
      AcceptanceTests
    ) {

      Given("Agent User logs into RFM")
      login(
        userType = "Agent",
        credRole = "Assistant",
        page = "rfm"
      )

      Then("The agent is taken to the individual kb page")
      RFMKBAgentPage.onPage()
    }

    Scenario(
      "3 - Verify Organisation Assistant User RFM KB page",
      AcceptanceTests
    ) {

      Given("Assistant User logs into RFM")
      login(
        userType = "Organisation",
        credRole = "Assistant",
        page = "rfm"
      )

      Then("The assistant is taken to the individual kb page")
      RFMKBAssistantUserPage.onPage()
    }

    Scenario(
      "4 - Verify already enrolled Organisation User KB page",
      AcceptanceTests
    ) {

      Given("Organisation User logs in with existing entity group")

      login(
        userType = "Organisation",
        page = "rfm",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674"
          )
        )
      )

      Then("The user is taken to the duplicate registration kb page")
      RFMKBDuplicatePage.onPage()
    }

    Scenario("5 - Existing FM (with same group id) accesses RFM journey and is redirected to KB page",
      AcceptanceTests
    ) {

      Given("I clear the cache")
      thenIClearTheCache()

      And("Organisation User logs in with a groupId")
      login(
        userType = "Organisation",
        page = "rfm",
        groupId = "879D6270-E9C2-4092-AC91-21C61B69D1E7"
      )

      And("The user enters PRLId")
      RFMEnterPillar2IdPage.enterText("XMPLR0123456789")

      Then("The user is taken to the existing member kb page")
      RFMKBExistingMemberPage.onPage()
    }
  }
}
