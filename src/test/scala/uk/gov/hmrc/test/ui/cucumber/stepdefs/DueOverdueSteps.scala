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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages._

object DueOverdueSteps {

  // I should see {int} accounting periods on Due Overdue Page
  def andIShouldSeeXAccountingPeriodsOnDueOverduePage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(DueOverduePage.accountDetails)
        assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
  }

  // I should see {int} accounting periods on Sub History Page
  def andIShouldSeeXAccountingPeriodsOnSubHistoryPage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
        assert(Driver.instance.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }

  // I should see {int} section with status {string}
  def andIShouldSeeXSectionWithStatusX(count: Int, dueType: String): Unit = {
    dueType match {
          case "Due"     => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.dueSection)).size() == count)
          case "Overdue" => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.overDueSection)).size() == count)
        }
  }

  // ^I select option (.*) and continue on Pillar2 submission$
  def andISelectOptionXAndContinueOnPillar2Submission(option: String): Unit = {
    option match {
          case "Yes" => Input.clickByCss("#value_0")
          case "No"  => Input.clickByCss("#value_1")
        }
        BtnStartPage.clickContinue()
  }

  // ^I navigate back to BTN Return Submission KB Page$
  def andINavigateBackToBTNReturnSubmissionKBPage(): Unit = {
    Nav.browserBack()
        clickByCss(BtnAgdKBPage.backLink)
  }

}
