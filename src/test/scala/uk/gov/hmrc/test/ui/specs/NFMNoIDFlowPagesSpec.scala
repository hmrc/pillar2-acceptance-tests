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
import uk.gov.hmrc.test.ui.specpages.upe._
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class NFMNoIDFlowPagesSpec extends BaseSpec with Matchers {

  Feature("NFM NO ID journey") {

    Scenario("1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated") {
      Given("Organisation User logs in as upe with credId NFMCYA for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "upe",
        credId = "NFMCYA"
      )

      When("I select option Yes and continue to next")
      UPERegisteredInUkPage.registeredInUkYes()
      UPEEntityTypePage.selectEntityTypeUkLimitedCompany()
      UPECompanyUkGRSPage.clickRegistrationSuccessBvEnabled()

      When("I click Add filing member details link")
      andIClickXLink("Add filing member details") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateToX("NFM registration page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select Yes option and continue to next")
      andISelectXOptionAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM details page")
      thenIShouldNavigateToX("NFM details page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Name page")
      thenIShouldNavigateToX("NFM Name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM name as Test CYA")
      andIEnterXAsX("NFM name", "Test CYA") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Address page")
      thenIShouldNavigateToX("NFM Address page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> " Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to NFM Contact Name page")
      thenIShouldNavigateToX("NFM Contact Name page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Contact name as Contact CYA")
      andIEnterXAsX("NFM Contact name", "Contact CYA") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Contact Email page")
      thenIShouldNavigateToX("NFM Contact Email page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Contact Email as testcya@email.com")
      andIEnterXAsX("NFM Contact Email", "testcya@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateToX("NFM Phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to input nfm phone page")
      thenIShouldNavigateToX("input nfm phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter NFM Phone Number as 1234569")
      andIEnterXAsX("NFM Phone Number", "1234569") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to NFM Check your answers page")
      thenIShouldNavigateToX("NFM Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
      val detailsMap: Map[String, String] = Map(
        "Name"                     -> "Test CYA",
        "Address"                  -> "United Arab Emirates",
        "Contact name"             -> "Contact CYA",
        "Email address"            -> "testcya@email.com",
        "Can we contact by phone?" -> "Yes",
        "Phone number"             -> "1234569"
      )

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to input nfm phone page")
      thenIShouldNavigateToX("input nfm phone page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on NFM Check your answers page")
      thenIShouldBeOnX("NFM Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Task list page")
      thenIShouldBeOnX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
