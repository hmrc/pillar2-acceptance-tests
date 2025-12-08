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
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
class AgentDueAndOverDue extends BaseSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns for Agent User Journey") {

    Scenario("1 - Agent User navigates to Due & Overdue returns page with multiple accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR1111111111 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR1111111111", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR1111111111")
      andIProvideASAAs("Pillar2 ID", "XEPLR1111111111")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      Then("I should navigate to Due & Over Due Page")
      thenIShouldNavigateTo("Due & Over Due Page")

      And("I should see 4 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(4)

      And("I should see 1 section with status Due")
      andIShouldSeeIntSectionWithStatusString(1, "Due")

      And("I should see 3 section with status Overdue")
      andIShouldSeeIntSectionWithStatusString(3, "Overdue")

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 0 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(0)

      When("I click due and overdue returns link")
      andIClickLink("due and overdue returns")

      Then("I should navigate to Due & Over Due Page")
      thenIShouldNavigateTo("Due & Over Due Page")
    }

    Scenario("2 - Agent User navigates to Due & Overdue returns page with no accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR2222222222", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR2222222222")
      andIProvideASAAs("Pillar2 ID", "XEPLR2222222222")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 0 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(0)

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 0 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(0)
    }

    Scenario("3 -  Agent User navigates to Due & Overdue returns page with single accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR3333333333 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR3333333333", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR3333333333")
      andIProvideASAAs("Pillar2 ID", "XEPLR3333333333")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 1 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(1)

      And("I should see 1 section with status Due")
      andIShouldSeeIntSectionWithStatusString(1, "Due")

      And("I should see 0 section with status Overdue")
      andIShouldSeeIntSectionWithStatusString(0, "Overdue")

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 0 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(0)
    }

    Scenario("4 - Agent User navigates to Due & Overdue returns page with all fulfilled submissions", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4444444444", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR4444444444")
      andIProvideASAAs("Pillar2 ID", "XEPLR4444444444")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 0 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(0)

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 2 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(2)
    }

    Scenario("5 - Agent User navigates to Due & Overdue returns page with some fulfilled submissions", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555555555 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555555555", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XEPLR5555555555")
      andIProvideASAAs("Pillar2 ID", "XEPLR5555555555")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 2 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(2)

      And("I should see 0 section with status Due")
      andIShouldSeeIntSectionWithStatusString(0, "Due")

      And("I should see 2 section with status Overdue")
      andIShouldSeeIntSectionWithStatusString(2, "Overdue")

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 2 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(2)
    }
  }
}
