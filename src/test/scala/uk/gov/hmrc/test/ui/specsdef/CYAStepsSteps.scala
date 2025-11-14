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

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers._
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.Check.{contain, convertToAnyShouldWrapper}
import uk.gov.hmrc.test.ui.helper.Input.clickByCss
import uk.gov.hmrc.test.ui.helper.Wait
import uk.gov.hmrc.test.ui.pages._

object CYAStepsSteps {

  def andIShouldSeeRowValue(row: Int, value: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
    assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  def andIShouldSeeRowWithKeyAndValue(row: Int, key: String, value: String): Unit = {
    assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
    assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  def andIShouldSeeDetailsAsBelow(detailsMap: Map[String, String]): Unit = {
    detailsMap.foreach { case (key, expectedValue) =>
      val labelElement = Driver.instance.findElement(By.xpath(s"//dt[contains(text(), '$key')]"))
      val valueElement = labelElement.findElement(By.xpath("following-sibling::dd"))
      if (key == "Address") {
        val actualValueLines = valueElement.getText.split("\n").map(_.trim)
        expectedValue.split("\n").foreach { expectedLine =>
          actualValueLines should contain(expectedLine)
        }
      } else {
        valueElement.getText shouldEqual expectedValue
      }
    }
  }

  def andIClickOnChangeHyperlinkNextToThe(link: String): Unit = {
    link match {
      case "UPE Name" =>
        clickByCss(UPECheckYourAnswersPage.changeName)
      case "UPE Address" =>
        clickByCss(UPECheckYourAnswersPage.changeAddress)
      case "UPE Contact Name" =>
        clickByCss(UPECheckYourAnswersPage.changeContactName)
      case "UPE Email Address" =>
        clickByCss(UPECheckYourAnswersPage.changeEmailAddress)
      case "UPE Phone Contact" =>
        clickByCss(UPECheckYourAnswersPage.changePhoneContact)
      case "UPE Phone Number" =>
        clickByCss(UPECheckYourAnswersPage.changePhoneNumber)
      case "NFM Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeName)
      case "NFM Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeAddress)
      case "NFM Contact Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeContactName)
      case "NFM Email Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeEmailAddress)
      case "NFM Phone Contact" =>
        clickByCss(NFMCheckYourAnswersPage.changePhoneContact)
      case "NFM Phone Number" =>
        clickByCss(NFMCheckYourAnswersPage.changePhoneNumber)
      case "FD Group Status" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeGroupStatus)
      case "Accounting Period" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeAccountingPeriod)
      case "Domestic or Mne" =>
        clickByCss(BtnChangeDomesticOrMnePage.changeDomesticOrMne)
    }
  }

  def andIClickOnChangeLinkFor(link: String): Unit = {
    link match {
      case "Contact Name" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeName)
      case "Email address" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeEmail)
      case "Phone number" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeContactNumber)
      case "Do you have a second contact?" =>
        clickByCss(ContactDetailsCheckAnswersPage.secondContact)
      case "Second Contact Name" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondName)
      case "Second Contact Email" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondEmail)
      case "Second Contact Phone number" =>
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondPhone)
      case "Address" =>
        clickByCss(ContactDetailsSummaryPage.changeAddress)
      case "Dashboard Address" =>
        clickByCss(ContactDetailsSummaryPage.dashboardAddressChange)
      case "Primary Contact" =>
        clickByCss(ReviewAnswersPage.changeUPEContact)
      case _ =>
        clickByCss(ContactDetailsCheckAnswersPage.changeName)
    }
  }
}
