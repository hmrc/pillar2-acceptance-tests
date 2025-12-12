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
import uk.gov.hmrc.test.ui.pages.contactDetails.*
import uk.gov.hmrc.test.ui.pages.furtherDetails.*
import uk.gov.hmrc.test.ui.pages.nfm.NFMRegistrationPage
import uk.gov.hmrc.test.ui.pages.registration.*
import uk.gov.hmrc.test.ui.pages.upe.*
import uk.gov.hmrc.test.ui.specs.tags.*

class SubscriptionAndErrorValidationsSpec extends BaseSpec {

  Feature("Create a new registration and subscription") {

    // Todo ignore tag to be added
//    Scenario("5 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.") {
//      Given("Organisation User logs in to subscribe for Pillar2")
//      givenLogsInToSubscribeForPillar2("Organisation User")
//
//      Then("I should be on Task list page")
//      thenIShouldBeOn("Task list page")
//
//      When("I click Add Ultimate Parent Entity details link")
//      andIClickLink("Add Ultimate Parent Entity details")
//
//      Then("I should navigate to Initial guidance Page")
//      thenIShouldNavigateTo("Initial guidance Page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to UPE business page")
//      thenIShouldNavigateTo("UPE business page")
//
//      When("I select option No and continue to next")
//      andISelectOptionAndContinueToNext("No")
//
//      And("I enter UPE name as Test UPE")
//      andIEnterAs("UPE name", "Test UPE")
//
//      When("I enter Address as:")
//      val addressDataOne: Map[String, String] = Map(
//        "addressLine1" -> "Address Line 1",
//        "addressLine3" -> "City",
//        "postalCode"   -> "EH5 5WY",
//        "countryCode"  -> "United Kingdom"
//      )
//      thenIEnterAddressAs(addressDataOne)
//
//      Then("I should navigate to UPE Contact person/team Name page")
//      thenIShouldNavigateTo("UPE Contact person/team Name page")
//
//      When("I enter UPE Person/Team name as UPE Contact Name")
//      andIEnterAs("UPE Person/Team name", "UPE Contact Name")
//
//      When("I enter UPE Email address as testteam@email.com")
//      andIEnterAs("UPE Email address", "testteam@email.com")
//
//      When("I select option No and continue to next")
//      andISelectOptionAndContinueToNext("No")
//
//      Then("I should be on Check your answers page")
//      thenIShouldBeOn("Check your answers page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      When("I click Add filing member details link")
//      andIClickLink("Add filing member details")
//
//      Then("I should navigate to NFM registration page")
//      thenIShouldNavigateTo("NFM registration page")
//
//      When("I select No option and continue to next")
//      andISelectNfmOptionAndContinueToNext("No")
//
//      When("I click Add further group details link")
//      andIClickLink("Add further group details")
//
//      When("I select option In the UK and outside the UK in further details group status page")
//      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")
//
//      When("I enter account period as:")
//      val dateRangeData: Map[String, String] = Map(
//        "startDate.day"   -> "15",
//        "startDate.month" -> "1",
//        "startDate.year"  -> "2024",
//        "endDate.day"     -> "15",
//        "endDate.month"   -> "1",
//        "endDate.year"    -> "2025"
//      )
//      andIEnterAccountPeriodAs(dateRangeData)
//
//      Then("I should navigate to FD check your answers page")
//      thenIShouldNavigateTo("FD check your answers page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      When("I click Add contact details link")
//      andIClickLink("Add contact details")
//
//      Then("I should navigate to Contact details guidance page")
//      thenIShouldNavigateTo("Contact details guidance page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Contact details display page")
//      thenIShouldNavigateTo("Contact details display page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should navigate to Second Contact details page")
//      thenIShouldNavigateTo("Second Contact details page")
//
//      When("I select option No and continue to next")
//      andISelectOptionAndContinueToNext("No")
//
//      When("I enter Address as:")
//      val addressData: Map[String, String] = Map(
//        "addressLine1" -> "Address Line 1",
//        "addressLine3" -> "City",
//        "postalCode"   -> "EH5 5WY",
//        "countryCode"  -> "United Kingdom"
//      )
//      thenIEnterAddressAs(addressData)
//
//      Then("I should navigate to Contact details Check answers page")
//      thenIShouldNavigateTo("Contact details Check answers page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      When("I click Check your answers before submitting your registration link")
//      andIClickLink("Check your answers before submitting your registration")
//
//      Then("I should navigate to Review answers page")
//      thenIShouldNavigateTo("Review answers page")
//
//      And("I should see Print this page link on Review answers page")
//      andIShouldSeeLinkOn("Print this page", "Review answers page")
//
//    }
  }
}
