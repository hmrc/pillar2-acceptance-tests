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
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages._

object TaskListSteps {

  // ^I should see task list sections$
  def andIShouldSeeTaskListSections(): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
        assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskSection)).size() == 3)
  }

  // ^I should see the task name (.*) on Business details section
  def andIShouldSeeTheTaskNameXOnBusinessDetailsSection(taskName: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
        assert(Driver.instance.findElement(By.cssSelector(TaskListPage.taskItems)).getText.contains(taskName))
  }

  // ^The Task (.*) status should be (.*)$
  def andTheTaskXStatusShouldBeX(taskName: String, status: String): Unit = {
    taskName match {
          case "Add Ultimate Parent Entity details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(0).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(0).getText.contains(status))

          case "Edit Ultimate Parent Entity details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(0).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(0).getText.contains(status))

          case "Filing member details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(1).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(1).getText.contains(status))

          case "Add filing member details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(1).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(1).getText.contains(status))

          case "Edit filing member details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(1).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(1).getText.contains(status))

          case "Further group details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(2).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(2).getText.contains(status))

          case "Add further group details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(2).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(2).getText.contains(status))

          case "Edit further group details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(2).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(2).getText.contains(status))

          case "Contact details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(3).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(3).getText.contains(status))

          case "Add contact details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(3).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(3).getText.contains(status))

          case "Edit contact details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(3).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(3).getText.contains(status))

          case "Check your answers" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(4).getText.contains(taskName))
            assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(4).getText.contains(status))

        }
  }

  // ^I navigate back to TaskList Page from (.*) Page
  def thenINavigateBackToTaskListPageFromXPage(page: String): Unit = {
    page match {
          case "Name" =>
            for (i <- 1 to 3) {
              clickByCss(BusinessActivityEQPage.backLink)
            }

          case "GRS" =>
            for (i <- 1 to 4) {
              clickByCss(BusinessActivityEQPage.backLink)
            }

          case "Phone" =>
            for (i <- 1 to 8) {
              clickByCss(BusinessActivityEQPage.backLink)
            }

          case "Phone Input" =>
            for (i <- 1 to 9) {
              clickByCss(BusinessActivityEQPage.backLink)
            }
        }
  }

  // ^I navigate to Phone Question Page from Initial guidance Page
  def thenINavigateToPhoneQuestionPageFromInitialGuidancePage(): Unit = {
    for (i <- 1 to 6) {
          InitialGuidancePage.clickContinue()
        }
  }

}
