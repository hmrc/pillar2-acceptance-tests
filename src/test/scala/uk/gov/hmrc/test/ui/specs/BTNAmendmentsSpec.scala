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
import uk.gov.hmrc.test.ui.pages.btn.*
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.manage.*
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests

class BTNAmendmentsSpec extends BaseSpec {

  Feature("Below threshold notification amendments user journeys") {

    Scenario("1 - Org User updates below threshold notification accounting period dates", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR9999999991"
          )
        )
      )

      Then("The user navigates to the summary page")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.clickAccountDetailsSummaryLink()

      And("The user updates the dates of the accounting period")
      ManageAccountsSummaryPage.clickChangeAccountingPeriodLink()
      BtnAccountingPage.updateDates()
      ManageAccountsSummaryPage.continueToNextPage()

      When("The user is taken back to the dashboard")
      DashboardPage.onPage()
    }

    Scenario("2 - Org User changes below threshold notification entity location and gets KB page", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR9999999991"
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

    Scenario("3 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR4220000000"
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
      BtnProblemWithServicePage.onPage(timeoutSeconds = 5)
    }

    Scenario("4 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "btn",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR4000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }

    Scenario("5 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "btn",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR5000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }
  }
}
