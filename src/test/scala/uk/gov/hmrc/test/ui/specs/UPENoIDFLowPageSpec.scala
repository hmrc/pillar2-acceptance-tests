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
import uk.gov.hmrc.test.ui.specpages.UPEAddressPage
import uk.gov.hmrc.test.ui.specstepdef.CYAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.TaskListStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.UPEStepsSteps._
import uk.gov.hmrc.test.ui.tags.Wip

class UPENoIDFLowPageSpec extends BaseSpec with Matchers {

  Feature("UPE NO ID journey") {

    Scenario("4 - Change UPE fields from UPE check your answers page", Wip) {
      Given("Organisation User navigates to UPE check your answer page with credId UPENoIDJourney")
      givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX("UPE", "UPENoIDJourney") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click on change hyperlink next to the UPE Name")
      andIClickOnChangeHyperlinkNextToTheX("UPE Name") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I enter UPE name as Name Change @&#")
      andIEnterXAsX("UPE name", "Name Change @&#") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I should see row 1 value Name Change @&#")
      // ⚠️ No step-def match found for: I should see row 1 value Name Change @&#

      When("I click on change hyperlink next to the UPE Address")
      andIClickOnChangeHyperlinkNextToTheX("UPE Address") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I enter Address Line 1 as Change Address &")
      andIEnterXAsX("Address Line 1", "Change Address &") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I click on Continue button")
      whenIClickOnContinueButton("I click on Continue button") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see row 2 value Change Address &")
      // ⚠️ No step-def match found for: I should see row 2 value Change Address &

      When("I click on change hyperlink next to the UPE Contact Name")
      andIClickOnChangeHyperlinkNextToTheX("UPE Contact Name") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I enter UPE Person/Team name as Change Contact Person~")
      andIEnterXAsX("UPE Person/Team name", "Change Contact Person~") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      Then("I should be on Check your answers page")
      thenIShouldBeOnX("Check your answers page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see row 3 value Change Contact Person~")
      // ⚠️ No step-def match found for: I should see row 3 value Change Contact Person~

      When("I click on change hyperlink next to the UPE Email Address")
      andIClickOnChangeHyperlinkNextToTheX("UPE Email Address") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I enter UPE Email address as changetest&@email.com")
      andIEnterXAsX("UPE Email address", "changetest&@email.com") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I should see row 4 value changetest&@email.com")
      // ⚠️ No step-def match found for: I should see row 4 value changetest&@email.com

      When("I click on change hyperlink next to the UPE Phone Number")
      andIClickOnChangeHyperlinkNextToTheX("UPE Phone Number") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I enter Phone Number as 12345679")
      andIEnterXAsX("Phone Number", "12345679") // auto-chosen (score=1.00, UPEStepsSteps.scala)

      And("I should see row 6 value 12345679")
      // ⚠️ No step-def match found for: I should see row 6 value 12345679

      When("I click on change hyperlink next to the UPE Phone Contact")
      andIClickOnChangeHyperlinkNextToTheX("UPE Phone Contact") // auto-chosen (score=1.00, CYAStepsSteps.scala)
      // --- Other possible matches ---
      // andIClickXLink() [1.00] (CommonStepsSteps.scala) pattern: I click (.*) link

      And("I select option No and continue to next")
      andISelectOptionXAndContinueToNext("No") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see row 5 value No")
      // ⚠️ No step-def match found for: I should see row 5 value No

      When("I click Report Pillar 2 Top-up Taxes link")
      andIClickXLink("Report Pillar 2 Top-up Taxes") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Task list page")
      thenIShouldNavigateToX("Task list page") // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click Sign out link")
      andIClickXLink("Sign out") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I am on feedback survey page")
      givenIAmOnXPage("feedback survey") // auto-chosen (score=1.00, CommonStepsSteps.scala)

      When("I click the browser back button")
      andIClickTheBrowserBackButton()

      Then("I should be on auth-login page")
      thenIShouldBeOnX("auth-login page")
    }
  }
}
