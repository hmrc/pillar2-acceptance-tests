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

package uk.gov.hmrc.test.ui.specstepdef

import uk.gov.hmrc.test.ui.cucumber.Input._
import uk.gov.hmrc.test.ui.cucumber.{Check, Input, Wait}
import uk.gov.hmrc.test.ui.specpages._

object UPEStepsSteps {

  // ^I enter (.*) as (.*)$
  def andIEnterXAsX(field: String, name: String): Unit = {
    field match {

      case "NFM name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(name, UPENamePage.nameField)
        clickByCss(UPENamePage.continue)

      case "Phone Number" =>
        Wait.waitForElementToPresentByCssSelector(UPEPhoneInputPage.phoneNumber)
        Input.sendKeysByCss(name, UPEPhoneInputPage.phoneNumber)
        clickByCss(UPENamePage.continue)

      case "NFM Contact name" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.contactName)
        Input.sendKeysByCss(name, NFMContactNamePage.contactName)
        clickByCss(UPENamePage.continue)

      case "NFM Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.contactEmail)
        Input.sendKeysByCss(name, NFMContactEmailPage.contactEmail)
        clickByCss(UPENamePage.continue)

      case "NFM Phone Number" =>
        Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.phoneNumber)
        Input.sendKeysByCss(name, InputNFMPhonePage.phoneNumber)
        clickByCss(UPENamePage.continue)

      case "Contact Phone" =>
        Wait.waitForElementToPresentByCssSelector(ContactDetailsInputPhonePage.contactPhone)
        Input.sendKeysByCss(name, ContactDetailsInputPhonePage.contactPhone)
        clickByCss(UPENamePage.continue)

      case "Second Contact Name" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactNamePage.contactName)
        Input.sendKeysByCss(name, SecondContactNamePage.contactName)
        clickByCss(UPENamePage.continue)

      case "Second Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactEmailPage.contactEmail)
        Input.sendKeysByCss(name, SecondContactEmailPage.contactEmail)
        clickByCss(UPENamePage.continue)

      case "Second Contact Input" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactInputPage.contactPhone)
        Input.sendKeysByCss(name, SecondContactInputPage.contactPhone)
        clickByCss(UPENamePage.continue)

    }
  }

  // ^I am on feedback survey page$
  def andIAmOnFeedbackSurveyPage(): Unit = {
    Check.checkH1("Give feedback")
  }

  // ^I should see the answer (.*) remain selected$
  def andIShouldSeeTheAnswerXRemainSelected(answer: String): Unit = {
    Check.checkAnswerSelection(answer)
  }

  // ^I should see the option (.*) remain selected$
  def andIShouldSeeTheOptionXRemainSelected(answer: String): Unit = {
    Check.checkOptionSelected(answer)
  }

  // ^I should see the (.*) field is pre-populated with (.*)$
  def andIShouldSeeTheXFieldIsPrepopulatedWithX(field: String, name: String): Unit = {
    field match {
//          case "NFM name" =>
//            assert(getAttributeOf(UPENamePage.nameField, "value").equals(name))
      case "Phone number" =>
        assert(getAttributeOf(UPEPhoneInputPage.phoneNumber, "value").equals(name))
      case "NFM Contact name" =>
        assert(getAttributeOf(NFMContactNamePage.contactName, "value").equals(name))
      case "NFM Contact Email" =>
        assert(getAttributeOf(NFMContactEmailPage.contactEmail, "value").equals(name))
      case "NFM Phone number" =>
        assert(getAttributeOf(InputNFMPhonePage.phoneNumber, "value").equals(name))
      case "Contact Phone" =>
        assert(getAttributeOf(ContactDetailsInputPhonePage.contactPhone, "value").equals(name))
      case "Second Contact Name" =>
        assert(getAttributeOf(SecondContactNamePage.contactName, "value").equals(name))
      case "Second Contact Email" =>
        assert(getAttributeOf(SecondContactEmailPage.contactEmail, "value").equals(name))
      case "Second Contact Input" =>
        assert(getAttributeOf(SecondContactInputPage.contactPhone, "value").equals(name))
      case "Redirect URL" =>
        assert(getAttributeOf(AuthLoginPage.redirectionUrlField, "value").contains(name))
      case "PLRID" =>
        assert(getAttributeOf(ASAPillar2InputPage.pillar2IDField, "value").equals(name))
      case "UK Bank Name" =>
        assert(getAttributeOf(UKBankAccountPaymentPage.UkBankName, "value").equals(name))
    }
  }

  // ^I select option (.*) and continue to GRS page$
  def andISelectOptionXAndContinueToGRSPage(option: String): Unit = {
    option match {
      case "UK limited company"            => Input.clickById("value_0")
      case "Limited liability partnership" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  // ^I select option (.*) and continue to Name page$
  def andISelectOptionXAndContinueToNamePage(option: String): Unit = {
    option match {
      case "Entity type not listed" => Input.clickById("value_2")
    }
    UPEEntityTypePage.clickContinue()
  }

  // ^I select option (.*) in further details group status page$
  def andISelectOptionXInFurtherDetailsGroupStatusPage(option: String): Unit = {
    option match {
      case "In the UK and outside the UK" => Input.clickById("value_1")
      case "Only in the UK"               => Input.clickById("value_0")
    }
    UPEEntityTypePage.clickContinue()
  }

  // ^I registered successfully with (.*)
  def andIRegisteredSuccessfullyWithX(option: String): Unit = {
    option match {
      case "BV disabled" =>
        Wait.waitForElement("registrationSuccessBvDisabled")
        Input.clickById("registrationSuccessBvDisabled")
      case "BV enabled" =>
        Wait.waitForElement("registrationSuccessBvEnabled")
        Input.clickById("registrationSuccessBvEnabled")
    }
  }

  // ^registration is unsuccessful with (.*) error
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

  // ^The json response Body should contain the status (.*)$
  def thenTheJsonResponseBodyShouldContainTheStatusX(text: String): Unit = {
    Check.checkBodyText(text)
  }

  // ^I click on Save&Continue button
  def andIClickOnSaveContinueButton(): Unit = {
    UPEEntityTypePage.clickContinue()
  }

}
