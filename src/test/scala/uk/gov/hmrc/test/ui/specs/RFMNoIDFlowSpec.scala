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

import uk.gov.hmrc.test.ui.pages.auth.AuthLoginPage.login
import uk.gov.hmrc.test.ui.pages.rfm.*
import uk.gov.hmrc.test.ui.specs.tags.*
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.*

class RFMNoIDFlowSpec extends BaseSpec {

  Feature("RFM No ID flow") {

    Scenario("1 - RFM submission journey for NFM No Id flow with changes on check your answers pages", AcceptanceTests) {
      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterPLRId("XMPLR0123456789")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user selects a new NFM and enters details")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.clickNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectNo()
      RFMNFMNamePage.enterText()
      RFMNFMAddressPage.enterAddressNonUK()

      And("The user amends NFM name via the Check your answers page")
      RFMNoIDCYAPage.clickLink(RFMNoIDCYAPage.changeName)
      RFMNFMNamePage.updateText()

      And("The user amends NFM address via the Check your answers page")
      RFMNoIDCYAPage.clickLink(RFMNoIDCYAPage.changeAddress)
      RFMNFMAddressPage.updateAddressNonUK()

      Then("The user continues to contact details")
      RFMNoIDCYAPage.continueToNextPage()

      And("The user adds primary contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText()
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectYes()
      RFMContactPrimaryPhoneNumberPage.enterText()

      And("The user adds secondary contact details")
      RFMContactSecondaryAddPage.selectYes()
      RFMContactSecondaryNamePage.enterText()
      RFMContactSecondaryEmailPage.enterText()
      RFMContactSecondaryByPhonePage.selectYes()
      RFMContactSecondaryPhoneNumberPage.enterText()

      And("The user adds contact address")
      RFMContactAddressPage.enterAddressUK()

      Then("The user amends Primary contact name via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changePrimaryContactName)
      RFMContactPrimaryNamePage.updateText()

      And("The user amends Primary contact email address via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changePrimaryContactEmail)
      RFMContactPrimaryEmailPage.updateText()

      And("The user amends Primary contact phone number via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changePrimaryContactPhoneNumber)
      RFMContactPrimaryPhoneNumberPage.updateText()

      And("The user amends Secondary contact name via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changeSecondaryContactName)
      RFMContactSecondaryNamePage.updateText()

      And("The user amends Secondary contact email address via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changeSecondaryContactEmail)
      RFMContactSecondaryEmailPage.updateText()

      And("The user amends Secondary contact phone number via the Check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changeSecondaryContactPhoneNumber)
      RFMContactSecondaryPhoneNumberPage.updateText()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      And("The user is presented with the confirmation page and clicks the back button")
      RFMConfirmationPage.clickBackButton()

      Then("The user is presented with the no return page")
      RFMNoReturnBackErrorPage.onPage()
    }

    Scenario("2 - RFM submission journey for UPE No Id flow with changes on check your answers pages", AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

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
