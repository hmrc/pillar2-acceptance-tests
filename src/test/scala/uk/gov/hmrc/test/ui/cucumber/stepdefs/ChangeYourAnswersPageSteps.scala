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
import uk.gov.hmrc.test.ui.pages.{FurtherDetailsCheckYourAnswersPage, InitialGuidancePage, NFMCheckYourAnswersPage, UPECheckYourAnswersPage}

class ChangeYourAnswersPageSteps extends CommonFunctions {


  And("""^I should see row (\d+) key (.*)""") { (row: Int, key: String) =>
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
  }

  And("""^I should see row (\d+) value (.*)$""") { (row: Int, value: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  And("""^I click on change hyperlink next to the (.*)""") { (link: String) =>
    link match {
      case "UPE Name" =>
        clickByCss(UPECheckYourAnswersPage.changeName)
      case "UPE Address" =>
        clickByCss(UPECheckYourAnswersPage.changeAddress)
      case "UPE Contact Name" =>
        clickByCss(UPECheckYourAnswersPage.changeContactname)
      case "UPE Email Address" =>
        clickByCss(UPECheckYourAnswersPage.changeEmailaddress)
      case "UPE Telephone Contact" =>
        clickByCss(UPECheckYourAnswersPage.changeTelephonecontact)
      case "UPE Telephone Number" =>
        clickByCss(UPECheckYourAnswersPage.changeTelephonenumber)
      case "NFM Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeName)
      case "NFM Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeAddress)
      case "NFM Contact Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeContactname)
      case "NFM Email Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeEmailaddress)
      case "NFM Telephone Contact" =>
        clickByCss(NFMCheckYourAnswersPage.changeTelephonecontact)
      case "NFM Telephone Number" =>
        clickByCss(NFMCheckYourAnswersPage.changeTelephonenumber)
      case "FD Group Status" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeGroupStatus)
      case "Accounting Period" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeAccountingPeriod)
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
