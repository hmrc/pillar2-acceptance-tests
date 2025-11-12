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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.PaymentStepsSteps.{IProvideRepaymentContactXAsX, IShouldSeeBankAccountErrorMessageXOnTheXElement, andIAccessPaymentPage, andIEnterNonUKBankAccountDetailsAs, andIEnterUKBankAccountDetailsAs, andINavigateFromContactPageToCYAPage, andIProvideRefundAmountAs, andIProvideRefundReasonAsX, andIProvideValueForAs, andISelectRepaymentMethodAs, givenIAccessRepaymentContactEmailPage, thenTheCharacterLimitTextShouldDisplayX, whenIAccessRepaymentCYAPage, whenIClickChangeLinkForRepaymentX}
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps.thenIShouldBeRedirectedTo
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps.andIAmOnFeedbackSurveyPage

class RepaymentJourneysSpec extends BaseSpec with Matchers {

  Feature("Repayment Journey") {

    Scenario("1 - Validate error for Non UK bank account details page",AcceptanceTests) {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I access Non UK payment page")
      andIAccessPaymentPage("Non UK")

      And("The Heading should be Bank account details")
      thenTheHeadingShouldBe("Bank account details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I refresh the page")
      whenIRefreshThePage()

      When("I enter Non UK Bank Account details as:")
      val bankDetailsFromTable: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "HMRC Shipley",
        "bic"               -> "HbuKGb4B",
        "iban"              -> "gb29NWBK60161331926819"
      )
      andIEnterNonUKBankAccountDetailsAs(bankDetailsFromTable)

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I select back link")
      andISelectBackLink()

      When("I enter Non UK Bank Account details as:")
      val invalidBankDetails: Map[String, String] = Map(
        "bankName"          -> "NameOfTheBankMustBe40CharactersOrLessError",
        "nameOnBankAccount" -> "NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen",
        "bic"               -> "HBUKG",
        "iban"              -> "1Z03A1234567890ABCBBH1"
      )
      andIEnterNonUKBankAccountDetailsAs(invalidBankDetails)

      When("I refresh the page")
      whenIRefreshThePage()

      When("I enter Non UK Bank Account details as:")
      val mixedValidityBankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "HMRC Shipley",
        "bic"               -> "0BCDEF01A1C",
        "iban"              -> "ErrorMessageIBANMustBeUpto34Characters"
      )
      andIEnterNonUKBankAccountDetailsAs(mixedValidityBankDetails)

      When("I click Sign out link")
      andIClickLink("Sign out")

