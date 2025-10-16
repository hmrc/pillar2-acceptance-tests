package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Input.clickByCss
import uk.gov.hmrc.test.ui.cucumber.{Input, Nav, Wait}
import uk.gov.hmrc.test.ui.pages._

object DueOverdueSteps {

  // I should see {int} accounting periods on Due Overdue Page
  def andIShouldSeeXAccountingPeriodsOnDueOverduePage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(DueOverduePage.accountDetails)
        assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.accountPeriodSections)).size() == accountingPeriods)
  }

  // I should see {int} accounting periods on Sub History Page
  def andIShouldSeeXAccountingPeriodsOnSubHistoryPage(accountingPeriods: Int): Unit = {
    Wait.waitForElementToPresentByCssSelector(P2SubmissionHistoryPage.accountDetails)
        assert(Driver.instance.findElements(By.cssSelector(P2SubmissionHistoryPage.accountingPeriods)).size() == accountingPeriods)
  }

  // I should see {int} section with status {string}
  def andIShouldSeeXSectionWithStatusX(count: Int, dueType: String): Unit = {
    dueType match {
          case "Due"     => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.dueSection)).size() == count)
          case "Overdue" => assert(Driver.instance.findElements(By.cssSelector(DueOverduePage.overDueSection)).size() == count)
        }
  }

  // ^I select option (.*) and continue on Pillar2 submission$
  def andISelectOptionXAndContinueOnPillar2Submission(option: String): Unit = {
    option match {
          case "Yes" => Input.clickByCss("#value_0")
          case "No"  => Input.clickByCss("#value_1")
        }
        BtnStartPage.clickContinue()
  }

  // ^I navigate back to BTN Return Submission KB Page$
  def andINavigateBackToBTNReturnSubmissionKBPage(): Unit = {
    Nav.browserBack()
        clickByCss(BtnAgdKBPage.backLink)
  }

}
