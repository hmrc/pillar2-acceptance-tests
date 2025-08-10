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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages._

class EligibilityQuestionSteps extends CommonFunctions {

  And("""^I choose (.*) and continue$""") { (option: String) =>
    option match {
      case "Yes"                 => Input.clickById("value_0")
      case "No"                  => Input.clickById("value_1")
      case "Eligibility Yes NFM" => Input.clickById("registeringNfmGroup_0")
      case "Eligibility No NFM"  => Input.clickById("registeringNfmGroup_1")
    }
    BusinessActivityEQPage.clickContinue()
  }

  And("""^I select back link$""") { () =>
    Wait.waitForElementToClickTagName("h1")
    clickByCss(BusinessActivityEQPage.backLink)
  }

  Then("""^The caption should be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.caption)
    assert(getTextOf(By.cssSelector(BusinessActivityEQPage.caption)).equals(caption))
  }

  Then("""^The caption is (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.caption)
    assert(getTextOf(By.cssSelector(NFMRegistrationPage.caption)).contains(caption))
  }

  Then("""^I should navigate to (.*)""") { (page: String) =>
    Wait.waitForElementToClickTagName("h1")
    if (page == "Make a payment page") {
      val currentUrl = driver.getCurrentUrl
      if (currentUrl.contains("payment/pay") || currentUrl.contains("/pay/") || currentUrl.contains("enter-payment-amount")) {
        println(s"Payment page navigation successful - current URL: $currentUrl")
      } else {
        assertNavigationToPage(pageMatch(page))
      }
    } else if (page == "Transaction History Page") {
      val currentUrl = driver.getCurrentUrl
      if (currentUrl.contains("payment/history") || currentUrl.contains("pillar2-top-up-tax-home") || currentUrl.contains("pay-by-bank")) {
        println(s"Payment flow completed - current URL: $currentUrl")
        if (currentUrl.contains("pay-by-bank")) {
          println("Payment service page still active - navigating back to Pillar2")
          driver.navigate().to("http://localhost:10050/report-pillar2-top-up-taxes/pillar2-top-up-tax-home")
          Wait.waitForElementToClickTagName("h1")
        }
      } else {
        assertNavigationToPage(pageMatch(page))
      }
    } else {
      assertNavigationToPage(pageMatch(page))
    }
  }

  Then("""^I enter Address as:""") { (address: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    val current = driver.getCurrentUrl
    
    if (current.contains("/replace-filing-member/")) {
      if (current.contains("/contact-details/content")) {
        RFMContactGuidancePage.clickContinue()
        Wait.waitForTagNameToBeRefreshed("h1")
      }
      
      val updatedUrl = driver.getCurrentUrl
      if (!updatedUrl.contains("input-address") && !updatedUrl.contains("address/input")) {
        if (updatedUrl.contains("/no-id/")) {
          Nav.navigateTo(RFMNewNFMContactAddressInputPage.url)
          Wait.waitForUrl(RFMNewNFMContactAddressInputPage.url)
        } else {
          Nav.navigateTo(RFMContactAddressPage.url)
          Wait.waitForUrl(RFMContactAddressPage.url)
        }
      }
      
      Wait.waitForElementToPresentById("addressLine1")
      Input.enterData(address)
      try {
        Input.clickByCss("#countryCode__option--0")
      } catch {
        case _: Throwable =>
      }
      
      val currentAfterInput = driver.getCurrentUrl
      if (currentAfterInput.contains("business-matching/filing-member/no-id/input-address")) {
        RFMNewNFMContactAddressInputPage.clickContinue()
      } else {
        RFMContactAddressPage.clickContinue()
      }
    } else {
      Wait.waitForTagNameToBeRefreshed("h1")
      Wait.waitForElementToPresentById("addressLine1")
      Input.enterData(address)
      try {
        Input.clickByCss("#countryCode__option--0")
      } catch {
        case _: Throwable =>
      }
      UPEAddressPage.clickCountrySelected()
      UPEEntityTypePage.clickContinue()
    }
  }

  Then("""^I should be on (.*)""") { (page: String) =>
    Wait.waitForElementToClickTagName("h1")
    if (page == "Registration In Progress page") {
      val currentUrl = driver.getCurrentUrl
      if (currentUrl.contains("registration-in-progress")) {
        assertNavigationUrl(pageMatch(page))
      } else if (currentUrl.contains("pillar2-top-up-tax-home")) {
        println("Registration completed immediately, user redirected to dashboard")
      } else {
        assertNavigationUrl(pageMatch(page))
      }
    } else {
      assertNavigationUrl(pageMatch(page))
    }
  }

  And("""^I continue|I continue without selecting an option$""") { () =>
    BusinessActivityEQPage.clickContinue()
  }

  Then("""^The inset text should be (.*)$""") { insetText: String =>
    Wait.waitForElementToPresentByCssSelector(ConfirmationPage.insetText)
    assert(getTextOf(By.cssSelector(ConfirmationPage.insetText)).equals(insetText))
  }

  Then("""^I should be redirect to (.*)""") { (page: String) =>
    assertNavigationUrl(pageMatch(page))
    Wait.waitForElementToPresentByCssSelector(RegistrationProcessingPage.loadingSpinner)
    Wait.waitForElementToClickTagName("h1")
    Wait.waitForCSSElementNotToPresent(RegistrationProcessingPage.loadingSpinner)
  }
}
