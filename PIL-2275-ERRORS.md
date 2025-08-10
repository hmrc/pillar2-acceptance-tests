olkuy@JGPXV3N213 pillar2-acceptance-tests % sbt -J-ea -Dbrowser=chrome -Denvironment=local -Dbrowser.option.headless=false -Dcucumber.execution.parallel.enabled=false -Dcucumber.features=src/test/resources/features/RFMnfmNoIDFlow.feature "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner"
[info] welcome to sbt 1.10.10 (Eclipse Adoptium Java 11.0.19)
[info] loading settings for project pillar2-acceptance-tests-build from plugins.sbt...
[info] loading project definition from /Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/project
[info] SbtAutoBuildPlugin - adding projectSettings
[info] loading settings for project testSuite from build.sbt...
[info] SbtAutoBuildPlugin - adding global settings
[info] SbtAutoBuildPlugin - repository is marked public. Licence headers will be added to all source files
[info] set current project to pillar2-acceptance-tests (in build file:/Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/)
[info] compiling 1 Scala source to /Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/target/scala-2.13/test-classes ...
18:22:19.343 [pool-6-thread-2] INFO uk.gov.hmrc.selenium.webdriver.DriverFactory -- Browser: chrome 136
18:22:19.403 [pool-6-thread-2] INFO uk.gov.hmrc.selenium.webdriver.DriverFactory -- Accessibility assessment: Enabled
18:22:21.563 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.Nav$ -- Instantiating Browser: chrome
18:22:21.908 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:22:21.927 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:22:21.929 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:22:21.933 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:22:21.937 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:22:21.940 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:22:21.950 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:22:21.951 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:22:21.952 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:22:21.953 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:22:21.954 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch3
Scenario: 1 - Verify RFM journey for NFM No Id flow until check your answers page and validate that previously entered data is pre populated    # src/test/resources/features/RFMnfmNoIDFlow.feature:7
18:22:22.005 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.pages.AuthLoginPage$ -- Instantiating Browser: chrome
18:22:22.235 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.Input$ -- Instantiating Browser: chrome
18:22:22.239 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.Find$ -- Instantiating Browser: chrome
18:22:22.243 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.Wait$ -- Instantiating Browser: chrome
  Given Organisation User logs in with rfm URL to Pillar2                                                                                       # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XMPLR0123456789                                                                                              # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                                                            # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
18:22:24.052 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.Check$ -- Instantiating Browser: chrome
  Then I should be on RFM CYA Page                                                                                                              # EligibilityQuestionSteps.scala:128
  When I click on Save&Continue button                                                                                                          # UPEPageSteps.scala:332
  Then I should be on RFM Saving Progress Page                                                                                                  # EligibilityQuestionSteps.scala:128
  When I click on Continue button                                                                                                               # StepDef.scala:185
  Then I should be on RFM Corp Position Page                                                                                                    # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                                                                                # StepDef.scala:185
  When I select corp position as NFM                                                                                                            # RFMPagesStepDef.scala:295
  Then I should be on New NFM guidance page                                                                                                     # EligibilityQuestionSteps.scala:128
  When I click on Continue button                                                                                                               # StepDef.scala:185
  Then I should be on RFM registered in UK page                                                                                                 # EligibilityQuestionSteps.scala:128
  When I select option No and continue to next                                                                                                  # StepDef.scala:527
  Then I should navigate to RFM New NFM Contact Name Page                                                                                       # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                                                                                # StepDef.scala:185
  Then I should see an error message Enter the name of the new nominated filing member on the RFM contact name Page                             # RFMPagesStepDef.scala:125
  When I enter NFM name as RFMNewNFMContactNameCharacterLengthErrorValidationMaximumNFMNameCharacterLengthShouldBeEnteredLessThanOneHundredFive # UPEPageSteps.scala:26
  Then I should see an error message Name of the new nominated filing must be 105 characters or less on the RFM contact name Page               # RFMPagesStepDef.scala:125
  When I refresh the page                                                                                                                       # StepDef.scala:599
  When I provide RFM New NFM Name as Test CYA                                                                                                   # RFMPagesStepDef.scala:79
  Then I should navigate to RFM New NFM Contact Address Page                                                                                    # EligibilityQuestionSteps.scala:53
  And I enter Address Line 1 as Address Line 1 CYA                                                                                              # UPEPageSteps.scala:26
  And I enter City as City CYA                                                                                                                  # UPEPageSteps.scala:26
  And I enter Postal Code as EH5 5WY                                                                                                            # UPEPageSteps.scala:26
  And I enter Country as Australia                                                                                                              # UPEPageSteps.scala:26
  And I click on Country selected                                                                                                               # StepDef.scala:206
  And I click on Continue button                                                                                                                # StepDef.scala:185
  Then I should be on RFM No ID CYA Page                                                                                                        # EligibilityQuestionSteps.scala:128
  When I click change link for RFM New NFM Name                                                                                                 # RFMPagesStepDef.scala:271
  Then I should navigate to RFM New NFM Contact Name Change                                                                                     # EligibilityQuestionSteps.scala:53
  When I provide RFM New NFM Name as New NFM Name Change                                                                                        # RFMPagesStepDef.scala:79
  Then I should navigate to RFM No ID Change CYA Page                                                                                           # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                                               # StepDef.scala:185
  Then I should navigate to RFM Contact Guidance page                                                                                           # EligibilityQuestionSteps.scala:53
  And I click Sign out link                                                                                                                     # StepDef.scala:523
