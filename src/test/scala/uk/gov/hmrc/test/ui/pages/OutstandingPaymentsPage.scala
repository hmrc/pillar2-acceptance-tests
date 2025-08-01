package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object OutstandingPaymentsPage extends PageObject{
  val url: String      = s"$rootUrl" + "payment/outstanding"
  val payNowButton     = ".govuk-button"

  def clickPayNowButton(): Unit = findByCss(payNowButton).click()
}
