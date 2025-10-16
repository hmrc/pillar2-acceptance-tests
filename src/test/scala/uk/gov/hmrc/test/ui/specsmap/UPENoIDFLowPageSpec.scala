package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class UPENoIDFLowPageSpec extends AnyFeatureSpec with Matchers {

  Feature("UPE NO ID journey") {

    Scenario("1 - UPE No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId UPENoIDJourney for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "UPENoIDJourney")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test UPE")
        andIEnterXAsX("UPE name", "Test UPE")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as Contact UPE")
        andIEnterXAsX("UPE Person/Team name", "Contact UPE")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Contact Email page")
        thenIShouldNavigateToX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Email address as testcontactupe@email.com")
        andIEnterXAsX("UPE Email address", "testcontactupe@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input phone page")
        thenIShouldNavigateToX("input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I enter Phone Number as 1234569")
        andIEnterXAsX("Phone Number", "1234569")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in as upe with credId UPENoIDJourney for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "UPENoIDJourney")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE Phone page")
        thenIShouldBeOnX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE Contact Email page")
        thenIShouldBeOnX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE Contact person/team Name page")
        thenIShouldBeOnX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on input-upe-address page")
        thenIShouldBeOnX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - Verify task list status") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
        andIClickXLink("Add Ultimate Parent Entity details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I enter UPE name as Test UPE")
        andIEnterXAsX("UPE name", "Test UPE")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UPE Person/Team name as UPE Contact Name")
        andIEnterXAsX("UPE Person/Team name", "UPE Contact Name")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UPE Email address as testteam@email.com")
        andIEnterXAsX("UPE Email address", "testteam@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Phone Number as 123456")
        andIEnterXAsX("Phone Number", "123456")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to input phone page")
        thenIShouldNavigateToX("input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click feedback link")
        andIClickXLink("feedback")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be navigated to Send your feedback page")
        thenIShouldBeNavigatedToXPage("Send your feedback")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("3 - Validate different error messages for UPE no ID journey pages") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
        andIClickXLink("Add Ultimate Parent Entity details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE business page")
        thenIShouldNavigateToX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test upeName")
        andIEnterXAsX("UPE name", "Test upeName")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.")
        andIEnterXAsX("UPE name", "UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Person/Team name as UPE Contact Name")
        andIEnterXAsX("UPE Person/Team name", "UPE Contact Name")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Contact Email page")
        thenIShouldNavigateToX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UPE Email address as testTeamEmail")
        andIEnterXAsX("UPE Email address", "testTeamEmail")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Email address as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com")
        andIEnterXAsX("UPE Email address", "NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Email address as testteam@email.com")
        andIEnterXAsX("UPE Email address", "testteam@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - Change UPE fields from UPE check your answers page") {
      Given("Organisation User navigates to UPE check your answer page with credId UPENoIDJourney")
        givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX("UPE", "UPENoIDJourney")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change hyperlink next to the UPE Name")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I enter UPE name as Name Change @&#")
        andIEnterXAsX("UPE name", "Name Change @&#")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I should see row 1 value Name Change @&#")
        // ⚠️ No step-def match found for: I should see row 1 value Name Change @&#

      When("I click on change hyperlink next to the UPE Address")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I enter Address Line 1 as Change Address &")
        andIEnterXAsX("Address Line 1", "Change Address &")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should see row 2 value Change Address &")
        // ⚠️ No step-def match found for: I should see row 2 value Change Address &

      When("I click on change hyperlink next to the UPE Contact Name")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I enter UPE Person/Team name as Change Contact Person~")
        andIEnterXAsX("UPE Person/Team name", "Change Contact Person~")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see row 3 value Change Contact Person~")
        // ⚠️ No step-def match found for: I should see row 3 value Change Contact Person~

      When("I click on change hyperlink next to the UPE Email Address")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I enter UPE Email address as changetest&@email.com")
        andIEnterXAsX("UPE Email address", "changetest&@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I should see row 4 value changetest&@email.com")
        // ⚠️ No step-def match found for: I should see row 4 value changetest&@email.com

      When("I click on change hyperlink next to the UPE Phone Number")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I enter Phone Number as 12345679")
        andIEnterXAsX("Phone Number", "12345679")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I should see row 6 value 12345679")
        // ⚠️ No step-def match found for: I should see row 6 value 12345679

      When("I click on change hyperlink next to the UPE Phone Contact")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I should see row 5 value No")
        // ⚠️ No step-def match found for: I should see row 5 value No

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - Status update for Enter ultimate parent’s details task") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
        andIClickXLink("Add Ultimate Parent Entity details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I enter UPE name as Test UPE")
        andIEnterXAsX("UPE name", "Test UPE")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as UPE Contact Name")
        andIEnterXAsX("UPE Person/Team name", "UPE Contact Name")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Email address as testteam@email.com")
        andIEnterXAsX("UPE Email address", "testteam@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I navigate back to TaskList Page from Phone Page")
        thenINavigateBackToTaskListPageFromXPage("Phone")  // auto-chosen (score=1.00, TaskListSteps.scala)

      Then("The Task Add Ultimate Parent Entity details status should be In progress")
        andTheTaskXStatusShouldBeX("Add Ultimate Parent Entity details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
        andIClickXLink("Add Ultimate Parent Entity details")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I navigate to Phone Question Page from Initial guidance Page")
        thenINavigateToPhoneQuestionPageFromInitialGuidancePage()  // auto-chosen (score=1.00, TaskListSteps.scala)

      And("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I enter Phone Number as 123456")
        andIEnterXAsX("Phone Number", "123456")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I navigate back to TaskList Page from Phone Input Page")
        thenINavigateBackToTaskListPageFromXPage("Phone Input")  // auto-chosen (score=1.00, TaskListSteps.scala)

      Then("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }
  }
}
