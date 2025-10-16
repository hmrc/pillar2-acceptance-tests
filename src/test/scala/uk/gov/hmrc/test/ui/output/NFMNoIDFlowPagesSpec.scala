package uk.gov.hmrc.test.ui.specs
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
class NFMNoIDFlowPagesSpec extends AnyFeatureSpec with Matchers {

  Feature("NFM NO ID journey") {

    Scenario("1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId NFMCYA for Pillar2")
        // ⚠️ No step-def match found for: Organisation User logs in as upe with credId NFMCYA for Pillar2

      When("I select option Yes and continue to next")
        // ⚠️ No step-def match found for: I select option Yes and continue to next

      When("I select option UK limited company and continue to GRS page")
        // ⚠️ No step-def match found for: I select option UK limited company and continue to GRS page

      When("I registered successfully with BV enabled")
        // ⚠️ No step-def match found for: I registered successfully with BV enabled

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        // ⚠️ No step-def match found for: I click Add filing member details link

      Then("I should navigate to NFM registration page")
        // ⚠️ No step-def match found for: I should navigate to NFM registration page

      When("I select Yes option and continue to next")
        // ⚠️ No step-def match found for: I select Yes option and continue to next

      Then("I should navigate to NFM details page")
        // ⚠️ No step-def match found for: I should navigate to NFM details page

      When("I select option No and continue to next")
        // ⚠️ No step-def match found for: I select option No and continue to next

      Then("I should navigate to NFM Name page")
        // ⚠️ No step-def match found for: I should navigate to NFM Name page

      When("I enter NFM name as Test CYA")
        // ⚠️ No step-def match found for: I enter NFM name as Test CYA

      Then("I should navigate to NFM Address page")
        // ⚠️ No step-def match found for: I should navigate to NFM Address page

      When("I enter Address as:")
        // ⚠️ No step-def match found for: I enter Address as:

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("I should navigate to NFM Contact Name page")
        // ⚠️ No step-def match found for: I should navigate to NFM Contact Name page

      When("I enter NFM Contact name as Contact CYA")
        // ⚠️ No step-def match found for: I enter NFM Contact name as Contact CYA

      Then("I should navigate to NFM Contact Email page")
        // ⚠️ No step-def match found for: I should navigate to NFM Contact Email page

      When("I enter NFM Contact Email as testcya@email.com")
        // ⚠️ No step-def match found for: I enter NFM Contact Email as testcya@email.com

      Then("I should navigate to NFM Phone page")
        // ⚠️ No step-def match found for: I should navigate to NFM Phone page

      When("I select option Yes and continue to next")
        // ⚠️ No step-def match found for: I select option Yes and continue to next

      Then("I should navigate to input nfm phone page")
        // ⚠️ No step-def match found for: I should navigate to input nfm phone page

      When("I enter NFM Phone Number as 1234569")
        // ⚠️ No step-def match found for: I enter NFM Phone Number as 1234569

      Then("I should navigate to NFM Check your answers page")
        // ⚠️ No step-def match found for: I should navigate to NFM Check your answers page

      And("I should see details as below:")
        // ⚠️ No step-def match found for: I should see details as below:

      When("I select back link")
        // ⚠️ No step-def match found for: I select back link

      Then("I should navigate to input nfm phone page")
        // ⚠️ No step-def match found for: I should navigate to input nfm phone page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("I should be on NFM Check your answers page")
        // ⚠️ No step-def match found for: I should be on NFM Check your answers page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("I should be on Task list page")
        // ⚠️ No step-def match found for: I should be on Task list page

      And("The Task Edit filing member details status should be Completed")
        // ⚠️ No step-def match found for: The Task Edit filing member details status should be Completed

    }

    Scenario("2 - Validate different error messages for NFM no ID journey pages") {
      Given("Organisation User logs in without Pillar2 enrolment")
        // ⚠️ No step-def match found for: Organisation User logs in without Pillar2 enrolment

      And("I select option Yes and continue to next")
        // ⚠️ No step-def match found for: I select option Yes and continue to next

      And("I select option UK limited company and continue to GRS page")
        // ⚠️ No step-def match found for: I select option UK limited company and continue to GRS page

      And("I registered successfully with BV enabled")
        // ⚠️ No step-def match found for: I registered successfully with BV enabled

      When("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        // ⚠️ No step-def match found for: I click Add filing member details link

      When("I select Yes option and continue to next")
        // ⚠️ No step-def match found for: I select Yes option and continue to next

      Then("I should navigate to NFM details page")
        // ⚠️ No step-def match found for: I should navigate to NFM details page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      When("I select option No and continue to next")
        // ⚠️ No step-def match found for: I select option No and continue to next

      Then("I should navigate to NFM Name page")
        // ⚠️ No step-def match found for: I should navigate to NFM Name page

      When("I enter NFM name as Test nfmName")
        // ⚠️ No step-def match found for: I enter NFM name as Test nfmName

      Then("I should navigate to NFM Address page")
        // ⚠️ No step-def match found for: I should navigate to NFM Address page

      When("I enter Address Line 1 as Test Address Line 1")
        // ⚠️ No step-def match found for: I enter Address Line 1 as Test Address Line 1

      And("I enter Address Line 2 as Test Address Line 2")
        // ⚠️ No step-def match found for: I enter Address Line 2 as Test Address Line 2

      And("I enter Region as Region")
        // ⚠️ No step-def match found for: I enter Region as Region

      And("I enter City as Test City")
        // ⚠️ No step-def match found for: I enter City as Test City

      When("I enter Postal Code as 1334445")
        // ⚠️ No step-def match found for: I enter Postal Code as 1334445

      And("I enter Country as Australia")
        // ⚠️ No step-def match found for: I enter Country as Australia

      And("I click on Country selected")
        // ⚠️ No step-def match found for: I click on Country selected

      And("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("I should navigate to NFM Contact Name page")
        // ⚠️ No step-def match found for: I should navigate to NFM Contact Name page

      When("I enter NFM Contact name as NFM Contact")
        // ⚠️ No step-def match found for: I enter NFM Contact name as NFM Contact

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("I should navigate to NFM Contact Email page")
        // ⚠️ No step-def match found for: I should navigate to NFM Contact Email page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      And("I enter NFM Contact Email as test@email.com")
        // ⚠️ No step-def match found for: I enter NFM Contact Email as test@email.com

      Then("I should navigate to NFM Phone page")
        // ⚠️ No step-def match found for: I should navigate to NFM Phone page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      When("I select option Yes and continue to next")
        // ⚠️ No step-def match found for: I select option Yes and continue to next

      Then("I should navigate to input nfm phone page")
        // ⚠️ No step-def match found for: I should navigate to input nfm phone page

      When("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      When("I enter NFM Phone Number as 9923-456")
        // ⚠️ No step-def match found for: I enter NFM Phone Number as 9923-456

      When("I click on change hyperlink next to the NFM Phone Contact")
        // ⚠️ No step-def match found for: I click on change hyperlink next to the NFM Phone Contact

      And("I select option No and continue to next")
        // ⚠️ No step-def match found for: I select option No and continue to next

      And("I should see row 5 value No")
        // ⚠️ No step-def match found for: I should see row 5 value No

      And("I select back link")
        // ⚠️ No step-def match found for: I select back link

      Then("I should see the answer No remain selected")
        // ⚠️ No step-def match found for: I should see the answer No remain selected

      And("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      And("I click on Continue button")
        // ⚠️ No step-def match found for: I click on Continue button

      Then("The Task Edit filing member details status should be Completed")
        // ⚠️ No step-def match found for: The Task Edit filing member details status should be Completed

    }
  }
}
