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
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.upe.UPEEntityTypePage

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


  // ^I should see date field (.*) is pre-populated with (.*)$
}