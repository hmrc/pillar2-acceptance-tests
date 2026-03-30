package uk.gov.hmrc.test.ui.specs

import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.stoodoverCharges.StoodoverChargesPage
import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.outstandingPayments.OutstandingPaymentsPage
import uk.gov.hmrc.test.ui.pages.transactionHistory.*

class StoodoverChargesSpec extends BaseSpec {

  Feature("Stoodover Charges ") {

    Scenario("1 - Org User navigates to Stoodover Charges", AcceptanceTests) {

      Given("Organisation User logs in with existing entity group")

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

      Then("The user successfully checks stoodover charges page")
      DashboardPage.clickStoodoverCharges()
      StoodoverChargesPage.onPage()

      And("The user can access relevant links from stoodover charges page ")
      StoodoverChargesPage.clickLinkviewOutstandingPayments()
      OutstandingPaymentsPage.onPage()
      OutstandingPaymentsPage.clickBackLink()
      StoodoverChargesPage.clickLinkViewTransactionHistory()
      TransactionHistoryPage.onPage()
      TransactionHistoryPage.clickBackLink()
      StoodoverChargesPage.onPage()

    }

    Scenario("2 - Agent User navigates to Stoodover Charges", AcceptanceTests) {

      Given("Agent User logs in with existing entity group")
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

      Then("The agent successfully checks stoodover charges page")
      DashboardPage.clickStoodoverCharges()
      StoodoverChargesPage.onPage()

      And("The user can access relevant links from stoodover charges page ")
      StoodoverChargesPage.clickLinkviewOutstandingPayments()
      OutstandingPaymentsPage.onPage()
      OutstandingPaymentsPage.clickBackLink()
      StoodoverChargesPage.clickLinkViewTransactionHistory()
      TransactionHistoryPage.clickBackLink()
      StoodoverChargesPage.onPage()
    }

  }
}
