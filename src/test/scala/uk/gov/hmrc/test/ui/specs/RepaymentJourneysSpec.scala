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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.PaymentStepsSteps.{IProvideRepaymentContactXAsX, IShouldSeeBankAccountErrorMessageXOnTheXElement, andIAccessXPaymentPage, andIEnterNonUKBankAccountDetailsAs, andIEnterUKBankAccountDetailsAs, andINavigateFromContactPageToCYAPage, andIProvideRefundAmountAs, andIProvideRefundReasonAsX, andIProvideValueForXAsX, andISelectRepaymentMethodAsX, givenIAccessRepaymentContactEmailPage, thenTheCharacterLimitTextShouldDisplayX, whenIAccessRepaymentCYAPage, whenIClickChangeLinkForRepaymentX}
//import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps.thenIShouldBeRedirectedTo
//import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps.andIAmOnFeedbackSurveyPage

class RepaymentJourneysSpec extends BaseSpec with Matchers {

  Feature("Repayment Journey") {

    Scenario("1 - Validate error for Non UK bank account details page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I access Non UK payment page")
        andIAccessXPaymentPage("Non UK")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("The Heading should be Bank account details")
        thenTheHeadingShouldBeX("Bank account details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I refresh the page")
        whenIRefreshThePage()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val bankDetailsFromTable: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "HMRC Shipley",
          "bic"               -> "HbuKGb4B",
          "iban"              -> "gb29NWBK60161331926819"
        )
        andIEnterNonUKBankAccountDetailsAs(bankDetailsFromTable)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val invalidBankDetails: Map[String, String] = Map(
          "bankName"          -> "NameOfTheBankMustBe40CharactersOrLessError",
          "nameOnBankAccount" -> "NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen",
          "bic"               -> "HBUKG",
          "iban"              -> "1Z03A1234567890ABCBBH1"
        )
        andIEnterNonUKBankAccountDetailsAs(invalidBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I refresh the page")
        whenIRefreshThePage()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val mixedValidityBankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "HMRC Shipley",
          "bic"               -> "0BCDEF01A1C",
          "iban"              -> "ErrorMessageIBANMustBeUpto34Characters"
        )
        andIEnterNonUKBankAccountDetailsAs(mixedValidityBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
//        andIAmOnFeedbackSurveyPage()

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I access Non UK payment page")
        andIAccessXPaymentPage("Non UK")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
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

      And("I access the non-uk bank account page")
        givenIAccessTheXPage("non-uk bank account")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val partialBankDetails: Map[String, String] = Map(
          "nameOnBankAccount" -> "NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen",
          "bic"               -> "0BCDEF01A1C",
          "iban"              -> "1Z03A1234567890ABCBBH1"
        )
        andIEnterNonUKBankAccountDetailsAs(partialBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Organisation User navigates to repayment pages") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Reason For Refund Page")
        thenIShouldBeOnX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("The character limit text should display You have 8 characters remaining")
        thenTheCharacterLimitTextShouldDisplayX("You have 8 characters remaining")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val validBankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "Test Name",
          "bic"               -> "HBUKGB4B",
          "iban"              -> "GB29NWBK60161331926819"
        )
        andIEnterNonUKBankAccountDetailsAs(validBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        IProvideRepaymentContactXAsX("name","Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
      IProvideRepaymentContactXAsX("email","repayment@email.com")

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Repayment contact phone as 789765423")
        IProvideRepaymentContactXAsX("phone","789765423")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Phone Page")
        thenIShouldBeOnX("Repayment Phone Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Contact Email Page")
        thenIShouldBeOnX("Repayment Contact Email Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I navigate from Contact page to CYA page")
        andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Amount")
        whenIClickChangeLinkForRepaymentX("Amount")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I provide Refund Amount as 1000.00")
        andIProvideRefundAmountAs("1000.00")
      When("I click change link for Repayment Reason")
        whenIClickChangeLinkForRepaymentX("Reason")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Refund Reason as Test Reason")
        andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Bank Name")
        whenIClickChangeLinkForRepaymentX("Bank Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val updatedBankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC2",
          "nameOnBankAccount" -> "Test Name2",
          "bic"               -> "HBUKGB4C",
          "iban"              -> "GB29NWBK60161331926820"
        )

        andIEnterNonUKBankAccountDetailsAs(updatedBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click change link for Repayment Contact Name")
        whenIClickChangeLinkForRepaymentX("Contact Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name change")
        IProvideRepaymentContactXAsX("name","Repayment Contact Name change")

      When("I click change link for Repayment Contact Email")
        whenIClickChangeLinkForRepaymentX("Contact Email")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I provide Repayment contact email as email@change.com")
        IProvideRepaymentContactXAsX("email","email@change.com")

      When("I click change link for Repayment Contact Phone")
        whenIClickChangeLinkForRepaymentX("Contact Phone")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
        val updatedContactAndBankDetails: Map[String, String] = Map(
          "Name of the bank"                 -> "HSBC2",
          "Name on account"                  -> "Test Name2",
          "BIC or SWIFT code"                -> "HBUKGB4C",
          "IBAN"                             -> "GB29NWBK60161331926820",
          "Contact name"                     -> "Repayment Contact Name change",
          "Email address"                    -> "email@change.com",
          "Can we contact by phone?"         -> "No"
        )
        andIShouldSeeDetailsAsBelow(updatedContactAndBankDetails)  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      And("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirect to Repayment processing page")
        thenIShouldBeRedirectToX("Repayment processing page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should be on Repayment Confirmation Page")
        thenIShouldBeOnX("Repayment Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Back to group homepage link")
        andIClickXLink("Back to group homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - Agent User navigates to repayment journey pages") {
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

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 9999.99")
        andIProvideRefundAmountAs("9999.99")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val bankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "Test Name",
          "bic"               -> "HBUKGB4B",
          "iban"              -> "GB29NWBK60161331926819"
        )
        andIEnterNonUKBankAccountDetailsAs(bankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        IProvideRepaymentContactXAsX("name","Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
        IProvideRepaymentContactXAsX("email","repayment@email.com")


      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Repayment contact phone as 789765423")
        IProvideRepaymentContactXAsX("phone","789765423")


      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Phone Page")
        thenIShouldBeOnX("Repayment Phone Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Contact Email Page")
        thenIShouldBeOnX("Repayment Contact Email Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I navigate from Contact page to CYA page")
        andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Amount")
        whenIClickChangeLinkForRepaymentX("Amount")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I provide Refund Amount as 1000.00")
        andIProvideRefundAmountAs("1000.00")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Reason")
        whenIClickChangeLinkForRepaymentX("Reason")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Refund Reason as Test Reason")
        andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Bank Name")
        whenIClickChangeLinkForRepaymentX("Bank Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for Bank Name as HSBC2")
        andIProvideValueForXAsX("Bank Name", "HSBC2")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for Account Name as Test Name2")
        andIProvideValueForXAsX("Account Name", "Test Name2")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for Swift Code as HBUKGB4C")
        andIProvideValueForXAsX("Swift Code", "HBUKGB4C")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for Iban as GB29NWBK60161331926820")
        andIProvideValueForXAsX("Iban", "GB29NWBK60161331926820")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Contact Name")
        whenIClickChangeLinkForRepaymentX("Contact Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name change")
        IProvideRepaymentContactXAsX("name","Repayment Contact Name change")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Contact Email")
        whenIClickChangeLinkForRepaymentX("Contact Email")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I provide Repayment contact email as email@change.com")
        IProvideRepaymentContactXAsX("email","email@change.com")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment Contact Phone")
        whenIClickChangeLinkForRepaymentX("Contact Phone")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
        val summaryDetails: Map[String, String] = Map(
          "Name of the bank"                 -> "HSBC2",
          "Name on account"                  -> "Test Name2",
          "BIC or SWIFT code"                -> "HBUKGB4C",
          "IBAN"                             -> "GB29NWBK60161331926820",
          "Contact name"                     -> "Repayment Contact Name change",
          "Email address"                    -> "email@change.com",
          "Can we contact by phone?"         -> "No"
        )
        andIShouldSeeDetailsAsBelow(summaryDetails)  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide value for UK Bank Name as Natwest")
        andIProvideValueForXAsX("UK Bank Name", "Natwest")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for UK Account Name as Epic Adventure Inc")
        andIProvideValueForXAsX("UK Account Name", "Epic Adventure Inc")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for Sort Code as 206705")
        andIProvideValueForXAsX("Sort Code", "206705")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I provide value for UK Account number as 86473611")
        andIProvideValueForXAsX("UK Account number", "86473611")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to Repayment processing page or Repayment Confirmation Page")
//        thenIShouldBeRedirectedTo("Repayment processing page","Repayment Confirmation Page")

      And("I should be on Repayment Confirmation Page")
        thenIShouldBeOnX("Repayment Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I can see Sign out link")
        thenICanSeeXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Return Error Page")
        thenIShouldBeOnX("Repayment Return Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I can see Sign out link")
        thenICanSeeXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - Agent User navigates to repayment journey pages for UK bank account") {
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

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 999.99")
        andIProvideRefundAmountAs("999.99")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should see bank account error message Enter the name of the bank on the UK Bank Name Element")
        IShouldSeeBankAccountErrorMessageXOnTheXElement("Enter the name of the bank","UK Bank Name")

      When("I refresh the page")
        whenIRefreshThePage()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter UK Bank Account details as:")
      val ukBankDetails: Map[String, String] = Map(
        "bankName"          -> "Natwest",
        "accountHolderName" -> "Epic Adventure Inc",
        "sortCode"          -> "206705",
        "accountNumber"     -> "86473611"
      )
      andIEnterUKBankAccountDetailsAs(ukBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        IProvideRepaymentContactXAsX("name","Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
        IProvideRepaymentContactXAsX("email","repayment@email.com")

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Repayment contact phone as 789765423")
        IProvideRepaymentContactXAsX("phone","789765423")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment UK Bank Name")
        whenIClickChangeLinkForRepaymentX("UK Bank Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I enter UK Bank Account details as:")
        val updatedUkBankDetails: Map[String, String] = Map(
          "bankName"          -> "Natwest Change",
          "accountHolderName" -> "O'Connor Construction",
          "sortCode"          -> "609593",
          "accountNumber"     -> "96863604"
        )
        andIEnterUKBankAccountDetailsAs(updatedUkBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("5 - Organisation User navigates to repayment journey pages for UK bank account") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter UK Bank Account details as:")
        val ukBankDetailsOne: Map[String, String] = Map(
          "bankName"          -> "Natwest",
          "accountHolderName" -> "Epic Adventure Inc",
          "sortCode"          -> "206705",
          "accountNumber"     -> "86473611"
        )
        andIEnterUKBankAccountDetailsAs(ukBankDetailsOne)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        IProvideRepaymentContactXAsX("name","Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
        IProvideRepaymentContactXAsX("email","repayment@email.com")

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Repayment contact phone as 789765423")
        IProvideRepaymentContactXAsX("phone","789765423")

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for Repayment UK Bank Name")
        whenIClickChangeLinkForRepaymentX("UK Bank Name")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I enter UK Bank Account details as:")
        val bankDetailsData: Map[String, String] = Map(
          "bankName"          -> "Natwest Change",
          "accountHolderName" -> "O'Connor Construction",
          "sortCode"          -> "609593",
          "accountNumber"     -> "96863604"
        )
        andIEnterUKBankAccountDetailsAs(bankDetailsData)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val bankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "Test Name",
          "bic"               -> "HBUKGB4C",
          "iban"              -> "GB29NWBK60161331926820"
        )
      andIEnterNonUKBankAccountDetailsAs(bankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

    }

    Scenario("6 - Organisation User navigates to error page when repayment submission API fails to submit data to ETMP") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      And("I provide value for Refund Reason as Test Refund")
        andIProvideValueForXAsX("Refund Reason", "Test Refund")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I access Repayment CYA page")
        whenIAccessRepaymentCYAPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Continue button")
        clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Continue button")
        clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back and complete all the required answers link")
        andIClickXLink("go back and complete all the required answers")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("7 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP") {
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

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      And("I provide value for Refund Reason as Test Refund")
        andIProvideValueForXAsX("Refund Reason", "Test Refund")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I access Repayment CYA page")
        whenIAccessRepaymentCYAPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Continue button")
        clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Continue button")
        clickAction("I click Continue button")

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back and complete all the required answers link")
        andIClickXLink("go back and complete all the required answers")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("8 - Organisation User navigates to journey recovery error page when they try to skip mandatory questions") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      And("I provide Refund Reason as Test Reason")
        andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val internationalBankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "Test Name",
          "bic"               -> "HBUKGB4B",
          "iban"              -> "GB29NWBK60161331926819"
        )
        andIEnterNonUKBankAccountDetailsAs(internationalBankDetails)  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access Repayment contact email page")
        givenIAccessRepaymentContactEmailPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to account homepage link")
        andIClickXLink("Return to account homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("9 - Agent User navigates to journey recovery error page when they try to skip mandatory questions") {
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

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide Refund Amount as 100.00")
        andIProvideRefundAmountAs("100.00")

      And("I provide Refund Reason as Test Reason")
        andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Non UK Bank Account details as:")
        val internationalBankDetails: Map[String, String] = Map(
          "bankName"          -> "HSBC",
          "nameOnBankAccount" -> "Test Name",
          "bic"               -> "HBUKGB4B",
          "iban"              -> "GB29NWBK60161331926819"
        )
        andIEnterNonUKBankAccountDetailsAs(internationalBankDetails)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I access Repayment contact email page")
        givenIAccessRepaymentContactEmailPage()  // auto-chosen (score=1.00, PaymentStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to account homepage link")
        andIClickXLink("Return to account homepage")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
