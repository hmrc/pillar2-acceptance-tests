package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.ASASteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class RepaymentJourneysSpec extends AnyFeatureSpec with Matchers {

  Feature("Repayment Journey") {

    Scenario("1 - Validate error for Non UK bank account details page") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I access Non UK payment page")
        andIAccessXPaymentPage("Non UK")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I am on feedback survey page")
        givenIAmOnXPage("feedback survey")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andIAmOnFeedbackSurveyPage() [1.00] (UPESteps.scala) pattern: I am on feedback survey page

      When("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I access Non UK payment page")
        andIAccessXPaymentPage("Non UK")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("2 - Organisation User navigates to repayment pages") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as Test Reason")
        andIProvideValueForXAsX("Refund Reason", "Test Reason")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Non UK Bank Account details as:")
        andIEnterNonUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name

      When("I provide Repayment contact email as repayment@email.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as repayment@email.com

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I provide Repayment contact phone as 789765423")
        // ⚠️ No step-def match found for: I provide Repayment contact phone as 789765423

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Phone Page")
        thenIShouldBeOnX("Repayment Phone Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Contact Email Page")
        thenIShouldBeOnX("Repayment Contact Email Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I navigate from Contact page to CYA page")
        andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Amount")
        whenIClickChangeLinkForRepaymentX("Amount")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I provide Refund Amount as 1000.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 1000.00

      When("I click change link for Repayment Reason")
        whenIClickChangeLinkForRepaymentX("Reason")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I provide Refund Reason as Test Reason")
        // ⚠️ No step-def match found for: I provide Refund Reason as Test Reason

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Bank Name")
        whenIClickChangeLinkForRepaymentX("Bank Name")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I enter Non UK Bank Account details as:")
        andIEnterNonUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I click change link for Repayment Contact Name")
        whenIClickChangeLinkForRepaymentX("Contact Name")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I provide Repayment contact name as Repayment Contact Name change")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name change

      When("I click change link for Repayment Contact Email")
        whenIClickChangeLinkForRepaymentX("Contact Email")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I provide Repayment contact email as email@change.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as email@change.com

      When("I click change link for Repayment Contact Phone")
        whenIClickChangeLinkForRepaymentX("Contact Phone")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be redirect to Repayment processing page")
        thenIShouldBeRedirectToX("Repayment processing page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should be on Repayment Confirmation Page")
        thenIShouldBeOnX("Repayment Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Back to group homepage link")
        andIClickXLink("Back to group homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("3 - Agent User navigates to repayment journey pages") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 9999.99")
        // ⚠️ No step-def match found for: I provide Refund Amount as 9999.99

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I should see the repayment method UK bank account remain selected")
        andIShouldSeeTheRepaymentMethodXRemainSelected("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I enter Non UK Bank Account details as:")
        andIEnterNonUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name

      When("I provide Repayment contact email as repayment@email.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as repayment@email.com

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I provide Repayment contact phone as 789765423")
        // ⚠️ No step-def match found for: I provide Repayment contact phone as 789765423

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Phone Input Page")
        thenIShouldBeOnX("Repayment Phone Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Phone Page")
        thenIShouldBeOnX("Repayment Phone Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Contact Email Page")
        thenIShouldBeOnX("Repayment Contact Email Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I navigate from Contact page to CYA page")
        andINavigateFromContactPageToCYAPage("I navigate from Contact page to CYA page")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Amount")
        whenIClickChangeLinkForRepaymentX("Amount")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I provide Refund Amount as 1000.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 1000.00

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Reason")
        whenIClickChangeLinkForRepaymentX("Reason")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I provide Refund Reason as Test Reason")
        // ⚠️ No step-def match found for: I provide Refund Reason as Test Reason

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Bank Name")
        whenIClickChangeLinkForRepaymentX("Bank Name")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I provide value for Bank Name as HSBC2")
        andIProvideValueForXAsX("Bank Name", "HSBC2")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for Account Name as Test Name2")
        andIProvideValueForXAsX("Account Name", "Test Name2")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for Swift Code as HBUKGB4C")
        andIProvideValueForXAsX("Swift Code", "HBUKGB4C")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for Iban as GB29NWBK60161331926820")
        andIProvideValueForXAsX("Iban", "GB29NWBK60161331926820")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Contact Name")
        whenIClickChangeLinkForRepaymentX("Contact Name")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      And("I provide Repayment contact name as Repayment Contact Name change")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name change

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Contact Email")
        whenIClickChangeLinkForRepaymentX("Contact Email")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I provide Repayment contact email as email@change.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as email@change.com

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment Contact Phone")
        whenIClickChangeLinkForRepaymentX("Contact Phone")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I select option No and continue to next")
        andISelectOptionXAndContinueToNext("No")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click change link for Repayment UK Bank Method")
        whenIClickChangeLinkForRepaymentX("UK Bank Method")  // auto-chosen (score=1.00, PaymentSteps.scala)
        // --- Other possible matches ---
        // andIClickXLink() [0.83] (CommonSteps.scala) pattern: I click (.*) link

      When("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I provide value for UK Bank Name as Natwest")
        andIProvideValueForXAsX("UK Bank Name", "Natwest")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for UK Account Name as Epic Adventure Inc")
        andIProvideValueForXAsX("UK Account Name", "Epic Adventure Inc")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for Sort Code as 206705")
        andIProvideValueForXAsX("Sort Code", "206705")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I provide value for UK Account number as 86473611")
        andIProvideValueForXAsX("UK Account number", "86473611")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("4 - Agent User navigates to repayment journey pages for UK bank account") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 999.99")
        // ⚠️ No step-def match found for: I provide Refund Amount as 999.99

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I refresh the page")
        whenIRefreshThePage()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name

      When("I provide Repayment contact email as repayment@email.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as repayment@email.com

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I provide Repayment contact phone as 789765423")
        // ⚠️ No step-def match found for: I provide Repayment contact phone as 789765423

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click Sign out link")
        andIClickXLink("Sign out")  // auto-chosen (score=1.00, CommonSteps.scala)

    }

    Scenario("5 - Organisation User navigates to repayment journey pages for UK bank account") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")
        andIProvideValueForXAsX("Refund Reason", "A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should navigate to UK Bank Account Payment Page")
        thenIShouldNavigateToX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I provide Repayment contact name as Repayment Contact Name")
        // ⚠️ No step-def match found for: I provide Repayment contact name as Repayment Contact Name

      When("I provide Repayment contact email as repayment@email.com")
        // ⚠️ No step-def match found for: I provide Repayment contact email as repayment@email.com

      When("I select option Yes and continue to next")
        andISelectOptionXAndContinueToNext("Yes")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // andISelectXOptionAndContinueToNext() [0.90] (CommonSteps.scala) pattern: I select (.*) option and continue to next

      When("I provide Repayment contact phone as 789765423")
        // ⚠️ No step-def match found for: I provide Repayment contact phone as 789765423

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("6 - Organisation User navigates to error page when repayment submission API fails to submit data to ETMP") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I provide value for Refund Reason as Test Refund")
        andIProvideValueForXAsX("Refund Reason", "Test Refund")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I access Repayment CYA page")
        whenIAccessRepaymentCYAPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Continue button")
        // ⚠️ No step-def match found for: I click Continue button

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Continue button")
        // ⚠️ No step-def match found for: I click Continue button

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click go back and complete all the required answers link")
        andIClickXLink("go back and complete all the required answers")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Reason For Refund Page")
        thenIShouldNavigateToX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("7 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Amount Page")
        thenIShouldNavigateToX("Repayment Amount Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I provide value for Refund Reason as Test Refund")
        andIProvideValueForXAsX("Refund Reason", "Test Refund")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      And("I access Repayment CYA page")
        whenIAccessRepaymentCYAPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Continue button")
        // ⚠️ No step-def match found for: I click Continue button

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      Then("I should be on Repayment CYA Page")
        thenIShouldBeOnX("Repayment CYA Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Continue button")
        // ⚠️ No step-def match found for: I click Continue button

      Then("I should be on Repayment Incomplete Error Page")
        thenIShouldBeOnX("Repayment Incomplete Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click go back and complete all the required answers link")
        andIClickXLink("go back and complete all the required answers")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("8 - Organisation User navigates to journey recovery error page when they try to skip mandatory questions") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a refund link")
        andIClickXLink("Request a refund")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I provide Refund Reason as Test Reason")
        // ⚠️ No step-def match found for: I provide Refund Reason as Test Reason

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Non UK Bank Account details as:")
        andIEnterNonUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access Repayment contact email page")
        givenIAccessRepaymentContactEmailPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to account homepage link")
        andIClickXLink("Return to account homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("9 - Agent User navigates to journey recovery error page when they try to skip mandatory questions") {
      Given("Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Agent", "HMRC-AS-AGENT", "AgentReference", "1234")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      And("I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service")
        whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service("HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345674", "pillar2-auth")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on ASA Pillar2 Input Page")
        thenIShouldBeOnX("ASA Pillar2 Input Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I provide ASA Pillar2 ID as XMPLR0012345674")
        andIProvideASAXAsX("Pillar2 ID", "XMPLR0012345674")  // auto-chosen (score=1.00, ASASteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to ASA Confirmation Page")
        thenIShouldNavigateToX("ASA Confirmation Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a refund link")
        andIClickXLink("Request a refund")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Guidance Page")
        thenIShouldNavigateToX("Repayment Guidance Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I provide Refund Reason as Test Reason")
        // ⚠️ No step-def match found for: I provide Refund Reason as Test Reason

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Method Page")
        thenIShouldBeOnX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select repayment method as Non-UK bank account")
        andISelectRepaymentMethodAsX("Non-UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Non UK Bank Account Payment Page")
        thenIShouldBeOnX("Non UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter Non UK Bank Account details as:")
        andIEnterNonUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access Repayment contact email page")
        givenIAccessRepaymentContactEmailPage()  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Report Pillar 2 Top-up Taxes link")
        andIClickXLink("Report Pillar 2 Top-up Taxes")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Repayment Journey Recovery Error Page")
        thenIShouldBeOnX("Repayment Journey Recovery Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to account homepage link")
        andIClickXLink("Return to account homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Dashboard page")
        thenIShouldNavigateToX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
