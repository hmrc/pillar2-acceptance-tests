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
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages.{CheckYourAnswersPage, InitialGuidancePage}

class ChangeYourAnswersPageSteps extends CommonFunctions {


  And("""^I should see row (\d+) key (.*)""") { (row: Int, key: String) =>
    assert(driver.findElements(By.cssSelector(CheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
  }

  And("""^I should see row (\d+) value (.*)$""") { (row: Int, value: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElements(By.cssSelector(CheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  And("""^I click on change hyperlink next to the (.*)""") { (link: String) =>
    link match {
      case "Name" =>
        clickByCss(CheckYourAnswersPage.changeName)
      case "Address" =>
        clickByCss(CheckYourAnswersPage.changeAddress)
      case "Contact Name" =>
        clickByCss(CheckYourAnswersPage.changeContactname)
      case "Email Address" =>
        clickByCss(CheckYourAnswersPage.changeEmailaddress)
      case "Telephone Contact" =>
        clickByCss(CheckYourAnswersPage.changeTelephonecontact)
      case "Telephone Number" =>
        clickByCss(CheckYourAnswersPage.changeTelephonenumber)
    }
  }
  Then("""^I navigate back to check your answers page from (.*) page""") { (page: String) =>
    page match {
      case "name" =>
        for (i <- 1 to 5) {
          InitialGuidancePage.clickContinue()
        }
      case "address" =>
        for (i <- 1 to 5) {
          InitialGuidancePage.clickContinue()
        }
      case "contact name" =>
        for (i <- 1 to 4) {
          InitialGuidancePage.clickContinue()
        }
      case "email address" =>
        for (i <- 1 to 3) {
          InitialGuidancePage.clickContinue()
        }
      case "telephone number" =>
        InitialGuidancePage.clickContinue()
    }

  }

}