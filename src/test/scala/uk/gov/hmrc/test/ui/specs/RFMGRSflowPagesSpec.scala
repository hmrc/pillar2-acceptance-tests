/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.specs

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.specs.tags.AcceptanceTests
import uk.gov.hmrc.test.ui.specsdef.CYAStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.CommonStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.EligibilityQuestionStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.RFMStepsSteps.*
import uk.gov.hmrc.test.ui.specsdef.UPEStepsSteps.*

class RFMGRSflowPagesSpec extends BaseSpec with Matchers {

  Feature("RFM Ultimate Parent Entity and New nominated Filling Member GRS journey") {

    Scenario("3 - User registration as Limited liability partnership failed with party type mismatch error", AcceptanceTests) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      Then("I should be on RFM CYA Page")
      thenIShouldBeOn("RFM CYA Page")

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      When("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateTo("RFM LLP GRS page")

      When("registration is unsuccessful with party type mismatch error")
      andRegistrationIsUnsuccessfulWithXError("party type mismatch")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Mismatch Error Page")
      thenIShouldBeOn("RFM GRS Registration Mismatch Error Page")

      When("I click go back to select the entity type link")
      andIClickLink("go back to select the entity type")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option Limited liability partnership and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("Limited liability partnership")

      Then("I should navigate to RFM LLP GRS page")
      thenIShouldNavigateTo("RFM LLP GRS page")

    }

    Scenario(
      "4 - User registration as UK limited company failed with identifiers mismatch error and entity type ",
      AcceptanceTests
    ) {
      Given("Organisation User logs in without Pillar2 enrolment")
      givenLogsInWithoutPillar2Enrolment()

      And("I access RFM start page")
      givenIAccessRFMXPage("start")

      When("I provide RFM pillar2 id as XMPLR0123456789")
      andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")

      When("I enter registration date as:")
      val rfmDateData: Map[String, String] = Map(
        "rfmRegistrationDate.day"   -> "31",
        "rfmRegistrationDate.month" -> "1",
        "rfmRegistrationDate.year"  -> "2024"
      )
      andIEnterRegistrationDateAs(rfmDateData)

      When("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      When("I select corp position as NFM")
      andISelectCorpPositionAsX("NFM")

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button")

      And("I select option Yes and continue to next")
      andISelectOptionAndContinueToNext("Yes")

      When("I select option UK limited company and continue to GRS page")
      andISelectOptionAndContinueToGRSPage("UK limited company")

      Then("I should navigate to RFM UK limited Company GRSPage")
      thenIShouldNavigateTo("RFM UK limited Company GRSPage")

      When("registration is unsuccessful with identifiers not match error")
      andRegistrationIsUnsuccessfulWithXError("identifiers not match")

      And("I click on Save&Continue button")
      andIClickOnSaveContinueButton()

      Then("I should be on RFM GRS Registration Not Called Error Page")
      thenIShouldBeOn("RFM GRS Registration Not Called Error Page")

      When("I click Go back to select the entity type link")
      andIClickLink("Go back to select the entity type")

      Then("I should be on RFM UK based entity type page")
      thenIShouldBeOn("RFM UK based entity type page")

      When("I select option Entity type not listed and continue to Name page")
      andISelectOptionXAndContinueToNamePage("Entity type not listed")

      Then("I should be on RFM New NFM Contact Name Page")
      thenIShouldBeOn("RFM New NFM Contact Name Page")
    }
  }
}
