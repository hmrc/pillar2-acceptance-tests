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

package uk.gov.hmrc.test.ui.specs

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.login
import uk.gov.hmrc.test.ui.pages.bta._
import uk.gov.hmrc.test.ui.specs.tags._

class BTASpec extends BaseSpec {

  Feature("BTA user registration for Pillar 2 service") {

    Scenario("1 - BTA user registration with PLRID", AcceptanceTests) {
      Given("Organisation User logs in with BTA for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "bta"
      )

      When("The user is on the BTA have Pillar2 id page and selects yes")
      BTAPillar2IDCheckPage.selectYes()

      Then("The user will be taken to the BTA EACD page")
      BTAEACDPage.onPage()
    }

    Scenario("2 - BTA user registration with no PLRID", AcceptanceTests) {
      Given("Organisation User logs in with BTA for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "bta"
      )

      When("The user is on the BTA have Pillar2 id page and selects no ")
      BTAPillar2IDCheckPage.selectNo()

      Then("The user will be taken to the BTA register page")
      BTARegisterGuidancePage.onPage()
    }
  }
}
