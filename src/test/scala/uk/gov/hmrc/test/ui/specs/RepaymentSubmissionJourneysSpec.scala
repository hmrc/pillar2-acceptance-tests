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

import uk.gov.hmrc.test.ui.pages.asa.*
import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{DelegatedEnrolment, Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.repayments.*
import uk.gov.hmrc.test.ui.pages.repayments.RepaymentBankAccountUKPage.*
import uk.gov.hmrc.test.ui.specs.tags.*

class RepaymentSubmissionJourneysSpec extends BaseSpec {

  Feature("Repayment Journeys") {
    Scenario("1 - Org User successfully submits repayment journey with a UK bank account and uses change links", AcceptanceTests) {
      Given("Org User logs in with existing entity group")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674"
          )
        )
      )

      And("The user requests a repayment using a UK bank account")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()
      RepaymentReasonPage.enterText()
      RepaymentMethodPage.clickTypeOfAccountUK()
      RepaymentBankAccountUKPage.enterBankDetails(validBankDetails)

      And("The user adds contact details")
      RepaymentContactNamePage.enterText()
      RepaymentContactEmailPage.enterText()
      RepaymentPhoneAsContactPage.selectYes()
      RepaymentPhoneInputPage.enterText()

      And("The user amends refund amount via the Check your answers page")
      RepaymentCYAPage.clickLinkChangeRefundAmount()
      RepaymentAmountPage.updateText()

      And("The user amends refund reason via the Check your answers page")
      RepaymentCYAPage.clickLinkChangeRefundReason()
      RepaymentReasonPage.updateText()

      And("The user amends contact name via the Check your answers page")
      RepaymentCYAPage.clickLinkChangeContactName()
      RepaymentContactNamePage.updateText()

      And("The user amends contact email via the Check your answers page")
      RepaymentCYAPage.clickLinkChangeContactEmail()
      RepaymentContactEmailPage.updateText()

      And("The user amends contact phone number via the Check your answers page")
      RepaymentCYAPage.clickLinkChangePhoneNumber()
      RepaymentPhoneInputPage.updateText()

      And("The user submits the request for repayment")
      RepaymentCYAPage.onPageSubmitById()

      Then("The user will be presented with the confirmation page")
      RepaymentConfirmationPage.onPage(timeoutSeconds = 20)
    }

    Scenario("2 - Org User successfully submits repayment journey with a Non-UK bank account", AcceptanceTests) {
      Given("Org User logs in with existing entity group")
      login(
        userType = "Organisation",
        page = "dashboard",
        enrolment = Some(
          Enrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674"
          )
        )
      )

      And("The user requests a repayment using a Non-UK bank account")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()
      RepaymentReasonPage.enterText()
      RepaymentMethodPage.clickTypeOfAccountNonUK()
      RepaymentBankAccountNonUKPage.enterBankDetails()

      And("The user adds contact details")
      RepaymentContactNamePage.enterText()
      RepaymentContactEmailPage.enterText()
      RepaymentPhoneAsContactPage.selectYes()
      RepaymentPhoneInputPage.enterText()

      And("The user submits the request for repayment")
      RepaymentCYAPage.onPageSubmitById()

      Then("The user will be presented with the confirmation page")
      RepaymentConfirmationPage.onPage(timeoutSeconds = 20)
    }

    Scenario("3 - Agent User successfully submits repayment journey with a UK bank account", AcceptanceTests) {
      Given("Agent User logs in with existing entity group")
      login(
        userType = "Agent",
        page = "asa",
        enrolment = Some(
          Enrolment(
            key = "HMRC-AS-AGENT",
            name = "AgentReference",
            value = "1234"
          )
        ),
        delegatedEnrolments = Seq(
          DelegatedEnrolment(
            key = "HMRC-PILLAR2-ORG",
            name = "PLRID",
            value = "XMPLR0012345674",
            authRule = "pillar2-auth"
          )
        )
      )

      Then("The agent confirms client PLRId")
      ASAPillar2InputPage.enterText("XMPLR0012345674")
      ASAConfirmationPage.continueToNextPage()

      And("The agent requests a repayment using a UK bank account")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()
      RepaymentReasonPage.enterText()
      RepaymentMethodPage.clickTypeOfAccountUK()
      RepaymentBankAccountUKPage.enterBankDetails(validBankDetails)

      And("The agent adds contact details")
      RepaymentContactNamePage.enterText()
      RepaymentContactEmailPage.enterText()
      RepaymentPhoneAsContactPage.selectYes()
      RepaymentPhoneInputPage.enterText()

      And("The agent submits the request for repayment")
      RepaymentCYAPage.onPageSubmitById()

      Then("The agent will be presented with the confirmation page")
      RepaymentConfirmationPage.waitRefreshThenCheckOnPage(initialWaitSeconds = 10)

      Then("The agent clicks the back button they will be taken to the cannot return, repayment request is complete page")
      RepaymentConfirmationPage.browserBack()
      RepaymentReturnErrorPage.onPage()
    }
  }
}
