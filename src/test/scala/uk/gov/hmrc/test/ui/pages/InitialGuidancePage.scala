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

import org.openqa.selenium.StaleElementReferenceException
import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object InitialGuidancePage extends PageObject {
  val url: String = s"$rootUrl" + "business-matching/match-hmrc-records"

  val caption               = ".govuk-caption-l"
  val continue              = ".govuk-button"

  def clickContinue(): Unit = {
    var lastError: Throwable = null

    for (_ <- 1 to 3) {
      try {
        val button = findByCss(continue)
        button.click()
        return
      } catch {
        case e: StaleElementReferenceException =>
          lastError = e
          Thread.sleep(200)
      }
    }

    throw new RuntimeException(s"Failed to click continue button after retries", lastError)
  }
}
