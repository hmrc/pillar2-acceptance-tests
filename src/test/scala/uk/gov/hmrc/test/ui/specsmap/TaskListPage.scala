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
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class TaskListPage extends AnyFeatureSpec with Matchers {

  Feature("Task list page") {

    Scenario("2 - Complete the GRS journey for UPE/NFM and change the journey to no ID") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add ultimate parent’s details link")
        andIClickXLink("Add ultimate parent’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Edit filing member’s details link")
        andIClickXLink("Edit filing member’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      Then("I should be on NFM Name page")
        thenIShouldBeOnX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add filing member details status should be In progress")
        andTheTaskXStatusShouldBeX("Add filing member details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Edit ultimate parent's details link")
        andIClickXLink("Edit ultimate parent's details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add ultimate parent’s details status should be In progress")
        andTheTaskXStatusShouldBeX("Add ultimate parent’s details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("3 - Complete the No ID journey for UPE/NFM and change the journey to GRS") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add ultimate parent’s details link")
        andIClickXLink("Add ultimate parent’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      When("I enter NFM name as Test CYA")
        andIEnterXAsX("NFM name", "Test CYA")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Address Line 1 as Address Line 1")
        andIEnterXAsX("Address Line 1", "Address Line 1")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter City as City")
        andIEnterXAsX("City", "City")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Postal Code as EH5 5WY")
        andIEnterXAsX("Postal Code", "EH5 5WY")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Country as United Kingdom")
        andIEnterXAsX("Country", "United Kingdom")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Country selected")
        whenIClickOnCountrySelected("I click on Country selected")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM Contact Name page")
        thenIShouldNavigateToX("NFM Contact Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter NFM Contact name as Contact Name")
        andIEnterXAsX("NFM Contact name", "Contact Name")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM Contact Email page")
        thenIShouldNavigateToX("NFM Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter NFM Contact Email as teststatus@email.com")
        andIEnterXAsX("NFM Contact Email", "teststatus@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM Phone page")
        thenIShouldNavigateToX("NFM Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input nfm phone page")
        thenIShouldNavigateToX("input nfm phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter NFM Phone Number as 1234569")
        andIEnterXAsX("NFM Phone Number", "1234569")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM Check your answers page")
        thenIShouldNavigateToX("NFM Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Edit filing member’s details link")
        andIClickXLink("Edit filing member’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add filing member details status should be In progress")
        andTheTaskXStatusShouldBeX("Add filing member details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Edit ultimate parent's details link")
        andIClickXLink("Edit ultimate parent's details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to UPE entity type page")
        thenIShouldNavigateToX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add ultimate parent’s details status should be In progress")
        andTheTaskXStatusShouldBeX("Add ultimate parent’s details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("4 - Task list page status update validation after Task1 completion and navigating to different pages") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Heading should be Register your group")
        thenTheHeadingShouldBeX()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add ultimate parent’s details link")
        andIClickXLink("Add ultimate parent’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test Task List")
        andIEnterXAsX("UPE name", "Test Task List")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address Line 1 as Address Line 1")
        andIEnterXAsX("Address Line 1", "Address Line 1")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter City as City")
        andIEnterXAsX("City", "City")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Postal Code as EK567k34")
        andIEnterXAsX("Postal Code", "EK567k34")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Country as China")
        andIEnterXAsX("Country", "China")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Country selected")
        whenIClickOnCountrySelected("I click on Country selected")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as Contact")
        andIEnterXAsX("UPE Person/Team name", "Contact")  // auto-chosen (score=1.00, UPESteps.scala)

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

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see the task name Edit ultimate parent's details on Business details section")
        andIShouldSeeTheTaskNameXOnBusinessDetailsSection("Edit ultimate parent's details")  // auto-chosen (score=1.00, TaskListSteps.scala)

      And("The Task Edit ultimate parent's details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit ultimate parent's details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Edit ultimate parent's details link")
        andIClickXLink("Edit ultimate parent's details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact Email page")
        thenIShouldNavigateToX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to input phone page")
        thenIShouldNavigateToX("input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I navigate back to TaskList Page from Phone Page")
        thenINavigateBackToTaskListPageFromXPage("Phone")  // auto-chosen (score=1.00, TaskListSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit ultimate parent's details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit ultimate parent's details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }

    Scenario("5 - User completes GRS journey and Navigate to different pages of GRS journey and validates status") {
      Given("Organisation User logs in to subscribe for Pillar2")
        givenXLogsInToSubscribeForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Heading should be Register your group")
        thenTheHeadingShouldBeX()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add ultimate parent’s details link")
        andIClickXLink("Add ultimate parent’s details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

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

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit ultimate parent's details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit ultimate parent's details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Edit ultimate parent's details link")
        andIClickXLink("Edit ultimate parent's details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Initial guidance Page")
        thenIShouldNavigateToX("Initial guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I navigate back to TaskList Page from GRS Page")
        thenINavigateBackToTaskListPageFromXPage("GRS")  // auto-chosen (score=1.00, TaskListSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit ultimate parent's details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit ultimate parent's details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

    }
  }
}
