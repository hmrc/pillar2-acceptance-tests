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
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class SubscriptionAndErrorValidationsSpec extends BaseSpec with Matchers {

  Feature("Create a new registration and subscription") {

    Scenario("1 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.",AcceptanceTests,ZapAccessibility) {
      Given("Organisation User logs in to subscribe for Pillar2")
      givenLogsInToSubscribeForPillar2("Organisation User")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I enter UPE name as XMPLR0009999999")
      andIEnterAs("UPE name", "XMPLR0009999999")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterAs("UPE Person/Team name", "UPE Contact Name")

      When("I enter UPE Email address as testteam@email.com")
      andIEnterAs("UPE Email address", "testteam@email.com")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeData: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeData)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to duplicate ack ref error page")
      thenIShouldNavigateTo("duplicate ack ref error page")

    }

    Scenario("2 - User redirected to a placeholder error page, for an incomplete data submission during registration",AcceptanceTests,ZapAccessibility) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateTo("UKCompany GRS page")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on NFM entity type page")
      thenIShouldBeOn("NFM entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateTo("NFM UKCompany GRS page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeData: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeData)

      Then("I should navigate to FD check your answers page")
      thenIShouldNavigateTo("FD check your answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

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

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      When("I click on change link for Primary Contact")
      andIClickOnChangeLinkFor("Primary Contact")

      Then("I should navigate to Contact details change phone page")
      thenIShouldNavigateTo("Contact details change phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I select back link")
      andISelectBackLink()

      And("I select back link")
      andISelectBackLink()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Incomplete Data Submission Error Page")
      thenIShouldNavigateTo("Incomplete Data Submission Error Page")

      When("I click go back to register your group and complete any in progress tasks. link")
      andIClickLink("go back to register your group and complete any in progress tasks.")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      Then("The Task Add contact details status should be In progress")
      andTheTaskStatusShouldBe("Add contact details", "In progress")

    }

    Scenario("3 - User redirected to a placeholder error page, for an invalid request during registration.",AcceptanceTests) {
      Given("Organisation User logs in to subscribe for Pillar2")
      givenLogsInToSubscribeForPillar2("Organisation User")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Add Ultimate Parent Entity details link")
      andIClickLink("Add Ultimate Parent Entity details")

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateTo("Initial guidance Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UPE business page")
      thenIShouldNavigateTo("UPE business page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      And("I enter UPE name as regNoIDInvalidRequest")
      andIEnterAs("UPE name", "regNoIDInvalidRequest")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterAs("UPE Person/Team name", "UPE Contact Name")

      When("I enter UPE Email address as testteam@email.com")
      andIEnterAs("UPE Email address", "testteam@email.com")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeData: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeData)

      Then("I should navigate to FD check your answers page")
      thenIShouldNavigateTo("FD check your answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateTo("Contact details display page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration API error page")
      thenIShouldNavigateTo("Registration API error page")

      When("I click Return to registration to try again link")
      andIClickLink("Return to registration to try again")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

    }

    Scenario("4 - Verify the link on page can't be found page",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access random page")
      givenIAccessRandomPage()

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
      andIClickLink("return to your Pillar 2 Top-up Taxes registration")

      Then("I should see task list sections")
      andIShouldSeeTaskListSections()

      And("The Task Add Ultimate Parent Entity details status should be Not started")
      andTheTaskStatusShouldBe("Add Ultimate Parent Entity details", "Not started")

    }

    //Todo ignore tag to be added
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