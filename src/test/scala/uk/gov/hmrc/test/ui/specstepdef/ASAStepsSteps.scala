package uk.gov.hmrc.test.ui.specstepdef
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.pages._

object ASAStepsSteps {

  // ^I provide ASA (.*) as (.*)$
  def andIProvideASAXAsX(field: String, value: String): Unit = {
    field match {
          case "Pillar2 ID" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(ASAPillar2InputPage.pillar2IDField)
            Input.sendKeysByCss(value, ASAPillar2InputPage.pillar2IDField)
        }
  }

}
