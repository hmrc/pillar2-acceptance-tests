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

package uk.gov.hmrc.test.ui.pages.btn

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object BtnAccountingPage extends BasePage {
  override val url: String          = s"${baseUrl}below-threshold-notification/accounting-period"
  private val accountDetailsSummary = "a[href*='/account-details/summary']"
  private val continueButton        = "govuk-button"
  private val startDayId            = By.id("startDate.day")
  private val startMonthId          = By.id("startDate.month")
  private val startYearId           = By.id("startDate.year")
  private val endDayId              = By.id("endDate.day")
  private val endMonthId            = By.id("endDate.month")
  private val endYearId             = By.id("endDate.year")

  def clickAccountDetailsSummaryLink(): Unit = {
    onPage()
    click(By.cssSelector(accountDetailsSummary))
  }

  def updateDates(): Unit = {
    onPage(s"$baseUrl" + "manage-account/account-details/change-accounting-period")
    sendKeys(startDayId, "01")
    sendKeys(startMonthId, "02")
    sendKeys(startYearId, "2024")
    sendKeys(endDayId, "31")
    sendKeys(endMonthId, "01")
    sendKeys(endYearId, "2025")
    clickButtonByText(buttonContinue)
  }
}
