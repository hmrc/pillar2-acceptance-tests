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

import uk.gov.hmrc.test.ui.pages.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.btn._
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests

class BTNAmendmentsSpec extends BaseSpec {

  Feature("Below threshold notification amendments user journeys") {

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
      BtnConfirmationPage.onPage()

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.clickBackButton()
      BtnCannotReturnPage.onPage()
    }

    Scenario("2 - Agent User makes successful below threshold notification submission", AcceptanceTests) {
      Given("Agent User logs in to Pillar2 service with delegated enrolment")
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
      BtnConfirmationPage.onPage()

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.clickBackButton()
      BtnCannotReturnPage.onPage()
    }

    Scenario("3 - Org User updates below threshold notification accounting period dates", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR9999999991"
          )
        )
      )

      Then("The user navigates to the summary page")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.clickAccountDetailsSummaryLink()

      And("The user updates the dates of the accounting period")
      AccountsSummaryPage.clickChangeAccountingPeriodLink()
      BtnAccountingPage.updateDates()
      AccountsSummaryPage.continueToNextPage()

      When("The user is taken back to the dashboard")
      DashboardPage.onPage()
    }

    Scenario("4 - Org User changes below threshold notification entity location and gets KB page", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR9999999991"
          )
        )
      )

      Then("The user changes the below threshold notification entity to being based only in the UK")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkNo()

      When("The user is presented with the amend group details page")
      BtnAgdKBPage.onPage()
    }

    Scenario("5 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR4220000000"
          )
        )
      )

      Then("The user submits a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkYes()
      BtnCyaSubmitPage.onPageSubmitById()

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }

    Scenario("6 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "btn",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR4000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }

    Scenario("7 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "btn",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR5000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }
  }
}
