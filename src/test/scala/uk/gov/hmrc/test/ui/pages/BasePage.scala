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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Wait}
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.selenium.component.PageObject
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TestConfiguration

import java.time.Duration
import scala.jdk.CollectionConverters.*

trait BasePage extends Matchers with PageObject {

  val url: String
  val changeUrl: String       = url
  val textValue: String       = ""
  val textUpdateValue: String = ""

  val baseUrl: String          = TestConfiguration.url("pillar2-frontend")
  val submitButtonId: By       = By.id("submit")
  val continueButtonId: By     = By.id("continue")
  val yesRadioId: By           = By.id("value_0")
  val noRadioId: By            = By.id("value_1")
  val countryDropdown: By      = By.id("country")
  val countryOption: By        = By.id("country__option--0")
  val backLinkText: By         = By.linkText("Back")
  val textInputField: By       = By.id("value")
  val buttonContinue           = "Continue"
  val buttonSaveAndContinue    = "Save and continue"
  val buttonConfirmAndContinue = "Confirm and continue"

  val continueClassName: By = By.className("govuk-button")
  val nameField             = "#value"

  private def fluentWait(timeoutSeconds: Long = 3): Wait[WebDriver] = new FluentWait[WebDriver](Driver.instance)
    .withTimeout(Duration.ofSeconds(timeoutSeconds))
    .pollingEvery(Duration.ofMillis(200))

  def onPage(url: String = this.url, timeoutSeconds: Long = 3): Unit =
    fluentWait(timeoutSeconds).until(ExpectedConditions.urlToBe(url))

  def onPageContains(partialUrl: String, timeoutSeconds: Long = 3): Unit =
    fluentWait(timeoutSeconds).until(ExpectedConditions.urlContains(partialUrl))

  def countryAutoSelect(countryName: String): Unit = {
    assertLocatorPresent(countryDropdown)
    click(countryDropdown)
    sendKeys(countryDropdown, countryName)
    click(countryOption)
  }

  def onPageSubmitById(): Unit = {
    onPage()
    assertLocatorPresent(submitButtonId)
    click(submitButtonId)
  }

  def continue(): Unit = {
    assertLocatorPresent(continueClassName)
    click(continueClassName)
  }

  def continueToNextPage(): Unit = {
    onPage()
    assertLocatorPresent(continueClassName)
    click(continueClassName)
  }

  def enterText(textValue: String = textValue): Unit = {
    onPage()
    assertLocatorPresent(textInputField)
    sendKeys(textInputField, textValue)
    continue()
  }

  def updateText(): Unit = {
    require(changeUrl.nonEmpty, s"changeUrl must be set for ${this.getClass.getSimpleName}")
    require(textUpdateValue.nonEmpty, s"textUpdateValue must be set for ${this.getClass.getSimpleName}")

    onPage(changeUrl)
    assertLocatorPresent(textInputField)
    sendKeys(textInputField, textUpdateValue)
    continue()
  }

  def selectYes(url: String = this.url): Unit = {
    onPage(url)
    assertLocatorPresent(yesRadioId)
    click(yesRadioId)
    continue()
  }

  def selectNo(url: String = this.url): Unit = {
    onPage(url)
    assertLocatorPresent(noRadioId)
    click(noRadioId)
    continue()
  }

  def selectRadio(radioButton: By, url: String = this.url): Unit = {
    onPage(url)
    assertLocatorPresent(radioButton)
    click(radioButton)
    continue()
  }

  def clickLink(link: By): Unit = {
    onPage()
    assertLocatorPresent(link)
    click(link)
  }

  def clickBackLink(url: String = this.url): Unit = {
    onPage(url)
    click(backLinkText)
  }

  def browserBack(): Unit = {
    onPage()
    Driver.instance.navigate().back()
  }

  def clickOnByPartialLinkText(partialLinkText: By): Unit = {
    onPage()
    click(partialLinkText)
  }

  def clickButtonByText(buttonText: String): Unit = {
    val button = By.xpath(s"//button[normalize-space()='$buttonText']")
    assertLocatorPresent(button)
    click(button)
  }

  def refreshPage(): Unit =
    Driver.instance.navigate().refresh()

  def waitRefreshThenCheckOnPage(
      initialWaitSeconds: Long = 2,
      postRefreshWaitSeconds: Long = 3
  ): Unit = {
    fluentWait(initialWaitSeconds)
    refreshPage()
    onPage(timeoutSeconds = postRefreshWaitSeconds)
  }

  def navigateTo(url: String): Unit = {
    Driver.instance.navigate.to(url)
  }

  protected def assertLocatorPresent(locator: By): Unit = {
    val elements = Driver.instance.findElements(locator).asScala
    require(
      elements.nonEmpty,
      s"Expected element with locator [$locator] to be present, but none was found"
    )
  }
}