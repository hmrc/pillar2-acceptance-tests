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

class RepaymentErrorJourneysSpec extends BaseSpec {

  Feature("Repayment Error Page Journeys") {

    Scenario("1 - Org User bars integration validation", AcceptanceTests) {
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

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()
      RepaymentReasonPage.enterText()
      RepaymentMethodPage.clickTypeOfAccountUK()

      And("The user gets to the UK bank account screen and submits wrong bank details (couldNotConfirmBankDetails)")
      RepaymentBankAccountUKPage.enterBankDetails(couldNotConfirmBankDetails)

      When("The user is taken to the could not confirm bank details error page")
      RepaymentCouldNotConfirmErrorPage.clickReturnToBankDetailsLink()

      Then("The user returns to the UK bank account screen and submits wrong bank details (bankDetailsError)")
      RepaymentBankAccountUKPage.enterBankDetails(bankDetailsError)

      When("The user is taken to the bank details error page")
      RepaymentBankDetailsErrorPage.clickReturnToBankDetailsLink()

      Then("The user returns to the UK bank account screen and submits wrong bank details (barsError)")
      RepaymentBankAccountUKPage.enterBankDetails(barsError)

      When("The user is taken to the bars error page")
      RepaymentBarsErrorPage.clickBackLink()

      Then("The user returns to the UK bank account screen and submits wrong bank details (partialNameError)")
      RepaymentBankAccountUKPage.enterBankDetails(partialNameError)

      When("The user is taken to the partial name error page and confirm bank details")
      RepaymentPartialNameErrorPage.selectYes()

      And("The user will be taken to the contact details name page")
      RepaymentContactNamePage.onPage()
    }

    Scenario("2 - Org User navigates to error page when repayment submission API fails to submit data to ETMP", AcceptanceTests) {
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

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()

      And("The user redirects to the check your answers page after one question and tries to submit")
      navigateTo(RepaymentCYAPage.url)
      RepaymentCYAPage.onPageSubmitById()

      Then("The user will be presented with the repayment request has missing information page")
      RepaymentIncompleteErrorPage.onPage()
    }

    Scenario("3 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP", AcceptanceTests) {
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

      And("The agent starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()

      And("The agent redirects to the check your answers page after one question and tries to submit")
      navigateTo(RepaymentCYAPage.url)
      RepaymentCYAPage.onPageSubmitById()

      Then("The agent will be presented with the repayment request has missing information page")
      RepaymentIncompleteErrorPage.onPage()
    }

    Scenario("4 - Org User navigates to journey recovery error page when they try to skip mandatory questions", AcceptanceTests) {
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

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()

      And("The user changes the url to redirect to the contact email page without answering prior questions")
      navigateTo(RepaymentContactEmailPage.url)

      Then("The user will be presented with the your answers were not saved page")
      RepaymentJourneyRecoveryErrorPage.onPage()
    }

    Scenario("5 - Agent User navigates to journey recovery error page when they try to skip mandatory questions", AcceptanceTests) {
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

      And("The agent starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterText()

      And("The agent changes the url to redirect to the contact email page without answering prior questions")
      navigateTo(RepaymentContactEmailPage.url)

      Then("The agent will be presented with the your answers were not saved page")
      RepaymentJourneyRecoveryErrorPage.onPage()
    }
  }
}
