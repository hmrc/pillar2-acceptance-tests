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

package uk.gov.hmrc.test.ui.specstepdef

import uk.gov.hmrc.test.ui.cucumber.Input._
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.specpages.eligibility.EligibilityActiveInUkPage
import uk.gov.hmrc.test.ui.specpages.rfm._
import uk.gov.hmrc.test.ui.specpages.upe.UPEEntityTypePage

object RFMStepsSteps {

  // ^I access RFM (.*) page$
  def givenIAccessRFMXPage(name: String): Unit = {
    name match {
      case "start"              => Nav.navigateTo(RFMStartPage.url)
      case "corporate position" => Nav.navigateTo(RFMCorpPositionPage.url)
    }
  }

  // ^I provide RFM (.*) as (.*)$
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
//        RFMStartPage.clickContinue()
  }

  // ^I click change link for RFM (.*)
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

  // ^I select corp position as (.*)$
  def andISelectCorpPositionAsX(option: String): Unit = {
    option match {
      case "UPE" => Input.clickById("value_0")
      case "NFM" => Input.clickById("value_1")
    }
//        RFMStartPage.clickContinue()
  }

  // ^I enter registration date as:$
  def andIEnterRegistrationDateAs(registrationDate: Map[String, String]): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.enterData(registrationDate)
    UPEEntityTypePage.clickContinue()
  }

}
