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

package uk.gov.hmrc.test.ui.cucumber.stepdefs
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pillar2SubmissionPages._

class Pillar2SubmissionSteps extends BaseStepDef with BrowserDriver  {

  When("""^(.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 submission service$""") {
    (userType: String, enrolmentKey: String, identifierName: String, identifierValue: String) =>
      userType match {
        case "Agent" => Pillar2SubmissionLoginPage.p2SubAgentLoginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
      }
  }

  When("""^I add delegated enrolment with (.*), (.*), (.*) and (.*) for Pillar2 submission service$""") {
    (enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String) =>
      Pillar2SubmissionLoginPage.p2SubAddDelegatedEnrolment(enrolmentKey, identifierName, identifierValue, authRule)
  }

  Given("""^(.*) logs in to register for Pillar2 Submission Agent service$""") { name: String =>
    name match {
      case "Organisation User" => Pillar2SubmissionLoginPage.loginAsOrgToASA(name)
      case "Individual User"   => Pillar2SubmissionLoginPage.loginAsIndToASA(name)
      case "Assistant User"    => Pillar2SubmissionLoginPage.loginAsAssistantToASA(name)
    }
  }

  Given("""^I access submission BTN (.*) page$""") { (name: String) =>
    name match {
      case "start" => Nav.navigateTo(P2SubBtnStartPage.url)
      case "UKTR"  => Nav.navigateTo(P2UkTaxReturnPage.url)
    }
  }

  And("""^I go to (.*) page$""") { (page: String) =>
    page match {
      case "due overdue"        => Nav.navigateTo(P2DueOverduePage.url)
      case "submission history" => Nav.navigateTo(P2SubmissionHistoryPage.url)
    }
  }

  And("""I should see {int} accounting periods on Due Overdue Page""") { (accountingPeriods: Int) =>
    Wait.waitForElementToPresentByCssSelector(P2DueOverduePage.accountDetails)
    assert(driver.findElements(By.cssSelector(P2DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
  }

  And("""I should see {int} accounting periods on Sub History Page""") { (accountingPeriods: Int) =>
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
    assert(driver.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }

  And("""I should see {int} section with status {string}""") { (count: Int, dueType: String) =>
    dueType match {
      case "Due" => assert(driver.findElements(By.cssSelector(P2DueOverduePage.dueSection)).size() == count)
      case "Overdue" => assert(driver.findElements(By.cssSelector(P2DueOverduePage.overDueSection)).size() == count)
    }
  }

  And("""^I select option (.*) and continue on Pillar2 submission$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickByCss("#value_0")
      case "No"  => Input.clickByCss("#value_1")
    }
    P2SubBtnStartPage.clickContinue()
  }

  And("""^I navigate back to BTN Return Submission KB Page$""") { () =>
    Nav.browserBack()
    clickByCss(P2SubBtnAgdKBPage.backLink)
  }
}
