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

package uk.gov.hmrc.test.ui.pages.repayments

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object RepaymentCYAPage extends BasePage {
  override val url: String = s"${baseUrl}repayment/check-answers"

  val changeRefundAmount = "a[href*='/change-amount']"
  val changeRefundReason = "a[href*='/change-reason']"
  val changeContactName  = "a[href*='/change-input-name']"
  val changeContactEmail = "a[href*='/change-input-email']"
  val changePhoneNumber  = "a[href*='/change-input-phone']"

  def clickChangeLink(changeLink: String): Unit = {
    onPage()
    click(By.cssSelector(changeLink))
  }
}
