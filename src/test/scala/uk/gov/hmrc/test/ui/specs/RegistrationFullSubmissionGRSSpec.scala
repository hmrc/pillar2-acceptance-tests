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
import uk.gov.hmrc.test.ui.pages.contactDetails.*
import uk.gov.hmrc.test.ui.pages.furtherDetails.*
import uk.gov.hmrc.test.ui.pages.nfm.*
import uk.gov.hmrc.test.ui.pages.registration.{RegistrationConfirmationPage, ReviewAnswersPage, TaskListPage}
import uk.gov.hmrc.test.ui.pages.upe.*
import uk.gov.hmrc.test.ui.specs.tags.*

class RegistrationFullSubmissionGRSSpec extends BaseSpec {

  Feature("Full registration using GRS") {

    Scenario("1 - User registers a UK Limited Company UPE successfully",
      AcceptanceTests, Wip
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds a UK Limited Company as an Ultimate Parent Entity")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      And("The user doesn't add a Nominated Filing Member")
      TaskListPage.clickLinkAddFilingMember()
      NFMRegistrationPage.selectNominatedFilingMemberNo()
      TaskListPage.onPage()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryNamePage.enterText()
      ContactDetailsPrimaryEmailPage.enterText()
      ContactDetailsPrimaryPhoneAsContactPage.selectNo()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUK()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Registration Complete page")
      RegistrationConfirmationPage.onPage(timeoutSeconds = 10)
    }

    Scenario("2 - User registers a UK Limited Company as ",
      AcceptanceTests, Wip
    ) {

      Given("Org User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user manually adds an Ultimate Parent Entity with a non-UK Address")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.registeredInUkNo()
      UPENamePage.enterText()
      UPEAddressPage.enterAddressNonUK()
      UPEContactNamePage.enterText()
      UPEEmailPage.enterText()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterText()
      UPECheckYourAnswersPage.continueToNextPage()

      And("The user adds a UK Limited Company as a Nominated Filing Member")
      TaskListPage.clickLinkAddFilingMember()
      NFMRegistrationPage.selectNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.enterEntityTypeUkLimitedCompany()
      NFMUKCompanyGRSPage.clickRegistrationSuccessBvEnabled()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()

      Then("The user continues from further details to the task list")
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectYes()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUK()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Registration Complete page")
      RegistrationConfirmationPage.onPage(timeoutSeconds = 10)
    }
  }
}
