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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.login
import uk.gov.hmrc.test.ui.pages.nfm.*
import uk.gov.hmrc.test.ui.pages.registration.TaskListPage
import uk.gov.hmrc.test.ui.pages.upe.*
import uk.gov.hmrc.test.ui.specs.tags.*

class RegistrationErrorGRSSpec extends BaseSpec {

  Feature("Registration GRS Error journeys") {

    Scenario("1 - User registration as Uk Limited Company failed with party type mismatch error",
      AcceptanceTests
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickAddUltimateFilingMember()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Failed Party Type Mismatch")
      UPEInitialGuidancePage.continueToNextPage()
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
      NFMRegistrationPage.selectNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationFailedPartyTypeMismatch()

      When("The user is presented with the mismatching-details error page")
      NFMGRSRegistrationFailedErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("2 - User registration as Uk Limited Company failed with generic error",
      AcceptanceTests
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickAddUltimateFilingMember()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Generic Error")
      UPEInitialGuidancePage.continueToNextPage()
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
      NFMRegistrationPage.selectNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationFailedGeneric()

      When("The user is presented with the mismatching-details error page")
      NFMGRSRegistrationFailedErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationFailedErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("3 - User registration as Uk Limited Company failed with Identifiers Mismatch error",
      AcceptanceTests
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickAddUltimateFilingMember()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with Identifiers Mismatch")
      UPEInitialGuidancePage.continueToNextPage()
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
      NFMRegistrationPage.selectNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationNotCalledIdentifierMismatch()

      When("The user is presented with the Identifiers Mismatch error page")
      NFMGRSRegistrationNotCalledErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
    }

    Scenario("4 - User registration as Uk Limited Company failed with BV failed error",
      AcceptanceTests
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickAddUltimateFilingMember()

      And("The user adds a Uk Limited Company as an Ultimate Parent Entity with BV failed")
      UPEInitialGuidancePage.continueToNextPage()
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
      NFMRegistrationPage.selectNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationNotCalledBvFailed()

      When("The user is presented with the BV failed error page")
      NFMGRSRegistrationNotCalledErrorPage.onPage()

      Then("The user goes back to entity type page")
      NFMGRSRegistrationNotCalledErrorPage.clickGoBackToEntityTypeLink()
    }
  }
}
