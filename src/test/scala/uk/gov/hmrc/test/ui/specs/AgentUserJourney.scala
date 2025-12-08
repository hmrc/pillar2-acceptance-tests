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
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps.thenIShouldBeRedirectedTo
import uk.gov.hmrc.test.ui.specsdef.SubscriptionJourneyStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.*

class AgentUserJourney extends BaseSpec with Matchers {

  Feature("Agent user journeys") {

    Scenario("1 - Agent user capturing Pillar2 ID", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      When("I select back link")
      andISelectBackLink()

      And("I provide ASA Pillar2 ID as XEPLR0123456500")
      andIProvideASAAs("Pillar2 ID", "XEPLR0123456500")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA No record Match Error Page")
      thenIShouldNavigateTo("ASA No record Match Error Page")

      When("I click Re-enter your client’s Pillar 2 Top-up Taxes ID to try again link")
      andIClickLink("Re-enter your client’s Pillar 2 Top-up Taxes ID to try again")

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      When("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      When("I click Enter a different client’s Pillar 2 Top-up Taxes ID link")
      andIClickLink("Enter a different client’s Pillar 2 Top-up Taxes ID")

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I should see the PLRID field is pre-populated with XMPLR0012345674")
      andIShouldSeeTheFieldIsPrepopulatedWith("PLRID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")
    }

    Scenario("2 - Agent user accessing dashboard features after login", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Manage contact details link")
      andIClickLink("Manage contact details")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on change link for Email address")
      andIClickOnChangeLinkFor("Email address")

      When("I enter Contact Email as updatecontact@email.com")
      andIEnterAs("Contact Email", "updatecontact@email.com")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Manage group details link")
      andIClickLink("Manage group details")

      Then("I should navigate to accounts summary page")
      thenIShouldNavigateTo("accounts summary page")

      When("I click on change hyperlink next to the Accounting Period")
      andIClickOnChangeHyperlinkNextToThe("Accounting Period")

      And("Accounting Period End Month is entered as 12")
      andAccountingPeriodIsEnteredAs("End Month", "12")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to accounts summary page")
      thenIShouldNavigateTo("accounts summary page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to Manage Account processing Page or Dashboard page")
      thenIShouldBeRedirectedTo("Manage Account processing Page", "Dashboard page")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")
    }

    Scenario("3 - Agent user API failure scenarios and service banner navigation", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR0123456404")
      andIProvideASAAs("Pillar2 ID", "XEPLR0123456404")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA No record Match Error Page")
      thenIShouldNavigateTo("ASA No record Match Error Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Manage contact details link")
      andIClickLink("Manage contact details")

      When("I click on change link for Contact Name")
      andIClickOnChangeLinkFor("Contact Name")

      When("I enter Contact Name as 400")
      andIEnterAs("Contact Name", "400")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Subscription API error page")
      thenIShouldNavigateTo("Subscription API error page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")
    }

    Scenario("4 - Verify Agent service account user unauthorised pages", AcceptanceTests, ZapAccessibility) {
      Given("Individual User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Individual User")

      Then("I should be on ASA Individual KB Page")
      thenIShouldBeOn("ASA Individual KB Page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Individual KB Page")
      thenIShouldBeOn("ASA Individual KB Page")

      When("I click request authorisation on agent services link")
      andIClickLink("request authorisation on agent services")

      Then("I should navigate to Agent services account page2")
      thenIShouldNavigateTo("Agent services account page2")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Individual KB Page")
      thenIShouldBeOn("ASA Individual KB Page")

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who can report for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Individual KB Page")
      thenIShouldNavigateTo("ASA Individual KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")
    }

    Scenario("5 - Verify Agent service account user unauthorised pages", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Organisation User")

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      When("I click request authorisation on agent services link")
      andIClickLink("request authorisation on agent services")

      Then("I should navigate to Agent services account page2")
      thenIShouldNavigateTo("Agent services account page2")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who can report for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

      When("Assistant User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Assistant User")

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")
    }

    Scenario("6 - Agent user Not Authorised Page", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XMPLR0123456789")
      andIProvideASAAs("Pillar2 ID", "XMPLR0123456789")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Not Authorised page")
      thenIShouldNavigateTo("ASA Not Authorised page")

      When("I click request authorisation to report and manage this client’s Pillar 2 Top-up Taxes link")
      andIClickLink("request authorisation to report and manage this client’s Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")

      When("I select back link")
      andISelectBackLink()

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")
    }

    // TODO PIL-2449 logic has changed so XEPLR4000000000 will not go to dashboard, need to be deleted after review.

    Scenario("7 - Verify Transaction History pages for Agent user", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0000000122 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0000000122", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XMPLR0000000122")
      andIProvideASAAs("Pillar2 ID", "XMPLR0000000122")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      And("I should see Next CTA")
      thenIShouldSeeCTA("Next")

      When("I click Next CTA")
      whenIClickCTA("Next")

      Then("I should be on Transaction History Second Page")
      thenIShouldBeOn("Transaction History Second Page")

      And("I should see Previous CTA")
      thenIShouldSeeCTA("Previous")

      When("I click Previous CTA")
      whenIClickCTA("Previous")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4040000000 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4040000000", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR4040000000")
      andIProvideASAAs("Pillar2 ID", "XEPLR4040000000")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Empty Page")
      thenIShouldBeOn("Transaction History Empty Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

//      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")
//
//      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4000000000 and pillar2-auth for Pillar2 service")
//      whenIAddDelegatedEnrolmentWithAndForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4000000000", "pillar2-auth")
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
//      When("I click View transaction history link")
//      andIClickLink("View transaction history")
//
//      Then("I should be on Transaction History Error Page")
//      thenIShouldBeOn("Transaction History Error Page")
//
//      When("I click Return to your account homepage link")
//      andIClickLink("Return to your account homepage")
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      When("I click View transaction history link")
//      andIClickLink("View transaction history")
//
//      Then("I should be on Transaction History Error Page")
//      thenIShouldBeOn("Transaction History Error Page")
//
//      When("I select back link")
//      andISelectBackLink()
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      And("I click Sign out link")
//      andIClickLink("Sign out")

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR6666666666 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR6666666666", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR6666666666")
      andIProvideASAAs("Pillar2 ID", "XEPLR6666666666")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555551111 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555551111", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR5555551111")
      andIProvideASAAs("Pillar2 ID", "XEPLR5555551111")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")
    }
  }

  Scenario("8 - Verify Agent can switch clients", AcceptanceTests) {
    Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
    whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

    Then("I click Add Delegated Enrolment button")
    clickAddDelegatedEnrolmentCTA()

    And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0000000122 and pillar2-auth for Pillar2 service")
    addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0000000122", "pillar2-auth")

    Then("I click Add Delegated Enrolment button")
    clickAddDelegatedEnrolmentCTA()

    And("Add delegated enrolment for first client with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth ")
    addSecondClientDelegatedEnrolment("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

    And("I Click Submit button")
    clickSubmitButton()

    Then("I should be on ASA Pillar2 Input Page")
    thenIShouldBeOn("ASA Pillar2 Input Page")

    And("I provide ASA Pillar2 ID as XMPLR0000000122")
    andIProvideASAAs("Pillar2 ID", "XMPLR0000000122")

    And("I click on Continue button")
    whenIClickOnContinueButton("I click on Continue button")

    Then("I should navigate to ASA Confirmation Page")
    thenIShouldNavigateTo("ASA Confirmation Page")

    And("I click on Continue button")
    whenIClickOnContinueButton("I click on Continue button")

    Then("I should navigate to Dashboard page")
    thenIShouldNavigateTo("Dashboard page")

    And("I verify logged in client's plrId is displayed")
    VerifyCorrectClientDetails("XMPLR0000000122")

    And("I click Change client link")
    andIClickLink("Change client")

    Then("I should be on ASA Pillar2 Input Page")
    thenIShouldBeOn("ASA Pillar2 Input Page")

    And("I provide ASA Pillar2 ID as XMPLR0012345674")
    andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

    And("I click on Continue button")
    whenIClickOnContinueButton("I click on Continue button")

    Then("I should navigate to ASA Confirmation Page")
    thenIShouldNavigateTo("ASA Confirmation Page")

    And("I click on Continue button")
    whenIClickOnContinueButton("I click on Continue button")

    Then("I should navigate to Dashboard page")
    thenIShouldNavigateTo("Dashboard page")

    And("I verify logged in client's plrId is displayed")
    VerifyCorrectClientDetails("XMPLR0012345674")
  }
}
