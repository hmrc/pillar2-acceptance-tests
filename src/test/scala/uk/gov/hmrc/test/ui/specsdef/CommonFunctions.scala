/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specsdef

import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.helper.PageObject
import uk.gov.hmrc.test.ui.pages.*

object CommonFunctions
    extends BrowserDriver with Eventually with Matchers {

  def pageMatch(page: String): PageObject = {
    page match {
      case "NFM details page"                           => NFMDetailsPage
      case "NFM registration page"                      => NFMRegistrationPage
      case "business EQ page"                           => BusinessActivityEQPage
      case "guidance page"                              => Pillar2GovUkGuidancePage
      case "Global gross revenue"                       => GlobalGrossRevenueEQPage
      case "NFM guidance page"                          => NFMGuidancePage
      case "auth-login page"                            => AuthLoginOldPage
      case "Task list page"                             => TaskListPage
      case "Initial guidance Page"                      => InitialGuidancePage
      case "UPE business page"                          => UPEPage
      case "input-upe-name page"                        => InputUPENamePage
      case "input-upe-address page"                     => UPEAddressPage
      case "UPE entity type page"                       => UPEEntityTypePage
      case "NFM entity type page"                       => NFMEntityTypePage
      case "UKCompany GRS page"                         => UKCompanyGRSPage
      case "NFM UKCompany GRS page"                     => NFMUKCompanyGRSPage
      case "LLP GRS page"                               => LLPGRSPage
      case "Contact details Check answers page"         => ContactDetailsCheckAnswersPage
      case "NFM Name page"                              => NFMNamePage
      case "NFM Contact Name page"                      => NFMContactNamePage
      case "NFM Contact Email page"                     => NFMContactEmailPage
      case "NFM Phone page"                             => NFMPhonePage
      case "input nfm phone page"                       => InputNFMPhonePage
      case "NFM Check your answers page"                => NFMCheckYourAnswersPage
      case "MNE or domestic page"                       => FDGroupStatusPage
      case "Group accounting period page"               => GroupAccountingPeriodPage
      case "FD check your answers page"                 => FurtherDetailsCheckYourAnswersPage
      case "Contact details guidance page"              => ContactDetailsGuidancePage
      case "Contact details display page"               => ContactDetailsDisplayPage
      case "Contact details input name page"            => ContactDetailsInputNamePage
      case "Contact details input email page"           => ContactDetailsInputEmailPage
      case "Contact details phone page"                 => ContactDetailsPhonePage
      case "Contact details change phone page"          => ContactDetailsChangePhonePage
      case "Contact details input phone page"           => ContactDetailsInputPhonePage
      case "Contact address input page"                 => ContactAddressInputPage
      case "Registration confirmation page"             => RegistrationConfirmationPage
      case "Dashboard page"                             => DashboardPage
      case "Draft guidance page"                        => DraftGuidancePage
      case "Review answers page"                        => ReviewAnswersPage
      case "UPE registration failed error page"         => UPEGRSRegistrationFailedErrorPage
      case "UPE registration not called error page"     => UPEGRSRegistrationNotCalledErrorPage
      case "NFM registration failed error page"         => NFMGRSRegistrationFailedErrorPage
      case "NFM registration not called error page"     => NFMGRSRegistrationNotCalledErrorPage
      case "accounts summary page"                      => AccountsSummaryPage
      case "agent services account page"                => AgentServicesAccountPage
      case "Agent services account page2"               => AgentServicesAccountPage2
      case "Registration return error page"             => RegistrationReturnErrorPage
      case "ASA Pillar2 Input Page"                     => ASAPillar2InputPage
      case "ASA Confirmation Page"                      => ASAConfirmationPage
      case "ASA Home Page"                              => ASAHomePage
      case "ASA Not Authorised page"                    => ASANotAuthorisedPage
      case "Amend API error Page for RFM"               => AmendAPIerrorPage_RFM
      case "ASA Individual KB Page"                     => ASAIndividualKBPage
      case "ASA Organisation KB Page"                   => ASAOrganisationKBPage
      case "Registration Duplication KB Page"           => RegistrationDuplicationKBPage
      case "Registration processing page"               => RegistrationProcessingPage
      case "Repayment processing page"                  => RepaymentProcessingPage
      case "Outstanding Payment Page"                   => OutstandingPaymentsPage
      case "BTN Accounting Period Page"                 => BtnAccountingPage
      case "BTN Multiple Accounting Period Page"        => BtnMultipleAccountingPage
      case "BTN Start Page"                             => BtnStartPage
      case "BTN Domestic or MNE Page"                   => BtnDomesticOrMnePage
      case "BTN AGD KB Page"                            => BtnAgdKBPage
      case "BTN CYA Submit Page"                        => BtnCyaSubmitPage
      case "BTN Confirmation Page"                      => BtnConfirmationPage
    }
  }
}
