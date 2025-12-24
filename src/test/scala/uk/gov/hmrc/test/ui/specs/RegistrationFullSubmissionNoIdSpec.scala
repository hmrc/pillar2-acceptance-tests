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
      TaskListPage.clickAddUltimateFilingMember()

      And("The user adds an Ultimate Parent Entity with a non-UK Address")
      UPEInitialGuidancePage.continueToNextPage()
      UPERegisteredInUkPage.selectNo()
      UPENamePage.enterName()
      UPEAddressPage.enterAddressNonUK()
      UPEContactNamePage.enterName()
      UPEEmailPage.enterEmail()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterPhoneNumber()

      And("The user amends UPE Entity name via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeName)
      UPENamePage.updateName()

      And("The user amends UPE Address town via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeAddress)
      UPEAddressPage.updateAddressNonUK()

      And("The user amends UPE contact name via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeContactName)
      UPEContactNamePage.updateName()

      And("The user amends UPE email address via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeEmailAddress)
      UPEEmailPage.updateEmail()

      And("The user amends UPE contact phone number via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changePhoneNumber)
      UPEPhoneInputPage.updatePhoneNumber()

      Then("The user continues to the task list")
      UPECheckYourAnswersPage.continueToNextPage()
      TaskListPage.clickAddFilingMemberLink()

      When("The user adds a Nominated Filing Member with a UK Address")
      NFMRegistrationPage.selectRadioNominatedFilingMemberYes()
      NFMRegisteredInUkPage.selectYes()
      NFMEntityTypePage.selectRadioEntityTypeNotListed()
      NFMNamePage.enterName()
      NFMAddressPage.enterAddressUK()
      NFMContactNamePage.enterName()
      NFMContactEmailPage.enterEmail()
      NFMPhoneAsContactPage.selectYes()
      NFMPhoneInputPage.enterPhoneNumber()

      And("The user amends NFM Entity name via the Check your answers page")
      NFMCheckYourAnswersPage.clickChangeLink(NFMCheckYourAnswersPage.changeName)
      NFMNamePage.updateName()

      And("The user amends NFM Address town via the Check your answers page")
      NFMCheckYourAnswersPage.clickChangeLink(NFMCheckYourAnswersPage.changeAddress)
      NFMAddressPage.updateAddressUK()

      And("The user amends NFM contact name via the Check your answers page")
      NFMCheckYourAnswersPage.clickChangeLink(NFMCheckYourAnswersPage.changeContactName)
      NFMContactNamePage.updateName()

      And("The user amends NFM email address via the Check your answers page")
      NFMCheckYourAnswersPage.clickChangeLink(NFMCheckYourAnswersPage.changeEmailAddress)
      NFMContactEmailPage.updateEmail()

      And("The user amends NFM contact phone number via the Check your answers page")
      NFMCheckYourAnswersPage.clickChangeLink(NFMCheckYourAnswersPage.changePhoneNumber)
      NFMPhoneInputPage.updatePhoneNumber()

      Then("The user continues from NFM to the task list")
      NFMCheckYourAnswersPage.continueToNextPage()

      And("The user adds further details")
      TaskListPage.clickAddFurtherGroupDetailsLink()
      FDGroupStatusPage.selectRadioOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()

      And("The user amends group status via the Check your answers page")
      FDCheckYourAnswersPage.clickChangeGroupStatusLink()
      FDGroupStatusPage.selectRadioUpdateToUkAndNonUk()

      And("The user amends the accounting period via the Check your answers page")
      FDCheckYourAnswersPage.clickChangeAccountingPeriodLink()
      FDGroupAccountingPeriodPage.updateDates()

      Then("The user continues from further details to the task list")
      FDCheckYourAnswersPage.continueToNextPage()

      And("The user adds primary contact details")
      TaskListPage.clickAddContactDetailsLink()
      ContactDetailsGuidancePage.continueToNextPage()
      ContactDetailsPrimaryContactPage.selectNo()
      ContactDetailsPrimaryNamePage.enterName()
      ContactDetailsPrimaryEmailPage.enterEmail()
      ContactDetailsPrimaryPhoneAsContactPage.selectYes()
      ContactDetailsPrimaryPhonePage.enterPhoneNumber()

      And("The user adds secondary contact details")
      ContactDetailsSecondaryContactAddPage.selectYes()
      ContactDetailsSecondaryNamePage.enterName()
      ContactDetailsSecondaryEmailPage.enterEmail()
      ContactDetailsSecondaryPhoneAsContactPage.selectYes()
      ContactDetailsSecondaryPhoneInputPage.enterPhoneNumber()

      And("The user adds contact address")
      ContactAddressInputPage.enterAddressUK()

      And("The user amends Primary contact name via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changePrimaryContactName)
      ContactDetailsPrimaryNamePage.updateName()

      And("The user amends Primary contact email address via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changePrimaryContactEmailAddress)
      ContactDetailsPrimaryEmailPage.updateEmail()

      And("The user amends Primary contact phone number via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changePrimaryContactPhoneNumber)
      ContactDetailsPrimaryPhonePage.updatePhoneNumber()

      And("The user amends Secondary contact name via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changeSecondaryContactName)
      ContactDetailsSecondaryNamePage.updateName()

      And("The user amends Secondary contact email address via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changeSecondaryContactEmailAddress)
      ContactDetailsSecondaryEmailPage.updateEmail()

      And("The user amends Secondary contact phone number via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changeSecondaryContactPhoneNumber)
      ContactDetailsSecondaryPhoneInputPage.updatePhoneNumber()

      And("The user amends contact Address town via the Check your answers page")
      ContactDetailsCheckAnswersPage.clickChangeLink(ContactDetailsCheckAnswersPage.changeContactAddress)
      ContactAddressInputPage.updateAddressUK()
      ContactDetailsCheckAnswersPage.continueToNextPage()

      Then("The user reviews and submits")
      TaskListPage.clickReviewAndSubmitLink()
      ReviewAnswersPage.continueToNextPage()

      When("The user is presented with the Registration Complete page")
      RegistrationConfirmationPage.onPage(timeoutSeconds = 10)
    }
  }
}
