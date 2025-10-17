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
class BarsErrorHandlingSpec extends AnyFeatureSpec with Matchers {

  Feature("Bars Handling") {

    Scenario("1 - Organisation User bars integration validation") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      Then("I should be on Dashboard page")
      When("I click Request a repayment link")
      When("I click on Continue button")
      When("I provide Refund Amount as 100.00")
      And("I click on Continue button")
      Then("I should be on Reason For Refund Page")
      When("I provide value for Refund Reason as Bars Integration Test")
      And("I click on Continue button")
      Then("I should navigate to Repayment Method Page")
      And("I select repayment method as UK bank account")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Could Not Confirm Error Page")
      When("I click return to your bank details and try again link")
      Then("I should be on UK Bank Account Payment Page")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Bank Details Error Page")
      When("I click try again with a different business bank account link")
      Then("I should be on UK Bank Account Payment Page")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Bars Error Page")
      When("I click Return to your account homepage link")
      Then("I should be on Dashboard page")
      When("I access UK payment page")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Partial Name Error Page")
      When("I select option Yes on partial name error page")
      Then("I should be on Repayment Contact Page")
      When("I select back link")
      And("I select option No on partial name error page")
      Then("I should be on UK Bank Account Payment Page")
    }

    Scenario("2 - Agent User bars integration validation") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
      Then("I should be on ASA Pillar2 Input Page")
      And("I provide ASA Pillar2 ID as XMPLR0012345674")
      And("I click on Continue button")
      Then("I should navigate to ASA Confirmation Page")
      And("I click on Continue button")
      Then("I should navigate to Dashboard page")
      When("I click Request a repayment link")
      When("I click on Continue button")
      When("I provide Refund Amount as 100.00")
      And("I click on Continue button")
      Then("I should be on Reason For Refund Page")
      When("I provide value for Refund Reason as Bars Integration Test")
      And("I click on Continue button")
      Then("I should navigate to Repayment Method Page")
      And("I select repayment method as UK bank account")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Could Not Confirm Error Page")
      When("I click return to your bank details and try again link")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Bank Details Error Page")
      When("I click try again with a different business bank account link")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Bars Error Page")
      When("I click Return to your account homepage link")
      Then("I should be on Dashboard page")
      When("I click the browser back button")
      When("I select back link")
      When("I enter UK Bank Account details as:")
      Then("I should be on Repayment Partial Name Error Page")
      When("I select option Yes on partial name error page")
      Then("I should be on Repayment Contact Page")
      When("I select back link")
      And("I select option No on partial name error page")
      Then("I should be on UK Bank Account Payment Page")
    }
  }
}
