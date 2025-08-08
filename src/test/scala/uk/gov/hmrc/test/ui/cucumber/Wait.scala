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

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import uk.gov.hmrc.test.ui.pages.BasePage

import java.time.Duration

object Wait extends BasePage {
  val url = ""

  def fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(20))
    .pollingEvery(Duration.ofMillis(250))
    .ignoring(classOf[org.openqa.selenium.NoSuchElementException])

  def waitForElement(id: String): WebElement = waitForElement(By.id(id))

  def waitForElements(h1: String): WebElement = waitForElement(By.tagName(h1))

  def waitForElementByXpathContainsText(xpath: String): WebElement=waitForElement(By.xpath(xpath))

  private def waitForElement(by: By): WebElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def waitForLinkTextToBePresent(linkText: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(25))
    driverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)))
  }

  def waitForLinkTextToBeClickable(linkText: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(25))
    driverWait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)))
  }

  def waitForPageToLoadCompletely(): Unit = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))
    driverWait.until((driver: WebDriver) => {
      val readyState = driver.asInstanceOf[org.openqa.selenium.JavascriptExecutor]
        .executeScript("return document.readyState").toString
      readyState == "complete"
    })
  }

  def waitForUrlToChange(currentUrl: String): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))
    driverWait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)))
  }

  def waitForElementToBeStale(element: WebElement): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10))
    driverWait.until(ExpectedConditions.stalenessOf(element))
  }

  def waitForElementToClickTagName(tagName: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10))
    driverWait.until(ExpectedConditions.elementToBeClickable(By.tagName(tagName)))
  }

  def waitForUrlToBeVisible(url: String): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(8))
    driverWait.until(ExpectedConditions.urlToBe(url))
  }

  def waitForUrl(url: String): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15))
    driverWait.until(ExpectedConditions.urlContains(url))
  }

  def waitForElementToPresentByCssSelector(cssSelector: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15))
    driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)))
  }

  def waitForElementToPresentById(id: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15))
    driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)))
  }

  def waitForTagNameToBeRefreshed(tagName: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15))
    driverWait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.tagName(tagName))))
  }

  def waitForCSSElementNotToPresent(css: String): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15))
    driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(css)))
  }
}
