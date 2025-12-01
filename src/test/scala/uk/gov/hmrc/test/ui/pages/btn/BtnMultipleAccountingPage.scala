package uk.gov.hmrc.test.ui.pages.btn

import uk.gov.hmrc.test.ui.pages.BasePage

object BtnMultipleAccountingPage extends BasePage {
  override val url: String = s"${baseUrl}below-threshold-notification/choose-accounting-period"

  private val CurrentAccountingPeriod               = "radio_0"
  private val PreviousAccountingPeriod              = "radio_1"
  private val PreviousAccountingPeriodUKTRSubmitted = "radio_2"
  private val PreviousAccountingPeriodBTnSubmitted  = "radio_3"

  def selectCurrentAccountingPeriod(): Unit = {
    onPage()
    clickById(CurrentAccountingPeriod)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriod(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriod)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriodUKTRSubmitted)
    clickByClassName(continue)
  }

  def selectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    onPage()
    clickById(PreviousAccountingPeriodBTnSubmitted)
    clickByClassName(continue)
  }

  def continueToNextPage(): Unit = {
    onPage()
    clickByClassName(continue)
  }
}
