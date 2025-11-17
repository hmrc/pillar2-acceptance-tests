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
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.SubscriptionJourneyStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps._

class ContactDetailsAndRegistrationSpec extends BaseSpec with Matchers {

  Feature("Contact details for the filing member") {

    Scenario("1 - Create a new subscription with UPE NoID Flow and NFM No Id flow to validate Contact Details", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in as upe with credId ContactDetails for Pillar2")
      givenLogsInAsUpeWithCredIdForPillar2("Organisation User", "ContactDetails")

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I enter UPE name as Test")
      andIEnterAs("UPE name", "Test")

      When("I enter Address as:")
      val addressData: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressData)

      When("I enter UPE Person/Team name as UPE Test")
      andIEnterAs("UPE Person/Team name", "UPE Test")

      When("I enter UPE Email address as test&upe@email.com")
      andIEnterAs("UPE Email address", "test&upe@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I enter Phone Number as 123456")
      andIEnterAs("Phone Number", "123456")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeDataOne: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataOne)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("The Task Add contact details status should be Not started")
      andTheTaskStatusShouldBe("Add contact details", "Not started")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      And("The caption must be Contact details")
      thenTheCaptionMustBe("Contact details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateTo("Contact details display page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Contact details input name page")
      thenIShouldNavigateTo("Contact details input name page")

      And("The caption must be Contact details")
      thenTheCaptionMustBe("Contact details")

      When("I enter Contact Name as Contact Name Test")
      andIEnterAs("Contact Name", "Contact Name Test")

      Then("I should navigate to Contact details input email page")
      thenIShouldNavigateTo("Contact details input email page")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      Then("I should navigate to Contact details phone page")
      thenIShouldNavigateTo("Contact details phone page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Contact details phone page")
      thenIShouldNavigateTo("Contact details phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Contact details input phone page")
      thenIShouldNavigateTo("Contact details input phone page")

      When("I enter Contact Phone as 1234554")
      andIEnterAs("Contact Phone", "1234554")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Contact address input page")
      thenIShouldNavigateTo("Contact address input page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact name page")
      thenIShouldNavigateTo("Second Contact name page")

      When("I enter Second Contact Name as Second Contact Name Test")
      andIEnterAs("Second Contact Name", "Second Contact Name Test")

      Then("I should navigate to Second Contact email page")
      thenIShouldNavigateTo("Second Contact email page")

      When("I enter Second Contact Email as secondContact@email.com")
      andIEnterAs("Second Contact Email", "secondContact@email.com")

      Then("I should navigate to Second Contact number page")
      thenIShouldNavigateTo("Second Contact number page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact Input page")
      thenIShouldNavigateTo("Second Contact Input page")

      When("I enter Second Contact Input as 1234554")
      andIEnterAs("Second Contact Input", "1234554")

      Then("I should navigate to Contact address input page")
      thenIShouldNavigateTo("Contact address input page")

      When("I enter Address as:")
      val addressDatatwo: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDatatwo)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Contact address input page")
      thenIShouldBeOn("Contact address input page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Second Contact Input page")
      thenIShouldBeOn("Second Contact Input page")

      When("I select back link")
      andISelectBackLink()

      Then("I should be on Second Contact number page")
      thenIShouldBeOn("Second Contact number page")

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateTo("Contact details display page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I select back link")
      andISelectBackLink()

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")
    }

