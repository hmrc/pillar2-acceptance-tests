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
import uk.gov.hmrc.test.ui.cucumber.Check.{assertNavigationToPage, assertNavigationToPageUrl}
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.isVisible
import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages.BusinessActivityEQPage
import uk.gov.hmrc.test.ui.conf
import uk.gov.hmrc.test.ui.conf.TestConfiguration
class BusinessActivityEQs extends BaseStepDef {

  And("""^I choose (.*) and continue$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById ("value_0")
      case "No" => Input.clickById ("value_1")
    }
    BusinessActivityEQPage.clickContinue()
  }

  Given("""^I am on (.*) Page$""") { page: String =>
    page match {
      case "Business activity EQ" =>
        Nav.navigateTo(TestConfiguration.url("businessEQ"))
    }
  }

  Given("""^I have the facility to answer the Business activity EQ$""") { () =>
    Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.eqForm)
    isVisible(By.cssSelector(BusinessActivityEQPage.eqForm)) shouldBe true
  }

  Then("""^The caption should be (.*)$""") { caption: String =>
    Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.caption)
    assert(getTextOf(By.cssSelector(BusinessActivityEQPage.caption)).contains(caption))

  }

  Then("""^I should navigate to (.*)""") { (page: String) =>
    Wait.waitForElementToClicktagName("h1")
    assertNavigationToPage(pageMatch(page))
  }

  And("""^I continue without selecting an option$""") { () =>
    Input.clickSubmit
  }

  And("""^I should see error message (.*) on $""") { (errorMessage: String) =>
    Input.clickSubmit
  }

}
