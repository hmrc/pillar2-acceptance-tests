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

package uk.gov.hmrc.test.ui.specsmap

import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.DueOverdueStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._

class SubBelowThresholdSpec extends AnyFeatureSpec with Matchers {

  Feature("Pillar2 submission Below threshold notification user journey") {

    Scenario("1 - Org User navigates to below threshold notification pages") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Start Page")
        thenIShouldNavigateToX("BTN Start Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click update your group’s accounting period dates link")
        andIClickXLink("update your group’s accounting period dates")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("No")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Amend group details link")
        andIClickXLink("Amend group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("2 - Agent User navigates to below threshold notification pages") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999991")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999991")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Start Page")
        thenIShouldNavigateToX("BTN Start Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click update the group’s accounting period dates link")
        andIClickXLink("update the group’s accounting period dates")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("No")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Amend group details link")
        andIClickXLink("Amend group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPEStepsSteps.scala) pattern: I am on feedback survey page

    }

    Scenario("3 - Org User navigates to BTN Accounting Period Page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I navigate back to BTN Return Submission KB Page")
        andINavigateBackToBTNReturnSubmissionKBPage()  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPEStepsSteps.scala) pattern: I am on feedback survey page

    }

    Scenario("4 - Agent User navigates to BTN Accounting Period Page") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999991")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999991")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPEStepsSteps.scala) pattern: I am on feedback survey page

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("5 - Agent User navigates to below threshold notification CYA page and change pages") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999991")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999991")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Domestic or Mne")
        andIClickOnChangeHyperlinkNextToTheX("Domestic or Mne")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - Agent User navigates to below threshold notification CYA page and change pages with KB pages") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999991")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999991")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Domestic or Mne")
        andIClickOnChangeHyperlinkNextToTheX("Domestic or Mne")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I select option No and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("No")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("7 - Org User navigates to below threshold notification CYA page and change pages") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Domestic or Mne")
        andIClickOnChangeHyperlinkNextToTheX("Domestic or Mne")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("8 - Org User navigates to below threshold notification CYA page and change pages with KB pages") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Domestic or Mne")
        andIClickOnChangeHyperlinkNextToTheX("Domestic or Mne")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I select option No and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("No")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Back to group’s homepage link")
        andIClickXLink("Back to group’s homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("9 - Org User navigates to KB page, if user click browser back after successful BTN submission") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999991")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Cannot Return Page")
        thenIShouldNavigateToX("BTN Cannot Return Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Cannot Return Page")
        thenIShouldNavigateToX("BTN Cannot Return Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your group’s homepage link")
        andIClickXLink("Return to your group’s homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("10 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4220000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4220000000")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("10 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4000000000")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("10 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5000000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR5000000000")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("11 - Agent User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4220000000 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4220000000", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR4220000000")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR4220000000")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("11 - Agent User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4000000000 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4000000000", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR4000000000")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR4000000000")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("11 - Agent User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5000000000 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR5000000000", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR5000000000")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR5000000000")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Problem with service Page")
        thenIShouldNavigateToX("BTN Problem with service Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to submit a Below-Threshold Notification again link")
        andIClickXLink("Return to your account homepage to submit a Below-Threshold Notification again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("12 - Agent User navigates to BTN multiple accounting period for current accounting period to check amend group details") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999994", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999994")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Start Page")
        thenIShouldNavigateToX("BTN Start Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select CurrentAccountingPeriod")
        whenISelectCurrentAccountingPeriod()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click update the group’s accounting period dates link")
        andIClickXLink("update the group’s accounting period dates")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("No")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN AGD KB Page")
        thenIShouldNavigateToX("BTN AGD KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Amend group details link")
        andIClickXLink("Amend group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPEStepsSteps.scala) pattern: I am on feedback survey page

    }

    Scenario("13 - Agent User navigates to submit BTN multiple accounting period for current accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999994", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999994")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select CurrentAccountingPeriod")
        whenISelectCurrentAccountingPeriod()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click Select different accounting period link")
        andIClickXLink("Select different accounting period")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select CurrentAccountingPeriod")
        whenISelectCurrentAccountingPeriod()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Confirmation Page")
        thenIShouldNavigateToX("BTN Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("14 - Agent User navigates to BTN multiple accounting period for previous accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999994", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999994")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999994")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select PreviousAccountingPeriodUKTRSubmitted")
        whenISelectPreviousAccountingPeriodUKTRSubmitted()  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // thenISelectPreviousAccountingPeriod() [1.00] (CommonStepsSteps.scala) pattern: I select PreviousAccountingPeriod

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Return to homepage link")
        andIClickXLink("Return to homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select PreviousAccountingPeriodBTNSubmitted")
        whenISelectPreviousAccountingPeriodBTNSubmitted()  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // thenISelectPreviousAccountingPeriod() [1.00] (CommonStepsSteps.scala) pattern: I select PreviousAccountingPeriod

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Return to homepage link")
        andIClickXLink("Return to homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select PreviousAccountingPeriodBTNSubmitted")
        whenISelectPreviousAccountingPeriodBTNSubmitted()  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // thenISelectPreviousAccountingPeriod() [1.00] (CommonStepsSteps.scala) pattern: I select PreviousAccountingPeriod

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select PreviousAccountingPeriodUKTRSubmitted")
        whenISelectPreviousAccountingPeriodUKTRSubmitted()  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // thenISelectPreviousAccountingPeriod() [1.00] (CommonStepsSteps.scala) pattern: I select PreviousAccountingPeriod

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Domestic or MNE Page")
        thenIShouldNavigateToX("BTN Domestic or MNE Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue on Pillar2 submission")
        andISelectOptionXAndContinueOnPillar2Submission("Yes")  // auto-chosen (score=1.00, DueOverdueStepsSteps.scala)

      Then("I should navigate to BTN CYA Submit Page")
        thenIShouldNavigateToX("BTN CYA Submit Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("15- Agent User navigates to BTN Two accounting period for previous and current period.") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999992 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR9999999992", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR9999999992")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR9999999992")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Submit a Below-Threshold Notification link")
        andIClickXLink("Submit a Below-Threshold Notification")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BTN Start Page")
        thenIShouldNavigateToX("BTN Start Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select CurrentAccountingPeriod")
        whenISelectCurrentAccountingPeriod()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Select different accounting period link")
        andIClickXLink("Select different accounting period")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Multiple Accounting Period Page")
        thenIShouldNavigateToX("BTN Multiple Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select PreviousAccountingPeriod")
        thenISelectPreviousAccountingPeriod()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BTN Accounting Period Page")
        thenIShouldNavigateToX("BTN Accounting Period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
