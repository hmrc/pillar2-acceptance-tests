/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specstepdef
import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.specpages._

object ASAStepsSteps {

  // ^I provide ASA (.*) as (.*)$
  def andIProvideASAAs(field: String, value: String): Unit = {
    field match {
      case "Pillar2 ID" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ASAPillar2InputPage.pillar2IDField)
        Input.sendKeysByCss(value, ASAPillar2InputPage.pillar2IDField)
    }
  }

  // ^I should see {int} accounting periods on Due Overdue Page$
  def andIShouldSeeIntAccountingPeriodsOnDueOverduePage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(DueOverduePage.accountDetails)
    assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
    println(s"Verified presence of $accountingPeriods periods.")
  }

  // "I should see {int} section with status {string}"
  def andIShouldSeeIntSectionWithStatusString(count: Int, dueType: String): Unit = {
    dueType match {
      case "Due"     => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.dueSection)).size() == count)
      case "Overdue" => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.overDueSection)).size() == count)
    }
  }

  // "I should see {int} accounting periods on Sub History Page"
  def andIShouldSeeIntAccountingPeriodsOnSubHistoryPage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
    assert(Driver.instance.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }
}
