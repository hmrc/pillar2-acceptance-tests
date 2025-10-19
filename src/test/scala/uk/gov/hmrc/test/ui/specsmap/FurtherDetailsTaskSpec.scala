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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class FurtherDetailsTaskSpec extends AnyFeatureSpec with Matchers {

  Feature("Further Details Task page validation") {

    Scenario("1 - User navigates to check your answer page answering all the questions of Further Details Page") {
      Given("Organisation User logs in as upe with credId FDTask for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "FDTask")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see the option In the UK and outside the UK remain selected")
        andIShouldSeeTheOptionXRemainSelected("In the UK and outside the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Add further group details status should be In progress")
        andTheTaskXStatusShouldBeX("Add further group details", "In progress")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

      Then("I should navigate to FD check your answers page")
        thenIShouldNavigateToX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit further group details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit further group details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPEStepsSteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in with credId FDTask for Pillar2")
        givenXLogsInWithCredIdXForPillar2("Organisation User", "FDTask")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("The Task Edit further group details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit further group details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Edit further group details link")
        andIClickXLink("Edit further group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see the option Only in the UK remain selected")
        andIShouldSeeTheOptionXRemainSelected("Only in the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see date field Start Day is pre-populated with 15")
        // ⚠️ No step-def match found for: I should see date field Start Day is pre-populated with 15

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Change all the details from Furthers details check your answers page") {
      Given("Organisation User navigates to FD check your answer page with credId FDTask")
        givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX("FD", "FDTask")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the FD Group Status")
        andIClickOnChangeHyperlinkNextToTheX("FD Group Status")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should be on FD check your answers page")
        thenIShouldBeOnX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see row 1 value In the UK and outside the UK")
        // ⚠️ No step-def match found for: I should see row 1 value In the UK and outside the UK

      When("I click on change hyperlink next to the Accounting Period")
        andIClickOnChangeHyperlinkNextToTheX("Accounting Period")  // auto-chosen (score=1.00, CYAStepsSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

      And("I should see row 3 value 5 May 2025")
        // ⚠️ No step-def match found for: I should see row 3 value 5 May 2025

      And("I should see row 4 value 5 June 2026")
        // ⚠️ No step-def match found for: I should see row 4 value 5 June 2026

      And("I should see row 4 value 5 June 2026")
        // ⚠️ No step-def match found for: I should see row 4 value 5 June 2026

    }

    Scenario("3 - Accounting period page Error Validations") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Given("Organisation User logs in as upe with credId APErrors for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "APErrors")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
