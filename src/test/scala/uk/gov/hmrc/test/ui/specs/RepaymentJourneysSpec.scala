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
import uk.gov.hmrc.test.ui.specsdef.PaymentStepsSteps.{IProvideRepaymentContactXAsX, IShouldSeeBankAccountErrorMessageXOnTheXElement, andIAccessPaymentPage, andIEnterNonUKBankAccountDetailsAs, andIEnterUKBankAccountDetailsAs, andINavigateFromContactPageToCYAPage, andIProvideRefundAmountAs, andIProvideRefundReasonAsX, andIProvideValueForAs, andISelectRepaymentMethodAs, givenIAccessRepaymentContactEmailPage, thenTheCharacterLimitTextShouldDisplayX, whenIAccessRepaymentCYAPage, whenIClickChangeLinkForRepaymentX}
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.andIAmOnFeedbackSurveyPage

class RepaymentJourneysSpec extends BaseSpec with Matchers {

  Feature("Repayment Journey") {



    Scenario("6 - Organisation User navigates to error page when repayment submission API fails to submit data to ETMP",AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345676"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Request a repayment link")
      andIClickLink("Request a repayment")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Amount Page")
      thenIShouldNavigateTo("Repayment Amount Page")

      When("I provide Refund Amount as 100.00")
      andIProvideRefundAmountAs("100.00")

      And("I provide value for Refund Reason as Test Refund")
      andIProvideValueForAs("Refund Reason", "Test Refund")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I access Repayment CYA page")
      whenIAccessRepaymentCYAPage()

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click Continue button")
      clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click Continue button")
      clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I click go back and complete all the required answers link")
      andIClickLink("go back and complete all the required answers")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

    }

    Scenario("7 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP",AcceptanceTests, ZapAccessibility) {
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

      When("I click Request a repayment link")
      andIClickLink("Request a repayment")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Amount Page")
      thenIShouldNavigateTo("Repayment Amount Page")

      When("I provide Refund Amount as 100.00")
      andIProvideRefundAmountAs("100.00")

      And("I provide value for Refund Reason as Test Refund")
      andIProvideValueForAs("Refund Reason", "Test Refund")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I access Repayment CYA page")
      whenIAccessRepaymentCYAPage()

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click Continue button")
      clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click Continue button")
      clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
      thenIShouldBeOn("Repayment Incomplete Error Page")

      When("I click go back and complete all the required answers link")
      andIClickLink("go back and complete all the required answers")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

    }

    Scenario("8 - Organisation User navigates to journey recovery error page when they try to skip mandatory questions") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345676"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click Request a repayment link")
      andIClickLink("Request a repayment")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide Refund Amount as 100.00")
      andIProvideRefundAmountAs("100.00")

      And("I provide Refund Reason as Test Reason")
      andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment Method Page")
      thenIShouldBeOn("Repayment Method Page")

      When("I select repayment method as Non-UK bank account")
      andISelectRepaymentMethodAs("Non-UK bank account")

      Then("I should be on Non UK Bank Account Payment Page")
      thenIShouldBeOn("Non UK Bank Account Payment Page")

      When("I enter Non UK Bank Account details as:")
      val internationalBankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "Test Name",
        "bic"               -> "HBUKGB4B",
        "iban"              -> "GB29NWBK60161331926819"
      )
      andIEnterNonUKBankAccountDetailsAs(internationalBankDetails)

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I access Repayment contact email page")
      givenIAccessRepaymentContactEmailPage()

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      When("I click Return to account homepage link")
      andIClickLink("Return to account homepage")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

    }

    Scenario("9 - Agent User navigates to journey recovery error page when they try to skip mandatory questions") {
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

      When("I click Request a repayment link")
      andIClickLink("Request a repayment")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide Refund Amount as 100.00")
      andIProvideRefundAmountAs("100.00")

      And("I provide Refund Reason as Test Reason")
      andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment Method Page")
      thenIShouldBeOn("Repayment Method Page")

      When("I select repayment method as Non-UK bank account")
      andISelectRepaymentMethodAs("Non-UK bank account")

      Then("I should be on Non UK Bank Account Payment Page")
      thenIShouldBeOn("Non UK Bank Account Payment Page")

      When("I enter Non UK Bank Account details as:")
      val internationalBankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "Test Name",
        "bic"               -> "HBUKGB4B",
        "iban"              -> "GB29NWBK60161331926819"
      )
      andIEnterNonUKBankAccountDetailsAs(internationalBankDetails)

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I access Repayment contact email page")
      givenIAccessRepaymentContactEmailPage()

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Journey Recovery Error Page")
      thenIShouldBeOn("Repayment Journey Recovery Error Page")

      When("I click Return to account homepage link")
      andIClickLink("Return to account homepage")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")
    }
  }
}