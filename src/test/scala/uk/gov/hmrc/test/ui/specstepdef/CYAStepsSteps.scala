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

package uk.gov.hmrc.test.ui.specstepdef

import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.specpages._
import uk.gov.hmrc.test.ui.specpages.contactDetails.ContactDetailsCheckAnswersPage
import uk.gov.hmrc.test.ui.specpages.furtherDetails.FDCheckYourAnswersPage

object CYAStepsSteps {

  def andIClickOnChangeHyperlinkNextToTheX(link: String): Unit = {
    link match {
      case "FD Group Status" =>
        clickByCss(FDCheckYourAnswersPage.changeGroupStatus)
      case "Accounting Period" =>
        clickByCss(FDCheckYourAnswersPage.changeAccountingPeriod)
    }
  }

  def andIClickOnChangeLinkForX(link: String): Unit = {
    link match {
      case "Contact Name" =>
        clickByCss(ContactDetailsCheckAnswersPage.changePrimaryContactName)
      case "Primary Contact" =>
        clickByCss(ReviewAnswersPage.changeUPEContact)
    }
  }

}
