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
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._

class RFMSecurityErrorValidationsSpec extends BaseSpec with Matchers {

  Feature("RFM check your answers page") {

    Scenario("1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey") {
      Given("Organisation User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Organisation User")

      When("I provide RFM pillar2 id as XEPLR0123456400")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456400")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM journey recovery page")
      thenIShouldNavigateTo("RFM journey recovery page")

      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again")

      Then("I should be on RFM start page")
      thenIShouldBeOn("RFM start page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide RFM pillar2 id as XEPLR0123456222")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456222")

      Then("I should be on RFM Registration Date Page")
      thenIShouldBeOn("RFM Registration Date Page")

      When("Registration Day is entered as 27")
      andRegistrationXIsEnteredAsX("Day", "27")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM No record Match Error Page")
      thenIShouldNavigateTo("RFM No record Match Error Page")

      And("I select back link")
      andISelectBackLink()

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click change link for RFM Pillar 2 Top-up Taxes ID")
      andIClickChangeLinkForRFMX("Pillar 2 Top-up Taxes ID")

      And("I provide RFM pillar2 id as XEPLR0123456404")
      andIProvideRFMXAsX("pillar2 id", "XEPLR0123456404")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM No record Match Error Page")
      thenIShouldNavigateTo("RFM No record Match Error Page")

      And("I click go back to try again using different details. link")
      andIClickLink("go back to try again using different details.")

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOn("RFM enter pillar2 id page")

      And("I provide RFM pillar2 id as XMPLR0123456111")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456111")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("2 - Verify that system throws an error on generic failure from ETMP when calling Amend API in replacing rfm journey") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM pillar2 id as XMPLR0012345111")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0012345111")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOn("RFM Saving Progress Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      Then("I should be on New NFM guidance page")
      thenIShouldBeOn("New NFM guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOn("RFM Contact Guidance page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as 500")
      andIProvideRFMXAsX("contact name", "500")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressData)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to RFM processing page or Amend API error Page for RFM")
      thenIShouldBeRedirectedTo("RFM processing page", "Amend API error Page for RFM")

      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("3 - Verify Incomplete data error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      And("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I provide RFM New NFM Name as Test CYA")
      andIProvideRFMXAsX("New NFM Name", "Test CYA")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressData)

      And("I continue to RFM contact name Page")
      andIContinueToRFMContactNamePage()

      And("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressDataOne)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Change Second Contact Preference")
      andIClickChangeLinkForRFMX("Change Second Contact Preference")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM incomplete task error page")
      thenIShouldNavigateTo("RFM incomplete task error page")

      When("I click replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickLink("replace the filing member for a Pillar 2 Top-up Taxes account to try again")

      Then("I should be on RFM Final Review Page")
      thenIShouldBeOn("RFM Final Review Page")

    }

    Scenario("4 - Verify Security questions are not pre populated for RFM journey") {
      Given("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      givenXLogsInToRFMWithCredIdXForPillar2("Organisation User", "RFMSaveProgress")

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOn("RFM enter pillar2 id page")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOn("RFM Saving Progress Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position")

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOn("RFM Contact Guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      And("I click Sign out link")
      andIClickLink("Sign out")

      And("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      givenXLogsInToRFMWithCredIdXForPillar2("Organisation User", "RFMSaveProgress")

      Then("I access RFM start page")
      givenIAccessRFMXPage("start")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM enter pillar2 id page")
      thenIShouldBeOn("RFM enter pillar2 id page")

      Then("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      Then("I should be on RFM Registration Date Page")
      thenIShouldBeOn("RFM Registration Date Page")

      When("I enter registration date as:")
      val rfmDateDataOne: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateDataOne)

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOn("RFM Saving Progress Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I access RFM corporate position page")
      givenIAccessRFMXPage("corporate position")
    }
  }
}