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

import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.specs.tags.*

class AgentSpec extends BaseSpec {

  Feature("Agent user journeys") {

    Scenario(
      "1 - Agent Pillar2 ID not matching",
      AcceptanceTests
    ) {

      Given("Agent User logs in with existing entity group")
      login(
        userType = "Agent",
        page = "asa",
        enrolment = Some(
          Enrolment(
            key = "HMRC-AS-AGENT",
            name = "AgentReference",
            value = "1234"
          )
        ),
        delegatedEnrolments = Seq(
          DelegatedEnrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent enters an incorrect client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XEPLR0123456500")

      Then("The agent is presented with the no match error page and returns to PLRId page")
      ASANoMatchErrorPage.clickLink(ASANoMatchErrorPage.plrIDLink)
      ASAPillar2InputPage.onPage()
    }

    Scenario(
      "2 - Agent user Not Authorised Page",
      AcceptanceTests
    ) {

      Given("Agent User logs in with existing entity group")
      login(
        userType = "Agent",
        page = "asa",
        enrolment = Some(
          Enrolment(
            key = "HMRC-AS-AGENT",
            name = "AgentReference",
            value = "1234"
          )
        ),
        delegatedEnrolments = Seq(
          DelegatedEnrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent enters an incorrect client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XMPLR0123456789")
      ASAConfirmationPage.continueToNextPage()

      Then("The agent is presented with the not authorised error page")
      ASANotAuthorisedPage.clickLink(ASANotAuthorisedPage.requestAuthLink)
      ASAHomePage.onPage()
    }

  }

  Scenario(
    "3 - Verify Agent can switch clients",
    AcceptanceTests
  ) {

    Given("Agent User logs in with existing entity group")
    login(
      userType = "Agent",
      page = "asa",
      enrolment = Some(
        Enrolment(
          key = "HMRC-AS-AGENT",
          name = "AgentReference",
          value = "1234"
        )
      ),
      delegatedEnrolments = Seq(
        DelegatedEnrolment(
          key = "HMRC-PILLAR2-ORG",
          name = "PLRID",
          value = "XMPLR0000000122",
          authRule = "pillar2-auth"
        ),
        DelegatedEnrolment(
          key = "HMRC-PILLAR2-ORG",
          name = "PLRID",
          value = "XMPLR0012345674",
          authRule = "pillar2-auth"
        )
      )
    )

    Then("The agent provides a client PLRId")
    ASAPillar2InputPage.enterPLR2Id("XMPLR0000000122")
    ASAConfirmationPage.continueToNextPage()

    Then("The agent checks the client PLRId")
    DashboardPage.shouldShowClientId("XMPLR0000000122")

    And("The agent provides a different client PLRId")
    DashboardPage.clickChangeClientLink()
    ASAPillar2InputPage.enterPLR2Id("XMPLR0012345674")
    ASAConfirmationPage.continueToNextPage()

    Then("The agent checks the new client PLRId is correct")
    DashboardPage.shouldShowClientId("XMPLR0012345674")
  }
}
