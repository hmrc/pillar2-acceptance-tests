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

import uk.gov.hmrc.test.ui.helper.Nav
import uk.gov.hmrc.test.ui.pages.AuthLoginOldPage.*

import uk.gov.hmrc.test.ui.specs.tags.*
import uk.gov.hmrc.test.ui.specsdef.ASAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.PaymentStepsSteps.{thenIGoTillGetReadyToApproveYourPaymentPage, thenIMakeSuccessfulPayment, thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage}
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps.thenIShouldBeRedirectedTo
import uk.gov.hmrc.test.ui.specsdef.SubscriptionJourneyStepsSteps.andIEnterAccountPeriodAs
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.*

class DashboardPageSpec extends BaseSpec {

  Feature("Dashboard Page") {

    Scenario("2 - User navigates to group details page validates the data and MTT to DTT Kb page", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Manage group details link")
      andIClickLink("Manage group details")

      Then("I should navigate to accounts summary page")
      thenIShouldNavigateTo("accounts summary page")

      When("I click on change hyperlink next to the FD Group Status")
      andIClickOnChangeHyperlinkNextToThe("FD Group Status")

      When("I select option Only in the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")

      Then("I should be on the MTT to DTT kb page")
      thenIShouldNavigateTo("MTT to DTT kb page")

      And("I select back link")
      andISelectBackLink()

      Then("I should be on Manage group status Page")
      thenIShouldBeOn("Manage group status Page")

      And("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      Then("I should navigate to accounts summary page")
      thenIShouldNavigateTo("accounts summary page")

      When("I click on change hyperlink next to the Accounting Period")
      andIClickOnChangeHyperlinkNextToThe("Accounting Period")

      When("I enter account period as:")
      val dateRangeData: Map[String, String] = Map(
        "startDate.day"   -> "5",
        "startDate.month" -> "5",
        "startDate.year"  -> "2025",
        "endDate.day"     -> "5",
        "endDate.month"   -> "6",
        "endDate.year"    -> "2026"
      )
      andIEnterAccountPeriodAs(dateRangeData)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to Manage Account processing Page or Dashboard page")
      thenIShouldBeRedirectedTo("Manage Account processing Page", "Dashboard page")

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")
    }

    Scenario("3 - User navigates to amend contact details page and validates the data", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")

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

    

    Scenario("7 - Make successful payment as Organisation user", AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")

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
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")

      Then("I click Add Delegated Enrolment button")
      clickAddDelegatedEnrolmentCTA()

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      addDelegatedEnrolments("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")

      And("I Click Submit button")
      clickSubmitButton()

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
