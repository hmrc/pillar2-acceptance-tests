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
import uk.gov.hmrc.test.ui.specs.tags.{AcceptanceTests, ZapAccessibility}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class FurtherDetailsTaskSpec extends BaseSpec with Matchers {

  Feature("Further Details Task page validation") {

    Scenario("1 - User navigates to check your answer page answering all the questions of Further Details Page",AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in as upe with credId FDTask for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "FDTask")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

      And("I should see the option In the UK and outside the UK remain selected")
      andIShouldSeeTheOptionXRemainSelected("In the UK and outside the UK")

      When("I select back link")
      andISelectBackLink()

      And("I select back link")
      andISelectBackLink()

      And("The Task Add further group details status should be In progress")
      andTheTaskStatusShouldBe("Add further group details", "In progress")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

      When("I select option Only in the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateTo("Group accounting period page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter account period as:")
      val dateRangeDataOne: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataOne)

      Then("I should navigate to FD check your answers page")
      thenIShouldNavigateTo("FD check your answers page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateTo("Group accounting period page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on FD check your answers page")
      thenIShouldBeOn("FD check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      And("The Task Edit further group details status should be Completed")
      andTheTaskStatusShouldBe("Edit further group details", "Completed")

      When("I click Sign out link")
      andIClickLink("Sign out")

      Then("I am on feedback survey page")
      andIAmOnFeedbackSurveyPage()

      When("Organisation User logs in with credId FDTask for Pillar2")
      givenLogsInWithCredIdForPillar2("Organisation User", "FDTask")

      And("The Task Edit further group details status should be Completed")
      andTheTaskStatusShouldBe("Edit further group details", "Completed")

      When("I click Edit further group details link")
      andIClickLink("Edit further group details")

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

      And("I should see the option Only in the UK remain selected")
      andIShouldSeeTheOptionXRemainSelected("Only in the UK")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateTo("Group accounting period page")

      And("I should see date field Start Day is pre-populated with 15")
      andIShouldSeeDateFieldXIsPrepopulatedWithX("Start Day", "15")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

    }

//    Scenario("2 - Change all the details from Furthers details check your answers page", AcceptanceTests, ZapAccessibility) {
//      Given("Organisation User navigates to FD check your answer page with credId FDTask")
//      givenOrganisationUserNavigatesToCheckYourAnswerPageWithCredId("FD", "FDTask")
//
//      Then("I should be on FD check your answers page")
//      thenIShouldBeOn("FD check your answers page")
//
//      When("I click on change hyperlink next to the FD Group Status")
//      andIClickOnChangeHyperlinkNextToThe("FD Group Status")
//
//      When("I select option In the UK and outside the UK in further details group status page")
//      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")
//
//      Then("I should be on FD check your answers page")
//      thenIShouldBeOn("FD check your answers page")
//
//      And("I should see row 1 value In the UK and outside the UK")
//      andIShouldSeeRowValue(1, "In the UK and outside the UK")
//
//      When("I click on change hyperlink next to the Accounting Period")
//      andIClickOnChangeHyperlinkNextToThe("Accounting Period")
//
//      When("I enter account period as:")
//      val dateRangeDatTwo: Map[String, String] = Map(
//        "startDate.day"   -> "15",
//        "startDate.month" -> "1",
//        "startDate.year"  -> "2024",
//        "endDate.day"     -> "15",
//        "endDate.month"   -> "1",
//        "endDate.year"    -> "2025"
//      )
//      andIEnterAccountPeriodAs(dateRangeDatTwo)
//
//      And("I should see row 3 value 5 May 2025")
//      andIShouldSeeRowValue(3, "5 May 2025")
//
//      And("I should see row 4 value 5 June 2026")
//      andIShouldSeeRowValue(4, "5 June 2026")
//    }

    Scenario("3 - Accounting period page Error Validations",AcceptanceTests, ZapAccessibility) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("Organisation User logs in as upe with credId APErrors for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "APErrors")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option Only in the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateTo("Group accounting period page")
    }
  }
}