      Then("I am on feedback survey page")
      andIAmOnFeedbackSurveyPage()

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      )

      And("I access Non UK payment page")
      andIAccessPaymentPage("Non UK")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      When("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
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

      And("I access the non-uk bank account page")
      givenIAccessThePage("non-uk bank account")

      When("I enter Non UK Bank Account details as:")
      val partialBankDetails: Map[String, String] = Map(
        "nameOnBankAccount" -> "NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen",
        "bic"               -> "0BCDEF01A1C",
        "iban"              -> "1Z03A1234567890ABCBBH1"
      )
      andIEnterNonUKBankAccountDetailsAs(partialBankDetails)

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("2 - Organisation User navigates to repayment pages",AcceptanceTests, ZapAccessibility) {
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

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should navigate to Repayment Amount Page")
      thenIShouldNavigateTo("Repayment Amount Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Reason For Refund Page")
      thenIShouldBeOn("Reason For Refund Page")

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
      andIProvideValueForAs(
        "Refund Reason",
        "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content."
      )

      And("The character limit text should display You have 8 characters remaining")
      thenTheCharacterLimitTextShouldDisplayX("You have 8 characters remaining")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select repayment method as UK bank account")
      andISelectRepaymentMethodAs("UK bank account")

      Then("I should navigate to UK Bank Account Payment Page")
      thenIShouldNavigateTo("UK Bank Account Payment Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Method Page")
      thenIShouldBeOn("Repayment Method Page")

      When("I select repayment method as Non-UK bank account")
      andISelectRepaymentMethodAs("Non-UK bank account")

      Then("I should be on Non UK Bank Account Payment Page")
      thenIShouldBeOn("Non UK Bank Account Payment Page")

      When("I enter Non UK Bank Account details as:")
      val validBankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "Test Name",
        "bic"               -> "HBUKGB4B",
        "iban"              -> "GB29NWBK60161331926819"
      )
      andIEnterNonUKBankAccountDetailsAs(validBankDetails)

      And("I provide Repayment contact name as Repayment Contact Name")
      IProvideRepaymentContactXAsX("name", "Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
      IProvideRepaymentContactXAsX("email", "repayment@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide Repayment contact phone as 789765423")
      IProvideRepaymentContactXAsX("phone", "789765423")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Phone Input Page")
      thenIShouldBeOn("Repayment Phone Input Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Phone Page")
      thenIShouldBeOn("Repayment Phone Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Contact Email Page")
      thenIShouldBeOn("Repayment Contact Email Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I navigate from Contact page to CYA page")
      andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Amount")
      whenIClickChangeLinkForRepaymentX("Amount")

      When("I provide Refund Amount as 1000.00")
      andIProvideRefundAmountAs("1000.00")
      When("I click change link for Repayment Reason")
      whenIClickChangeLinkForRepaymentX("Reason")

      And("I provide Refund Reason as Test Reason")
      andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Bank Name")
      whenIClickChangeLinkForRepaymentX("Bank Name")

      When("I enter Non UK Bank Account details as:")
      val updatedBankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC2",
        "nameOnBankAccount" -> "Test Name2",
        "bic"               -> "HBUKGB4C",
        "iban"              -> "GB29NWBK60161331926820"
      )

      andIEnterNonUKBankAccountDetailsAs(updatedBankDetails)

      When("I click change link for Repayment Contact Name")
      whenIClickChangeLinkForRepaymentX("Contact Name")

      And("I provide Repayment contact name as Repayment Contact Name change")
      IProvideRepaymentContactXAsX("name", "Repayment Contact Name change")

      When("I click change link for Repayment Contact Email")
      whenIClickChangeLinkForRepaymentX("Contact Email")

      When("I provide Repayment contact email as email@change.com")
      IProvideRepaymentContactXAsX("email", "email@change.com")

      When("I click change link for Repayment Contact Phone")
      whenIClickChangeLinkForRepaymentX("Contact Phone")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      And("I should see details as below:")
      val updatedContactAndBankDetails: Map[String, String] = Map(
        "Name of the bank"         -> "HSBC2",
        "Name on account"          -> "Test Name2",
        "BIC or SWIFT code"        -> "HBUKGB4C",
        "IBAN"                     -> "GB29NWBK60161331926820",
        "Contact name"             -> "Repayment Contact Name change",
        "Email address"            -> "email@change.com",
        "Can we contact by phone?" -> "No"
      )
      andIShouldSeeDetailsAsBelow(updatedContactAndBankDetails)

      And("I can see Print this page link")
      thenICanSeeLink("Print this page")

      When("I click change link for Repayment UK Bank Method")
      whenIClickChangeLinkForRepaymentX("UK Bank Method")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirect to Repayment processing page")
      thenIShouldBeRedirectTo("Repayment processing page")

      And("I should be on Repayment Confirmation Page")
      thenIShouldBeOn("Repayment Confirmation Page")

      And("I can see Print this page link")
      thenICanSeeLink("Print this page")

      When("I click Back to group homepage link")
      andIClickLink("Back to group homepage")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("3 - Agent User navigates to repayment journey pages",AcceptanceTests, ZapAccessibility) {
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

      When("I provide Refund Amount as 9999.99")
      andIProvideRefundAmountAs("9999.99")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
      andIProvideValueForAs(
        "Refund Reason",
        "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content."
      )

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      And("I select repayment method as UK bank account")
      andISelectRepaymentMethodAs("UK bank account")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on UK Bank Account Payment Page")
      thenIShouldBeOn("UK Bank Account Payment Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      When("I select repayment method as Non-UK bank account")
      andISelectRepaymentMethodAs("Non-UK bank account")

      When("I enter Non UK Bank Account details as:")
      val bankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "Test Name",
        "bic"               -> "HBUKGB4B",
        "iban"              -> "GB29NWBK60161331926819"
      )
      andIEnterNonUKBankAccountDetailsAs(bankDetails)

      And("I provide Repayment contact name as Repayment Contact Name")
      IProvideRepaymentContactXAsX("name", "Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
      IProvideRepaymentContactXAsX("email", "repayment@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide Repayment contact phone as 789765423")
      IProvideRepaymentContactXAsX("phone", "789765423")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Phone Input Page")
      thenIShouldBeOn("Repayment Phone Input Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Phone Input Page")
      thenIShouldBeOn("Repayment Phone Input Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Phone Page")
      thenIShouldBeOn("Repayment Phone Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Contact Email Page")
      thenIShouldBeOn("Repayment Contact Email Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I navigate from Contact page to CYA page")
      andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Amount")
      whenIClickChangeLinkForRepaymentX("Amount")

      When("I provide Refund Amount as 1000.00")
      andIProvideRefundAmountAs("1000.00")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Reason")
      whenIClickChangeLinkForRepaymentX("Reason")

      And("I provide Refund Reason as Test Reason")
      andIProvideRefundReasonAsX("Test Reason")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Bank Name")
      whenIClickChangeLinkForRepaymentX("Bank Name")

      And("I provide value for Bank Name as HSBC2")
      andIProvideValueForAs("Bank Name", "HSBC2")

      And("I provide value for Account Name as Test Name2")
      andIProvideValueForAs("Account Name", "Test Name2")

      And("I provide value for Swift Code as HBUKGB4C")
      andIProvideValueForAs("Swift Code", "HBUKGB4C")

      And("I provide value for Iban as GB29NWBK60161331926820")
      andIProvideValueForAs("Iban", "GB29NWBK60161331926820")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Contact Name")
      whenIClickChangeLinkForRepaymentX("Contact Name")

      And("I provide Repayment contact name as Repayment Contact Name change")
      IProvideRepaymentContactXAsX("name", "Repayment Contact Name change")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Contact Email")
      whenIClickChangeLinkForRepaymentX("Contact Email")

      When("I provide Repayment contact email as email@change.com")
      IProvideRepaymentContactXAsX("email", "email@change.com")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment Contact Phone")
      whenIClickChangeLinkForRepaymentX("Contact Phone")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      And("I should see details as below:")
      val summaryDetails: Map[String, String] = Map(
        "Name of the bank"         -> "HSBC2",
        "Name on account"          -> "Test Name2",
        "BIC or SWIFT code"        -> "HBUKGB4C",
        "IBAN"                     -> "GB29NWBK60161331926820",
        "Contact name"             -> "Repayment Contact Name change",
        "Email address"            -> "email@change.com",
        "Can we contact by phone?" -> "No"
      )
      andIShouldSeeDetailsAsBelow(summaryDetails)

      When("I click change link for Repayment UK Bank Method")
      whenIClickChangeLinkForRepaymentX("UK Bank Method")

      When("I select repayment method as UK bank account")
      andISelectRepaymentMethodAs("UK bank account")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide value for UK Bank Name as Natwest")
      andIProvideValueForAs("UK Bank Name", "Natwest")

      And("I provide value for UK Account Name as Epic Adventure Inc")
      andIProvideValueForAs("UK Account Name", "Epic Adventure Inc")

      And("I provide value for Sort Code as 206705")
      andIProvideValueForAs("Sort Code", "206705")

      And("I provide value for UK Account number as 86473611")
      andIProvideValueForAs("UK Account number", "86473611")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I can see Print this page link")
      thenICanSeeLink("Print this page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to Repayment processing page or Repayment Confirmation Page")
      thenIShouldBeRedirectedTo("Repayment processing page", "Repayment Confirmation Page")

      And("I should be on Repayment Confirmation Page")
      thenIShouldBeOn("Repayment Confirmation Page")

      Then("I can see Sign out link")
      thenICanSeeLink("Sign out")

      And("I can see Print this page link")
      thenICanSeeLink("Print this page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Repayment Return Error Page")
      thenIShouldBeOn("Repayment Return Error Page")

      Then("I can see Sign out link")
      thenICanSeeLink("Sign out")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      And("I click report and manage your Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("4 - Agent User navigates to repayment journey pages for UK bank account",AcceptanceTests, ZapAccessibility) {
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

      When("I click Request a repayment link")
      andIClickLink("Request a repayment")

      Then("I should navigate to Repayment Guidance Page")
      thenIShouldNavigateTo("Repayment Guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Amount Page")
      thenIShouldNavigateTo("Repayment Amount Page")

      When("I provide Refund Amount as 999.99")
      andIProvideRefundAmountAs("999.99")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
      andIProvideValueForAs(
        "Refund Reason",
        "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content."
      )

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      And("I select repayment method as UK bank account")
      andISelectRepaymentMethodAs("UK bank account")

      Then("I should be on UK Bank Account Payment Page")
      thenIShouldBeOn("UK Bank Account Payment Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on UK Bank Account Payment Page")
      thenIShouldBeOn("UK Bank Account Payment Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should see bank account error message Enter the name of the bank on the UK Bank Name Element")
      IShouldSeeBankAccountErrorMessageXOnTheXElement("Enter the name of the bank", "UK Bank Name")

      When("I refresh the page")
      whenIRefreshThePage()

      When("I enter UK Bank Account details as:")
      val ukBankDetails: Map[String, String] = Map(
        "bankName"          -> "Natwest",
        "accountHolderName" -> "Epic Adventure Inc",
        "sortCode"          -> "206705",
        "accountNumber"     -> "86473611"
      )
      andIEnterUKBankAccountDetailsAs(ukBankDetails)

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I select back link")
      andISelectBackLink()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide Repayment contact name as Repayment Contact Name")
      IProvideRepaymentContactXAsX("name", "Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
      IProvideRepaymentContactXAsX("email", "repayment@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide Repayment contact phone as 789765423")
      IProvideRepaymentContactXAsX("phone", "789765423")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment UK Bank Name")
      whenIClickChangeLinkForRepaymentX("UK Bank Name")

      When("I enter UK Bank Account details as:")
      val updatedUkBankDetails: Map[String, String] = Map(
        "bankName"          -> "Natwest Change",
        "accountHolderName" -> "O'Connor Construction",
        "sortCode"          -> "609593",
        "accountNumber"     -> "96863604"
      )
      andIEnterUKBankAccountDetailsAs(updatedUkBankDetails)

      When("I click change link for Repayment UK Bank Method")
      whenIClickChangeLinkForRepaymentX("UK Bank Method")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      And("I select back link")
      andISelectBackLink()

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("I should navigate to Dashboard page")
      thenIShouldNavigateTo("Dashboard page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("5 - Organisation User navigates to repayment journey pages for UK bank account",AcceptanceTests, ZapAccessibility) {
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

      Then("I should navigate to Reason For Refund Page")
      thenIShouldNavigateTo("Reason For Refund Page")

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
      andIProvideValueForAs(
        "Refund Reason",
        "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content."
      )

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Repayment Method Page")
      thenIShouldNavigateTo("Repayment Method Page")

      And("I select repayment method as UK bank account")
      andISelectRepaymentMethodAs("UK bank account")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UK Bank Account Payment Page")
      thenIShouldNavigateTo("UK Bank Account Payment Page")

      When("I enter UK Bank Account details as:")
      val ukBankDetailsOne: Map[String, String] = Map(
        "bankName"          -> "Natwest",
        "accountHolderName" -> "Epic Adventure Inc",
        "sortCode"          -> "206705",
        "accountNumber"     -> "86473611"
      )
      andIEnterUKBankAccountDetailsAs(ukBankDetailsOne)

      Then("I should be on Repayment Contact Page")
      thenIShouldBeOn("Repayment Contact Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to UK Bank Account Payment Page")
      thenIShouldNavigateTo("UK Bank Account Payment Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide Repayment contact name as Repayment Contact Name")
      IProvideRepaymentContactXAsX("name", "Repayment Contact Name")

      When("I provide Repayment contact email as repayment@email.com")
      IProvideRepaymentContactXAsX("email", "repayment@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide Repayment contact phone as 789765423")
      IProvideRepaymentContactXAsX("phone", "789765423")

      Then("I should be on Repayment CYA Page")
      thenIShouldBeOn("Repayment CYA Page")

      When("I click change link for Repayment UK Bank Name")
      whenIClickChangeLinkForRepaymentX("UK Bank Name")

      When("I enter UK Bank Account details as:")
      val bankDetailsData: Map[String, String] = Map(
        "bankName"          -> "Natwest Change",
        "accountHolderName" -> "O'Connor Construction",
        "sortCode"          -> "609593",
        "accountNumber"     -> "96863604"
      )
      andIEnterUKBankAccountDetailsAs(bankDetailsData)

      When("I click change link for Repayment UK Bank Method")
      whenIClickChangeLinkForRepaymentX("UK Bank Method")

      When("I select repayment method as Non-UK bank account")
      andISelectRepaymentMethodAs("Non-UK bank account")

      When("I enter Non UK Bank Account details as:")
      val bankDetails: Map[String, String] = Map(
        "bankName"          -> "HSBC",
        "nameOnBankAccount" -> "Test Name",
        "bic"               -> "HBUKGB4C",
        "iban"              -> "GB29NWBK60161331926820"
      )
      andIEnterNonUKBankAccountDetailsAs(bankDetails)

    }

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