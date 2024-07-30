package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.cucumber.PageObject

object RepaymentJourneyRecoveryErrorPage extends PageObject{

  val url: String             = s"$rootUrl" + "repayment/error/answers-not-saved "
  val header: String          = "h1.govuk-heading-l"
  val backLink                = ".govuk-back-link"

}
