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

class RFMnfmNoIDFlowSpec extends BaseSpec with Matchers {

  Feature("RFM CYA - NFM No ID flow") {

    Scenario("1 - Verify RFM journey for NFM No Id flow until check your answers page and validate that previously entered data is pre populated",AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Organisation User")

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

      Then("I should be on RFM Saving Progress Page")
      thenIShouldBeOn("RFM Saving Progress Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM Corp Position Page")
      thenIShouldBeOn("RFM Corp Position Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      Then("I should be on New NFM guidance page")
      thenIShouldBeOn("New NFM guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM registered in UK page")
      thenIShouldBeOn("RFM registered in UK page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to RFM New NFM Contact Name Page")
      thenIShouldNavigateTo("RFM New NFM Contact Name Page")

      When("I provide RFM New NFM Name as Test CYA")
      andIProvideRFMXAsX("New NFM Name", "Test CYA")

      Then("I should navigate to RFM New NFM Contact Address Page")
      thenIShouldNavigateTo("RFM New NFM Contact Address Page")

      And("I enter Address Line 1 as Address Line 1 CYA")
      andIEnterAs("Address Line 1", "Address Line 1 CYA")

      And("I enter City as City CYA")
      andIEnterAs("City", "City CYA")

      And("I enter Postal Code as EH5 5WY")
      andIEnterAs("Postal Code", "EH5 5WY")

      And("I enter Country as Australia")
      andIEnterAs("Country", "Australia")

      And("I click on Country selected")
      whenIClickOnCountrySelected("I click on Country selected")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM No ID CYA Page")
      thenIShouldBeOn("RFM No ID CYA Page")

      When("I click change link for RFM New NFM Name")
      andIClickChangeLinkForRFMX("New NFM Name")

      Then("I should navigate to RFM New NFM Contact Name Change")
      thenIShouldNavigateTo("RFM New NFM Contact Name Change")

      When("I provide RFM New NFM Name as New NFM Name Change")
      andIProvideRFMXAsX("New NFM Name", "New NFM Name Change")

      Then("I should navigate to RFM No ID Change CYA Page")
      thenIShouldNavigateTo("RFM No ID Change CYA Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Contact Guidance page")
      thenIShouldNavigateTo("RFM Contact Guidance page")

      And("I click Sign out link")
      andIClickLink("Sign out")

    }

    Scenario("2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey",AcceptanceTests) {
      Given("I clear the cache")
      thenIClearTheCache()

      When("Organisation User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Organisation User")

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

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      Then("I should navigate to RFM Contact Number Page")
      thenIShouldNavigateTo("RFM Contact Number Page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val rfmAddressData: Map[String, String] = Map(
        "addressLine1" -> "RFM Address Line 1",
        "addressLine3" -> "RFM City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )

      thenIEnterAddressAs(rfmAddressData)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM New NFM Name as Test CYA")
      andIProvideRFMXAsX("New NFM Name", "Test CYA")

      Then("I should navigate to RFM New NFM Contact Address Page")
      thenIShouldNavigateTo("RFM New NFM Contact Address Page")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 & CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressData)

      Then("I should be on RFM No ID CYA Page")
      thenIShouldBeOn("RFM No ID CYA Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on RFM No ID CYA Page")
      thenIShouldBeOn("RFM No ID CYA Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Input Name")
      andIClickChangeLinkForRFMX("Input Name")

      When("I provide RFM New NFM Name as Test Change")
      andIProvideRFMXAsX("New NFM Name", "Test Change")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Input Address")
      andIClickChangeLinkForRFMX("Input Address")

      And("I enter Address Line 1 as Address Line 1 Change")
      andIEnterAs("Address Line 1", "Address Line 1 Change")

      And("I enter City as City Change")
      andIEnterAs("City", "City Change")

      And("I enter Postal Code as EH75WK")
      andIEnterAs("Postal Code", "EH75WK")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      And("I should see row 3 value Address Line 1 Change")
      andIShouldSeeRowValue(3, "Address Line 1 Change")

      And("I should see row 3 value City Change")
      andIShouldSeeRowValue(3, "City Change")

      And("I should see row 3 value EH75WK")
      andIShouldSeeRowValue(3, "EH75WK")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirect to RFM processing page")
      thenIShouldBeRedirectTo("RFM processing page")

      And("I should be on RFM Confirmation Page")
      thenIShouldBeOn("RFM Confirmation Page")

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to RFM No Return Back Error Page")
      thenIShouldNavigateTo("RFM No Return Back Error Page")

      And("I click report and manage your Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("3 - Validating RFM Check your answers page navigations",AcceptanceTests) {
      Given("Organisation User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Organisation User")

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

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val rfmAddressData: Map[String, String] = Map(
        "addressLine1" -> "RFM Address Line 1",
        "addressLine3" -> "RFM City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(rfmAddressData)

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      And("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      Then("I should be on New NFM guidance page")
      thenIShouldBeOn("New NFM guidance page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM registered in UK page")
      thenIShouldBeOn("RFM registered in UK page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateTo("RFM UK limited Company GRSPage")

      When("I navigate back to RFM CYA Page from GRS Page")
      thenINavigateBackToRFMCYAPageFromGRSPage()

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on New NFM guidance page")
      thenIShouldBeOn("New NFM guidance page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM registered in UK page")
      thenIShouldBeOn("RFM registered in UK page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

    }

    Scenario("4 - Validating RFM Check your answers page for UPE/NFM journey Responses",AcceptanceTests) {
      Given("Organisation User logs in with rfm URL to Pillar2")
      givenXLogsInWithRfmURLToPillar2("Organisation User")

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

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      And("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val rfmAddressData: Map[String, String] = Map(
        "addressLine1" -> "RFM Address Line 1",
        "addressLine3" -> "RFM City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(rfmAddressData)

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option No and continue to next")
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

      Then("I should be on RFM No ID CYA Page")
      thenIShouldBeOn("RFM No ID CYA Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on RFM No ID CYA Page")
      thenIShouldBeOn("RFM No ID CYA Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Input Name")
      andIClickChangeLinkForRFMX("Input Name")

      When("I provide RFM New NFM Name as Test Change")
      andIProvideRFMXAsX("New NFM Name", "Test Change")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click change link for RFM Input Address")
      andIClickChangeLinkForRFMX("Input Address")

      And("I enter Address Line 1 as Address Line 1 Change")
      andIEnterAs("Address Line 1", "Address Line 1 Change")

      And("I enter City as City Change")
      andIEnterAs("City", "City Change")

      And("I enter Postal Code as EH75WK")
      andIEnterAs("Postal Code", "EH75WK")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      And("I should see details as below:")
      val addressChangeData: Map[String, String] = Map(
        "Address" -> "Address Line 1 Change\nCity Change\nEH75WK"
      )

      andIShouldSeeDetailsAsBelow(addressChangeData)

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      And("I should see row 1 value Ultimate Parent Entity (UPE)")
      andIShouldSeeRowValue(1, "Ultimate Parent Entity (UPE)")

      When("I click change link for RFM Corporate Position")
      andIClickChangeLinkForRFMX("Corporate Position")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Contact Detail Page")
      thenIShouldNavigateTo("RFM Contact Detail Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Contact Email Page")
      thenIShouldNavigateTo("RFM Contact Email Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Contact Number Page")
      thenIShouldNavigateTo("RFM Contact Number Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Second Contact Question Page")
      thenIShouldNavigateTo("RFM Second Contact Question Page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on RFM Contact Address Page")
      thenIShouldBeOn("RFM Contact Address Page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

    }

    Scenario("5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account",AcceptanceTests) {
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

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM test contact")
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

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirect to RFM processing page")
      thenIShouldBeRedirectTo("RFM processing page")

      And("I should be on RFM Confirmation Page")
      thenIShouldBeOn("RFM Confirmation Page")

      When("I click report and manage your group's Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your group's Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

    }

    Scenario("6 - Verify that UPE can replace existing FM on the Pillar 2 account",AcceptanceTests) {
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

      When("I select corp position as UPE")
      andISelectCorpPositionAsX("UPE")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM test contact")
      andIProvideRFMXAsX("contact name", "RFM test contact")

      When("I provide RFM contact email as rfm@email.com")
      andIProvideRFMXAsX("contact email", "rfm@email.com")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide RFM contact number as 01632960001")
      andIProvideRFMXAsX("contact number", "01632960001")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact name as RFM second test contact")
      andIProvideRFMXAsX("contact name", "RFM second test contact")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I provide RFM contact email as rfmsecondcontact@email.com")
      andIProvideRFMXAsX("contact email", "rfmsecondcontact@email.com")

      Then("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I provide RFM second contact number as 09872960001")
      andIProvideRFMXAsX("second contact number", "09872960001")

      When("I enter Address as:")
      val addressDataOne: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1 CYA",
        "addressLine3" -> "City CYA",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "Australia"
      )
      thenIEnterAddressAs(addressDataOne)

      When("I click on change link for Contact Name")
      andIClickOnChangeLinkFor("Contact Name")

      When("I enter Contact Name as 400")
      andIEnterAs("Contact Name", "400")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be redirected to RFM processing page or Amend API error Page for RFM")
      thenIShouldBeRedirectedTo("RFM processing page", "Amend API error Page for RFM")

      When("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      andIClickLink("to replace the filing member for a Pillar 2 Top-up Taxes account to try again")

      Then("I should navigate to RFM Final Review Page")
      thenIShouldNavigateTo("RFM Final Review Page")

      When("I click on change link for Contact Name")
      andIClickOnChangeLinkFor("Contact Name")

      When("I enter Contact Name as test name")
      andIEnterAs("Contact Name", "test name")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I should navigate to RFM Confirmation Page")
      thenIShouldNavigateTo("RFM Confirmation Page")

      When("I click report and manage your group's Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your group's Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")
    }
  }
}