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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input._
import uk.gov.hmrc.test.ui.cucumber.{Check, Input, Wait}
import uk.gov.hmrc.test.ui.pages._

class UPEPageSteps extends CommonFunctions {

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

      case "Telephone Number" =>
        Wait.waitForElementToPresentByCssSelector(
          InputUPETelephonePage.telephoneNumber
        )
        Input.sendKeysByCss(name, InputUPETelephonePage.telephoneNumber)
        clickByCss(InputUPENamePage.continue)

      case "NFM Contact name" =>
        Wait.waitForElementToPresentByCssSelector(
          NFMContactNamePage.contactName
        )
        Input.sendKeysByCss(name, NFMContactNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "NFM Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(
          NFMContactEmailPage.contactEmail
        )
        Input.sendKeysByCss(name, NFMContactEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "NFM Telephone Number" =>
        Wait.waitForElementToPresentByCssSelector(
          InputNFMTelephonePage.telephoneNumber
        )
        Input.sendKeysByCss(name, InputNFMTelephonePage.telephoneNumber)
        clickByCss(InputUPENamePage.continue)

      case "Contact Details Name" =>
        Wait.waitForElementToPresentByCssSelector(
          ContactDetailsInputNamePage.contactName
        )
        Input.sendKeysByCss(name, ContactDetailsInputNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "Contact Name" =>
        Wait.waitForElementToPresentByCssSelector(
          ContactDetailsInputNamePage.contactName
        )
        Input.sendKeysByCss(name, ContactDetailsInputNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(
          ContactDetailsInputEmailPage.contactEmail
        )
        Input.sendKeysByCss(name, ContactDetailsInputEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "Contact Telephone" =>
        Wait.waitForElementToPresentByCssSelector(
          ContactDetailsInputTelephonePage.contactTelephone
        )
        Input.sendKeysByCss(
          name,
          ContactDetailsInputTelephonePage.contactTelephone
        )
        clickByCss(InputUPENamePage.continue)

      case "Second Contact Name" =>
        Wait.waitForElementToPresentByCssSelector(
          SecondContactNamePage.contactName
        )
        Input.sendKeysByCss(name, SecondContactNamePage.contactName)
        clickByCss(InputUPENamePage.continue)

      case "Second Contact Email" =>
        Wait.waitForElementToPresentByCssSelector(
          SecondContactEmailPage.contactEmail
        )
        Input.sendKeysByCss(name, SecondContactEmailPage.contactEmail)
        clickByCss(InputUPENamePage.continue)

      case "Second Contact Input" =>
        Wait.waitForElementToPresentByCssSelector(
          SecondContactInputPage.contactTelephone
        )
        Input.sendKeysByCss(name, SecondContactInputPage.contactTelephone)
        clickByCss(InputUPENamePage.continue)

    }
  }

  And("""^I should see address error message (.*) on the (.*) Element$""") {
    (error: String, page: String) =>
      page match {
        case "Address Line" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.addressErrorLink
          )
          getTextOf(By cssSelector (UPEAddressPage.addressErrorLink)) should be(
            error
          )

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.addressErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.addressErrorMessage)
          ) should include(error)

        case "Address Line 2" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.addressLine2ErrorLink
          )
          getTextOf(
            By cssSelector (UPEAddressPage.addressLine2ErrorLink)
          ) should be(error)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.addressLine2ErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.addressLine2ErrorMessage)
          ) should include(error)

        case "City" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.cityErrorLink
          )
          getTextOf(By cssSelector (UPEAddressPage.cityErrorLink)) should be(
            error
          )

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.cityErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.cityErrorMessage)
          ) should include(error)

        case "Region" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.regionLink)
          getTextOf(By cssSelector (UPEAddressPage.regionLink)) should be(error)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.regionErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.regionErrorMessage)
          ) should include(error)

        case "Postal code" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.postalCodeErrorLink
          )
          getTextOf(
            By cssSelector (UPEAddressPage.postalCodeErrorLink)
          ) should be(error)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.postalCodeErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.postalCodeErrorMessage)
          ) should include(error)

        case "Country" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.countryErrorLink
          )
          getTextOf(By cssSelector (UPEAddressPage.countryErrorLink)) should be(
            error
          )

          Wait.waitForElementToPresentByCssSelector(
            UPEAddressPage.countryErrorMessage
          )
          getTextOf(
            By cssSelector (UPEAddressPage.countryErrorMessage)
          ) should include(error)
      }
  }

  And("""^I am on feedback survey page$""") { () =>
    Check.checkH1("Give feedback")
  }

  And("""^I should see the answer (.*) remain selected$""") {
    (answer: String) =>
      Check.checkAnswerSelection(answer)
  }

  And("""^I should see the option (.*) remain selected$""") {
    (answer: String) =>
      Check.checkOptionSelected(answer)
  }

  And("""^I should see the (.*) field is pre-populated with (.*)$""") {
    (field: String, name: String) =>
      field match {
        case "UPE name" =>
          assert(
            getAttributeOf(InputUPENamePage.nameField, "value").equals(name)
          )
        case "NFM name" =>
          assert(
            getAttributeOf(InputUPENamePage.nameField, "value").equals(name)
          )
        case "Address Line 1" =>
          assert(
            getAttributeOf(UPEAddressPage.addressLine1, "value").equals(name)
          )
        case "Address Line 2" =>
          assert(
            getAttributeOf(UPEAddressPage.addressLine2, "value").equals(name)
          )
        case "City" =>
          assert(
            getAttributeOf(UPEAddressPage.townOrCity, "value").equals(name)
          )
        case "Region" =>
          assert(getAttributeOf(UPEAddressPage.region, "value").equals(name))
          UPEEntityTypePage.clickContinue()
        case "Postal Code" =>
          assert(
            getAttributeOf(UPEAddressPage.postalCode, "value").equals(name)
          )
        case "Country" =>
          assert(getAttributeOf(UPEAddressPage.country, "value").equals(name))
        case "UPE Person/Team name" =>
          assert(
            getAttributeOfId(UPEContactNamePage.contactName, "value").equals(
              name
            )
          )
        case "UPE Email address" =>
          assert(
            getAttributeOfId(UPEContactEmailPage.emailField, "value").equals(
              name
            )
          )
        case "Telephone number" =>
          assert(
            getAttributeOf(InputUPETelephonePage.telephoneNumber, "value")
              .equals(name)
          )
        case "NFM Contact name" =>
          assert(
            getAttributeOf(NFMContactNamePage.contactName, "value").equals(name)
          )
        case "NFM Contact Email" =>
          assert(
            getAttributeOf(NFMContactEmailPage.contactEmail, "value").equals(
              name
            )
          )
        case "NFM Telephone number" =>
          assert(
            getAttributeOf(InputNFMTelephonePage.telephoneNumber, "value")
              .equals(name)
          )
        case "Contact Name" =>
          assert(
            getAttributeOf(ContactDetailsInputNamePage.contactName, "value")
              .equals(name)
          )
        case "Contact Email" =>
          assert(
            getAttributeOf(ContactDetailsInputEmailPage.contactEmail, "value")
              .equals(name)
          )
        case "Contact Telephone" =>
          assert(
            getAttributeOf(
              ContactDetailsInputTelephonePage.contactTelephone,
              "value"
            ).equals(name)
          )
        case "Second Contact Name" =>
          assert(
            getAttributeOf(SecondContactNamePage.contactName, "value").equals(
              name
            )
          )
        case "Second Contact Email" =>
          assert(
            getAttributeOf(SecondContactEmailPage.contactEmail, "value").equals(
              name
            )
          )
        case "Second Contact Input" =>
          assert(
            getAttributeOf(SecondContactInputPage.contactTelephone, "value")
              .equals(name)
          )
        case "Redirect URL" =>
          assert(
            getAttributeOf(AuthLoginPage.redirectionUrlField, "value").contains(
              name
            )
          )
        case "PLRID" =>
          assert(
            getAttributeOf(ASAPillar2InputPage.pillar2IDField, "value").equals(
              name
            )
          )
        case "UK Bank Name" =>
          assert(
            getAttributeOf(UKBankAccountPaymentPage.UKbankName, "value").equals(
              name
            )
          )
      }
  }

  And("""^I should see the (.*) field is selected with (.*)$""") {
    (field: String, name: String) =>
      field match {
        case "Country" =>
          assert(getAttributeOf(NFMAddressPage.country, "value").equals(name))
      }
  }

  When("""I continue to next page""") { () =>
    UPEPage.clickContinue();
  }

  And("""^I select option (.*) and continue to GRS page$""") {
    (option: String) =>
      option match {
        case "UK limited company"            => Input.clickById("value_0")
        case "Limited liability partnership" => Input.clickById("value_1")
      }
      UPEEntityTypePage.clickContinue()
  }

  And("""^I select option (.*) and continue to Name page$""") {
    (option: String) =>
      option match {
        case "Entity type not listed" => Input.clickById("value_2")
      }
      UPEEntityTypePage.clickContinue()
  }

  And("""^I select option (.*) in further details group status page$""") {
    (option: String) =>
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

  Then("""^The json response Body should contain the status (.*)$""") {
    text: String =>
      Check.checkBodyText(text)
  }

  And("""^I click on Save&Continue button""") {
    UPEEntityTypePage.clickContinue()
  }

  Then("""^The second heading should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(
      UPEGRSRegistrationFailedErrorPage.secondHeader
    )
    assert(
      getTextOf(By.cssSelector(UPEGRSRegistrationFailedErrorPage.secondHeader))
        .contains(header)
    )
  }

  Then("""^The field heading should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.fieldHeader)
    assert(
      getTextOf(By.cssSelector(FDGroupStatusPage.fieldHeader)).contains(header)
    )
  }
  And("""^I should see heading (\d+) as (.*)""") {
    (sectionNumber: Int, sectionName: String) =>
      sectionNumber match {
        case 1 =>
          assert(
            driver
              .findElements(By.cssSelector(ConfirmationPage.firstHeading))
              .get(sectionNumber - 1)
              .getText
              .contains(sectionName)
          )
        case 2 =>
          assert(
            driver
              .findElements(By.cssSelector(ConfirmationPage.secondHeading))
              .get(sectionNumber - 2)
              .getText
              .contains(sectionName)
          )
      }
  }
  Then("""^The field content should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.fieldContent)
    assert(
      getTextOf(By.cssSelector(NFMRegistrationPage.fieldContent))
        .contains(header)
    )
  }
}