//    Scenario("2 - Check you Answers Page Validations") {
//      Given("Organisation User navigates to Contact Details check your answer page with credId ContactDetails")
//      givenOrganisationUserNavigatesToCheckYourAnswerPageWithCredId("Contact Details", "ContactDetails")
//
//      Then("I should be on Contact details Check answers page")
//      thenIShouldBeOn("Contact details Check answers page")
//
//      When("I click on change link for Contact Name")
//      andIClickOnChangeLinkFor("Contact Name")
//
//      And("I enter Contact Name as Contact $ Name Change")
//      andIEnterAs("Contact Name", "Contact $ Name Change")
//
//      Then("I should navigate to Contact details Check answers page")
//      thenIShouldNavigateTo("Contact details Check answers page")
//
//      When("I click on change link for Email address")
//      andIClickOnChangeLinkFor("Email address")
//
//      And("I enter Contact Email as email&change@test.com")
//      andIEnterAs("Contact Email", "email&change@test.com")
//
//      Then("I should navigate to Contact details Check answers page")
//      thenIShouldNavigateTo("Contact details Check answers page")
//
//      When("I click on change link for Phone number")
//      andIClickOnChangeLinkFor("Phone number")
//
//      And("I enter Contact Phone as 1234555")
//      andIEnterAs("Contact Phone", "1234555")
//
//      When("I click on change link for Second Contact Name")
//      andIClickOnChangeLinkFor("Second Contact Name")
//
//      And("I enter Second Contact Name as Second Contact Name Change")
//      andIEnterAs("Second Contact Name", "Second Contact Name Change")
//
//      When("I click on change link for Second Contact Email")
//      andIClickOnChangeLinkFor("Second Contact Email")
//
//      And("I enter Second Contact Email as secondContact&change@email.com")
//      andIEnterAs("Second Contact Email", "secondContact&change@email.com")
//
//      When("I click on change link for Second Contact Phone number")
//      andIClickOnChangeLinkFor("Second Contact Phone number")
//
//      And("I enter Contact Phone as 71235643")
//      andIEnterAs("Contact Phone", "71235643")
//
//      When("I click on change link for Address")
//      andIClickOnChangeLinkFor("Address")
//
//      And("I enter Address Line 1 as Address Change")
//      andIEnterAs("Address Line 1", "Address Change")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should see details as below:")
//      val contactDetailsData: Map[String, String] = Map(
//        "Contact name"                                   -> "Contact $ Name Change",
//        "Email address"                                  -> "email&change@test.com",
//        "Primary phone number"                           -> "1234555",
//        "Second contact name"                            -> "Second Contact Name Change",
//        "Second contact email address"                   -> "secondContact&change@email.com",
//        "Can we contact the secondary contact by phone?" -> "Yes",
//        "Second contact phone number"                    -> "71235643",
//        "Address"                                        -> "Address Change"
//      )
//      andIShouldSeeDetailsAsBelow(contactDetailsData)
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      When("I click Check your answers before submitting your registration link")
//      andIClickLink("Check your answers before submitting your registration")
//
//      Then("I should be on Review answers page")
//      thenIShouldBeOn("Review answers page")
//
//      And("I should see details as below:")
//      val detailsMap: Map[String, String] = Map(
//        "Name"                                          -> "Test",
//        "Address"                                       -> "United Arab Emirates",
//        "Contact name"                                  -> "UPE Test",
//        "Email address"                                 -> "test&upe@email.com",
//        "Can we contact by phone?"                      -> "Yes",
//        "Phone number"                                  -> "123456",
//        "Is there a nominated filing member"            -> "No",
//        "Where are the entities in your group located?" -> "In the UK and outside the UK",
//        "Start date"                                    -> "15 January 2024",
//        "End date"                                      -> "15 January 2025",
//        "Do you have a second contact?"                 -> "Yes",
//        "Second contact name"                           -> "Second Contact Name Change",
//        "Second contact email address"                  -> "secondContact&change@email.com",
//        "Second contact phone number"                   -> "71235643"
//      )
//      andIShouldSeeDetailsAsBelow(detailsMap)
//
//      And("I should see row 12 with key Contact name and value Contact $ Name Change")
//      andIShouldSeeRowWithKeyAndValue(12, "Contact name", "Contact $ Name Change")
//
//      And("I should see row 13 with key Email address and value email&change@test.com")
//      andIShouldSeeRowWithKeyAndValue(13, "Email address", "email&change@test.com")
//
//      And("I should see row 14 with key Can we contact the primary contact by phone? and value Yes")
//      andIShouldSeeRowWithKeyAndValue(14, "Can we contact the primary contact by phone?", "Yes")
//
//      And("I should see row 15 with key Primary phone number and value 123455")
//      andIShouldSeeRowWithKeyAndValue(15, "Primary phone number", "123455")
//
//      And("I should see row 19 with key Can we contact the secondary contact by phone? and value Yes")
//      andIShouldSeeRowWithKeyAndValue(19, "Can we contact the secondary contact by phone?", "Yes")
//
//      And("I should see row 21 with key Address and value Address Change")
//      andIShouldSeeRowWithKeyAndValue(21, "Address", "Address Change")
//
//      When("I click Report Pillar 2 Top-up Taxes link")
//      andIClickLink("Report Pillar 2 Top-up Taxes")
//
//      Then("I should navigate to Task list page")
//      thenIShouldNavigateTo("Task list page")
//
//      When("I click Edit contact details link")
//      andIClickLink("Edit contact details")
//
//      Then("I should navigate to Contact details guidance page")
//      thenIShouldNavigateTo("Contact details guidance page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should navigate to Contact details display page")
//      thenIShouldNavigateTo("Contact details display page")
//
//      When("I select option Yes and continue to next")
//      andISelectOptionAndContinueToNext("Yes")
//
//      Then("I should navigate to Second Contact details page")
//      thenIShouldNavigateTo("Second Contact details page")
//
//      When("I select option No and continue to next")
//      andISelectOptionAndContinueToNext("No")
//
//      Then("I should navigate to Contact address input page")
//      thenIShouldNavigateTo("Contact address input page")
//
//      When("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      Then("I should be on Contact details Check answers page")
//      thenIShouldBeOn("Contact details Check answers page")
//
//      And("I click on Continue button")
//      whenIClickOnContinueButton("I click on Continue button")
//
//      When("I click Check your answers before submitting your registration link")
//      andIClickLink("Check your answers before submitting your registration")
//
//      Then("I should be on Review answers page")
//      thenIShouldBeOn("Review answers page")
//    }

    Scenario("3 - Contact details pages Error validations and Registration Confirmation Page Validations",AcceptanceTests, ZapAccessibility) {
      Given("I clear the cache")
      thenIClearTheCache()

      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I enter UPE name as Test")
      andIEnterAs("UPE name", "Test")

      When("I enter Address as:")
      val addressDataThree: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressDataThree)

      When("I enter UPE Person/Team name as UPE Test")
      andIEnterAs("UPE Person/Team name", "UPE Test")

      When("I enter UPE Email address as test&upe@email.com")
      andIEnterAs("UPE Email address", "test&upe@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      And("I enter Phone Number as 123456")
      andIEnterAs("Phone Number", "123456")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter NFM name as Test")
      andIEnterAs("NFM name", "Test")

      When("I enter Address as:")
      thenIEnterAddressAs(addressDataThree)

      When("I enter NFM Contact name as Contact NFM Test")
      andIEnterAs("NFM Contact name", "Contact NFM Test")

      When("I enter NFM Contact Email as testNFM@email.com")
      andIEnterAs("NFM Contact Email", "testNFM@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter NFM Phone Number as 12345678")
      andIEnterAs("NFM Phone Number", "12345678")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeDataTwo: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataTwo)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact details display page")
      thenIShouldNavigateTo("Contact details display page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page")
      andIShouldSeeErrorMessageOnThePage("Select yes if you want to use this as your primary contact", "Contact details display")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Contact details input name page")
      thenIShouldNavigateTo("Contact details input name page")

      When("I enter Contact Details Name as Test ContactName")
      andIEnterAs("Contact Details Name", "Test ContactName")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact details input email page")
      thenIShouldNavigateTo("Contact details input email page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact details phone page")
      thenIShouldNavigateTo("Contact details phone page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Contact details input phone page")
      thenIShouldNavigateTo("Contact details input phone page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter NFM Phone Number as 12345343")
      andIEnterAs("NFM Phone Number", "12345343")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact name page")
      thenIShouldNavigateTo("Second Contact name page")

      When("I enter Second Contact Name as Test secondName")
      andIEnterAs("Second Contact Name", "Test secondName")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Second Contact email page")
      thenIShouldNavigateTo("Second Contact email page")

      When("I enter Second Contact Email as testContact@email.com")
      andIEnterAs("Second Contact Email", "testContact@email.com")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact Input page")
      thenIShouldNavigateTo("Second Contact Input page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter NFM Phone Number as 1234567")
      andIEnterAs("NFM Phone Number", "1234567")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Contact address input page")
      thenIShouldNavigateTo("Contact address input page")

      When("I enter Address as:")
      val addressDataFour: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataFour)

      Then("I should be on Contact details Check answers page")
      thenIShouldBeOn("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectTo("Registration processing page")

      And("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

      When("I click report and manage your Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()
    }

    Scenario("4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page.", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option Only in the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("Only in the UK")

      When("I enter account period as:")
      val dateRangeDataThree: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataThree)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter Contact Name as Contact Name Test")
      andIEnterAs("Contact Name", "Contact Name Test")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Contact Phone as 1234554")
      andIEnterAs("Contact Phone", "1234554")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataFive: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataFive)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectTo("Registration processing page")

      Then("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should navigate to Registration return error page")
      thenIShouldNavigateTo("Registration return error page")

      And("I click report and manage your Pillar 2 Top-up Taxes. link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes.")

      And("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")

      And("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on Registration return error page")
      thenIShouldBeOn("Registration return error page")

      And("I click Sign out link")
      andIClickLink("Sign out")

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
      whenUserLogsInWithExistingEntityGroupAndForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")
    }

    Scenario("5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows", AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should be on UPE entity type page")
      thenIShouldBeOn("UPE entity type page")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      When("I registered successfully with BV enabled")
      andIRegisteredSuccessfullyWith("BV enabled")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      When("I enter account period as:")
      val dateRangeDataFour: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataFour)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter Contact Name as Contact Name Test")
      andIEnterAs("Contact Name", "Contact Name Test")

      When("I enter Contact Email as testContact@email.com")
      andIEnterAs("Contact Email", "testContact@email.com")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I enter Contact Phone as 1234554")
      andIEnterAs("Contact Phone", "1234554")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter Address as:")
      val addressDataSix: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressDataSix)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickLink("Report Pillar 2 Top-up Taxes")

      Then("The Task Edit filing member details status should be Completed")
      andTheTaskStatusShouldBe("Edit filing member details", "Completed")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration Duplication KB Page")
      thenIShouldNavigateTo("Registration Duplication KB Page")

      When("I select Yes option and continue to next")
      andISelectNfmOptionAndContinueToNext("Yes")

      Then("I should navigate to NFM details page")
      thenIShouldNavigateTo("NFM details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      When("I enter NFM name as NFM Test KB")
      andIEnterAs("NFM name", "NFM Test KB")

      When("I enter Address as:")
      val addressDataSeven: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressDataSeven)

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I enter NFM Contact name as Contact CYA")
      andIEnterAs("NFM Contact name", "Contact CYA")

      When("I enter NFM Contact Email as testcya@email.com")
      andIEnterAs("NFM Contact Email", "testcya@email.com")

      Then("I should navigate to NFM Phone page")
      thenIShouldNavigateTo("NFM Phone page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to NFM Check your answers page")
      thenIShouldNavigateTo("NFM Check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should be on Task list page")
      thenIShouldBeOn("Task list page")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be redirect to Registration processing page")
      thenIShouldBeRedirectTo("Registration processing page")

      And("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

    }

    Scenario("6 - UPE No Id journey navigation to registration in progress page",AcceptanceTests, ZapAccessibility) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      Then("I should be on UPE business page")
      thenIShouldBeOn("UPE business page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to input-upe-name page")
      thenIShouldNavigateTo("input-upe-name page")

      When("I enter UPE name as Medium Processing Corp")
      andIEnterAs("UPE name", "Medium Processing Corp")

      Then("I should navigate to input-upe-address page")
      thenIShouldNavigateTo("input-upe-address page")

      When("I enter Address as:")
      val addressEight: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Arab Emirates"
      )
      thenIEnterAddressAs(addressEight)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to UPE Contact person/team Name page")
      thenIShouldNavigateTo("UPE Contact person/team Name page")

      When("I enter UPE Person/Team name as Medium Processing")
      andIEnterAs("UPE Person/Team name", "Medium Processing")

      Then("I should navigate to UPE Contact Email page")
      thenIShouldNavigateTo("UPE Contact Email page")

      When("I enter UPE Email address as testcontactupe@email.com")
      andIEnterAs("UPE Email address", "testcontactupe@email.com")

      Then("I should navigate to UPE Phone page")
      thenIShouldNavigateTo("UPE Phone page")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to input phone page")
      thenIShouldNavigateTo("input phone page")

      And("I enter Phone Number as 1234569")
      andIEnterAs("Phone Number", "1234569")

      Then("I should be on Check your answers page")
      thenIShouldBeOn("Check your answers page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add filing member details link")
      andIClickLink("Add filing member details")

      Then("I should navigate to NFM registration page")
      thenIShouldNavigateTo("NFM registration page")

      When("I select No option and continue to next")
      andISelectNfmOptionAndContinueToNext("No")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      And("The Task Edit filing member details status should be Completed")
      andTheTaskStatusShouldBe("Edit filing member details", "Completed")

      When("I click Add further group details link")
      andIClickLink("Add further group details")

      Then("I should navigate to MNE or domestic page")
      thenIShouldNavigateTo("MNE or domestic page")

      When("I select option In the UK and outside the UK in further details group status page")
      andISelectOptionInFurtherDetailsGroupStatusPage("In the UK and outside the UK")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Group accounting period page")
      thenIShouldNavigateTo("Group accounting period page")

      When("I enter account period as:")
      val dateRangeDataSix: Map[String, String] = Map(
        "startDate.day"   -> "15",
        "startDate.month" -> "1",
        "startDate.year"  -> "2024",
        "endDate.day"     -> "15",
        "endDate.month"   -> "1",
        "endDate.year"    -> "2025"
      )
      andIEnterAccountPeriodAs(dateRangeDataSix)

      Then("I should navigate to FD check your answers page")
      thenIShouldNavigateTo("FD check your answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      Then("I should navigate to Task list page")
      thenIShouldNavigateTo("Task list page")

      When("I click Add contact details link")
      andIClickLink("Add contact details")

      Then("I should navigate to Contact details guidance page")
      thenIShouldNavigateTo("Contact details guidance page")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      Then("I should navigate to Second Contact details page")
      thenIShouldNavigateTo("Second Contact details page")

      When("I select option No and continue to next")
      andISelectOptionAndContinueToNext("No")

      Then("I should navigate to Contact address input page")
      thenIShouldNavigateTo("Contact address input page")

      When("I enter Address as:")
      val addressNine: Map[String, String] = Map(
        "addressLine1" -> "Address Line 1",
        "addressLine3" -> "City",
        "postalCode"   -> "EH5 5WY",
        "countryCode"  -> "United Kingdom"
      )
      thenIEnterAddressAs(addressNine)

      Then("I should navigate to Contact details Check answers page")
      thenIShouldNavigateTo("Contact details Check answers page")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I click Check your answers before submitting your registration link")
      andIClickLink("Check your answers before submitting your registration")

      Then("I should navigate to Review answers page")
      thenIShouldNavigateTo("Review answers page")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should navigate to Registration confirmation page")
      thenIShouldNavigateTo("Registration confirmation page")

      And("I click report and manage your Pillar 2 Top-up Taxes link")
      andIClickLink("report and manage your Pillar 2 Top-up Taxes")

      Then("I should be on Registration In Progress page")
      thenIShouldBeOn("Registration In Progress page")

      When("I refresh the registration in progress page")
      whenIRefreshTheRegistrationInProgressPage()

      Then("I should be on Dashboard page")
      thenIShouldBeOn("Dashboard page")
    }
  }
}