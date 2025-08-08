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

object NavigationHelper extends BasePage {

  def clickLinkTextWithRetry(linkText: String, maxAttempts: Int = 3): Unit = {
    ensureNotOnErrorPage()
    
    var attempt = 0
    var success = false
    
    while (attempt < maxAttempts && !success) {
      try {
        attempt += 1
        Wait.waitForPageToLoadCompletely()
        ensureNotOnErrorPage()
        
        Wait.waitForLinkTextToBePresent(linkText)
        Wait.waitForLinkTextToBeClickable(linkText)
        Input.clickByLinkText(linkText)
        success = true
      } catch {
        case _: org.openqa.selenium.TimeoutException if attempt < maxAttempts =>
          ensureNotOnErrorPage()
          refreshPageAndWait()
        case _: org.openqa.selenium.StaleElementReferenceException if attempt < maxAttempts =>
          Wait.waitForTagNameToBeRefreshed("body")
        case _: org.openqa.selenium.NoSuchElementException if attempt < maxAttempts =>
          ensureNotOnErrorPage()
          refreshPageAndWait()
      }
    }
    
    if (!success) {
      ensureNotOnErrorPage()
      if (!linkElementExists(linkText)) {
        waitForTaskListToLoad()
      }
      Wait.waitForLinkTextToBeClickable(linkText)
      Input.clickByLinkText(linkText)
    }
  }

  def checkForErrorPageAndNavigate(): Unit = {
    val currentUrl = driver.getCurrentUrl
    if (currentUrl.contains("/error/restart-error")) {
      driver.navigate().back()
      Wait.waitForPageToLoadCompletely()
    }
  }

  def refreshPageAndWait(): Unit = {
    driver.navigate().refresh()
    Wait.waitForPageToLoadCompletely()
  }

  def waitForCorrectPageLoad(expectedUrlFragment: String): Unit = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30))
    driverWait.until((driver: WebDriver) => {
      val currentUrl = driver.getCurrentUrl
      !currentUrl.contains("/error/restart-error") && currentUrl.contains(expectedUrlFragment)
    })
  }

  def ensureNotOnErrorPage(): Unit = {
    val currentUrl = driver.getCurrentUrl
    if (currentUrl.contains("/error/restart-error") || currentUrl.contains("/error/")) {
      var attempts = 0
      val maxAttempts = 3
      
      while (attempts < maxAttempts && driver.getCurrentUrl.contains("/error/")) {
        attempts += 1
        driver.navigate().back()
        Wait.waitForPageToLoadCompletely()
        
        if (attempts == maxAttempts && driver.getCurrentUrl.contains("/error/")) {
          driver.get("http://localhost:10050/report-pillar2-top-up-taxes/task-list")
          Wait.waitForPageToLoadCompletely()
        }
      }
    }
  }

  def clickElementWithStaleRetry(cssSelector: String): Unit = {
    ensureNotOnErrorPage()
    
    var attempt = 0
    val maxAttempts = 3
    var success = false
    
    while (attempt < maxAttempts && !success) {
      try {
        attempt += 1
        Wait.waitForPageToLoadCompletely()
        ensureNotOnErrorPage()
        
        Wait.waitForElementToPresentByCssSelector(cssSelector)
        Input.clickByCss(cssSelector)
        success = true
      } catch {
        case _: org.openqa.selenium.StaleElementReferenceException if attempt < maxAttempts =>
          Wait.waitForTagNameToBeRefreshed("body")
        case _: org.openqa.selenium.TimeoutException if attempt < maxAttempts =>
          ensureNotOnErrorPage()
          refreshPageAndWait()
        case _: org.openqa.selenium.NoSuchElementException if attempt < maxAttempts =>
          ensureNotOnErrorPage()
          refreshPageAndWait()
      }
    }
    
    if (!success) {
      ensureNotOnErrorPage()
      Wait.waitForElementToPresentByCssSelector(cssSelector)
      Input.clickByCss(cssSelector)
    }
  }

  def waitForNavigationToComplete(expectedUrl: String): Unit = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(25))
    driverWait.until(ExpectedConditions.urlContains(expectedUrl))
    Wait.waitForPageToLoadCompletely()
  }

  def linkElementExists(linkText: String): Boolean = {
    try {
      driver.findElement(By.linkText(linkText))
      true
    } catch {
      case _: org.openqa.selenium.NoSuchElementException => false
    }
  }

  def waitForTaskListToLoad(): Unit = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30))
    driverWait.until((driver: WebDriver) => {
      val currentUrl = driver.getCurrentUrl
      currentUrl.contains("/task-list") && !currentUrl.contains("/error/")
    })
    Wait.waitForPageToLoadCompletely()
  }
}