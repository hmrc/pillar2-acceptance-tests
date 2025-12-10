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

import uk.gov.hmrc.test.ui.helper.Nav
import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.dueAndOverdueReturns.*
import uk.gov.hmrc.test.ui.pages.submissionHistory.*
import uk.gov.hmrc.test.ui.specs.tags.*

class SubmissionHistoryDueOverdueReturnsSpec extends BaseSpec {

  Feature("Pillar2 Due & Overdue returns And Submission History User Journey") {

    Scenario("1 - Org User navigates to Due & Overdue returns and Submission History", AcceptanceTests) {

      Given("Organisation User logs in with existing entity group")

      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XEPLR5555555555"
          )
        )
      )

      Then("The user successfully checks all due and overdue returns")
      DashboardPage.clickDueAndOverdueReturnsLink()
      DueAndOverdueReturnsPage.onPage()

      Then("The user can view and click on view submission history and the Pillar2 Top-up Taxes guidance link ")
      DueAndOverdueReturnsPage.clickLink(DueAndOverdueReturnsPage.submissionHistoryLink)
      SubmissionHistoryPage.onPage()
      Nav.browserBack()
      DueAndOverdueReturnsPage.clickLink(DueAndOverdueReturnsPage.pillar2TopupTaxesLink)
      Nav.browserBack()
      DueAndOverdueReturnsPage.onPage()
    }

    Scenario("2 - Agent User navigates to Submission History and Due & Overdue returns", AcceptanceTests) {

      Given("Agent User logs in to Pillar2 service with delegated enrollment")
      login(
        userType = "Agent",
        pageUrl = "asa",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-AS-AGENT",
            identifierName = "AgentReference",
            identifierValue = "1234"
          )
        ),
        delegatedEnrolment = Some(
          DelegatedEnrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XMPLR0012345674")
      ASAConfirmationPage.continueToNextPage()

      Then("The agent successfully checks submission history")
      DashboardPage.clickSubmissionHistoryLink()
      SubmissionHistoryPage.onPage()

      Then("The agent successfully checks all due and overdue returns")
      SubmissionHistoryPage.clickLink(SubmissionHistoryPage.dueAndOverdueReturnsLink)
      DueAndOverdueReturnsPage.onPage()

      Then("The user can view and click on the Pillar2 Top-up Taxes guidance link on Due and overdue returns")
      DueAndOverdueReturnsPage.clickLink(DueAndOverdueReturnsPage.pillar2TopupTaxesLink)
      Nav.browserBack()
      DueAndOverdueReturnsPage.onPage()

    }
  }
}
