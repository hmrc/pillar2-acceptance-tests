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
import uk.gov.hmrc.test.ui.pages.outstandingPayments.OnlinePaymentPages.makeSuccessfulPayment
import uk.gov.hmrc.test.ui.pages.outstandingPayments.OutstandingPaymentsPage
import uk.gov.hmrc.test.ui.pages.transactionHistory.TransactionHistoryPage
import uk.gov.hmrc.test.ui.specs.tags.*

class OutstandingPaymentsSpec extends BaseSpec {

  Feature("Dashboard Page") {

    Scenario(
      "1 - Make successful payment as an Org user",
      AcceptanceTests
    ) {

      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345674"
          )
        )
      )

      And("The user views outstanding payments")
      DashboardPage.clickPaymentOutstandingLink()
      OutstandingPaymentsPage.onPage()

      When("The user makes a successful payment")
      OutstandingPaymentsPage.continueToNextPage()
      makeSuccessfulPayment()

      Then("The user is taken to the transaction history page")
      TransactionHistoryPage.onPage()
    }

    Scenario(
      "2 - Make successful payment as an Agent",
      AcceptanceTests
    ) {

      Given("Agent User logs in to Pillar2 service with delegated enrollment")
      login(
        userType = "Agent",
        pageUrl = "asa",
        enrolment = Some(
          Enrolment(
            enrolmentKey = "HMRC-AS-AGENT",
            identifierName = "AgentReference",
            identifierValue = "1234"
          )
        ),
        delegatedEnrolment = Some(
          DelegatedEnrolment(
            enrolmentKey = "HMRC-PILLAR2-ORG",
            identifierName = "PLRID",
            identifierValue = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterPLR2Id("XMPLR0012345674")
      ASAConfirmationPage.continueToNextPage()

      And("The agent views outstanding payments")
      DashboardPage.clickPaymentOutstandingLink()
      OutstandingPaymentsPage.onPage()

      When("The agent makes a successful payment")
      OutstandingPaymentsPage.continueToNextPage()
      makeSuccessfulPayment()

      Then("The agent is taken to the transaction history page")
      TransactionHistoryPage.onPage()
    }
  }
}
