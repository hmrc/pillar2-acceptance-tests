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
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.login
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.PaymentStepsSteps.thenIShouldBeRedirectedToGuidancePageInANewTab

class IDValidationPageSpec extends BaseSpec with Matchers {

  Feature("BTA user registration for Pillar 2 service") {

    Scenario("1 - Validation page and guidance page for users with NO PLRID and error validation.") {
      Given("Organisation User logs in with BTA for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "bta"
      )

      Then("I should be on bta pillar2 ID check page")
      thenIShouldBeOnX("bta pillar2 ID check page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to bta register guidance page")
      thenIShouldNavigateToX("bta register guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab) link")
      andIClickXLink("Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab)") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to guidance page in a new tab")
      thenIShouldBeRedirectedToGuidancePageInANewTab() // auto-chosen (score=1.00, PaymentStepsSteps.scala)

    }

    Scenario("2 - Confirmation page for users with PLRID") {
      Given("Organisation User logs in with BTA for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "bta"
      )

      Then("I should be on bta pillar2 ID check page")
      thenIShouldBeOnX("bta pillar2 ID check page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to eacd page")
      thenIShouldNavigateToX("eacd page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
