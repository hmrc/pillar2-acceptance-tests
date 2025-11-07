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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps.andIShouldSeeTheFieldIsPrepopulatedWith

class SubAgentUserSpec extends BaseSpec with Matchers {

  Feature("Pillar2 submission Agent User Journey") {

    Scenario("1 - Agent user capturing Pillar2 ID") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674",
        "pillar2-auth"
      )

      Then("I should navigate to ASA Pillar2 Input Page")
      thenIShouldNavigateTo("ASA Pillar2 Input Page")

      When("I provide RFM pillar2 id as XMplr0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMplr0123456789")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I should navigate to ASA Pillar2 Input Page")
      thenIShouldNavigateTo("ASA Pillar2 Input Page")

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

      When("I select back link")
      andISelectBackLink()

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to ASA Home Page")
      thenIShouldNavigateTo("ASA Home Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Pillar2 Input Page")
      thenIShouldNavigateTo("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR0123456500")
      andIProvideASAAs("Pillar2 ID", "XEPLR0123456500")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Re-enter your client’s Pillar 2 Top-up Taxes ID to try again link")
      andIClickLink("Re-enter your client’s Pillar 2 Top-up Taxes ID to try again")

      Then("I should navigate to ASA Pillar2 Input Page")
      thenIShouldNavigateTo("ASA Pillar2 Input Page")

      When("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      When("I click Enter a different client’s Pillar 2 Top-up Taxes ID link")
      andIClickLink("Enter a different client’s Pillar 2 Top-up Taxes ID")

      Then("I should navigate to ASA Pillar2 Input Page")
      thenIShouldNavigateTo("ASA Pillar2 Input Page")

      And("I should see the PLRID field is pre-populated with XMPLR0012345674")
      andIShouldSeeTheFieldIsPrepopulatedWith("PLRID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("2 - Verify Agent service account user unauthorised pages") {
      Given("Individual User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Individual User")

      Then("I should navigate to ASA Individual KB Page")
      thenIShouldNavigateTo("ASA Individual KB Page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Individual KB Page")
      thenIShouldNavigateTo("ASA Individual KB Page")

      When("I click request authorisation on agent services link")
      andIClickLink("request authorisation on agent services")

      Then("I should navigate to Agent services account page2")
      thenIShouldNavigateTo("Agent services account page2")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Individual KB Page")
      thenIShouldNavigateTo("ASA Individual KB Page")

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who can report for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Individual KB Page")
      thenIShouldNavigateTo("ASA Individual KB Page")

    }

    Scenario("3 - Verify Agent service account user unauthorised pages") {
      Given("Organisation User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Organisation User")

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      When("I click request authorisation on agent services link")
      andIClickLink("request authorisation on agent services")

      Then("I should navigate to Agent services account page2")
      thenIShouldNavigateTo("Agent services account page2")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who can report for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      When("Assistant User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Assistant User")

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")
    }
  }
}