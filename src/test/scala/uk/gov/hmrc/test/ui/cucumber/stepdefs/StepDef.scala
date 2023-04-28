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

import uk.gov.hmrc.test.ui.cucumber.{Check, Forms, Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages.AuthLoginPage

class StepDef extends BaseStepDef {

  Given("""^(.*) logs in to register for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginWithUser(name)
      case "Individual User"   => AuthLoginPage.loginAsInd(name)
      case "Assistant User"    => AuthLoginPage.loginAssistant(name)
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
