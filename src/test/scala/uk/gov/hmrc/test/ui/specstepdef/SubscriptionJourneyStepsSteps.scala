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

package uk.gov.hmrc.test.ui.specstepdef

import io.cucumber.datatable.DataTable
import uk.gov.hmrc.test.ui.cucumber.Input.getAttributeOfId
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.pages._

object SubscriptionJourneyStepsSteps {

  // ^I enter account period as:$
  def andIEnterAccountPeriodAs(accountPeriod: DataTable): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
        Input.enterData(accountPeriod)
        UPEEntityTypePage.clickContinue()
  }

  //todo: commented overload Test and delete if required.

  // Overload for ScalaTest (no DataTable, accepts varargs)
//  def andIEnterAccountPeriodAs(links: (String, String)*): Unit = {
//    links.foreach { case (text, url) =>
//      val driverWait: WebDriverWait =
//        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
//      driverWait.until(
//        ExpectedConditions.elementToBeClickable(
//          Driver.instance.findElement(By.id(url))
//        )
//      )
//      verifyLinkById(url, text)
//    }
//  }

  // ^Accounting Period (.*) is entered as (.*)$
  def andAccountingPeriodXIsEnteredAsX(field: String, name: String): Unit = {
    field match {
          case "Start Day" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startDay)
            Input.sendKeysById(GroupAccountingPeriodPage.startDay, name)

          case "Start Month" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startMonth)
            Input.sendKeysById(GroupAccountingPeriodPage.startMonth, name)

          case "Start Year" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.startYear)
            Input.sendKeysById(GroupAccountingPeriodPage.startYear, name)

          case "End Day" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endDay)
            Input.sendKeysById(GroupAccountingPeriodPage.endDay, name)

          case "End Month" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endMonth)
            Input.sendKeysById(GroupAccountingPeriodPage.endMonth, name)

          case "End Year" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentById(GroupAccountingPeriodPage.endYear)
            Input.sendKeysById(GroupAccountingPeriodPage.endYear, name)
        }
  }

  // ^I should see date field (.*) is pre-populated with (.*)$
  def andIShouldSeeDateFieldXIsPrepopulatedWithX(field: String, name: String): Unit = {
    field match {
          case "Start Day" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.startDay, "value").equals(name))

          case "Start Month" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.startMonth, "value").equals(name))

          case "Start Year" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.startYear, "value").equals(name))

          case "End Day" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.endDay, "value").equals(name))

          case "End Month" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.endMonth, "value").equals(name))

          case "End Year" =>
            assert(getAttributeOfId(GroupAccountingPeriodPage.endYear, "value").equals(name))
        }
  }
}