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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._

class EligibilityQuestionsPageSpec extends BaseSpec with Matchers {

  Feature("Eligibility Questions for Pillar 2") {

    Scenario("1 - User navigates to next eligibility question page by selecting yes option") {
      Given("I clear the cache")
      thenIClearTheCache() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("I am on UPE EQ Page")
      givenIAmOnXPage("UPE EQ") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose Yes and continue")
      andIChooseXAndContinue("Yes") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to business EQ page")
      thenIShouldNavigateToX("business EQ page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I choose Yes and continue")
      andIChooseXAndContinue("Yes") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Global gross revenue")
      thenIShouldNavigateToX("Global gross revenue") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose Yes and continue")
      andIChooseXAndContinue("Yes") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to confirmation page")
      thenIShouldNavigateToX("confirmation page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickXLink("Report Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
      thenIShouldNavigateToX("guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on confirmation page")
      thenIShouldBeOnX("confirmation page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I continue")
      continueAction("I continue")

      Then("I should be on auth-login page")
      thenIShouldBeOnX("auth-login page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - User navigates to guidance page by selecting No option in eligibility questions") {
      Given("I clear the cache")
      thenIClearTheCache() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("I am on UPE EQ Page")
      givenIAmOnXPage("UPE EQ") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I choose No and continue")
      andIChooseXAndContinue("No") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to NFM EQ page")
      thenIShouldNavigateToX("NFM EQ page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I choose Eligibility No NFM and continue")
      andIChooseXAndContinue("Eligibility No NFM") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to NFM guidance page")
      thenIShouldNavigateToX("NFM guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Find out more about who can use this service link")
      andIClickXLink("Find out more about who can use this service") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
      thenIShouldNavigateToX("guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM guidance page")
      thenIShouldNavigateToX("NFM guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to NFM EQ page")
      thenIShouldNavigateToX("NFM EQ page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I choose Eligibility Yes NFM and continue")
      andIChooseXAndContinue("Eligibility Yes NFM") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I am on Business activity EQ Page")
      givenIAmOnXPage("Business activity EQ") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I continue without selecting an option")
      continueAction("I continue without selecting an option")

      When("I choose No and continue")
      andIChooseXAndContinue("No") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to BA guidance page")
      thenIShouldNavigateToX("BA guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
      andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
      thenIShouldNavigateToX("guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to BA guidance page")
      thenIShouldNavigateToX("BA guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to business EQ page")
      thenIShouldNavigateToX("business EQ page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I choose Yes and continue")
      andIChooseXAndContinue("Yes") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I am on Global gross revenue Page")
      givenIAmOnXPage("Global gross revenue") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I choose No and continue")
      andIChooseXAndContinue("No") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to GGR guidance page")
      thenIShouldNavigateToX("GGR guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
      andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
      thenIShouldNavigateToX("guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to GGR guidance page")
      thenIShouldNavigateToX("GGR guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Global gross revenue")
      thenIShouldNavigateToX("Global gross revenue") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickXLink("Report Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to guidance page")
      thenIShouldNavigateToX("guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
