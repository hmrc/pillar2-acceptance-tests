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
import uk.gov.hmrc.test.ui.pages.registration.*
import uk.gov.hmrc.test.ui.pages.upe.*
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests
import scala.sys.process.stringToProcess

class RegistrationInProgressSpec extends BaseSpec {
  private val serviceName = "PILLAR_2_STUBS"
  Feature("Registration in progress") {

    s"sm2 -restart $serviceName".!
    Scenario("Full registration journey leads to in progress page when navigating back to home page", AcceptanceTests) {
      Given("Organisation User logs in without enrollment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      RegistrationTaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds Medium Processing Corp as Ultimate Parent Entity")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectNo()
      UPENamePage.enterTextRegistrationInProgress()
      UPEAddressPage.enterAddressNonUk()
      UPEContactNamePage.enterTextRegistrationInProgress()
      UPEEmailPage.enterText()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterText()

      Then("The user continues to the task list")
      UPECheckYourAnswersPage.continueToNextPage()
      RegistrationTaskListPage.clickLinkAddFilingMember()

      When("The user doesn't add a Nominated Filing Member")
      NFMRegistrationPage.selectRadioNominatedFilingMemberNo()

      Then("The user continues to the task list")
      RegistrationTaskListPage.clickLinkAddFurtherGroupDetails()

      And("The user adds further details")
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds UPE as primary contact")
      RegistrationTaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectYes()
      ContactDetailsSecondaryContactAddPage.selectNo()
      ContactAddressInputPage.enterAddressUk()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      RegistrationTaskListPage.clickLinkReviewAndSubmit()
      RegistrationReviewAnswersPage.continueToNextPage()
      RegistrationSubmissionInProgressPage.onPage()

      When("The user is now on the registration complete page and tries to go to the home page")
      RegistrationConfirmationPage.onPage(timeoutSeconds = 10)
      RegistrationConfirmationPage.clickLinkHomePage()

      Then("The user is presented with the registration in progress page")
      RegistrationInProgressPage.onPage()
    }
  }
}
