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
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.specstepdef.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class NFMNoIDFlowPagesSpec extends BaseSpec with Matchers {

  Feature("NFM NO ID journey") {

    Scenario("1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId NFMCYA for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "NFMCYA")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Name page")
        thenIShouldNavigateToX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM name as Test CYA")
        andIEnterXAsX("NFM name", "Test CYA")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Address page")
        thenIShouldNavigateToX("NFM Address page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> " Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Contact Name page")
        thenIShouldNavigateToX("NFM Contact Name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Contact name as Contact CYA")
        andIEnterXAsX("NFM Contact name", "Contact CYA")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Contact Email page")
        thenIShouldNavigateToX("NFM Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Contact Email as testcya@email.com")
        andIEnterXAsX("NFM Contact Email", "testcya@email.com")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Phone page")
        thenIShouldNavigateToX("NFM Phone page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input nfm phone page")
        thenIShouldNavigateToX("input nfm phone page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Phone Number as 1234569")
        andIEnterXAsX("NFM Phone Number", "1234569")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Check your answers page")
        thenIShouldNavigateToX("NFM Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
        val detailsMap: Map[String, String] = Map(
          "Name"                     -> "Test CYA",
          "Address"                  -> "United Arab Emirates",
          "Contact name"             -> "Contact CYA",
          "Email address"            -> "testcya@email.com",
          "Can we contact by phone?" -> "Yes",
          "Phone number"             -> "1234569"
        )
        andIShouldSeeDetailsAsBelow(detailsMap)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to input nfm phone page")
        thenIShouldNavigateToX("input nfm phone page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM Check your answers page")
        thenIShouldBeOnX("NFM Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("The Task Edit filing member details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit filing member details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

    }

    Scenario("2 - Validate different error messages for NFM no ID journey pages") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Name page")
        thenIShouldNavigateToX("NFM Name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM name as Test nfmName")
        andIEnterXAsX("NFM name", "Test nfmName")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Address page")
        thenIShouldNavigateToX("NFM Address page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address Line 1 as Test Address Line 1")
        andIEnterXAsX("Address Line 1", "Test Address Line 1")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Address Line 2 as Test Address Line 2")
        andIEnterXAsX("Address Line 2", "Test Address Line 2")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Region as Region")
        andIEnterXAsX("Region", "Region")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter City as Test City")
        andIEnterXAsX("City", "Test City")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I enter Postal Code as 1334445")
        andIEnterXAsX("Postal Code", "1334445")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Country as Australia")
        andIEnterXAsX("Country", "Australia")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Country selected")
        whenIClickOnCountrySelected("I click on Country selected")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Contact Name page")
        thenIShouldNavigateToX("NFM Contact Name page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Contact name as NFM Contact")
        andIEnterXAsX("NFM Contact name", "NFM Contact")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Contact Email page")
        thenIShouldNavigateToX("NFM Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I enter NFM Contact Email as test@email.com")
        andIEnterXAsX("NFM Contact Email", "test@email.com")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Phone page")
        thenIShouldNavigateToX("NFM Phone page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input nfm phone page")
        thenIShouldNavigateToX("input nfm phone page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter NFM Phone Number as 9923-456")
        andIEnterXAsX("NFM Phone Number", "9923-456")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      When("I click on change hyperlink next to the NFM Phone Contact")
        andIClickOnChangeHyperlinkNextToTheX("NFM Phone Contact")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see row 5 value No")
        andIShouldSeeRowValue(5,"No")

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should see the answer No remain selected")
        andIShouldSeeTheAnswerXRemainSelected("No")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("The Task Edit filing member details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit filing member details", "Completed")  // auto-chosen (score=1.00, TaskListStepsSteps.scala)

    }
  }
}
