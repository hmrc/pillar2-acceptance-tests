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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.asa._
import uk.gov.hmrc.test.ui.pages.btn._
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests

class BTNSubmissionSpec extends BaseSpec {

  Feature("Below threshold notification successful submission user journeys") {

    Scenario("1 - Org User makes successful below threshold notification submission", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XEPLR9999999991"
          )
        )
      )

      Then("The user submits a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkYes()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.clickBackButton()
      BtnCannotReturnPage.onPage()
    }

    Scenario("2 - Agent User makes successful below threshold notification submission", AcceptanceTests) {
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
            identifierValue = "XEPLR9999999991",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XEPLR9999999991")
      ASAConfirmationPage.continueToNextPage()

      Then("The agent submits a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkYes()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.clickBackButton()
      BtnCannotReturnPage.onPage()
    }
  }
}
