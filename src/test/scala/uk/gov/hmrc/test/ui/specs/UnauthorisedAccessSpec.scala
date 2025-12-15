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

import uk.gov.hmrc.test.ui.helper.Nav.*
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
      navigateTo(ManageAccountsSummaryPage.url)

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
      navigateTo(PaymentsPayPage.url)

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
      navigateTo(RepaymentGuidancePage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "4 - Unauthorised access of repayment guidance page",
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
      navigateTo(RepaymentGuidancePage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "5 - Unauthorised access of repayment reason page",
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
      navigateTo(RepaymentReasonPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }


    Scenario(
      "6 - Unauthorised access of repayment method page",
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
      navigateTo(RepaymentMethodPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "7 - Unauthorised access of UK bank account page",
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
      navigateTo(RepaymentBankAccountUKPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "8 - Unauthorised access of non-UK bank account page",
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
      navigateTo(RepaymentBankAccountNonUKPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "9 - Unauthorised access of repayment contact name page",
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
      navigateTo(RepaymentContactNamePage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "10 - Unauthorised access of repayment contact email page",
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
      navigateTo(RepaymentContactEmailPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "11 - Unauthorised access of repayment phone as contact page",
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
      navigateTo(RepaymentPhoneAsContactPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "12 - Unauthorised access of repayment phone input page",
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
      navigateTo(RepaymentPhoneInputPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "13 - Unauthorised access of repayment check your answers page",
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
      navigateTo(RepaymentCYAPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "14 - Unauthorised access of manage primary contact name page",
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
      navigateTo(ManageContactDetailsPrimaryNamePage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "15 - Unauthorised access of manage secondary contact name page",
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
      navigateTo(ManageContactDetailsSecondaryNamePage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "16 - Unauthorised access of manage contact address page",
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
      navigateTo(ManageContactDetailsAddressPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "17 - Unauthorised access of manage group status page",
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
      navigateTo(ManageGroupStatusPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "18 - Unauthorised access of manage accounting period page",
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
      navigateTo(ManageAccountPeriodPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }

    Scenario(
      "19 - Unauthorised access of transaction history page",
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
      navigateTo(TransactionHistoryPage.url)

      When("The user is taken to the unauthorised page")
      UnauthorisedPage.onPage()
    }
  }
}
