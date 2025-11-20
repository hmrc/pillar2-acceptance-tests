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
import uk.gov.hmrc.test.ui.specs.tags.{AcceptanceTests}
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class UPEAndNFMGRSFlowPagesSpec extends BaseSpec with Matchers {

  Feature("Ultimate parent entity and Nominated Filling Member GRS journey") {

    Scenario("1 - Validate Error scenario and Entity type not listed hyperlink on UPE Org type page",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option Entity type not listed and continue to Name page")
      andISelectOptionXAndContinueToNamePage("Entity type not listed")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

    }

    Scenario("2 - User registered as UkLimitedCompany successfully with BV enabled",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

    }

    Scenario("3 - User registered as UkLimitedCompany successfully with BV disabled",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("I registered successfully with BV disabled")
      andIRegisteredSuccessfullyWith("BV disabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("I registered successfully with BV disabled")
      andIRegisteredSuccessfullyWith("BV disabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

    }

    Scenario("4 - User registration as UkLimitedCompany failed with party type mismatch error",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
      thenIShouldBeOn("UPE registration failed error page")

      When("I click go back to select the entity type link")
      andIClickLink("go back to select the entity type")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE registration failed error page")
      thenIShouldBeOn("UPE registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
      thenIShouldBeOn("NFM registration failed error page")

      When("I click go back to select the entity type link")
      andIClickLink("go back to select the entity type")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on NFM registration failed error page")
      thenIShouldBeOn("NFM registration failed error page")

    }

    Scenario("5 - User registration as UkLimitedCompany failed with generic error",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("registration is unsuccessful with generic error error")
      andRegistrationIsUnsuccessfulWithXError("generic error")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
      thenIShouldBeOn("UPE registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("registration is unsuccessful with generic error error")
      andRegistrationIsUnsuccessfulWithXError("generic error")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
      thenIShouldBeOn("NFM registration failed error page")

    }

    Scenario("6 - User registration as UkLimitedCompany failed with identifiers do not match error",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
      thenIShouldBeOn("UPE registration not called error page")

      When("I click Go back to select the entity type link")
      andIClickLink("Go back to select the entity type")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on UPE registration not called error page")
      thenIShouldBeOn("UPE registration not called error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
      thenIShouldBeOn("NFM registration not called error page")

      When("I click Go back to select the entity type link")
      andIClickLink("Go back to select the entity type")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on NFM registration not called error page")
      thenIShouldBeOn("NFM registration not called error page")

    }

    Scenario("7 - User registration as UkLimitedCompany failed with BV failed error",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("registration is unsuccessful with BV failed error")
      andRegistrationIsUnsuccessfulWithXError("BV failed")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
      thenIShouldBeOn("UPE registration not called error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      When("registration is unsuccessful with BV failed error")
      andRegistrationIsUnsuccessfulWithXError("BV failed")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
      thenIShouldBeOn("NFM registration not called error page")

    }

//    Scenario("8 - User registered as LimitedLiabilityPartnership successfully with BV enabled") {
//      Given("Organisation User logs in without Pillar2 enrolment")
//      givenLogsInWithoutPillar2Enrolment()
//
//      Then("I should be on UPE business page")
//      thenIShouldBeOn("UPE business page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should be on UPE entity type page")
//      thenIShouldBeOn("UPE entity type page")
//
//      When("I select option Limited liability partnership and continue to GRS page")
//      andISelectOptionAndContinueToGRSPage("Limited liability partnership")
//
//      Then("I should navigate to LLP GRS page")
//      thenIShouldNavigateTo("LLP GRS page")
//
//      When("I registered successfully with BV enabled")
//      andIRegisteredSuccessfullyWith("BV enabled")
//
//      And("The json response Body should contain the status registrationStatus : REGISTERED")
//      thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")
//
//      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//      And("The Task Edit Ultimate Parent Entity details status should be Completed")
//      andTheTaskStatusShouldBe("Edit Ultimate Parent Entity details", "Completed")
//
//      When("I click Add filing member details link")
//      andIClickLink("Add filing member details")
//
//      Then("I should navigate to NFM registration page")
//      thenIShouldNavigateTo("NFM registration page")
//
//      When("I select Yes option and continue to next")
//      andISelectNfmOptionAndContinueToNext("Yes")
//
//      Then("I should navigate to NFM details page")
//      thenIShouldNavigateTo("NFM details page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should be on NFM entity type page")
//      thenIShouldBeOn("NFM entity type page")
//
//      When("I select option Limited liability partnership and continue to GRS page")
//      andISelectOptionAndContinueToGRSPage("Limited liability partnership")
//
//      Then("I should navigate to NFM LLP GRS page")
//      thenIShouldNavigateTo("NFM LLP GRS page")
//
//      When("I registered successfully with BV enabled")
//      andIRegisteredSuccessfullyWith("BV enabled")
//
//      And("The json response Body should contain the status registrationStatus : REGISTERED")
//      thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")
//
//      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//    }
//
//    Scenario("9 - User registered as UkLimitedCompany successfully with BV disabled") {
//      Given("Organisation User logs in without Pillar2 enrolment")
//      givenLogsInWithoutPillar2Enrolment()
//
//      Then("I should be on UPE business page")
//      thenIShouldBeOn("UPE business page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should be on UPE entity type page")
//      thenIShouldBeOn("UPE entity type page")
//
//      When("I select option Limited liability partnership and continue to GRS page")
//      andISelectOptionAndContinueToGRSPage("Limited liability partnership")
//
//      Then("I should navigate to LLP GRS page")
//      thenIShouldNavigateTo("LLP GRS page")
//
//      When("I registered successfully with BV disabled")
//      andIRegisteredSuccessfullyWith("BV disabled")
//
//      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//      And("The Task Edit Ultimate Parent Entity details status should be Completed")
//      andTheTaskStatusShouldBe("Edit Ultimate Parent Entity details", "Completed")
//
//      When("I click Add filing member details link")
//      andIClickLink("Add filing member details")
//
//      Then("I should navigate to NFM registration page")
//      thenIShouldNavigateTo("NFM registration page")
//
//      When("I select Yes option and continue to next")
//      andISelectNfmOptionAndContinueToNext("Yes")
//
//      Then("I should navigate to NFM details page")
//      thenIShouldNavigateTo("NFM details page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should be on NFM entity type page")
//      thenIShouldBeOn("NFM entity type page")
//
//      When("I select option Limited liability partnership and continue to GRS page")
//      andISelectOptionAndContinueToGRSPage("Limited liability partnership")
//
//      Then("I should navigate to NFM LLP GRS page")
//      thenIShouldNavigateTo("NFM LLP GRS page")
//
//      When("I registered successfully with BV disabled")
//      andIRegisteredSuccessfullyWith("BV disabled")
//
//      And("The json response Body should contain the status registrationStatus : REGISTERED")
//      thenTheJsonResponseBodyShouldContainTheStatusX("registrationStatus : REGISTERED")
//
//      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//    }

    Scenario("10 - User registration with LLP with different errors",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      Then("I should navigate to LLP GRS page")
      thenIShouldNavigateTo("LLP GRS page")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
      thenIShouldBeOn("UPE registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with generic error error")
      andRegistrationIsUnsuccessfulWithXError("generic error")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration failed error page")
      thenIShouldBeOn("UPE registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
      thenIShouldBeOn("UPE registration not called error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with BV failed error")
      andRegistrationIsUnsuccessfulWithXError("BV failed")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on UPE registration not called error page")
      thenIShouldBeOn("UPE registration not called error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
      thenIShouldBeOn("NFM registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with generic error error")
      andRegistrationIsUnsuccessfulWithXError("generic error")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration failed error page")
      thenIShouldBeOn("NFM registration failed error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
      thenIShouldBeOn("NFM registration not called error page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      When("registration is unsuccessful with BV failed error")
      andRegistrationIsUnsuccessfulWithXError("BV failed")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on NFM registration not called error page")
      thenIShouldBeOn("NFM registration not called error page")

    }

    Scenario("11 - User can navigate to Entity type not listed hyperlink on NFM Org type page",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      And("The Task Edit Ultimate Parent Entity details status should be Completed")
      andTheTaskStatusShouldBe("Edit Ultimate Parent Entity details", "Completed")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option Entity type not listed and continue to Name page")
      andISelectOptionXAndContinueToNamePage("Entity type not listed")

      Then("I should navigate to NFM Name page")
      thenIShouldNavigateTo("NFM Name page")

    }

    Scenario("12 - UPE User error pages - ZAP-Accessibility Test",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I am on UPE registration failed error Page")
      givenIAmOnPage("UPE registration failed error")

      And("I am on UPE registration not called error Page")
      givenIAmOnPage("UPE registration not called error")

      And("I am on NFM registration failed error Page")
      givenIAmOnPage("NFM registration failed error")

      And("I am on NFM registration not called error Page")
      givenIAmOnPage("NFM registration not called error")
    }
  }
}