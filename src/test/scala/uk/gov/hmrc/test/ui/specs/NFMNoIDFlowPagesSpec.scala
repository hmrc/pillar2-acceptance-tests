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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class NFMNoIDFlowPagesSpec extends BaseSpec with Matchers {

  Feature("NFM NO ID journey") {

    Scenario("1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId NFMCYA for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "NFMCYA")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to NFM Name page")
      thenIShouldNavigateTo("NFM Name page")

      When("I enter NFM name as Test CYA")
      andIEnterAs("NFM name", "Test CYA")

      Then("I should navigate to NFM Address page")
      thenIShouldNavigateTo("NFM Address page")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> " Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to NFM Contact Name page")
      thenIShouldNavigateTo("NFM Contact Name page")

      When("I enter NFM Contact name as Contact CYA")
      andIEnterAs("NFM Contact name", "Contact CYA")

      Then("I should navigate to NFM Contact Email page")
      thenIShouldNavigateTo("NFM Contact Email page")

      When("I enter NFM Contact Email as testcya@email.com")
      andIEnterAs("NFM Contact Email", "testcya@email.com")

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateTo("NFM Phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to input nfm phone page")
      thenIShouldNavigateTo("input nfm phone page")

      When("I enter NFM Phone Number as 1234569")
      andIEnterAs("NFM Phone Number", "1234569")

      Then("I should navigate to NFM Check your answers page")
      thenIShouldNavigateTo("NFM Check your answers page")

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
      andISelectBackLink()

      Then("I should navigate to input nfm phone page")
      thenIShouldNavigateTo("input nfm phone page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on NFM Check your answers page")
      thenIShouldBeOn("NFM Check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      And("The Task Edit filing member details status should be Completed")
      andTheTaskStatusShouldBe("Edit filing member details", "Completed")

    }

    Scenario("2 - Validate different error messages for NFM no ID journey pages") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      And("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to NFM Name page")
      thenIShouldNavigateTo("NFM Name page")

      When("I enter NFM name as Test nfmName")
      andIEnterAs("NFM name", "Test nfmName")

      Then("I should navigate to NFM Address page")
      thenIShouldNavigateTo("NFM Address page")

      When("I enter Address Line 1 as Test Address Line 1")
      andIEnterAs("Address Line 1", "Test Address Line 1")

      And("I enter Address Line 2 as Test Address Line 2")
      andIEnterAs("Address Line 2", "Test Address Line 2")

      And("I enter Region as Region")
      andIEnterAs("Region", "Region")

      And("I enter City as Test City")
      andIEnterAs("City", "Test City")

      When("I enter Postal Code as 1334445")
      andIEnterAs("Postal Code", "1334445")

      And("I enter Country as Australia")
      andIEnterAs("Country", "Australia")

      And("I click on Country selected")
      whenIClickOnCountrySelected("I click on Country selected")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to NFM Contact Name page")
      thenIShouldNavigateTo("NFM Contact Name page")

      When("I enter NFM Contact name as NFM Contact")
      andIEnterAs("NFM Contact name", "NFM Contact")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to NFM Contact Email page")
      thenIShouldNavigateTo("NFM Contact Email page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I enter NFM Contact Email as test@email.com")
      andIEnterAs("NFM Contact Email", "test@email.com")

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateTo("NFM Phone page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to input nfm phone page")
      thenIShouldNavigateTo("input nfm phone page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter NFM Phone Number as 9923-456")
      andIEnterAs("NFM Phone Number", "9923-456")

      When("I click on change hyperlink next to the NFM Phone Contact")
      andIClickOnChangeHyperlinkNextToThe("NFM Phone Contact")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I should see row 5 value No")
      andIShouldSeeRowValue(5, "No")

      And("I select back link")
      andISelectBackLink()

      Then("I should see the answer No remain selected")
      andIShouldSeeTheAnswerXRemainSelected("No")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("The Task Edit filing member details status should be Completed")
      andTheTaskStatusShouldBe("Edit filing member details", "Completed")
    }
  }
}