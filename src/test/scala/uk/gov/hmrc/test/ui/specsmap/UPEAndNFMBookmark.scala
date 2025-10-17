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

package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class UPEAndNFMBookmark extends AnyFeatureSpec with Matchers {

  Feature("Bookmark Feature") {

    Scenario("1 - User fill the information for UPE and NFM no ID flow and try moving ahead in the journey without answering mandatory questions") {
      Given("Organisation User logs in as upe with credId Bookmark1 for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "Bookmark1")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test Bookmark")
        andIEnterXAsX("UPE name", "Test Bookmark")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address Line 1 as Address Line 1")
        andIEnterXAsX("Address Line 1", "Address Line 1")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter City as City")
        andIEnterXAsX("City", "City")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Postal Code as EH5 5WY")
        andIEnterXAsX("Postal Code", "EH5 5WY")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Country as United Kingdom")
        andIEnterXAsX("Country", "United Kingdom")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Country selected")
        whenIClickOnCountrySelected("I click on Country selected")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as Bookmark contact")
        andIEnterXAsX("UPE Person/Team name", "Bookmark contact")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact Email page")
        thenIShouldNavigateToX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Email address as test@email.com")
        andIEnterXAsX("UPE Email address", "test@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to NFM Name page")
        thenIShouldNavigateToX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in to nfm org page with CredID Bookmark1 for Pillar2")
        givenXLogsInToNfmOrgPageWithCredIDXForPillar2("Organisation User", "Bookmark1")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("The Heading should be There has been an error")
        thenTheHeadingShouldBeX()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
        andIClickXLink("return to your Pillar 2 Top-up Taxes registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see task list sections")
        andIShouldSeeTaskListSections()  // auto-chosen (score=1.00, TaskListSteps.scala)

      And("The Task Add filing member details status should be In progress")
        andTheTaskXStatusShouldBeX("Add filing member details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("2 - User completes UPE GRS journey and try navigating to NFM NO ID flow") {
      Given("Organisation User logs in as upe with credId Bookmark2 for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "Bookmark2")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in to upe name page with CredID Bookmark2 for Pillar2")
        givenXLogsInToUpeNamePageWithCredIDXForPillar2("Organisation User", "Bookmark2")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
        andIClickXLink("return to your Pillar 2 Top-up Taxes registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add ultimate parent’s details status should be In progress")
        andTheTaskXStatusShouldBeX("Add ultimate parent’s details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

      Then("I click Add ultimate parent’s details link")
        andIClickXLink("Add ultimate parent’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("The Heading should be We need to match the details of the Ultimate Parent Entity to HMRC records")
        thenTheHeadingShouldBeX()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Initial guidance Page")
        thenIShouldBeOnX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see the answer Yes remain selected")
        andIShouldSeeTheAnswerXRemainSelected("Yes")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see the option UK limited company remain selected")
        andIShouldSeeTheOptionXRemainSelected("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

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

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("Organisation User logs in to nfm name page with CredID Bookmark2 for Pillar2")
        givenXLogsInToNfmNamePageWithCredIDXForPillar2("Organisation User", "Bookmark2")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
        andIClickXLink("return to your Pillar 2 Top-up Taxes registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add filing member details status should be In progress")
        andTheTaskXStatusShouldBeX("Add filing member details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("3 - User completes GRS journey and validate populated value after sign out") {
      Given("Organisation User logs in as upe with credId Bookmark3 for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "Bookmark3")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      And("The Task Edit ultimate parent's details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit ultimate parent's details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in to upe registered in UK page with CredID Bookmark3 for Pillar2")
        givenXLogsInToUpeRegisteredInUKPageWithCredIDXForPillar2("Organisation User", "Bookmark3")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see the option UK limited company remain selected")
        andIShouldSeeTheOptionXRemainSelected("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - User completes UPE GRS journey without answering mandatory questions") {
      Given("Organisation User logs in as upe with credId Bookmark4 for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "Bookmark4")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Continue button")
        // ⚠️ No step-def match found for: I click Continue button

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in to upe org page with CredID Bookmark4 for Pillar2")
        givenXLogsInToUpeOrgPageWithCredIDXForPillar2("Organisation User", "Bookmark4")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Body content should be You must return to your Pillar 2 Top-up Taxes registration and complete the required tasks.")
        thenTheBodyContentShouldBeX()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
        andIClickXLink("return to your Pillar 2 Top-up Taxes registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see task list sections")
        andIShouldSeeTaskListSections()  // auto-chosen (score=1.00, TaskListSteps.scala)

      And("The Task Add ultimate parent’s details status should be Not started")
        andTheTaskXStatusShouldBeX("Add ultimate parent’s details", "Not started")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("5 - Validate Bookmark error for NFM Contact Name and NFM Contact Email Pages") {
      Given("Organisation User logs in NFM Contact Name page for Pillar2")
        givenXLogsInNFMContactNamePageForPillar2("Organisation User")  // auto-chosen (score=1.00, NFMSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Given("Organisation User logs in NFM Contact Email page for Pillar2")
        givenXLogsInNFMContactEmailPageForPillar2("Organisation User")  // auto-chosen (score=1.00, NFMSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - Validate Bookmark for UPE/NFM Name and NFM Address Pages") {
      When("Organisation User logs in to upe name page with CredID Bookmark2 for Pillar2")
        givenXLogsInToUpeNamePageWithCredIDXForPillar2("Organisation User", "Bookmark2")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Given("Organisation User logs in to nfm name page with CredID Bookmark2 for Pillar2")
        givenXLogsInToNfmNamePageWithCredIDXForPillar2("Organisation User", "Bookmark2")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Given("Organisation User logs in NFM name page for Pillar2")
        givenXLogsInNFMNamePageForPillar2("Organisation User")  // auto-chosen (score=1.00, NFMSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Given("Organisation User logs in NFM address page for Pillar2")
        givenXLogsInNFMAddressPageForPillar2("Organisation User")  // auto-chosen (score=1.00, NFMSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("7 - Validate Bookmark for UPE/NFM Name and NFM Address Pages") {
      When("Organisation User logs in to nfm org page with CredID Bookmark1 for Pillar2")
        givenXLogsInToNfmOrgPageWithCredIDXForPillar2("Organisation User", "Bookmark1")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Bookmark page")
        thenIShouldBeOnX("Bookmark page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
