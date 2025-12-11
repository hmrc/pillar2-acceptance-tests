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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.login
import uk.gov.hmrc.test.ui.pages.unauthorisedAffinity.*
import uk.gov.hmrc.test.ui.specs.tags.*

class UnauthorisedAffinitySpec extends BaseSpec {

  Feature("Failure scenarios with different Affinity groups") {

    Scenario(
      "1 - User logins as Assistant and is taken to unauthorised page",
      AcceptanceTests
    ) {

      Given("Assistant logs in to register for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "pillar2-frontend",
        credRole = "Assistant"
      )

      Then("The user should be taken to the Assistant unauthorised page")
      UnauthorisedAffinityAssistantPage.onPage()

    }

    Scenario(
      "2 - User logins as Agent and is taken to unauthorised page",
      AcceptanceTests
    ) {

      Given("Agent logs in to register for Pillar2")
      login(
        userType = "Agent",
        pageUrl = "pillar2-frontend"
      )

      Then("The user should be taken to the Agent unauthorised page")
      UnauthorisedAffinityAgentPage.onPage()
    }

    Scenario(
      "3 - User logs in as an Individual and is taken to unauthorised page",
      AcceptanceTests
    ) {

      Given("Individual logs in to register for Pillar2")
      login(
        userType = "Individual",
        pageUrl = "pillar2-frontend"
      )

      Then("The user should be taken to the Individual unauthorised page")
      UnauthorisedAffinityIndividualPage.onPage()
    }

    Scenario(
      "4 - Individual tries to access Agent service and is taken to unauthorised page",
      AcceptanceTests
    ) {

      Given("Individual User logs in to Pillar2 Agent service")
      login(
        userType = "Individual",
        pageUrl = "asa"
      )

      Then("The user should be taken to the ASA Individual unauthorised Page")
      UnauthorisedAffinityASAIndividualPage.onPage()
    }

    Scenario(
      "5 - Organisation tries to access Agent service and is taken to unauthorised page",
      AcceptanceTests
    ) {

      Given("Organisation User logs in to Pillar2 Agent service")
      login(
        userType = "Organisation",
        pageUrl = "asa"
      )

      Then("The user should be taken to the ASA Organisation unauthorised Page")
      UnauthorisedAffinityASAOrganisationPage.onPage()
    }
  }
}
