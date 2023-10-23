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

import org.openqa.selenium.{By, WebDriver}
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.cucumber.Find._

object Input extends BasePage {

  def clickById(id: String): Unit = findById(id).click()

  def clickByLinkText(text: String): Unit = findByLinkText(text).click()

  def clickByCss(css: String): Unit = findByCss(css).click()

  def clickAndContinue(id: String): Unit = {
    findById(id).click()
    clickSubmit()
  }

  def clickSubmit(): Unit = findById("submit").click()

 /* def clickContinue() = findByXpath("/html/body/div/main/div/div/div/div/a/button").click()*/

  def clickByXpath(id: String): Unit = findByXpath(id).click()

  def sendKeysById(value: String, id: String): Unit = {
    findById(id)
    findById(id).clear()
    findById(id).sendKeys(value)
  }

  def sendKeysByCss(value: String, css: String): Unit = {
    findByCss(css)
    findByCss(css).clear()
    findByCss(css).sendKeys(value)
  }

  def sendKeysByName(value: String, name: String): Unit = {
    findByName(name)
    findByName(name).clear()
    findByName(name).sendKeys(value)
  }

  def switchToNewWindow: WebDriver = {
    val handles    = driver.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    val newWindow  = handles(1).toString
    driver.close()
    driver.switchTo().window(newWindow)
  }

  def getTextOf(by: By) =
    driver.findElement(by).getText

  def getAttribueOf(locator: String,attributeName: String) =
    driver.findElement(By.cssSelector(locator)).getAttribute(attributeName)

  def getAttributeOf(locator: String, attributeName: String) =
    driver.findElement(By.id(locator)).getAttribute(attributeName)

}
