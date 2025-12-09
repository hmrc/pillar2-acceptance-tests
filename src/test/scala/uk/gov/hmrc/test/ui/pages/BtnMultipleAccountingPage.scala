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

package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.helper.Find.findById
import uk.gov.hmrc.test.ui.helper.PageObject

object BtnMultipleAccountingPage extends PageObject {
  val url: String                           = s"$rootUrl" + "below-threshold-notification/choose-accounting-period"
  val CurrentAccountingPeriod               = "radio_0"
  val PreviousAccountingPeriod              = "radio_1"
  val PreviousAccountingPeriodUKTRSubmitted = "radio_2"
  val PreviousAccountingPeriodBTnSubmitted  = "radio_3"

  def selectCurrentAccountingPeriod(): Unit               = findById(CurrentAccountingPeriod).click()
  def selectPreviousAccountingPeriod(): Unit              = findById(PreviousAccountingPeriod).click()
  def selectPreviousAccountingPeriodBTNSubmitted(): Unit  = findById(PreviousAccountingPeriodBTnSubmitted).click()
  def selectPreviousAccountingPeriodUKTRSubmitted(): Unit = findById(PreviousAccountingPeriodUKTRSubmitted).click()
}
