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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._

object NFMSteps {

  // ^(.*) logs in NFM name page for Pillar2$
  def givenXLogsInNFMNamePageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMName(name)
          case _                   => AuthLoginPage.loginToNFMName(name)
        }
  }

  // ^(.*) logs in NFM address page for Pillar2$
  def givenXLogsInNFMAddressPageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMAddress(name)
          case _                   => AuthLoginPage.loginToNFMAddress(name)
        }
  }

  // ^(.*) logs in NFM Contact Name page for Pillar2$
  def givenXLogsInNFMContactNamePageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMContactName(name)
          case _                   => AuthLoginPage.loginToNFMContactName(name)
        }
  }

  // ^(.*) logs in NFM Contact Email page for Pillar2$
  def givenXLogsInNFMContactEmailPageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMContactEmail(name)
          case _                   => AuthLoginPage.loginToNFMContactEmail(name)
        }
  }

}
