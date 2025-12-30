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
import uk.gov.hmrc.test.ui.specs.tags.*

class RegistrationFullSubmissionNoIdSpec extends BaseSpec {

  Feature("Full registration with no ID") {

    Scenario("Full registration journey with amendments made on check your answers pages", AcceptanceTests) {
      Given("Organisation User logs in without enrollment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      And("The user is presented with the task list page")
      TaskListPage.clickLinkAddUltimateFilingMember()

      And("The user adds an Ultimate Parent Entity with a non-UK Address")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectNo()
      UPENamePage.enterText()
      UPEAddressPage.enterAddress(country = "Chad")
      UPEContactNamePage.enterText()
      UPEEmailPage.enterText()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterText()

      And("The user amends UPE Entity name via the Check your answers page")
      UPECheckYourAnswersPage.clickLinkChangeName()
      UPENamePage.updateText()

      And("The user amends UPE Address town via the Check your answers page")
      UPECheckYourAnswersPage.clickLinkChangeAddress()
      UPEAddressPage.updateAddress()

      And("The user amends UPE contact name via the Check your answers page")
      UPECheckYourAnswersPage.clickLinkChangeContactName()
      UPEContactNamePage.updateText()

      And("The user amends UPE email address via the Check your answers page")
      UPECheckYourAnswersPage.clickLinkChangeEmailAddress()
      UPEEmailPage.updateText()

      And("The user amends UPE contact phone number via the Check your answers page")
      UPECheckYourAnswersPage.clickLinkChangePhoneNumber()
      UPEPhoneInputPage.updateText()

      Then("The user continues to the task list")
      UPECheckYourAnswersPage.continueToNextPage()
      TaskListPage.clickLinkAddFilingMember()

      When("The user adds a Nominated Filing Member with a UK Address")
      NFMRegistrationPage.selectRadioNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.selectRadioEntityTypeNotListed()
      NFMNamePage.enterText()
      NFMAddressPage.enterAddress()
      NFMContactNamePage.enterText()
      NFMContactEmailPage.enterText()
      NFMPhoneAsContactPage.selectYes()
      NFMPhoneInputPage.enterText()

      And("The user amends NFM Entity name via the Check your answers page")
      NFMCheckYourAnswersPage.clickLinkChangeName()
      NFMNamePage.updateText()

      And("The user amends NFM address via the Check your answers page")
      NFMCheckYourAnswersPage.clickLinkChangeAddress()
      NFMAddressPage.updateAddress()

      And("The user amends NFM contact name via the Check your answers page")
      NFMCheckYourAnswersPage.clickLinkChangeContactName()
      NFMContactNamePage.updateText()

      And("The user amends NFM email address via the Check your answers page")
      NFMCheckYourAnswersPage.clickLinkChangeEmailAddress()
      NFMContactEmailPage.updateText()

      And("The user amends NFM contact phone number via the Check your answers page")
      NFMCheckYourAnswersPage.clickLinkChangePhoneNumber()
      NFMPhoneInputPage.updateText()

      Then("The user continues from NFM to the task list")
      NFMCheckYourAnswersPage.continueToNextPage()

      And("The user adds further details")
      TaskListPage.clickLinkAddFurtherGroupDetails()
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()

      And("The user amends group status via the Check your answers page")
      FDCheckYourAnswersPage.clickLinkChangeGroupStatus()
      FDGroupStatusPage.selectRadioUpdateToUkAndNonUk()

      And("The user amends the accounting period via the Check your answers page")
      FDCheckYourAnswersPage.clickLinkChangeAccountingPeriod()
      FDGroupAccountingPeriodPage.updateDates(
        start = ("01", "02", "2024"),
        end = ("31", "01", "2025")
      )

      Then("The user continues from further details to the task list")
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickLinkAddContactDetails()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectNo()
      ContactDetailsPrimaryNamePage.enterText()
      ContactDetailsPrimaryEmailPage.enterText()
      ContactDetailsPrimaryPhoneAsContactPage.selectYes()
      ContactDetailsPrimaryPhonePage.enterText()

      And("The user adds secondary contact details")
      ContactDetailsSecondaryContactAddPage.selectYes()
      ContactDetailsSecondaryNamePage.enterText()
      ContactDetailsSecondaryEmailPage.enterText()
      ContactDetailsSecondaryPhoneAsContactPage.selectYes()
      ContactDetailsSecondaryPhoneInputPage.enterText()

      And("The user adds contact address")
      ContactAddressInputPage.enterAddress()

      And("The user amends Primary contact name via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangePrimaryContactName()
      ContactDetailsPrimaryNamePage.updateText()

      And("The user amends Primary contact email address via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangePrimaryContactEmailAddress()
      ContactDetailsPrimaryEmailPage.updateText()

      And("The user amends Primary contact phone number via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangePrimaryContactPhoneNumber()
      ContactDetailsPrimaryPhonePage.updateText()

      And("The user amends Secondary contact name via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangeSecondaryContactName()
      ContactDetailsSecondaryNamePage.updateText()

      And("The user amends Secondary contact email address via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangeSecondaryContactEmailAddress()
      ContactDetailsSecondaryEmailPage.updateText()

      And("The user amends Secondary contact phone number via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangeSecondaryContactPhoneNumber()
      ContactDetailsSecondaryPhoneInputPage.updateText()

      And("The user amends contact Address town via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickLinkChangeContactAddress()
      ContactAddressInputPage.updateAddress()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickLinkReviewAndSubmit()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Registration Complete page")
      RegistrationConfirmationPage.onPage(timeoutSeconds = 10)
    }
  }
}
