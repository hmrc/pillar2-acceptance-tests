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
import uk.gov.hmrc.test.ui.specs.tags.{AcceptanceTests, ZapAccessibility}
import uk.gov.hmrc.test.ui.specsdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.DueOverdueStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.andIAmOnFeedbackSurveyPage

class SubBelowThresholdSpec extends BaseSpec with Matchers {

  Feature("Pillar2 submission Below threshold notification user journey") {

//TODO ADD 4 LINES - PIL-2323

//    Scenario("4 - Agent User navigates to BTN Accounting Period Page",AcceptanceTests,ZapAccessibility) {
//      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Agent",
//        "HMRC-AS-AGENT",
//        "AgentReference",
//        "1234"
//      )
//
//      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
//      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR9999999991",
//        "pillar2-auth"
//      )
//
//      Then("I should be on ASA Pillar2 Input Page")
//      thenIShouldBeOn("ASA Pillar2 Input Page")
//
//      And("I provide ASA Pillar2 ID as XEPLR9999999991")
//      andIProvideASAAs("Pillar2 ID", "XEPLR9999999991")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to ASA Confirmation Page")
//      thenIShouldNavigateTo("ASA Confirmation Page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      And("I click Submit a Below-Threshold Notification link")
//      andIClickLink("Submit a Below-Threshold Notification")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Accounting Period Page")
//      thenIShouldNavigateTo("BTN Accounting Period Page")
//
////      TODO: Need to clarify correct navigation based on outcome of PIL-2323
////        When I click Report Pillar 2 Top-up Taxes link
////        Then I should be navigated to P2 ASA Home Page of Pillar2 Submission
////        When I select back link
////        Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
//
//      When("I click Sign out link")
//      andIClickLink("Sign out")
//
//      Then("I am on feedback survey page")
//      andIAmOnFeedbackSurveyPage()
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//    }

    // TODO - XEPLR4000000000,XEPLR5000000000(need to deleted, check PIL-2449)

//    Scenario("10 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]",AcceptanceTests,ZapAccessibility) {
//      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Organisation",
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR4000000000"
//      )
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      And("I click Submit a Below-Threshold Notification link")
//      andIClickLink("Submit a Below-Threshold Notification")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Accounting Period Page")
//      thenIShouldNavigateTo("BTN Accounting Period Page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Domestic or MNE Page")
//      thenIShouldNavigateTo("BTN Domestic or MNE Page")
//
//      When("I select option Yes and continue on Pillar2 submission")
//      andISelectOptionAndContinueOnPillar2Submission("Yes")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Problem with service Page")
//      thenIShouldNavigateTo("BTN Problem with service Page")
//
//      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
//      andIClickLink("Return to your account homepage to submit a Below-Threshold Notification again")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//    }
//
//    Scenario("10 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]", AcceptanceTests,ZapAccessibility) {
//      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5000000000 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Organisation",
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR5000000000"
//      )
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      And("I click Submit a Below-Threshold Notification link")
//      andIClickLink("Submit a Below-Threshold Notification")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Accounting Period Page")
//      thenIShouldNavigateTo("BTN Accounting Period Page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Domestic or MNE Page")
//      thenIShouldNavigateTo("BTN Domestic or MNE Page")
//
//      When("I select option Yes and continue on Pillar2 submission")
//      andISelectOptionAndContinueOnPillar2Submission("Yes")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Problem with service Page")
//      thenIShouldNavigateTo("BTN Problem with service Page")
//
//      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
//      andIClickLink("Return to your account homepage to submit a Below-Threshold Notification again")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//    }

    // TODO - XEPLR4000000000,XEPLR5000000000(need to deleted, check PIL-2449)

//    Scenario("11 - Agent User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]", AcceptanceTests,ZapAccessibility) {
//      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Agent",
//        "HMRC-AS-AGENT",
//        "AgentReference",
//        "1234"
//      )
//
//      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4000000000 and pillar2-auth for Pillar2 service")
//      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR4000000000",
//        "pillar2-auth"
//      )
//
//      Then("I should be on ASA Pillar2 Input Page")
//      thenIShouldBeOn("ASA Pillar2 Input Page")
//
//      And("I provide ASA Pillar2 ID as XEPLR4000000000")
//      andIProvideASAAs("Pillar2 ID", "XEPLR4000000000")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to ASA Confirmation Page")
//      thenIShouldNavigateTo("ASA Confirmation Page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//      And("I click Submit a Below-Threshold Notification link")
//      andIClickLink("Submit a Below-Threshold Notification")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Accounting Period Page")
//      thenIShouldNavigateTo("BTN Accounting Period Page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Domestic or MNE Page")
//      thenIShouldNavigateTo("BTN Domestic or MNE Page")
//
//      When("I select option Yes and continue on Pillar2 submission")
//      andISelectOptionAndContinueOnPillar2Submission("Yes")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Problem with service Page")
//      thenIShouldNavigateTo("BTN Problem with service Page")
//
//      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
//      andIClickLink("Return to your account homepage to submit a Below-Threshold Notification again")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//    }
//
//    Scenario("11 - Agent User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]", AcceptanceTests,ZapAccessibility) {
//      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Agent",
//        "HMRC-AS-AGENT",
//        "AgentReference",
//        "1234"
//      )
//
//      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5000000000 and pillar2-auth for Pillar2 service")
//      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR5000000000",
//        "pillar2-auth"
//      )
//
//      Then("I should be on ASA Pillar2 Input Page")
//      thenIShouldBeOn("ASA Pillar2 Input Page")
//
//      And("I provide ASA Pillar2 ID as XEPLR5000000000")
//      andIProvideASAAs("Pillar2 ID", "XEPLR5000000000")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to ASA Confirmation Page")
//      thenIShouldNavigateTo("ASA Confirmation Page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//      And("I click Submit a Below-Threshold Notification link")
//      andIClickLink("Submit a Below-Threshold Notification")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Accounting Period Page")
//      thenIShouldNavigateTo("BTN Accounting Period Page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Domestic or MNE Page")
//      thenIShouldNavigateTo("BTN Domestic or MNE Page")
//
//      When("I select option Yes and continue on Pillar2 submission")
//      andISelectOptionAndContinueOnPillar2Submission("Yes")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to BTN Problem with service Page")
//      thenIShouldNavigateTo("BTN Problem with service Page")
//
//      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
//      andIClickLink("Return to your account homepage to submit a Below-Threshold Notification again")
//
//      Then("I should navigate to Dashboard page")
//      thenIShouldNavigateTo("Dashboard page")
//
//    }

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

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

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

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

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

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999994",
        "pillar2-auth"
      )

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

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999992 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999992",
        "pillar2-auth"
      )

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

    Scenario("16 - Org user navigates to Under Enquiry Page when BTN submission is attempted with enquiry flag true", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999995 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999995"
      )

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

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      When("I click Select different accounting period link")
      andIClickLink("Select different accounting period")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriod")
      thenISelectPreviousAccountingPeriod()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Under Enquiry Page")
      thenIShouldNavigateTo("BTN Under Enquiry Page")

      And("I select back link")
      andISelectBackLink()

      And("I select PreviousAccountingPeriodUKTRSubmitted")
      whenISelectPreviousAccountingPeriodUKTRSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Under Enquiry Page")
      thenIShouldNavigateTo("BTN Under Enquiry Page")

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

      Then("I should navigate to BTN Confirmation Page")
      thenIShouldNavigateTo("BTN Confirmation Page")

      When("I click Back to group’s homepage link")
      andIClickLink("Back to group’s homepage")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")


    }

    Scenario("17 - Agent user navigates to Under Enquiry Page when BTN submission is attempted with enquiry flag true", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR9999999995",
        "pillar2-auth"
      )

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR9999999995")
      andIProvideASAAs("Pillar2 ID", "XEPLR9999999995")

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

      Then("I should navigate to BTN Accounting Period Page")
      thenIShouldNavigateTo("BTN Accounting Period Page")

      When("I click Select different accounting period link")
      andIClickLink("Select different accounting period")

      Then("I should navigate to BTN Multiple Accounting Period Page")
      thenIShouldNavigateTo("BTN Multiple Accounting Period Page")

      And("I select PreviousAccountingPeriod")
      thenISelectPreviousAccountingPeriod()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Under Enquiry Page")
      thenIShouldNavigateTo("BTN Under Enquiry Page")

      And("I select back link")
      andISelectBackLink()

      And("I select PreviousAccountingPeriodUKTRSubmitted")
      whenISelectPreviousAccountingPeriodUKTRSubmitted()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to BTN Under Enquiry Page")
      thenIShouldNavigateTo("BTN Under Enquiry Page")

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

      Then("I should navigate to BTN Confirmation Page")
      thenIShouldNavigateTo("BTN Confirmation Page")


    }
  }

}
