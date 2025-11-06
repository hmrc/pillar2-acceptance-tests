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
import uk.gov.hmrc.test.ui.specpages.contactDetails._
import uk.gov.hmrc.test.ui.specpages.furtherDetails._
import uk.gov.hmrc.test.ui.specpages.nfm._
import uk.gov.hmrc.test.ui.specpages.upe._
import uk.gov.hmrc.test.ui.specpages.{RegistrationConfirmationPage, ReviewAnswersPage, TaskListPage}
import uk.gov.hmrc.test.ui.tags.Tests

class UPENoIDFLowPageSpec extends BaseSpec with Matchers {

  Feature("UPE NO ID journey") {

    Scenario("User adds a Non-UK UPE and then makes amendments on the check your answers page", Tests) {
      Given("Organisation User logs in without enrollment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds an Ultimate Parent Entity with a non-UK Address")
      UPERegisteredInUkPage.registeredInUkNo()
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
      NFMRegistrationPage.nominatedFilingMemberYes()
      NFMRegisteredInUkPage.registeredInUkYes()
      NFMEntityTypePage.enterEntityTypeNotListed()
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

      Then("The user continues to the task list")
      NFMCheckYourAnswersPage.continueToNextPage()
      TaskListPage.clickAddFurtherGroupDetailsLink()

      And("The user adds further details")
      FDGroupStatusPage.selectOnlyUk()
      FDGroupAccountingPeriodPage.enterDates()
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
