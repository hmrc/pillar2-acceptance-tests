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

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.asa.{ASAConfirmationPage, ASAIndividualKBPage, ASANoMatchErrorPage, ASANotAuthorisedPage, ASAOrganisationKBPage, ASAPillar2InputPage}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._

class SubAgentUserSpec extends BaseSpec with Matchers {

  Feature("Pillar2 submission Agent User Journey") {

    Scenario("1 - Agent user uses incorrect PLRId and is taken to the not authorised page") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674",
        "pillar2-auth"
      )

      When("The agent enters XMPLR0123456789 as the client's PLRId")
      ASAPillar2InputPage.enterPLR2Id("XMPLR0123456789")
      ASAConfirmationPage.continueToNextPage()

      And("The agent is taken to the not authorised page")
      ASANotAuthorisedPage.onPage()
    }

    Scenario("2 - Agent user uses incorrect PLRId and is taken to the no match page") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674",
        "pillar2-auth"
      )

      When("The agent enters XEPLR0123456500 as the client's PLRId")
      ASAPillar2InputPage.enterPLR2Id("XEPLR0123456500")

      And("The agent is taken to the no match page")
      ASANoMatchErrorPage.onPage()
    }

    Scenario("3 - Individual tries to access Agent service and is taken to unauthorised page") {
      Given("Individual User logs in to register for Pillar2 Agent service")
      givenXLogsInToRegisterForPillar2AgentService("Individual User")

      Then("The user should be taken to the ASA Individual unauthorised Page")
      ASAIndividualKBPage.onPage()
    }

    Scenario("4 - Organisation tries to access Agent service and is taken to unauthorised page") {
      Given("Organisation User logs in to register for Pillar2 Agent service")
      givenXLogsInToRegisterForPillar2AgentService("Organisation User")

      Then("The user should be taken to the ASA Individual unauthorised Page")
      ASAOrganisationKBPage.onPage()

    }
  }
}
