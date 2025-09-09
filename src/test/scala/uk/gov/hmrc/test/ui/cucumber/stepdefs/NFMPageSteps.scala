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

import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.{Find, Wait}
import uk.gov.hmrc.test.ui.pages._

class NFMPageSteps extends CommonFunctions {

  Given("""^(.*) logs in NFM name page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMName(name)
      case _                   => AuthLoginPage.loginToNFMName(name)
    }
  }

  Given("""^(.*) logs in NFM address page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMAddress(name)
      case _                   => AuthLoginPage.loginToNFMAddress(name)
    }
  }

  Given("""^(.*) logs in NFM Contact Name page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMContactName(name)
      case _                   => AuthLoginPage.loginToNFMContactName(name)
    }
  }

  Given("""^(.*) logs in NFM Contact Email page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMContactEmail(name)
      case _                   => AuthLoginPage.loginToNFMContactEmail(name)
    }
  }

  Given("""^(.*) logs in NFM Phone page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMPhone(name)
      case _                   => AuthLoginPage.loginToNFMPhone(name)
    }
  }

  Given("""^(.*) logs in Further details group status page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToFDGroupStatus(name)
      case _                   => AuthLoginPage.loginToFDGroupStatus(name)
    }
  }

  Given("""^(.*) logs in NFM Phone input page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToNFMPhoneInput(name)
      case _                   => AuthLoginPage.loginToNFMPhoneInput(name)
    }
  }
}
