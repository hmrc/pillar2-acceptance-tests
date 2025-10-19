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
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}

class FurtherDetailsTaskSpec extends AnyFeatureSpec with Matchers {

  Feature("Further Details Task page validation") {

    Scenario("1 - User navigates to check your answer page answering all the questions of Further Details Page") {
      Given("Organisation User logs in as upe with credId FDTask for Pillar2")
      When("I select option Yes and continue to next")
      When("I select option UK limited company and continue to GRS page")
      When("I registered successfully with BV enabled")
      And("I click on Save&Continue button")
      When("I click Add filing member details link")
      When("I select No option and continue to next")
      When("I click Add further group details link")
      Then("I should navigate to MNE or domestic page")
      And("I click on Continue button")
      When("I select option In the UK and outside the UK in further details group status page")
      When("I select back link")
      Then("I should navigate to MNE or domestic page")
      And("I should see the option In the UK and outside the UK remain selected")
      When("I select back link")
      And("I select back link")
      And("The Task Add further group details status should be In progress")
      When("I click Add further group details link")
      Then("I should navigate to MNE or domestic page")
      When("I select option Only in the UK in further details group status page")
      Then("I should navigate to Group accounting period page")
      And("I click on Continue button")
      When("I enter account period as:")
      Then("I should navigate to FD check your answers page")
      When("I select back link")
      Then("I should navigate to Group accounting period page")
      When("I click on Continue button")
      Then("I should be on FD check your answers page")
      When("I click on Continue button")
      Then("I should be on Task list page")
      And("The Task Edit further group details status should be Completed")
      When("I click Sign out link")
      Then("I am on feedback survey page")
      When("Organisation User logs in with credId FDTask for Pillar2")
      And("The Task Edit further group details status should be Completed")
      When("I click Edit further group details link")
      Then("I should navigate to MNE or domestic page")
      And("I should see the option Only in the UK remain selected")
      When("I click on Continue button")
      Then("I should navigate to Group accounting period page")
      And("I should see date field Start Day is pre-populated with 15")
      When("I select back link")
      Then("I should navigate to MNE or domestic page")
    }

    Scenario("2 - Change all the details from Furthers details check your answers page") {
      Given("Organisation User navigates to FD check your answer page with credId FDTask")
      Then("I should be on FD check your answers page")
      When("I click on change hyperlink next to the FD Group Status")
      When("I select option In the UK and outside the UK in further details group status page")
      Then("I should be on FD check your answers page")
      And("I should see row 1 value In the UK and outside the UK")
      When("I click on change hyperlink next to the Accounting Period")
      When("I enter account period as:")
      And("I should see row 3 value 5 May 2025")
      And("I should see row 4 value 5 June 2026")
      And("I should see row 4 value 5 June 2026")
    }

    Scenario("3 - Accounting period page Error Validations") {
      Given("I clear the cache")
      Given("Organisation User logs in as upe with credId APErrors for Pillar2")
      When("I select option Yes and continue to next")
      When("I select option UK limited company and continue to GRS page")
      Then("I should navigate to UKCompany GRS page")
      When("I registered successfully with BV enabled")
      And("I click on Save&Continue button")
      When("I click Add filing member details link")
      When("I select No option and continue to next")
      When("I click Add further group details link")
      When("I select option Only in the UK in further details group status page")
      Then("I should navigate to Group accounting period page")
    }
  }
}
