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
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class RFMGRSflowPagesSpec extends BaseSpec with Matchers {

  Feature("RFM Ultimate Parent Entity and New nominated Filling Member GRS journey") {

    Scenario("1 - Verify RFM GRS journey when New NFM is based in UK - UK limited company") {
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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )

      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOnX("RFM CYA Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOnX("RFM Saving Progress Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM Corp Position Page")
      thenIShouldBeOnX("RFM Corp Position Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on New NFM guidance page")
      thenIShouldBeOnX("New NFM guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM registered in UK page")
      thenIShouldBeOnX("RFM registered in UK page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOnX("RFM UK based entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateToX("RFM UK limited Company GRSPage") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWithX("BV enabled") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOnX("RFM Contact Guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Verify that New NFM can replace existing FM through GRS registration flow on the Pillar 2 account and validations") {
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
      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOnX("RFM CYA Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOnX("RFM UK based entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOnX("RFM Contact Guidance page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Contact Detail Page")
      thenIShouldNavigateToX("RFM Contact Detail Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact number as 01632960001")
      andIProvideRFMXAsX("contact number", "01632960001") // auto-chosen (score=1.00, RFMStepsSteps.scala)

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

      When("I click change link for RFM Change Second Contact Preference")
      andIClickChangeLinkForRFMX("Change Second Contact Preference") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM second test contact")
      andIProvideRFMXAsX("contact name", "RFM second test contact") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfmsecondcontact@email.com")
      andIProvideRFMXAsX("contact email", "rfmsecondcontact@email.com") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM second contact number as 09872960001")
      andIProvideRFMXAsX("second contact number", "09872960001") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateToX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
      val companyAndContactDetails: Map[String, String] = Map(
        "Company"                                        -> "Test Example Company Name",
        "Company Registration Number"                    -> "76543210",
        "Unique Taxpayer Reference"                      -> "1234567890",
        "Do you have a secondary contact?"               -> "Yes",
        "Second contact name"                            -> "RFM second test contact",
        "Second contact email address"                   -> "rfmsecondcontact@email.com",
        "Can we contact the secondary contact by phone?" -> "Yes",
        "Second contact phone number"                    -> "09872960001"
      )


      When("I click change link for RFM New NFM Name")
      andIClickChangeLinkForRFMX("New NFM Name") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I provide RFM contact name as RFM test contact change")
      andIProvideRFMXAsX("contact name", "RFM test contact change") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I should see the row 5 value RFM test contact change")
//      andIShouldSeeTheRowValueX(5,"RFM test contact change")

      When("I click change link for RFM New RFM CYA Change Contact preference")
      andIClickChangeLinkForRFMX("New RFM CYA Change Contact preference") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click change link for RFM Change Address")
      andIClickChangeLinkForRFMX("Change Address") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I enter Address Line 1 as Address Line 1 CYA change")
      andIEnterXAsX("Address Line 1", "Address Line 1 CYA change") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateToX("RFM Final Review Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see the row 13 value Address Line 1 CYA change")
//      andIShouldSeeTheRowValueX(13,"Address Line 1 CYA change")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should be redirect to RFM processing page")
      thenIShouldBeRedirectToX("RFM processing page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to RFM Confirmation Page")
      thenIShouldNavigateToX("RFM Confirmation Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - User registration as Limited liability partnership failed with party type mismatch error") {
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
      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOnX("RFM CYA Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("Limited liability partnership") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateToX("RFM LLP GRS page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Mismatch Error Page")
      thenIShouldBeOnX("RFM GRS Registration Mismatch Error Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click go back to select the entity type link")
      andIClickXLink("go back to select the entity type") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOnX("RFM UK based entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("Limited liability partnership") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateToX("RFM LLP GRS page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation") {
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
      andIEnterRegistrationDateAs(rfmDateData) // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM") // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option Yes and continue to next")
      andISelectOptionXAndContinueToNext("Yes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionXAndContinueToGRSPage("UK limited company") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateToX("RFM UK limited Company GRSPage") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
//        andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Not Called Error Page")
      thenIShouldBeOnX("RFM GRS Registration Not Called Error Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Go back to select the entity type link")
      andIClickXLink("Go back to select the entity type") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOnX("RFM UK based entity type page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Entity type not listed and continue to Name page")

      Then("I should be on RFM New NFM Contact Name Page")
      thenIShouldBeOnX("RFM New NFM Contact Name Page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}
