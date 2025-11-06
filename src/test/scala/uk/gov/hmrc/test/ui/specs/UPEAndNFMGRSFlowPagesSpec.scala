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
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.login
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.nfm.{NFMEntityTypePage, NFMGRSRegistrationFailedErrorPage, NFMGRSRegistrationNotCalledErrorPage, NFMLLPGRSPage, NFMRegisteredInUkPage, NFMRegistrationPage, NFMUKCompanyGRSPage}
import uk.gov.hmrc.test.ui.specpages.upe._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._
import uk.gov.hmrc.test.ui.tags.Tests

class UPEAndNFMGRSFlowPagesSpec extends BaseSpec with Matchers {

  Feature("Ultimate parent entity and Nominated Filling Member GRS journey") {

    Scenario("1 - User registers a Uk Limited Company successfully with BV enabled", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV Enabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      And("The user adds a Uk Limited Company as a Nominated Filing Member with BV Enabled")
      TaskListPage.clickAddFilingMemberLink()
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationSuccessBvEnabled()

      Then("The user ends up back on the task list")
      TaskListPage.onPage()
    }

    Scenario("2 - User registers a Uk Limited Company successfully with BV disabled", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV Disabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
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

    Scenario("3 - User registration as UkLimitedCompany failed with party type mismatch error", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Failed Party Type Mismatch")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationFailedPartyTypeMismatch()

      When("The user is presented with the mismatching-details error page")
      UPEGRSRegistrationFailedErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
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

    Scenario("4 - User registration as Uk Limited Company failed with generic error", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Generic Error")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationFailedGeneric()

      When("The user is presented with the mismatching-details error page")
      UPEGRSRegistrationFailedErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
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

    Scenario("5 - User registration as Uk Limited Company failed with Identifiers Mismatch error", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Identifiers Mismatch")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationNotCalledIdentifierMismatch()

      When("The user is presented with the Identifiers Mismatch error page")
      UPEGRSRegistrationNotCalledErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
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

    Scenario("6 - User registration as UkLimitedCompany failed with BV failed error", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV failed")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationNotCalledBvFailed()

      When("The user is presented with the BV failed error page")
      UPEGRSRegistrationNotCalledErrorPage.onPage()

      And("The user goes back to entity type page and enters valid details")
      UPEGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
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

    Scenario("7 - User registered as Limited Liability Partnership successfully with BV enabled", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Limited Liability Partnership as an Ultimate Parent Entity with BV Enabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeLimitedLiabilityPartnership()
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

    Scenario("8 - User registered as Limited Liability Partnership successfully with BV disabled", Tests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds a Limited Liability Partnership as an Ultimate Parent Entity with BV disabled")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeLimitedLiabilityPartnership()
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
  }
}
