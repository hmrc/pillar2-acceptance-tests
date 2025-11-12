/*
 * Copyright 2024 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specpages.rfm

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.specpages.BasePage

object RFMGRSEntityTypePage extends BasePage {
  override val url: String = s"${baseUrl}replace-filing-member/business-matching/filing-member/uk-based/org-type"

  private val ukLimitedCompany            = "value_0"
  private val limitedLiabilityPartnership = "value_1"
  private val companyTypeNotListed        = "value_2"

  def selectEntityTypeUkLimitedCompany(): Unit = {
    onPage()
    clickById(ukLimitedCompany)
    clickButtonByText(buttonSaveAndContinue)
  }

  def selectEntityTypeLimitedLiabilityPartnership(): Unit = {
    onPage()
    clickById(limitedLiabilityPartnership)
    clickButtonByText(buttonSaveAndContinue)
  }

  def selectEntityTypeNotListed(): Unit = {
    onPage()
    clickById(companyTypeNotListed)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickContinue(): Unit = findByCss(continue).click()
}
