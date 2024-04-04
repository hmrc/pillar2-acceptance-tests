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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getTextOf}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._

class RFMPagesStepDef extends BaseStepDef with BrowserDriver {

  Given("""^(.*) logs in with rfm URL to Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUserToRFM(name)
      case "Individual User" => AuthLoginPage.loginAsIndToRFM(name)
      case "Agent User" => AuthLoginPage.loginAsAgentToRFM(name)
      case "Assistant User" => AuthLoginPage.loginAssistantToRFM(name)

    }
  }

  Given("""^I access RFM (.*) page$""") { (name:String) =>
    name match {
      case "start" => Nav.navigateTo(RFMStartPage.url)
      case "corporate position"  => Nav.navigateTo(RFMCorpPositionPage.url)
      case "New NFM guidance"    => Nav.navigateTo(NewNFMGuidancePage.url)
      case "Contact Guidance"    => Nav.navigateTo(RFMContactGuidancePage.url)
      case "CYA NFM"             => Nav.navigateTo(RFMNewNFMContactNamePage.url)

    }
  }

  And("""^I provide RFM (.*) as (.*)$""") { (field: String, name: String) =>
    field match {
      case "pillar2 id" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.pillar2topuptaxid)
        Input.sendKeysByCss(name, RFMEnterPillar2IdPage.pillar2topuptaxid)

      case "contact name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.nameField)
        Input.sendKeysByCss(name, RFMContactDetailNamePage.nameField)

      case "New NFM Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNamePage.nameField)
        Input.sendKeysByCss(name, RFMNewNFMContactNamePage.nameField)

    }
  }

  And("""^I should see an error message (.*) on the RFM (.*) Page$""") { (error: String, page: String) =>
    page match {
      case "start" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorLink)
        getTextOf(By cssSelector (RFMStartPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMStartPage.errorMessage)
        getTextOf(By cssSelector (RFMStartPage.errorMessage)) should include(error)

      case "enter pillar2 id" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorLink)
        getTextOf(By cssSelector (RFMEnterPillar2IdPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMEnterPillar2IdPage.errorMessage)
        getTextOf(By cssSelector (RFMEnterPillar2IdPage.errorMessage)) should include(error)

      case "Registration Date" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorLink)
        getTextOf(By cssSelector (RFMRegistrationDatePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMRegistrationDatePage.errorMessage)
        getTextOf(By cssSelector (RFMRegistrationDatePage.errorMessage)) should include(error)

      case "journey error" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorLink)
        getTextOf(By cssSelector (RFMCorpPositionPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMCorpPositionPage.errorMessage)
        getTextOf(By cssSelector (RFMCorpPositionPage.errorMessage)) should include(error)

      case "contact detail" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorLink)
        getTextOf(By cssSelector (RFMContactDetailNamePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMContactDetailNamePage.errorMessage)
        getTextOf(By cssSelector (RFMContactDetailNamePage.errorMessage)) should include(error)

      case "contact name change" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorLink)
        getTextOf(By cssSelector (RFMNewNFMContactNameChangePage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactNameChangePage.errorMessage)
        getTextOf(By cssSelector (RFMNewNFMContactNameChangePage.errorMessage)) should include(error)

      case "contact address change" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorMessage)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorLink)
        getTextOf(By cssSelector (RFMNewNFMContactAddressChange.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(RFMNewNFMContactAddressChange.errorMessage)
        getTextOf(By cssSelector (RFMNewNFMContactAddressChange.errorMessage)) should include(error)
    }
  }

  And("""^Registration (.*) is entered as (.*)$""") { (field: String, name: String) =>
    field match {
      case "Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regDay)
        Input.sendKeysById(name, RFMRegistrationDatePage.regDay)

      case "Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regMonth)
        Input.sendKeysById(name, RFMRegistrationDatePage.regMonth)

      case "Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(RFMRegistrationDatePage.regYear)
        Input.sendKeysById(name, RFMRegistrationDatePage.regYear)

    }
  }

  When("""^Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service$""") { (enrolmentkey: String, identifiername:String, identifiervalue:String) =>
    AuthLoginPage.loginWithExistingEntity(enrolmentkey, identifiername, identifiervalue)
    AuthLoginPage.loginWithExistingEntityWithRFM(enrolmentkey, identifiername, identifiervalue)
  }

  And("""^I should see 4 sections on RFM start page""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(RFMStartPage.sections)
    assert(driver.findElements(By.cssSelector(RFMStartPage.sections)).size() == 4)
  }

  And("""^I should see the section (\d+) as (.*)""") { (sectionNumber: Int, sectionName: String) =>
    assert(driver.findElements(By.cssSelector(RFMStartPage.sections)).get(sectionNumber - 1).getText.contains(sectionName))
  }

  And("""^I should see confirmation checkbox""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(RFMStartPage.confirmCheckBox)
  }

  And("""^I select confirmation checkbox""") { () =>
    RFMStartPage.clickConfirm()
  }

  And("""^I click change link for RFM (.*)""") { (link: String) =>
    link match {
      case "Pillar 2 top-up taxes ID" =>
        clickByCss(RFMCYAPage.changePID)
      case "Registration date" =>
        clickByCss(RFMCYAPage.changeRegistrationDate)
      case "New NFM Name" =>
        clickByCss(RFMNoIDCYAPage.changeName)
    }
  }
  And("""^I select corp position as (.*)$""") { (option: String) =>
    option match {
      case "UPE" => Input.clickById("value_0")
      case "NFM" => Input.clickById("value_1")
    }
  }

}

