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
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, PageObject, Wait}
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, BusinessActivityEQPage, GlobalGrossRevenueEQPage, InitialGuidancePage, MultipleTerritoriesEQPage, NextEQPage}

class StepDef extends BaseStepDef {

  Given("""^(.*) logs in to register for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User"   => AuthLoginPage.loginAsInd(name)
      case "Assistant User"    => AuthLoginPage.loginAssistant(name)
    }
  }

  Given("""^(.*) logs in to subscribe for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginForSubscribe(name)
    }
  }

  Then("""^I navigate to (.*) page$""") { page: String =>
    page match {
      case "start"      =>
        Nav.navigateTo("http://localhost:10050/pillar-two")
      case "individual" =>
        Nav.navigateTo(
          "http://localhost:10050/pillar-two/register/problem/individual-sign-in-problem"
        )
    }
  }

  Then("""^The Heading should be (.*)$""") { header: String =>
    Check.checkH1(header)
  }
  Then("""^The Body content should be (.*)$""") { text: String =>
    Check.checkBodyText(text)
  }

  Given("""^I fill (.*) and continue$""") { page: String =>
    page match {
      case "What is the main address of your business page" => Forms.addressNonUK()
    }
    Input.clickSubmit()
  }

  When(
    """^(I click Continue button|click Confirm and send|click Try Again)$"""
  ) { (negate: String) =>
    Input.clickSubmit
  }
  When("""^(I click on Continue button)""")
   { (negate: String) =>
     InitialGuidancePage.clickContinue()
  }
  Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
    Input.sendKeysById(text, id)
  }

  And("""^I select (.*) and continue$""") { (id: String) =>
    Input.clickById(id)
    Input.clickSubmit
  }

  And("""^click (.*)$""") { (id: String) =>
    Input.clickByLinkText(id)
  }

  Given("""^I am on (.*) Page$""") { page: String =>
    page match {
      case "Business activity EQ" =>
        navigateTo(BusinessActivityEQPage.url)
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.eqForm)
        isVisible(By.cssSelector(BusinessActivityEQPage.eq)) shouldBe true
      case "Global gross revenue" =>
        navigateTo(GlobalGrossRevenueEQPage.url)
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.eqForm)
        isVisible(By.cssSelector(GlobalGrossRevenueEQPage.eq)) shouldBe true
      case "Multiple Territories EQ" =>
        navigateTo(MultipleTerritoriesEQPage.url)
        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.eqForm)
        isVisible(By.cssSelector(MultipleTerritoriesEQPage.eq)) shouldBe true


    }
  }

  And("""^I should see error message (.*) on the (.*) Page$""") { (error: String, page: String) =>
    page match {
      case "Business activity EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorLink)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorMessage)
        getTextOf(By cssSelector (BusinessActivityEQPage.errorMessage)) should include(error)

      case "Global gross revenue" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorLink)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorMessage)
        getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorMessage)) should include(error)

      case "Multiple Territories EQ" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorLink)
        getTextOf(By cssSelector (MultipleTerritoriesEQPage.errorLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(MultipleTerritoriesEQPage.errorMessage)
        getTextOf(By cssSelector (MultipleTerritoriesEQPage.errorMessage)) should include(error)
    }
  }

  Then("""^The caption must be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
    assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).contains(caption))
  }

  And("""^I click (.*) link$""") { (linkText: String) =>
    Input.clickByLinkText(linkText)
  }

/*  Given("""^I fill (.*) and continue$""") { page: String =>
    page match {
      case "What is the main address of your business page" => Forms.addressNonUK()
    }
    Input.clickSubmit()
  }

  And(
    """^(click Continue button|click Confirm and send|click Try Again)$"""
  ) { (negate: String) =>
    Input.clickSubmit
  }

  Then("""^I enter (.*) in (.*)$""") { (text: String, id: String) =>
    Input.sendKeysById(text, id)
  }

  And("""^I select (.*) and continue$""") { (id: String) =>
    Input.clickById(id)
    Input.clickSubmit
  }

  And("""^I click (.*)$""") { (id: String) =>
    Input.clickByLinkText(id)
  }

  And("""^click (.*) element$""") { (id: String) =>
    Input.clickById(id)
  }

  Then("""^The Page should include (.*)$""") { text: String =>
    Check.checkBodyText(text)
  }

  Then("""wait for (.*) seconds$""") { (secs: Int) =>
    Wait.secondsWait(secs)
  }

  Given("""^the user should be on the new window with heading (.*)""") { (title: String) =>
    Input.switchToNewWindow
    Check.checkH1(title)
  }*/

}
