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
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class ContactDetailsAndRegistrationSpec extends BaseSpec with Matchers {

  Feature("Contact details for the filing member") {

    Scenario("4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page.") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
      thenIShouldBeOnX("UPE entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Only in the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter account period as:")
      val dateRangeDataThree: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataThree) // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

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

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Contact Phone as 1234554")
      andIEnterXAsX("Contact Phone", "1234554") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataFive: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataFive) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()
      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateToX("Registration Duplication KB Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I select No option and continue to next")
      andISelectXOptionAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectToX("Registration processing page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Registration confirmation page")
      thenIShouldNavigateToX("Registration confirmation page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Registration return error page")
      thenIShouldNavigateToX("Registration return error page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes. link")
      andIClickXLink("report and manage your Pillar 2 Top-up Taxes.") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be on Dashboard page")
      thenIShouldBeOnX("Dashboard page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click the browser back button")
      andIClickTheBrowserBackButton() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Registration return error page")
      thenIShouldBeOnX("Registration return error page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
      andIClickXLink("Sign out") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(
        "Organisation",
        "HMRC-PILLAR2-ORG",
        "PLRID",
        "XMPLR0012345674"
      ) // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
      thenIShouldBeOnX("Dashboard page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on UPE entity type page")
      thenIShouldBeOnX("UPE entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter account period as:")
      val dateRangeDataFour: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataFour) // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

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

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Contact Phone as 1234554")
      andIEnterXAsX("Contact Phone", "1234554") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataSix: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataSix) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateToX("Registration Duplication KB Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickXLink("Report Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateToX("Registration Duplication KB Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
      thenIShouldNavigateToX("NFM details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter NFM name as NFM Test KB")
      andIEnterXAsX("NFM name", "NFM Test KB") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Address as:")
      val addressDataSeven: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressDataSeven) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter NFM Contact name as Contact CYA")
      andIEnterXAsX("NFM Contact name", "Contact CYA") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter NFM Contact Email as testcya@email.com")
      andIEnterXAsX("NFM Contact Email", "testcya@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateToX("NFM Phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Check your answers page")
      thenIShouldNavigateToX("NFM Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
      thenIShouldBeOnX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectToX("Registration processing page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should navigate to Registration confirmation page")
      thenIShouldNavigateToX("Registration confirmation page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - UPE No Id journey navigation to registration in progress page") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      Then("I should be on UPE business page")
      thenIShouldBeOnX("UPE business page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateToX("input-upe-name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter UPE name as Medium Processing Corp")
      andIEnterXAsX("UPE name", "Medium Processing Corp") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to input-upe-address page")
      thenIShouldNavigateToX("input-upe-address page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address as:")
      val addressEight: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressEight) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
      thenIShouldNavigateToX("UPE Contact person/team Name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter UPE Person/Team name as Medium Processing")
      andIEnterXAsX("UPE Person/Team name", "Medium Processing") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UPE Contact Email page")
      thenIShouldNavigateToX("UPE Contact Email page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter UPE Email address as testcontactupe@email.com")
      andIEnterXAsX("UPE Email address", "testcontactupe@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateToX("UPE Phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input phone page")
      thenIShouldNavigateToX("input phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I enter Phone Number as 1234569")
      andIEnterXAsX("Phone Number", "1234569") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateToX("NFM registration page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select No option and continue to next")
      andISelectXOptionAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Add further group details link")
      andIClickXLink("Add further group details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateToX("MNE or domestic page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateToX("Group accounting period page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter account period as:")
      val dateRangeDataSix: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataSix) // auto-chosen (score=1.00, SubscriptionJourneyStepsSteps.scala)

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

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateToX("Second Contact details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Contact address input page")
      thenIShouldNavigateToX("Contact address input page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address as:")
      val addressNine: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressNine) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateToX("Contact details Check answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click Check your answers before submitting your registration link")
      andIClickXLink("Check your answers before submitting your registration") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Review answers page")
      thenIShouldNavigateToX("Review answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Save&Continue button")
//      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration confirmation page")
      thenIShouldNavigateToX("Registration confirmation page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes link")
      andIClickXLink("report and manage your Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Registration In Progress page")
      thenIShouldBeOnX("Registration In Progress page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I refresh the registration in progress page")
      whenIRefreshTheRegistrationInProgressPage() // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
      thenIShouldBeOnX("Dashboard page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
