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

import java.util.concurrent.TimeUnit

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

  private def waitForElement(by: By): WebElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def secondsWait(secs: Int): Unit = Thread.sleep(secs.*(1000))

  def waitForElementToClicktagName(tagName: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3))
    driverWait.until(ExpectedConditions.elementToBeClickable(By.tagName(tagName)))
  }

  def waitForUrlToBeVisible(url: String): Boolean = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(8))
    driverWait.until(ExpectedConditions.urlToBe(url))
  }

  def waitForElementToPresentByCssSelector(cssSelector: String): WebElement = {
    val driverWait: WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10))
    driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)))
  }
}
