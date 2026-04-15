package uk.gov.hmrc.test.ui.specs

import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.outstandingPayments.OnlinePaymentPages.makeSuccessfulPayment
import uk.gov.hmrc.test.ui.pages.outstandingPayments.OutstandingPaymentsPage
import uk.gov.hmrc.test.ui.pages.stoodoverCharges.StoodoverChargesPage
import uk.gov.hmrc.test.ui.pages.transactionHistory.TransactionHistoryPage
import uk.gov.hmrc.test.ui.specs.tags.*

class AAoutstandingPaymentsSpec extends BaseSpec {
  // TODO @accountActivity = true - Look into these scenarios , StoodoverCharges page will comes only if AA flag true
  Feature("Dashboard Page") {

    Scenario(
      "1 - Make successful payment as an Org user",
      Wip
    ) {

      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674"
          )
        )
      )

      And("The user views outstanding payments")
      DashboardPage.clickPaymentOutstandingLink()
      OutstandingPaymentsPage.onPage()

      And("The user can access relevant links from outstanding payments")
      OutstandingPaymentsPage.clickLinkWaysToPay()
      OutstandingPaymentsPage.clickLinkviewStoodoverChargesFirstLink()
      StoodoverChargesPage.clickBackLink()
      OutstandingPaymentsPage.clickLinkviewStoodoverChargesSecondLink()
      StoodoverChargesPage.clickBackLink()
      OutstandingPaymentsPage.clickLinkViewTransactionHistory()
      TransactionHistoryPage.clickBackLink()
      OutstandingPaymentsPage.onPage()

      When("The user makes a successful payment")
      OutstandingPaymentsPage.continueToNextPage()
      makeSuccessfulPayment()

      Then("The user is taken to the transaction history page")
      TransactionHistoryPage.onPage()
    }

    Scenario(
      "2 - Make successful payment as an Agent",
      Wip
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
            value = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterText("XMPLR0012345674")
      ASAConfirmationPage.continueToNextPage()

      And("The agent views outstanding payments")
      DashboardPage.clickPaymentOutstandingLink()
      OutstandingPaymentsPage.onPage()

      And("The agent can access relevant links from outstanding payments")
      OutstandingPaymentsPage.clickLinkWaysToPay()
      OutstandingPaymentsPage.clickLinkviewStoodoverChargesFirstLink()
      StoodoverChargesPage.clickBackLink()
      OutstandingPaymentsPage.clickLinkviewStoodoverChargesSecondLink()
      StoodoverChargesPage.clickBackLink()
      OutstandingPaymentsPage.clickLinkViewTransactionHistory()
      TransactionHistoryPage.clickBackLink()
      OutstandingPaymentsPage.onPage()

      When("The agent makes a successful payment")
      OutstandingPaymentsPage.continueToNextPage()
      makeSuccessfulPayment()

      Then("The agent is taken to the transaction history page")
      TransactionHistoryPage.onPage()
    }
  }
}
