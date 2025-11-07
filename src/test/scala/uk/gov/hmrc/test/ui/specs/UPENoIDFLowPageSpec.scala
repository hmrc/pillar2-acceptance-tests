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
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps.{andIShouldSeeRowValue, _}
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class UPENoIDFLowPageSpec extends BaseSpec with Matchers {

  Feature("UPE NO ID journey") {

    Scenario("1 - UPE No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId UPENoIDJourney for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "UPENoIDJourney")

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I enter UPE name as Test UPE")
      andIEnterAs("UPE name", "Test UPE")

      Then("I should navigate to input-upe-address page")
      thenIShouldNavigateTo("input-upe-address page")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 UPE",
        "addressLine3" -> "City UPE",
        "postalCode"   -> "Invalid",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UPE Contact person/team Name page")
      thenIShouldNavigateTo("UPE Contact person/team Name page")

      When("I enter UPE Person/Team name as Contact UPE")
      andIEnterAs("UPE Person/Team name", "Contact UPE")

      Then("I should navigate to UPE Contact Email page")
      thenIShouldNavigateTo("UPE Contact Email page")

      When("I enter UPE Email address as testcontactupe@email.com")
      andIEnterAs("UPE Email address", "testcontactupe@email.com")

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateTo("UPE Phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to input phone page")
      thenIShouldNavigateTo("input phone page")

      And("I enter Phone Number as 1234569")
      andIEnterAs("Phone Number", "1234569")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      Then("I am on feedback survey page")
      andIAmOnFeedbackSurveyPage()

      When("Organisation User logs in as upe with credId UPENoIDJourney for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "UPENoIDJourney")

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      Then("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE Phone page")
      thenIShouldBeOn("UPE Phone page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE Contact Email page")
      thenIShouldBeOn("UPE Contact Email page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE Contact person/team Name page")
      thenIShouldBeOn("UPE Contact person/team Name page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on input-upe-address page")
      thenIShouldBeOn("input-upe-address page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

    }

    Scenario("2 - Verify task list status") {
      Given("Organisation User logs in to subscribe for Pillar2")
      givenLogsInToSubscribeForPillar2("Organisation User")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateTo("Initial guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      And("I enter UPE name as Test UPE")
      andIEnterAs("UPE name", "Test UPE")

      Then("I should navigate to input-upe-address page")
      thenIShouldNavigateTo("input-upe-address page")

      When("I enter Address as:")
      val addressDetails: Map[String, String] = Map(
        "addressLine1" -> "Test Address Line 1",
        "addressLine3" -> "Test City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressDetails)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterAs("UPE Person/Team name", "UPE Contact Name")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter UPE Email address as testteam@email.com")
      andIEnterAs("UPE Email address", "testteam@email.com")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Phone Number as 123456")
      andIEnterAs("Phone Number", "123456")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to input phone page")
      thenIShouldNavigateTo("input phone page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateTo("UPE Phone page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      When("I click feedback link")
      andIClickLink("feedback")

      Then("I should be navigated to Send your feedback page")
      thenIShouldBeNavigatedToPage("Send your feedback")

    }

    Scenario("3 - Validate different error messages for UPE no ID journey pages") {
      Given("Organisation User logs in to subscribe for Pillar2")
      givenLogsInToSubscribeForPillar2("Organisation User")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateTo("Initial guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UPE business page")
      thenIShouldNavigateTo("UPE business page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I enter UPE name as Test upeName")
      andIEnterAs("UPE name", "Test upeName")

      Then("I should navigate to input-upe-address page")
      thenIShouldNavigateTo("input-upe-address page")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Test Address Line 1",
        "addressLine3" -> "Test City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UPE Contact person/team Name page")
      thenIShouldNavigateTo("UPE Contact person/team Name page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.")
      andIEnterAs(
        "UPE name",
        "UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters."
      )

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterAs("UPE Person/Team name", "UPE Contact Name")

      Then("I should navigate to UPE Contact Email page")
      thenIShouldNavigateTo("UPE Contact Email page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter UPE Email address as testTeamEmail")
      andIEnterAs("UPE Email address", "testTeamEmail")

      When("I enter UPE Email address as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com")
      andIEnterAs(
        "UPE Email address",
        "NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com"
      )

      When("I enter UPE Email address as testteam@email.com")
      andIEnterAs("UPE Email address", "testteam@email.com")

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateTo("UPE Phone page")

    }

//    Scenario("4 - Change UPE fields from UPE check your answers page") {
//      Given("Organisation User navigates to UPE check your answer page with credId UPENoIDJourney")
//      givenOrganisationUserNavigatesToCheckYourAnswerPageWithCredId("UPE", "UPENoIDJourney")
//
//      Then("I should be on Check your answers page")
//      thenIShouldBeOn("Check your answers page")
//
//      When("I click on change hyperlink next to the UPE Name")
//      andIClickOnChangeHyperlinkNextToThe("UPE Name")
//
//      And("I enter UPE name as Name Change @&#")
//      andIEnterAs("UPE name", "Name Change @&#")
//
//      And("I should see row 1 value Name Change @&#")
//      andIShouldSeeRowValue(1, "Name Change @&#")
//
//      When("I click on change hyperlink next to the UPE Address")
//      andIClickOnChangeHyperlinkNextToThe("UPE Address")
//
//      And("I enter Address Line 1 as Change Address &")
//      andIEnterAs("Address Line 1", "Change Address &")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      And("I should see row 2 value Change Address &")
//      andIShouldSeeRowValue(2, "Change Address &")
//
//      When("I click on change hyperlink next to the UPE Contact Name")
//      andIClickOnChangeHyperlinkNextToThe("UPE Contact Name")
//
//      And("I enter UPE Person/Team name as Change Contact Person~")
//      andIEnterAs("UPE Person/Team name", "Change Contact Person~")
//
//      Then("I should be on Check your answers page")
//      thenIShouldBeOn("Check your answers page")
//
//      And("I should see row 3 value Change Contact Person~")
//      andIShouldSeeRowValue(3, "Change Contact Person~")
//
//      When("I click on change hyperlink next to the UPE Email Address")
//      andIClickOnChangeHyperlinkNextToThe("UPE Email Address")
//
//      And("I enter UPE Email address as changetest&@email.com")
//      andIEnterAs("UPE Email address", "changetest&@email.com")
//
//      And("I should see row 4 value changetest&@email.com")
//      andIShouldSeeRowValue(4, "changetest&@email.com")
//
//      When("I click on change hyperlink next to the UPE Phone Number")
//      andIClickOnChangeHyperlinkNextToThe("UPE Phone Number")
//
//      And("I enter Phone Number as 12345679")
//      andIEnterAs("Phone Number", "12345679")
//
//      And("I should see row 6 value 12345679")
//      andIShouldSeeRowValue(6, "12345679")
//
//      When("I click on change hyperlink next to the UPE Phone Contact")
//      andIClickOnChangeHyperlinkNextToThe("UPE Phone Contact")
//
//      And("I select option No and continue to next")
//      andISelectOptionAndContinueToNext("No")
//
//      And("I should see row 5 value No")
//      andIShouldSeeRowValue(5, "No")
//
//      When("I click Report Pillar 2 Top-up Taxes link")
//      andIClickLink("Report Pillar 2 Top-up Taxes")
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//      When("I click Sign out link")
//      andIClickLink("Sign out")
//
//      Then("I am on feedback survey page")
//      andIAmOnFeedbackSurveyPage()
//
//      When("I click the browser back button")
//      andIClickTheBrowserBackButton()
//
//      Then("I should be on auth-login page")
//      thenIShouldBeOn("auth-login page")
//
//    }

    Scenario("5 - Status update for Enter ultimate parent’s details task") {
      Given("Organisation User logs in to subscribe for Pillar2")
      givenLogsInToSubscribeForPillar2("Organisation User")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateTo("Initial guidance Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I enter UPE name as Test UPE")
      andIEnterAs("UPE name", "Test UPE")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterAs("UPE Person/Team name", "UPE Contact Name")

      When("I enter UPE Email address as testteam@email.com")
      andIEnterAs("UPE Email address", "testteam@email.com")

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateTo("UPE Phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I navigate back to TaskList Page from Phone Page")
      thenINavigateBackToTaskListPageFromXPage("Phone")

      Then("The Task Add Ultimate Parent Entity details status should be In progress")
      andTheTaskStatusShouldBe("Add Ultimate Parent Entity details", "In progress")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      And("I navigate to Phone Question Page from Initial guidance Page")
      thenINavigateToPhoneQuestionPageFromInitialGuidancePage()

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I enter Phone Number as 123456")
      andIEnterAs("Phone Number", "123456")

      And("I navigate back to TaskList Page from Phone Input Page")
      thenINavigateBackToTaskListPageFromXPage("Phone Input")

      Then("The Task Edit Ultimate Parent Entity details status should be Completed")
      andTheTaskStatusShouldBe("Edit Ultimate Parent Entity details", "Completed")
    }
  }
}