18:22:30.471 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:22:30.472 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:22:30.473 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:22:30.474 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:22:30.476 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:22:30.477 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:22:30.480 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:22:30.481 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:22:30.481 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:22:30.482 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:22:30.482 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey # src/test/resources/features/RFMnfmNoIDFlow.feature:50
  Given I clear the cache                                                                                # StepDef.scala:143
  When Organisation User logs in with rfm URL to Pillar2                                                 # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XMPLR0123456789                                                       # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                     # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                                   # UPEPageSteps.scala:332
  When I click on Continue button                                                                        # StepDef.scala:185
  When I select corp position as UPE                                                                     # RFMPagesStepDef.scala:295
  And I click on Continue button                                                                         # StepDef.scala:185
  When I provide RFM contact name as RFM test contact                                                    # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                      # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Contact Number Page                                                      # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                           # StepDef.scala:527
  And I select option No and continue to next                                                            # StepDef.scala:527
  When I enter Address as:                                                                               # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see row 1 key Position in the group’s corporate structure                                 # ChangeYourAnswersPageSteps.scala:28
  And I should see row 1 value Ultimate Parent Entity (UPE)                                              # ChangeYourAnswersPageSteps.scala:32
  When I click change link for RFM Corporate Position                                                    # RFMPagesStepDef.scala:271
  When I select corp position as NFM                                                                     # RFMPagesStepDef.scala:295
  And I click on Continue button                                                                         # StepDef.scala:185
  When I select option No and continue to next                                                           # StepDef.scala:527
  And I click on Continue button                                                                         # StepDef.scala:185
  When I provide RFM New NFM Name as Test CYA                                                            # RFMPagesStepDef.scala:79
  Then I should navigate to RFM New NFM Contact Address Page                                             # EligibilityQuestionSteps.scala:53
  When I enter Address as:                                                                               # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE                |
    | addressLine1 | Address Line 1 & CYA |
    | addressLine3 | City CYA             |
    | postalCode   | EH5 5WY              |
    | countryCode  | Australia            |
  Then I should be on RFM No ID CYA Page                                                                 # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                                         # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                # EligibilityQuestionSteps.scala:38
  Then I should be on RFM No ID CYA Page                                                                 # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                                         # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Name                                        | Test CYA                    |
    | Address                                     | Address Line 1 & CYA        |
    | Address                                     | City CYA                    |
    | Address                                     | EH55WY                      |
    | Address                                     | Australia                   |
  When I click change link for RFM Input Name                                                            # RFMPagesStepDef.scala:271
  When I provide RFM New NFM Name as Test Change                                                         # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Input Address                                                         # RFMPagesStepDef.scala:271
  And I enter Address Line 1 as Address Line 1 Change                                                    # UPEPageSteps.scala:26
  And I enter City as City Change                                                                        # UPEPageSteps.scala:26
  And I enter Postal Code as EH75WK                                                                      # UPEPageSteps.scala:26
  And I click on Continue button                                                                         # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see row 3 value Address Line 1 Change                                                     # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value City Change                                                               # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value EH75WK                                                                    # ChangeYourAnswersPageSteps.scala:32
  And I click on Continue button                                                                         # StepDef.scala:185
  Then I should be redirect to RFM processing page                                                       # EligibilityQuestionSteps.scala:153
  And I should be on RFM Confirmation Page                                                               # EligibilityQuestionSteps.scala:128
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                             # StepDef.scala:572
  And I can see Print this page link                                                                     # StepDef.scala:616
  When I click the browser back button                                                                   # StepDef.scala:549
  Then I should navigate to RFM No Return Back Error Page                                                # EligibilityQuestionSteps.scala:53
  And I click report and manage your Pillar 2 Top-up Taxes link                                          # StepDef.scala:523
  Then I should be on Dashboard page                                                                     # EligibilityQuestionSteps.scala:128
