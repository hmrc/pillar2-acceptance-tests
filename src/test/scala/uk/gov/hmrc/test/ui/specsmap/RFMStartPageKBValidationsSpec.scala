package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.{andISelectBackLink, thenIShouldBeOnX}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
//import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class RFMStartPageKBValidationsSpec extends AnyFeatureSpec with Matchers {

  Feature("RFM Start page") {

    Scenario("1 - Verify Individual RFM KB page") {
      Given("I access RFM start page")
        givenIAccessRFMXPage("start")  // auto-chosen (score=1.00, RFMSteps.scala)

      Then("I should be on RFM start page")
        thenIShouldBeOnX("RFM start page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("Individual User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Individual User")  // auto-chosen (score=1.00, RFMSteps.scala)

      Then("I should be on Individual RFM KB Page")
        thenIShouldBeOnX("Individual RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click sign in to Government Gateway with an organisation account link")
        andIClickXLink("sign in to Government Gateway with an organisation account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Individual RFM KB Page")
        thenIShouldBeOnX("Individual RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on RFM start page")
        thenIShouldBeOnX("RFM start page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Individual RFM KB Page")
        thenIShouldBeOnX("Individual RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - Verify Agent RFM KB page") {
      Given("Agent User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Agent User")  // auto-chosen (score=1.00, RFMSteps.scala)

      Then("I should be on Agent RFM KB Page")
        thenIShouldBeOnX("Agent RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on RFM start page")
        thenIShouldBeOnX("RFM start page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Agent RFM KB Page")
        thenIShouldBeOnX("Agent RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - Verify Organisation Assistant User RFM KB page") {
      Given("Assistant User logs in with rfm URL to Pillar2")
        givenXLogsInWithRfmURLToPillar2("Assistant User")  // auto-chosen (score=1.00, RFMSteps.scala)

      Then("I should be on Assistant User RFM KB Page")
        thenIShouldBeOnX("Assistant User RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on RFM start page")
        thenIShouldBeOnX("RFM start page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Assistant User RFM KB Page")
        thenIShouldBeOnX("Assistant User RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - Verify already enrolled Organisation User KB page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 with rfm URL to Pillar2 service")
        whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, RFMSteps.scala)
        // --- Other possible matches ---
        // whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service() [0.88] (CommonSteps.scala) pattern: (.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 service

      Then("I should be on Duplicate RFM KB Page")
        thenIShouldBeOnX("Duplicate RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Find out more about who can use this service link")
        andIClickXLink("Find out more about who can use this service")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on RFM start page")
        thenIShouldBeOnX("RFM start page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Duplicate RFM KB Page")
        thenIShouldBeOnX("Duplicate RFM KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on auth-login page")
        thenIShouldBeOnX("auth-login page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("5 - Verify existing FM (with same group id) trying to access RFM journey and getting redirected to KB page") {
      Given("I clear the cache")
        thenIClearTheCache()  // auto-chosen (score=1.00, CommonSteps.scala)

      Given("Organisation User logs in and navigates to RFM start page without Pillar2 enrolment with groupId 879D6270-E9C2-4092-AC91-21C61B69D1E7")
        givenXLogsInAndNavigatesToRFMStartPageWithoutPillar2EnrolmentWithGroupIdX()  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on RFM enter pillar2 id page")
        thenIShouldBeOnX("RFM enter pillar2 id page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide RFM pillar2 id as XMPLR0123456789")
        andIProvideRFMXAsX("pillar2 id", "XMPLR0123456789")  // auto-chosen (score=1.00, RFMSteps.scala)

      Then("I should be on RFM Existing Member KB Page")
        thenIShouldBeOnX("RFM Existing Member KB Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on RFM enter pillar2 id page")
        thenIShouldBeOnX("RFM enter pillar2 id page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click go to your business tax account link")
        andIClickXLink("go to your business tax account")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }
  }
}
