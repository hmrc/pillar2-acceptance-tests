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
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}

class AgentSubmissionHistorySpec extends AnyFeatureSpec with Matchers {

  Feature("Pillar2 Submission History Agent User Journey") {

    Scenario("1 - Agent User navigates to Submission History for no accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR2222222222")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I click View submission history link")
      And("I should see 0 accounting periods on Sub History Page")
    }

    Scenario("2 -  Agent User navigates to Submission History for one accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR7777777777 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR7777777777")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I click View submission history link")
      And("I should see 1 accounting periods on Sub History Page")
    }

    Scenario("3 - Agent User navigates to Submission History for multiple accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XEPLR4444444444")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I click View submission history link")
      And("I should see 2 accounting periods on Sub History Page")
    }
  }
}