18:22:42.649 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:22:42.651 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:22:42.653 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:22:42.654 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:22:42.657 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:22:42.658 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:22:42.661 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:22:42.662 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:22:42.662 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:22:42.663 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:22:42.663 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 3 - Validating RFM Check your answers page navigations   # src/test/resources/features/RFMnfmNoIDFlow.feature:128
  Given Organisation User logs in with rfm URL to Pillar2          # RFMPagesStepDef.scala:32
  And I access RFM start page                                      # RFMPagesStepDef.scala:42
  And I click on Continue button                                   # StepDef.scala:185
  When I provide RFM pillar2 id as XMPLR0123456789                 # RFMPagesStepDef.scala:79
  When I enter registration date as:                               # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                             # UPEPageSteps.scala:332
  When I click on Continue button                                  # StepDef.scala:185
  When I select corp position as UPE                               # RFMPagesStepDef.scala:295
  And I click on Continue button                                   # StepDef.scala:185
  When I provide RFM contact name as RFM test contact              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                # RFMPagesStepDef.scala:79
  When I select option No and continue to next                     # StepDef.scala:527
  And I select option No and continue to next                      # StepDef.scala:527
  When I enter Address as:                                         # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  Then I should navigate to RFM Final Review Page                  # EligibilityQuestionSteps.scala:53
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/review-submit/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/error/cannot-return" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54578}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:54578/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02ff911b8db3c0985c75629b6c1b6436
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:52)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:75)
  at ✽.I should navigate to RFM Final Review Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:152)

  When I click change link for RFM Corporate Position              # RFMPagesStepDef.scala:271
  And I select corp position as NFM                                # RFMPagesStepDef.scala:295
  Then I should be on New NFM guidance page                        # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                   # StepDef.scala:185
  Then I should be on RFM registered in UK page                    # EligibilityQuestionSteps.scala:128
  When I select option Yes and continue to next                    # StepDef.scala:527
  Then I should be on RFM UK based entity type page                # EligibilityQuestionSteps.scala:128
  When I select option UK limited company and continue to GRS page # UPEPageSteps.scala:275
  Then I should navigate to RFM UK limited Company GRSPage         # EligibilityQuestionSteps.scala:53
  When I navigate back to RFM CYA Page from GRS Page               # RFMPagesStepDef.scala:357
  Then I should navigate to RFM Final Review Page                  # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Corporate Position              # RFMPagesStepDef.scala:271
  And I click on Continue button                                   # StepDef.scala:185
  Then I should be on New NFM guidance page                        # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                   # StepDef.scala:185
  Then I should be on RFM registered in UK page                    # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                   # StepDef.scala:185
  Then I should be on RFM UK based entity type page                # EligibilityQuestionSteps.scala:128

    Embedding 3_-_Validating_RFM_Check_your_answers_page_navigations.png [image/png 236876 bytes]
