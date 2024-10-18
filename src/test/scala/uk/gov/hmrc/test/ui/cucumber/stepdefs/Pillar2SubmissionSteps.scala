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
import uk.gov.hmrc.test.ui.cucumber.Check.assertNavigationToPage
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pillar2SubmissionPages._

class Pillar2SubmissionSteps extends Pillar2SubmissionPage {

  Given("""^(.*) logs in to subscribe for Pillar2 Submission$""") {
    name: String =>
      name match {
        case "Organisation User" =>
          Pillar2SubmissionLoginPage.loginToP2SubmissionWithUser(name)
        case "Organisation Assistant User" =>
          Pillar2SubmissionLoginPage.loginToP2SubmissionWithAssistantUser(name)
        case "Agent User" =>
          Pillar2SubmissionLoginPage.loginToP2SubmissionWithAgentUser(name)
        case "Individual User" =>
          Pillar2SubmissionLoginPage.loginToP2SubmissionWithIndividualUser(name)
        case _ => Pillar2SubmissionLoginPage.loginToSubscribe(name)
      }
  }

  When(
    """^(.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 submission service$"""
  ) {
    (
        userType: String,
        enrolmentkey: String,
        identifiername: String,
        identifiervalue: String
    ) =>
      userType match {
        case "Agent" =>
          Pillar2SubmissionLoginPage.p2SubAgentLoginWithExistingEntity(
            enrolmentkey,
            identifiername,
            identifiervalue
          )

      }
  }
  When(
    """^I add delegated enrolment with (.*), (.*), (.*) and (.*) for Pillar2 submission service$"""
  ) {
    (
        enrolmentkey: String,
        identifiername: String,
        identifiervalue: String,
        authRule: String
    ) =>
      Pillar2SubmissionLoginPage.p2SubAddDelegatedEnrolment(
        enrolmentkey,
        identifiername,
        identifiervalue,
        authRule
      )
  }

  Then("""^I should be navigated to (.*) of Pillar2 Submission""") {
    (page: String) =>
      Wait.waitForElementToClicktagName("h1")
      assertNavigationToPage(p2SubPageMatch(page))
  }

  Given("""^(.*) logs in to register for Pillar2 Submission Agent service$""") {
    name: String =>
      name match {
        case "Organisation User" =>
          Pillar2SubmissionLoginPage.loginAsOrgToASA(name)
        case "Individual User" =>
          Pillar2SubmissionLoginPage.loginAsIndToASA(name)
        case "Assistant User" =>
          Pillar2SubmissionLoginPage.loginAsAssistantToASA(name)

      }
  }

  And("""^I should see an error message (.*) on the Agent (.*) Page$""") {
    (error: String, page: String) =>
      page match {
        case "enter pillar2 id" =>
          Wait.waitForTagNameToBeRefreshed("h1")
          Wait.waitForElementToPresentByCssSelector(
            ASAPillar2InputPage.errorMessage
          )

          Wait.waitForElementToPresentByCssSelector(
            ASAPillar2InputPage.errorLink
          )
          getTextOf(By cssSelector (ASAPillar2InputPage.errorLink)) should be(
            error
          )

          Wait.waitForElementToPresentByCssSelector(
            ASAPillar2InputPage.errorMessage
          )
          getTextOf(
            By cssSelector (ASAPillar2InputPage.errorMessage)
          ) should include(error)
      }
  }

  Given("""^I access submission BTN (.*) page$""") { (name: String) =>
    name match {
      case "start" => Nav.navigateTo(P2SubBtnStartPage.url)
      case "UKTR"  => Nav.navigateTo(P2UkTaxReturnPage.url)
    }
  }

  And("""^I select option (.*) and continue on Pillar2 submission$""") {
    (option: String) =>
      option match {
        case "Yes" => Input.clickByCss("#value")
        case "No"  => Input.clickByCss("#value-no")
      }
      P2SubBtnStartPage.clickContinue()
  }

  And("""^I should see account period summary$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(
      P2BTNReturnSubmissionKBPage.summaryList
    )
    assert(
      driver
        .findElement(By.cssSelector(P2BTNReturnSubmissionKBPage.summaryList))
        .isDisplayed
    )
  }

  And("""^I navigate back to BTN Return Submission KB Page$""") { () =>
    Nav.browserBack()
    for (i <- 1 to 3) {
      clickByCss(P2SubBtnAgdKBPage.backLink)
    }
  }

}
