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
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps._

class RFMStartPageKBValidationsSpec extends BaseSpec with Matchers {

  Feature("RFM Start page") {

    Scenario("1 - Verify Individual RFM KB page",AcceptanceTests, ZapAccessibility) {
      Given("I access RFM start page")
      givenIAccessRFMXPage("start")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("Individual User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Individual User")

      Then("I should be on Individual RFM KB Page")
      thenIShouldBeOn("Individual RFM KB Page")

      When("I click sign in to Government Gateway with an organisation account link")
      andIClickLink("sign in to Government Gateway with an organisation account")

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Individual RFM KB Page")
      thenIShouldBeOn("Individual RFM KB Page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Individual RFM KB Page")
      thenIShouldBeOn("Individual RFM KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("2 - Verify Agent RFM KB page",AcceptanceTests,ZapAccessibility) {
      Given("Agent User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Agent User")

      Then("I should be on Agent RFM KB Page")
      thenIShouldBeOn("Agent RFM KB Page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Agent RFM KB Page")
      thenIShouldBeOn("Agent RFM KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("3 - Verify Organisation Assistant User RFM KB page",AcceptanceTests,ZapAccessibility) {
      Given("Assistant User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Assistant User")

      Then("I should be on Assistant User RFM KB Page")
      thenIShouldBeOn("Assistant User RFM KB Page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Assistant User RFM KB Page")
      thenIShouldBeOn("Assistant User RFM KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("4 - Verify already enrolled Organisation User KB page",AcceptanceTests,ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 with rfm URL to Pillar2 service")
      whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Duplicate RFM KB Page")
      thenIShouldBeOn("Duplicate RFM KB Page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Duplicate RFM KB Page")
      thenIShouldBeOn("Duplicate RFM KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("5 - Verify existing FM (with same group id) trying to access RFM journey and getting redirected to KB page",AcceptanceTests,ZapAccessibility) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("Organisation User logs in and navigates to RFM start page without Pillar2 enrolment with groupId 879D6270-E9C2-4092-AC91-21C61B69D1E7")
      givenLogsInAndNavigatesToRFMStartPageWithoutPillar2EnrolmentWithGroupId(
        "879D6270-E9C2-4092-AC91-21C61B69D1E7"
      )

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOn("RFM enter pillar2 id page")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      Then("I should be on RFM Existing Member KB Page")
      thenIShouldBeOn("RFM Existing Member KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOn("RFM enter pillar2 id page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click go to your business tax account link")
      andIClickLink("go to your business tax account")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      And("I click Sign out link")
      andIClickLink("Sign out")
    }
  }
}