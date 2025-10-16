package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonFunctions
import java.time.Duration

object EligibilityQuestionSteps extends CommonFunctions {

  // ^I choose (.*) and continue$
  def andIChooseXAndContinue(option: String): Unit = {
    option match {
          case "Yes"                 => Input.clickById("value_0")
          case "No"                  => Input.clickById("value_1")
          case "Eligibility Yes NFM" => Input.clickById("registeringNfmGroup_0")
          case "Eligibility No NFM"  => Input.clickById("registeringNfmGroup_1")
        }
        BusinessActivityEQPage.clickContinue()
  }

  // ^I select back link$
  def andISelectBackLink(): Unit = {
    Wait.waitForElementToClickTagName("h1")
        clickByCss(BusinessActivityEQPage.backLink)
  }

  // ^I should navigate to (.*)
  def thenIShouldNavigateToX(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
        assertNavigationToPage(pageMatch(page))
  }

  // ^I enter Address as:
  def thenIEnterAddressAs(address: DataTable): Unit = {
    Input.enterData(address)
        UPEAddressPage.clickCountrySelected()
        UPEEntityTypePage.clickContinue()
  }

  // Overload for ScalaTest (no DataTable, accepts varargs)
//  def thenIEnterAddressAs(links: (String, String)*): Unit = {
//    links.foreach { case (text, url) =>
//      val driverWait: WebDriverWait =
//        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
//      driverWait.until(
//        ExpectedConditions.elementToBeClickable(
//          Driver.instance.findElement(By.id(url))
//        )
//      )
//      verifyLinkById(url, text)
//    }
//  }

  // ^I should be on (.*)
  def thenIShouldBeOnX(page: String): Unit = {
    Wait.waitForElementToClickTagName("h1")
        assertNavigationUrl(pageMatch(page))
  }

  // ^I continue|I continue without selecting an option$
  def andIContinueIContinueWithoutSelectingAnOption(): Unit = {
    BusinessActivityEQPage.clickContinue()
  }

  // ^I should be redirect to (.*)
  def thenIShouldBeRedirectToX(page: String): Unit = {
    assertNavigationUrl(pageMatch(page))
        Wait.waitForElementToPresentByCssSelector(RegistrationProcessingPage.loadingSpinner)
        Wait.waitForElementToClickTagName("h1")
        Wait.waitForCSSElementNotToPresent(RegistrationProcessingPage.loadingSpinner)
  }

}
