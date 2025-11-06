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
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.login
import uk.gov.hmrc.test.ui.specpages.TaskListPage
import uk.gov.hmrc.test.ui.specpages.eligibility._
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.tags.{Tests, Wip}

class EligibilityQuestionsSpec extends BaseSpec with Matchers {

  Feature("Eligibility Questions for Pillar 2") {

    Scenario("1 - User navigates to next eligibility question page by selecting yes option", Tests) {
      Given("I clear the cache")
      thenIClearTheCache()

      login(
        "Organisation",
        "eligibility"
      )

      And("The user answers yes to all eligibility questions")
      EligibilityUPEPage.selectYes()
      EligibilityActiveInUkPage.selectYes()
      EligibilityGlobalGrossRevenueEQPage.selectYes()

      Then("The user is taken to the confirmation page and directed to the register your group page")
      EligibilityConfirmationPage.onPageSubmitById()
      TaskListPage.onPage()
    }

    Scenario("2 - User navigates to service not suitable as entity not upe or nfm page via the eligibility questions", Tests) {
      Given("I clear the cache")
      thenIClearTheCache()

      login(
        "Organisation",
        "eligibility"
      )

      And("The user answers no to eligibility questions")
      EligibilityUPEPage.selectNo()
      EligibilityNFMPage.selectNo()

      Then("The user is taken to the service not suitable as entity not upe or nfm page")
      EligibilityNotSuitableAsNotUPEOrNFMPage.onPage()
    }

    Scenario("3 - User navigates to service not suitable as entity not active in the uk page via the eligibility questions", Tests) {
      Given("I clear the cache")
      thenIClearTheCache()

      login(
        "Organisation",
        "eligibility"
      )

      And("The user answers no to UPE eligibility question")
      EligibilityUPEPage.selectNo()

      And("The user answers yes to NFM eligibility question")
      EligibilityNFMPage.selectYes()

      And("The user answers no to active in UK eligibility question")
      EligibilityActiveInUkPage.selectNo()

      Then("The user is taken to the service not suitable as entity not active in the uk page")
      EligibilityNotSuitableAsNotActiveInUkPage.onPage()

    }

    Scenario("3 - User navigates to service not suitable as under 750 million page via the eligibility questions", Tests) {
      Given("I clear the cache")
      thenIClearTheCache()

      login(
        "Organisation",
        "eligibility"
      )

      And("The user answers yes to UPE eligibility question")
      EligibilityUPEPage.selectYes()

      And("The user answers no to active in UK eligibility question")
      EligibilityActiveInUkPage.selectYes()

      And("The user answers no to group consolidated annual revenues eligibility question")
      EligibilityGlobalGrossRevenueEQPage.selectNo()

      Then("The user is taken to the service not suitable as under 750 million page")
      EligibilityNotSuitableAsUnder750MillionPage.onPage()

    }
  }
}
