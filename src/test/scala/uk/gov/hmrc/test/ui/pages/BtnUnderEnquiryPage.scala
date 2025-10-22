package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object BtnUnderEnquiryPage extends PageObject{
  val url:String = s"$rootUrl"+ "below-threshold-notification/under-enquiry-warning"

}
