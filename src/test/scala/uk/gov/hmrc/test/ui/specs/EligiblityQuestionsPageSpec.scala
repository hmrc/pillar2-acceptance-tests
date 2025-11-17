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

class EligiblityQuestionsPageSpec extends BaseSpec with Matchers {

  Feature("Eligibility Questions for Pillar 2") {

    Scenario("1 - User navigates to next eligibility question page by selecting yes option", AcceptanceTests, ZapAccessibility) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("I am on UPE EQ Page")
      givenIAmOnPage("UPE EQ")

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose Yes and continue")
      andIChooseAndContinue("Yes")

      Then("I should navigate to business EQ page")
      thenIShouldNavigateTo("business EQ page")

      When("I choose Yes and continue")
      andIChooseAndContinue("Yes")

      Then("I should navigate to Global gross revenue")
      thenIShouldNavigateTo("Global gross revenue")

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose Yes and continue")
      andIChooseAndContinue("Yes")

      Then("I should navigate to confirmation page")
      thenIShouldNavigateTo("confirmation page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on confirmation page")
      thenIShouldBeOn("confirmation page")

      When("I continue")
      continueAction("I continue")

      Then("I should be on auth-login page")
      thenIShouldBeOn("auth-login page")

    }

    Scenario("2 - User navigates to guidance page by selecting No option in eligibility questions", AcceptanceTests, ZapAccessibility) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("I am on UPE EQ Page")
      givenIAmOnPage("UPE EQ")

      When("I choose No and continue")
      andIChooseAndContinue("No")

      Then("I should navigate to NFM EQ page")
      thenIShouldNavigateTo("NFM EQ page")

      When("I choose Eligibility No NFM and continue")
      andIChooseAndContinue("Eligibility No NFM")

      Then("I should navigate to NFM guidance page")
      thenIShouldNavigateTo("NFM guidance page")

      When("I click Find out more about who can use this service link")
      andIClickLink("Find out more about who can use this service")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to NFM guidance page")
      thenIShouldNavigateTo("NFM guidance page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to NFM EQ page")
      thenIShouldNavigateTo("NFM EQ page")

      When("I choose Eligibility Yes NFM and continue")
      andIChooseAndContinue("Eligibility Yes NFM")

      Then("I am on Business activity EQ Page")
      givenIAmOnPage("Business activity EQ")

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose No and continue")
      andIChooseAndContinue("No")

      Then("I should navigate to BA guidance page")
      thenIShouldNavigateTo("BA guidance page")

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to BA guidance page")
      thenIShouldNavigateTo("BA guidance page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to business EQ page")
      thenIShouldNavigateTo("business EQ page")

      When("I choose Yes and continue")
      andIChooseAndContinue("Yes")

      Then("I am on Global gross revenue Page")
      givenIAmOnPage("Global gross revenue")

      When("I choose No and continue")
      andIChooseAndContinue("No")

      Then("I should navigate to GGR guidance page")
      thenIShouldNavigateTo("GGR guidance page")

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
      andIClickLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to GGR guidance page")
      thenIShouldNavigateTo("GGR guidance page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Global gross revenue")
      thenIShouldNavigateTo("Global gross revenue")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to guidance page")
      thenIShouldNavigateTo("guidance page")
    }
  }
}