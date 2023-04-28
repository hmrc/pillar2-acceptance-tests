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
import uk.gov.hmrc.test.ui.cucumber.Check.assertNavigationToPage
import uk.gov.hmrc.test.ui.cucumber.Nav.isVisible
import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages.AuthLoginPage
class BusinessActivityEQs extends BaseStepDef {

  And("""^I select (.*) option and continue$""") { (option: String) =>
    option match {
      case "Yes" => Input.clickById ("value_0")
      case "No" => Input.clickById ("value_1")

    }
    Input.clickSubmit
  }

  Given("""^I am on (.*) Page$""") { page: String =>
    page match {
      case "Business activity within UK EQ" =>
        Nav.navigateTo("http://localhost:10050/pillar-two/eligibility/activities-within-the-uk")
    }
  }

  Given("""^I have the facility to answer the Business activity within UK EQ$""") { () =>
    Wait.waitForElement("header-id")
    isVisible(By.id("EQFormId")) shouldBe true
  }
  Then("""^I should navigate to (.*)""") { (page: String) =>
    val pageObj = pageMatch(page)
    Wait.waitForElementToClicktagName("h1")
    assertNavigationToPage(pageMatch(page))
  }

}
