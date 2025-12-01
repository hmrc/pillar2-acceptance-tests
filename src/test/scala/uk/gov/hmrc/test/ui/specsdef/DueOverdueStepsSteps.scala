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

package uk.gov.hmrc.test.ui.specsdef
import uk.gov.hmrc.test.ui.helper.Input
import uk.gov.hmrc.test.ui.pages._

object DueOverdueStepsSteps {

  def andISelectOptionAndContinueOnPillar2Submission(option: String): Unit = {
    option match {
      case "Yes" => Input.clickByCss("#value_0")
      case "No"  => Input.clickByCss("#value_1")
    }
    BtnStartPage.clickContinue()
  }

}
