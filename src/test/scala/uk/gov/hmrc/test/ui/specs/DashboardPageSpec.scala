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
import uk.gov.hmrc.test.ui.specstepdef.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.PaymentStepsSteps.{thenIGoTillGetReadyToApproveYourPaymentPage, thenIMakeSuccessfulPayment, thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage}
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps.thenIShouldBeRedirectedTo
import uk.gov.hmrc.test.ui.specstepdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class DashboardPageSpec extends BaseSpec with Matchers {

  Feature("Dashboard Page") {

    Scenario("1 - User navigates to Dashboard page and validates the links") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Manage contact details link")
        andIClickXLink("Manage contact details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Manage group details link")
        andIClickXLink("Manage group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
        andIAmOnFeedbackSurveyPage()
    }

    Scenario("2 - User navigates to group details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Manage group details link")
        andIClickXLink("Manage group details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the FD Group Status")
        andIClickOnChangeHyperlinkNextToTheX("FD Group Status")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the Accounting Period")
        andIClickOnChangeHyperlinkNextToTheX("Accounting Period")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

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
        thenIShouldBeRedirectedTo("Manage Account processing Page","Dashboard page")

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")
    }

    Scenario("3 - User navigates to amend contact details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Manage contact details link")
        andIClickXLink("Manage contact details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Name as Contact Name Test #")
        andIEnterXAsX("Contact Name", "Contact Name Test #")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Email address")
        andIClickOnChangeLinkForX("Email address")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Email as contact*@email.com")
        andIEnterXAsX("Contact Email", "contact*@email.com")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on change link for Phone number")
        andIClickOnChangeLinkForX("Phone number")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Phone Number as 123456789")
        andIEnterXAsX("Phone Number", "123456789")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on change link for Do you have a second contact?")
        andIClickOnChangeLinkForX("Do you have a second contact?")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on change link for Do you have a second contact?")
        andIClickOnChangeLinkForX("Do you have a second contact?")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Second Contact Name as Second Contact £ Name Test")
        andIEnterXAsX("Second Contact Name", "Second Contact £ Name Test")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Second Contact Email as second&Contact@email.com")
        andIEnterXAsX("Second Contact Email", "second&Contact@email.com")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Second Contact Input as 1234554878")
        andIEnterXAsX("Second Contact Input", "1234554878")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on change link for Dashboard Address")
        andIClickOnChangeLinkForX("Dashboard Address")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Address Line 1 as Test Address Line 1")
        andIEnterXAsX("Address Line 1", "Test Address Line 1")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Address Line 2 as Test Address Line 2")
        andIEnterXAsX("Address Line 2", "Test Address Line 2")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter City as Test City")
        andIEnterXAsX("City", "Test City")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Region as Test Region")
        andIEnterXAsX("Region", "Test Region")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Postal Code as EH5 5WY")
        andIEnterXAsX("Postal Code", "EH5 5WY")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to Manage Contact processing Page or Dashboard page")
        thenIShouldBeRedirectedTo("Manage Contact processing Page","Dashboard page")

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to amend subscription API") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Manage contact details link")
        andIClickXLink("Manage contact details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Name as 400")
        andIEnterXAsX("Contact Name", "400")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Subscription API error page")
        thenIShouldBeOnX("Subscription API error page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage to try again link")
        andIClickXLink("Return to your account homepage to try again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("5 - Verify Transaction History pages for Org user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0000000122 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0000000122")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Next CTA")
        whenIClickXCTA("Next")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Second Page")
        thenIShouldBeOnX("Transaction History Second Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Previous CTA")
        whenIClickXCTA("Previous")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4040000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4040000000")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Empty Page")
        thenIShouldBeOnX("Transaction History Empty Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Empty Page")
        thenIShouldBeOnX("Transaction History Empty Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4000000000")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to your account homepage link")
        andIClickXLink("Return to your account homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR6666666666 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR6666666666")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555551111 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555551111")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View transaction history link")
        andIClickXLink("View transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=contact details summary, page=contact details summary page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the contact details summary page")
        givenIAccessTheXPage("contact details summary")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the contact details summary page")
        givenIAccessTheXPage("contact details summary")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on contact details summary page")
        thenIShouldBeOnX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=account summary, page=accounts summary page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the account summary page")
        givenIAccessTheXPage("account summary")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the account summary page")
        givenIAccessTheXPage("account summary")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=MakePayment, page=Make a payment page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the MakePayment page")
        givenIAccessTheXPage("MakePayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the MakePayment page")
        givenIAccessTheXPage("MakePayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Make a payment page")
        thenIShouldBeOnX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment guidance, page=Repayment Guidance Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment guidance page")
        givenIAccessTheXPage("repayment guidance")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment guidance page")
        givenIAccessTheXPage("repayment guidance")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Guidance Page")
        thenIShouldBeOnX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment amount, page=Repayment Amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment amount page")
        givenIAccessTheXPage("repayment amount")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment amount page")
        givenIAccessTheXPage("repayment amount")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Amount Page")
        thenIShouldBeOnX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment reason, page=Reason For Refund Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment reason page")
        givenIAccessTheXPage("repayment reason")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment reason page")
        givenIAccessTheXPage("repayment reason")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Reason For Refund Page")
        thenIShouldBeOnX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment method, page=Repayment Method Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment method page")
        givenIAccessTheXPage("repayment method")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment method page")
        givenIAccessTheXPage("repayment method")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=uk bank account, page=UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the uk bank account page")
        givenIAccessTheXPage("uk bank account")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the uk bank account page")
        givenIAccessTheXPage("uk bank account")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=non-uk bank account, page=Non UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the non-uk bank account page")
        givenIAccessTheXPage("non-uk bank account")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the non-uk bank account page")
        givenIAccessTheXPage("non-uk bank account")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact name, page=Repayment Contact Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment contact name page")
        givenIAccessTheXPage("repayment contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment contact name page")
        givenIAccessTheXPage("repayment contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact email, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment contact email page")
        givenIAccessTheXPage("repayment contact email")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment contact email page")
        givenIAccessTheXPage("repayment contact email")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment phone page")
        givenIAccessTheXPage("repayment phone")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment phone page")
        givenIAccessTheXPage("repayment phone")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone input, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment phone input page")
        givenIAccessTheXPage("repayment phone input")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment phone input page")
        givenIAccessTheXPage("repayment phone input")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment CYA, page=Repayment CYA Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment CYA page")
        givenIAccessTheXPage("repayment CYA")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment CYA page")
        givenIAccessTheXPage("repayment CYA")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change amount, page=Repayment change amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change amount page")
        givenIAccessTheXPage("repayment change amount")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change amount page")
        givenIAccessTheXPage("repayment change amount")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment change amount Page")
        thenIShouldBeOnX("Repayment change amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change method, page=Repayment change method Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change method page")
        givenIAccessTheXPage("repayment change method")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change method page")
        givenIAccessTheXPage("repayment change method")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment change method Page")
        thenIShouldBeOnX("Repayment change method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change name, page=Repayment change name Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change name page")
        givenIAccessTheXPage("repayment change name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the repayment change name page")
        givenIAccessTheXPage("repayment change name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment change name Page")
        thenIShouldBeOnX("Repayment change name Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=transaction history, page=Transaction History Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the transaction history page")
        givenIAccessTheXPage("transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the transaction history page")
        givenIAccessTheXPage("transaction history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact name, page=Manage contact name Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage contact name page")
        givenIAccessTheXPage("manage contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage contact name page")
        givenIAccessTheXPage("manage contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Manage contact name Page")
        thenIShouldBeOnX("Manage contact name Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage second contact name, page=Manage second contact name]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage second contact name page")
        givenIAccessTheXPage("manage second contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage second contact name page")
        givenIAccessTheXPage("manage second contact name")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Manage second contact name")
        thenIShouldBeOnX("Manage second contact name")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact address, page=Manage contact address Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage contact address page")
        givenIAccessTheXPage("manage contact address")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage contact address page")
        givenIAccessTheXPage("manage contact address")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Manage contact address Page")
        thenIShouldBeOnX("Manage contact address Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage group status, page=Manage group status Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage group status page")
        givenIAccessTheXPage("manage group status")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage group status page")
        givenIAccessTheXPage("manage group status")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Manage group status Page")
        thenIShouldBeOnX("Manage group status Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage accounting period, page=Manage accounting period Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage accounting period page")
        givenIAccessTheXPage("manage accounting period")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access the manage accounting period page")
        givenIAccessTheXPage("manage accounting period")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Manage accounting period Page")
        thenIShouldBeOnX("Manage accounting period Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("7 - Make successful payment as Organisation user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I make successful payment")
        thenIMakeSuccessfulPayment()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I should navigate to Transaction History Page")
        thenIShouldNavigateToX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("8 - Make successful payment as Agent") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I make successful payment")
        thenIMakeSuccessfulPayment()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I should navigate to Transaction History Page")
        thenIShouldNavigateToX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("9 - Back journey from Get ready to approve your payment page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View outstanding payments link")
        andIClickXLink("View outstanding payments")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I go till Get ready to approve your payment page")
        thenIGoTillGetReadyToApproveYourPaymentPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I should be able to navigate back to outstanding payment page")
        thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should navigate to Outstanding Payment Page")
        thenIShouldNavigateToX("Outstanding Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
