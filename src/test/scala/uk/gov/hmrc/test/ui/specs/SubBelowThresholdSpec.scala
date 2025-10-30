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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._

class SubBelowThresholdSpec extends BaseSpec with Matchers {

  Feature("Pillar2 submission Below threshold notification user journeys") {

    Scenario("1 - Org User makes successful below threshold notification submission") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999991"
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

    Scenario("2 - Agent User makes successful below threshold notification submission") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )
      And("The agent adds delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999991",
        "pillar2-auth"
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

    Scenario("3 - Org User updates below threshold notification accounting period dates") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999991"
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

    Scenario("4 - Org User changes below threshold notification entity location and gets KB page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999991"
      )

      Then("The user changes the below threshold notification entity to being based only in the UK")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkNo()

      When("The user is presented with the amend group details page")
      BtnAgdKBPage.onPage()
    }

    Scenario("5 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4220000000 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR4220000000"
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

    Scenario("6 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR4000000000"
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

    Scenario("7 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5000000000 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR5000000000"
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
  }
}
