package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.{andIChooseXAndContinue, andISelectBackLink, thenIShouldBeOnX, thenIShouldNavigateToX}

class EligiblityQuestionsPageSpec extends AnyFeatureSpec with Matchers {

  Feature("Eligibility Questions for Pillar 2") {

    Scenario("1 - User navigates to next eligibility question page by selecting yes option") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("I am on UPE EQ Page")
        givenIAmOnXPage("UPE EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I continue without selecting an option")
        // ⚠️ No step-def match found for: I continue without selecting an option

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to business EQ page")
        thenIShouldNavigateToX("business EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Global gross revenue")
        thenIShouldNavigateToX("Global gross revenue")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I continue without selecting an option")
        // ⚠️ No step-def match found for: I continue without selecting an option

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to confirmation page")
        thenIShouldNavigateToX("confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on confirmation page")
        thenIShouldBeOnX("confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I continue")
        // ⚠️ No step-def match found for: I continue

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - User navigates to guidance page by selecting No option in eligibility questions") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("I am on UPE EQ Page")
        givenIAmOnXPage("UPE EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM EQ page")
        thenIShouldNavigateToX("NFM EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Eligibility No NFM and continue")
        andIChooseXAndContinue("Eligibility No NFM")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM guidance page")
        thenIShouldNavigateToX("NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM guidance page")
        thenIShouldNavigateToX("NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM EQ page")
        thenIShouldNavigateToX("NFM EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Eligibility Yes NFM and continue")
        andIChooseXAndContinue("Eligibility Yes NFM")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I am on Business activity EQ Page")
        givenIAmOnXPage("Business activity EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I continue without selecting an option")
        // ⚠️ No step-def match found for: I continue without selecting an option

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to BA guidance page")
        thenIShouldNavigateToX("BA guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to BA guidance page")
        thenIShouldNavigateToX("BA guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to business EQ page")
        thenIShouldNavigateToX("business EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I am on Global gross revenue Page")
        givenIAmOnXPage("Global gross revenue")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to GGR guidance page")
        thenIShouldNavigateToX("GGR guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to GGR guidance page")
        thenIShouldNavigateToX("GGR guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Global gross revenue")
        thenIShouldNavigateToX("Global gross revenue")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - User navigates to next eligibility question page by selecting yes option") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("I am on UPE EQ Page")
        givenIAmOnXPage("UPE EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to business EQ page")
        thenIShouldNavigateToX("business EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Global gross revenue")
        thenIShouldNavigateToX("Global gross revenue")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to confirmation page")
        thenIShouldNavigateToX("confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on confirmation page")
        thenIShouldBeOnX("confirmation page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I continue")
        // ⚠️ No step-def match found for: I continue

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - User navigates to guidance page by selecting No option in eligibility questions") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("I am on UPE EQ Page")
        givenIAmOnXPage("UPE EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM EQ page")
        thenIShouldNavigateToX("NFM EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Eligibility No NFM and continue")
        andIChooseXAndContinue("Eligibility No NFM")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM guidance page")
        thenIShouldNavigateToX("NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to NFM guidance page")
        thenIShouldNavigateToX("NFM guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to NFM EQ page")
        thenIShouldNavigateToX("NFM EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Eligibility Yes NFM and continue")
        andIChooseXAndContinue("Eligibility Yes NFM")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I am on Business activity EQ Page")
        givenIAmOnXPage("Business activity EQ")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to BA guidance page")
        thenIShouldNavigateToX("BA guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to BA guidance page")
        thenIShouldNavigateToX("BA guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to business EQ page")
        thenIShouldNavigateToX("business EQ page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I choose Yes and continue")
        andIChooseXAndContinue("Yes")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I am on Global gross revenue Page")
        givenIAmOnXPage("Global gross revenue")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I choose No and continue")
        andIChooseXAndContinue("No")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to GGR guidance page")
        thenIShouldNavigateToX("GGR guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who is eligible for Pillar 2 Top-up Taxes link")
        andIClickXLink("Find out more about who is eligible for Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to GGR guidance page")
        thenIShouldNavigateToX("GGR guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Global gross revenue")
        thenIShouldNavigateToX("Global gross revenue")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to guidance page")
        thenIShouldNavigateToX("guidance page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
