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

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.specs.tags.{AcceptanceTests, ZapAccessibility}
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.PaymentStepsSteps.{thenIGoTillGetReadyToApproveYourPaymentPage, thenIMakeSuccessfulPayment, thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage}
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps.thenIShouldBeRedirectedTo
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class DashboardPageSpec extends BaseSpec with Matchers {

  Feature("Dashboard Page") {

    Scenario("1 - User navigates to Dashboard page and validates the links", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Manage contact details link")
      andIClickLink("Manage contact details")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Manage group details link")
      andIClickLink("Manage group details")

      Then("I should navigate to accounts summary page")
      thenIShouldNavigateTo("accounts summary page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      Then("I am on feedback survey page")
      andIAmOnFeedbackSurveyPage()
    }

    //TODO PIL-2519  MNE restricted need to be revisited after review.


    //    Scenario("2 - User navigates to group details page and validates the data", AcceptanceTests, ZapAccessibility) {
//      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Organisation",
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XMPLR0012345676"
//      )
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      When("I click Manage group details link")
//      andIClickLink("Manage group details")
//
//      Then("I should navigate to accounts summary page")
//      thenIShouldNavigateTo("accounts summary page")
//
//      When("I click on change hyperlink next to the FD Group Status")
//      andIClickOnChangeHyperlinkNextToThe("FD Group Status")
//
//      When("I select option Only in the UK in further details group status page")
//      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")
//
//      Then("I should navigate to accounts summary page")
//      thenIShouldNavigateTo("accounts summary page")
//
//      When("I click on change hyperlink next to the Accounting Period")
//      andIClickOnChangeHyperlinkNextToThe("Accounting Period")
//
//      When("I enter account period as:")
//      val dateRangeData: Map[String, String] = Map(
//        "startDate.day"   -> "5",
//        "startDate.month" -> "5",
//        "startDate.year"  -> "2025",
//        "endDate.day"     -> "5",
//        "endDate.month"   -> "6",
//        "endDate.year"    -> "2026"
//      )
//      andIEnterAccountPeriodAs(dateRangeData)
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should be redirected to Manage Account processing Page or Dashboard page")
//      thenIShouldBeRedirectedTo("Manage Account processing Page", "Dashboard page")
//
//      And("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//    }

    Scenario("3 - User navigates to amend contact details page and validates the data", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345676"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Manage contact details link")
      andIClickLink("Manage contact details")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on change link for Contact Name")
      andIClickOnChangeLinkFor("Contact Name")

      When("I enter Contact Name as Contact Name Test #")
      andIEnterAs("Contact Name", "Contact Name Test #")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on change link for Email address")
      andIClickOnChangeLinkFor("Email address")

      When("I enter Contact Email as contact*@email.com")
      andIEnterAs("Contact Email", "contact*@email.com")

      When("I click on change link for Phone number")
      andIClickOnChangeLinkFor("Phone number")

      When("I enter Phone Number as 123456789")
      andIEnterAs("Phone Number", "123456789")

      When("I click on change link for Do you have a second contact?")
      andIClickOnChangeLinkFor("Do you have a second contact?")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I click on change link for Do you have a second contact?")
      andIClickOnChangeLinkFor("Do you have a second contact?")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Second Contact Name as Second Contact £ Name Test")
      andIEnterAs("Second Contact Name", "Second Contact £ Name Test")

      When("I enter Second Contact Email as second&Contact@email.com")
      andIEnterAs("Second Contact Email", "second&Contact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Second Contact Input as 1234554878")
      andIEnterAs("Second Contact Input", "1234554878")

      When("I click on change link for Dashboard Address")
      andIClickOnChangeLinkFor("Dashboard Address")

      When("I enter Address Line 1 as Test Address Line 1")
      andIEnterAs("Address Line 1", "Test Address Line 1")

      When("I enter Address Line 2 as Test Address Line 2")
      andIEnterAs("Address Line 2", "Test Address Line 2")

      And("I enter City as Test City")
      andIEnterAs("City", "Test City")

      And("I enter Region as Test Region")
      andIEnterAs("Region", "Test Region")

      And("I enter Postal Code as EH5 5WY")
      andIEnterAs("Postal Code", "EH5 5WY")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to Manage Contact processing Page or Dashboard page")
      thenIShouldBeRedirectedTo("Manage Contact processing Page", "Dashboard page")

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("4 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to amend subscription API", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345676"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Manage contact details link")
      andIClickLink("Manage contact details")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on change link for Contact Name")
      andIClickOnChangeLinkFor("Contact Name")

      When("I enter Contact Name as 400")
      andIEnterAs("Contact Name", "400")

      Then("I should navigate to contact details summary page")
      thenIShouldNavigateTo("contact details summary page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Subscription API error page")
      thenIShouldBeOn("Subscription API error page")

      When("I click Return to your account homepage to try again link")
      andIClickLink("Return to your account homepage to try again")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    //TODO PIL-2449 logic has changed so XEPLR4000000000 will not go to dashboard, need to be deleted after review.

    Scenario("5 - Verify Transaction History pages for Org user", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0000000122 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0000000122"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      When("I click Next CTA")
      whenIClickCTA("Next")

      Then("I should be on Transaction History Second Page")
      thenIShouldBeOn("Transaction History Second Page")

      When("I click Previous CTA")
      whenIClickCTA("Previous")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4040000000 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR4040000000"
      )

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Empty Page")
      thenIShouldBeOn("Transaction History Empty Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Empty Page")
      thenIShouldBeOn("Transaction History Empty Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

//      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
//      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
//        "Organisation",
//        "HMRC-PILLAR2-ORG",
//        "PLRID",
//        "XEPLR4000000000"
//      )
//
//      And("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      When("I click View transaction history link")
//      andIClickLink("View transaction history")
//
//      Then("I should be on Transaction History Error Page")
//      thenIShouldBeOn("Transaction History Error Page")
//
//      When("I click Return to your account homepage link")
//      andIClickLink("Return to your account homepage")
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      When("I click View transaction history link")
//      andIClickLink("View transaction history")
//
//      Then("I should be on Transaction History Error Page")
//      thenIShouldBeOn("Transaction History Error Page")
//
//      When("I select back link")
//      andISelectBackLink()
//
//      Then("I should be on Dashboard page")
//      thenIShouldBeOn("Dashboard page")
//
//      And("I click Sign out link")
//      andIClickLink("Sign out")

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR6666666666 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR6666666666"
      )

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555551111 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XEPLR5555551111"
      )

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View transaction history link")
      andIClickLink("View transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=contact details summary, page=contact details summary page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the contact details summary page")
      givenIAccessThePage("contact details summary")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the contact details summary page")
      givenIAccessThePage("contact details summary")

      Then("I should be on contact details summary page")
      thenIShouldBeOn("contact details summary page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=account summary, page=accounts summary page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the account summary page")
      givenIAccessThePage("account summary")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the account summary page")
      givenIAccessThePage("account summary")

      Then("I should be on accounts summary page")
      thenIShouldBeOn("accounts summary page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=MakePayment, page=Make a payment page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the MakePayment page")
      givenIAccessThePage("MakePayment")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the MakePayment page")
      givenIAccessThePage("MakePayment")

      Then("I should be on Make a payment page")
      thenIShouldBeOn("Make a payment page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment guidance, page=Repayment Guidance Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment guidance page")
      givenIAccessThePage("repayment guidance")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment guidance page")
      givenIAccessThePage("repayment guidance")

      Then("I should be on Repayment Guidance Page")
      thenIShouldBeOn("Repayment Guidance Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment amount, page=Repayment Amount Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment amount page")
      givenIAccessThePage("repayment amount")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment amount page")
      givenIAccessThePage("repayment amount")

      Then("I should be on Repayment Amount Page")
      thenIShouldBeOn("Repayment Amount Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment reason, page=Reason For Refund Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment reason page")
      givenIAccessThePage("repayment reason")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment reason page")
      givenIAccessThePage("repayment reason")

      Then("I should be on Reason For Refund Page")
      thenIShouldBeOn("Reason For Refund Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment method, page=Repayment Method Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment method page")
      givenIAccessThePage("repayment method")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment method page")
      givenIAccessThePage("repayment method")

      Then("I should be on Repayment Method Page")
      thenIShouldBeOn("Repayment Method Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=uk bank account, page=UK Bank Account Payment Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the uk bank account page")
      givenIAccessThePage("uk bank account")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the uk bank account page")
      givenIAccessThePage("uk bank account")

      Then("I should be on UK Bank Account Payment Page")
      thenIShouldBeOn("UK Bank Account Payment Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=non-uk bank account, page=Non UK Bank Account Payment Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the non-uk bank account page")
      givenIAccessThePage("non-uk bank account")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the non-uk bank account page")
      givenIAccessThePage("non-uk bank account")

      Then("I should be on Non UK Bank Account Payment Page")
      thenIShouldBeOn("Non UK Bank Account Payment Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact name, page=Repayment Contact Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment contact name page")
      givenIAccessThePage("repayment contact name")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment contact name page")
      givenIAccessThePage("repayment contact name")

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact email, page=Repayment Journey Recovery Error Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment contact email page")
      givenIAccessThePage("repayment contact email")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment contact email page")
      givenIAccessThePage("repayment contact email")

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone, page=Repayment Journey Recovery Error Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment phone page")
      givenIAccessThePage("repayment phone")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment phone page")
      givenIAccessThePage("repayment phone")

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone input, page=Repayment Journey Recovery Error Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment phone input page")
      givenIAccessThePage("repayment phone input")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment phone input page")
      givenIAccessThePage("repayment phone input")

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment CYA, page=Repayment CYA Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment CYA page")
      givenIAccessThePage("repayment CYA")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment CYA page")
      givenIAccessThePage("repayment CYA")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change amount, page=Repayment change amount Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment change amount page")
      givenIAccessThePage("repayment change amount")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment change amount page")
      givenIAccessThePage("repayment change amount")

      Then("I should be on Repayment change amount Page")
      thenIShouldBeOn("Repayment change amount Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change method, page=Repayment change method Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment change method page")
      givenIAccessThePage("repayment change method")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment change method page")
      givenIAccessThePage("repayment change method")

      Then("I should be on Repayment change method Page")
      thenIShouldBeOn("Repayment change method Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change name, page=Repayment change name Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the repayment change name page")
      givenIAccessThePage("repayment change name")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the repayment change name page")
      givenIAccessThePage("repayment change name")

      Then("I should be on Repayment change name Page")
      thenIShouldBeOn("Repayment change name Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=transaction history, page=Transaction History Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the transaction history page")
      givenIAccessThePage("transaction history")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the transaction history page")
      givenIAccessThePage("transaction history")

      Then("I should be on Transaction History Page")
      thenIShouldBeOn("Transaction History Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact name, page=Manage contact name Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the manage contact name page")
      givenIAccessThePage("manage contact name")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the manage contact name page")
      givenIAccessThePage("manage contact name")

      Then("I should be on Manage contact name Page")
      thenIShouldBeOn("Manage contact name Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage second contact name, page=Manage second contact name]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the manage second contact name page")
      givenIAccessThePage("manage second contact name")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the manage second contact name page")
      givenIAccessThePage("manage second contact name")

      Then("I should be on Manage second contact name")
      thenIShouldBeOn("Manage second contact name")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact address, page=Manage contact address Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the manage contact address page")
      givenIAccessThePage("manage contact address")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the manage contact address page")
      givenIAccessThePage("manage contact address")

      Then("I should be on Manage contact address Page")
      thenIShouldBeOn("Manage contact address Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage group status, page=Manage group status Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the manage group status page")
      givenIAccessThePage("manage group status")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the manage group status page")
      givenIAccessThePage("manage group status")

      Then("I should be on Manage group status Page")
      thenIShouldBeOn("Manage group status Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage accounting period, page=Manage accounting period Page]", AcceptanceTests) {
      Given("Organisation User logs in to register for Pillar2")
      givenLogsInToRegisterForPillar2("Organisation User")

      And("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I access the manage accounting period page")
      givenIAccessThePage("manage accounting period")

      Then("I should be on Unauthorised Page")
      thenIShouldBeOn("Unauthorised Page")

      When("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I access the manage accounting period page")
      givenIAccessThePage("manage accounting period")

      Then("I should be on Manage accounting period Page")
      thenIShouldBeOn("Manage accounting period Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("7 - Make successful payment as Organisation user", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I make successful payment")
      thenIMakeSuccessfulPayment()

      And("I should navigate to Transaction History Page")
      thenIShouldNavigateTo("Transaction History Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("8 - Make successful payment as Agent", AcceptanceTests) {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Agent",
        "HMRC-AS-AGENT",
        "AgentReference",
        "1234"
      )

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      whenIAddDelegatedEnrolmentWithAndForPillar2Service(
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674",
        "pillar2-auth"
      )

      Then("I should be on ASA Pillar2 Input Page")
      thenIShouldBeOn("ASA Pillar2 Input Page")

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to ASA Confirmation Page")
      thenIShouldNavigateTo("ASA Confirmation Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I make successful payment")
      thenIMakeSuccessfulPayment()

      And("I should navigate to Transaction History Page")
      thenIShouldNavigateTo("Transaction History Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("9 - Back journey from Get ready to approve your payment page", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click View outstanding payments link")
      andIClickLink("View outstanding payments")

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I go till Get ready to approve your payment page")
      thenIGoTillGetReadyToApproveYourPaymentPage()

      And("I should be able to navigate back to outstanding payment page")
      thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage()

      Then("I should navigate to Outstanding Payment Page")
      thenIShouldNavigateTo("Outstanding Payment Page")
    }
  }
}