package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{Given, Then, When}

import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class P2IDValidationPageSpec extends AnyFeatureSpec with Matchers {

  Feature("BTA user registration for Pillar 2 service") {

    Scenario("1 - Validation page and guidance page for users with NO PLRID and error validation.") {
      Given("Organisation User logs in with BTA for Pillar2")
        givenXLogsInWithBTAForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on bta pillar2 ID check page")
        thenIShouldBeOnX("bta pillar2 ID check page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to bta register guidance page")
        thenIShouldNavigateToX("bta register guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab) link")
        andIClickXLink("Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab)")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be redirected to guidance page in a new tab")
        thenIShouldBeRedirectedToGuidancePageInANewTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

    }

    Scenario("2 - Confirmation page for users with PLRID") {
      Given("Organisation User logs in with BTA for Pillar2")
        givenXLogsInWithBTAForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on bta pillar2 ID check page")
        thenIShouldBeOnX("bta pillar2 ID check page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to eacd page")
        thenIShouldNavigateToX("eacd page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
