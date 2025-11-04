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

package uk.gov.hmrc.test.ui.specstepdef

import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.cucumber.PageObject
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.contactDetails.{ContactDetailsChangePhonePage, ContactDetailsDisplayPage, ContactDetailsSummaryPage, SecondContactEmailPage, SecondContactInputPage, SecondContactNamePage, SecondContactNumberPage}
import uk.gov.hmrc.test.ui.specpages.nfm.{NFMAddressPage, NFMCheckYourAnswersPage, NFMContactEmailPage, NFMContactNamePage, NFMEQPage, NFMGuidancePage, NFMNamePage, NFMPhonePage}
import uk.gov.hmrc.test.ui.specpages.repayments.{RepaymentAmountPage, RepaymentBankDetailsErrorPage, RepaymentBarsErrorPage, RepaymentCYAPage, RepaymentChangeAmountPage, RepaymentChangeMethodPage, RepaymentChangeNamePage, RepaymentConfirmationPage, RepaymentContactEmailPage, RepaymentContactPage, RepaymentCouldNotConfirmErrorPage, RepaymentGuidancePage, RepaymentIncompleteErrorPage, RepaymentJourneyRecoveryErrorPage, RepaymentMethodPage, RepaymentPartialNameErrorPage, RepaymentPhoneInputPage, RepaymentPhonePage, RepaymentProcessingPage, RepaymentReasonPage, RepaymentReturnErrorPage}
import uk.gov.hmrc.test.ui.specpages.rfm.{RFMConfirmationPage, RFMContactAddressPage, RFMContactDetailNamePage, RFMContactEmailPage, RFMContactGuidancePage, RFMContactInputPage, RFMContactNumberPage, RFMCorpPositionPage, RFMFinalReviewCYAPage, RFMGRSEntityTypePage, RFMGRSRegistrationMismatchErrorPage, RFMGRSRegistrationNotCalledErrorPage, RFMIncompleteErrorPage, RFMJourneyRecoveryPage, RFMLLPGRSPage, RFMNewNFMContactAddressInputPage, RFMNewNFMContactNameChangePage, RFMNewNFMContactNamePage, RFMNoIDCYAPage, RFMNoIDChangeCYAPage, RFMNoMatchErrorPage, RFMNoReturnBackErrorPage, RFMProcessingPage, RFMRegisteredInUKPage, RFMSecondContactEmailPage, RFMSecondContactNamePage, RFMSecondContactPhonePage, RFMSecondContactPhoneQuestionPage, RFMSecondContactQuestionPage, RFMUKLimitedCompanyGRSPage}

object CommonFunctions
    extends ScalaDsl with EN with BrowserDriver with Eventually with Matchers {

  def pageMatch(page: String): PageObject = {
    page match {
      case "NFM EQ page"                                => NFMEQPage
      case "business EQ page"                           => BusinessActivityEQPage
      case "guidance page"                              => Pillar2GovUkGuidancePage
      case "Global gross revenue"                       => GlobalGrossRevenueEQPage
      case "confirmation page"                          => ConfirmationPage
      case "BA guidance page"                           => BAGuidancePage
      case "NFM guidance page"                          => NFMGuidancePage
      case "GGR guidance page"                          => GGRGuidancePage
      case "auth-login page"                            => AuthLoginPage
      case "Initial guidance Page"                      => InitialGuidancePage
      case "UPE EQ page"                                => UPEEQPage
      case "Under Construction Page"                    => UnderConstructionPage
      case "NFM Name page"                              => NFMNamePage
      case "NFM Address page"                           => NFMAddressPage
      case "NFM Contact Name page"                      => NFMContactNamePage
      case "NFM Contact Email page"                     => NFMContactEmailPage
      case "NFM Phone page"                             => NFMPhonePage
      case "input nfm phone page"                       => InputNFMPhonePage
      case "NFM Check your answers page"                => NFMCheckYourAnswersPage
      case "Contact details display page"               => ContactDetailsDisplayPage
      case "Contact details change phone page"          => ContactDetailsChangePhonePage
      case "Second Contact name page"                   => SecondContactNamePage
      case "Second Contact email page"                  => SecondContactEmailPage
      case "Second Contact number page"                 => SecondContactNumberPage
      case "Second Contact Input page"                  => SecondContactInputPage
      case "Bookmark page"                              => BookMarkPage
      case "Registration confirmation page"             => RegistrationConfirmationPage
      case "Draft guidance page"                        => DraftGuidancePage
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
      case "Incomplete Data Submission Error Page"      => IncompleteDataSubmissionErrorPage
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
      case "RFM No record Match Error Page"             => RFMNoMatchErrorPage
      case "ASA Home Page"                              => ASAHomePage
      case "RFM No Return Back Error Page"              => RFMNoReturnBackErrorPage
      case "RFM Confirmation Page"                      => RFMConfirmationPage
      case "Amend API error Page for RFM"               => AmendAPIerrorPage_RFM
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
      case "BTN Multiple Accounting Period Page"        => BtnMultipleAccountingPage
    }
  }
}
