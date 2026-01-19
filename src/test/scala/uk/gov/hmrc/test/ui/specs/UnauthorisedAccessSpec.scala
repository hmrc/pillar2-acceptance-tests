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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.login
import uk.gov.hmrc.test.ui.pages.manage.*
import uk.gov.hmrc.test.ui.pages.payments.PaymentsPayPage
import uk.gov.hmrc.test.ui.pages.registration.TaskListPage
import uk.gov.hmrc.test.ui.pages.repayments.*
import uk.gov.hmrc.test.ui.pages.transactionHistory.TransactionHistoryPage
import uk.gov.hmrc.test.ui.pages.unauthorised.UnauthorisedPage
import uk.gov.hmrc.test.ui.specs.tags.*

class UnauthorisedAccessSpec extends BaseSpec {

  Feature("Unauthorised user tries to access pages requiring authorisation") {

    Scenario(
      "1 - Unauthorised access of account summary page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the accounts summary page")
      TaskListPage.navigateToManageAccountsSummaryPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "2 - Unauthorised access of make a payment page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the make a payment page")
      TaskListPage.navigateToPaymentsPayPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "3 - Unauthorised access of repayment guidance page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment guidance page")
      TaskListPage.navigateToRepaymentGuidancePage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "4 - Unauthorised access of repayment reason page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment reason page")
      TaskListPage.navigateToRepaymentReasonPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }


    Scenario(
      "5 - Unauthorised access of repayment method page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment method page")
      TaskListPage.navigateToRepaymentMethodPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "6 - Unauthorised access of UK bank account page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the UK bank account page")
      TaskListPage.navigateToRepaymentBankAccountUKPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "7 - Unauthorised access of non-UK bank account page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the non-UK bank account page")
      TaskListPage.navigateToRepaymentBankAccountNonUKPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "8 - Unauthorised access of repayment contact name page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment contact name page")
      TaskListPage.navigateToRepaymentContactNamePage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "9 - Unauthorised access of repayment contact email page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment contact email page")
      TaskListPage.navigateToRepaymentContactEmailPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "10 - Unauthorised access of repayment phone as contact page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment phone as contact page")
      TaskListPage.navigateToRepaymentPhoneAsContactPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "11 - Unauthorised access of repayment phone input page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment phone input page")
      TaskListPage.navigateToRepaymentPhoneInputPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "12 - Unauthorised access of repayment check your answers page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the repayment check your answers page")
      TaskListPage.navigateToRepaymentCYAPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "13 - Unauthorised access of manage primary contact name page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the manage primary contact name page")
      TaskListPage.navigateToManageContactDetailsPrimaryNamePage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "14 - Unauthorised access of manage secondary contact name page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the manage secondary contact name page")
      TaskListPage.navigateToManageContactDetailsSecondaryNamePage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "15 - Unauthorised access of manage contact address page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the manage contact address page")
      TaskListPage.navigateToManageContactDetailsAddressPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "16 - Unauthorised access of manage group status page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the manage group status page")
      TaskListPage.navigateToManageGroupStatusPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "17 - Unauthorised access of manage accounting period page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the manage accounting period page")
      TaskListPage.navigateToManageAccountPeriodPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "18 - Unauthorised access of transaction history page",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without enrolment")
      login(
        userType = "Organisation",
        page = "pillar2-frontend"
      )

      Then("The user is presented with the task list page")
      TaskListPage.onPage()

      And("The user attempts to navigate to the transaction history page")
      TaskListPage.navigateToTransactionHistoryPage()

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }
  }
}
