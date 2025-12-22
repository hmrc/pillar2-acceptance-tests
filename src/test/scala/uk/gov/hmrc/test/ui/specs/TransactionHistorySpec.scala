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

import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.transactionHistory.*
import uk.gov.hmrc.test.ui.specs.tags.*

class TransactionHistorySpec extends BaseSpec {

  Feature("Transaction History") {

    Scenario(
      "1 - Org user accesses Transaction History pages",
      AcceptanceTests
    ) {

      Given("Org user logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0000000122"
          )
        )
      )

      Then("The user accesses transaction history and checks two different pages")
      DashboardPage.clickPaymentHistoryLink()
      TransactionHistoryPage.clickLink(TransactionHistoryPage.pageTwoLink)
      TransactionHistorySecondPage.onPage()
    }

    Scenario(
      "2 - Org user accesses empty transaction history page",
      AcceptanceTests
    ) {

      Given("Org user logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XEPLR4040000000"
          )
        )
      )

      Then("The user accesses transaction history and is taken to the history empty page")
      DashboardPage.clickPaymentHistoryLink()
      TransactionHistoryEmptyPage.onPage()
    }

    Scenario(
      "3 - Agent accesses Transaction History pages",
      AcceptanceTests
    ) {

      Given("Agent User logs in to Pillar2 service with delegated enrollment")
      login(
        userType = "Agent",
        page = "asa",
        enrolment = Some(
          Enrolment(
            key = "HMRC-AS-AGENT",
            name = "AgentReference",
            value = "1234"
          )
        ),
        delegatedEnrolments = Seq(
          DelegatedEnrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0000000122",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XMPLR0000000122")
      ASAConfirmationPage.continue()

      Then("The agent accesses transaction history and checks two different pages")
      DashboardPage.clickPaymentHistoryLink()
      TransactionHistoryPage.clickLink(TransactionHistoryPage.pageTwoLink)
      TransactionHistorySecondPage.onPage()
    }
  }
}
