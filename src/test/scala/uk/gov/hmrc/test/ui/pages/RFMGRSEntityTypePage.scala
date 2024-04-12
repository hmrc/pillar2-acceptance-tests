package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object RFMGRSEntityTypePage  extends PageObject {
  val url: String      = s"$rootUrl"+"replace-filing-member/business-matching/filing-member/uk-based/org-type"

  val caption                  = ".govuk-caption-l"
  val eqForm                   = ".govuk-form-group"
  val eq                       = ".govuk-form-group .govuk-fieldset"
  val continue                 = "button.govuk-button"
  val errorSummary             = ".govuk-error-summary__list"
  val errorLink                = "[href*='#value']"
  val backLink                 = ".govuk-back-link"
  val errorMessage             = ".govuk-error-message"

  def clickContinue()  = findByCss(continue).click()


}
