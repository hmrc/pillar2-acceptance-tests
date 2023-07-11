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

import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getAttribueOf, getAttributeOf, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.{Check, Find, Input, Wait}
import uk.gov.hmrc.test.ui.pages.{BusinessActivityEQPage, InputTelephonePage, InputUPENamePage, UPEAddressPage, UPEContactEmailPage, UPEContactNamePage, UPEOrgTypePage, UPEPage, UPETelephonePage}
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationUrl, include}


class UPEPageSteps extends CommonFunctions {

  And("""^I enter (.*) as (.*)$""") { (field: String, name: String) =>
    field match {
      case "UPE name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Input.sendKeysByCss(name, InputUPENamePage.nameField)
        clickByCss(InputUPENamePage.continue)

      case "Address Line 1" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.addressLine1)
        Input.sendKeysById(name, UPEAddressPage.addressLine1)

      case "Address Line 2" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.addressLine2)
        Input.sendKeysById(name, UPEAddressPage.addressLine2)

      case "City" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.townOrCity)
        Input.sendKeysById(name, UPEAddressPage.townOrCity)

      case "Region" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.region)
        Input.sendKeysById(name, UPEAddressPage.region)

      case "Postal Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.postalCode)
        Input.sendKeysById(name, UPEAddressPage.postalCode)

      case "Country" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEAddressPage.country)
        Input.sendKeysById(name, UPEAddressPage.country)

      case "UPE Person/Team name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEContactNamePage.contactName)
        Input.sendKeysById(name, UPEContactNamePage.contactName)

      case "UPE Email address" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(UPEContactEmailPage.emailField)
        Input.sendKeysById(name, UPEContactEmailPage.emailField)

      case "Telephone Number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(InputTelephonePage.telephoneNumber)
        Input.sendKeysByCss(name, InputTelephonePage.telephoneNumber)

    }

  }

  And("""^I am on feedback survey page$""") { () =>
    Check.checkH1("Give feedback")
  }

    And("""^I should see the answer (.*) remain selected$""") { (answer: String) =>
      Check.checkAnswerSelection(answer)
    }


    And("""^I should see the (.*) field is pre-populated with (.*)$""") { (field: String, name: String) =>
      field match {
        case "UPE name" =>
          assert(getAttribueOf(InputUPENamePage.nameField, "value").equals(name))
        case "Address Line 1" =>
          assert(getAttributeOf(UPEAddressPage.addressLine1, "value").equals(name))
        case "Address Line 2" =>
          assert(getAttributeOf(UPEAddressPage.addressLine2, "value").equals(name))
        case "City" =>
          assert(getAttributeOf(UPEAddressPage.townOrCity, "value").equals(name))
        case "Region" =>
          assert(getAttributeOf(UPEAddressPage.region, "value").equals(name))
        case "Postal Code" =>
          assert(getAttributeOf(UPEAddressPage.postalCode, "value").equals(name))
        case "Country" =>
          assert(getAttributeOf(UPEAddressPage.country, "value").equals(name))
        case "UPE Person/Team name" =>
          assert(getAttributeOf(UPEContactNamePage.contactName, "value").equals(name))
        case "UPE Email address" =>
          assert(getAttributeOf(UPEContactEmailPage.emailField, "value").equals(name))
        case "Telephone number" =>
          assert(getAttribueOf(InputTelephonePage.telephoneNumber, "value").equals(name))

      }
    }

    When("""I continue to next page""") { () =>
      UPEPage.clickContinue();
    }

    And("""^I select option (.*) and continue to GRS page$""") { (option: String) =>
      option match {
        case "UK limited company"            => Input.clickById("value_0")
        case "Limited liability partnership" => Input.clickById("value_1")
      }
      UPEOrgTypePage.clickContinue()
    }

    And("""^I registered successfully with (.*)""") { (option: String) =>
      option match {
        case "BV disabled" => Wait.waitForElement("registrationSuccessBvDisabled")
          Input.clickById("registrationSuccessBvDisabled")
        case "BV enabled" => Wait.waitForElement("registrationSuccessBvEnabled")
          Input.clickById("registrationSuccessBvEnabled")
      }
    }

    And("""^registration is unsuccessful with (.*) error""") { (error: String) =>
      error match {
        case "party type mismatch" => Wait.waitForElement("registrationFailedPartyTypeMismatch")
          Input.clickById("registrationFailedPartyTypeMismatch")
        case "generic error" => Wait.waitForElement("registrationFailedGeneric")
          Input.clickById("registrationFailedGeneric")
        case "identifiers not match" => Wait.waitForElement("registrationFailedGeneric")
          Input.clickById("registrationNotCalledIdentifierMismatch")
        case "BV failed" => Wait.waitForElement("registrationFailedGeneric")
          Input.clickById("registrationNotCalledBvFailed")
      }
    }

    Then("""^The json response Body should contain the status (.*)$""") { text: String =>
      Check.checkBodyText(text)
    }

    And("""^I click on Save&Continue button""") {
      UPEOrgTypePage.clickContinue()
    }
  }
