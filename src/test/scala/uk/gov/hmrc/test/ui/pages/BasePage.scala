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

  val baseUrl: String       = TestConfiguration.url("pillar2-frontend")
  val buttonId: By          = By.id("submit")
  val yesRadioId: By        = By.id("value_0")
  val noRadioId: By         = By.id("value_1")
  val countryDropdown: By   = By.id("country")
  val countryOption: By     = By.id("country__option--0")
  val backLinkText: By      = By.linkText("Back")
  val textInputField: By    = By.id("value")
  val continueClassName: By = By.className("govuk-button")
  val buttonContinue        = "Continue"
  val buttonSaveAndContinue = "Save and continue"

  val addressLine1Id: By = By.id("addressLine1")
  val addressLine2Id: By = By.id("addressLine2")
  val cityId: By         = By.id("addressLine3")
  val regionId: By       = By.id("addressLine4")
  val postcodeId: By     = By.id("postalCode")

  val defaultAddressLine1: String = "Test Street"
  val defaultAddressLine2: String = "Test Town"
  val defaultCity: String         = "Test City"
  val defaultRegion: String       = "Test Region"
  val defaultPostcode: String     = "AA1 1AA"
  val defaultCountry: String      = "United Kingdom"
  val updatedAddressLine1: String = "Test Street"
  val updatedAddressLine2: String = "Test Town"
  val updatedCity: String         = "Test City"
  val updatedRegion: String       = "Test Region"
  val updatedPostcode: String     = "AA1 1AA"

  def byText(text: String): By = By.xpath(s"//button[normalize-space()='$text']")

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

  def onPageClickButtonById(): Unit = {
    onPage()
    assertLocatorPresent(buttonId)
    click(buttonId)
  }

  def continue(locator: By = continueClassName): Unit = {
    assertLocatorPresent(locator)
    click(locator)
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

  def clickButton(
      button: By,
      buttonText: String = buttonSaveAndContinue,
      url: String = this.url
  ): Unit = {
    onPage(url)
    assertLocatorPresent(button)
    click(button)
    continue(byText(buttonText))
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

  case class DateField(prefix: String) {
    private val day   = By.id(s"$prefix.day")
    private val month = By.id(s"$prefix.month")
    private val year  = By.id(s"$prefix.year")

    def enter(dayVal: String, monthVal: String, yearVal: String): Unit = {
      sendKeys(day, dayVal)
      sendKeys(month, monthVal)
      sendKeys(year, yearVal)
    }
  }

  protected val startDate: DateField = DateField("startDate")
  protected val endDate: DateField   = DateField("endDate")

  protected val defaultStart: (String, String, String) = ("01", "01", "2024")
  protected val defaultEnd: (String, String, String)   = ("01", "01", "2025")

  def fillDates(
      start: (String, String, String) = defaultStart,
      end: (String, String, String) = defaultEnd
  ): Unit = {
    startDate.enter(start._1, start._2, start._3)
    endDate.enter(end._1, end._2, end._3)
  }

  def enterDates(
      start: (String, String, String) = defaultStart,
      end: (String, String, String) = defaultEnd
  ): Unit = {
    onPage()
    fillDates(start, end)
    continue()
  }

  def updateDates(
      start: (String, String, String) = defaultStart,
      end: (String, String, String) = defaultEnd
  ): Unit = {
    onPage(changeUrl)
    fillDates(start, end)
    continue()
  }

  protected def addressEntry(
      line1: String,
      line2: String,
      cityValue: String,
      regionValue: String,
      postcodeValue: String
  ): Unit = {
    sendKeys(addressLine1Id, line1)
    sendKeys(addressLine2Id, line2)
    sendKeys(cityId, cityValue)
    sendKeys(regionId, regionValue)
    sendKeys(postcodeId, postcodeValue)
  }

  def enterAddress(
      line1: String = defaultAddressLine1,
      line2: String = defaultAddressLine2,
      city: String = defaultCity,
      region: String = defaultRegion,
      postcode: String = defaultPostcode,
      country: String = defaultCountry
  ): Unit = {
    onPage()
    addressEntry(line1, line2, city, region, postcode)
    countryAutoSelect(country)
    continue()
  }

  def updateAddress(
      line1: String = updatedAddressLine1,
      line2: String = updatedAddressLine2,
      city: String = updatedCity,
      region: String = updatedRegion,
      postcode: String = updatedPostcode
  ): Unit = {
    onPage(changeUrl)
    addressEntry(line1, line2, city, region, postcode)
    continue()
  }
}
