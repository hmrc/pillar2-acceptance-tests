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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.{Enrolment, login}
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.errorPages.ErrorAPISubscriptionPage
import uk.gov.hmrc.test.ui.pages.manage.*
import uk.gov.hmrc.test.ui.specs.tags.*

class ManageContactDetailsSpec extends BaseSpec {

  Feature("Manage Contact Details") {

    Scenario(
      "1 - Org user amends contact details via manage",
      AcceptanceTests
    ) {

      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345676"
          )
        )
      )

      When("The user is on the dashboard and navigates to manage contact details")
      DashboardPage.clickManageContactDetailsLink()
      ManageContactDetailsSummaryPage.onPage()

      And("The user amends primary contact name")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changePrimaryContactName)
      ManageContactDetailsPrimaryNamePage.enterText()

      And("The user amends primary contact email address")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changePrimaryContactEmail)
      ManageContactDetailsPrimaryEmailPage.enterText()

      And("The user amends primary contact phone number")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changePrimaryContactPhoneNumber)
      ManageContactDetailsPrimaryPhoneInputPage.enterText()

      And("The user amends secondary contact name")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changeSecondaryContactName)
      ManageContactDetailsSecondaryNamePage.enterText()

      And("The user amends secondary contact email address")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changeSecondaryContactEmail)
      ManageContactDetailsSecondaryEmailPage.enterText()

      And("The user amends secondary contact phone number")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changeSecondaryContactPhoneNumber)
      ManageContactDetailsSecondaryPhoneInputPage.enterText()

      And("The user amends contact address")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changeAddress)
      ManageContactDetailsAddressPage.updateAddressUK()

      When("The user saves the changes")
      ManageContactDetailsSummaryPage.onPageSubmitById()

      Then("The user is taken to the dashboard")
      DashboardPage.onPage(timeoutSeconds = 5)
    }

    Scenario(
      "2 - Org user amends contact details via manage, but is taken to ETMP error page",
      AcceptanceTests
    ) {

      Given("Organisation User logs in to Pillar2 service")
      login(
        userType = "Organisation",
        pageUrl = "dashboard",
        enrolment = Some(
          Enrolment(
            "HMRC-PILLAR2-ORG",
            "PLRID",
            "XMPLR0012345676"
          )
        )
      )

      When("The user is on the dashboard and navigates to manage contact details")
      DashboardPage.clickManageContactDetailsLink()
      ManageContactDetailsSummaryPage.onPage()

      And("The user amends primary contact name")
      ManageContactDetailsSummaryPage.clickLink(ManageContactDetailsSummaryPage.changePrimaryContactName)
      ManageContactDetailsPrimaryNamePage.enterText(ManageContactDetailsPrimaryNamePage.textValueETMPError)

      When("The user saves the changes")
      ManageContactDetailsSummaryPage.onPageSubmitById()

      Then("The user is taken to the error page")
      ErrorAPISubscriptionPage.onPage()
    }
  }
}
