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

package uk.gov.hmrc.test.ui.specpages

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.PageObject

object DashboardPage extends BasePage {
  override val url: String = s"$baseUrl" + "pillar2-top-up-tax-home"

  private val ASALink     = "a[href*='/asa/home']"
  private val dueAndOverdueReturns        = "a[href*='/due-and-overdue-returns']"
  private val submissionHistory = "a[href*='/submission-history']"
  private val paymentHistory      = "a[href*='/payment/history']"
  private val paymentOutstanding        = "a[href*='/payment/outstanding']"
  private val requestRepayment        = "a[href*='/repayment/before-you-start']"
  private val manageContactDetails        = "a[href*='/contact-details/summary']"
  private val manageGroupDetails        = "a[href*='/account-details/summary']"
  private val submitBTN        = "a[href*='/below-threshold-notification/start']"

  def clickASALink(): Unit = {
    onPage()
    click(By.cssSelector(ASALink))
  }

    def clickDueAndOverdueReturnsLink(): Unit = {
    onPage()
    clickOnByPartialLinkText(By.cssSelector(dueAndOverdueReturns))
  }

  def clickSubmissionHistoryLink(): Unit = {
    onPage()
    click(By.cssSelector(submissionHistory))
  }

  def clickPaymentHistoryLink(): Unit = {
    onPage()
    click(By.cssSelector(paymentHistory))
  }

  def clickPaymentOutstandingLink(): Unit = {
    onPage()
    click(By.cssSelector(paymentOutstanding))
  }

  def clickRequestRepaymentLink(): Unit = {
    onPage()
    click(By.cssSelector(requestRepayment))
  }

  def clickManageContactDetailsLink(): Unit = {
    onPage()
    click(By.cssSelector(manageContactDetails))
  }

  def clickManageGroupDetailsLink(): Unit = {
    onPage()
    click(By.cssSelector(manageGroupDetails))
  }

  def clickSubmitBTNLink(): Unit = {
    onPage()
    click(By.cssSelector(submitBTN))
  }
}