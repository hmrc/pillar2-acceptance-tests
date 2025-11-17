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
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class RFMGRSflowPagesSpec extends BaseSpec with Matchers {

  Feature("RFM Ultimate Parent Entity and New nominated Filling Member GRS journey") {

    Scenario("1 - Verify RFM GRS journey when New NFM is based in UK - UK limited company",AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )

      andIEnterRegistrationDateAs(rfmDateData)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOn("RFM Saving Progress Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM Corp Position Page")
      thenIShouldBeOn("RFM Corp Position Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      Then("I should be on New NFM guidance page")
      thenIShouldBeOn("New NFM guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM registered in UK page")
      thenIShouldBeOn("RFM registered in UK page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateTo("RFM UK limited Company GRSPage")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOn("RFM Contact Guidance page")

    }

    Scenario("2 - Verify that New NFM can replace existing FM through GRS registration flow on the Pillar 2 account and validations",AcceptanceTests, ZapAccessibility) {
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

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM Contact Guidance page")
      thenIShouldBeOn("RFM Contact Guidance page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Contact Detail Page")
      thenIShouldNavigateTo("RFM Contact Detail Page")

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide RFM contact number as 01632960001")
      andIProvideRFMXAsX("contact number", "01632960001")

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

      When("I click change link for RFM Change Second Contact Preference")
      andIClickChangeLinkForRFMX("Change Second Contact Preference")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide RFM contact name as RFM second test contact")
      andIProvideRFMXAsX("contact name", "RFM second test contact")

      When("I provide RFM contact email as rfmsecondcontact@email.com")
      andIProvideRFMXAsX("contact email", "rfmsecondcontact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide RFM second contact number as 09872960001")
      andIProvideRFMXAsX("second contact number", "09872960001")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

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

      andIShouldSeeDetailsAsBelow(companyAndContactDetails)

      When("I click change link for RFM New NFM Name")
      andIClickChangeLinkForRFMX("New NFM Name")

      And("I provide RFM contact name as RFM test contact change")
      andIProvideRFMXAsX("contact name", "RFM test contact change")

      And("I should see the row 5 value RFM test contact change")
      andIShouldSeeTheRowValueX(5, "RFM test contact change")

      When("I click change link for RFM New RFM CYA Change Contact preference")
      andIClickChangeLinkForRFMX("New RFM CYA Change Contact preference")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I click change link for RFM Change Address")
      andIClickChangeLinkForRFMX("Change Address")

      And("I enter Address Line 1 as Address Line 1 CYA change")
      andIEnterAs("Address Line 1", "Address Line 1 CYA change")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      And("I should see the row 13 value Address Line 1 CYA change")
      andIShouldSeeTheRowValueX(13, "Address Line 1 CYA change")

      And("I should see Print this page link on Review answers page")
      andIShouldSeeLinkOn("Print this page", "Review answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I should be redirect to RFM processing page")
      thenIShouldBeRedirectTo("RFM processing page")

      Then("I should navigate to RFM Confirmation Page")
      thenIShouldNavigateTo("RFM Confirmation Page")

    }

    Scenario("3 - User registration as Limited liability partnership failed with party type mismatch error",AcceptanceTests) {
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

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateTo("RFM LLP GRS page")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Mismatch Error Page")
      thenIShouldBeOn("RFM GRS Registration Mismatch Error Page")

      When("I click go back to select the entity type link")
      andIClickLink("go back to select the entity type")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateTo("RFM LLP GRS page")

    }

    Scenario("4 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation",AcceptanceTests, ZapAccessibility) {
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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateTo("RFM UK limited Company GRSPage")

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Not Called Error Page")
      thenIShouldBeOn("RFM GRS Registration Not Called Error Page")

      When("I click Go back to select the entity type link")
      andIClickLink("Go back to select the entity type")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option Entity type not listed and continue to Name page")
      andISelectOptionXAndContinueToNamePage("Entity type not listed")

      Then("I should be on RFM New NFM Contact Name Page")
      thenIShouldBeOn("RFM New NFM Contact Name Page")
    }
  }
}