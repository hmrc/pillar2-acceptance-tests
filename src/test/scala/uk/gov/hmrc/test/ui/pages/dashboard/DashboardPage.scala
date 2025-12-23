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

package uk.gov.hmrc.test.ui.pages.dashboard

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object DashboardPage extends BasePage {
  override val url: String = s"${baseUrl}pillar2-top-up-tax-home"

  private val changeClientLink: By     = By.cssSelector("a[href*='/asa/input-pillar-2-id']")
  private val dueAndOverdueReturns: By = By.cssSelector("a[href*='/due-and-overdue-returns']")
  private val submissionHistory: By    = By.cssSelector("a[href*='/submission-history']")
  private val paymentHistory: By       = By.cssSelector("a[href*='/payment/history']")
  private val paymentOutstanding: By   = By.cssSelector("a[href*='/payment/outstanding']")
  private val requestRepayment: By     = By.cssSelector("a[href*='/repayment/before-you-start']")
  private val manageContactDetails: By = By.cssSelector("a[href*='/contact-details/summary']")
  private val manageGroupDetails: By   = By.cssSelector("a[href*='/account-details/summary']")
  private val submitBTN: By            = By.cssSelector("a[href*='/below-threshold-notification/start']")
  private val clientIdText: By         = By.cssSelector(".homepage-title span:nth-of-type(2)")

  def clickChangeClientLink(): Unit         = clickLink(changeClientLink)
  def clickDueAndOverdueReturnsLink(): Unit = clickLink(dueAndOverdueReturns)
  def clickSubmissionHistoryLink(): Unit    = clickLink(submissionHistory)
  def clickPaymentHistoryLink(): Unit       = clickLink(paymentHistory)
  def clickPaymentOutstandingLink(): Unit   = clickLink(paymentOutstanding)
  def clickRequestRepaymentLink(): Unit     = clickLink(requestRepayment)
  def clickManageContactDetailsLink(): Unit = clickLink(manageContactDetails)
  def clickManageGroupDetailsLink(): Unit   = clickLink(manageGroupDetails)
  def clickSubmitBTNLink(): Unit            = clickLink(submitBTN)

  def displayedClientId: String = getText(clientIdText).replace("ID:", "").trim

  def shouldShowClientId(plrId: String): Unit = {
    onPage()
    displayedClientId.shouldBe(plrId)
  }
}
