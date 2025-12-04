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

package uk.gov.hmrc.test.ui.pages.btn

import uk.gov.hmrc.test.ui.pages.BasePage

object BtnMultipleAccountingPage extends BasePage {
  override val url: String = s"${baseUrl}below-threshold-notification/choose-accounting-period"

  private val CurrentAccountingPeriod               = "radio_0"
  private val PreviousAccountingPeriod              = "radio_1"
  private val PreviousAccountingPeriodUKTRSubmitted = "radio_2"
  private val PreviousAccountingPeriodBTnSubmitted  = "radio_3"

  def selectCurrentAccountingPeriod(): Unit = {
    onPage()
    clickById(CurrentAccountingPeriod)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriod(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriod)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriodUKTRSubmitted)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriodBTnSubmitted)
    clickByClassName(continue)
  }
}
