package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.cucumber.PageObject

object RepaymentIncompleteRequestErrorPage extends PageObject{

  val url: String             = s"$rootUrl" + "repayment/error/incomplete-refund-request"
  val header: String          = "h1.govuk-heading-l"
  val backLink                = ".govuk-back-link"

}
