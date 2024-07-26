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

import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._

class ASAStepDef extends BaseStepDef with BrowserDriver {

  Given("""^I access Agent (.*) page$""") { (name:String) =>
    name match {
      case "Pillar2 ID input" => Nav.navigateTo(ASAPillar2InputPage.url)
      case "Repayment contact" => Nav.navigateTo(AgentRepaymentContactPage.url)
    }
  }

  And("""^I directly access (.*) page$""") { (name:String) =>
    name match {
      case "Agent Non UK Payment Page" => Nav.navigateTo(AgentNonUKPaymentPage.url)
    }
  }


  And("""^I provide ASA (.*) as (.*)$""") { (field: String, value: String) =>
    field match {
      case "Pillar2 ID" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(ASAPillar2InputPage.pillar2IDField)
        Input.sendKeysByCss(value, ASAPillar2InputPage.pillar2IDField)
    }
  }

}

