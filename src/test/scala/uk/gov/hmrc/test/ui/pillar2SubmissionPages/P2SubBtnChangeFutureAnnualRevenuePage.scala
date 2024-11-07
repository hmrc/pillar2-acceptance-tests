package uk.gov.hmrc.test.ui.pillar2SubmissionPages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject


object P2SubBtnChangeFutureAnnualRevenuePage extends PageObject  {
  val url: String = s"$p2SubRootUrl" + "below-threshold-notification/change-future-annual-revenues"
  val changeFutureAnnualRevenue             = "a[href*='/change-future-annual-revenues']"
}
