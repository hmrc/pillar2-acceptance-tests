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
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.login
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class SubscriptionAndErrorValidationsSpec extends BaseSpec with Matchers {

  Feature("Create a new registration and subscription") {

    Scenario("1 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.") {
      Given("Organisation User logs in to subscribe for Pillar2")
//      givenXLogsInToSubscribeForPillar2("Organisation User") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
      andIClickXLink("Add Ultimate Parent Entity details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter UPE name as XMPLR0009999999")
      andIEnterXAsX("UPE name", "XMPLR0009999999") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterXAsX("UPE Person/Team name", "UPE Contact Name") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter UPE Email address as testteam@email.com")
      andIEnterXAsX("UPE Email address", "testteam@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select No option and continue to next")
      andISelectXOptionAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

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
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add contact details link")
      andIClickXLink("Add contact details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should navigate to duplicate ack ref error page")
      thenIShouldNavigateToX("duplicate ack ref error page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - User redirected to a placeholder error page, for an incomplete data submission during registration") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      Then("I should be on UPE business page")
      thenIShouldBeOnX("UPE business page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UKCompany GRS page")
      thenIShouldNavigateToX("UKCompany GRS page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
      thenIShouldNavigateToX("NFM details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM entity type page")
      thenIShouldBeOnX("NFM entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM UKCompany GRS page")
      thenIShouldNavigateToX("NFM UKCompany GRS page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

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
      thenIShouldNavigateToX("FD check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add contact details link")
      andIClickXLink("Add contact details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateToX("Contact details guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Contact Name as Contact Name Test")
      andIEnterXAsX("Contact Name", "Contact Name Test") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Contact Email as testContact@email.com")
      andIEnterXAsX("Contact Email", "testContact@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateToX("Second Contact details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on change link for Primary Contact")
      andIClickOnChangeLinkForX("Primary Contact") // auto-chosen (score=1.00, CYAStepsSteps.scala)

      Then("I should navigate to Contact details change phone page")
      thenIShouldNavigateToX("Contact details change phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Incomplete Data Submission Error Page")
      thenIShouldNavigateToX("Incomplete Data Submission Error Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back to register your group and complete any in progress tasks. link")
      andIClickXLink("go back to register your group and complete any in progress tasks.") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("The Task Add contact details status should be In progress")
      andTheTaskXStatusShouldBeX("Add contact details", "In progress") // auto-chosen (score=1.00, TaskListStepsSteps.scala)

    }

    Scenario("3 - User redirected to a placeholder error page, for an invalid request during registration.") {
      Given("Organisation User logs in to subscribe for Pillar2")
//      givenXLogsInToSubscribeForPillar2("Organisation User") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
      thenIShouldBeOnX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
      andIClickXLink("Add Ultimate Parent Entity details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateToX("Initial guidance Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to UPE business page")
      thenIShouldNavigateToX("UPE business page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateToX("input-upe-name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I enter UPE name as regNoIDInvalidRequest")
      andIEnterXAsX("UPE name", "regNoIDInvalidRequest") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterXAsX("UPE Person/Team name", "UPE Contact Name") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter UPE Email address as testteam@email.com")
      andIEnterXAsX("UPE Email address", "testteam@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateToX("NFM registration page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select No option and continue to next")
      andISelectXOptionAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

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
      thenIShouldNavigateToX("FD check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add contact details link")
      andIClickXLink("Add contact details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateToX("Contact details display page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateToX("Second Contact details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration API error page")
      thenIShouldNavigateToX("Registration API error page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Return to registration to try again link")
      andIClickXLink("Return to registration to try again") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - Verify the link on page can't be found page") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("I access random page")
//      givenIAccessRandomPage() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I click return to your Pillar 2 Top-up Taxes registration link")
      andIClickXLink("return to your Pillar 2 Top-up Taxes registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should see task list sections")
//      andIShouldSeeTaskListSections() // auto-chosen (score=1.00, TaskListStepsSteps.scala)

      And("The Task Add Ultimate Parent Entity details status should be Not started")
      andTheTaskXStatusShouldBeX("Add Ultimate Parent Entity details", "Not started") // auto-chosen (score=1.00, TaskListStepsSteps.scala)

    }

    Scenario("5 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.") {
      Given("Organisation User logs in to subscribe for Pillar2")
//      givenXLogsInToSubscribeForPillar2("Organisation User") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
      thenIShouldBeOnX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add Ultimate Parent Entity details link")
      andIClickXLink("Add Ultimate Parent Entity details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Initial guidance Page")
      thenIShouldNavigateToX("Initial guidance Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to UPE business page")
      thenIShouldNavigateToX("UPE business page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter UPE name as Test UPE")
      andIEnterXAsX("UPE name", "Test UPE") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to UPE Contact person/team Name page")
      thenIShouldNavigateToX("UPE Contact person/team Name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter UPE Person/Team name as UPE Contact Name")
      andIEnterXAsX("UPE Person/Team name", "UPE Contact Name") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter UPE Email address as testteam@email.com")
      andIEnterXAsX("UPE Email address", "testteam@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateToX("NFM registration page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select No option and continue to next")
      andISelectXOptionAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

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
      thenIShouldNavigateToX("FD check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Add contact details link")
      andIClickXLink("Add contact details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateToX("Contact details guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateToX("Contact details display page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateToX("Second Contact details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressData)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see Print this page link on Review answers page")
      andIShouldSeeXLinkOnX("Print this page", "Review answers page") // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }
  }
}
