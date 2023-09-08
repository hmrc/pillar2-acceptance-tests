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

import uk.gov.hmrc.test.ui.cucumber.Input.{getAttribueOf, getAttributeOf}
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.pages.{GroupAccountingPeriodPage, InputUPENamePage}

class SubscriptionJourneySteps extends CommonFunctions {

  And("""^Accounting Period (.*) is entered as (.*)$""") { (field: String, name: String) =>
    field match {
      case "Start Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startDay)
        Input.sendKeysById(name, GroupAccountingPeriodPage.startDay)

      case "Start Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startMonth)
        Input.sendKeysById(name, GroupAccountingPeriodPage.startMonth)

      case "Start Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startYear)
        Input.sendKeysById(name, GroupAccountingPeriodPage.startYear)

      case "End Day" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endDay)
        Input.sendKeysById(name, GroupAccountingPeriodPage.endDay)

      case "End Month" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endMonth)
        Input.sendKeysById(name, GroupAccountingPeriodPage.endMonth)

      case "End Year" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endYear)
        Input.sendKeysById(name, GroupAccountingPeriodPage.endYear)
    }
  }
  And("""^I should see date field (.*) is pre-populated with (.*)$""") { (field: String, name: String) =>
    field match {
      case "Start Day" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.startDay, "value").equals(name))

      case "Start Month" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.startMonth, "value").equals(name))

      case "Start Year" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.startYear, "value").equals(name))

      case "End Day" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.endDay, "value").equals(name))

      case "End Month" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.endMonth, "value").equals(name))

      case "End Year" =>
        assert(getAttributeOf(GroupAccountingPeriodPage.endYear, "value").equals(name))
    }
  }
}



