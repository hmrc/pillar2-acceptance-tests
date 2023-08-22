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


import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.cucumber.{Find, Wait}
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, NFMAddressPage, NFMContactEmailPage, NFMContactNamePage, NFMNamePage, UPEAddressPage}


class NFMPageSteps extends CommonFunctions {


  And("""^I select country as (.*)$""") { (country: String) =>
    country match {
      case "United Kingdom" =>
        selectCountryUK()

      case "India" =>
        selectCountryIndia()
    }
  }
  def selectCountryIndia(): Unit =new Select(findCountry()).selectByVisibleText("India")
  def selectCountryUK(): Unit =new Select(findCountry()).selectByVisibleText("United Kingdom")
  def findCountry(): WebElement =Find.findByName("countryCode")

  And("""^I should see NFM error message (.*) on the (.*) Element$""") { (error: String, page: String) =>
    page match {
      case "Input NFM Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMNamePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMNamePage.errorLink)
        getTextOf(By cssSelector (NFMNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMNamePage.errorMessage)
        getTextOf(By cssSelector (NFMNamePage.errorMessage)) should include(error)

      case "Address Line 1" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.addressLine1ErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.addressLine1ErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.addressLine1ErrorMessage)
        getTextOf(By cssSelector  (NFMAddressPage.addressLine1ErrorMessage)) should include(error)

      case "Address Line 2" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.addressLine2ErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.addressLine2ErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.addressLine2ErrorMessage)
        getTextOf(By cssSelector (NFMAddressPage.addressLine2ErrorMessage)) should include(error)

      case "City" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.cityErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.cityErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.cityErrorMessage)
        getTextOf(By cssSelector  (NFMAddressPage.cityErrorMessage)) should include(error)

      case "Region" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.regionErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.regionErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.regionErrorMessage)
        getTextOf(By cssSelector (NFMAddressPage.regionErrorMessage)) should include(error)

      case "Postal Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.postcodeErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.postcodeErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.postcodeErrorMessage)
        getTextOf(By cssSelector (NFMAddressPage.postcodeErrorMessage)) should include(error)

      case "Country" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.countryErrorLink)
        getTextOf(By cssSelector (NFMAddressPage.countryErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMAddressPage.countryErrorMessage)
        getTextOf(By cssSelector  (NFMAddressPage.countryErrorMessage)) should include(error)

      case "Input NFM Contact Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.errorLink)
        getTextOf(By cssSelector (NFMContactNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMContactNamePage.errorMessage)
        getTextOf(By cssSelector (NFMContactNamePage.errorMessage)) should include(error)
      case "Input NFM Contact Email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorLink)
        getTextOf(By cssSelector (NFMContactEmailPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorMessage)
        getTextOf(By cssSelector (NFMContactEmailPage.errorMessage)) should include(error)


    }
  }

  Given("""^(.*) logs in NFM name page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMName(name)
    }
  }

  Given("""^(.*) logs in NFM address page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMAddress(name)
    }
  }

  Given("""^(.*) logs in NFM Contact Name page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMContactName(name)
    }
  }

  Given("""^(.*) logs in NFM Contact Email page for Pillar2$""") { name: String =>
    name match {
     case "Organisation User" => AuthLoginPage.loginToNFMContactEmail(name)
    }
  }

  Given("""^(.*) logs in NFM Telephone page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMTelephone(name)
    }
  }

  Given("""^(.*) logs in NFM Telephone input page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMTelephoneInput(name)
    }
  }

}
