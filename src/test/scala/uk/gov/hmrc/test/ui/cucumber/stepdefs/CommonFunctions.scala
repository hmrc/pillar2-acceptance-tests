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
import uk.gov.hmrc.test.ui.cucumber.{Nav, PageObject, Wait}
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, BAGuidancePage, BusinessActivityEQPage, CheckYourAnswersPage, ConfirmationPage, EmployeeStatusPage, GGRGuidancePage, GUKGuidancePage, GlobalGrossRevenueEQPage, GuidancePage, InitialGuidancePage, InputCRNPage, InputTelephonePage,LLPGRSPage, InputUPENamePage, MTGuidancePage, MultipleTerritoriesEQPage, NextEQPage, TaskListPage, UKCompanyGRSPage, UPEAddressPage, UPEContactEmailPage, UPEContactNamePage, UPEOrgTypePage, UPEContactPage, UPEPage, UPETelephonePage, UnderConstructionPage}


trait CommonFunctions
  extends ScalaDsl with EN with BrowserDriver with Eventually with Matchers {

  def pageMatch(page: String): PageObject = {
    page match {
      case "multiple territories EQ page"     => MultipleTerritoriesEQPage
      case "business EQ page"                 => BusinessActivityEQPage
      case "next EQ page"                     => NextEQPage
      case "guidance page"                    => GuidancePage
      case "Global gross revenue"             => GlobalGrossRevenueEQPage
      case "confirmation page"                => ConfirmationPage
      case "BA guidance page"                 => BAGuidancePage
      case "MT guidance page"                 => MTGuidancePage
      case "GGR guidance page"                => GGRGuidancePage
      case "gov uk guidance page"             => GUKGuidancePage
      case "auth-login page"                  => AuthLoginPage
      case "Task list page"                   => TaskListPage
      case "Initial guidance Page"            => InitialGuidancePage
      case "employee status page"             => EmployeeStatusPage
      case "UPE page"                         => UPEPage
      case "input-upe-name page"              => InputUPENamePage
      case "input-crn page"                   => InputCRNPage
      case "input-upe-address page"           => UPEAddressPage
      case "UPE Telephone page"               => UPETelephonePage
      case "input telephone page"             => InputTelephonePage
      case "under construction page"          => UnderConstructionPage
      case "UPE Contact person/team Name page" => UPEContactNamePage
      case "UPE Contact Email page"            => UPEContactEmailPage
      case "UPE Contact page"                  => UPEContactPage
      case "UPE Org type page"                 => UPEOrgTypePage
      case "UKCompany GRS page"                => UKCompanyGRSPage
      case "LLP GRS page"                      => LLPGRSPage
      case "Check your answers page"           => CheckYourAnswersPage
    }
  }
}
