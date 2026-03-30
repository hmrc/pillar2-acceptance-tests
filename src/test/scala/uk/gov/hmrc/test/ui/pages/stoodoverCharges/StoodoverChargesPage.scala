package uk.gov.hmrc.test.ui.pages.stoodoverCharges

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object StoodoverChargesPage extends BasePage {

  override val url: String = s"${baseUrl}payment/stoodover-charges"

  private val stoodoverCharges: By           = By.cssSelector("a[href*= 'payment/stoodover-charges']")
  private val viewTransactionHistoryLink: By = By.cssSelector("a.govuk-link[href*='/report-pillar2-top-up-taxes/payment/history']")

  private val viewOutstandingPaymentsLink: By = By.cssSelector("a.govuk-link[href*='/report-pillar2-top-up-taxes/payment/outstanding']")

  def clickStoodoverCharges(): Unit = clickLink(stoodoverCharges)

  def clickLinkviewOutstandingPayments(): Unit = clickLink(viewOutstandingPaymentsLink)
  def clickLinkViewTransactionHistory(): Unit  = clickLink(viewTransactionHistoryLink)

}
