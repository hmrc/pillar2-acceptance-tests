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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.Wait
import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pillar2SubmissionPages.P2SubBtnChangeDomesticOrMnePage

class ChangeYourAnswersPageSteps extends CommonFunctions {

  And("""^I should see row (\d+) key (.*)""") { (row: Int, key: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.fluentWait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.cssSelector(UPECheckYourAnswersPage.keyList)))
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
  }

  And("""^I should see row (\d+) value (.*)$""") { (row: Int, value: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.fluentWait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.cssSelector(UPECheckYourAnswersPage.valueList)))
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  And("""^I should see row (\d+) with key (.*) and value (.*)""") { (row: Int, key: String, value: String) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.fluentWait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.cssSelector(UPECheckYourAnswersPage.keyList)))
    Wait.fluentWait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.cssSelector(UPECheckYourAnswersPage.valueList)))
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.keyList)).get(row - 1).getText.contains(key))
    assert(driver.findElements(By.cssSelector(UPECheckYourAnswersPage.valueList)).get(row - 1).getText.contains(value))
  }

  And("""^I should see details as below:$""") { (details: DataTable) =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.fluentWait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.tagName("dt")))
    
    val detailsData = details.asMaps(classOf[String], classOf[String])
    detailsData.forEach { row =>
      val key           = row.get("KEY")
      val expectedValue = row.get("VALUE")
      val labelElement  = driver.findElement(By.xpath(s"//dt[contains(text(), '$key')]"))
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

  And("""^I click on change hyperlink next to the (.*)""") { (link: String) =>
    link match {
      case "UPE Name" =>
        clickByCss(UPECheckYourAnswersPage.changeName)
      case "UPE Address" =>
        clickByCss(UPECheckYourAnswersPage.changeAddress)
      case "UPE Contact Name" =>
        clickByCss(UPECheckYourAnswersPage.changeContactname)
      case "UPE Email Address" =>
        clickByCss(UPECheckYourAnswersPage.changeEmailaddress)
      case "UPE Telephone Contact" =>
        clickByCss(UPECheckYourAnswersPage.changeTelephonecontact)
      case "UPE Telephone Number" =>
        clickByCss(UPECheckYourAnswersPage.changeTelephonenumber)
      case "NFM Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeName)
      case "NFM Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeAddress)
      case "NFM Contact Name" =>
        clickByCss(NFMCheckYourAnswersPage.changeContactname)
      case "NFM Email Address" =>
        clickByCss(NFMCheckYourAnswersPage.changeEmailaddress)
      case "NFM Telephone Contact" =>
        clickByCss(NFMCheckYourAnswersPage.changeTelephonecontact)
      case "NFM Telephone Number" =>
        clickByCss(NFMCheckYourAnswersPage.changeTelephonenumber)
      case "FD Group Status" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeGroupStatus)
      case "Accounting Period" =>
        clickByCss(FurtherDetailsCheckYourAnswersPage.changeAccountingPeriod)
      case "Domestic or Mne" =>
        clickByCss(P2SubBtnChangeDomesticOrMnePage.changeDomesticOrMne)
    }
  }

  And("""^I click on change link for (.*)""") { (link: String) =>
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
        clickByCss(ContactDetailsCheckAnswersPage.changeSecondTelephone)
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
