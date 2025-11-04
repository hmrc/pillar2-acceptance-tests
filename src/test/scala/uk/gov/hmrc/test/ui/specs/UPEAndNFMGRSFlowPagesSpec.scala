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
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.specstepdef.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class UPEAndNFMGRSFlowPagesSpec extends BaseSpec with Matchers {

  Feature("Ultimate parent entity and Nominated Filling Member GRS journey") {

    Scenario("1 - Validate Error scenario and Entity type not listed hyperlink on UPE Org type page") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Entity type not listed and continue to Name page")
        andISelectOptionXAndContinueToNamePage("Entity type not listed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - User registered as UkLimitedCompany successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - User registered as UkLimitedCompany successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - User registration as UkLimitedCompany failed with party type mismatch error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back to select the entity type link")
        andIClickXLink("go back to select the entity type")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back to select the entity type link")
        andIClickXLink("go back to select the entity type")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("5 - User registration as UkLimitedCompany failed with generic error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - User registration as UkLimitedCompany failed with identifiers do not match error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Go back to select the entity type link")
        andIClickXLink("Go back to select the entity type")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Go back to select the entity type link")
        andIClickXLink("Go back to select the entity type")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("7 - User registration as UkLimitedCompany failed with BV failed error") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
        thenIShouldNavigateToX("NFM UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("8 - User registered as LimitedLiabilityPartnership successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM LLP GRS page")
        thenIShouldNavigateToX("NFM LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("9 - User registered as UkLimitedCompany successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM LLP GRS page")
        thenIShouldNavigateToX("NFM LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV disabled")
        andIRegisteredSuccessfullyWithX("BV disabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("The json response Body should contain the status registrationStatus : REGISTERED")
        thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("10 - User registration with LLP with different errors") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to LLP GRS page")
        thenIShouldNavigateToX("LLP GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
        thenIShouldBeOnX("UPE registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
        thenIShouldBeOnX("UPE registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("Limited liability partnership")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
        andRegistrationIsUnsuccessfulWithXError("party type mismatch")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with generic error error")
        andRegistrationIsUnsuccessfulWithXError("generic error")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
        thenIShouldBeOnX("NFM registration failed error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
        andRegistrationIsUnsuccessfulWithXError("identifiers not match")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("registration is unsuccessful with BV failed error")
        andRegistrationIsUnsuccessfulWithXError("BV failed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
        thenIShouldBeOnX("NFM registration not called error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("11 - User can navigate to Entity type not listed hyperlink on NFM Org type page") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
        thenIShouldNavigateToX("UKCompany GRS page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
        thenIShouldBeOnX("NFM entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Entity type not listed and continue to Name page")
        andISelectOptionXAndContinueToNamePage("Entity type not listed")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Name page")
        thenIShouldNavigateToX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("12 - UPE User error pages - ZAP-Accessibility Test") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I am on UPE registration failed error Page")
        givenIAmOnXPage("UPE registration failed error")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I am on UPE registration not called error Page")
        givenIAmOnXPage("UPE registration not called error")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I am on NFM registration failed error Page")
        givenIAmOnXPage("NFM registration failed error")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I am on NFM registration not called error Page")
        givenIAmOnXPage("NFM registration not called error")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }
  }
}
