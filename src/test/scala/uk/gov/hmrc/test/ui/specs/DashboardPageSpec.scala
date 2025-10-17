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

import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
class DashboardPageSpec extends AnyFeatureSpec with Matchers {

  Feature("Dashboard Page") {

    Scenario("1 - User navigates to Dashboard page and validates the links") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link")
      Then("I should be navigated to new tab")
      And("I should be on Draft guidance page")
      Then("I close new tab")
      And("I should navigate back to main tab")
      And("I should be on Dashboard page")
      When("I click Make a payment link")
      Then("I should navigate to Make a payment page")
      When("I click Report Pillar 2 Top-up Taxes link")
      Then("I should be on Dashboard page")
      When("I click Make a payment link")
      Then("I should navigate to Make a payment page")
      When("I select back link")
      Then("I should be on Dashboard page")
      When("I click View and amend contact details link")
      Then("I should navigate to contact details summary page")
      When("I click the browser back button")
      Then("I should be on Dashboard page")
      When("I click View and amend group details link")
      Then("I should navigate to accounts summary page")
      When("I click the browser back button")
      Then("I should be on Dashboard page")
      When("I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link")
      Then("I should be navigated to new tab")
      And("I should be on Draft guidance page")
      Then("I close new tab")
      And("I should navigate back to main tab")
      And("I should be on Dashboard page")
      When("I click Sign out link")
      Then("I am on feedback survey page")
    }

