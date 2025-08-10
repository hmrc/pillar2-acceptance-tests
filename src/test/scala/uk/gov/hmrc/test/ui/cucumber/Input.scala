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

import io.cucumber.datatable.DataTable
import org.openqa.selenium._
import org.openqa.selenium.io.FileHandler
import uk.gov.hmrc.test.ui.cucumber.Find._
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages.BasePage

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object Input extends BasePage {

  def clickById(id: String): Unit = findById(id).click()

  def clickByLinkText(text: String): Unit = findByLinkText(text).click()

  def clickByCss(css: String): Unit = {
    Wait.waitForElementToBeClickableByCssSelector(css)
    try {
      findByCss(css).click()
    } catch {
      case _: org.openqa.selenium.StaleElementReferenceException =>
        Wait.waitForElementToBeClickableByCssSelector(css)
        findByCss(css).click()
    }
  }

  val enterData: DataTable => Unit = iterator(sendKeysById) _

  def clickAndContinue(id: String): Unit = {
    findById(id).click()
    clickSubmit()
  }

  def iterator(f: (String, String) => Any)(data: DataTable): Unit = {
    val row = data.asMaps(classOf[String], classOf[String]).iterator()
    while (row.hasNext) {
      val map = row.next()
      f(map.get("KEY"), map.get("VALUE"))
    }
  }

  def clickSubmit(): Unit = findById("submit").click()

  def clickByXpath(id: String): Unit = findByXpath(id).click()

  def sendKeysById(id: String, value: String): Unit = {
    findById(id)
    findById(id).clear()
    findById(id).sendKeys(value)
  }

  def sendKeysByCss(value: String, css: String): Unit = {
    try {
      findByCss(css)
      findByCss(css).clear()
      findByCss(css).sendKeys(value)
    } catch {
      case _: org.openqa.selenium.StaleElementReferenceException =>
        Wait.waitForElementToPresentByCssSelector(css)
        findByCss(css).clear()
        findByCss(css).sendKeys(value)
    }
  }

  def sendKeysByName(value: String, name: String): Unit = {
    findByName(name)
    findByName(name).clear()
    findByName(name).sendKeys(value)
  }

  def switchToNewWindow(driver: WebDriver): Unit = {
    val handles = driver.getWindowHandles.toArray().toSeq

    if (handles.length > 1) {
      val newWindow = handles(1).toString
      driver.close()
      driver.switchTo().window(newWindow)
    } else {
      println("No new window to switch to.")
    }
  }

  def takeScreenshot(scenarioName: String, s: String, dr: TakesScreenshot): Unit = {
    val name = scenarioName + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
    if (!new java.io.File(s"./target/test-reports/$name$s.png").exists) {
      val scr = dr.getScreenshotAs(OutputType.FILE)
      FileHandler.copy(scr, new File(s"./target/test-reports/$name$s.png"))
      // val byteFile = dr.getScreenshotAs(OutputType.BYTES)
      // scenario.attach(byteFile, "image/png", "print_page")
    }
  }

  def getTextOf(by: By): String =
    driver.findElement(by).getText

  def getAttributeOf(locator: String, attributeName: String): String =
    driver.findElement(By.cssSelector(locator)).getAttribute(attributeName)

  def getAttributeOfId(locator: String, attributeName: String): String =
    driver.findElement(By.id(locator)).getAttribute(attributeName)

}
