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
import uk.gov.hmrc.test.ui.pages.btn.*
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.specs.tags.*

class BTNSubmissionSpec extends BaseSpec {

  Feature("Below threshold notification successful submission user journeys") {

    Scenario("1 - Org User makes successful below threshold notification submission",
      AcceptanceTests
    ) {

      Given("Org User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
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
      BtnDomesticOrMnePage.selectRadioEntityMultinational()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.browserBack()
      BtnCannotReturnPage.onPage()
    }

    Scenario("2 - Agent User makes successful below threshold notification submission",
      AcceptanceTests
    ) {

      Given("Agent User logs in to Pillar2 service with delegated enrollment")
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
            value = "XEPLR9999999991",
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
      BtnDomesticOrMnePage.selectRadioEntityMultinational()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)

      Then("The user clicks the back button and is presented with the cannot return page")
      BtnConfirmationPage.browserBack()
      BtnCannotReturnPage.onPage()
    }

    Scenario(
      "3 - Agent User makes successful BTN submission for current accounting period of multiple accounting periods",
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
            value = "XEPLR9999999994",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XEPLR9999999994")
      ASAConfirmationPage.continueToNextPage()

      Then("The agent starts a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()

      And("The agent selects the current accounting period")
      BtnMultipleAccountingPage.selectRadioCurrentAccountingPeriod()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.selectRadioEntityMultinational()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is on the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)
    }

    Scenario(
      "4 - Agent User makes successful BTN submission for previous accounting period of multiple accounting periods",
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
            value = "XEPLR9999999994",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XEPLR9999999994")
      ASAConfirmationPage.continueToNextPage()

      Then("The agent starts a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()

      And("The agent selects the previous accounting period")
      BtnMultipleAccountingPage.selectRadioPreviousAccountingPeriod()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.selectRadioEntityMultinational()
      BtnCyaSubmitPage.onPageSubmitById()

      When("The user is on the Below-Threshold Notification successful confirmation page")
      BtnConfirmationPage.onPage(timeoutSeconds = 10)
    }
  }
}
