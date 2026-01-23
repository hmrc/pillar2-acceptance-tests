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

package uk.gov.hmrc.test.ui.pages.outstandingPayments

import uk.gov.hmrc.test.ui.pages.BasePage
import org.openqa.selenium.By

object OutstandingPaymentsPage extends BasePage {

  override val url: String = s"${baseUrl}payment/outstanding"

  private val waysToPayLink: By = By.cssSelector("a.govuk-link[href*='pay-pillar-2-top-up-taxes']")
  private val viewTransactionHistoryLink: By = By.cssSelector("a.govuk-link[href*='/report-pillar2-top-up-taxes/payment/history']")

  def clickLinkWaysToPay(): Unit = clickLink(waysToPayLink)
  def clickLinkViewTransactionHistory() : Unit = clickLink(viewTransactionHistoryLink)

}
