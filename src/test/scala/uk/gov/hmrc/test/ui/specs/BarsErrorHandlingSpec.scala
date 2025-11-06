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

///*
// * Copyright 2025 HM Revenue & Customs
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package uk.gov.hmrc.test.ui.specs
//
//import org.scalatest.matchers.should.Matchers
//import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
//import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
//import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
//import uk.gov.hmrc.test.ui.specstepdef.PaymentStepsSteps.{andIAccessPaymentPage, andIEnterUKBankAccountDetailsAs, andIProvideRefundAmountAs, andIProvideValueForAs, andISelectOptionOnPartialNameErrorPage, andISelectRepaymentMethodAs}
//
//
//class BarsErrorHandlingSpec extends BaseSpec with Matchers {
//
//  Feature("Bars Handling") {
//
//    Scenario("1 - Organisation User bars integration validation") {
//      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
//        whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonStepsSteps.scala)
//
//      Then("I should be on Dashboard page")
//        thenIShouldBeOn("Dashboard page")
//
//      When("I click Request a repayment link")
//        andIClickLink("Request a repayment")
//
//      When("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      When("I provide Refund Amount as 100.00")
//        andIProvideRefundAmountAs("100.00")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should be on Reason For Refund Page")
//        thenIShouldBeOn("Reason For Refund Page")
//
//      When("I provide value for Refund Reason as Bars Integration Test")
//        andIProvideValueForAs("Refund Reason", "Bars Integration Test")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Repayment Method Page")
//        thenIShouldNavigateTo("Repayment Method Page")
//
//      And("I select repayment method as UK bank account")
//        andISelectRepaymentMethodAs("UK bank account")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsOneData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Eco Focus",
//          "sortCode"          -> "206705",
//          "accountNumber"     -> "56945688"
//        )
//
//        andIEnterUKBankAccountDetailsAs(bankDetailsOneData)
//
//      Then("I should be on Repayment Could Not Confirm Error Page")
//        thenIShouldBeOn("Repayment Could Not Confirm Error Page")
//
//      When("I click return to your bank details and try again link")
//        andIClickLink("return to your bank details and try again")
//
//      Then("I should be on UK Bank Account Payment Page")
//        thenIShouldBeOn("UK Bank Account Payment Page")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsTwoData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Innovation Arch",
//          "sortCode"          -> "206705",
//          "accountNumber"     -> "56523611"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsTwoData)
//
//      Then("I should be on Repayment Bank Details Error Page")
//        thenIShouldBeOn("Repayment Bank Details Error Page")
//
//      When("I click try again with a different business bank account link")
//        andIClickLink("try again with a different business bank account")
//
//      Then("I should be on UK Bank Account Payment Page")
//        thenIShouldBeOn("UK Bank Account Payment Page")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsThreeData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Flux Water Gear",
//          "sortCode"          -> "207102",
//          "accountNumber"     -> "86473611"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsThreeData)
//
//      Then("I should be on Repayment Bars Error Page")
//        thenIShouldBeOn("Repayment Bars Error Page")
//
//      When("I click Return to your account homepage link")
//        andIClickLink("Return to your account homepage")
//
//      Then("I should be on Dashboard page")
//        thenIShouldBeOn("Dashboard page")
//
//      When("I access UK payment page")
//        andIAccessPaymentPage("UK")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsFourData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Epic",
//          "sortCode"          -> "206705",
//          "accountNumber"     -> "86473611"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsFourData)
//
//      Then("I should be on Repayment Partial Name Error Page")
//        thenIShouldBeOn("Repayment Partial Name Error Page")
//
//      When("I select option Yes on partial name error page")
//        andISelectOptionOnPartialNameErrorPage("Yes")
//
//      Then("I should be on Repayment Contact Page")
//        thenIShouldBeOn("Repayment Contact Page")
//
//      When("I select back link")
//        andISelectBackLink()
//
//      And("I select option No on partial name error page")
//        andISelectOptionOnPartialNameErrorPage("No")
//
//      Then("I should be on UK Bank Account Payment Page")
//        thenIShouldBeOn("UK Bank Account Payment Page")
//    }
//
//    Scenario("2 - Agent User bars integration validation") {
//      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
//        whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")
//
//      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
//        whenIAddDelegatedEnrolmentWithAndForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")
//
//      Then("I should be on ASA Pillar2 Input Page")
//        thenIShouldBeOn("ASA Pillar2 Input Page")
//
//      And("I provide ASA Pillar2 ID as XMPLR0012345674")
//        andIProvideASAAs("Pillar2 ID", "XMPLR0012345674")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to ASA Confirmation Page")
//        thenIShouldNavigateTo("ASA Confirmation Page")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Dashboard page")
//        thenIShouldNavigateTo("Dashboard page")
//
//      When("I click Request a repayment link")
//        andIClickLink("Request a repayment")
//
//      When("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      When("I provide Refund Amount as 100.00")
//        andIProvideRefundAmountAs("100.00")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should be on Reason For Refund Page")
//        thenIShouldBeOn("Reason For Refund Page")
//
//      When("I provide value for Refund Reason as Bars Integration Test")
//        andIProvideValueForAs("Refund Reason", "Bars Integration Test")
//
//      And("I click on Continue button")
//        whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Repayment Method Page")
//        thenIShouldNavigateTo("Repayment Method Page")
//
//      And("I select repayment method as UK bank account")
//        andISelectRepaymentMethodAs("UK bank account")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsFiveData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Eco Focus",
//          "sortCode"          -> "206705",
//          "accountNumber"     -> "56945688"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsFiveData)
//
//      Then("I should be on Repayment Could Not Confirm Error Page")
//        thenIShouldBeOn("Repayment Could Not Confirm Error Page")
//
//      When("I click return to your bank details and try again link")
//        andIClickLink("return to your bank details and try again")
//
//      When("I enter UK Bank Account details as:")
//      val bankDetailsSixData: Map[String, String] = Map(
//        "bankName"          -> "Test",
//        "accountHolderName" -> "Innovation Arch",
//        "sortCode"          -> "206705",
//        "accountNumber"     -> "56523611"
//      )
//        andIEnterUKBankAccountDetailsAs(bankDetailsSixData)
//
//      Then("I should be on Repayment Bank Details Error Page")
//        thenIShouldBeOn("Repayment Bank Details Error Page")
//
//      When("I click try again with a different business bank account link")
//        andIClickLink("try again with a different business bank account")
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsSevenData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Flux Water Gear",
//          "sortCode"          -> "207102",
//          "accountNumber"     -> "86473611"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsSevenData)
//
//      Then("I should be on Repayment Bars Error Page")
//        thenIShouldBeOn("Repayment Bars Error Page")
//
//      When("I click Return to your account homepage link")
//        andIClickLink("Return to your account homepage")
//
//      Then("I should be on Dashboard page")
//        thenIShouldBeOn("Dashboard page")
//
//      When("I click the browser back button")
//        andIClickTheBrowserBackButton()
//
//      When("I select back link")
//        andISelectBackLink()
//
//      When("I enter UK Bank Account details as:")
//        val bankDetailsEightData: Map[String, String] = Map(
//          "bankName"          -> "Test",
//          "accountHolderName" -> "Epic",
//          "sortCode"          -> "206705",
//          "accountNumber"     -> "86473611"
//        )
//        andIEnterUKBankAccountDetailsAs(bankDetailsEightData)
//
//      Then("I should be on Repayment Partial Name Error Page")
//        thenIShouldBeOn("Repayment Partial Name Error Page")
//
//      When("I select option Yes on partial name error page")
//        andISelectOptionOnPartialNameErrorPage("Yes")
//
//      Then("I should be on Repayment Contact Page")
//        thenIShouldBeOn("Repayment Contact Page")
//
//      When("I select back link")
//        andISelectBackLink()
//
//      And("I select option No on partial name error page")
//        andISelectOptionOnPartialNameErrorPage("No")
//
//      Then("I should be on UK Bank Account Payment Page")
//        thenIShouldBeOn("UK Bank Account Payment Page")
//    }
//  }
//}