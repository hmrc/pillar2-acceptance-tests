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
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class RFMnfmNoIDFlowSpec extends BaseSpec with Matchers {

  Feature("RFM CYA - NFM No ID flow") {

    Scenario("1 - Verify RFM journey for NFM No Id flow until check your answers page and validate that previously entered data is pre populated") {
      Given("Organisation User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Organisation User")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
        val rfmDateData: Map[String, String] = Map(
          "rfmRegistrationDate.day"   -> "31",
          "rfmRegistrationDate.month" -> "1",
          "rfmRegistrationDate.year"  -> "2024"
        )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on RFM CYA Page")
        thenIShouldBeOnX("RFM CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
        thenIShouldBeOnX("RFM Saving Progress Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM Corp Position Page")
        thenIShouldBeOnX("RFM Corp Position Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on New NFM guidance page")
        thenIShouldBeOnX("New NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM registered in UK page")
        thenIShouldBeOnX("RFM registered in UK page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM New NFM Contact Name Page")
        thenIShouldNavigateToX("RFM New NFM Contact Name Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide RFM New NFM Name as Test CYA")
        andIProvideRFMXAsX("New NFM Name", "Test CYA")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM New NFM Contact Address Page")
        thenIShouldNavigateToX("RFM New NFM Contact Address Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I enter Address Line 1 as Address Line 1 CYA")
        andIEnterXAsX("Address Line 1", "Address Line 1 CYA")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter City as City CYA")
        andIEnterXAsX("City", "City CYA")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Postal Code as EH5 5WY")
        andIEnterXAsX("Postal Code", "EH5 5WY")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Country as Australia")
        andIEnterXAsX("Country", "Australia")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Country selected")
        whenIClickOnCountrySelected("I click on Country selected")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM No ID CYA Page")
        thenIShouldBeOnX("RFM No ID CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM New NFM Name")
        andIClickChangeLinkForRFMX("New NFM Name")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM New NFM Contact Name Change")
        thenIShouldNavigateToX("RFM New NFM Contact Name Change")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I provide RFM New NFM Name as New NFM Name Change")
        andIProvideRFMXAsX("New NFM Name", "New NFM Name Change")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM No ID Change CYA Page")
        thenIShouldNavigateToX("RFM No ID Change CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Contact Guidance page")
        thenIShouldNavigateToX("RFM Contact Guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

    }

    Scenario("2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("Organisation User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Organisation User")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
        val rfmDateData: Map[String, String] = Map(
          "rfmRegistrationDate.day"   -> "31",
          "rfmRegistrationDate.month" -> "1",
          "rfmRegistrationDate.year"  -> "2024"
        )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as UPE")
        andISelectCorpPositionAsX("UPE")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
        andIProvideRFMXAsX("contact name", "RFM test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
        andIProvideRFMXAsX("contact email", "rfm@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM Contact Number Page")
        thenIShouldNavigateToX("RFM Contact Number Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
        val rfmAddressData: Map[String, String] = Map(
          "addressLine1" -> "RFM Address Line 1",
          "addressLine3" -> "RFM City",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "United Kingdom"
        )

        thenIEnterAddressAs(rfmAddressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM New NFM Name as Test CYA")
        andIProvideRFMXAsX("New NFM Name", "Test CYA")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM New NFM Contact Address Page")
        thenIShouldNavigateToX("RFM New NFM Contact Address Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I enter Address as:")
        val addressData: Map[String, String] = Map(
          "addressLine1" -> "Address Line 1 & CYA",
          "addressLine3" -> "City CYA",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "Australia"
        )
      thenIEnterAddressAs(addressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM No ID CYA Page")
        thenIShouldBeOnX("RFM No ID CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM No ID CYA Page")
        thenIShouldBeOnX("RFM No ID CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Input Name")
        andIClickChangeLinkForRFMX("Input Name")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM New NFM Name as Test Change")
        andIProvideRFMXAsX("New NFM Name", "Test Change")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Input Address")
        andIClickChangeLinkForRFMX("Input Address")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I enter Address Line 1 as Address Line 1 Change")
        andIEnterXAsX("Address Line 1", "Address Line 1 Change")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter City as City Change")
        andIEnterXAsX("City", "City Change")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Postal Code as EH75WK")
        andIEnterXAsX("Postal Code", "EH75WK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see row 3 value Address Line 1 Change")
        andIShouldSeeRowValue(3,"Address Line 1 Change")

      And("I should see row 3 value City Change")
        andIShouldSeeRowValue(3,"City Change")

      And("I should see row 3 value EH75WK")
        andIShouldSeeRowValue(3,"EH75WK")

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirect to RFM processing page")
        thenIShouldBeRedirectToX("RFM processing page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should be on RFM Confirmation Page")
        thenIShouldBeOnX("RFM Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM No Return Back Error Page")
        thenIShouldNavigateToX("RFM No Return Back Error Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("3 - Validating RFM Check your answers page navigations") {
      Given("Organisation User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Organisation User")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
        val rfmDateData: Map[String, String] = Map(
          "rfmRegistrationDate.day"   -> "31",
          "rfmRegistrationDate.month" -> "1",
          "rfmRegistrationDate.year"  -> "2024"
        )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as UPE")
        andISelectCorpPositionAsX("UPE")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
        andIProvideRFMXAsX("contact name", "RFM test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
        andIProvideRFMXAsX("contact email", "rfm@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
        val rfmAddressData: Map[String, String] = Map(
          "addressLine1" -> "RFM Address Line 1",
          "addressLine3" -> "RFM City",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "United Kingdom"
        )
        thenIEnterAddressAs(rfmAddressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should be on New NFM guidance page")
        thenIShouldBeOnX("New NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM registered in UK page")
        thenIShouldBeOnX("RFM registered in UK page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
        thenIShouldBeOnX("RFM UK based entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM UK limited Company GRSPage")
        thenIShouldNavigateToX("RFM UK limited Company GRSPage")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I navigate back to RFM CYA Page from GRS Page")
        thenINavigateBackToRFMCYAPageFromGRSPage()  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on New NFM guidance page")
        thenIShouldBeOnX("New NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM registered in UK page")
        thenIShouldBeOnX("RFM registered in UK page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM UK based entity type page")
        thenIShouldBeOnX("RFM UK based entity type page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("4 - Validating RFM Check your answers page for UPE/NFM journey Responses") {
      Given("Organisation User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Organisation User")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
        val rfmDateData: Map[String, String] = Map(
          "rfmRegistrationDate.day"   -> "31",
          "rfmRegistrationDate.month" -> "1",
          "rfmRegistrationDate.year"  -> "2024"
        )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      And("I access RFM corporate position page")
        givenIAccessRFMXPage("corporate position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as UPE")
        andISelectCorpPositionAsX("UPE")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
        andIProvideRFMXAsX("contact name", "RFM test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
        andIProvideRFMXAsX("contact email", "rfm@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
        val rfmAddressData: Map[String, String] = Map(
          "addressLine1" -> "RFM Address Line 1",
          "addressLine3" -> "RFM City",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "United Kingdom"
        )
        thenIEnterAddressAs(rfmAddressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM New NFM Name as Test CYA")
        andIProvideRFMXAsX("New NFM Name", "Test CYA")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter Address as:")
        val addressData: Map[String, String] = Map(
          "addressLine1" -> "Address Line 1 CYA",
          "addressLine3" -> "City CYA",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "Australia"
        )
        thenIEnterAddressAs(addressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM No ID CYA Page")
        thenIShouldBeOnX("RFM No ID CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should be on RFM No ID CYA Page")
        thenIShouldBeOnX("RFM No ID CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Input Name")
        andIClickChangeLinkForRFMX("Input Name")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM New NFM Name as Test Change")
        andIProvideRFMXAsX("New NFM Name", "Test Change")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click change link for RFM Input Address")
        andIClickChangeLinkForRFMX("Input Address")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I enter Address Line 1 as Address Line 1 Change")
        andIEnterXAsX("Address Line 1", "Address Line 1 Change")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter City as City Change")
        andIEnterXAsX("City", "City Change")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I enter Postal Code as EH75WK")
        andIEnterXAsX("Postal Code", "EH75WK")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see details as below:")
      val addressChangeData: Map[String, String] = Map(
        "Address" -> "Address Line 1 Change\nCity Change\nEH75WK"
      )

      andIShouldSeeDetailsAsBelow(addressChangeData)  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as UPE")
        andISelectCorpPositionAsX("UPE")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I should see row 1 value Ultimate Parent Entity (UPE)")
        andIShouldSeeRowValue(1,"Ultimate Parent Entity (UPE)")

      When("I click change link for RFM Corporate Position")
        andIClickChangeLinkForRFMX("Corporate Position")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should navigate to RFM UK limited Company GRSPage")
        thenIShouldNavigateToX("RFM UK limited Company GRSPage")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
        thenIShouldBeOnX("RFM Contact Guidance page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Contact Detail Page")
        thenIShouldNavigateToX("RFM Contact Detail Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Contact Email Page")
        thenIShouldNavigateToX("RFM Contact Email Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Contact Number Page")
        thenIShouldNavigateToX("RFM Contact Number Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Second Contact Question Page")
        thenIShouldNavigateToX("RFM Second Contact Question Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on RFM Contact Address Page")
        thenIShouldBeOnX("RFM Contact Address Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
        val rfmDateData: Map[String, String] = Map(
          "rfmRegistrationDate.day"   -> "31",
          "rfmRegistrationDate.month" -> "1",
          "rfmRegistrationDate.year"  -> "2024"
        )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as NFM")
        andISelectCorpPositionAsX("NFM")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM New NFM Name as Test CYA")
        andIProvideRFMXAsX("New NFM Name", "Test CYA")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
        thenIEnterAddressAs(addressData)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
        andIProvideRFMXAsX("contact name", "RFM test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
        andIProvideRFMXAsX("contact email", "rfm@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I enter Address as:")
        val addressDataOne: Map[String, String] = Map(
          "addressLine1" -> "Address Line 1 CYA",
          "addressLine3" -> "City CYA",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "Australia"
        )
        thenIEnterAddressAs(addressDataOne)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirect to RFM processing page")
        thenIShouldBeRedirectToX("RFM processing page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should be on RFM Confirmation Page")
        thenIShouldBeOnX("RFM Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click report and manage your group's Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your group's Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("6 - Verify that UPE can replace existing FM on the Pillar 2 account") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
        andIEnterRegistrationDateAs(rfmDateData)  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Save&Continue button")
        andIClickOnSaveContinueButton()

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select corp position as UPE")
        andISelectCorpPositionAsX("UPE")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM test contact")
        andIProvideRFMXAsX("contact name", "RFM test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I provide RFM contact email as rfm@email.com")
        andIProvideRFMXAsX("contact email", "rfm@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact number as 01632960001")
        andIProvideRFMXAsX("contact number", "01632960001")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      And("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact name as RFM second test contact")
        andIProvideRFMXAsX("contact name", "RFM second test contact")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM contact email as rfmsecondcontact@email.com")
        andIProvideRFMXAsX("contact email", "rfmsecondcontact@email.com")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      Then("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I provide RFM second contact number as 09872960001")
        andIProvideRFMXAsX("second contact number", "09872960001")  // auto-chosen (score=1.00, RFMStepsSteps.scala)

      When("I enter Address as:")
        val addressDataOne: Map[String, String] = Map(
          "addressLine1" -> "Address Line 1 CYA",
          "addressLine3" -> "City CYA",
          "postalCode"   -> "EH5 5WY",
          "countryCode"  -> "Australia"
        )
        thenIEnterAddressAs(addressDataOne)  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Name as 400")
        andIEnterXAsX("Contact Name", "400")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be redirected to RFM processing page or Amend API error Page for RFM")
        thenIShouldBeRedirectedTo("RFM processing page","Amend API error Page for RFM")

      When("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
        andIClickXLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to RFM Final Review Page")
        thenIShouldNavigateToX("RFM Final Review Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYAStepsSteps.scala)

      When("I enter Contact Name as test name")
        andIEnterXAsX("Contact Name", "test name")  // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should navigate to RFM Confirmation Page")
        thenIShouldNavigateToX("RFM Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click report and manage your group's Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your group's Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }
  }
}