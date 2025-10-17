package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.specstepdef.CommonStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.ASAStepsSteps._
import uk.gov.hmrc.test.ui.specstepdef.EligibilityQuestionStepsSteps._


class AgentDueAndOverDueSpec extends AnyFeatureSpec with Matchers {

  Feature("Pillar2 Due & Overdue returns for Agent User Journey") {

    Scenario("1 - Agent User navigates to Due & Overdue returns page with multiple accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR1111111111 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR1111111111", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR1111111111")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR1111111111")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click View all due and overdue returns link")
        andIClickXLink("View all due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Due & Over Due Page")
        thenIShouldNavigateToX("Due & Over Due Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I should see 4 accounting periods on Due Overdue Page")
        // ⚠️ No step-def match found for: I should see 4 accounting periods on Due Overdue Page

      And("I should see 1 section with status Due")
        // ⚠️ No step-def match found for: I should see 1 section with status Due

      And("I should see 3 section with status Overdue")
        // ⚠️ No step-def match found for: I should see 3 section with status Overdue

      When("I click submission history link")
        andIClickXLink("submission history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 0 accounting periods on Sub History Page")
        // ⚠️ No step-def match found for: I should see 0 accounting periods on Sub History Page

      When("I click due and overdue returns link")
        andIClickXLink("due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Due & Over Due Page")
        thenIShouldNavigateToX("Due & Over Due Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

    }

    Scenario("2 - Agent User navigates to Due & Overdue returns page with no accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR2222222222", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR2222222222")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR2222222222")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View all due and overdue returns link")
        andIClickXLink("View all due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 0 accounting periods on Due Overdue Page")
        // ⚠️ No step-def match found for: I should see 0 accounting periods on Due Overdue Page

      When("I click submission history link")
        andIClickXLink("submission history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 0 accounting periods on Sub History Page")
        // ⚠️ No step-def match found for: I should see 0 accounting periods on Sub History Page

    }

    Scenario("3 -  Agent User navigates to Due & Overdue returns page with single accounting period") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR3333333333 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR3333333333", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR3333333333")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR3333333333")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View all due and overdue returns link")
        andIClickXLink("View all due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 1 accounting periods on Due Overdue Page")
        // ⚠️ No step-def match found for: I should see 1 accounting periods on Due Overdue Page

      And("I should see 1 section with status Due")
        // ⚠️ No step-def match found for: I should see 1 section with status Due

      And("I should see 0 section with status Overdue")
        // ⚠️ No step-def match found for: I should see 0 section with status Overdue

      When("I click submission history link")
        andIClickXLink("submission history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 0 accounting periods on Sub History Page")
        // ⚠️ No step-def match found for: I should see 0 accounting periods on Sub History Page

    }

    Scenario("4 - Agent User navigates to Due & Overdue returns page with all fulfilled submissions") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR4444444444", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR4444444444")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR4444444444")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View all due and overdue returns link")
        andIClickXLink("View all due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 0 accounting periods on Due Overdue Page")
        // ⚠️ No step-def match found for: I should see 0 accounting periods on Due Overdue Page

      When("I click submission history link")
        andIClickXLink("submission history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 2 accounting periods on Sub History Page")
        // ⚠️ No step-def match found for: I should see 2 accounting periods on Sub History Page

    }

    Scenario("5 - Agent User navigates to Due & Overdue returns page with some fulfilled submissions") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555555555 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XEPLR5555555555", "pillar2-auth")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I provide ASA Pillar2 ID as XEPLR5555555555")
        andIProvideASAXAsX("Pillar2 ID", "XEPLR5555555555")  // auto-chosen (score=1.00, ASAStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionStepsSteps.scala)

      When("I click View all due and overdue returns link")
        andIClickXLink("View all due and overdue returns")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 2 accounting periods on Due Overdue Page")
        // ⚠️ No step-def match found for: I should see 2 accounting periods on Due Overdue Page

      And("I should see 0 section with status Due")
        // ⚠️ No step-def match found for: I should see 0 section with status Due

      And("I should see 2 section with status Overdue")
        // ⚠️ No step-def match found for: I should see 2 section with status Overdue

      When("I click submission history link")
        andIClickXLink("submission history")  // auto-chosen (score=1.00, CommonStepsSteps.scala)

      And("I should see 2 accounting periods on Sub History Page")
        // ⚠️ No step-def match found for: I should see 2 accounting periods on Sub History Page

    }
  }
}
