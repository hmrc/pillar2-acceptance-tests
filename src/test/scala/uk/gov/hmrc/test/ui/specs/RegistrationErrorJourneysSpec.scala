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
import uk.gov.hmrc.test.ui.pages.nfm.NFMRegistrationPage
import uk.gov.hmrc.test.ui.pages.registration.*
import uk.gov.hmrc.test.ui.pages.upe.*
import uk.gov.hmrc.test.ui.specs.tags.*

class RegistrationErrorJourneysSpec extends BaseSpec {

  Feature("Registration Error journeys") {

    Scenario(
      "1 - User redirected to Subscription Failure error page for a duplicate subscription.",
      AcceptanceTests
    ) {

      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds a UK Limited Company as an Ultimate Parent Entity")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectNo()
      UPENamePage.enterTextSubscriptionFailure()
      UPEAddressPage.enterAddressNonUk()
      UPEContactNamePage.enterText()
      UPEEmailPage.enterText()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterText()
      UPECheckYourAnswersPage.continueToNextPage()

      And("The user doesn't add a Nominated Filing Member")
      TaskListPage.clickLinkAddFilingMember()
      NFMRegistrationPage.selectRadioNominatedFilingMemberNo()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectYes()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUk()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Subscription Failure error page")
      RegistrationSubscriptionFailureErrorPage.onPage()
    }

    Scenario(
      "2 - User taken to error page for attempting to register an incomplete data submission",
      AcceptanceTests
    ) {

      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds a UK Limited Company as an Ultimate Parent Entity")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectYes()
      UPEEntityTypePage.selectRadioEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickButtonRegistrationSuccessBvEnabled()

      And("The user doesn't add a Nominated Filing Member")
      TaskListPage.clickLinkAddFilingMember()
      NFMRegistrationPage.selectRadioNominatedFilingMemberNo()
      TaskListPage.onPage()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryNamePage.enterText()
      ContactDetailsPrimaryEmailPage.enterText()
      ContactDetailsPrimaryPhoneAsContactPage.selectNo()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUk()

      And("The user amends the Primary contact as having a phone number via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangePrimaryContactByPhone()
      ContactDetailsPrimaryPhoneAsContactPage.selectYes(ContactDetailsPrimaryPhoneAsContactPage.changeUrl)

      And("The user leaves check your answers without adding a phone number")
      ContactDetailsPrimaryPhonePage.clickBackLink(ContactDetailsPrimaryPhonePage.changeUrl)
      ContactDetailsPrimaryPhoneAsContactPage.clickBackLink(ContactDetailsPrimaryPhoneAsContactPage.changeUrl)
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Incomplete Data Submission error page")
      RegistrationIncompleteDataErrorPage.onPage()
    }

    Scenario(
      "3 - User redirected to the API error page for an invalid request during registration.",
      AcceptanceTests
    ) {

      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds a UK Limited Company as an Ultimate Parent Entity")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectNo()
      UPENamePage.enterTextAPIError()
      UPEAddressPage.enterAddressNonUk()
      UPEContactNamePage.enterText()
      UPEEmailPage.enterText()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterText()
      UPECheckYourAnswersPage.continueToNextPage()

      And("The user doesn't add a Nominated Filing Member")
      TaskListPage.clickLinkAddFilingMember()
      NFMRegistrationPage.selectRadioNominatedFilingMemberNo()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectYes()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUk()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the API error page")
      RegistrationAPIErrorPage.onPage()
    }
  }
}
