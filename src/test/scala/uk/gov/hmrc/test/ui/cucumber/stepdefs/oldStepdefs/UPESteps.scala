/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.oldStepdefs

import uk.gov.hmrc.test.ui.cucumber.Input._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonFunctions
import uk.gov.hmrc.test.ui.cucumber.{Check, Input, Wait}
import uk.gov.hmrc.test.ui.pages._

class UPESteps extends CommonFunctions {

  And("""^I enter (.*) as (.*)$""") { (field: String, name: String) =>
    field match {
      case "UPE name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(name, InputUPENamePage.nameField)
        clickByCss(InputUPENamePage.continue)

      case "NFM name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(name, InputUPENamePage.nameField)
        clickByCss(InputUPENamePage.continue)

      case "Address Line 1" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.addressLine1)
        Input.sendKeysByCss(name, UPEAddressPage.addressLine1)

      case "Address Line 2" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.addressLine2)
        Input.sendKeysByCss(name, UPEAddressPage.addressLine2)

      case "City" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.townOrCity)
        Input.sendKeysByCss(name, UPEAddressPage.townOrCity)

      case "Region" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.region)
        Input.sendKeysByCss(name, UPEAddressPage.region)

      case "Postal Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.postalCode)
        Input.sendKeysByCss(name, UPEAddressPage.postalCode)

      case "Country" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.country)
        Input.sendKeysByCss(name, UPEAddressPage.country)

      case "UPE Person/Team name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysById(UPEContactNamePage.contactName, name)
        clickByCss(InputUPENamePage.continue)

      case "UPE Email address" =>
        Wait.waitForElementToPresentById(UPEContactEmailPage.emailField)
        Input.sendKeysById(UPEContactEmailPage.emailField, name)
        clickByCss(InputUPENamePage.continue)

      case "Phone Number" =>
        Wait.waitForElementToPresentByCssSelector(InputUPEPhonePage.phoneNumber)
        Input.sendKeysByCss(name, InputUPEPhonePage.phoneNumber)
        clickByCss(InputUPENamePage.continue)

      case "NFM Contact name" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.contactName)
        Input.sendKeysByCss(name, NFMContactNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "NFM Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.contactEmail)
        Input.sendKeysByCss(name, NFMContactEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "NFM Phone Number" =>
        Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.phoneNumber)
        Input.sendKeysByCss(name, InputNFMPhonePage.phoneNumber)
        clickByCss(InputUPENamePage.continue)

      case "Contact Details Name" =>
        Wait.waitForElementToPresentByCssSelector(ContactDetailsInputNamePage.contactName)
        Input.sendKeysByCss(name, ContactDetailsInputNamePage.contactName)
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

      case "Second Contact Name" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactNamePage.contactName)
        Input.sendKeysByCss(name, SecondContactNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "Second Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactEmailPage.contactEmail)
        Input.sendKeysByCss(name, SecondContactEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "Second Contact Input" =>
        Wait.waitForElementToPresentByCssSelector(SecondContactInputPage.contactPhone)
        Input.sendKeysByCss(name, SecondContactInputPage.contactPhone)
        clickByCss(InputUPENamePage.continue)

    }
  }

  And("""^I am on feedback survey page$""") { () =>
    Check.checkH1("Give feedback")
  }

  And("""^I should see the answer (.*) remain selected$""") { (answer: String) =>
    Check.checkAnswerSelection(answer)
  }

  And("""^I should see the option (.*) remain selected$""") { (answer: String) =>
    Check.checkOptionSelected(answer)
  }

  And("""^I should see the (.*) field is pre-populated with (.*)$""") { (field: String, name: String) =>
    field match {
      case "UPE name" =>
        assert(getAttributeOf(InputUPENamePage.nameField, "value").equals(name))
      case "NFM name" =>
        assert(getAttributeOf(InputUPENamePage.nameField, "value").equals(name))
      case "Address Line 1" =>
        assert(getAttributeOf(UPEAddressPage.addressLine1, "value").equals(name))
      case "Address Line 2" =>
        assert(getAttributeOf(UPEAddressPage.addressLine2, "value").equals(name))
      case "City" =>
        assert(getAttributeOf(UPEAddressPage.townOrCity, "value").equals(name))
      case "Region" =>
        assert(getAttributeOf(UPEAddressPage.region, "value").equals(name))
        UPEEntityTypePage.clickContinue()
      case "Postal Code" =>
        assert(getAttributeOf(UPEAddressPage.postalCode, "value").equals(name))
      case "Country" =>
        assert(getAttributeOf(UPEAddressPage.country, "value").equals(name))
      case "UPE Person/Team name" =>
        assert(getAttributeOfId(UPEContactNamePage.contactName, "value").equals(name))
      case "UPE Email address" =>
        assert(getAttributeOfId(UPEContactEmailPage.emailField, "value").equals(name))
      case "Phone number" =>
        assert(getAttributeOf(InputUPEPhonePage.phoneNumber, "value").equals(name))
      case "NFM Contact name" =>
        assert(getAttributeOf(NFMContactNamePage.contactName, "value").equals(name))
      case "NFM Contact Email" =>
        assert(getAttributeOf(NFMContactEmailPage.contactEmail, "value").equals(name))
      case "NFM Phone number" =>
        assert(getAttributeOf(InputNFMPhonePage.phoneNumber, "value").equals(name))
      case "Contact Name" =>
        assert(getAttributeOf(ContactDetailsInputNamePage.contactName, "value").equals(name))
      case "Contact Email" =>
        assert(getAttributeOf(ContactDetailsInputEmailPage.contactEmail, "value").equals(name))
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

  And("""^I select option (.*) and continue to GRS page$""") { (option: String) =>
    option match {
      case "UK limited company"            => Input.clickById("value_0")
      case "Limited liability partnership" => Input.clickById("value_1")
    }
    UPEEntityTypePage.clickContinue()
  }

  And("""^I select option (.*) and continue to Name page$""") { (option: String) =>
    option match {
      case "Entity type not listed" => Input.clickById("value_2")
    }
    UPEEntityTypePage.clickContinue()
  }

  And("""^I select option (.*) in further details group status page$""") { (option: String) =>
    option match {
      case "In the UK and outside the UK" => Input.clickById("value_1")
      case "Only in the UK"               => Input.clickById("value_0")
    }
    UPEEntityTypePage.clickContinue()
  }

  And("""^I registered successfully with (.*)""") { (option: String) =>
    option match {
      case "BV disabled" =>
        Wait.waitForElement("registrationSuccessBvDisabled")
        Input.clickById("registrationSuccessBvDisabled")
      case "BV enabled" =>
        Wait.waitForElement("registrationSuccessBvEnabled")
        Input.clickById("registrationSuccessBvEnabled")
    }
  }

  And("""^registration is unsuccessful with (.*) error""") { (error: String) =>
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

  Then("""^The json response Body should contain the status (.*)$""") { text: String =>
    Check.checkBodyText(text)
  }

  And("""^I click on Save&Continue button""") {
    UPEEntityTypePage.clickContinue()
  }
}
