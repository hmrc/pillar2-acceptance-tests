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

package uk.gov.hmrc.test.ui.cucumber

import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, WebDriver}
import uk.gov.hmrc.test.ui.pages.BasePage
import java.time.Duration

object RFMHelper extends BasePage {

  def waitForRFMPageLoad(): Unit = {
    Wait.waitForPageToLoadCompletely()
    NavigationHelper.ensureNotOnErrorPage()
  }

  def selectCorporatePositionSafely(option: String): Unit = {
    waitForRFMPageLoad()
    option match {
      case "UPE" =>
        Wait.waitForElementToPresentById("value_0")
        Input.clickById("value_0")
      case "NFM" =>
        Wait.waitForElementToPresentById("value_1")
        Input.clickById("value_1")
    }
    NavigationHelper.clickElementWithStaleRetry(".govuk-button")
  }

  def enterRegistrationDateSafely(day: String, month: String, year: String): Unit = {
    waitForRFMPageLoad()
    NavigationHelper.waitForCorrectPageLoad("replace-filing-member/security/registration-date")
    
    Wait.waitForElementToPresentById("rfmRegistrationDate.day")
    Input.sendKeysById("rfmRegistrationDate.day", day)
    
    Wait.waitForElementToPresentById("rfmRegistrationDate.month")
    Input.sendKeysById("rfmRegistrationDate.month", month)
    
    Wait.waitForElementToPresentById("rfmRegistrationDate.year")
    Input.sendKeysById("rfmRegistrationDate.year", year)
  }

  def enterPillar2IdSafely(pillar2Id: String): Unit = {
    waitForRFMPageLoad()
    NavigationHelper.waitForCorrectPageLoad("replace-filing-member/security/enter-pillar2-id")
    
    val maxAttempts = 3
    var attempt = 0
    
    while (attempt < maxAttempts) {
      try {
        attempt += 1
        Wait.waitForElementToPresentByCssSelector(".govuk-input")
        Input.sendKeysByCss(pillar2Id, ".govuk-input")
        return
      } catch {
        case _: org.openqa.selenium.TimeoutException if attempt < maxAttempts =>
          NavigationHelper.refreshPageAndWait()
        case _: org.openqa.selenium.StaleElementReferenceException if attempt < maxAttempts =>
          Wait.waitForTagNameToBeRefreshed("body")
      }
    }
  }

  def continueWithSafeClick(): Unit = {
    val maxAttempts = 3
    var attempt = 0
    
    while (attempt < maxAttempts) {
      try {
        attempt += 1
        Wait.waitForElementToPresentByCssSelector(".govuk-button")
        Input.clickByCss(".govuk-button")
        return
      } catch {
        case _: org.openqa.selenium.TimeoutException if attempt < maxAttempts =>
          NavigationHelper.refreshPageAndWait()
        case _: org.openqa.selenium.StaleElementReferenceException if attempt < maxAttempts =>
          Wait.waitForTagNameToBeRefreshed("body")
      }
    }
  }

  def waitForRFMNavigation(expectedUrlFragment: String): Unit = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30))
    driverWait.until((driver: WebDriver) => {
      val currentUrl = driver.getCurrentUrl
      !currentUrl.contains("/error/restart-error") && 
      !currentUrl.contains("/auth-login-stub") && 
      currentUrl.contains(expectedUrlFragment)
    })
    Wait.waitForPageToLoadCompletely()
  }
}