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

package uk.gov.hmrc.test.ui.specs.completed

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.{Enrolment, login}
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specs.BaseSpec
import uk.gov.hmrc.test.ui.tags.Tests

class SubmissionHistoryAndDueOverdueReturnsSpec extends BaseSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns And Submission History User Journey") {

    Scenario("1 - Org User navigates to Due & Overdue returns and Submission History", Tests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555555555 for Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XEPLR5555555555"
          )
        )
      )

      Then("The user successfully checks all due and overdue returns")
      DashboardPage.clickDueAndOverdueReturnsLink()
      DueOverduePage.onPage()

      Then("The user successfully checks submission history")
      DueOverduePage.clickSubmissionHistoryLink()
      SubmissionHistoryPage.onPage()
    }
  }
}
