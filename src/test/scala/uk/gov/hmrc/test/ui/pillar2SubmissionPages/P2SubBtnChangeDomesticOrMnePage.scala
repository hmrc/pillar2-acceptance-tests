package uk.gov.hmrc.test.ui.pillar2SubmissionPages

import uk.gov.hmrc.test.ui.cucumber.Find.findByCss
import uk.gov.hmrc.test.ui.cucumber.PageObject
import uk.gov.hmrc.test.ui.pages.AgentAffinityKBPage.startAgain

object P2SubBtnChangeDomesticOrMnePage extends PageObject {
  val url: String = s"$p2SubRootUrl" + "below-threshold-notification/change-domestic-or-multinational"
  val changeDomesticOrMne             = "a[href*='/change-domestic-or-multinational']"
}
