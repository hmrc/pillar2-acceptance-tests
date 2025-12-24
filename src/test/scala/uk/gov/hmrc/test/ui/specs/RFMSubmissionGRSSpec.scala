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

class RFMSubmissionGRSSpec extends BaseSpec {

  Feature("RFM Ultimate Parent Entity and New nominated Filling Member GRS journey") {

    Scenario(
      "1 - RFM GRS journey with New NFM as UK limited company and BV Enabled",
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

      And("The user selects a UK Limited Company as new NFM with BV Enabled")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectRadioNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectYes()
      RFMEntityTypePage.selectRadioEntityTypeUkLimitedCompany()
      RFMGRSUKLimitedCompanyPage.clickButtonRegistrationSuccessBvEnabled()

      And("The user adds primary contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText()
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectYes()
      RFMContactPrimaryPhoneNumberPage.enterText()
      RFMContactSecondaryAddPage.selectNo()

      And("The user adds contact address")
      RFMContactAddressPage.enterAddressUK()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      Then("The user is presented with the confirmation page")
      RFMConfirmationPage.onPage(timeoutSeconds = 10)
    }

    Scenario(
      "2 - RFM GRS journey with New NFM as UK limited company and BV Disabled",
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

      And("The user selects a UK Limited Company as new NFM with BV Disabled")
      RFMSavingProgressPage.continueToNextPage()
      RFMCorpPositionPage.selectRadioNewNominatedFilingMember()
      RFMNFMGuidancePage.continueToNextPage()
      RFMRegisteredInUKPage.selectYes()
      RFMEntityTypePage.selectRadioEntityTypeUkLimitedCompany()
      RFMGRSUKLimitedCompanyPage.clickButtonRegistrationSuccessBvDisabled()

      And("The user adds primary contact details")
      RFMContactGuidancePage.continueToNextPage()
      RFMContactPrimaryNamePage.enterText()
      RFMContactPrimaryEmailPage.enterText()
      RFMContactPrimaryByPhonePage.selectYes()
      RFMContactPrimaryPhoneNumberPage.enterText()
      RFMContactSecondaryAddPage.selectNo()

      And("The user adds contact address")
      RFMContactAddressPage.enterAddressUK()

      When("The user reviews and submits")
      RFMFinalReviewCYAPage.onPageSubmitById()

      Then("The user is presented with the confirmation page")
      RFMConfirmationPage.onPage()
    }
  }
}
