package uk.gov.hmrc.test.ui.specs
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{Given, Then, When}
class P2IDValidationPageSpec extends AnyFeatureSpec with Matchers {

  Feature("BTA user registration for Pillar 2 service") {

    Scenario("1 - Validation page and guidance page for users with NO PLRID and error validation.") {
      Given("Organisation User logs in with BTA for Pillar2")
        // ⚠️ No step-def match found for: Organisation User logs in with BTA for Pillar2

      Then("I should be on bta pillar2 ID check page")
        // ⚠️ No step-def match found for: I should be on bta pillar2 ID check page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      When("I select option No and continue to next")
        // ⚠️ No step-def match found for: I select option No and continue to next

      Then("I should navigate to bta register guidance page")
        // ⚠️ No step-def match found for: I should navigate to bta register guidance page

      When("I click Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab) link")
        // ⚠️ No step-def match found for: I click Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab) link

      Then("I should be redirected to guidance page in a new tab")
        // ⚠️ No step-def match found for: I should be redirected to guidance page in a new tab

    }

    Scenario("2 - Confirmation page for users with PLRID") {
      Given("Organisation User logs in with BTA for Pillar2")
        // ⚠️ No step-def match found for: Organisation User logs in with BTA for Pillar2

      Then("I should be on bta pillar2 ID check page")
        // ⚠️ No step-def match found for: I should be on bta pillar2 ID check page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      When("I select option Yes and continue to next")
        // ⚠️ No step-def match found for: I select option Yes and continue to next

      Then("I should navigate to eacd page")
        // ⚠️ No step-def match found for: I should navigate to eacd page

    }
  }
}
