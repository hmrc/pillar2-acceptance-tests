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
import uk.gov.hmrc.test.ui.pillar2SubmissionPages._

trait Pillar2SubmissionPage
    extends ScalaDsl with EN with BrowserDriver with Eventually with Matchers {

  def p2SubPageMatch(page: String): PageObject = {
    page match {

      case "Under Construction Page"                   => UnderConstructionPage
      case "ASA Pillar2 Input Page"                    => ASAPillar2InputPage
      case "ASA No record Match Error Page"            => ASANoMatchErrorPage
      case "ASA Confirmation Page"                     => ASAConfirmationPage
      case "ASA Home Page"                             => ASAHomePage
      case "ASA Not Authorised page"                   => ASANotAuthorisedPage
      case "ASA Individual KB Page"                    => ASAIndividualKBPage
      case "ASA Organisation KB Page"                  => ASAOrganisationKBPage
      case "BTN Start Page"                            => P2SubBtnStartPage
      case "BTN Accounting Period Page"                => P2SubBtnAccountingPage
      case "BTN Domestic or MNE Page"                  => P2SubBtnDomesticOrMnePage
      case "BTN Change Domestic or MNE Page"           => P2SubBtnChangeDomesticOrMnePage
      case "BTN CYA Submit Page"                       => P2CYASubmitPage
      case "BTN AGD KB Page"                           => P2SubBtnAgdKBPage
      case "accounts summary page"                     => P2SubAccountsSummaryPage
      case "UK Tax Return Page"                        => P2UkTaxReturnPage
      case "P2 Submission Agent affinity KB page"      => P2SubAgentAffinityKBPage
      case "P2 Submission Assistant role KB page"      => P2SubAssistantRoleKBPage
      case "P2 Submission Individual affinity KB page" => P2SubIndividualAffinityKBPage
      case "P2 Submission Set Up Page"                 => P2SubmissionSetUpPage
      case "BTN Return Submission KB Page"             => P2BTNReturnSubmissionKBPage
      case "P2 ASA Dashboard page"                     => P2ASADashboardPage
      case "Dashboard page"                            => P2ASADashboardPage
      case "P2 ASA Home Page"                          => P2ASAHomePage
      case "P2 Home page"                              => P2HomePage
      case "BTN Confirmation Page"                     => P2ConfirmationPage
      case "BTN Cannot Return Page"                    => P2SubBTNCannotReturnPage
      case "BTN Problem with service Page"             => P2SubBTNProblemWithServicePage
      case "Due & Over Due Page"                       => P2DueOverduePage
    }
  }
}
