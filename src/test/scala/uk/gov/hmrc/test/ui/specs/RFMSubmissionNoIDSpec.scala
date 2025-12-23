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

class RFMSubmissionNoIDSpec extends BaseSpec {

  Feature("RFM No ID flow journeys") {

    Scenario(
      "1 - RFM submission journey for NFM No Id flow with changes on check your answers pages",
      AcceptanceTests
    ) {

      Given("Org User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XMPLR0123456789")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user selects a new NFM and enters details")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectNo()
      RFMNFMNamePage.enterText()
      RFMNFMAddressPage.enterAddressNonUK()

      And("The user amends NFM name via the Check your answers page")
      RFMNoIDCYAPage.clickLinkChangeName()
      RFMNFMNamePage.updateText()

      And("The user amends NFM address via the Check your answers page")
      RFMNoIDCYAPage.clickLinkChangeAddress()
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
      RFMFinalReviewCYAPage.clickLinkChangePrimaryContactName()
      RFMContactPrimaryNamePage.updateText()

      And("The user amends Primary contact email address via the Check your answers page")
      RFMFinalReviewCYAPage.clickLinkChangePrimaryContactEmail()
      RFMContactPrimaryEmailPage.updateText()

      And("The user amends Primary contact phone number via the Check your answers page")
      RFMFinalReviewCYAPage.clickLinkChangePrimaryContactPhoneNumber()
      RFMContactPrimaryPhoneNumberPage.updateText()

      And("The user amends Secondary contact name via the Check your answers page")
      RFMFinalReviewCYAPage.clickLinkChangeSecondaryContactName()
      RFMContactSecondaryNamePage.updateText()

      And("The user amends Secondary contact email address via the Check your answers page")
      RFMFinalReviewCYAPage.clickLinkChangeSecondaryContactEmail()
      RFMContactSecondaryEmailPage.updateText()

      And("The user amends Secondary contact phone number via the Check your answers page")
      RFMFinalReviewCYAPage.clickLinkChangeSecondaryContactPhoneNumber()
      RFMContactSecondaryPhoneNumberPage.updateText()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      And("The user is presented with the confirmation page and clicks the back button")
      RFMConfirmationPage.browserBack()

      Then("The user is presented with the no return page")
      RFMNoReturnBackErrorPage.onPage()
    }

    Scenario(
      "2 - RFM submission journey for UPE No Id flow",
      AcceptanceTests
    ) {

      Given("Org User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XMPLR0123456789")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user selects a new UPE and enters details")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectUltimateParentEntity()

      And("The user adds primary contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText()
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectNo()
      RFMContactSecondaryAddPage.selectNo()
      RFMContactAddressPage.enterAddressUK()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      And("The user is presented with the confirmation page")
      RFMConfirmationPage.onPage()
    }
  }
}
