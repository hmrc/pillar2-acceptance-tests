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
import uk.gov.hmrc.test.ui.cucumber.Input.{getAttributeOfId, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.{Check, Input, Wait}
import uk.gov.hmrc.test.ui.pages._

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class SubscriptionJourneySteps extends CommonFunctions {

  And("""^I enter account period as:$""") { (accountPeriod: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(accountPeriod)
    UPEEntityTypePage.clickContinue()
  }

  And("""^Accounting Period (.*) is entered as (.*)$""") { (field: String, name: String) =>
    field match {
      case "Start Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startDay)
        Input.sendKeysById(GroupAccountingPeriodPage.startDay, name)

      case "Start Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startMonth)
        Input.sendKeysById(GroupAccountingPeriodPage.startMonth, name)

      case "Start Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startYear)
        Input.sendKeysById(GroupAccountingPeriodPage.startYear, name)

      case "End Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endDay)
        Input.sendKeysById(GroupAccountingPeriodPage.endDay, name)

      case "End Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endMonth)
        Input.sendKeysById(GroupAccountingPeriodPage.endMonth, name)

      case "End Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endYear)
        Input.sendKeysById(GroupAccountingPeriodPage.endYear, name)
    }
  }
  And("""^I should see date field (.*) is pre-populated with (.*)$""") { (field: String, name: String) =>
    field match {
      case "Start Day" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.startDay, "value").equals(name))

      case "Start Month" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.startMonth, "value").equals(name))

      case "Start Year" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.startYear, "value").equals(name))

      case "End Day" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.endDay, "value").equals(name))

      case "End Month" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.endMonth, "value").equals(name))

      case "End Year" =>
        assert(getAttributeOfId(GroupAccountingPeriodPage.endYear, "value").equals(name))
    }
  }

  And("""^I should see contact address error message (.*) on the (.*)""") { (error: String, page: String) =>
    page match {
      case "Address Line 1" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.addressLine1ErrorLink)
        getTextOf(By cssSelector (ContactAddressInputPage.addressLine1ErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.addressLine1ErrorMessage)
        getTextOf(By cssSelector (ContactAddressInputPage.addressLine1ErrorMessage)) should include(error)

      case "Address Line 2" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.addressLine2ErrorLink)
        getTextOf(By cssSelector (ContactAddressInputPage.addressLine2ErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.addressLine2ErrorMessage)
        getTextOf(By cssSelector (ContactAddressInputPage.addressLine2ErrorMessage)) should include(error)

      case "City" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.cityErrorLink)
        getTextOf(By cssSelector (ContactAddressInputPage.cityErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.cityErrorMessage)
        getTextOf(By cssSelector (ContactAddressInputPage.cityErrorMessage)) should include(error)

      case "Region" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.regionErrorLink)
        getTextOf(By cssSelector (ContactAddressInputPage.regionErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.regionErrorMessage)
        getTextOf(By cssSelector (ContactAddressInputPage.regionErrorMessage)) should include(error)

      case "Country" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.countryErrorLink)
        getTextOf(By cssSelector (ContactAddressInputPage.countryErrorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(ContactAddressInputPage.countryErrorMessage)
        getTextOf(By cssSelector (ContactAddressInputPage.countryErrorMessage)) should include(error)
    }
  }

  Then("""^The Header should be Report Pillar 2 Top-up Taxes$""") { () =>
    Check.checkH1("Registration complete")
  }

  And("""^Url for (.*) page should be ending with (.*)$""") { (page: String, url: String) =>
    page match {
      case "registration submit" => Check.checkUrlContains(url = "/review-submit/confirmation")
      case "bookmark error"      => Check.checkUrlContains(url = "/errors/task-not-yet-started")
    }
  }

  And("""^The page should display message (.*) and ID$""") { (text: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(driver.findElement(By.cssSelector(RegistrationConfirmationPage.header)).getText.contains(text))
    Check.checkBodyText(text)
  }
  Then("""^The Id text should be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.registrationID)
    assert(getTextOf(By.cssSelector(RegistrationConfirmationPage.registrationID)).contains(caption))
  }

  Then("""^The Information header should be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.header2)
    assert(getTextOf(By.cssSelector(RegistrationConfirmationPage.header2)).contains(caption))
  }

  Then("""^The registration date should be displayed as current day$""") { () =>
    val todayDate: String = LocalDate.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy"))
    assert(getTextOf(By.cssSelector(ConfirmationPage.firstHeading)).contains(todayDate))
  }

}
