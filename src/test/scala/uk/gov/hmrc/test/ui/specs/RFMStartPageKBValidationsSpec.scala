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
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.{Enrolment, loginToRFM}
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.tags.Wip

class RFMStartPageKBValidationsSpec extends BaseSpec with Matchers {

  Feature("RFM Start page") {

    Scenario("1 - Verify Individual RFM KB page", Wip) {
      Given("An individual accesses the RFM start page")
      loginToRFM("Individual")

      Then("The user will be on the unable to use this service page")
      RFMIndividualKBPage.onPage()
    }

    Scenario("2 - Verify Agent RFM KB page", Wip) {
      Given("Agent accesses the RFM start page")
      loginToRFM("Agent")

      Then("The user will be on the unable to use this service page")
      RFMKBAgentPage.onPage()
    }

    Scenario("3 - Verify Organisation Assistant User RFM KB page", Wip) {
      Given("Assistant User accesses the RFM start page")
      loginToRFM("Organisation", credRole = "Assistant")

      Then("The user will be on the unable to use this service page")
      RFMKBAssistantUserPage.onPage()
    }

    Scenario("4 - Verify already enrolled Organisation User KB page", Wip) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 with rfm URL to Pillar2 service")
      loginToRFM(
        "Organisation",
        Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345674")
        )
      )

      Then("The user will be on the duplicate registration page")
      RFMKBDuplicatePage.onPage()
    }

    Scenario("5 - Verify existing FM (with same group id) trying to access RFM journey and getting redirected to KB page", Wip) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("Organisation User logs in and navigates to RFM start page without Pillar2 enrolment with groupId 879D6270-E9C2-4092-AC91-21C61B69D1E7")
      loginToRFM(
        "Organisation",
        groupId = "879D6270-E9C2-4092-AC91-21C61B69D1E7"
      )

      And("The user enters a registered PLRId")
      RFMEnterPillar2IdPage.enterPLRId("XMPLR0123456789")

      Then("The user will be on the existing member page")
      RFMKBExistingMemberPage.onPage()
    }
  }
}