18:23:02.765 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:23:02.767 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:23:02.769 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:23:02.773 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:23:02.775 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:23:02.776 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:23:02.779 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:23:02.780 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:23:02.780 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:23:02.780 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:23:02.781 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 4 - Validating RFM Check your answers page for UPE/NFM journey Responses # src/test/resources/features/RFMnfmNoIDFlow.feature:173
  Given Organisation User logs in with rfm URL to Pillar2                          # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XMPLR0123456789                                 # RFMPagesStepDef.scala:79
  When I enter registration date as:                                               # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                             # UPEPageSteps.scala:332
  And I access RFM corporate position page                                         # RFMPagesStepDef.scala:42
  When I select corp position as UPE                                               # RFMPagesStepDef.scala:295
  And I click on Continue button                                                   # StepDef.scala:185
  When I provide RFM contact name as RFM test contact                              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                # RFMPagesStepDef.scala:79
  When I select option No and continue to next                                     # StepDef.scala:527
  And I select option No and continue to next                                      # StepDef.scala:527
  When I enter Address as:                                                         # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:271
  When I select corp position as NFM                                               # RFMPagesStepDef.scala:295
  And I click on Continue button                                                   # StepDef.scala:185
  When I select option No and continue to next                                     # StepDef.scala:527
  When I provide RFM New NFM Name as Test CYA                                      # RFMPagesStepDef.scala:79
  When I enter Address as:                                                         # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should be on RFM No ID CYA Page                                           # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  When I select back link                                                          # EligibilityQuestionSteps.scala:38
  Then I should be on RFM No ID CYA Page                                           # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Name                                        | Test CYA                    |
    | Address                                     | Address Line 1 CYA          |
    | Address                                     | City CYA                    |
    | Address                                     | EH55WY                      |
    | Address                                     | Australia                   |
  When I click change link for RFM Input Name                                      # RFMPagesStepDef.scala:271
  When I provide RFM New NFM Name as Test Change                                   # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Input Address                                   # RFMPagesStepDef.scala:271
  And I enter Address Line 1 as Address Line 1 Change                              # UPEPageSteps.scala:26
  And I enter City as City Change                                                  # UPEPageSteps.scala:26
  And I enter Postal Code as EH75WK                                                # UPEPageSteps.scala:26
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY     | VALUE                 |
    | Address | Address Line 1 Change |
    | Address | City Change           |
    | Address | EH75WK                |
  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:271
  When I select corp position as UPE                                               # RFMPagesStepDef.scala:295
  And I should see row 1 value Ultimate Parent Entity (UPE)                        # ChangeYourAnswersPageSteps.scala:32
      java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
  at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
  at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
  at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
  at java.base/java.util.Objects.checkIndex(Objects.java:372)
  at java.base/java.util.ArrayList.get(ArrayList.java:459)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$2(ChangeYourAnswersPageSteps.scala:34)
  at ✽.I should see row 1 value Ultimate Parent Entity (UPE)(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:237)

  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:271
  When I select corp position as NFM                                               # RFMPagesStepDef.scala:295
  And I click on Continue button                                                   # StepDef.scala:185
  When I select option Yes and continue to next                                    # StepDef.scala:527
  When I select option UK limited company and continue to GRS page                 # UPEPageSteps.scala:275
  Then I should navigate to RFM UK limited Company GRSPage                         # EligibilityQuestionSteps.scala:53
  When I registered successfully with BV enabled                                   # UPEPageSteps.scala:300
  And I click on Save&Continue button                                              # UPEPageSteps.scala:332
  Then I should be on RFM Contact Guidance page                                    # EligibilityQuestionSteps.scala:128
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Contact Detail Page                                # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Contact Email Page                                 # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Contact Number Page                                # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should navigate to RFM Second Contact Question Page                       # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:185
  Then I should be on RFM Contact Address Page                                     # EligibilityQuestionSteps.scala:128
  When I click on Continue button                                                  # StepDef.scala:185
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Company                                     | Test Example Company Name   |
    | Company Registration Number                 | 76543210                    |
    | Unique Taxpayer Reference                   | 1234567890                  |

    Embedding 4_-_Validating_RFM_Check_your_answers_page_for_UPE/NFM_journey_Responses.png [image/png 246527 bytes]
