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
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._
import uk.gov.hmrc.test.ui.tags.Wip

class RFMSecurityErrorValidationsSpec extends BaseSpec with Matchers {

  Feature("RFM check your answers page") {

    Scenario("1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey") {
      Given("Organisation User logs in with rfm URL to Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "rfm-start"
      )

      When("I provide RFM pillar2 id as XEPLR0123456400")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456400") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM journey recovery page")
      thenIShouldNavigateToX("RFM journey recovery page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickXLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM start page")
      thenIShouldBeOnX("RFM start page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide RFM pillar2 id as XEPLR0123456222")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456222") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM Registration Date Page")
      thenIShouldBeOnX("RFM Registration Date Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("Registration Day is entered as 27")
      andRegistrationXIsEnteredAsX("Day", "27") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM No record Match Error Page")
      thenIShouldNavigateToX("RFM No record Match Error Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOnX("RFM CYA Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Pillar 2 Top-up Taxes ID")
      andIClickChangeLinkForRFMX("Pillar 2 Top-up Taxes ID") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I provide RFM pillar2 id as XEPLR0123456404")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456404") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM No record Match Error Page")
      thenIShouldNavigateToX("RFM No record Match Error Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click go back to try again using different details. link")
      andIClickXLink("go back to try again using different details.") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOnX("RFM enter pillar2 id page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide RFM pillar2 id as XMPLR0123456111")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456111") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click Sign out link")
      andIClickXLink("Sign out") // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("2 - Verify that system throws an error on generic failure from ETMP when calling Amend API in replacing rfm journey") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("I access RFM start page")
      givenIAccessRFMXPage("start") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0012345111")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0012345111") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOnX("RFM Saving Progress Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on New NFM guidance page")
      thenIShouldBeOnX("New NFM guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOnX("RFM Contact Guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as 500")
      andIProvideRFMXAsX("contact name", "500") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressData) // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateToX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to RFM processing page or Amend API error Page for RFM")
//        thenIShouldBeRedirectedTo("RFM processing page","Amend API error Page for RFM")

      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickXLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateToX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
      andIClickXLink("Sign out") // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("3 - Verify Incomplete data error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("I access RFM start page")
      givenIAccessRFMXPage("start") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      And("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM New NFM Name as Test CYA")
      andIProvideRFMXAsX("New NFM Name", "Test CYA") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressData)

      And("I continue to RFM contact name Page")
      andIContinueToRFMContactNamePage() // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateToX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Change Second Contact Preference")
      andIClickChangeLinkForRFMX("Change Second Contact Preference") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM incomplete task error page")
      thenIShouldNavigateToX("RFM incomplete task error page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickXLink("replace the filing member for a Pillar 2 Top-up Taxes account to try again") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM Final Review Page")
      thenIShouldBeOnX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - Verify Security questions are not pre populated for RFM journey") {
      Given("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "rfm",
        credId = "RFMSaveProgress"
      )

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOnX("RFM enter pillar2 id page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOnX("RFM Saving Progress Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
      andISelectBackLink() // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOnX("RFM CYA Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOnX("RFM Contact Guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click Sign out link")
      andIClickXLink("Sign out") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      login(
        userType = "Organisation",
        pageUrl = "rfm",
        credId = "RFMSaveProgress"
      )

      Then("I access RFM start page")
      givenIAccessRFMXPage("start") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOnX("RFM enter pillar2 id page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM Registration Date Page")
      thenIShouldBeOnX("RFM Registration Date Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateDataOne: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateDataOne)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOnX("RFM Saving Progress Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position") // auto-chosen (score=1.00, RFMStepsSteps.scala)

    }
  }
}
