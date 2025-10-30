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
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class UPEAndNFMGRSFlowPagesSpec extends BaseSpec with Matchers {

  Feature("Ultimate parent entity and Nominated Filling Member GRS journey") {

    Scenario("1 - User registers a Uk Limited Company successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV Enabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      And("The user adds a Uk Limited Company as a Nominated Filing Member with BV Enabled")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user ends up back on the task list")
      TaskListPage.onPage()
//      And("The user adds Uk as Entity location and enters the Accounting period")
//      TaskListPage.clickAddFurtherGroupDetailsLink()
//      FDGroupStatusPage.selectOnlyUk()
//      FDGroupAccountingPeriodPage.enterDates()
//      FDCheckYourAnswersPage.continueToNextPage()
//
//      And("The user adds contact details")
//      TaskListPage.clickAddContactDetailsLink()
//      ContactDetailsGuidancePage.continueToNextPage()
//      ContactDetailsInputNamePage.enterName()
//      ContactDetailsInputEmailPage.enterEmail()
//      ContactDetailsPhoneAsContactPage.selectYes()
//      ContactDetailsInputPhonePage.enterPhoneNumber()
//      SecondContactDetailsPage.selectNo()
//      ContactAddressInputPage.enterAddressUK()
//      ContactDetailsCheckAnswersPage.continueToNextPage()
//
//      Then("The user reviews and submits")
//      TaskListPage.clickReviewAndSubmitLink()
//      ReviewAnswersPage.continueToNextPage()
    }

    Scenario("2 - User registers a Uk Limited Company successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV Disabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvDisabled()

      And("The user adds a Uk Limited Company as a Nominated Filing Member with BV Enabled")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationSuccessBvDisabled()

      Then("The user ends up back on the task list")
      TaskListPage.onPage()
    }

    Scenario("3 - User registration as UkLimitedCompany failed with party type mismatch error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Failed Party Type Mismatch")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationFailedPartyTypeMismatch()

      When("The user is presented with the mismatching-details error page")
      UPEGRSRegistrationFailedErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user adds a Uk Limited Company as a Nominated Filing Member with Failed Party Type Mismatch")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationFailedPartyTypeMismatch()

      When("The user is presented with the mismatching-details error page")
      NFMGRSRegistrationFailedErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("4 - User registration as Uk Limited Company failed with generic error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Generic Error")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationFailedGeneric()

      When("The user is presented with the mismatching-details error page")
      UPEGRSRegistrationFailedErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user adds a Uk Limited Company as a Nominated Filing Member with Generic Error")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationFailedGeneric()

      When("The user is presented with the mismatching-details error page")
      NFMGRSRegistrationFailedErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("5 - User registration as Uk Limited Company failed with Identifiers Mismatch error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Identifiers Mismatch")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationNotCalledIdentifierMismatch()

      When("The user is presented with the Identifiers Mismatch error page")
      UPEGRSRegistrationNotCalledErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user adds a Uk Limited Company as a Nominated Filing Member with Identifiers Mismatch")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationNotCalledIdentifierMismatch()

      When("The user is presented with the Identifiers Mismatch error page")
      NFMGRSRegistrationNotCalledErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("6 - User registration as UkLimitedCompany failed with BV failed error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV failed")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationNotCalledBvFailed()

      When("The user is presented with the BV failed error page")
      UPEGRSRegistrationNotCalledErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.enterEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user adds a Uk Limited Company as a Nominated Filing Member with BV failed")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationNotCalledBvFailed()

      When("The user is presented with the BV failed error page")
      NFMGRSRegistrationNotCalledErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("7 - User registered as Limited Liability Partnership successfully with BV enabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Limited Liability Partnership as an Ultimate Parent Entity with BV Enabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeLimitedLiabilityPartnership()
      UPELLPGRSPage.clickRegistrationSuccessBvEnabled()

      And("The user adds a Limited Liability Partnership as a Nominated Filing Member with BV Enabled")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeLimitedLiabilityPartnership()
      NFMLLPGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user ends up back on the task list")
      TaskListPage.onPage()
    }

    Scenario("8 - User registered as Limited Liability Partnership successfully with BV disabled") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment()

      And("The user adds a Limited Liability Partnership as an Ultimate Parent Entity with BV disabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.enterEntityTypeLimitedLiabilityPartnership()
      UPELLPGRSPage.clickRegistrationSuccessBvDisabled()

      And("The user adds a Limited Liability Partnership as a Nominated Filing Member with BV disabled")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeLimitedLiabilityPartnership()
      NFMLLPGRSPage.clickRegistrationSuccessBvDisabled()

      Then("The user ends up back on the task list")
      TaskListPage.onPage()
    }

    Scenario("11 - User can navigate to Entity type not listed hyperlink on NFM Org type page") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenXLogsInWithoutPillar2Enrolment() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE business page")
      thenIShouldBeOnX("UPE business page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
      thenIShouldBeOnX("UPE entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateToX("UKCompany GRS page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
      // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
      andTheTaskXStatusShouldBeX("Edit Ultimate Parent Entity details", "Completed") // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateToX("NFM registration page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
      thenIShouldNavigateToX("NFM details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
      thenIShouldBeOnX("NFM entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Entity type not listed and continue to Name page")
      andISelectOptionXAndContinueToNamePage("Entity type not listed") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Name page")
      thenIShouldNavigateToX("NFM Name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
