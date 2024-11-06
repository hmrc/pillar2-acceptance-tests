package uk.gov.hmrc.test.ui.pillar2SubmissionPages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject

object P2SubBtnChangeAnnualRevenuePage extends PageObject {
  val url: String = s"$p2SubRootUrl" + "below-threshold-notification/change-annual-revenues"
  val changeAnnualRevenue             = "a[href*='/change-annual-revenues']"
}
