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

import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specstepdef.CommonFunctions._

object EligibilityQuestionStepsSteps {

  // ^I choose (.*) and continue$
  def andIChooseAndContinue(option: String): Unit = {
    option match {
      case "Yes"                 => Input.clickById("value_0")
      case "No"                  => Input.clickById("value_1")
      case "Eligibility Yes NFM" => Input.clickById("registeringNfmGroup_0")
      case "Eligibility No NFM"  => Input.clickById("registeringNfmGroup_1")
    }
    BusinessActivityEQPage.clickContinue()
  }

  // ^I select back link$
  def andISelectBackLink(): Unit = {
    Wait.waitForElementToClickTagName("h1")
    clickByCss(BusinessActivityEQPage.backLink)
  }

  // ^I should navigate to (.*)
  def thenIShouldNavigateTo(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
    assertNavigationToPage(pageMatch(page))
  }

  // ^I enter Address as:
  def thenIEnterAddressAs(address: Map[String, String]): Unit = {
    Input.enterData(address)
    UPEAddressPage.clickCountrySelected()
    UPEEntityTypePage.clickContinue()
  }

  // ^I should be on (.*)
  def thenIShouldBeOn(page: String): Unit = {
    // Wait.waitForElementToClickTagName("h1")
    assertNavigationUrl(pageMatch(page))
  }

  // ^I continue|I continue without selecting an option$
  def continueAction(action: String): Unit = {
    action match {
      case "I continue" | "I continue without selecting an option" =>
        BusinessActivityEQPage.clickContinue()
      case _ =>
        throw new IllegalArgumentException(s"Unknown continue action: $action")
    }
  }

  // ^I should be redirect to (.*)
  def thenIShouldBeRedirectTo(page: String): Unit = {
    assertNavigationUrl(pageMatch(page))
    Wait.waitForElementToPresentByCssSelector(RegistrationProcessingPage.loadingSpinner)
    Wait.waitForElementToClickTagName("h1")
    Wait.waitForCSSElementNotToPresent(RegistrationProcessingPage.loadingSpinner)

  }
}