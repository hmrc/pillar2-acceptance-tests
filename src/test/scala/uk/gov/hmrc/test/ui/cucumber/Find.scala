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

import org.junit.Assert
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.cucumber.Wait.fluentWait
import uk.gov.hmrc.test.ui.pages.BasePage

object Find extends BasePage {

  val url = ""

  private def find(by: By): WebElement = {
    fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))
    driver.findElement(by)
  }

  def elementIsNotDisplayed(id: String): Unit = {
    val checkId = driver.getPageSource
    Assert.assertFalse(checkId.contains(id))
  }

  def findById(id: String): WebElement = find(By.id(id))

  def findByName(name: String): WebElement = find(By.name(name))

  def findByCss(css: String): WebElement = find(By.cssSelector(css))

  def findByXpath(id: String): WebElement = find(By.xpath(id))

  def findByTagName(tagName: String): WebElement = find(By.tagName(tagName))

  def findByLinkText(text: String): WebElement = find(By.linkText(text))

  def findURL(): String = driver.getCurrentUrl

  def findH1(): WebElement = findByTagName("h1")

}
