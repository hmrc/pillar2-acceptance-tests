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

package uk.gov.hmrc.test.ui.specstepdef

import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.contactDetails.{ContactDetailsCheckAnswersPage, ContactDetailsSummaryPage}
import uk.gov.hmrc.test.ui.specpages.furtherDetails.FDCheckYourAnswersPage
import uk.gov.hmrc.test.ui.specpages.nfm.NFMCheckYourAnswersPage

object CYAStepsSteps {

  // ^I click on change hyperlink next to the (.*)
  def andIClickOnChangeHyperlinkNextToTheX(link: String): Unit = {
    link match {
      case "NFM Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeName)
      case "NFM Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeAddress)
      case "NFM Contact Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeContactName)
      case "NFM Email Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeEmailAddress)
      case "NFM Phone Contact" =>
        clickByCss(NFMCheckYourAnswersPage.changePhoneContact)
      case "NFM Phone Number" =>
        clickByCss(NFMCheckYourAnswersPage.changePhoneNumber)
      case "FD Group Status" =>
        clickByCss(FDCheckYourAnswersPage.changeGroupStatus)
      case "Accounting Period" =>
        clickByCss(FDCheckYourAnswersPage.changeAccountingPeriod)
      case "Domestic or Mne" =>
        clickByCss(BtnChangeDomesticOrMnePage.changeDomesticOrMne)
    }
  }

  // ^I click on change link for (.*)
  def andIClickOnChangeLinkForX(link: String): Unit = {
    link match {
      case "Contact Name" =>
        clickByCss(ContactDetailsCheckAnswersPage.changePrimaryContactName)
      case "Email address" =>
        clickByCss(ContactDetailsCheckAnswersPage.changePrimaryContactEmailAddress)
      case "Phone number" =>
        clickByCss(ContactDetailsCheckAnswersPage.changePrimaryContactPhoneNumber)
      case "Do you have a second contact?" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondaryContact)
      case "Second Contact Name" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondaryContactName)
      case "Second Contact Email" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondaryContactEmailAddress)
      case "Second Contact Phone number" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondaryContactPhoneNumber)
      case "Address" =>
        clickByCss(ContactDetailsSummaryPage.changeAddress)
      case "Dashboard Address" =>
        clickByCss(ContactDetailsSummaryPage.dashboardAddressChange)
      case "Primary Contact" =>
        clickByCss(ReviewAnswersPage.changeUPEContact)
      case _ =>
        clickByCss(ContactDetailsCheckAnswersPage.changePrimaryContactName)
    }
  }

}
