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
      case "Assistant role KB page"                     => AssistantRoleKBPage
      case "Agent affinity KB page"                     => AgentAffinityKBPage
      case "agent services account page"                => AgentServicesAccountPage
      case "Agent services account page2"               => AgentServicesAccountPage2
      case "Individual affinity KB page"                => IndividualAffinityKBPage
      case "Registration return error page"             => RegistrationReturnErrorPage
      case "RFM start page"                             => RFMStartPage
      case "Individual RFM KB Page"                     => IndividualRFMKBPage
      case "Agent RFM KB Page"                          => AgentRFMKBPage
      case "RFM enter pillar2 id page"                  => RFMEnterPillar2IdPage
      case "Assistant User RFM KB Page"                 => AssistantUserRFMKBPage
      case "Duplicate RFM KB Page"                      => DuplicateRFMKBPage
      case "RFM Registration Date Page"                 => RFMRegistrationDatePage
      case "RFM CYA Page"                               => RFMCYAPage
      case "RFM Corp Position Page"                     => RFMCorpPositionPage
      case "New NFM guidance page"                      => NewNFMGuidancePage
      case "RFM registered in UK page"                  => RFMRegisteredInUKPage
      case "RFM Contact Guidance page"                  => RFMContactGuidancePage
      case "RFM Contact Detail Page"                    => RFMContactDetailNamePage
      case "RFM Contact Email Page"                     => RFMContactEmailPage
      case "RFM Contact Number Page"                    => RFMContactNumberPage
      case "RFM Contact Input Page"                     => RFMContactInputPage
      case "RFM New NFM Contact Name Page"              => RFMNewNFMContactNamePage
      case "RFM New NFM Contact Address Page"           => RFMNewNFMContactAddressInputPage
      case "RFM No ID CYA Page"                         => RFMNoIDCYAPage
      case "RFM New NFM Contact Name Change"            => RFMNewNFMContactNameChangePage
      case "RFM No ID Change CYA Page"                  => RFMNoIDChangeCYAPage
      case "RFM Second Contact Question Page"           => RFMSecondContactQuestionPage
      case "RFM second contact name page"               => RFMSecondContactNamePage
      case "RFM second contact email page"              => RFMSecondContactEmailPage
      case "RFM second contact phone question page"     => RFMSecondContactPhoneQuestionPage
      case "RFM second contact phone page"              => RFMSecondContactPhonePage
      case "RFM UK based entity type page"              => RFMGRSEntityTypePage
      case "RFM UK limited Company GRSPage"             => RFMUKLimitedCompanyGRSPage
      case "RFM LLP GRS page"                           => RFMLLPGRSPage
      case "RFM GRS Registration Not Called Error Page" => RFMGRSRegistrationNotCalledErrorPage
      case "RFM GRS Registration Mismatch Error Page"   => RFMGRSRegistrationMismatchErrorPage
      case "RFM Contact Address Page"                   => RFMContactAddressPage
      case "RFM Final Review Page"                      => RFMFinalReviewCYAPage
      case "ASA Pillar2 Input Page"                     => ASAPillar2InputPage
      case "RFM No record Match Error Page"             => RFMNoMatchErrorPage
      case "RFM Saving Progress Page"                   => RFMSavingProgressPage
      case "ASA Confirmation Page"                      => ASAConfirmationPage
      case "ASA Home Page"                              => ASAHomePage
      case "RFM No Return Back Error Page"              => RFMNoReturnBackErrorPage
      case "ASA Not Authorised page"                    => ASANotAuthorisedPage
      case "RFM Confirmation Page"                      => RFMConfirmationPage
      case "Amend API error Page for RFM"               => AmendAPIerrorPage_RFM
      case "ASA Individual KB Page"                     => ASAIndividualKBPage
      case "ASA Organisation KB Page"                   => ASAOrganisationKBPage
      case "RFM journey recovery page"                  => RFMJourneyRecoveryPage
      case "RFM incomplete task error page"             => RFMIncompleteErrorPage
      case "Registration Duplication KB Page"           => RegistrationDuplicationKBPage
      case "Registration processing page"               => RegistrationProcessingPage
      case "Repayment processing page"                  => RepaymentProcessingPage
      case "RFM processing page"                        => RFMProcessingPage
      case "RFM Existing Member KB Page"                => RFMExistingMemberKBPage
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