18:23:24.697 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:23:24.701 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:23:24.704 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:23:24.705 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:23:24.708 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:23:24.710 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:23:24.714 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:23:24.714 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:23:24.715 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:23:24.716 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:23:24.717 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account # src/test/resources/features/RFMnfmNoIDFlow.feature:267
  Given Organisation User logs in with rfm URL to Pillar2                                            # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XMPLR0123456789                                                   # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                 # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                               # UPEPageSteps.scala:332
  When I click on Continue button                                                                    # StepDef.scala:185
  When I select corp position as NFM                                                                 # RFMPagesStepDef.scala:295
  When I click on Continue button                                                                    # StepDef.scala:185
  And I select option No and continue to next                                                        # StepDef.scala:527
  When I provide RFM New NFM Name as Test CYA                                                        # RFMPagesStepDef.scala:79
  When I enter Address as:                                                                           # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  And I click on Continue button                                                                     # StepDef.scala:185
  And I click on Continue button                                                                     # StepDef.scala:185
  When I provide RFM contact name as RFM test contact                                                # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                  # RFMPagesStepDef.scala:79
  And I select option No and continue to next                                                        # StepDef.scala:527
  And I select option No and continue to next                                                        # StepDef.scala:527
  When I enter Address as:                                                                           # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should navigate to RFM Final Review Page                                                    # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                                     # StepDef.scala:185
  Then I should be redirect to RFM processing page                                                   # EligibilityQuestionSteps.scala:153
  And I should see Report Pillar 2 Top-up Taxes text is not clickable                                # RFMPagesStepDef.scala:363
  And I should be on RFM Confirmation Page                                                           # EligibilityQuestionSteps.scala:128
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                         # StepDef.scala:572
  And I can see Print this page link                                                                 # StepDef.scala:616
  When I click report and manage your group's Pillar 2 Top-up Taxes link                             # StepDef.scala:523
  Then I should be on Dashboard page                                                                 # EligibilityQuestionSteps.scala:128
