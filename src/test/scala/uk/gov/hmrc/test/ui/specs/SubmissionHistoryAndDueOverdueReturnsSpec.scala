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
import uk.gov.hmrc.test.ui.specsdef.ASAStepsSteps.{andIShouldSeeIntAccountingPeriodsOnDueOverduePage, andIShouldSeeIntAccountingPeriodsOnSubHistoryPage, andIShouldSeeIntSectionWithStatusString}
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.{thenIShouldBeOn, thenIShouldNavigateTo}

class SubmissionHistoryAndDueOverdueReturnsSpec extends BaseSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns And Submission History User Journey") {

    Scenario("1 - Org User navigates to Due & Overdue returns and Submission History for multiple accounting period", ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR1111111111 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR1111111111"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

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

    Scenario("2 - Org User navigates to Due & Overdue returns and Submission History pages for no accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR2222222222 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR2222222222"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 0 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(0)

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 0 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(0)

    }

    Scenario("3 -  Org User navigates to due & Due & Overdue returns and Submission History pages for single accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR3333333333 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR3333333333"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
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

    Scenario("4 - Org User navigates to Due & Overdue returns and Submission History pages for all fulfilled submissions", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4444444444 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR4444444444"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 0 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(0)

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 2 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(2)

    }

    Scenario("5 - Org User navigates to Due & Overdue returns and Submission History pages for some fulfilled submissions", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555555555 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR5555555555"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
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

    Scenario("6 - Org User navigates to Due & Overdue returns and Submission History for one accounting period", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR7777777777 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR7777777777"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click View all due and overdue returns link")
      andIClickLink("View all due and overdue returns")

      And("I should see 0 accounting periods on Due Overdue Page")
      andIShouldSeeIntAccountingPeriodsOnDueOverduePage(0)

      When("I click submission history link")
      andIClickLink("View submission history")

      And("I should see 1 accounting periods on Sub History Page")
      andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(1)
    }
  }
}
