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

import com.sun.tools.javac.comp.Check
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.Nav.isVisible
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages.{BusinessActivityEQPage, CheckYourAnswersPage, InitialGuidancePage, TaskListPage}

class TaskListPageSteps extends CommonFunctions {

  And("""^I should see task list sections$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    assert(driver.findElements(By.cssSelector(TaskListPage.taskSection)).size() == 3)
  }

  And("""^I should see section (\d+) as (.*)""") { (sectionNumber: Int, sectionName: String) =>
    assert(driver.findElements(By.cssSelector(TaskListPage.taskSection)).get(sectionNumber - 1).getText.contains(sectionName))
  }

  And("""^I should see the task name (.*) on Business details section""") { (taskName: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    assert(driver.findElement(By.cssSelector(TaskListPage.taskItems)).getText.contains(taskName))
  }

  And("""^I should see employee status link (.*)""") { (empStatusLink: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    isVisible(By.cssSelector(TaskListPage.empStatusLink)) shouldBe true
  }
  And("""^The Task (.*) status should be (.*)$""") { (taskName: String, status: String) =>
    taskName match {
      case "Enter ultimate parent's details" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElements(By.cssSelector(TaskListPage.taskItem)).get(0).getText.contains(taskName))
        println(driver.findElements(By.cssSelector(TaskListPage.status)).get(0).getText)
        assert(driver.findElements(By.cssSelector(TaskListPage.status)).get(0).getText.contains(status))

      case "Enter filing member's details" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(driver.findElements(By.cssSelector(TaskListPage.taskItem)).get(1).getText.contains(taskName))
        assert(driver.findElements(By.cssSelector(TaskListPage.status)).get(1).getText.contains(status))
    }

  }

  And("""^I navigate back to TaskList Page from Name Page""") {
    for (i <- 1 to 3)
      {
        clickByCss(BusinessActivityEQPage.backLink)
      }
  }


}