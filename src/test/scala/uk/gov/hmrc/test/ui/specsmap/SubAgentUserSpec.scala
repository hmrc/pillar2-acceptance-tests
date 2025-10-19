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
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._

class SubAgentUserSpec extends AnyFeatureSpec with Matchers {

  Feature("Pillar2 submission Agent User Journey") {

    Scenario("1 - Agent user capturing Pillar2 ID") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Pillar2 Input Page")
        thenIShouldNavigateToX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide RFM pillar2 id as XMplr0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMplr0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should navigate to ASA Pillar2 Input Page")
        thenIShouldNavigateToX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

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

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Home Page")
        thenIShouldNavigateToX("ASA Home Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Pillar2 Input Page")
        thenIShouldNavigateToX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR0123456500")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR0123456500")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Re-enter your client’s Pillar 2 Top-up Taxes ID to try again link")
        andIClickXLink("Re-enter your client’s Pillar 2 Top-up Taxes ID to try again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Pillar2 Input Page")
        thenIShouldNavigateToX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Enter a different client’s Pillar 2 Top-up Taxes ID link")
        andIClickXLink("Enter a different client’s Pillar 2 Top-up Taxes ID")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Pillar2 Input Page")
        thenIShouldNavigateToX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see the PLRID field is pre-populated with XMPLR0012345674")
        // ⚠️ No step-def match found for: I should see the PLRID field is pre-populated with XMPLR0012345674

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Verify Agent service account user unauthorised pages") {
      Given("Individual User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Individual User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Individual KB Page")
        thenIShouldNavigateToX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Individual KB Page")
        thenIShouldNavigateToX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click request authorisation on agent services link")
        andIClickXLink("request authorisation on agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Agent services account page2")
        thenIShouldNavigateToX("Agent services account page2")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Individual KB Page")
        thenIShouldNavigateToX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who can report for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Individual KB Page")
        thenIShouldNavigateToX("ASA Individual KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - Verify Agent service account user unauthorised pages") {
      Given("Organisation User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click request authorisation on agent services link")
        andIClickXLink("request authorisation on agent services")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Agent services account page2")
        thenIShouldNavigateToX("Agent services account page2")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who can report for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("Assistant User logs in to register for Pillar2 Agent service")
        givenXLogsInToRegisterForPillar2AgentService("Assistant User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Organisation KB Page")
        thenIShouldNavigateToX("ASA Organisation KB Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
