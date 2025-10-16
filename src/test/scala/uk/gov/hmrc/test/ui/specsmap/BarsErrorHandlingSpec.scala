package uk.gov.hmrc.test.ui.specsmap
import org.scalatest.matchers.should.Matchers

import org.scalatest.featurespec.AnyFeatureSpec
import uk.gov.hmrc.test.ui.cucumber.stepdefs.Hooks.{And, Given, Then, When}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.ASASteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps._
import uk.gov.hmrc.test.ui.cucumber.stepdefs.CommonSteps._

class BarsErrorHandlingSpec extends AnyFeatureSpec with Matchers {

  Feature("Bars Handling") {

    Scenario("1 - Organisation User bars integration validation") {
      Given("Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service")
        whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service("Organisation", "HMRC-PILLAR2-ORG", "PLRID", "XMPLR0012345676")  // auto-chosen (score=1.00, CommonSteps.scala)
        // --- Other possible matches ---
        // whenOrganisationUserLogsInWithExistingEntityGroupXXAndXWithRfmURLToPillar2Service() [0.81] (RFMSteps.scala) pattern: Organisation User logs in with existing entity group (.*), (.*) and (.*) with rfm URL to Pillar2 service
        // givenXLogsInWithCredIdXForPillar2() [0.76] (CommonSteps.scala) pattern: (.*) logs in with credId (.*) for Pillar2

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Request a repayment link")
        andIClickXLink("Request a repayment")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Reason For Refund Page")
        thenIShouldBeOnX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as Bars Integration Test")
        andIProvideValueForXAsX("Refund Reason", "Bars Integration Test")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Could Not Confirm Error Page")
        thenIShouldBeOnX("Repayment Could Not Confirm Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click return to your bank details and try again link")
        andIClickXLink("return to your bank details and try again")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Bank Details Error Page")
        thenIShouldBeOnX("Repayment Bank Details Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click try again with a different business bank account link")
        andIClickXLink("try again with a different business bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Bars Error Page")
        thenIShouldBeOnX("Repayment Bars Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to your account homepage link")
        andIClickXLink("Return to your account homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I access UK payment page")
        andIAccessXPaymentPage("UK")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Partial Name Error Page")
        thenIShouldBeOnX("Repayment Partial Name Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes on partial name error page")
        andISelectOptionXOnPartialNameErrorPage("Yes")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select option No on partial name error page")
        andISelectOptionXOnPartialNameErrorPage("No")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }

    Scenario("2 - Agent User bars integration validation") {
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

      When("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I provide Refund Amount as 100.00")
        // ⚠️ No step-def match found for: I provide Refund Amount as 100.00

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Reason For Refund Page")
        thenIShouldBeOnX("Reason For Refund Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I provide value for Refund Reason as Bars Integration Test")
        andIProvideValueForXAsX("Refund Reason", "Bars Integration Test")  // auto-chosen (score=1.00, PaymentSteps.scala)

      And("I click on Continue button")
        whenIClickOnContinueButton("I click on Continue button")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should navigate to Repayment Method Page")
        thenIShouldNavigateToX("Repayment Method Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select repayment method as UK bank account")
        andISelectRepaymentMethodAsX("UK bank account")  // auto-chosen (score=1.00, PaymentSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Could Not Confirm Error Page")
        thenIShouldBeOnX("Repayment Could Not Confirm Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click return to your bank details and try again link")
        andIClickXLink("return to your bank details and try again")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Bank Details Error Page")
        thenIShouldBeOnX("Repayment Bank Details Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click try again with a different business bank account link")
        andIClickXLink("try again with a different business bank account")  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Bars Error Page")
        thenIShouldBeOnX("Repayment Bars Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click Return to your account homepage link")
        andIClickXLink("Return to your account homepage")  // auto-chosen (score=1.00, CommonSteps.scala)

      Then("I should be on Dashboard page")
        thenIShouldBeOnX("Dashboard page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I click the browser back button")
        andIClickTheBrowserBackButton()  // auto-chosen (score=1.00, CommonSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I enter UK Bank Account details as:")
        andIEnterUKBankAccountDetailsAs(null)  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Partial Name Error Page")
        thenIShouldBeOnX("Repayment Partial Name Error Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select option Yes on partial name error page")
        andISelectOptionXOnPartialNameErrorPage("Yes")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on Repayment Contact Page")
        thenIShouldBeOnX("Repayment Contact Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      When("I select back link")
        andISelectBackLink()  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

      And("I select option No on partial name error page")
        andISelectOptionXOnPartialNameErrorPage("No")  // auto-chosen (score=1.00, PaymentSteps.scala)

      Then("I should be on UK Bank Account Payment Page")
        thenIShouldBeOnX("UK Bank Account Payment Page")  // auto-chosen (score=1.00, EligibilityQuestionSteps.scala)

    }
  }
}
