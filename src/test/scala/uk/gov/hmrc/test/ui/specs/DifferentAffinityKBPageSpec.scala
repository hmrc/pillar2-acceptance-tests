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
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*

class DifferentAffinityKBPageSpec extends BaseSpec with Matchers {

  Feature("Failure scenarios with different Affinity groups") {

    Scenario("1 - User logins as organisation user and standard role", AcceptanceTests, ZapAccessibility) {
      Given("Assistant User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Assistant User")

      Then("I should be on Assistant role KB page")
      thenIShouldBeOn("Assistant role KB page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Assistant role KB page")
      thenIShouldNavigateTo("Assistant role KB page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("2 - User logins as Agent", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Agent User")

      Then("I should be on Agent affinity KB page")
      thenIShouldBeOn("Agent affinity KB page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Agent affinity KB page")
      thenIShouldBeOn("Agent affinity KB page")

      When("I click request authorisation via agent services link")
      andIClickLink("request authorisation via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Agent affinity KB page")
      thenIShouldBeOn("Agent affinity KB page")

      And("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Agent affinity KB page")
      thenIShouldNavigateTo("Agent affinity KB page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("3 - User logins as Individual User", AcceptanceTests, ZapAccessibility) {
      Given("Individual User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Individual User")

      Then("I should be on Individual affinity KB page")
      thenIShouldBeOn("Individual affinity KB page")

      When("I click sign in to Government Gateway with an organisation account. link")
      andIClickLink("sign in to Government Gateway with an organisation account.")

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

      When("Individual User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Individual User")

      Then("I should be on Individual affinity KB page")
      thenIShouldBeOn("Individual affinity KB page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Individual affinity KB page")
      thenIShouldNavigateTo("Individual affinity KB page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("4 - User logins as organisation user and standard role - ZAP-Accessibility Tests", AcceptanceTests, ZapAccessibility) {
      Given("Assistant User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Assistant User")

      Then("I should be on Assistant role KB page")
      thenIShouldBeOn("Assistant role KB page")

    }

    Scenario("5 - User logins as Agent", AcceptanceTests, ZapAccessibility) {
      Given("Agent User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Agent User")

      Then("I should be on Agent affinity KB page")
      thenIShouldBeOn("Agent affinity KB page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")
    }

    Scenario("6 - User logins as Individual User") {
      Given("Individual User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Individual User")

      Then("I should be on Individual affinity KB page")
      thenIShouldBeOn("Individual affinity KB page")
    }

    Scenario("5 - Verify Agent service account user unauthorised pages", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Organisation User")

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      When("I click sign in via agent services link")
      andIClickLink("sign in via agent services")

      Then("I should navigate to agent services account page")
      thenIShouldNavigateTo("agent services account page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      When("I click request authorisation on agent services link")
      andIClickLink("request authorisation on agent services")

      Then("I should navigate to Agent services account page2")
      thenIShouldNavigateTo("Agent services account page2")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")

      And("I click Find out more about who can report for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who can report for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to ASA Organisation KB Page")
      thenIShouldNavigateTo("ASA Organisation KB Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

      When("Assistant User logs in to register for Pillar2 Agent service")
      givenLogsInToRegisterForPillar2AgentService("Assistant User")

      Then("I should be on ASA Organisation KB Page")
      thenIShouldBeOn("ASA Organisation KB Page")
    }
  }
}
