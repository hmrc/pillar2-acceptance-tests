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
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationToPageUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.Nav.isVisible
import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages.BusinessActivityEQPage
class BusinessActivityEQs extends CommonFunctions {

  And("""^I choose (.*) and continue$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById ("value_0")
      case "No" => Input.clickById ("value_1")
    }
    BusinessActivityEQPage.clickContinue()
  }

  And("""^I select back link$""") { () =>
    clickByCss(BusinessActivityEQPage.backLink)
  }

  Then("""^The caption should be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.caption)
    assert(getTextOf(By.cssSelector(BusinessActivityEQPage.caption)).contains(caption))
  }

  Then("""^I should navigate to (.*)""") { (page: String) =>
    Wait.waitForElementToClicktagName("h1")
    assertNavigationToPage(pageMatch(page))
  }

  And("""^I continue without selecting an option$""") { () =>
    BusinessActivityEQPage.clickContinue()
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
   }
  }
}
