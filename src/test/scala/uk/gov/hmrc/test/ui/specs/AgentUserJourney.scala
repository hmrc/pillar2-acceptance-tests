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
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.specstepdef.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._


class AgentUserJourney extends BaseSpec with Matchers {

  Feature("Agent user journeys") {

    Scenario("1 - Agent user capturing Pillar2 ID") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR0123456500")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR0123456500")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA No record Match Error Page")
        thenIShouldNavigateToX("ASA No record Match Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Re-enter your client’s Pillar 2 Top-up Taxes ID to try again link")
        andIClickXLink("Re-enter your client’s Pillar 2 Top-up Taxes ID to try again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Enter a different client’s Pillar 2 Top-up Taxes ID link")
        andIClickXLink("Enter a different client’s Pillar 2 Top-up Taxes ID")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see the PLRID field is pre-populated with XMPLR0012345674")
        // ⚠️ No step-def match found for: I should see the PLRID field is pre-populated with XMPLR0012345674

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Agent user accessing dashboard features after login") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Manage contact details link")
        andIClickXLink("Manage contact details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Email address")
        andIClickOnChangeLinkForX("Email address")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Email as updatecontact@email.com")
        andIEnterXAsX("Contact Email", "updatecontact@email.com")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Manage group details link")
        andIClickXLink("Manage group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Accounting Period")
        andIClickOnChangeHyperlinkNextToTheX("Accounting Period")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("Accounting Period End Month is entered as 12")
        andAccountingPeriodXIsEnteredAsX("End Month", "12")  // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to Manage Account processing Page or Dashboard page")
        // ⚠️ No step-def match found for: I should be redirected to Manage Account processing Page or Dashboard page

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - Agent user API failure scenarios and service banner navigation") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR0123456404")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR0123456404")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA No record Match Error Page")
        thenIShouldNavigateToX("ASA No record Match Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Manage contact details link")
        andIClickXLink("Manage contact details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Name as 400")
        andIEnterXAsX("Contact Name", "400")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Subscription API error page")
        thenIShouldNavigateToX("Subscription API error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("4 - Verify Agent service account user unauthorised pages") {
      Given("Individual User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Individual User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Individual KB Page")
        thenIShouldBeOnX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Individual KB Page")
        thenIShouldBeOnX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click request authorisation on agent services link")
        andIClickXLink("request authorisation on agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Agent services account page2")
        thenIShouldNavigateToX("Agent services account page2")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Individual KB Page")
        thenIShouldBeOnX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who can report for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Individual KB Page")
        thenIShouldNavigateToX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("5 - Verify Agent service account user unauthorised pages") {
      Given("Organisation User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Organisation KB Page")
        thenIShouldBeOnX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Organisation KB Page")
        thenIShouldBeOnX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click request authorisation on agent services link")
        andIClickXLink("request authorisation on agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Agent services account page2")
        thenIShouldNavigateToX("Agent services account page2")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Organisation KB Page")
        thenIShouldBeOnX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who can report for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("Assistant User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Assistant User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Organisation KB Page")
        thenIShouldBeOnX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - Agent user Not Authorised Page") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0123456789")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0123456789")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Not Authorised page")
        thenIShouldNavigateToX("ASA Not Authorised page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click request authorisation to report and manage this client’s Pillar 2 Top-up Taxes link")
        andIClickXLink("request authorisation to report and manage this client’s Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("7 - Verify Transaction History pages for Agent user") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0000000122 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0000000122", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0000000122")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0000000122")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see Next CTA")
        thenIShouldSeeXCTA("Next")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Next CTA")
        whenIClickXCTA("Next")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Second Page")
        thenIShouldBeOnX("Transaction History Second Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see Previous CTA")
        thenIShouldSeeXCTA("Previous")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Previous CTA")
        whenIClickXCTA("Previous")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4040000000 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4040000000", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR4040000000")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR4040000000")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Empty Page")
        thenIShouldBeOnX("Transaction History Empty Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

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

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage link")
        andIClickXLink("Return to your account homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR6666666666 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR6666666666", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR6666666666")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR6666666666")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555551111 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555551111", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR5555551111")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR5555551111")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
