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

package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers

import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.ASASteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CYASteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class DashboardPage extends AnyFeatureSpec with Matchers {

  Feature("Dashboard Page") {

    Scenario("1 - User navigates to Dashboard page and validates the links") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link")
        andIClickXLink("Refer to the Pillar 2 Top-up Taxes manual (opens in new tab)")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be navigated to new tab")
        thenIShouldBeNavigatedToNewTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should be on Draft guidance page")
        thenIShouldBeOnX("Draft guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I close new tab")
        thenICloseNewTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should navigate back to main tab")
        thenIShouldNavigateBackToMainTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Make a payment link")
        andIClickXLink("Make a payment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Make a payment link")
        andIClickXLink("Make a payment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View and amend contact details link")
        andIClickXLink("View and amend contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View and amend group details link")
        andIClickXLink("View and amend group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link")
        andIClickXLink("Refer to the Pillar 2 Top-up Taxes manual (opens in new tab)")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be navigated to new tab")
        thenIShouldBeNavigatedToNewTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should be on Draft guidance page")
        thenIShouldBeOnX("Draft guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I close new tab")
        thenICloseNewTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should navigate back to main tab")
        thenIShouldNavigateBackToMainTab()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

    }

    Scenario("2 - User navigates to group details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View and amend group details link")
        andIClickXLink("View and amend group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change hyperlink next to the FD Group Status")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to accounts summary page")
        thenIShouldNavigateToX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change hyperlink next to the Accounting Period")
        andIClickXLink("")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIClickOnChangeHyperlinkNextToTheX() [1.00] (CYASteps.scala) pattern: I click on change hyperlink next to the (.*)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be redirected to Manage Account processing Page or Dashboard page")
        // ⚠️ No step-def match found for: I should be redirected to Manage Account processing Page or Dashboard page

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - User navigates to amend contact details page and validates the data") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View and amend contact details link")
        andIClickXLink("View and amend contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Contact Name as Contact Name Test #")
        andIEnterXAsX("Contact Name", "Contact Name Test #")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Email address")
        andIClickOnChangeLinkForX("Email address")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Contact Email as contact*@email.com")
        andIEnterXAsX("Contact Email", "contact*@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Phone number")
        andIClickOnChangeLinkForX("Phone number")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Phone Number as 123456789")
        andIEnterXAsX("Phone Number", "123456789")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Do you have a second contact?")
        andIClickOnChangeLinkForX("Do you have a second contact?")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I click on change link for Do you have a second contact?")
        andIClickOnChangeLinkForX("Do you have a second contact?")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Second Contact Name as Second Contact £ Name Test")
        andIEnterXAsX("Second Contact Name", "Second Contact £ Name Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Second Contact Email as second&Contact@email.com")
        andIEnterXAsX("Second Contact Email", "second&Contact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Second Contact Input as 1234554878")
        andIEnterXAsX("Second Contact Input", "1234554878")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Dashboard Address")
        andIClickOnChangeLinkForX("Dashboard Address")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Address Line 1 as Test Address Line 1")
        andIEnterXAsX("Address Line 1", "Test Address Line 1")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address Line 2 as Test Address Line 2")
        andIEnterXAsX("Address Line 2", "Test Address Line 2")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter City as Test City")
        andIEnterXAsX("City", "Test City")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Region as Test Region")
        andIEnterXAsX("Region", "Test Region")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I enter Postal Code as EH5 5WY")
        andIEnterXAsX("Postal Code", "EH5 5WY")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be redirected to Manage Contact processing Page or Dashboard page")
        // ⚠️ No step-def match found for: I should be redirected to Manage Contact processing Page or Dashboard page

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to amend subscription API") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View and amend contact details link")
        andIClickXLink("View and amend contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Contact Name as 400")
        andIEnterXAsX("Contact Name", "400")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to contact details summary page")
        thenIShouldNavigateToX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Subscription API error page")
        thenIShouldBeOnX("Subscription API error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to your account homepage to try again link")
        andIClickXLink("Return to your account homepage to try again")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - Verify Transaction History pages for Org user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0000000122 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0000000122")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Next CTA")
        whenIClickXCTA("Next")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Second Page")
        thenIShouldBeOnX("Transaction History Second Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Previous CTA")
        whenIClickXCTA("Previous")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4040000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4040000000")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Empty Page")
        thenIShouldBeOnX("Transaction History Empty Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Empty Page")
        thenIShouldBeOnX("Transaction History Empty Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR4000000000")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to your account homepage link")
        andIClickXLink("Return to your account homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Error Page")
        thenIShouldBeOnX("Transaction History Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR6666666666 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR6666666666")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555551111 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555551111")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click View your transaction history link")
        andIClickXLink("View your transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=contact details summary, page=contact details summary page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the contact details summary page")
        givenIAccessTheXPage("contact details summary")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the contact details summary page")
        givenIAccessTheXPage("contact details summary")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on contact details summary page")
        thenIShouldBeOnX("contact details summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=account summary, page=accounts summary page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the account summary page")
        givenIAccessTheXPage("account summary")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the account summary page")
        givenIAccessTheXPage("account summary")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on accounts summary page")
        thenIShouldBeOnX("accounts summary page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=MakePayment, page=Make a payment page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the MakePayment page")
        givenIAccessTheXPage("MakePayment")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAccessXPaymentPage() [0.86] (PaymentSteps.scala) pattern: I access (.*) payment page

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the MakePayment page")
        givenIAccessTheXPage("MakePayment")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAccessXPaymentPage() [0.86] (PaymentSteps.scala) pattern: I access (.*) payment page

      Then("I should be on Make a payment page")
        thenIShouldBeOnX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment guidance, page=Repayment Guidance Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment guidance page")
        givenIAccessTheXPage("repayment guidance")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment guidance page")
        givenIAccessTheXPage("repayment guidance")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Guidance Page")
        thenIShouldBeOnX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment amount, page=Repayment Amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment amount page")
        givenIAccessTheXPage("repayment amount")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment amount page")
        givenIAccessTheXPage("repayment amount")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Amount Page")
        thenIShouldBeOnX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment reason, page=Reason For Refund Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment reason page")
        givenIAccessTheXPage("repayment reason")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment reason page")
        givenIAccessTheXPage("repayment reason")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Reason For Refund Page")
        thenIShouldBeOnX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment method, page=Repayment Method Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment method page")
        givenIAccessTheXPage("repayment method")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment method page")
        givenIAccessTheXPage("repayment method")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=uk bank account, page=UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the uk bank account page")
        givenIAccessTheXPage("uk bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the uk bank account page")
        givenIAccessTheXPage("uk bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=non-uk bank account, page=Non UK Bank Account Payment Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the non-uk bank account page")
        givenIAccessTheXPage("non-uk bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the non-uk bank account page")
        givenIAccessTheXPage("non-uk bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact name, page=Repayment Contact Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment contact name page")
        givenIAccessTheXPage("repayment contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment contact name page")
        givenIAccessTheXPage("repayment contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment contact email, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment contact email page")
        givenIAccessTheXPage("repayment contact email")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment contact email page")
        givenIAccessTheXPage("repayment contact email")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment phone page")
        givenIAccessTheXPage("repayment phone")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment phone page")
        givenIAccessTheXPage("repayment phone")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment phone input, page=Repayment Journey Recovery Error Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment phone input page")
        givenIAccessTheXPage("repayment phone input")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment phone input page")
        givenIAccessTheXPage("repayment phone input")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment CYA, page=Repayment CYA Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment CYA page")
        givenIAccessTheXPage("repayment CYA")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment CYA page")
        givenIAccessTheXPage("repayment CYA")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change amount, page=Repayment change amount Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change amount page")
        givenIAccessTheXPage("repayment change amount")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change amount page")
        givenIAccessTheXPage("repayment change amount")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment change amount Page")
        thenIShouldBeOnX("Repayment change amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change method, page=Repayment change method Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change method page")
        givenIAccessTheXPage("repayment change method")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change method page")
        givenIAccessTheXPage("repayment change method")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment change method Page")
        thenIShouldBeOnX("Repayment change method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=repayment change name, page=Repayment change name Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change name page")
        givenIAccessTheXPage("repayment change name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the repayment change name page")
        givenIAccessTheXPage("repayment change name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment change name Page")
        thenIShouldBeOnX("Repayment change name Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=transaction history, page=Transaction History Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the transaction history page")
        givenIAccessTheXPage("transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the transaction history page")
        givenIAccessTheXPage("transaction history")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Transaction History Page")
        thenIShouldBeOnX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact name, page=Manage contact name Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage contact name page")
        givenIAccessTheXPage("manage contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage contact name page")
        givenIAccessTheXPage("manage contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Manage contact name Page")
        thenIShouldBeOnX("Manage contact name Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage second contact name, page=Manage second contact name]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage second contact name page")
        givenIAccessTheXPage("manage second contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage second contact name page")
        givenIAccessTheXPage("manage second contact name")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Manage second contact name")
        thenIShouldBeOnX("Manage second contact name")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage contact address, page=Manage contact address Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage contact address page")
        givenIAccessTheXPage("manage contact address")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage contact address page")
        givenIAccessTheXPage("manage contact address")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Manage contact address Page")
        thenIShouldBeOnX("Manage contact address Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage group status, page=Manage group status Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage group status page")
        givenIAccessTheXPage("manage group status")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage group status page")
        givenIAccessTheXPage("manage group status")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Manage group status Page")
        thenIShouldBeOnX("Manage group status Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("6 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages [page name=manage accounting period, page=Manage accounting period Page]") {
      Given("Organisation User logs in to register for Pillar2")
        givenXLogsInToRegisterForPillar2("Organisation User")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage accounting period page")
        givenIAccessTheXPage("manage accounting period")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Unauthorised Page")
        thenIShouldBeOnX("Unauthorised Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access the manage accounting period page")
        givenIAccessTheXPage("manage accounting period")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Manage accounting period Page")
        thenIShouldBeOnX("Manage accounting period Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("7 - Make successful payment as Organisation user") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Make a payment link")
        andIClickXLink("Make a payment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I make successful payment")
        thenIMakeSuccessfulPayment()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should navigate to Transaction History Page")
        thenIShouldNavigateToX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("8 - Make successful payment as Agent") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Make a payment link")
        andIClickXLink("Make a payment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I make successful payment")
        thenIMakeSuccessfulPayment()  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I should navigate to Transaction History Page")
        thenIShouldNavigateToX("Transaction History Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("9 - Back journey from Get ready to approve your payment page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Make a payment link")
        andIClickXLink("Make a payment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I go till Get ready to approve your payment page")
        thenIGoTillGetReadyToApproveYourPaymentPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be able to navigate back to make a payment page")
        thenIShouldBeAbleToNavigateBackToMakeAPaymentPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should navigate to Make a payment page")
        thenIShouldNavigateToX("Make a payment page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
