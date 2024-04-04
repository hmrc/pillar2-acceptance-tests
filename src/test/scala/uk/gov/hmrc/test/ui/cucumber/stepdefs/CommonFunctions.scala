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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.cucumber.PageObject
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages._
trait CommonFunctions
  extends ScalaDsl with EN with BrowserDriver with Eventually with Matchers {

  def pageMatch(page: String): PageObject = {
    page match {
      case "multiple territories EQ page"         => MultipleTerritoriesEQPage
      case "NFM EQ page"                          => NFMEQPage
      case "NFM details page"                     => NFMDetailsPage
      case "NFM registration page"                => NFMRegistrationPage
      case "business EQ page"                     => BusinessActivityEQPage
      case "guidance page"                        => Pillar2GovUkGuidancePage
      case "Global gross revenue"                 => GlobalGrossRevenueEQPage
      case "confirmation page"                    => ConfirmationPage
      case "BA guidance page"                     => BAGuidancePage
      case "NFM guidance page"                    => NFMGuidancePage
      case "MT guidance page"                     => MTGuidancePage
      case "GGR guidance page"                    => GGRGuidancePage
      case "gov uk guidance page1"                => GUKGuidancePage1
      case "gov uk guidance page2"                => GUKGuidancePage2
      case "gov uk guidance page3"                => GUKGuidancePage3
      case "auth-login page"                      => AuthLoginPage
      case "Task list page"                       => TaskListPage
      case "Initial guidance Page"                => InitialGuidancePage
      case "UPE business page"                    => UPEPage
      case "UPE EQ page"                          => UPEEQPage
      case "input-upe-name page"                  => InputUPENamePage
      case "input-upe-address page"               => UPEAddressPage
      case "UPE Telephone page"                   => UPETelephonePage
      case "input telephone page"                 => InputUPETelephonePage
      case "under construction page"              => UnderConstructionPage
      case "UPE Contact person/team Name page"    => UPEContactNamePage
      case "UPE Contact Email page"               => UPEContactEmailPage
      case "UPE entity type page"                 => UPEEntityTypePage
      case "NFM entity type page"                 => NFMEntityTypePage
      case "UKCompany GRS page"                   => UKCompanyGRSPage
      case "NFM UKCompany GRS page"               => NFMUKCompanyGRSPage
      case "LLP GRS page"                         => LLPGRSPage
      case "NFM LLP GRS page"                     => NFMLLPGRSPage
      case "Check your answers page"              => UPECheckYourAnswersPage
      case "Contact details Check answers page"   => ContactDetailsCheckAnswersPage
      case "NFM Name page"                        => NFMNamePage
      case "NFM Address page"                     => NFMAddressPage
      case "NFM Contact Name page"                => NFMContactNamePage
      case "NFM Contact Email page"               => NFMContactEmailPage
      case "NFM Telephone page"                   => NFMTelephonePage
      case "input nfm telephone page"             => InputNFMTelephonePage
      case "NFM Check your answers page"          => NFMCheckYourAnswersPage
      case "MNE or domestic page"                 => FDGroupStatusPage
      case "Group accounting period page"         => GroupAccountingPeriodPage
      case "FD check your answers page"           => FurtherDetailsCheckYourAnswersPage
      case "Contact details guidance page"        => ContactDetailsGuidancePage
      case "Contact details display page"         => ContactDetailsDisplayPage
      case "Contact details input name page"      => ContactDetailsInputNamePage
      case "Contact details input email page"     => ContactDetailsInputEmailPage
      case "Contact details telephone page"       => ContactDetailsTelephonePage
      case "Contact details change telephone page"=> ContactDetailsChangeTelephonePage
      case "Contact details input telephone page" => ContactDetailsInputTelephonePage
      case "Second Contact details page"          => SecondContactDetailsPage
      case "Second Contact name page"             => SecondContactNamePage
      case "Second Contact email page"            => SecondContactEmailPage
      case "Second Contact number page"           => SecondContactNumberPage
      case "Second Contact Input page"            => SecondContactInputPage
      case "Bookmark page"                        => BookMarkPage
      case "Contact address input page"           => ContactAddressInputPage
      case "Registration confirmation page"       => RegistrationConfirmationPage
      case "Dashboard page"                       => DashboardPage
      case "Draft guidance page"                  => DraftGuidancePage
      case "Review answers page"                  => ReviewAnswersPage
      case "UPE registration failed error page"   => UPEGRSRegistrationFailedErrorPage
      case "UPE registration not called error page" => UPEGRSRegistrationNotCalledErrorPage
      case "search register page"                 => SearchRegisterPage
      case "Corporation Tax UTR page"             => CorporationTaxUTRPage
      case "NFM registration failed error page"   => NFMGRSRegistrationFailedErrorPage
      case "NFM registration not called error page" => NFMGRSRegistrationNotCalledErrorPage
      case "accounts summary page"                => AccountsSummaryPage
      case "Assistant role KB page"               => AssistantRoleKBPage
      case "Agent affinity KB page"               => AgentAffinityKBPage
      case "Agent services account page"          => AgentServicesAccountPage
      case "Individual affinity KB page"          => IndividualAffinityKBPage
      case "Registration return error page"       => RegistrationReturnErrorPage
      case "contact details summary page"         => ContactDetailsSummaryPage
      case "error place holder page"              => ErrorPlaceHolderPage
      case "duplicate ack ref error page"         => DuplicateAckRefErrorPage
      case "Make a payment page"                  => MakePaymentPage
      case "bta pillar2 ID check page"            => BTAPillar2IDCheckPage
      case "eacd page"                            => EACDPage
      case "bta register guidance page"           => BTARegisterGuidancePage
      case "bta register confirmation page"       => BTARegisterConfirmationPage
      case "Subscription API error page"          => SubscriptionAPIerrorPage
      case "Registration API error page"          => RegistrationAPIerrorPage
      case "RFM start page"                       => RFMStartPage
      case "Individual RFM KB Page"               => IndividualRFMKBPage
      case "Agent RFM KB Page"                    => AgentRFMKBPage
      case "RFM enter pillar2 id page"            => RFMEnterPillar2IdPage
      case "Assistant User RFM KB Page"           => AssistantUserRFMKBPage
      case "Duplicate RFM KB Page"                => DuplicateRFMKBPage
      case "RFM Registration Date Page"           => RFMRegistrationDatePage
      case "Incomplete Data Submission Error Page"=> IncompleteDataSubmissionErrorPage
      case "RFM CYA Page"                         => RFMCYAPage
      case "RFM Corp Position Page"               => RFMCorpPositionPage
      case "P2 Submission Set Up Page"            => P2SubmissionSetUpPage
      case "New NFM guidance page"                => NewNFMGuidancePage
      case "RFM registered in UK page"            => RFMRegisteredInUKPage
      case "RFM Contact Guidance page"            => RFMContactGuidancePage
      case "RFM Contact Detail Page"              => RFMContactDetailNamePage
      case "RFM Contact Email Page"               => RFMContactEmailPage
      case "RFM Contact Number Page"              => RFMContactNumberPage
      case "RFM Contact Input Page"               => RFMContactInputPage
    }
  }
}
