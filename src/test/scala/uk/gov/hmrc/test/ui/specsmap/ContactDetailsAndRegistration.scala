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

package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers

import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CYASteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.UPESteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class ContactDetailsAndRegistration extends AnyFeatureSpec with Matchers {

  Feature("Contact details for the filing member") {

    Scenario("1 - Create a new subscription with UPE NoID Flow and NFM No Id flow to validate Contact Details") {
      Given("Organisation User logs in as upe with credId ContactDetails for Pillar2")
        givenXLogsInAsUpeWithCredIdXForPillar2("Organisation User", "ContactDetails")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test")
        andIEnterXAsX("UPE name", "Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as UPE Test")
        andIEnterXAsX("UPE Person/Team name", "UPE Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Email address as test&upe@email.com")
        andIEnterXAsX("UPE Email address", "test&upe@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I enter Phone Number as 123456")
        andIEnterXAsX("Phone Number", "123456")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("The Task Add contact details status should be Not started")
        andTheTaskXStatusShouldBeX("Add contact details", "Not started")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add contact details link")
        andIClickXLink("Add contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details display page")
        thenIShouldNavigateToX("Contact details display page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact details input name page")
        thenIShouldNavigateToX("Contact details input name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Contact Name as Contact Name Test")
        andIEnterXAsX("Contact Name", "Contact Name Test")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Contact details input email page")
        thenIShouldNavigateToX("Contact details input email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Contact Email as testContact@email.com")
        andIEnterXAsX("Contact Email", "testContact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Contact details phone page")
        thenIShouldNavigateToX("Contact details phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details phone page")
        thenIShouldNavigateToX("Contact details phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact details input phone page")
        thenIShouldNavigateToX("Contact details input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Contact Phone as 1234554")
        andIEnterXAsX("Contact Phone", "1234554")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact address input page")
        thenIShouldNavigateToX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact name page")
        thenIShouldNavigateToX("Second Contact name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Second Contact Name as Second Contact Name Test")
        andIEnterXAsX("Second Contact Name", "Second Contact Name Test")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Second Contact email page")
        thenIShouldNavigateToX("Second Contact email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Second Contact Email as secondContact@email.com")
        andIEnterXAsX("Second Contact Email", "secondContact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Second Contact number page")
        thenIShouldNavigateToX("Second Contact number page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact Input page")
        thenIShouldNavigateToX("Second Contact Input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Second Contact Input as 1234554")
        andIEnterXAsX("Second Contact Input", "1234554")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Contact address input page")
        thenIShouldNavigateToX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Contact address input page")
        thenIShouldBeOnX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Second Contact Input page")
        thenIShouldBeOnX("Second Contact Input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Second Contact number page")
        thenIShouldBeOnX("Second Contact number page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details display page")
        thenIShouldNavigateToX("Contact details display page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - Check you Answers Page Validations") {
      Given("Organisation User navigates to Contact Details check your answer page with credId ContactDetails")
        givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX("Contact Details", "ContactDetails")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Contact details Check answers page")
        thenIShouldBeOnX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Contact Name")
        andIClickOnChangeLinkForX("Contact Name")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Contact Name as Contact $ Name Change")
        andIEnterXAsX("Contact Name", "Contact $ Name Change")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Email address")
        andIClickOnChangeLinkForX("Email address")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Contact Email as email&change@test.com")
        andIEnterXAsX("Contact Email", "email&change@test.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on change link for Phone number")
        andIClickOnChangeLinkForX("Phone number")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Contact Phone as 1234555")
        andIEnterXAsX("Contact Phone", "1234555")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Second Contact Name")
        andIClickOnChangeLinkForX("Second Contact Name")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Second Contact Name as Second Contact Name Change")
        andIEnterXAsX("Second Contact Name", "Second Contact Name Change")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Second Contact Email")
        andIClickOnChangeLinkForX("Second Contact Email")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Second Contact Email as secondContact&change@email.com")
        andIEnterXAsX("Second Contact Email", "secondContact&change@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Second Contact Phone number")
        andIClickOnChangeLinkForX("Second Contact Phone number")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Contact Phone as 71235643")
        andIEnterXAsX("Contact Phone", "71235643")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on change link for Address")
        andIClickOnChangeLinkForX("Address")  // auto-chosen (score=1.00, CYASteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I enter Address Line 1 as Address Change")
        andIEnterXAsX("Address Line 1", "Address Change")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see details as below:")
        andIShouldSeeDetailsAsBelow(null)  // auto-chosen (score=1.00, CYASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Review answers page")
        thenIShouldBeOnX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see details as below:")
        andIShouldSeeDetailsAsBelow(null)  // auto-chosen (score=1.00, CYASteps.scala)

      And("I should see row 12 with key Contact name and value Contact $ Name Change")
        andIShouldSeeRowdWithKeyXAndValueX(12, "Contact name", "Contact $ Name Change")  // auto-chosen (score=0.85, CYASteps.scala)

      And("I should see row 13 with key Email address and value email&change@test.com")
        andIShouldSeeRowdWithKeyXAndValueX(13, "Email address", "email&change@test.com")  // auto-chosen (score=0.85, CYASteps.scala)

      And("I should see row 14 with key Can we contact the primary contact by phone? and value Yes")
        andIShouldSeeRowdWithKeyXAndValueX(14, "Can we contact the primary contact by phone?", "Yes")  // auto-chosen (score=0.85, CYASteps.scala)

      And("I should see row 15 with key Primary phone number and value 123455")
        andIShouldSeeRowdWithKeyXAndValueX(15, "Primary phone number", "123455")  // auto-chosen (score=0.85, CYASteps.scala)

      And("I should see row 19 with key Can we contact the secondary contact by phone? and value Yes")
        andIShouldSeeRowdWithKeyXAndValueX(19, "Can we contact the secondary contact by phone?", "Yes")  // auto-chosen (score=0.85, CYASteps.scala)

      And("I should see row 21 with key Address and value Address Change")
        andIShouldSeeRowdWithKeyXAndValueX(21, "Address", "Address Change")  // auto-chosen (score=0.85, CYASteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Edit contact details link")
        andIClickXLink("Edit contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details display page")
        thenIShouldNavigateToX("Contact details display page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact address input page")
        thenIShouldNavigateToX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Contact details Check answers page")
        thenIShouldBeOnX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Review answers page")
        thenIShouldBeOnX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - Contact details pages Error validations and Registration Confirmation Page Validations") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Test")
        andIEnterXAsX("UPE name", "Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as UPE Test")
        andIEnterXAsX("UPE Person/Team name", "UPE Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter UPE Email address as test&upe@email.com")
        andIEnterXAsX("UPE Email address", "test&upe@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      And("I enter Phone Number as 123456")
        andIEnterXAsX("Phone Number", "123456")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter NFM name as Test")
        andIEnterXAsX("NFM name", "Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter NFM Contact name as Contact NFM Test")
        andIEnterXAsX("NFM Contact name", "Contact NFM Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter NFM Contact Email as testNFM@email.com")
        andIEnterXAsX("NFM Contact Email", "testNFM@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter NFM Phone Number as 12345678")
        andIEnterXAsX("NFM Phone Number", "12345678")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add contact details link")
        andIClickXLink("Add contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details display page")
        thenIShouldNavigateToX("Contact details display page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page")
        andIShouldSeeErrorMessageXOnTheXPage("Select yes if you want to use this as your primary contact", "Contact details display")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact details input name page")
        thenIShouldNavigateToX("Contact details input name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Contact Details Name as Test ContactName")
        andIEnterXAsX("Contact Details Name", "Test ContactName")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details input email page")
        thenIShouldNavigateToX("Contact details input email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter Contact Email as testContact@email.com")
        andIEnterXAsX("Contact Email", "testContact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details phone page")
        thenIShouldNavigateToX("Contact details phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact details input phone page")
        thenIShouldNavigateToX("Contact details input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter NFM Phone Number as 12345343")
        andIEnterXAsX("NFM Phone Number", "12345343")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact name page")
        thenIShouldNavigateToX("Second Contact name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Second Contact Name as Test secondName")
        andIEnterXAsX("Second Contact Name", "Test secondName")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Second Contact email page")
        thenIShouldNavigateToX("Second Contact email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Second Contact Email as test@email.com")
        andIEnterXAsX("Second Contact Email", "test@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact Input page")
        thenIShouldNavigateToX("Second Contact Input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter NFM Phone Number as 1234567")
        andIEnterXAsX("NFM Phone Number", "1234567")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact address input page")
        thenIShouldNavigateToX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Contact details Check answers page")
        thenIShouldBeOnX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be redirect to Registration processing page")
        thenIShouldBeRedirectToX("Registration processing page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should navigate to Registration confirmation page")
        thenIShouldNavigateToX("Registration confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click report and manage your Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I can see Print this page link")
        thenICanSeeXLink("Print this page")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page.") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Only in the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("Only in the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add contact details link")
        andIClickXLink("Add contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter Contact Name as Contact Name Test")
        andIEnterXAsX("Contact Name", "Contact Name Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Contact Email as testContact@email.com")
        andIEnterXAsX("Contact Email", "testContact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Contact Phone as 1234554")
        andIEnterXAsX("Contact Phone", "1234554")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Registration Duplication KB Page")
        thenIShouldNavigateToX("Registration Duplication KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be redirect to Registration processing page")
        thenIShouldBeRedirectToX("Registration processing page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Registration confirmation page")
        thenIShouldNavigateToX("Registration confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Registration return error page")
        thenIShouldNavigateToX("Registration return error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes. link")
        andIClickXLink("report and manage your Pillar 2 Top-up Taxes.")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Registration return error page")
        thenIShouldBeOnX("Registration return error page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on UPE entity type page")
        thenIShouldBeOnX("UPE entity type page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I select option UK limited company and continue to GRS page")
        andISelectOptionXAndContinueToGRSPage("UK limited company")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I registered successfully with BV enabled")
        andIRegisteredSuccessfullyWithX("BV enabled")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Add contact details link")
        andIClickXLink("Add contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter Contact Name as Contact Name Test")
        andIEnterXAsX("Contact Name", "Contact Name Test")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Contact Email as testContact@email.com")
        andIEnterXAsX("Contact Email", "testContact@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Contact Phone as 1234554")
        andIEnterXAsX("Contact Phone", "1234554")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Registration Duplication KB Page")
        thenIShouldNavigateToX("Registration Duplication KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("The Task Edit filing member details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit filing member details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Registration Duplication KB Page")
        thenIShouldNavigateToX("Registration Duplication KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select Yes option and continue to next")
        andISelectXOptionAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to NFM details page")
        thenIShouldNavigateToX("NFM details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I enter NFM name as NFM Test KB")
        andIEnterXAsX("NFM name", "NFM Test KB")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter NFM Contact name as Contact CYA")
        andIEnterXAsX("NFM Contact name", "Contact CYA")  // auto-chosen (score=1.00, UPESteps.scala)

      When("I enter NFM Contact Email as testcya@email.com")
        andIEnterXAsX("NFM Contact Email", "testcya@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to NFM Phone page")
        thenIShouldNavigateToX("NFM Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to NFM Check your answers page")
        thenIShouldNavigateToX("NFM Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Task list page")
        thenIShouldBeOnX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should be redirect to Registration processing page")
        thenIShouldBeRedirectToX("Registration processing page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should navigate to Registration confirmation page")
        thenIShouldNavigateToX("Registration confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - UPE No Id journey navigation to registration in progress page") {
      Given("Organisation User logs in without Pillar2 enrolment")
        givenXLogsInWithoutPillar2Enrolment()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UPE business page")
        thenIShouldBeOnX("UPE business page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input-upe-name page")
        thenIShouldNavigateToX("input-upe-name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE name as Medium Processing Corp")
        andIEnterXAsX("UPE name", "Medium Processing Corp")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to input-upe-address page")
        thenIShouldNavigateToX("input-upe-address page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UPE Contact person/team Name page")
        thenIShouldNavigateToX("UPE Contact person/team Name page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Person/Team name as Medium Processing")
        andIEnterXAsX("UPE Person/Team name", "Medium Processing")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Contact Email page")
        thenIShouldNavigateToX("UPE Contact Email page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UPE Email address as testcontactupe@email.com")
        andIEnterXAsX("UPE Email address", "testcontactupe@email.com")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should navigate to UPE Phone page")
        thenIShouldNavigateToX("UPE Phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to input phone page")
        thenIShouldNavigateToX("input phone page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I enter Phone Number as 1234569")
        andIEnterXAsX("Phone Number", "1234569")  // auto-chosen (score=1.00, UPESteps.scala)

      Then("I should be on Check your answers page")
        thenIShouldBeOnX("Check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add filing member details link")
        andIClickXLink("Add filing member details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM registration page")
        thenIShouldNavigateToX("NFM registration page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select No option and continue to next")
        andISelectXOptionAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectOptionXAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select option (.*) and continue to next

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("The Task Edit filing member details status should be Completed")
        andTheTaskXStatusShouldBeX("Edit filing member details", "Completed")  // auto-chosen (score=1.00, TaskListSteps.scala)

      When("I click Add further group details link")
        andIClickXLink("Add further group details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to MNE or domestic page")
        thenIShouldNavigateToX("MNE or domestic page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option In the UK and outside the UK in further details group status page")
        andISelectOptionXInFurtherDetailsGroupStatusPage("In the UK and outside the UK")  // auto-chosen (score=1.00, UPESteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Group accounting period page")
        thenIShouldNavigateToX("Group accounting period page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter account period as:")
        andIEnterAccountPeriodAs(null)  // auto-chosen (score=1.00, SubscriptionJourneySteps.scala)

      Then("I should navigate to FD check your answers page")
        thenIShouldNavigateToX("FD check your answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Task list page")
        thenIShouldNavigateToX("Task list page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Add contact details link")
        andIClickXLink("Add contact details")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Contact details guidance page")
        thenIShouldNavigateToX("Contact details guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Second Contact details page")
        thenIShouldNavigateToX("Second Contact details page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should navigate to Contact address input page")
        thenIShouldNavigateToX("Contact address input page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Address as:")
        thenIEnterAddressAs(null)  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Contact details Check answers page")
        thenIShouldNavigateToX("Contact details Check answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Check your answers before submitting your registration link")
        andIClickXLink("Check your answers before submitting your registration")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Review answers page")
        thenIShouldNavigateToX("Review answers page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Save&Continue button")
        // ⚠️ No step-def match found for: I click on Save&Continue button

      Then("I should navigate to Registration confirmation page")
        thenIShouldNavigateToX("Registration confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click report and manage your Pillar 2 Top-up Taxes link")
        andIClickXLink("report and manage your Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Registration In Progress page")
        thenIShouldBeOnX("Registration In Progress page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I refresh the registration in progress page")
        whenIRefreshTheRegistrationInProgressPage()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
