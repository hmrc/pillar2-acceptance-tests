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

package uk.gov.hmrc.test.ui.specpages.nfm

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.specpages.BasePage

object NFMEntityTypePage extends BasePage {
  override val url: String                         = s"$baseUrl" + "business-matching/filing-member/uk-based/entity-type"
  private val ukLimitedCompany            = "value_0"
  private val limitedLiabilityPartnership = "value_1"
  private val companyTypeNotListed        = "value_2"

  def enterEntityTypeUkLimitedCompany(): Unit = {
    onPage()
    click(By.id(ukLimitedCompany))
    clickButtonByText(buttonContinue)
  }

  def enterEntityTypeLimitedLiabilityPartnership(): Unit = {
    onPage()
    click(By.id(limitedLiabilityPartnership))
    clickButtonByText(buttonContinue)
  }

  def enterEntityTypeNotListed(): Unit = {
    onPage()
    click(By.id(companyTypeNotListed))
    clickButtonByText(buttonContinue)
  }
}
