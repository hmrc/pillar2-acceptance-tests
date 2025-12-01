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
import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pages.btn.BtnUnderEnquiryPage

object CommonFunctions
    extends BrowserDriver with Eventually with Matchers {

  def pageMatch(page: String): PageObject = {
    page match {
      case "NFM EQ page"                                => NFMEQPage
      case "NFM details page"                           => NFMDetailsPage
      case "NFM registration page"                      => NFMRegistrationPage
      case "business EQ page"                           => BusinessActivityEQPage
      case "guidance page"                              => Pillar2GovUkGuidancePage
      case "Global gross revenue"                       => GlobalGrossRevenueEQPage
      case "confirmation page"                          => ConfirmationPage
      case "BA guidance page"                           => BAGuidancePage
      case "NFM guidance page"                          => NFMGuidancePage
      case "GGR guidance page"                          => GGRGuidancePage
      case "auth-login page"                            => AuthLoginOldPage
      case "Task list page"                             => TaskListPage
      case "Initial guidance Page"                      => InitialGuidancePage
      case "UPE business page"                          => UPEPage
      case "UPE EQ page"                                => UPEEQPage
      case "input-upe-name page"                        => InputUPENamePage
      case "input-upe-address page"                     => UPEAddressPage
      case "UPE Phone page"                             => UPEPhonePage
      case "input phone page"                           => InputUPEPhonePage
      case "Under Construction Page"                    => UnderConstructionPage
      case "UPE Contact person/team Name page"          => UPEContactNamePage
      case "UPE Contact Email page"                     => UPEContactEmailPage
      case "UPE entity type page"                       => UPEEntityTypePage
      case "NFM entity type page"                       => NFMEntityTypePage
      case "UKCompany GRS page"                         => UKCompanyGRSPage
      case "NFM UKCompany GRS page"                     => NFMUKCompanyGRSPage
      case "LLP GRS page"                               => LLPGRSPage
      case "NFM LLP GRS page"                           => NFMLLPGRSPage
      case "Check your answers page"                    => UPECheckYourAnswersPage
      case "Contact details Check answers page"         => ContactDetailsCheckAnswersPage
      case "NFM Name page"                              => NFMNamePage
      case "NFM Address page"                           => NFMAddressPage
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
      case "Second Contact details page"                => SecondContactDetailsPage
      case "Second Contact name page"                   => SecondContactNamePage
      case "Second Contact email page"                  => SecondContactEmailPage
      case "Second Contact number page"                 => SecondContactNumberPage
      case "Second Contact Input page"                  => SecondContactInputPage
      case "Bookmark page"                              => BookMarkPage
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
      case "contact details summary page"               => ContactDetailsSummaryPage
      case "duplicate ack ref error page"               => DuplicateAckRefErrorPage
      case "Make a payment page"                        => MakePaymentPage
      case "bta pillar2 ID check page"                  => BTAPillar2IDCheckPage
      case "eacd page"                                  => EACDPage
      case "bta register guidance page"                 => BTARegisterGuidancePage
      case "Subscription API error page"                => SubscriptionAPIerrorPage
      case "Registration API error page"                => RegistrationAPIerrorPage
      case "Registration In Progress page"              => RegistrationInProgressPage
      case "RFM start page"                             => RFMStartPage
      case "Individual RFM KB Page"                     => IndividualRFMKBPage
      case "Agent RFM KB Page"                          => AgentRFMKBPage
      case "RFM enter pillar2 id page"                  => RFMEnterPillar2IdPage
      case "Assistant User RFM KB Page"                 => AssistantUserRFMKBPage
      case "Duplicate RFM KB Page"                      => DuplicateRFMKBPage
      case "RFM Registration Date Page"                 => RFMRegistrationDatePage
      case "Incomplete Data Submission Error Page"      => IncompleteDataSubmissionErrorPage
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
      case "ASA No record Match Error Page"             => ASANoMatchErrorPage
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
      case "Non UK Bank Account Payment Page"           => NonUKBankAccountPaymentPage
      case "UK Bank Account Payment Page"               => UKBankAccountPaymentPage
      case "Repayment Guidance Page"                    => RepaymentGuidancePage
      case "Repayment Amount Page"                      => RepaymentAmountPage
      case "Repayment Contact Page"                     => RepaymentContactPage
      case "Repayment Contact Email Page"               => RepaymentContactEmailPage
      case "Repayment Phone Page"                       => RepaymentPhonePage
      case "Repayment Phone Input Page"                 => RepaymentPhoneInputPage
      case "Reason For Refund Page"                     => RepaymentReasonPage
      case "Repayment Method Page"                      => RepaymentMethodPage
      case "Repayment CYA Page"                         => RepaymentCYAPage
      case "Repayment Could Not Confirm Error Page"     => RepaymentCouldNotConfirmErrorPage
      case "Repayment Bank Details Error Page"          => RepaymentBankDetailsErrorPage
      case "Repayment Bars Error Page"                  => RepaymentBarsErrorPage
      case "Repayment Partial Name Error Page"          => RepaymentPartialNameErrorPage
      case "Repayment Incomplete Error Page"            => RepaymentIncompleteErrorPage
      case "Repayment Journey Recovery Error Page"      => RepaymentJourneyRecoveryErrorPage
      case "Repayment Confirmation Page"                => RepaymentConfirmationPage
      case "Repayment Return Error Page"                => RepaymentReturnErrorPage
      case "Registration Duplication KB Page"           => RegistrationDuplicationKBPage
      case "Transaction History Page"                   => TransactionHistoryPage
      case "Transaction History Second Page"            => TransactionHistorySecondPage
      case "Transaction History Empty Page"             => TransactionHistoryEmptyPage
      case "Transaction History Error Page"             => TransactionHistoryErrorPage
      case "Registration processing page"               => RegistrationProcessingPage
      case "Repayment processing page"                  => RepaymentProcessingPage
      case "RFM processing page"                        => RFMProcessingPage
      case "RFM Existing Member KB Page"                => RFMExistingMemberKBPage
      case "Unauthorised Page"                          => UnauthorisedPage
      case "Repayment change amount Page"               => RepaymentChangeAmountPage
      case "Repayment change method Page"               => RepaymentChangeMethodPage
      case "Repayment change name Page"                 => RepaymentChangeNamePage
      case "Manage contact name Page"                   => ManageContactNamePage
      case "Manage second contact name"                 => ManageSecondContactNamePage
      case "Manage contact address Page"                => ManageContactAddressPage
      case "Manage group status Page"                   => ManageGroupStatusPage
      case "Manage accounting period Page"              => ManageAccountPeriodPage
      case "Manage Account processing Page"             => ManageAccountProcessingPage
      case "Manage Contact processing Page"             => ManageContactProcessingPage
      case "Outstanding Payment Page"                   => OutstandingPaymentsPage
      case "Due & Over Due Page"                        => DueOverduePage
      case "BTN Accounting Period Page"                 => BtnAccountingPage
      case "BTN Multiple Accounting Period Page"        => BtnMultipleAccountingPage
      case "BTN Start Page"                             => BtnStartPage
      case "BTN Domestic or MNE Page"                   => BtnDomesticOrMnePage
      case "BTN AGD KB Page"                            => BtnAgdKBPage
      case "BTN CYA Submit Page"                        => BtnCyaSubmitPage
      case "BTN Confirmation Page"                      => BtnConfirmationPage
      case "BTN Cannot Return Page"                     => BtnCannotReturnPage
      case "BTN Problem with service Page"              => BtnProblemWithServicePage
      case "MTT to DTT kb page"                         => MttToDttPage
   //   case "BTN Under Enquiry Page"                     => BtnUnderEnquiryPage
    }
  }
}
