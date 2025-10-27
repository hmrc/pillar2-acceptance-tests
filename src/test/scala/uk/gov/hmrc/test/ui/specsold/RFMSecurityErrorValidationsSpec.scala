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

package uk.gov.hmrc.test.ui.specsold

import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}

class RFMSecurityErrorValidationsSpec extends AnyFeatureSpec with Matchers {

  Feature("RFM check your answers page") {

    Scenario("1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey") {
      Given("Organisation User logs in with rfm URL to Pillar2")
      When("I provide RFM pillar2 id as XEPLR0123456400")
      When("I enter registration date as:")
      And("I click on Continue button")
      Then("I should navigate to RFM journey recovery page")
      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      Then("I should be on RFM start page")
      And("I click on Continue button")
      And("I provide RFM pillar2 id as XEPLR0123456222")
      Then("I should be on RFM Registration Date Page")
      When("Registration Day is entered as 27")
      And("I click on Continue button")
      And("I click on Continue button")
      Then("I should navigate to RFM No record Match Error Page")
      And("I select back link")
      Then("I should be on RFM CYA Page")
      When("I click change link for RFM Pillar 2 Top-up Taxes ID")
      And("I provide RFM pillar2 id as XEPLR0123456404")
      And("I click on Continue button")
      Then("I should navigate to RFM No record Match Error Page")
      And("I click go back to try again using different details. link")
      Then("I should be on RFM enter pillar2 id page")
      And("I provide RFM pillar2 id as XMPLR0123456111")
      And("I click on Continue button")
      And("I click Sign out link")
    }

    Scenario("2 - Verify that system throws an error on generic failure from ETMP when calling Amend API in replacing rfm journey") {
      Given("Organisation User logs in without Pillar2 enrolment")
      And("I access RFM start page")
      And("I click on Continue button")
      When("I provide RFM pillar2 id as XMPLR0012345111")
      When("I enter registration date as:")
      When("I click on Save&Continue button")
      Then("I should be on RFM Saving Progress Page")
      When("I click on Continue button")
      When("I select corp position as NFM")
      Then("I should be on New NFM guidance page")
      When("I click on Continue button")
      And("I select option Yes and continue to next")
      When("I select option UK limited company and continue to GRS page")
      And("I click on Save&Continue button")
      Then("I should be on RFM Contact Guidance page")
      And("I click on Continue button")
      When("I provide RFM contact name as 500")
      When("I provide RFM contact email as rfm@email.com")
      And("I select option No and continue to next")
      And("I select option No and continue to next")
      When("I enter Address as:")
      Then("I should navigate to RFM Final Review Page")
      And("I click on Continue button")
      Then("I should be redirected to RFM processing page or Amend API error Page for RFM")
      And("I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      Then("I should navigate to RFM Final Review Page")
      And("I click Sign out link")
    }

    Scenario("3 - Verify Incomplete data error") {
      Given("Organisation User logs in without Pillar2 enrolment")
      And("I access RFM start page")
      And("I click on Continue button")
      When("I provide RFM pillar2 id as XMPLR0123456789")
      When("I enter registration date as:")
      When("I click on Save&Continue button")
      And("I access RFM corporate position page")
      When("I select corp position as NFM")
      When("I click on Continue button")
      And("I select option No and continue to next")
      When("I provide RFM New NFM Name as Test CYA")
      When("I enter Address as:")
      And("I continue to RFM contact name Page")
      And("I provide RFM contact name as RFM test contact")
      When("I provide RFM contact email as rfm@email.com")
      And("I select option No and continue to next")
      And("I select option No and continue to next")
      When("I enter Address as:")
      Then("I should navigate to RFM Final Review Page")
      When("I click change link for RFM Change Second Contact Preference")
      And("I select option Yes and continue to next")
      When("I select back link")
      When("I select back link")
      And("I click on Continue button")
      Then("I should navigate to RFM incomplete task error page")
      When("I click replace the filing member for a Pillar 2 Top-up Taxes account to try again link")
      Then("I should be on RFM Final Review Page")
    }

    Scenario("4 - Verify Security questions are not pre populated for RFM journey") {
      Given("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      Then("I should be on RFM enter pillar2 id page")
      When("I provide RFM pillar2 id as XMPLR0123456789")
      When("I enter registration date as:")
      When("I click on Save&Continue button")
      Then("I should be on RFM Saving Progress Page")
      When("I select back link")
      Then("I should be on RFM CYA Page")
      When("I click on Continue button")
      Then("I access RFM corporate position page")
      When("I select corp position as UPE")
      Then("I should be on RFM Contact Guidance page")
      When("I click on Continue button")
      And("I provide RFM contact name as RFM test contact")
      When("I provide RFM contact email as rfm@email.com")
      And("I click Sign out link")
      And("Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2")
      Then("I access RFM start page")
      And("I click on Continue button")
      Then("I should be on RFM enter pillar2 id page")
      Then("I provide RFM pillar2 id as XMPLR0123456789")
      Then("I should be on RFM Registration Date Page")
      When("I enter registration date as:")
      When("I click on Save&Continue button")
      Then("I should be on RFM Saving Progress Page")
      When("I click on Continue button")
      Then("I access RFM corporate position page")
    }
  }
}
