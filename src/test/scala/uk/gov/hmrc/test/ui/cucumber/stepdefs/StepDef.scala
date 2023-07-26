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
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, PageObject, Wait}
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, BusinessActivityEQPage, GlobalGrossRevenueEQPage, InitialGuidancePage, InputTelephonePage, MultipleTerritoriesEQPage, NFMDetailsPage, NFMEQPage, NFMRegistrationPage, UPEAddressPage, UPEContactEmailPage, UPEContactNamePage, UPEEQPage, UPEOrgTypePage, UPEPage, UPETelephonePage}

class StepDef extends BaseStepDef {

  Given("""^(.*) logs in to register for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User" => AuthLoginPage.loginAsInd(name)
      case "Assistant User" => AuthLoginPage.loginAssistant(name)
    }
  }

  Given("""^(.*) logs in to subscribe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToSubscribe(name)
    }
  }

  Given("""^(.*) logs in as upe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPE(name)
    }
  }

  Given("""^(.*) logs in to upe with organisation type for Pillar2$""") { (name: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEAs()
    }
  }

  Given("""^(.*) logs in as upe with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEWithCredID(name, credId)
    }
  }
  Given("""^(.*) logs in with credId (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginAsUserWithCredId(name, credId)
    }
  }
  Given("""^(.*) logs in to upe org page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToOrgWithCredID(name, credId)
    }
  }
  Given("""^(.*) logs in to upe registered in UK page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToRegWithCredID(name, credId)
    }
  }
  Given("""^(.*) logs in to upe name page with CredID (.*) for Pillar2$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToUPEName(name, credId)
    }
  }

  Given("""^(.*) navigates to check your answer page with credId (.*)$""") { (name: String, credId: String) =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToCA(name, credId)
    }
  }

  Then("""^I navigate to (.*) page$""") { page: String =>
    page match {
      case "start" =>
        Nav.navigateTo("http://localhost:10050/pillar-two")
      case "individual" =>
        Nav.navigateTo(
          "http://localhost:10050/pillar-two/register/problem/individual-sign-in-problem"
        )
    }
  }
  Then("""^I clear the cache$""") {
    Nav.navigateTo("http://localhost:10050/pillar-two/test-only/eligibility/clear-session")
  }

  Then("""^The Heading should be (.*)$""") { header: String =>
    Check.checkH1(header)
  }

  Then("""^The Body content should be (.*)$""") { text: String =>
    Check.checkBodyText(text)
  }

  Given("""^I fill (.*) and continue$""") { page: String =>
    page match {
      case "What is the main address of your business page" => Forms.addressNonUK()
    }
    Input.clickSubmit()
  }

  When(
    """^(I click Continue button|click Confirm and send|click Try Again)$"""
  ) { (negate: String) =>
    Input.clickSubmit
  }
  When("""^(I click on Continue button)""") { (negate: String) =>
    InitialGuidancePage.clickContinue()
  }
  And("""^(I navigate from Name page to Telephone page)""") { (negate: String) =>
    InitialGuidancePage.clickContinue()
    InitialGuidancePage.clickContinue()
    InitialGuidancePage.clickContinue()
    InitialGuidancePage.clickContinue()
    InitialGuidancePage.clickContinue()
  }
  Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
    Input.sendKeysById(text, id)
  }

  And("""^I select (.*) and continue$""") { (id: String) =>
    Input.clickById(id)
    Input.clickSubmit
  }

  And("""^I select SignOut link$""") { (id: String) =>
    Input.clickById(id)
    Input.clickSubmit
  }

  And("""^click (.*)$""") { (id: String) =>
    Input.clickByLinkText(id)
  }

  And("""^I click browser back$""") { (id: String) =>
    Input.clickByLinkText(id)
  }

  Given("""^I am on (.*) Page$""") { page: String =>
    page match {
      case "UPE EQ" =>
        navigateTo(UPEEQPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEEQPage.eqForm)
        isVisible(By.cssSelector(UPEEQPage.eq)) shouldBe true
      case "Business activity EQ" =>
        navigateTo(BusinessActivityEQPage.url)
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.eqForm)
        isVisible(By.cssSelector(BusinessActivityEQPage.eq)) shouldBe true
      case "Global gross revenue" =>
        navigateTo(GlobalGrossRevenueEQPage.url)
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.eqForm)
        isVisible(By.cssSelector(GlobalGrossRevenueEQPage.eq)) shouldBe true
      case "Multiple Territories EQ" =>
        navigateTo(MultipleTerritoriesEQPage.url)
        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.eqForm)
        isVisible(By.cssSelector(MultipleTerritoriesEQPage.eq)) shouldBe true
    }
  }

  And("""^I should see error message (.*) on the (.*) Page$""") { (error: String, page: String) =>
    page match {
      case "Business activity EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorLink)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorMessage)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorMessage)) should include(error)

      case "Global gross revenue" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorLink)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorMessage)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorMessage)) should include(error)

      case "Multiple Territories EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorLink)
        getTextOf(By cssSelector (MultipleTerritoriesEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorMessage)
        getTextOf(By cssSelector (MultipleTerritoriesEQPage.errorMessage)) should include(error)

      case "UPE business EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
        getTextOf(By cssSelector (UPEPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
        getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

      case "UPE EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEEQPage.errorLink)
        getTextOf(By cssSelector (UPEEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEEQPage.errorMessage)
        getTextOf(By cssSelector (UPEEQPage.errorMessage)) should include(error)

      case "NFM EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMEQPage.errorLink)
        getTextOf(By cssSelector (NFMEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMEQPage.errorMessage)
        getTextOf(By cssSelector (NFMEQPage.errorMessage)) should include(error)

      case "UPE Org type" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorLink)
        getTextOf(By cssSelector (UPEOrgTypePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEOrgTypePage.errorMessage)
        getTextOf(By cssSelector (UPEOrgTypePage.errorMessage)) should include(error)

      case "Input UPE Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
        getTextOf(By cssSelector (UPEPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
        getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

      case "UPE Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorLink)
        getTextOf(By cssSelector (UPETelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPETelephonePage.errorMessage)
        getTextOf(By cssSelector (UPETelephonePage.errorMessage)) should include(error)

      case "Input Telephone" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(InputTelephonePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(InputTelephonePage.errorLink)
        getTextOf(By cssSelector (InputTelephonePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(InputTelephonePage.errorMessage)
        getTextOf(By cssSelector (InputTelephonePage.errorMessage)) should include(error)

      case "UPE Contact person/team name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorLink)
        getTextOf(By cssSelector (UPEContactNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorMessage)
        getTextOf(By cssSelector (UPEContactNamePage.errorMessage)) should include(error)

      case "UPE contact email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorLink)
        getTextOf(By cssSelector (UPEContactEmailPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorMessage)
        getTextOf(By cssSelector (UPEContactEmailPage.errorMessage)) should include(error)

      case "NFM details page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorLink)
        getTextOf(By cssSelector (NFMDetailsPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorMessage)
        getTextOf(By cssSelector (NFMDetailsPage.errorMessage)) should include(error)

      case "NFM registration page" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorLink)
        getTextOf(By cssSelector (NFMRegistrationPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorMessage)
        getTextOf(By cssSelector (NFMRegistrationPage.errorMessage)) should include(error)
    }
  }
  And("""^I should see address error message (.*) on the (.*) Element$""") { (error: String, page: String) =>
    page match {
      case "Address Line" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.addressErrorLink)
        getTextOf(By cssSelector (UPEAddressPage.addressErrorLink)) should be(error)

        Wait.waitForElementToPresentById(UPEAddressPage.addressErrorMessage)
        getTextOf(By id (UPEAddressPage.addressErrorMessage)) should include(error)

      case "City" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.cityErrorLink)
        getTextOf(By cssSelector (UPEAddressPage.cityErrorLink)) should be(error)

        Wait.waitForElementToPresentById(UPEAddressPage.cityErrorMessage)
        getTextOf(By id (UPEAddressPage.cityErrorMessage)) should include(error)

      case "Country" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(UPEAddressPage.countryErrorLink)
        getTextOf(By cssSelector (UPEAddressPage.countryErrorLink)) should be(error)

        Wait.waitForElementToPresentById(UPEAddressPage.countryErrorMessage)
        getTextOf(By id (UPEAddressPage.countryErrorMessage)) should include(error)
    }
  }

  Then("""^The caption must be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
    assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).contains(caption))
  }

  And("""^I click (.*) link$""") { (linkText: String) =>
    Input.clickByLinkText(linkText)
  }

  And("""^I select option (.*) and continue to next$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No" => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  And("""^I click the browser back button$""") { () =>
    Nav.browserBack()
  }


  /*  Given("""^I fill (.*) and continue$""") { page: String =>
      page match {
        case "What is the main address of your business page" => Forms.addressNonUK()
      }
      Input.clickSubmit()
    }

    And(
      """^(click Continue button|click Confirm and send|click Try Again)$"""
    ) { (negate: String) =>
      Input.clickSubmit
    }

    Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
      Input.sendKeysById(text, id)
    }

    And("""^I select (.*) and continue$""") { (id: String) =>
      Input.clickById(id)
      Input.clickSubmit
    }

    And("""^I click (.*)$""") { (id: String) =>
      Input.clickByLinkText(id)
    }

    And("""^click (.*) element$""") { (id: String) =>
      Input.clickById(id)
    }

    Then("""^The Page should include (.*)$""") { text: String =>
      Check.checkBodyText(text)
    }

    Then("""wait for (.*) seconds$""") { (secs: Int) =>
      Wait.secondsWait(secs)
    }

    Given("""^the user should be on the new window with heading (.*)""") { (title: String) =>
      Input.switchToNewWindow
      Check.checkH1(title)
    }*/

}
