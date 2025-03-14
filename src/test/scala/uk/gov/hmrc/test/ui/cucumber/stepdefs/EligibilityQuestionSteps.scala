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
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
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
    assertNavigationToPage(pageMatch(page))
  }

  Then("""^I enter Address as:""") { (address: DataTable) =>
    Input.enterData(address)
    UPEAddressPage.clickCountrySelected()
    UPEEntityTypePage.clickContinue()
  }

  Then("""^I should be on (.*)""") { (page: String) =>
    Wait.waitForElementToClickTagName("h1")
    assertNavigationUrl(pageMatch(page))
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
