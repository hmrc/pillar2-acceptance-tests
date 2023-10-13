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

import org.openqa.selenium.{By,WebElement}
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, DashboardPage}


class PaymentSteps extends CommonFunctions {


  And("""^I should see the heading (\d+) on Dashboard page as (.*)""") { (headingNumber: Int, heading: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.sectionHeading)).get(headingNumber - 1).getText.contains(heading))
  }

  Given("""^(.*) logs in Dashboard page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToDashboard(name)
    }
  }

  And("""^I should see User details in dashboard page$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(DashboardPage.userDetails)
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).size() == 3)

  }

  Then("""^I should be navigated to Draft guidance page in new tab""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    driver.switchTo().window(newWindow)
  }

  Then("""^I should navigate back to dashboard page""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    driver.switchTo().window(mainWindow)
  }

  Then("""^I close Draft guidance page tab""") { () =>
    driver.close()
  }

  And("""^I should see user details (\d+) as (.*)""") { (detailNumber: Int, detailName: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).get(detailNumber - 1).getText.contains(detailName))
  }
}



