package uk.gov.hmrc.test.ui.pages.btn

import uk.gov.hmrc.test.ui.pages.BasePage

object BtnUnderEnquiryPage extends BasePage {
  val url: String = s"${baseUrl}below-threshold-notification/under-enquiry-warning"

  def continueToNextPage(): Unit = {
    onPage()
    clickByClassName(continue)
  }

}
