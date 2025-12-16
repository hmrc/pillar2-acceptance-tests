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
import uk.gov.hmrc.test.ui.pages.AuthLoginOldPage.*
import uk.gov.hmrc.test.ui.specs.tags.{AcceptanceTests, ZapAccessibility}
import uk.gov.hmrc.test.ui.specsdef.ASAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.DueOverdueStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.andIAmOnFeedbackSurveyPage

class SubBelowThresholdSpec extends BaseSpec with Matchers {

  Feature("Pillar2 submission Below threshold notification user journey") {

    Scenario(
      "12 - Agent User navigates to BTN multiple accounting period for current accounting period to check amend group details",
      AcceptanceTests,
      ZapAccessibility
    ) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
      andIProvideASAAs("Pillar2 ID", "XEPLR9999999994")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Submit a Below-Threshold Notification link")
      andIClickLink("Submit a Below-Threshold Notification")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to BTN Start Page")
      thenIShouldNavigateTo("BTN Start Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select CurrentAccountingPeriod")
      whenISelectCurrentAccountingPeriod()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click update the group’s accounting period dates link")
      andIClickLink("update the group’s accounting period dates")

      Then("I should be on accounts summary page")
      thenIShouldBeOn("accounts summary page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Domestic or MNE Page")
      thenIShouldNavigateTo("BTN Domestic or MNE Page")

      When("I select option No and continue on Pillar2 submission")
      andISelectOptionAndContinueOnPillar2Submission("No")

      Then("I should navigate to BTN AGD KB Page")
      thenIShouldNavigateTo("BTN AGD KB Page")

      When("I click Amend group details link")
      andIClickLink("Amend group details")

      Then("I should be on accounts summary page")
      thenIShouldBeOn("accounts summary page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      Then("I am on feedback survey page")
      andIAmOnFeedbackSurveyPage()

    }

    Scenario("13 - Agent User navigates to submit BTN multiple accounting period for current accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
      andIProvideASAAs("Pillar2 ID", "XEPLR9999999994")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Submit a Below-Threshold Notification link")
      andIClickLink("Submit a Below-Threshold Notification")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select CurrentAccountingPeriod")
      whenISelectCurrentAccountingPeriod()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click Select different accounting period link")
      andIClickLink("Select different accounting period")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select CurrentAccountingPeriod")
      whenISelectCurrentAccountingPeriod()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Domestic or MNE Page")
      thenIShouldNavigateTo("BTN Domestic or MNE Page")

      When("I select option Yes and continue on Pillar2 submission")
      andISelectOptionAndContinueOnPillar2Submission("Yes")

      Then("I should navigate to BTN CYA Submit Page")
      thenIShouldNavigateTo("BTN CYA Submit Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Confirmation Page")
      thenIShouldNavigateTo("BTN Confirmation Page")

    }

    Scenario("14 - Agent User navigates to BTN multiple accounting period for previous accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
      andIProvideASAAs("Pillar2 ID", "XEPLR9999999994")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Submit a Below-Threshold Notification link")
      andIClickLink("Submit a Below-Threshold Notification")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriodUKTRSubmitted")
      whenISelectPreviousAccountingPeriodUKTRSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I click Return to homepage link")
      andIClickLink("Return to homepage")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriodBTNSubmitted")
      whenISelectPreviousAccountingPeriodBTNSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I click Return to homepage link")
      andIClickLink("Return to homepage")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriodBTNSubmitted")
      whenISelectPreviousAccountingPeriodBTNSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I select back link")
      andISelectBackLink()

      And("I select PreviousAccountingPeriodUKTRSubmitted")
      whenISelectPreviousAccountingPeriodUKTRSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Domestic or MNE Page")
      thenIShouldNavigateTo("BTN Domestic or MNE Page")

      When("I select option Yes and continue on Pillar2 submission")
      andISelectOptionAndContinueOnPillar2Submission("Yes")

      Then("I should navigate to BTN CYA Submit Page")
      thenIShouldNavigateTo("BTN CYA Submit Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

    }

    Scenario("15- Agent User navigates to BTN Two accounting period for previous and current period.", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999992 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999992",
        "pillar2-auth"
      )

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR9999999992")
      andIProvideASAAs("Pillar2 ID", "XEPLR9999999992")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Submit a Below-Threshold Notification link")
      andIClickLink("Submit a Below-Threshold Notification")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to BTN Start Page")
      thenIShouldNavigateTo("BTN Start Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select CurrentAccountingPeriod")
      whenISelectCurrentAccountingPeriod()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Select different accounting period link")
      andIClickLink("Select different accounting period")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriod")
      thenISelectPreviousAccountingPeriod()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")
    }
  }
}
