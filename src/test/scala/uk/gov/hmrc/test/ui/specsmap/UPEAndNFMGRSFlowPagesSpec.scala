package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class UPEAndNFMGRSFlowPagesSpec extends AnyFeatureSpec with Matchers {

  Feature("Ultimate parent entity and Nominated Filling Member GRS journey") {

    Scenario("1 - Validate Error scenario and Entity type not listed hyperlink on UPE Org type page") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Entity type not listed and continue to Name page")
        andISelectOptionXAndContinueToNamePage("Entity type not listed")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - User registered as UkLimitedCompany successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - User registered as UkLimitedCompany successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - User registration as UkLimitedCompany failed with party type mismatch error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click go back to select the entity type link")
        andIClickXLink("go back to select the entity type")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click go back to select the entity type link")
        andIClickXLink("go back to select the entity type")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - User registration as UkLimitedCompany failed with generic error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - User registration as UkLimitedCompany failed with identifiers do not match error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Go back to select the entity type link")
        andIClickXLink("Go back to select the entity type")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Go back to select the entity type link")
        andIClickXLink("Go back to select the entity type")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("7 - User registration as UkLimitedCompany failed with BV failed error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("8 - User registered as LimitedLiabilityPartnership successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX()  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM LLP GRS page")
        thenIShouldNavigateToX("NFM LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX()  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("9 - User registered as UkLimitedCompany successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM LLP GRS page")
        thenIShouldNavigateToX("NFM LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX()  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("10 - User registration with LLP with different errors") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPESteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("11 - User can navigate to Entity type not listed hyperlink on NFM Org type page") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Entity type not listed and continue to Name page")
        andISelectOptionXAndContinueToNamePage("Entity type not listed")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM Name page")
        thenIShouldNavigateToX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("12 - UPE User error pages - ZAP-Accessibility Test") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I am on UPE registration failed error Page")
        givenIAmOnXPage("UPE registration failed error")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I am on UPE registration not called error Page")
        givenIAmOnXPage("UPE registration not called error")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I am on NFM registration failed error Page")
        givenIAmOnXPage("NFM registration failed error")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I am on NFM registration not called error Page")
        givenIAmOnXPage("NFM registration not called error")  // auto-chosen (score=1.00, CommonSteps.scala)

    }
  }
}
