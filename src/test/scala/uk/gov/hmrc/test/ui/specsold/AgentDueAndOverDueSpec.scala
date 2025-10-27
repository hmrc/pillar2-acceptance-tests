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

package uk.gov.hmrc.test.ui.specsold
import org.scalatest.matchers.should.Matchers


class AgentDueAndOverDueSpec extends BaseSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns for Agent User Journey") {

    Scenario("1 - Agent User navigates to Due & Overdue returns page with multiple accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR1111111111 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR1111111111")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      And("I click View all due and overdue returns link")
      Then("I should navigate to Due & Over Due Page")
      And("I should see 4 accounting periods on Due Overdue Page")
      And("I should see 1 section with status Due")
      And("I should see 3 section with status Overdue")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
      When("I click due and overdue returns link")
      Then("I should navigate to Due & Over Due Page")
    }

    Scenario("2 - Agent User navigates to Due & Overdue returns page with no accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR2222222222")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click View all due and overdue returns link")
      And("I should see 0 accounting periods on Due Overdue Page")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
    }

    Scenario("3 -  Agent User navigates to Due & Overdue returns page with single accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR3333333333 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR3333333333")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click View all due and overdue returns link")
      And("I should see 1 accounting periods on Due Overdue Page")
      And("I should see 1 section with status Due")
      And("I should see 0 section with status Overdue")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
    }

    Scenario("4 - Agent User navigates to Due & Overdue returns page with all fulfilled submissions") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR4444444444")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click View all due and overdue returns link")
      And("I should see 0 accounting periods on Due Overdue Page")
      When("I click submission history link")
      And("I should see 2 accounting periods on Sub History Page")
    }

    Scenario("5 - Agent User navigates to Due & Overdue returns page with some fulfilled submissions") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555555555 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR5555555555")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click View all due and overdue returns link")
      And("I should see 2 accounting periods on Due Overdue Page")
      And("I should see 0 section with status Due")
      And("I should see 2 section with status Overdue")
      When("I click submission history link")
      And("I should see 2 accounting periods on Sub History Page")
    }
  }
}
