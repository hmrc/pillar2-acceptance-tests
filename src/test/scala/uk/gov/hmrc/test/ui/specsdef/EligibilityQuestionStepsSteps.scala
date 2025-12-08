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

import uk.gov.hmrc.test.ui.helper.Check.{assertNavigationToPage, assertNavigationUrl}
import uk.gov.hmrc.test.ui.helper.Input.clickByCss
import uk.gov.hmrc.test.ui.helper.{Input, Wait}
import uk.gov.hmrc.test.ui.pages.*
import uk.gov.hmrc.test.ui.specsdef.CommonFunctions.*

object EligibilityQuestionStepsSteps {

  def andIChooseAndContinue(option: String): Unit = {
    option match {
      case "Yes"                 => Input.clickById("value_0")
      case "No"                  => Input.clickById("value_1")
      case "Eligibility Yes NFM" => Input.clickById("registeringNfmGroup_0")
      case "Eligibility No NFM"  => Input.clickById("registeringNfmGroup_1")
    }
    BusinessActivityEQPage.clickContinue()
  }

  def andISelectBackLink(): Unit = {
    Wait.waitForElementToClickTagName("h1")
    clickByCss(BusinessActivityEQPage.backLink)
  }

  def thenIShouldNavigateTo(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
    assertNavigationToPage(pageMatch(page))
  }

  def thenIEnterAddressAs(address: Map[String, String]): Unit = {
    Input.enterData(address)
    UPEAddressPage.clickCountrySelected()
    UPEEntityTypePage.clickContinue()
  }

  def thenIShouldBeOn(page: String): Unit = {
    assertNavigationUrl(pageMatch(page))
  }

  def continueAction(action: String): Unit = {
    action match {
      case "I continue" | "I continue without selecting an option" =>
        BusinessActivityEQPage.clickContinue()
      case _ =>
        throw new IllegalArgumentException(s"Unknown continue action: $action")
    }
  }

  def thenIShouldBeRedirectTo(page: String): Unit = {
    assertNavigationUrl(pageMatch(page))
    Wait.waitForElementToPresentByCssSelector(RegistrationProcessingPage.loadingSpinner)
    Wait.waitForElementToClickTagName("h1")
    Wait.waitForCSSElementNotToPresent(RegistrationProcessingPage.loadingSpinner)

  }
}
