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
import uk.gov.hmrc.test.ui.helper.Wait
import uk.gov.hmrc.test.ui.pages.*

object TaskListStepsSteps {
  
  def andTheTaskStatusShouldBe(taskName: String, status: String): Unit = {
    taskName match {

      case "Edit Ultimate Parent Entity details" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(0).getText.contains(taskName))
        assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(0).getText.contains(status))

      case "Edit filing member details" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        assert(Driver.instance.findElements(By.cssSelector(TaskListPage.taskItem)).get(1).getText.contains(taskName))
        assert(Driver.instance.findElements(By.cssSelector(TaskListPage.status)).get(1).getText.contains(status))
    }
  }
}
