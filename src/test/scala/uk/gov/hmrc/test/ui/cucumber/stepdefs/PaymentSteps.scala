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
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, DashboardPage, MakePaymentPage}


class PaymentSteps extends CommonFunctions {


  And("""^I should see the heading (\d+) on Dashboard page as (.*)""") { (headingNumber: Int, heading: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.sectionHeading)).get(headingNumber - 1).getText.contains(heading))
  }

  Given("""^(.*) logs in Dashboard page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToDashboard(name)
      case _ => AuthLoginPage.loginToDashboard(name)
    }
  }

  And("""^I should see User details in dashboard page$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(DashboardPage.userDetails)
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).size() == 3)
  }

  Then("""^I should be navigated to new tab$""") { () =>

    val handles = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    driver.switchTo().window(newWindow)
    Wait.waitForTagNameToBeRefreshed("h1")
  }

  Then("""^I should navigate back to main tab""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    driver.switchTo().window(mainWindow)
    Wait.waitForTagNameToBeRefreshed("h1")
  }

  Then("""^I close new tab""") { () =>
    driver.close()
  }

  And("""^I should see user details row (\d+) key (.*)""") { (detailNumber: Int, detailName: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).get(detailNumber - 1).getText.contains(detailName))
  }

  And("""^I should see user details row (\d+) value (.*)""") { (detailNumber: Int, detailValue: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).get(detailNumber - 1).getText.contains(detailValue))
  }

  Then("""^The inactive status should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(DashboardPage.inactiveStatus)
    assert(getTextOf(By.cssSelector(DashboardPage.inactiveStatus)).contains(header))
  }

  Then("""^The caption for section (\d+) should be (.*)$""") { (detailNumber: Int, caption: String) =>
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableCaption)).get(detailNumber - 1).getText.contains(caption))
  }

  Then("""^The warning message should be (.*)$""") { message: String =>
    Wait.waitForElementToPresentByCssSelector(MakePaymentPage.warningMessage)
    assert(getTextOf(By.cssSelector(MakePaymentPage.warningMessage)).contains(message))
  }

  And("""^The section (\d+) with header (.*) value should be (.*)$""") { (detailNumber: Int, header: String, cell: String) =>
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableHeader)).get(detailNumber - 1).getText.contains(header))
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableCell)).get(detailNumber - 1).getText.contains(cell))
  }

  When("""^I click on toggle link (.*)$""")  {(option: String)=>
    option match {
      case "How long it takes" => Input.clickByXpath(MakePaymentPage.firstToggleLink)
      case "Make a payment from outside the UK" =>Input.clickByXpath(MakePaymentPage.secondToggleLink)
    }
  }
}

