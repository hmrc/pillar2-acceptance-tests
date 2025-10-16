package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.cucumber.Check.{convertToAnyShouldWrapper, include}
import uk.gov.hmrc.test.ui.cucumber.Input.getTextOf
import uk.gov.hmrc.test.ui.cucumber.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.pages._

object CommonSteps {

  // ^(.*) logs in to register for Pillar2$
  def givenXLogsInToRegisterForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginWithUser(name)
          case "Individual User"   => AuthLoginPage.loginAsInd(name)
          case "Agent User"        => AuthLoginPage.loginAsAgent(name)
          case "Assistant User"    => AuthLoginPage.loginAssistant(name)
        }
  }

  // ^(.*) logs in to register for Pillar2 Agent service$
  def givenXLogsInToRegisterForPillar2AgentService(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginAsOrgToASA(name)
          case "Individual User"   => AuthLoginPage.loginAsIndToASA(name)
          case "Assistant User"    => AuthLoginPage.loginAsAssistantToASA(name)

        }
  }

  // ^(.*) logs in to subscribe for Pillar2$
  def givenXLogsInToSubscribeForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToSubscribe(name)
          case _                   => AuthLoginPage.loginToSubscribe(name)
        }
  }

  // ^(.*) logs in with BTA for Pillar2$
  def givenXLogsInWithBTAForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginUsingBta(name)
          case _                   => AuthLoginPage.loginToSubscribe(name)
        }
  }

  // ^.* logs in without Pillar2 enrolment$
  def givenXLogsInWithoutPillar2Enrolment(): Unit = {
    AuthLoginPage.loginToUPE()
  }

  // ^.* logs in and navigates to RFM start page without Pillar2 enrolment with groupId (.*)$
  def givenXLogsInAndNavigatesToRFMStartPageWithoutPillar2EnrolmentWithGroupIdX(): Unit = {
    groupId: String =>
        AuthLoginPage.loginToRFMWithGroupId(groupId)
  }

  // ^(.*) logs in as upe with credId (.*) for Pillar2$
  def givenXLogsInAsUpeWithCredIdXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToUPEWithCredID(name, credId)
          case _                   => AuthLoginPage.loginToUPEWithCredID(name, credId)
        }
  }

  // ^(.*) logs in with credId (.*) for Pillar2$
  def givenXLogsInWithCredIdXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginAsUserWithCredId(name, credId)
          case _                   => AuthLoginPage.loginAsUserWithCredId(name, credId)
        }
  }

  // ^(.*) logs in to upe org page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeOrgPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToOrgWithCredID(name, credId)
          case _                   => AuthLoginPage.loginToOrgWithCredID(name, credId)
        }
  }

  // ^(.*) logs in to nfm org page with CredID (.*) for Pillar2$
  def givenXLogsInToNfmOrgPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
          case _                   => AuthLoginPage.loginToNfmOrgWithCredID(name, credId)
        }
  }

  // ^(.*) logs in to upe registered in UK page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeRegisteredInUKPageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToRegWithCredID(name, credId)
          case _                   => AuthLoginPage.loginToRegWithCredID(name, credId)
        }
  }

  // ^(.*) logs in to upe name page with CredID (.*) for Pillar2$
  def givenXLogsInToUpeNamePageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToUPEName(name, credId)
          case _                   => AuthLoginPage.loginToUPEName(name, credId)
        }
  }

  // ^(.*) logs in to nfm name page with CredID (.*) for Pillar2$
  def givenXLogsInToNfmNamePageWithCredIDXForPillar2(name: String, credId: String): Unit = {
    name match {
          case "Organisation User" => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
          case _                   => AuthLoginPage.loginToNFMNameWithCredID(name, credId)
        }
  }

  // ^Organisation User navigates to (.*) check your answer page with credId (.*)$
  def givenOrganisationUserNavigatesToXCheckYourAnswerPageWithCredIdX(name: String, credId: String): Unit = {
    name match {
          case "UPE"                      => AuthLoginPage.loginToCA(name, credId)
          case "NFM"                      => AuthLoginPage.loginToNFMCA(name, credId)
          case "FD"                       => AuthLoginPage.loginToFDCA(name, credId)
          case "Contact Details"          => AuthLoginPage.loginToCDCA(name, credId)
          case "Final Check Your Answers" => AuthLoginPage.loginToFinalCA(name, credId)
        }
  }

  // ^I clear the cache$
  def thenIClearTheCache(): Unit = {
    Nav.navigateTo("http://localhost:10050/report-pillar2-top-up-taxes/test-only/eligibility/clear-session")
  }

  // ^The Heading should be (.*)$
  def thenTheHeadingShouldBeX(): Unit = {
    header: String =>
        Check.checkH1(header)
  }

  // ^The Body content should be (.*)$
  def thenTheBodyContentShouldBeX(): Unit = {
    text: String =>
        Check.checkBodyText(text)
  }

  // ^(I click Continue button|click Confirm and send|click Try Again)$
  def whenIClickContinueButton(negate: String): Unit = {
    Input.clickSubmit()
  }

  // ^(I click on Continue button)
  def whenIClickOnContinueButton(negate: String): Unit = {
    InitialGuidancePage.clickContinue()
  }

  // I select CurrentAccountingPeriod
  def whenISelectCurrentAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectCurrentAccountingPeriod()
  }

  // I select PreviousAccountingPeriodBTNSubmitted
  def whenISelectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodBTNSubmitted()
  }

  // I select PreviousAccountingPeriodUKTRSubmitted
  def whenISelectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodUKTRSubmitted()
  }

  // I select PreviousAccountingPeriod
  def thenISelectPreviousAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriod()
  }

  // ^(I click on Country selected)
  def whenIClickOnCountrySelected(negate: String): Unit = {
    UPEAddressPage.clickCountrySelected()
  }

  // ^I am on (.*) Page$
  def givenIAmOnXPage(page: String): Unit = {
        page match {
          case "UPE EQ" =>
            navigateTo(UPEEQPage.url)
            Wait.waitForElementToPresentByCssSelector(UPEEQPage.eqForm)
            isVisible(By.cssSelector(UPEEQPage.eq)) shouldBe true
          case "Business activity EQ" =>
            navigateTo(BusinessActivityEQPage.url)
            Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.eqForm)
            isVisible(By.cssSelector(BusinessActivityEQPage.eq)) shouldBe true
          case "Global gross revenue" =>
            navigateTo(GlobalGrossRevenueEQPage.url)
            Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.eqForm)
            isVisible(By.cssSelector(GlobalGrossRevenueEQPage.eq)) shouldBe true
          case "NFM registration failed error" =>
            navigateTo(NFMGRSRegistrationFailedErrorPage.url)
            Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationFailedErrorPage.content)
            isVisible(By.cssSelector(NFMGRSRegistrationFailedErrorPage.header)) shouldBe true
          case "NFM registration not called error" =>
            navigateTo(NFMGRSRegistrationNotCalledErrorPage.url)
            Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationNotCalledErrorPage.content)
            isVisible(By.cssSelector(NFMGRSRegistrationNotCalledErrorPage.header)) shouldBe true
          case "UPE registration failed error" =>
            navigateTo(UPEGRSRegistrationFailedErrorPage.url)
            Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationFailedErrorPage.content)
            isVisible(By.cssSelector(UPEGRSRegistrationFailedErrorPage.header)) shouldBe true
          case "UPE registration not called error" =>
            navigateTo(UPEGRSRegistrationNotCalledErrorPage.url)
            Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationNotCalledErrorPage.content)
            isVisible(By.cssSelector(UPEGRSRegistrationNotCalledErrorPage.header)) shouldBe true
        }
  }

  // ^I should see error message (.*) on the (.*) Page$
  def andIShouldSeeErrorMessageXOnTheXPage(error: String, page: String): Unit = {
    page match {
          case "Eligibility question" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorLink)
            getTextOf(By cssSelector (BusinessActivityEQPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(BusinessActivityEQPage.errorMessage)
            getTextOf(By cssSelector (BusinessActivityEQPage.errorMessage)) should include(error)

          case "Global gross revenue" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorLink)
            getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(GlobalGrossRevenueEQPage.errorMessage)
            getTextOf(By cssSelector (GlobalGrossRevenueEQPage.errorMessage)) should include(error)

          case "UPE business EQ" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
            getTextOf(By cssSelector (UPEPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
            getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

          case "UPE Org type" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorLink)
            getTextOf(By cssSelector (UPEEntityTypePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEEntityTypePage.errorMessage)
            getTextOf(By cssSelector (UPEEntityTypePage.errorMessage)) should include(error)

          case "NFM Org type" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorLink)
            getTextOf(By cssSelector (NFMEntityTypePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(NFMEntityTypePage.errorMessage)
            getTextOf(By cssSelector (NFMEntityTypePage.errorMessage)) should include(error)

          case "Input UPE Name" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEPage.errorLink)
            getTextOf(By cssSelector (UPEPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEPage.errorMessage)
            getTextOf(By cssSelector (UPEPage.errorMessage)) should include(error)

          case "UPE Phone" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEPhonePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEPhonePage.errorLink)
            getTextOf(By cssSelector (UPEPhonePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEPhonePage.errorMessage)
            getTextOf(By cssSelector (UPEPhonePage.errorMessage)) should include(error)

          case "Input Phone" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(InputUPEPhonePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(InputUPEPhonePage.errorLink)
            getTextOf(By cssSelector (InputUPEPhonePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(InputUPEPhonePage.errorMessage)
            getTextOf(By cssSelector (InputUPEPhonePage.errorMessage)) should include(error)

          case "UPE Contact person/team name" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorLink)
            getTextOf(By cssSelector (UPEContactNamePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEContactNamePage.errorMessage)
            getTextOf(By cssSelector (UPEContactNamePage.errorMessage)) should include(error)

          case "UPE contact email" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorLink)
            getTextOf(By cssSelector (UPEContactEmailPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(UPEContactEmailPage.errorMessage)
            getTextOf(By cssSelector (UPEContactEmailPage.errorMessage)) should include(error)

          case "NFM details page" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorLink)
            getTextOf(By cssSelector (NFMDetailsPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(NFMDetailsPage.errorMessage)
            getTextOf(By cssSelector (NFMDetailsPage.errorMessage)) should include(error)

          case "NFM registration page" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorLink)
            getTextOf(By cssSelector (NFMRegistrationPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(NFMRegistrationPage.errorMessage)
            getTextOf(By cssSelector (NFMRegistrationPage.errorMessage)) should include(error)

          case "NFM Phone" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorLink)
            getTextOf(By cssSelector (NFMPhonePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(NFMPhonePage.errorMessage)
            getTextOf(By cssSelector (NFMPhonePage.errorMessage)) should include(error)

          case "Input Nfm Phone" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorLink)
            getTextOf(By cssSelector (InputNFMPhonePage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(InputNFMPhonePage.errorMessage)
            getTextOf(By cssSelector (InputNFMPhonePage.errorMessage)) should include(error)

          case "Further Details Group Status" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorLink)
            getTextOf(By cssSelector (FDGroupStatusPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(FDGroupStatusPage.errorMessage)
            getTextOf(By cssSelector (FDGroupStatusPage.errorMessage)) should include(error)

          case "Group Accounting Period Start Date" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorLinkStartDate)
            getTextOf(By cssSelector (GroupAccountingPeriodPage.errorLinkStartDate)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorMessageStartDate)
            getTextOf(By cssSelector (GroupAccountingPeriodPage.errorMessageStartDate)) should include(error)

          case "Group Accounting Period End Date" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorLinkEndDate)
            getTextOf(By cssSelector (GroupAccountingPeriodPage.errorLinkEndDate)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(GroupAccountingPeriodPage.errorMessageEndDate)
            getTextOf(By cssSelector (GroupAccountingPeriodPage.errorMessageEndDate)) should include(error)

          case "Contact details display" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorLink)
            getTextOf(By cssSelector (ContactDetailsDisplayPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(ContactDetailsDisplayPage.errorMessage)
            getTextOf(By cssSelector (ContactDetailsDisplayPage.errorMessage)) should include(error)

          case "Second Contact details" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorLink)
            getTextOf(By cssSelector (SecondContactDetailsDisplayPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(SecondContactDetailsDisplayPage.errorMessage)
            getTextOf(By cssSelector (SecondContactDetailsDisplayPage.errorMessage)) should include(error)

          case "Contact details email" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorSummary)

            Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorLink)
            getTextOf(By cssSelector (NFMContactEmailPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(NFMContactEmailPage.errorMessage)
            getTextOf(By cssSelector (NFMContactEmailPage.errorMessage)) should include(error)

          case "BTA Pillar2 validation" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorMessage)

            Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorLink)
            getTextOf(By cssSelector (BTAPillar2IDCheckPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(BTAPillar2IDCheckPage.errorMessage)
            getTextOf(By cssSelector (BTAPillar2IDCheckPage.errorMessage)) should include(error)

          case "Reason For Refund" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorMessage)

            Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorLink)
            getTextOf(By cssSelector (RepaymentReasonPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(RepaymentReasonPage.errorMessage)
            getTextOf(By cssSelector (RepaymentReasonPage.errorMessage)) should include(error)

          case "Repayment Method" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)

            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorLink)
            getTextOf(By cssSelector (RepaymentMethodPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)
            getTextOf(By cssSelector (RepaymentMethodPage.errorMessage)) should include(error)

          case "Agent Repayment Method" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)

            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorLink)
            getTextOf(By cssSelector (RepaymentMethodPage.errorLink)) shouldBe(error)

            Wait.waitForElementToPresentByCssSelector(RepaymentMethodPage.errorMessage)
            getTextOf(By cssSelector (RepaymentMethodPage.errorMessage)) should include(error)
        }
  }

  // ^The caption must be (.*)$
  def thenTheCaptionMustBeX(): Unit = {
    caption: String =>
        Wait.waitForElementToPresentByCssSelector(InitialGuidancePage.caption)
        assert(getTextOf(By.cssSelector(InitialGuidancePage.caption)).equals(caption))
  }

  // ^I click (.*) link$
  def andIClickXLink(linkText: String): Unit = {
    Input.clickByLinkText(linkText)
  }

  // ^I select option (.*) and continue to next$
  def andISelectOptionXAndContinueToNext(option: String): Unit = {
    option match {
          case "Yes" => Input.clickById("value_0")
          case "No"  => Input.clickById("value_1")
        }
        InitialGuidancePage.clickContinue()
  }

  // ^I select (.*) option and continue to next$
  def andISelectXOptionAndContinueToNext(option: String): Unit = {
    option match {
          case "Yes" => Input.clickById("nominateFilingMember_0")
          case "No"  => Input.clickById("nominateFilingMember_1")
        }
        InitialGuidancePage.clickContinue()
  }

  // ^I click the browser back button$
  def andIClickTheBrowserBackButton(): Unit = {
    Nav.browserBack()
  }

  // ^I should be navigated to (.*) page$
  def thenIShouldBeNavigatedToXPage(text: String): Unit = {
    Wait.waitForTagNameToBeRefreshed("h1")
        assert(Driver.instance.findElement(By.cssSelector(UPEPage.sendYourFeedback)).getText.contains(text))
  }

  // ^(.*) User logs in with existing entity group (.*), (.*) and (.*) for Pillar2 service$
  def whenXUserLogsInWithExistingEntityGroupXXAndXForPillar2Service(userType: String, enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    userType match {
            case "Organisation" => AuthLoginPage.loginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
            case "Agent"        => AuthLoginPage.agentLoginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
          }
  }

  // ^I add delegated enrolment with (.*), (.*), (.*) and (.*) for Pillar2 service$
  def whenIAddDelegatedEnrolmentWithXXXAndXForPillar2Service(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    AuthLoginPage.addDelegatedEnrolment(enrolmentKey, identifierName, identifierValue, authRule)
  }

  // ^I refresh the page$
  def whenIRefreshThePage(): Unit = {
    Driver.instance.navigate().refresh()
  }

  // ^I refresh the registration in progress page$
  def whenIRefreshTheRegistrationInProgressPage(): Unit = {
    val count = 5
        var i     = 0
        while (i < count) {
          Driver.instance.navigate().refresh()
          i += 1
        }
  }

  // ^I access random page$
  def givenIAccessRandomPage(): Unit = {
    Nav.navigateTo(AuthLoginPage.incorrectUrl)
  }

  // ^I can see (.*) link$
  def thenICanSeeXLink(linkText: String): Unit = {
    linkText match {
          case "Print this page" =>
            Wait.waitForElementToPresentByCssSelector(RegistrationConfirmationPage.printThisPage)
            assert(Driver.instance.findElement(By.cssSelector(RegistrationConfirmationPage.printThisPage)).getText.contains(linkText))
          case "Agent Services Account" =>
            Wait.waitForElementToPresentByCssSelector(DashboardPage.ASALink)
            assert(Driver.instance.findElement(By.cssSelector(DashboardPage.ASALink)).getText.contains(linkText))
          case "Sign out" =>
            Wait.waitForElementToPresentByCssSelector(RepaymentConfirmationPage.signOut)
            assert(Driver.instance.findElement(By.cssSelector(RepaymentConfirmationPage.signOut)).getText.contains(linkText))
        }
  }

  // ^I should see (.*) link on (.*)$
  def andIShouldSeeXLinkOnX(linkText: String, page: String): Unit = {
    page match {
          case "Review answers page" =>
            Wait.waitForTagNameToBeRefreshed("h1")
            Wait.waitForElementToPresentByCssSelector(ReviewAnswersPage.printThisPage)
            assert(Driver.instance.findElement(By.cssSelector(ReviewAnswersPage.printThisPage)).getText.contains(linkText))
        }
  }

  // ^I access the (.*) page$
  def givenIAccessTheXPage(page: String): Unit = {
    page match {
          case "contact details summary" =>
            Nav.navigateTo(ContactDetailsSummaryPage.url)
          case "account summary" =>
            Nav.navigateTo(AccountsSummaryPage.url)
          case "MakePayment" =>
            Nav.navigateTo(MakePaymentPage.url)
          case "repayment guidance" =>
            Nav.navigateTo(RepaymentGuidancePage.url)
          case "repayment amount" =>
            Nav.navigateTo(RepaymentAmountPage.url)
          case "repayment reason" =>
            Nav.navigateTo(RepaymentReasonPage.url)
          case "repayment method" =>
            Nav.navigateTo(RepaymentMethodPage.url)
          case "uk bank account" =>
            Nav.navigateTo(UKBankAccountPaymentPage.url)
          case "non-uk bank account" =>
            Nav.navigateTo(NonUKBankAccountPaymentPage.url)
          case "repayment contact name" =>
            Nav.navigateTo(RepaymentContactPage.url)
          case "repayment contact email" =>
            Nav.navigateTo(RepaymentContactEmailPage.url)
          case "repayment phone" =>
            Nav.navigateTo(RepaymentPhonePage.url)
          case "repayment phone input" =>
            Nav.navigateTo(RepaymentPhoneInputPage.url)
          case "repayment CYA" =>
            Nav.navigateTo(RepaymentCYAPage.url)
          case "manage contact name" =>
            Nav.navigateTo(ManageContactNamePage.url)
          case "manage second contact name" =>
            Nav.navigateTo(ManageSecondContactNamePage.url)
          case "manage contact address" =>
            Nav.navigateTo(ManageContactAddressPage.url)
          case "manage group status" =>
            Nav.navigateTo(ManageGroupStatusPage.url)
          case "manage accounting period" =>
            Nav.navigateTo(ManageAccountPeriodPage.url)
          case "repayment change amount" =>
            Nav.navigateTo(RepaymentChangeAmountPage.url)
          case "repayment change method" =>
            Nav.navigateTo(RepaymentChangeMethodPage.url)
          case "repayment change name" =>
            Nav.navigateTo(RepaymentChangeNamePage.url)
          case "transaction history" =>
            Nav.navigateTo(TransactionHistoryPage.url)

        }
  }

  // ^I should see (.*) CTA$
  def thenIShouldSeeXCTA(pageNumber: String): Unit = {
    pageNumber match {
          case "Next" =>
            assert(Driver.instance.findElement(By.cssSelector(TransactionHistoryPage.nextPageCTA)).isDisplayed)
          case "Previous" =>
            assert(Driver.instance.findElement(By.cssSelector(TransactionHistorySecondPage.previousPageCTA)).isDisplayed)
        }
  }

  // ^I click (.*) CTA$
  def whenIClickXCTA(pageNumber: String): Unit = {
    pageNumber match {
          case "Next" =>
            TransactionHistoryPage.clickNext()
          case "Previous" =>
            TransactionHistorySecondPage.clickPrevious()
        }
  }

}