18:23:33.945 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
18:23:33.946 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
18:23:33.947 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
18:23:33.948 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
18:23:33.949 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
18:23:33.949 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
18:23:33.951 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
18:23:33.951 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
18:23:33.951 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
18:23:33.952 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
18:23:33.952 [pool-6-thread-2] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 6 - Verify that UPE can replace existing FM on the Pillar 2 account                                                      # src/test/resources/features/RFMnfmNoIDFlow.feature:310
  Given Organisation User logs in with rfm URL to Pillar2                                                                          # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XMPLR0123456789                                                                                 # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                                               # RFMPagesStepDef.scala:373
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                                                             # UPEPageSteps.scala:332
  And I click on Continue button                                                                                                   # StepDef.scala:185
  When I select corp position as UPE                                                                                               # RFMPagesStepDef.scala:295
  When I click on Continue button                                                                                                  # StepDef.scala:185
  When I provide RFM contact name as RFM test contact                                                                              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                                                # RFMPagesStepDef.scala:79
  And I select option Yes and continue to next                                                                                     # StepDef.scala:527
  When I provide RFM contact number as 01632960001                                                                                 # RFMPagesStepDef.scala:79
  And I select option Yes and continue to next                                                                                     # StepDef.scala:527
  And I click on Continue button                                                                                                   # StepDef.scala:185
  Then I should see an error message Enter name of the person or team we should contact on the RFM second contact name Page        # RFMPagesStepDef.scala:125
  When I provide RFM contact name as RFM second test contact                                                                       # RFMPagesStepDef.scala:79
  When I click on Continue button                                                                                                  # StepDef.scala:185
  Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page # RFMPagesStepDef.scala:125
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: .govuk-error-message (tried for 15 second(s) with 500 milliseconds interval)
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:66)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$7(RFMPagesStepDef.scala:209)
  at ✽.I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:331)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".govuk-error-message"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02ff911b8db3c0985c75629b6c1b6436, findElement {value=.govuk-error-message, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54578}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:54578/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02ff911b8db3c0985c75629b6c1b6436
  at jdk.internal.reflect.GeneratedConstructorAccessor20.newInstance(Unknown Source)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  at org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)
  at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:215)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)
  at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:544)
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:66)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$7(RFMPagesStepDef.scala:209)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$3.applyOrElse(StepDsl.scala:71)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$3.applyOrElse(StepDsl.scala:69)
  at scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:35)
  at io.cucumber.scala.ScalaStepDefinition.$anonfun$execute$1(ScalaStepDefinition.scala:31)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
  at scala.util.Try$.apply(Try.scala:217)
  at io.cucumber.scala.AbstractGlueDefinition.executeAsCucumber(AbstractGlueDefinition.scala:36)
  at io.cucumber.scala.AbstractGlueDefinition.executeAsCucumber$(AbstractGlueDefinition.scala:35)
  at io.cucumber.scala.ScalaScenarioScopedStepDefinition.executeAsCucumber(ScalaStepDefinition.scala:59)
  at io.cucumber.scala.ScalaStepDefinition.execute(ScalaStepDefinition.scala:30)
  at io.cucumber.scala.ScalaStepDefinition.execute$(ScalaStepDefinition.scala:29)
  at io.cucumber.scala.ScalaScenarioScopedStepDefinition.execute(ScalaStepDefinition.scala:59)
  at io.cucumber.core.runner.CoreStepDefinition.execute(CoreStepDefinition.java:66)
  at io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)
  at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
  at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:84)
  at io.cucumber.core.runner.TestStep.run(TestStep.java:56)
  at io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:51)
  at io.cucumber.core.runner.TestCase.run(TestCase.java:84)
  at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
  at io.cucumber.junit.PickleRunners$NoStepDescriptions.lambda$run$0(PickleRunners.java:151)
  at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:137)
  at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
  at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:137)
  at io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:148)
  at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:144)
  at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:28)
  at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
  at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
  at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
  at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
  at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
  at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
  at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
  at io.cucumber.junit.FeatureRunner.run(FeatureRunner.java:137)
  at io.cucumber.junit.Cucumber.runChild(Cucumber.java:196)
  at io.cucumber.junit.Cucumber.runChild(Cucumber.java:89)
  at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
  at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
  at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
  at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
  at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
  at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runFeatures$6(CucumberExecutionContext.java:148)
  at io.cucumber.core.runtime.CucumberExecutionContext.execute(CucumberExecutionContext.java:163)
  at io.cucumber.core.runtime.CucumberExecutionContext.runFeatures(CucumberExecutionContext.java:146)
  at io.cucumber.junit.Cucumber$StartAndFinishTestRun.evaluate(Cucumber.java:226)
  at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
  at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
  at org.junit.runners.Suite.runChild(Suite.java:128)
  at org.junit.runners.Suite.runChild(Suite.java:27)
  at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
  at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
  at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
  at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
  at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
  at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
  at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
  at com.novocode.junit.JUnitRunner$1.execute(JUnitRunner.java:132)
  at sbt.TestRunner.runTest$1(TestFramework.scala:153)
  at sbt.TestRunner.run(TestFramework.scala:168)
  at sbt.TestFramework$$anon$3$$anonfun$$lessinit$greater$1.$anonfun$apply$1(TestFramework.scala:336)
  at sbt.TestFramework$.sbt$TestFramework$$withContextLoader(TestFramework.scala:296)
  at sbt.TestFramework$$anon$3$$anonfun$$lessinit$greater$1.apply(TestFramework.scala:336)
  at sbt.TestFramework$$anon$3$$anonfun$$lessinit$greater$1.apply(TestFramework.scala:336)
  at sbt.TestFunction.apply(TestFramework.scala:348)
  at sbt.Tests$.processRunnable$1(Tests.scala:475)
  at sbt.Tests$.$anonfun$makeSerial$1(Tests.scala:481)
  at sbt.std.Transform$$anon$3.$anonfun$apply$2(Transform.scala:47)
  at sbt.std.Transform$$anon$4.work(Transform.scala:69)
  at sbt.Execute.$anonfun$submit$2(Execute.scala:283)
  at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:24)
  at sbt.Execute.work(Execute.scala:292)
  at sbt.Execute.$anonfun$submit$1(Execute.scala:283)
  at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
  at sbt.CompletionService$$anon$2.call(CompletionService.scala:65)
  at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
  at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
  at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
  at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
  at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
  at java.base/java.lang.Thread.run(Thread.java:829)

  When I provide RFM contact email as rfmsecondcontact@email.com                                                                   # RFMPagesStepDef.scala:79
  Then I click on Continue button                                                                                                  # StepDef.scala:185
  Then I should see an error message Select yes if we can contact RFM second test contact by phone on the RFM input telephone Page # RFMPagesStepDef.scala:125
  When I select option Yes and continue to next                                                                                    # StepDef.scala:527
  When I provide RFM second contact number as 09872960001                                                                          # RFMPagesStepDef.scala:79
  When I enter Address as:                                                                                                         # EligibilityQuestionSteps.scala:79
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  And I should see the row 1 value Ultimate Parent Entity (UPE)                                                                    # RFMPagesStepDef.scala:325
  When I click on change link for Contact Name                                                                                     # ChangeYourAnswersPageSteps.scala:97
  When I enter Contact Name as 400                                                                                                 # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                   # StepDef.scala:185
  Then I should be redirected to "RFM processing page" or "Amend API error Page for RFM"                                           # RFMPagesStepDef.scala:379
  When I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link                                  # StepDef.scala:523
  Then I should navigate to RFM Final Review Page                                                                                  # EligibilityQuestionSteps.scala:53
  When I click on change link for Contact Name                                                                                     # ChangeYourAnswersPageSteps.scala:97
  When I enter Contact Name as test name                                                                                           # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                   # StepDef.scala:185
  And I should navigate to RFM Confirmation Page                                                                                   # EligibilityQuestionSteps.scala:53
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                                                       # StepDef.scala:572
  And I can see Print this page link                                                                                               # StepDef.scala:616
  When I click report and manage your group's Pillar 2 Top-up Taxes link                                                           # StepDef.scala:523
  Then I should be on Dashboard page                                                                                               # EligibilityQuestionSteps.scala:128

    Embedding 6_-_Verify_that_UPE_can_replace_existing_FM_on_the_Pillar_2_account.png [image/png 223364 bytes]
