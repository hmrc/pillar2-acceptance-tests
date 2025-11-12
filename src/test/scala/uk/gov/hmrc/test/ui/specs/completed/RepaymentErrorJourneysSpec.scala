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

package uk.gov.hmrc.test.ui.specs.completed

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.cucumber.Nav
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.{Enrolment, login}
import uk.gov.hmrc.test.ui.specpages.DashboardPage
import uk.gov.hmrc.test.ui.specpages.repayments.RepaymentBankAccountUKPage._
import uk.gov.hmrc.test.ui.specpages.repayments._
import uk.gov.hmrc.test.ui.specs.BaseSpec
import uk.gov.hmrc.test.ui.tags.Tests

class RepaymentErrorJourneysSpec extends BaseSpec with Matchers {

  Feature("Bars Handling") {

    Scenario("1 - Org User bars integration validation", Tests) {
      Given("Org User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345674"
          )
        )
      )

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterAmount()
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
      RepaymentBarsErrorPage.clickOnBackLink()

      Then("The user returns to the UK bank account screen and submits wrong bank details (partialNameError)")
      RepaymentBankAccountUKPage.enterBankDetails(partialNameError)

      When("The user is taken to the partial name error page and confirm bank details")
      RepaymentPartialNameErrorPage.selectYes()

      And("The user will be taken to the contact details name page")
      RepaymentContactNamePage.onPage()
    }

    Scenario("2 - Org User navigates to error page when repayment submission API fails to submit data to ETMP", Tests) {
      Given("Org User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345674"
          )
        )
      )

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterAmount()

      And("The user redirects to the check your answers page after one question and tries to submit")
      Nav.navigateTo(RepaymentCYAPage.url)
      RepaymentCYAPage.onPageSubmitById()

      Then("The user will be presented with the repayment request has missing information page")
      RepaymentIncompleteErrorPage.onPage()
    }

    Scenario("3 - Org User navigates to journey recovery error page when they try to skip mandatory questions", Tests) {
      Given("Org User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345674"
          )
        )
      )

      And("The user starts the request a repayment journey")
      DashboardPage.clickRequestRepaymentLink()
      RepaymentGuidancePage.continueToNextPage()
      RepaymentAmountPage.enterAmount()

      And("The user changes the url to redirect to the contact email page without answering prior questions")
      Nav.navigateTo(RepaymentContactEmailPage.url)

      Then("The user will be presented with the your answers were not saved page")
      RepaymentJourneyRecoveryErrorPage.onPage()
    }
  }
}
