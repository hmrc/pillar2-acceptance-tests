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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.cucumber.Input.{clickByCss, getAttributeOf, getTextOf}
import uk.gov.hmrc.test.ui.cucumber.{Input, Wait}
import uk.gov.hmrc.test.ui.pages.{AuthLoginPage, DashboardPage, GUKGuidancePage3, InputUPENamePage, MakePaymentPage, NonUKBankAccountPaymentPage, RepaymentAmountPage, RepaymentContactEmailPage, RepaymentContactPage, SearchRegisterPage, UPEAddressPage}


class PaymentSteps extends CommonFunctions {


  And("""^I should see the heading (\d+) on Dashboard page as (.*)""") { (headingNumber: Int, heading: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.sectionHeading)).get(headingNumber - 1).getText.contains(heading))
  }

  Given("""^(.*) logs in Dashboard page for Pillar2$""") { name: String =>
    name match {
      case "Organisation User" => AuthLoginPage.loginToDashboard(name)
      case _ => AuthLoginPage.loginToDashboard(name)
    }
  }

  And("""^I should see User details in dashboard page$""") { () =>
    Wait.waitForTagNameToBeRefreshed("h1")
    Wait.waitForElementToPresentByCssSelector(DashboardPage.userDetailsSection)
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetailsSection)).size() >= 0)
  }

  Then("""^I should be navigated to new tab$""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    driver.switchTo().window(newWindow)
  }

  Then("""^I should navigate back to main tab""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val mainWindow = handles.head.toString
    driver.switchTo().window(mainWindow)
  }

  Then("""I should be redirected to search register page in a new tab""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    val mainWindow = handles.head.toString
    driver.switchTo().window(newWindow)
    Wait.waitForElementToPresentByCssSelector(SearchRegisterPage.element)
    assert(driver.findElement(By.cssSelector(SearchRegisterPage.element)).isDisplayed)
    driver.close()
    driver.switchTo().window(mainWindow)
  }

  Then("""I should be redirected to guidance page in a new tab""") { () =>
    val handles = driver.getWindowHandles.toArray().toSeq
    val newWindow = handles(1).toString
    val mainWindow = handles.head.toString
    driver.switchTo().window(newWindow)
    Wait.waitForElementToPresentByCssSelector(GUKGuidancePage3.header)
    assert(driver.findElement(By.cssSelector(GUKGuidancePage3.header)).isDisplayed)
    driver.close()
    driver.switchTo().window(mainWindow)
  }

  Then("""^I close new tab""") { () =>
    driver.close()
  }

  And("""^I should see user details row (\d+) key (.*)""") { (detailNumber: Int, detailName: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).get(detailNumber - 1).getText.contains(detailName))
  }

  And("""^I should see user details row (\d+) value (.*)""") { (detailNumber: Int, detailValue: String) =>
    assert(driver.findElements(By.cssSelector(DashboardPage.userDetails)).get(detailNumber - 1).getText.contains(detailValue))
  }

  Then("""^The inactive status should be (.*)$""") { header: String =>
    Wait.waitForElementToPresentByCssSelector(DashboardPage.inactiveStatus)
    assert(getTextOf(By.cssSelector(DashboardPage.inactiveStatus)).contains(header))
  }

  Then("""^The caption for section (\d+) should be (.*)$""") { (detailNumber: Int, caption: String) =>
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableCaption)).get(detailNumber - 1).getText.contains(caption))
  }

  Then("""^The warning message should be (.*)$""") { message: String =>
    Wait.waitForElementToPresentByCssSelector(MakePaymentPage.warningMessage)
    assert(getTextOf(By.cssSelector(MakePaymentPage.warningMessage)).contains(message))
  }

  And("""^The section (\d+) with header (.*) value should be (.*)$""") { (detailNumber: Int, header: String, cell: String) =>
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableHeader)).get(detailNumber - 1).getText.contains(header))
    assert(driver.findElements(By.cssSelector(MakePaymentPage.tableCell)).get(detailNumber - 1).getText.contains(cell))
  }

  When("""^I click on toggle link (.*)$""") { (option: String) =>
    option match {
      case "How long it takes" => Input.clickByXpath(MakePaymentPage.firstToggleLink)
      case "Make a payment from outside the UK" => Input.clickByXpath(MakePaymentPage.secondToggleLink)
    }
  }

  And("""^I should see bank account error message (.*) on the (.*) Element$""") { (error: String, page: String) =>
    page match {
      case "Name of the Bank" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBankNameLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorBankNameLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBankNameMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorBankNameMessage)) should include(error)

      case "Account Name" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorAccountNameLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorAccountNameLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorAccountNameMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorAccountNameMessage)) should include(error)

      case "Swift Code" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSwiftCodeLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorSwiftCodeLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorBicOrSwiftCodeMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorBicOrSwiftCodeMessage)) should include(error)

      case "Iban" =>
        Wait.waitForTagNameToBeRefreshed("h1")
        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorSummary)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorIbanLink)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorIbanLink)) should be(error)

        Wait.waitForElementToPresentByCssSelector(NonUKBankAccountPaymentPage.errorIbanMessage)
        getTextOf(By cssSelector (NonUKBankAccountPaymentPage.errorIbanMessage)) should include(error)

    }
  }

  And("""^I provide Refund Amount as (.*)$""")((refundAmount: String) => {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(refundAmount, RepaymentAmountPage.refundAmountField)
    clickByCss(RepaymentAmountPage.continue)
  })

  And("""^I should see Refund Amount field is pre-populated with (.*)$""") { (amount: String) =>
        assert(getAttributeOf(RepaymentAmountPage.refundAmountField, "value").equals(amount))
    }

  And("""^I provide Repayment contact as (.*)$""")((contactName: String) => {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(contactName, RepaymentContactPage.contactNameField)
    clickByCss(RepaymentContactPage.continue)
  })

  And("""^I provide Repayment contact email as (.*)$""")((contactEmail: String) => {
    Wait.waitForTagNameToBeRefreshed("h1")
    Input.sendKeysByCss(contactEmail, RepaymentContactEmailPage.contactEmailField)
    clickByCss(RepaymentContactEmailPage.continue)
  })
  }