[error] Test RFM CYA - NFM No ID flow.3 - Validating RFM Check your answers page navigations failed: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/review-submit/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/error/cannot-return" (tried for 15 second(s) with 500 milliseconds interval)
[error] Build info: version: '4.33.0', revision: '2c6aaad03a'
[error] System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
[error] Driver info: org.openqa.selenium.chrome.ChromeDriver
[error] Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54578}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:54578/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
[error] Session ID: 02ff911b8db3c0985c75629b6c1b6436, took 20.087 sec
[error]     at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
[error]     at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
[error]     at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:56)
[error]     at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:52)
[error]     at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:75)
[error]     at ✽.I should navigate to RFM Final Review Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:152)
[error] Test RFM CYA - NFM No ID flow.4 - Validating RFM Check your answers page for UPE/NFM journey Responses failed: java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0, took 21.933 sec
[error]     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
[error]     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
[error]     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
[error]     at java.util.Objects.checkIndex(Objects.java:372)
[error]     at java.util.ArrayList.get(ArrayList.java:459)
[error]     at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$2(ChangeYourAnswersPageSteps.scala:34)
[error]     at ✽.I should see row 1 value Ultimate Parent Entity (UPE)(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:237)
[error] Test RFM CYA - NFM No ID flow.6 - Verify that UPE can replace existing FM on the Pillar 2 account failed: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: .govuk-error-message (tried for 15 second(s) with 500 milliseconds interval), took 21.059 sec
[error]     at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
[error]     at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
[error]     at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:66)
[error]     at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$7(RFMPagesStepDef.scala:209)
[error]     at ✽.I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:331)
[error] Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".govuk-error-message"}
[error]   (Session info: chrome=136.0.7103.113)
[error] For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
[error] Build info: version: '4.33.0', revision: '2c6aaad03a'
[error] System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
[error] Driver info: org.openqa.selenium.chrome.ChromeDriver
[error] Command: [02ff911b8db3c0985c75629b6c1b6436, findElement {value=.govuk-error-message, using=css selector}]
[error] Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54578}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:54578/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
[error] Session ID: 02ff911b8db3c0985c75629b6c1b6436
[error]     at jdk.internal.reflect.GeneratedConstructorAccessor20.newInstance(Unknown Source)
[error]     at jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
[error]     at java.lang.reflect.Constructor.newInstance(Constructor.java:490)
[error]     at org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)
[error]     at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)
[error]     at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)
[error]     at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:215)
[error]     at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)
[error]     at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)
[error]     at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:544)
[error]     at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
[error]     at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
[error]     at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
[error]     at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
[error]     at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
[error]     at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
[error]     at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
[error]     at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:66)
[error]     at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$7(RFMPagesStepDef.scala:209)
[error]     at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$3.applyOrElse(StepDsl.scala:71)
[error]     at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$3.applyOrElse(StepDsl.scala:69)
[error]     at scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:35)
[error]     at io.cucumber.scala.ScalaStepDefinition.$anonfun$execute$1(ScalaStepDefinition.scala:31)
[error]     at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
[error]     at scala.util.Try$.apply(Try.scala:217)
[error]     at io.cucumber.scala.AbstractGlueDefinition.executeAsCucumber(AbstractGlueDefinition.scala:36)
[error]     at io.cucumber.scala.AbstractGlueDefinition.executeAsCucumber$(AbstractGlueDefinition.scala:35)
[error]     at io.cucumber.scala.ScalaScenarioScopedStepDefinition.executeAsCucumber(ScalaStepDefinition.scala:59)
[error]     at io.cucumber.scala.ScalaStepDefinition.execute(ScalaStepDefinition.scala:30)
[error]     at io.cucumber.scala.ScalaStepDefinition.execute$(ScalaStepDefinition.scala:29)
[error]     at io.cucumber.scala.ScalaScenarioScopedStepDefinition.execute(ScalaStepDefinition.scala:59)
[error]     at io.cucumber.core.runner.CoreStepDefinition.execute(CoreStepDefinition.java:66)
[error]     at io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)
[error]     at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
[error]     at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:84)
[error]     at io.cucumber.core.runner.TestStep.run(TestStep.java:56)
[error]     at io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:51)
[error]     at io.cucumber.core.runner.TestCase.run(TestCase.java:84)
[error]     at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
[error]     at io.cucumber.junit.PickleRunners$NoStepDescriptions.lambda$run$0(PickleRunners.java:151)
[error]     at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:137)
[error]     at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
[error]     at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:137)
[error]     at io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:148)
[error]     at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:144)
[error]     at io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:28)
[error]     ...
[error] Failed: Total 6, Failed 3, Errors 0, Passed 3
[error] Failed tests:
[error]   uk.gov.hmrc.test.ui.cucumber.runner.Runner
[error] (Test / testOnly) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 100 s (0:01:40.0), completed Aug 10, 2025, 6:23:55 PM
olkuy@JGPXV3N213 pillar2-acceptance-tests % 
