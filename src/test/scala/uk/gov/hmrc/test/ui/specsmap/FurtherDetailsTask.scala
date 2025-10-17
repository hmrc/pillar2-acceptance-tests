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
import uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class FurtherDetailsTask extends AnyFeatureSpec with Matchers {

  Feature("Further Details Task page validation") {

    Scenario("1 - User navigates to check your answer page answering all the questions of Further Details Page") {
      Given("Organisation User logs in as upe with credId FDTask for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "FDTask")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see the option In the UK and outside the UK remain selected")
        andIShouldSeeTheOptionXRemainSelected("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Add further group details status should be In progress")
        andTheTaskXStatusShouldBeX("Add further group details", "In progress")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      Then("I should navigate to FD check your answers page")
        thenIShouldNavigateToX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit further group details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit further group details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in with credId FDTask for Pillar2")
        givenXLogsInWithCredIdXForPillar2("Organisation User", "FDTask")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("The Task Edit further group details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit further group details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Edit further group details link")
        andIClickXLink("Edit further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see the option Only in the UK remain selected")
        andIShouldSeeTheOptionXRemainSelected("Only in the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see date field Start Day is pre-populated with 15")
        andIShouldSeeDateFieldXIsPrepopulatedWithX("Start Day", "15")  // auto-chosen (score=0.85, SubscriptionJourneySteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - Change all the details from Furthers details check your answers page") {
      Given("Organisation User navigates to FD check your answer page with credId FDTask")
        givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX("FD", "FDTask")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change hyperlink next to the FD Group Status")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see row 1 value In the UK and outside the UK")
        // ⚠️ No step-def match found for: I should see row 1 value In the UK and outside the UK

      When("I click on change hyperlink next to the Accounting Period")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I should see row 3 value 5 May 2025")
        // ⚠️ No step-def match found for: I should see row 3 value 5 May 2025

      And("I should see row 4 value 5 June 2026")
        // ⚠️ No step-def match found for: I should see row 4 value 5 June 2026

      And("I should see row 4 value 5 June 2026")
        // ⚠️ No step-def match found for: I should see row 4 value 5 June 2026

    }

    Scenario("3 - Accounting period page Error Validations") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("Organisation User logs in as upe with credId APErrors for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "APErrors")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

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

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
