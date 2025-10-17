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

import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec

class SubmissionHistoryAndDueOverdueReturnsSpec extends AnyFeatureSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns And Submission History User Journey") {

    Scenario("1 - Org User navigates to Due & Overdue returns and Submission History for multiple accounting period") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR1111111111 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 4 accounting periods on Due Overdue Page")
      And("I should see 1 section with status Due")
      And("I should see 3 section with status Overdue")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
      When("I click due and overdue returns link")
      Then("I should navigate to Due & Over Due Page")
    }

    Scenario("2 - Org User navigates to Due & Overdue returns and Submission History pages for no accounting period") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR2222222222 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 0 accounting periods on Due Overdue Page")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
    }

    Scenario("3 -  Org User navigates to due & Due & Overdue returns and Submission History pages for single accounting period") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR3333333333 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 1 accounting periods on Due Overdue Page")
      And("I should see 1 section with status Due")
      And("I should see 0 section with status Overdue")
      When("I click submission history link")
      And("I should see 0 accounting periods on Sub History Page")
    }

    Scenario("4 - Org User navigates to Due & Overdue returns and Submission History pages for all fulfilled submissions") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4444444444 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 0 accounting periods on Due Overdue Page")
      When("I click submission history link")
      And("I should see 2 accounting periods on Sub History Page")
    }

    Scenario("5 - Org User navigates to Due & Overdue returns and Submission History pages for some fulfilled submissions") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555555555 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 2 accounting periods on Due Overdue Page")
      And("I should see 0 section with status Due")
      And("I should see 2 section with status Overdue")
      When("I click submission history link")
      And("I should see 2 accounting periods on Sub History Page")
    }

    Scenario("6 - Org User navigates to Due & Overdue returns and Submission History for one accounting period") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR7777777777 for Pillar2 service")
      Then("I should be on Dashboard page")
      And("I click View all due and overdue returns link")
      And("I should see 0 accounting periods on Due Overdue Page")
      When("I click submission history link")
      And("I should see 1 accounting periods on Sub History Page")
    }
  }
}
