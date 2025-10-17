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

package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class DifferentAffinityKBPage extends AnyFeatureSpec with Matchers {

  Feature("Failure scenarios with different Affinity groups") {

    Scenario("1 - User logins as organisation user and standard role") {
      Given("Assistant User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Assistant User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Assistant role KB page")
        thenIShouldBeOnX("Assistant role KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Assistant role KB page")
        thenIShouldNavigateToX("Assistant role KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - User logins as Agent") {
      Given("Agent User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Agent User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Agent affinity KB page")
        thenIShouldBeOnX("Agent affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Agent affinity KB page")
        thenIShouldBeOnX("Agent affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click request authorisation via agent services link")
        andIClickXLink("request authorisation via agent services")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Agent affinity KB page")
        thenIShouldBeOnX("Agent affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Agent affinity KB page")
        thenIShouldNavigateToX("Agent affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - User logins as Individual User") {
      Given("Individual User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Individual User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Individual affinity KB page")
        thenIShouldBeOnX("Individual affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click sign in to Government Gateway with an organisation account. link")
        andIClickXLink("sign in to Government Gateway with an organisation account.")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("Individual User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Individual User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Individual affinity KB page")
        thenIShouldBeOnX("Individual affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Individual affinity KB page")
        thenIShouldNavigateToX("Individual affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - User logins as organisation user and standard role - ZAP-Accessibility Tests") {
      Given("Assistant User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Assistant User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Assistant role KB page")
        thenIShouldBeOnX("Assistant role KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - User logins as Agent") {
      Given("Agent User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Agent User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Agent affinity KB page")
        thenIShouldBeOnX("Agent affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click sign in via agent services link")
        andIClickXLink("sign in via agent services")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to agent services account page")
        thenIShouldNavigateToX("agent services account page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - User logins as Individual User") {
      Given("Individual User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Individual User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Individual affinity KB page")
        thenIShouldBeOnX("Individual affinity KB page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
