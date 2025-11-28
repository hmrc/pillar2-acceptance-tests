package uk.gov.hmrc.test.ui.pages.btn
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.helper.Nav
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.btn.BtnConfirmationPage.{clickByCss, onPage, returnToHomepageLink}

object BtnUnderEnquiryPage extends BasePage {
  val url: String = s"${baseUrl}below-threshold-notification/under-enquiry-warning"

  def continueToNextPage(): Unit = {
    onPage()
    clickByClassName(continue)
  }

  def clickReturnToHomepageLink(): Unit = {
    onPage()
    clickByCss(returnToHomepageLink)
  }

}
