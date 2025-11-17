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

package uk.gov.hmrc.test.ui.specsdef
import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.Input.clickByCss
import uk.gov.hmrc.test.ui.helper.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages._

object DueOverdueStepsSteps {

  def andIShouldSeeAccountingPeriodsOnDueOverduePage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(DueOverduePage.accountDetails)
    assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
  }

  def andIShouldSeeXAccountingPeriodsOnSubHistoryPage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
    assert(Driver.instance.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }

  def andIShouldSeeXSectionWithStatus(count: Int, dueType: String): Unit = {
    dueType match {
      case "Due"     => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.dueSection)).size() == count)
      case "Overdue" => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.overDueSection)).size() == count)
    }
  }

  def andISelectOptionAndContinueOnPillar2Submission(option: String): Unit = {
    option match {
      case "Yes" => Input.clickByCss("#value_0")
      case "No"  => Input.clickByCss("#value_1")
    }
    BtnStartPage.clickContinue()
  }

  def andINavigateBackToBTNReturnSubmissionKBPage(): Unit = {
    Nav.browserBack()
    clickByCss(BtnAgdKBPage.backLink)
  }
}
