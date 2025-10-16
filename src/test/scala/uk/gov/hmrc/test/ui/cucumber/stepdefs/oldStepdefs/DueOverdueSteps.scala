/*
 * Copyright 2024 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.oldStepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._

class DueOverdueSteps extends ScalaDsl with EN with BrowserDriver {

  And("""I should see {int} accounting periods on Due Overdue Page""") { (accountingPeriods: Int) =>
    Wait.waitForElementToPresentByCssSelector(DueOverduePage.accountDetails)
    assert(driver.findElements(By.cssSelector(DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
  }

  And("""I should see {int} accounting periods on Sub History Page""") { (accountingPeriods: Int) =>
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
    assert(driver.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }

  And("""I should see {int} section with status {string}""") { (count: Int, dueType: String) =>
    dueType match {
      case "Due"     => assert(driver.findElements(By.cssSelector(DueOverduePage.dueSection)).size() == count)
      case "Overdue" => assert(driver.findElements(By.cssSelector(DueOverduePage.overDueSection)).size() == count)
    }
  }

  And("""^I select option (.*) and continue on Pillar2 submission$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickByCss("#value_0")
      case "No"  => Input.clickByCss("#value_1")
    }
    BtnStartPage.clickContinue()
  }

  And("""^I navigate back to BTN Return Submission KB Page$""") { () =>
    Nav.browserBack()
    clickByCss(BtnAgdKBPage.backLink)
  }
}
