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
import uk.gov.hmrc.test.ui.cucumber.Nav.isVisible
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages._

class TaskListPageSteps extends CommonFunctions {

  And("""^I should see task list sections$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    assert(driver.findElements(By.cssSelector(TaskListPage.taskSection)).size() == 3)
  }

  And("""^I should see section (\d+) as (.*)""") { (sectionNumber: Int, sectionName: String) =>
    assert(driver.findElements(By.cssSelector(TaskListPage.taskSection)).get(sectionNumber - 1).getText.contains(sectionName))
  }

  And("""^I should see sub section (\d+) as (.*)""") { (sectionNumber: Int, sectionName: String) =>
    assert(driver.findElements(By.cssSelector(ContactDetailsSummaryPage.section)).get(sectionNumber - 1).getText.contains(sectionName))
  }

  And("""^I should see the task name (.*) on Business details section""") { (taskName: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    assert(driver.findElement(By.cssSelector(TaskListPage.taskItems)).getText.contains(taskName))
  }

  And("""^I should see the task section (\d+) with task name as (.*) on Contact details section$""") { (sectionNumber: Int, taskName: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    assert(driver.findElements(By.cssSelector(TaskListPage.taskSection)).get(sectionNumber - 1).getText.contains(taskName))
  }

  And("""^I should see employee status link (.*)""") { (empStatusLink: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(TaskListPage.taskList)
    isVisible(By.cssSelector(TaskListPage.empStatusLink)) shouldBe true
  }
  And("""^The Task (.*) status should be (.*)$""") { (taskName: String, status: String) =>
    taskName match {
      case "Add Ultimate Parent Entity details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 0, s"Expected at least 1 task item but found ${taskItems.size()}")
        assert(taskItems.get(0).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 0, s"Expected at least 1 status item but found ${statusItems.size()}")
        assert(statusItems.get(0).getText.contains(status))

      case "Edit Ultimate Parent Entity details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 0, s"Expected at least 1 task item but found ${taskItems.size()}")
        assert(taskItems.get(0).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 0, s"Expected at least 1 status item but found ${statusItems.size()}")
        assert(statusItems.get(0).getText.contains(status))

      case "Filing member details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 1, s"Expected at least 2 task items but found ${taskItems.size()}")
        assert(taskItems.get(1).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 1, s"Expected at least 2 status items but found ${statusItems.size()}")
        assert(statusItems.get(1).getText.contains(status))

      case "Add filing member details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 1, s"Expected at least 2 task items but found ${taskItems.size()}")
        assert(taskItems.get(1).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 1, s"Expected at least 2 status items but found ${statusItems.size()}")
        assert(statusItems.get(1).getText.contains(status))

      case "Edit filing member details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 1, s"Expected at least 2 task items but found ${taskItems.size()}")
        assert(taskItems.get(1).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 1, s"Expected at least 2 status items but found ${statusItems.size()}")
        assert(statusItems.get(1).getText.contains(status))

      case "Further group details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 2, s"Expected at least 3 task items but found ${taskItems.size()}")
        assert(taskItems.get(2).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 2, s"Expected at least 3 status items but found ${statusItems.size()}")
        assert(statusItems.get(2).getText.contains(status))

      case "Add further group details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 2, s"Expected at least 3 task items but found ${taskItems.size()}")
        assert(taskItems.get(2).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 2, s"Expected at least 3 status items but found ${statusItems.size()}")
        assert(statusItems.get(2).getText.contains(status))

      case "Edit further group details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 2, s"Expected at least 3 task items but found ${taskItems.size()}")
        assert(taskItems.get(2).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 2, s"Expected at least 3 status items but found ${statusItems.size()}")
        assert(statusItems.get(2).getText.contains(status))

      case "Contact details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 3, s"Expected at least 4 task items but found ${taskItems.size()}")
        assert(taskItems.get(3).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 3, s"Expected at least 4 status items but found ${statusItems.size()}")
        assert(statusItems.get(3).getText.contains(status))

      case "Add contact details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 3, s"Expected at least 4 task items but found ${taskItems.size()}")
        assert(taskItems.get(3).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 3, s"Expected at least 4 status items but found ${statusItems.size()}")
        assert(statusItems.get(3).getText.contains(status))

      case "Edit contact details" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 3, s"Expected at least 4 task items but found ${taskItems.size()}")
        assert(taskItems.get(3).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 3, s"Expected at least 4 status items but found ${statusItems.size()}")
        assert(statusItems.get(3).getText.contains(status))

      case "Check your answers" =>
        import uk.gov.hmrc.test.ui.cucumber.utils.WaitUtils
        WaitUtils.waitForPageToFullyLoad()
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(TaskListPage.taskItem)
        val taskItems = driver.findElements(By.cssSelector(TaskListPage.taskItem))
        assert(taskItems.size() > 4, s"Expected at least 5 task items but found ${taskItems.size()}")
        assert(taskItems.get(4).getText.contains(taskName))
        val statusItems = driver.findElements(By.cssSelector(TaskListPage.status))
        assert(statusItems.size() > 4, s"Expected at least 5 status items but found ${statusItems.size()}")
        assert(statusItems.get(4).getText.contains(status))

    }
  }
  Then("""^I navigate back to TaskList Page from (.*) Page""") { (page: String) =>
    page match {
      case "Name" =>
        for (i <- 1 to 3) {
          clickByCss(BusinessActivityEQPage.backLink)
        }

      case "GRS" =>
        for (i <- 1 to 4) {
          clickByCss(BusinessActivityEQPage.backLink)
        }

      case "Telephone" =>
        for (i <- 1 to 8) {
          clickByCss(BusinessActivityEQPage.backLink)
        }

      case "Telephone Input" =>
        for (i <- 1 to 9) {
          clickByCss(BusinessActivityEQPage.backLink)
        }
    }
  }

  Then("""^I navigate to Telephone Question Page from Initial guidance Page""") { () =>
    for (i <- 1 to 6) {
      InitialGuidancePage.clickContinue()
    }
  }
}
