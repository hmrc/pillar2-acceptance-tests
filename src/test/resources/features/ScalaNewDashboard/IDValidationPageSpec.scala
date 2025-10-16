import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec

class IDValidationPageSpec extends AnyFeatureSpec with Matchers {

  Feature("BTA user registration for Pillar 2 service") {

    Scenario("1 - Validation page and guidance page for users with NO PLRID and error validation.") {
      Given("Organisation User logs in with BTA for Pillar2")
      Then("I should be on bta pillar2 ID check page")
      When("I click on Continue button")
      When("I select option No and continue to next")
      Then("I should navigate to bta register guidance page")
      When("I click Find out how to register to report Pillar 2 Top-up Taxes (opens in new tab) link")
      Then("I should be redirected to guidance page in a new tab")
    }

    Scenario("2 - Confirmation page for users with PLRID") {
      Given("Organisation User logs in with BTA for Pillar2")
      Then("I should be on bta pillar2 ID check page")
      When("I click on Continue button")
      When("I select option Yes and continue to next")
      Then("I should navigate to eacd page")
    }
  }
}
