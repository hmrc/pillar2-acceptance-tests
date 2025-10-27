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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Check.{contain, convertToAnyShouldWrapper}
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.specpages._

object CYAStepsSteps {

  // ^I should see row (\d+) value (.*)$
  def andIShouldSeeRowValueX(row: Int, value: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
        assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  // ^I should see row (\d+) with key (.*) and value (.*)
  def andIShouldSeeRowWithKeyXAndValueX(row: Int, key: String, value: String): Unit = {
    assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
        assert(Driver.instance.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  // ^I should see details as below:$
  def andIShouldSeeDetailsAsBelow(details: DataTable): Unit = {
    val detailsData = details.asMaps(classOf[String], classOf[String])
        detailsData.forEach { row =>
          val key           = row.get("KEY")
          val expectedValue = row.get("VALUE")
          val labelElement  = Driver.instance.findElement(By.xpath(s"//dt[contains(text(), '$key')]"))
          val valueElement  = labelElement.findElement(By.xpath("following-sibling::dd[1]"))
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

  //todo: commented overload Test and delete if required.

  // Overload for ScalaTest (no DataTable, accepts varargs)
//  def andIShouldSeeDetailsAsBelow(links: (String, String)*): Unit = {
//    links.foreach { case (text, url) =>
//      val driverWait: WebDriverWait =
//        new WebDriverWait(Driver.instance, Duration.ofSeconds(10), Duration.ofSeconds(1))
//      driverWait.until(
//        ExpectedConditions.elementToBeClickable(
//          Driver.instance.findElement(By.id(url))
//        )
//      )
//      verifyLinkById(url, text)
//    }
//  }

  // ^I click on change hyperlink next to the (.*)
  def andIClickOnChangeHyperlinkNextToTheX(link: String): Unit = {
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

  // ^I click on change link for (.*)
  def andIClickOnChangeLinkForX(link: String): Unit = {
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
