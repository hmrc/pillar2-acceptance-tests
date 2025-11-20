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

import uk.gov.hmrc.test.ui.pages.AuthLoginPage.{Enrolment, login}
import uk.gov.hmrc.test.ui.pages.btn._
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests

class BTNUnsuccessfulSpec extends BaseSpec {

  Feature("Below threshold notification unauthorised user journeys") {

    Scenario("1 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4220000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR4220000000"
          )
        )
      )

      Then("The user submits a below threshold notification")
      DashboardPage.clickSubmitBTNLink()
      BtnStartPage.continueToNextPage()
      BtnAccountingPage.continueToNextPage()
      BtnDomesticOrMnePage.entityInAndOutUkYes()
      BtnCyaSubmitPage.onPageSubmitById()

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }

    Scenario("2 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR4000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "btn",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR4000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }

    Scenario("3 - Org User navigates to KB page, if BTN submission unsuccessful [PLRID=XEPLR5000000000]", AcceptanceTests) {
      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "btn",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XEPLR5000000000"
          )
        )
      )

      Then("The user encounters the problem with service page")
      BtnProblemWithServicePage.onPage()
    }
  }
}
