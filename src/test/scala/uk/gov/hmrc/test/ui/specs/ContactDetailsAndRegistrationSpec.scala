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
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class ContactDetailsAndRegistrationSpec extends BaseSpec with Matchers {

  Feature("Contact details for the filing member") {

    Scenario(
      "4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page.",
      AcceptanceTests,
      ZapAccessibility
    ) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option Only in the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")

      When("I enter account period as:")
      val dateRangeDataThree: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataThree)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter Contact Name as Contact Name Test")
      andIEnterAs("Contact Name", "Contact Name Test")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Contact Phone as 1234554")
      andIEnterAs("Contact Phone", "1234554")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataFive: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataFive)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectTo("Registration processing page")

      Then("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Registration return error page")
      thenIShouldNavigateTo("Registration return error page")

      And("I click report and manage your Pillar 2 Top-up Taxes. link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes.")

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Registration return error page")
      thenIShouldBeOn("Registration return error page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")
    }

    Scenario(
      "5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows",
      AcceptanceTests,
      ZapAccessibility) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeDataFour: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataFour)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter Contact Name as Contact Name Test")
      andIEnterAs("Contact Name", "Contact Name Test")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Contact Phone as 1234554")
      andIEnterAs("Contact Phone", "1234554")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataSix: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataSix)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("The Task Edit filing member details status should be Completed")
      andTheTaskStatusShouldBe("Edit filing member details", "Completed")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter NFM name as NFM Test KB")
      andIEnterAs("NFM name", "NFM Test KB")

      When("I enter Address as:")
      val addressDataSeven: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressDataSeven)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter NFM Contact name as Contact CYA")
      andIEnterAs("NFM Contact name", "Contact CYA")

      When("I enter NFM Contact Email as testcya@email.com")
      andIEnterAs("NFM Contact Email", "testcya@email.com")

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateTo("NFM Phone page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to NFM Check your answers page")
      thenIShouldNavigateTo("NFM Check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectTo("Registration processing page")

      And("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

    }
  }
}
