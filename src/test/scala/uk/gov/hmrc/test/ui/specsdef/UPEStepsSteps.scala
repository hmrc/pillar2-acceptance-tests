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

package uk.gov.hmrc.test.ui.specsdef

import uk.gov.hmrc.test.ui.helper.Input.*
import uk.gov.hmrc.test.ui.helper.{Check, Input, Wait}
import uk.gov.hmrc.test.ui.pages.*

object UPEStepsSteps {

  def andIEnterAs(field: String, name: String): Unit = {
    field match {

      case "NFM name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(name, InputUPENamePage.nameField)
        clickByCss(InputUPENamePage.continue)

      case "Address Line 1" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.addressLine1)
        Input.sendKeysByCss(name, UPEAddressPage.addressLine1)

      case "NFM Contact name" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.contactName)
        Input.sendKeysByCss(name, NFMContactNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "NFM Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.contactEmail)
        Input.sendKeysByCss(name, NFMContactEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "Contact Name" =>
        Wait.waitForElementToPresentByCssSelector(ContactDetailsInputNamePage.contactName)
        Input.sendKeysByCss(name, ContactDetailsInputNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(ContactDetailsInputEmailPage.contactEmail)
        Input.sendKeysByCss(name, ContactDetailsInputEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "Contact Phone" =>
        Wait.waitForElementToPresentByCssSelector(ContactDetailsInputPhonePage.contactPhone)
        Input.sendKeysByCss(name, ContactDetailsInputPhonePage.contactPhone)
        clickByCss(InputUPENamePage.continue)
    }
  }

  def andIAmOnFeedbackSurveyPage(): Unit = {
    Check.checkH1("Give feedback")
  }

  def andISelectOptionAndContinueToGRSPage(option: String): Unit = {
    option match {
      case "UK limited company"            => Input.clickById("value_0")
      case "Limited liability partnership" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  def andISelectOptionXAndContinueToNamePage(option: String): Unit = {
    option match {
      case "Entity type not listed" => Input.clickById("value_2")
    }
    UPEEntityTypePage.clickContinue()
  }

  def andISelectOptionInFurtherDetailsGroupStatusPage(option: String): Unit = {
    option match {
      case "In the UK and outside the UK" => Input.clickById("value_1")
      case "Only in the UK"               => Input.clickById("value_0")
    }
    UPEEntityTypePage.clickContinue()
  }

  def andIRegisteredSuccessfullyWith(option: String): Unit = {
    option match {
      case "BV disabled" =>
        Wait.waitForElement("registrationSuccessBvDisabled")
        Input.clickById("registrationSuccessBvDisabled")
      case "BV enabled" =>
        Wait.waitForElement("registrationSuccessBvEnabled")
        Input.clickById("registrationSuccessBvEnabled")
    }
  }

  def andRegistrationIsUnsuccessfulWithXError(error: String): Unit = {
    error match {
      case "party type mismatch" =>
        Wait.waitForElement("registrationFailedPartyTypeMismatch")
        Input.clickById("registrationFailedPartyTypeMismatch")
      case "generic error" =>
        Wait.waitForElement("registrationFailedGeneric")
        Input.clickById("registrationFailedGeneric")
      case "identifiers not match" =>
        Wait.waitForElement("registrationFailedGeneric")
        Input.clickById("registrationNotCalledIdentifierMismatch")
      case "BV failed" =>
        Wait.waitForElement("registrationFailedGeneric")
        Input.clickById("registrationNotCalledBvFailed")
    }
  }

  def andIClickOnSaveContinueButton(): Unit = {
    UPEEntityTypePage.clickContinue()
  }
}
