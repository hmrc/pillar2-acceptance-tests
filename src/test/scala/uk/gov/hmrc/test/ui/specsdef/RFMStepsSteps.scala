/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specsdef

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.Check.assertNavigationUrl
import uk.gov.hmrc.test.ui.helper.Find.findURL
import uk.gov.hmrc.test.ui.helper.Input._
import uk.gov.hmrc.test.ui.helper._
import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.specsdef.CommonFunctions._

import scala.util.Try

object RFMStepsSteps {

  def givenXLogsInWithRfmURLToPillar2(name: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginOldPage.loginWithUserToRFM(name)
      case "Individual User"   => AuthLoginOldPage.loginAsIndToRFM(name)
      case "Agent User"        => AuthLoginOldPage.loginAsAgentToRFM(name)
      case "Assistant User"    => AuthLoginOldPage.loginAssistantToRFM(name)

    }
  }

  def givenIAccessRFMXPage(name: String): Unit = {
    name match {
      case "start"              => Nav.navigateTo(RFMStartPage.url)
      case "corporate position" => Nav.navigateTo(RFMCorpPositionPage.url)
      case "New NFM guidance"   => Nav.navigateTo(NewNFMGuidancePage.url)
      case "Contact Guidance"   => Nav.navigateTo(RFMContactGuidancePage.url)
      case "CYA NFM"            => Nav.navigateTo(RFMNewNFMContactNamePage.url)
      case "Saving Progress"    => Nav.navigateTo(RFMSavingProgressPage.url)
      case "contact email"      => Nav.navigateTo(RFMContactEmailPage.url)

    }
  }

  def andIProvideRFMXAsX(field: String, name: String): Unit = {
    field match {
      case "pillar2 id" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.pillar2TopUpTaxId)
        Input.sendKeysByCss(name, RFMEnterPillar2IdPage.pillar2TopUpTaxId)

      case "contact name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.nameField)
        Input.sendKeysByCss(name, RFMContactDetailNamePage.nameField)

      case "contact email" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactEmailPage.emailField)
        Input.sendKeysByCss(name, RFMContactEmailPage.emailField)

      case "contact number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactInputPage.phoneField)
        Input.sendKeysByCss(name, RFMContactInputPage.phoneField)

      case "New NFM Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.nameField)
        Input.sendKeysByCss(name, RFMNewNFMContactNamePage.nameField)

      case "second contact number" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMSecondContactPhonePage.phoneField)
        Input.sendKeysByCss(name, RFMSecondContactPhonePage.phoneField)

    }
    RFMStartPage.clickContinue()
  }

  def andRegistrationXIsEnteredAsX(field: String, name: String): Unit = {
    field match {
      case "Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regDay)
        Input.sendKeysById(RFMRegistrationDatePage.regDay, name)

      case "Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regMonth)
        Input.sendKeysById(RFMRegistrationDatePage.regMonth, name)

      case "Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regYear)
        Input.sendKeysById(RFMRegistrationDatePage.regYear, name)
    }
  }

  def whenOrganisationUserLogsInWithExistingEntityGroupAndWithRfmURL(
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String): Unit = {
    AuthLoginOldPage.loginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
    AuthLoginOldPage.loginWithExistingEntityWithRFM(enrolmentKey, identifierName, identifierValue)
  }

  def andIClickChangeLinkForRFMX(link: String): Unit = {
    link match {
      case "Pillar 2 Top-up Taxes ID" =>
        clickByCss(RFMCYAPage.changePID)
      case "Registration date" =>
        clickByCss(RFMCYAPage.changeRegistrationDate)
      case "New NFM Name" =>
        clickByCss(RFMNoIDCYAPage.changeName)
      case "Corporate Position" =>
        clickByCss(RFMFinalReviewCYAPage.changeCorporatePosition)
      case "Company" =>
        clickByCss(RFMFinalReviewCYAPage.changeCompany)
      case "Input Name" =>
        clickByCss(RFMFinalReviewCYAPage.changeInputName)
      case "Input Address" =>
        clickByCss(RFMFinalReviewCYAPage.changeInputAddress)
      case "New RFM CYA Change Contact preference" =>
        clickByCss(RFMFinalReviewCYAPage.changePhoneContact)
      case "Change Second Contact Preference" =>
        clickByCss(RFMFinalReviewCYAPage.changeSecondContactPreference)
      case "Change Address" =>
        clickByCss(RFMFinalReviewCYAPage.changeAddress)
    }
  }

  def andISelectCorpPositionAsX(option: String): Unit = {
    option match {
      case "UPE" => Input.clickById("value_0")
      case "NFM" => Input.clickById("value_1")
    }
    RFMStartPage.clickContinue()
  }

  def andIShouldSeeTheRowValueX(row: Int, value: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(Driver.instance.findElements(By.cssSelector(RFMFinalReviewCYAPage.valueList)).get(row - 1).getText.contains(value))
  }

  def givenXLogsInToRFMWithCredIdXForPillar2(name: String, credId: String): Unit = {
    name match {
      case "Organisation User" => AuthLoginOldPage.loginWithUserToRFMWithCredId(name, credId)
      case _                   => AuthLoginOldPage.loginWithUserToRFMWithCredId(name, credId)
    }
  }

  def thenINavigateBackToRFMCYAPageFromGRSPage(): Unit = {
    for (i <- 1 to 5) {
      clickByCss(BusinessActivityEQPage.backLink)
    }
  }

  def andIContinueToRFMContactNamePage(): Unit = {
    for (i <- 0 to 2) {
      InitialGuidancePage.clickContinue()
    }
  }

  def andIEnterRegistrationDateAs(registrationDate: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(registrationDate)
    UPEEntityTypePage.clickContinue()
  }

  def thenIShouldBeRedirectedTo(page1: String, page2: String): Unit = {
    Wait.waitForElementToClickTagName("h1")

    val pageOption1 = pageMatch(page1)
    val pageOption2 = pageMatch(page2)

    val navigated = Try { assertNavigationUrl(pageOption1) }.getOrElse(false) || Try { assertNavigationUrl(pageOption2) }.getOrElse(false)

    assert(
      navigated,
      s"Navigation failed. Expected URL to match either '${pageOption1.url}' or '${pageOption2.url}', but current URL was '${findURL()}'"
    )
  }
}
