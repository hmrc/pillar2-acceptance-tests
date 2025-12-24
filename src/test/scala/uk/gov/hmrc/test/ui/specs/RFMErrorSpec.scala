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
import uk.gov.hmrc.test.ui.pages.rfm._
import uk.gov.hmrc.test.ui.specs.tags._

class RFMErrorSpec extends BaseSpec {

  Feature("RFM check your answers page") {

    Scenario("1 - RFM restart error page journey",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XEPLR0123456400")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      Then("The user is taken to the restart error page and returns to the start")
      RFMJourneyRecoveryPage.onPage()
    }

    Scenario("2 - RFM no match error page journey",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XEPLR0123456222")
      RFMRegistrationDatePage.enterDates("27", "1", "2024")
      RFMCYAPage.continueToNextPage()

      Then("The user is taken to the no match error page and returns to the PLRId page")
      RFMNoMatchErrorPage.clickLink(RFMNoMatchErrorPage.returnToStartPageLink)
      RFMEnterPillar2IdPage.onPage()
    }

    Scenario("3 - RFM amend API failure journey",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      And("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XMPLR0012345111")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user adds a UK Limited Company as new NFM")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectYes()
      RFMGRSEntityTypePage.selectEntityTypeUkLimitedCompany()
      RFMGRSUKLimitedCompanyPage.clickButtonRegistrationSuccessBvEnabled()

      Then("The user adds contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText(RFMContactPrimaryNamePage.aPIErrorValue)
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectNo()
      RFMContactSecondaryAddPage.selectNo()

      And("The user adds contact address")
      RFMContactAddressPage.enterAddressUK()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      Then("The user is presented with the API Error page and returns to CYA")
      RFMAmendAPIErrorPage.clickLink(RFMAmendAPIErrorPage.returnToCheckYourAnswersLink)
      RFMFinalReviewCYAPage.onPage()
    }

    Scenario("4 - RFM Incomplete data error journey",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
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

      Then("The user continues to contact details")
      RFMNoIDCYAPage.continueToNextPage()

      And("The user adds primary contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText()
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectYes()
      RFMContactPrimaryPhoneNumberPage.enterText()

      And("The user doesn't add a secondary contact")
      RFMContactSecondaryAddPage.selectNo()

      And("The user adds contact address")
      RFMContactAddressPage.enterAddressUK()

      Then("The selects yes to adding a secondary contact via the check your answers page")
      RFMFinalReviewCYAPage.clickLink(RFMFinalReviewCYAPage.changeSecondaryContact)
      RFMContactSecondaryAddPage.changeToYes()

      And("The user returns to the check your answers page without entering secondary contact details")
      RFMContactSecondaryNamePage.clickBackLink(RFMContactSecondaryNamePage.changeUrl)
      RFMContactSecondaryAddPage.clickBackLink(RFMContactSecondaryAddPage.changeUrl)

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      Then("The user is presented with the incomplete task page and returns to CYA")
      RFMIncompleteErrorPage.clickLink(RFMIncompleteErrorPage.returnToCheckYourAnswersLink)
      RFMFinalReviewCYAPage.onPage()
    }

    Scenario("5 - User registration as Limited liability partnership failed with party type mismatch error",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XMPLR0123456789")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user selects a Limited Liability Partnership as new NFM with Type Mismatch")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectYes()
      RFMGRSEntityTypePage.selectEntityTypeLimitedLiabilityPartnership()
      RFMGRSLimitedLiabilityPartnershipPage.clickButtonRegistrationFailedPartyTypeMismatch()

      Then("The user is presented with the type mismatch page")
      RFMGRSRegistrationMismatchErrorPage
    }

    Scenario("6 - User registration as UK limited company failed with identifiers mismatch error page",
      AcceptanceTests
    ) {

      Given("Organisation User logs into RFM")
      login(
        userType = "Organisation",
        page = "rfm"
      )

      When("The user enters PLRId and dates")
      RFMEnterPillar2IdPage.enterText("XMPLR0123456789")
      RFMRegistrationDatePage.enterDates("31", "1", "2024")
      RFMCYAPage.continueToNextPage()

      And("The user selects a Limited Liability Partnership as new NFM with Type Mismatch")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectYes()
      RFMGRSEntityTypePage.selectEntityTypeLimitedLiabilityPartnership()
      RFMGRSLimitedLiabilityPartnershipPage.clickButtonRegistrationNotCalledIdentifierMismatch()

      Then("The user is presented with the identifiers mismatch error page")
      RFMGRSRegistrationNotCalledErrorPage.onPage()
    }
  }
}