    Scenario("2 - User navigates to group details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click View and amend group details link")
      Then("I should navigate to accounts summary page")
      When("I click on change hyperlink next to the FD Group Status")
      When("I select option Only in the UK in further details group status page")
      Then("I should navigate to accounts summary page")
      When("I click on change hyperlink next to the Accounting Period")
      When("I enter account period as:")
      And("I click on Continue button")
      Then("I should be redirected to Manage Account processing Page or Dashboard page")
      And("I should be on Dashboard page")
    }

    Scenario("3 - User navigates to amend contact details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click View and amend contact details link")
      Then("I should navigate to contact details summary page")
      When("I click on change link for Contact Name")
      When("I enter Contact Name as Contact Name Test #")
      Then("I should navigate to contact details summary page")
      When("I click on change link for Email address")
      When("I enter Contact Email as contact*@email.com")
      When("I click on change link for Phone number")
      When("I enter Phone Number as 123456789")
      When("I click on change link for Do you have a second contact?")
      When("I select option No and continue to next")
      When("I click on change link for Do you have a second contact?")
      When("I select option Yes and continue to next")
      When("I enter Second Contact Name as Second Contact £ Name Test")
      When("I enter Second Contact Email as second&Contact@email.com")
      When("I select option Yes and continue to next")
      When("I enter Second Contact Input as 1234554878")
      When("I click on change link for Dashboard Address")
      When("I enter Address Line 1 as Test Address Line 1")
      When("I enter Address Line 2 as Test Address Line 2")
      And("I enter City as Test City")
      And("I enter Region as Test Region")
      And("I enter Postal Code as EH5 5WY")
      And("I click on Continue button")
      Then("I should navigate to contact details summary page")
      When("I click on Continue button")
      Then("I should be redirected to Manage Contact processing Page or Dashboard page")
      And("I should be on Dashboard page")
    }

    Scenario("4 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to amend subscription API") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click View and amend contact details link")
      Then("I should navigate to contact details summary page")
      When("I click on change link for Contact Name")
      When("I enter Contact Name as 400")
      Then("I should navigate to contact details summary page")
      When("I click on Continue button")
      Then("I should be on Subscription API error page")
      When("I click Return to your account homepage to try again link")
      Then("I should be on Dashboard page")
    }

    Scenario("5 - Verify Transaction History pages for Org user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0000000122 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Page")
      When("I select back link")
      Then("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Page")
      When("I click Next CTA")
      Then("I should be on Transaction History Second Page")
      When("I click Previous CTA")
      Then("I should be on Transaction History Page")
      When("I click Report Pillar 2 Top-up Taxes link")
      Then("I should be on Dashboard page")
      And("I click Sign out link")
      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4040000000 for Pillar2 service")
      And("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Empty Page")
      When("I select back link")
      Then("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Empty Page")
      When("I click Report Pillar 2 Top-up Taxes link")
      Then("I should be on Dashboard page")
      And("I click Sign out link")
      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
      And("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Error Page")
      When("I click Return to your account homepage link")
      Then("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Error Page")
      When("I select back link")
      Then("I should be on Dashboard page")
      And("I click Sign out link")
      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR6666666666 for Pillar2 service")
      And("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Page")
      And("I click Sign out link")
      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555551111 for Pillar2 service")
      And("I should be on Dashboard page")
      When("I click View your transaction history link")
      Then("I should be on Transaction History Page")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=contact details summary, page=contact details summary page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the contact details summary page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the contact details summary page")
      Then("I should be on contact details summary page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=account summary, page=accounts summary page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the account summary page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the account summary page")
      Then("I should be on accounts summary page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=MakePayment, page=Make a payment page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the MakePayment page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the MakePayment page")
      Then("I should be on Make a payment page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment guidance, page=Repayment Guidance Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment guidance page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment guidance page")
      Then("I should be on Repayment Guidance Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment amount, page=Repayment Amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment amount page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment amount page")
      Then("I should be on Repayment Amount Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment reason, page=Reason For Refund Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment reason page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment reason page")
      Then("I should be on Reason For Refund Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment method, page=Repayment Method Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment method page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment method page")
      Then("I should be on Repayment Method Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=uk bank account, page=UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the uk bank account page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the uk bank account page")
      Then("I should be on UK Bank Account Payment Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=non-uk bank account, page=Non UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the non-uk bank account page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the non-uk bank account page")
      Then("I should be on Non UK Bank Account Payment Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact name, page=Repayment Contact Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment contact name page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment contact name page")
      Then("I should be on Repayment Contact Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact email, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment contact email page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment contact email page")
      Then("I should be on Repayment Journey Recovery Error Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment phone page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment phone page")
      Then("I should be on Repayment Journey Recovery Error Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone input, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment phone input page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment phone input page")
      Then("I should be on Repayment Journey Recovery Error Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment CYA, page=Repayment CYA Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment CYA page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment CYA page")
      Then("I should be on Repayment CYA Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change amount, page=Repayment change amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment change amount page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment change amount page")
      Then("I should be on Repayment change amount Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change method, page=Repayment change method Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment change method page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment change method page")
      Then("I should be on Repayment change method Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change name, page=Repayment change name Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the repayment change name page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the repayment change name page")
      Then("I should be on Repayment change name Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=transaction history, page=Transaction History Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the transaction history page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the transaction history page")
      Then("I should be on Transaction History Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact name, page=Manage contact name Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the manage contact name page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the manage contact name page")
      Then("I should be on Manage contact name Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage second contact name, page=Manage second contact name]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the manage second contact name page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the manage second contact name page")
      Then("I should be on Manage second contact name")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact address, page=Manage contact address Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the manage contact address page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the manage contact address page")
      Then("I should be on Manage contact address Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage group status, page=Manage group status Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the manage group status page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the manage group status page")
      Then("I should be on Manage group status Page")
      And("I click Sign out link")
    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage accounting period, page=Manage accounting period Page]") {
      Given("Organisation User logs in to register for Pillar2")
      And("I should be on Task list page")
      When("I access the manage accounting period page")
      Then("I should be on Unauthorised Page")
      When("I click Sign out link")
      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I access the manage accounting period page")
      Then("I should be on Manage accounting period Page")
      And("I click Sign out link")
    }

    Scenario("7 - Make successful payment as Organisation user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click Make a payment link")
      Then("I should navigate to Make a payment page")
      When("I click on Continue button")
      Then("I make successful payment")
      And("I should navigate to Transaction History Page")
      When("I click Report Pillar 2 Top-up Taxes link")
      Then("I should be on Dashboard page")
    }

    Scenario("8 - Make successful payment as Agent") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click Make a payment link")
      Then("I should navigate to Make a payment page")
      When("I click on Continue button")
      Then("I make successful payment")
      And("I should navigate to Transaction History Page")
      When("I click Report Pillar 2 Top-up Taxes link")
      Then("I should be on Dashboard page")
    }

    Scenario("9 - Back journey from Get ready to approve your payment page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click Make a payment link")
      Then("I should navigate to Make a payment page")
      When("I click on Continue button")
      And("I go till Get ready to approve your payment page")
      Then("I should be able to navigate back to make a payment page")
      Then("I should navigate to Make a payment page")
    }
  }
}
