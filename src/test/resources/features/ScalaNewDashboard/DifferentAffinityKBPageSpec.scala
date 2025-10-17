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

class DifferentAffinityKBPageSpec extends AnyFeatureSpec with Matchers {

  Feature("Failure scenarios with different Affinity groups") {

    Scenario("1 - User logins as organisation user and standard role") {
      Given("Assistant User logs in to register for Pillar2")
      Then("I should be on Assistant role KB page")
      When("I click Find out more about who can use this service link")
      Then("I should navigate to guidance page")
      When("I click the browser back button")
      Then("I should navigate to Assistant role KB page")
      When("I select back link")
      Then("I should be on auth-login page")
    }

    Scenario("2 - User logins as Agent") {
      Given("Agent User logs in to register for Pillar2")
      Then("I should be on Agent affinity KB page")
      When("I click sign in via agent services link")
      Then("I should navigate to agent services account page")
      When("I click the browser back button")
      Then("I should be on Agent affinity KB page")
      When("I click request authorisation via agent services link")
      Then("I should navigate to agent services account page")
      When("I click the browser back button")
      Then("I should be on Agent affinity KB page")
      And("I click Find out more about who can use this service link")
      Then("I should navigate to guidance page")
      When("I click the browser back button")
      Then("I should navigate to Agent affinity KB page")
      When("I select back link")
      Then("I should be on auth-login page")
    }

    Scenario("3 - User logins as Individual User") {
      Given("Individual User logs in to register for Pillar2")
      Then("I should be on Individual affinity KB page")
      When("I click sign in to Government Gateway with an organisation account. link")
      Then("I should be on auth-login page")
      When("Individual User logs in to register for Pillar2")
      Then("I should be on Individual affinity KB page")
      When("I click Find out more about who can use this service link")
      Then("I should navigate to guidance page")
      When("I click the browser back button")
      Then("I should navigate to Individual affinity KB page")
      When("I select back link")
      Then("I should be on auth-login page")
    }

    Scenario("4 - User logins as organisation user and standard role - ZAP-Accessibility Tests") {
      Given("Assistant User logs in to register for Pillar2")
      Then("I should be on Assistant role KB page")
    }

    Scenario("5 - User logins as Agent") {
      Given("Agent User logs in to register for Pillar2")
      Then("I should be on Agent affinity KB page")
      When("I click sign in via agent services link")
      Then("I should navigate to agent services account page")
    }

    Scenario("6 - User logins as Individual User") {
      Given("Individual User logs in to register for Pillar2")
      Then("I should be on Individual affinity KB page")
    }
  }
}
