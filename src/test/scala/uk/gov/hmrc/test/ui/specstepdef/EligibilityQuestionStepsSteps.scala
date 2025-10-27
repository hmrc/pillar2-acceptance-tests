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

import io.cucumber.datatable.DataTable
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specstepdef.CommonFunctions._


object EligibilityQuestionStepsSteps {

  // ^I choose (.*) and continue$
  def andIChooseXAndContinue(option: String): Unit = {
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
  def thenIShouldNavigateToX(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
        assertNavigationToPage(pageMatch(page))
  }

  // ^I enter Address as:
  def thenIEnterAddressAs(address: DataTable): Unit = {
    Input.enterData(address)
        UPEAddressPage.clickCountrySelected()
        UPEEntityTypePage.clickContinue()
  }

  //todo: commented overload Test and delete if required.

  // Overload for ScalaTest (no DataTable, accepts varargs)
//  def thenIEnterAddressAs(links: (String, String)*): Unit = {
//    links.foreach { case (text, url) =>
//      val driverWait: WebDriverWait =
//        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
//      driverWait.until(
//        ExpectedConditions.elementToBeClickable(
//          Driver.instance.findElement(By.id(url))
//        )
//      )
//      verifyLinkById(url, text)
//    }
//  }

  // ^I should be on (.*)
  def thenIShouldBeOnX(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
        assertNavigationUrl(pageMatch(page))
  }

  // ^I continue|I continue without selecting an option$
//  def andIContinue|IContinueWithoutSelectingAnOption(): Unit = {
//    BusinessActivityEQPage.clickContinue()
//  }

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
  def thenIShouldBeRedirectToX(page: String): Unit = {
    assertNavigationUrl(pageMatch(page))
        Wait.waitForElementToPresentByCssSelector(RegistrationProcessingPage.loadingSpinner)
        Wait.waitForElementToClickTagName("h1")
        Wait.waitForCSSElementNotToPresent(RegistrationProcessingPage.loadingSpinner)

  }
}