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

package uk.gov.hmrc.test.ui.cucumber.utils

import org.openqa.selenium.{By, JavascriptExecutor, Keys, StaleElementReferenceException, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedCondition, ExpectedConditions, WebDriverWait}
import uk.gov.hmrc.test.ui.pages.BasePage
import java.time.Duration
import scala.util.Try
import scala.collection.JavaConverters._

object WaitUtils extends BasePage {
  val url = ""
  
  private val DEFAULT_TIMEOUT = Duration.ofSeconds(30)
  private val POLLING_INTERVAL = Duration.ofMillis(500)
  private val SHORT_TIMEOUT = Duration.ofSeconds(5)
  
  def waitForPageToFullyLoad(): Unit = {
    waitForDocumentReady()
    waitForPageStability()
    waitForNoSpinners()
  }
  
  def waitForDocumentReady(): Boolean = {
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        driver.asInstanceOf[JavascriptExecutor]
          .executeScript("return document.readyState")
          .equals("complete")
      }
    })
  }
  
  def waitForAjaxToComplete(): Boolean = {
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        val jse = driver.asInstanceOf[JavascriptExecutor]
        Try {
          jse.executeScript("return jQuery.active == 0").asInstanceOf[Boolean]
        }.getOrElse(true)
      }
    })
  }
  
  def waitForAngularToComplete(): Boolean = {
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        val jse = driver.asInstanceOf[JavascriptExecutor]
        Try {
          jse.executeScript(
            "return window.getAllAngularTestabilities && " +
            "window.getAllAngularTestabilities().findIndex(x => !x.isStable()) === -1"
          ).asInstanceOf[Boolean]
        }.getOrElse(true)
      }
    })
  }
  
  def waitForReactToComplete(): Boolean = {
    true
  }
  
  def waitForPageStability(): Boolean = {
    val wait = new WebDriverWait(driver, SHORT_TIMEOUT)
    wait.pollingEvery(Duration.ofMillis(200))
    
    var lastState = ""
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        val jse = driver.asInstanceOf[JavascriptExecutor]
        // Check if page has stabilized by comparing DOM state
        val currentState = jse.executeScript(
          "return document.readyState + document.body.innerHTML.length"
        ).toString
        
        val isStable = currentState == lastState
        lastState = currentState
        isStable
      }
    })
  }
  
  def waitForNoSpinners(): Boolean = {
    val wait = new WebDriverWait(driver, SHORT_TIMEOUT)
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        // Check for common spinner/loader elements
        val spinners = driver.findElements(By.cssSelector(
          ".spinner, .loader, .loading, [aria-busy='true'], .govuk-loading"
        ))
        spinners.isEmpty || spinners.asScala.forall(!_.isDisplayed)
      }
    })
  }
  
  def waitForElementWithRetry(by: By, maxRetries: Int = 3): WebElement = {
    var retries = 0
    var lastException: Exception = null
    
    while (retries < maxRetries) {
      try {
        waitForPageToFullyLoad()
        val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
        wait.pollingEvery(POLLING_INTERVAL)
        val element = wait.until(ExpectedConditions.presenceOfElementLocated(by))
        wait.until(ExpectedConditions.visibilityOf(element))
        wait.until(ExpectedConditions.elementToBeClickable(element))
        return element
      } catch {
        case e: Exception =>
          lastException = e
          retries += 1
          // Use a proper wait instead of Thread.sleep
          val retryWait = new WebDriverWait(driver, Duration.ofSeconds(1))
          try {
            retryWait.until(ExpectedConditions.presenceOfElementLocated(by))
          } catch {
            case _: Exception => // Continue to retry
          }
      }
    }
    throw lastException
  }
  
  def clickWithRetry(element: WebElement, maxRetries: Int = 3): Unit = {
    var retries = 0
    var clicked = false
    
    while (!clicked && retries < maxRetries) {
      try {
        scrollToElement(element)
        waitForElementToBeStable(element)
        element.click()
        clicked = true
      } catch {
        case _: StaleElementReferenceException =>
          retries += 1
          waitForElementToBeStable(element)
        case e: Exception =>
          throw e
      }
    }
  }
  
  def waitForElementToBeStable(element: WebElement): Unit = {
    val wait = new WebDriverWait(driver, Duration.ofSeconds(2))
    wait.pollingEvery(Duration.ofMillis(100))
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        try {
          element.isDisplayed && element.isEnabled
        } catch {
          case _: StaleElementReferenceException => false
        }
      }
    })
  }
  
  
  def scrollToElement(element: WebElement): Unit = {
    driver.asInstanceOf[JavascriptExecutor]
      .executeScript("arguments[0].scrollIntoView(true);", element)
    waitForScrollToComplete()
  }
  
  def waitForScrollToComplete(): Unit = {
    val wait = new WebDriverWait(driver, Duration.ofSeconds(1))
    wait.pollingEvery(Duration.ofMillis(100))
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        val jse = driver.asInstanceOf[JavascriptExecutor]
        val scrollY = jse.executeScript("return window.scrollY").toString
        // Check if scroll position has stabilized
        val newScrollY = jse.executeScript("return window.scrollY").toString
        scrollY == newScrollY
      }
    })
  }
  
  def sendKeysWithRetry(element: WebElement, text: String, maxRetries: Int = 3): Unit = {
    var retries = 0
    var sent = false
    
    while (!sent && retries < maxRetries) {
      try {
        scrollToElement(element)
        waitForElementToBeStable(element)
        element.clear()
        waitForElementToBeStable(element)
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"))
        element.sendKeys(Keys.DELETE)
        // Try Mac selection as well in case CONTROL+A did not select
        element.sendKeys(Keys.chord(Keys.COMMAND, "a"))
        element.sendKeys(Keys.DELETE)
        waitForInputToClear(element)
        element.sendKeys(text)
        sent = true
      } catch {
        case _: StaleElementReferenceException =>
          retries += 1
          waitForElementToBeStable(element)
        case e: Exception =>
          if (retries < maxRetries - 1) {
            retries += 1
            waitForElementToBeStable(element)
          } else {
            throw e
          }
      }
    }
  }
  
  def waitForInputToClear(element: WebElement): Unit = {
    val wait = new WebDriverWait(driver, Duration.ofSeconds(5))
    wait.pollingEvery(Duration.ofMillis(100))
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        val v = element.getAttribute("value")
        v == null || v.trim.isEmpty
      }
    })
  }
  
  def waitForUrlToChange(originalUrl: String, timeout: Duration = DEFAULT_TIMEOUT): Boolean = {
    val wait = new WebDriverWait(driver, timeout)
    wait.until(new ExpectedCondition[Boolean] {
      override def apply(driver: WebDriver): Boolean = {
        !driver.getCurrentUrl.equals(originalUrl)
      }
    })
  }
  
  def waitForTextToBePresent(by: By, text: String): Boolean = {
    waitForPageToFullyLoad()
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text))
  }
  
  def waitForElementToDisappear(by: By): Boolean = {
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(ExpectedConditions.invisibilityOfElementLocated(by))
  }
  
  def waitForNumberOfElements(by: By, expectedNumber: Int): List[WebElement] = {
    waitForPageToFullyLoad()
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    wait.until(new ExpectedCondition[List[WebElement]] {
      override def apply(driver: WebDriver): List[WebElement] = {
        val elements = driver.findElements(by).asScala.toList
        if (elements.size >= expectedNumber) elements else null
      }
    })
  }
  
  def isElementPresent(by: By): Boolean = {
    Try {
      driver.findElement(by)
      true
    }.getOrElse(false)
  }
  
  def waitForAnyOfElements(selectors: List[String]): WebElement = {
    waitForPageToFullyLoad()
    val wait = new WebDriverWait(driver, DEFAULT_TIMEOUT)
    
    wait.until(new ExpectedCondition[WebElement] {
      override def apply(driver: WebDriver): WebElement = {
        for (selector <- selectors) {
          val elements = driver.findElements(By.cssSelector(selector))
          if (!elements.isEmpty) {
            return elements.get(0)
          }
        }
        null
      }
    })
  }
  
  def waitForPageTransition(action: => Unit): Unit = {
    val originalUrl = driver.getCurrentUrl
    action
    waitForUrlToChange(originalUrl)
    waitForPageToFullyLoad()
  }
  
  def waitForFormSubmission(submitAction: => Unit): Unit = {
    val originalUrl = driver.getCurrentUrl
    submitAction
    Try(waitForUrlToChange(originalUrl, Duration.ofSeconds(5))).getOrElse(false)
    waitForPageToFullyLoad()
    val errorSummary = driver.findElements(By.cssSelector(".govuk-error-summary"))
    if (errorSummary.isEmpty) {
      waitForPageStability()
    }
  }
  
  def stabilizeAndWait(): Unit = {
    waitForPageStability()
    waitForPageToFullyLoad()
  }
}
