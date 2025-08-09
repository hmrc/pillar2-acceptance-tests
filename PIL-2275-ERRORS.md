13:19:44.056 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
13:19:44.058 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
13:19:44.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
13:19:44.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
13:19:44.060 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
13:19:44.062 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
13:19:44.063 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
13:19:44.063 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
13:19:44.063 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
13:19:44.063 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
13:19:44.063 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 6 - Organisation User navigates to error page when repayment submission API fails to submit data to ETMP           # src/test/resources/features/RepaymentJourneys.feature:266
  Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service # StepDef.scala:580
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:85
  When I click Request a repayment link                                                                                      # StepDef.scala:523
  Then I should navigate to Repayment Guidance Page                                                                          # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                            # StepDef.scala:185
  Then I should navigate to Repayment Amount Page                                                                            # EligibilityQuestionSteps.scala:53
  When I provide Refund Amount as 100.00                                                                                     # PaymentSteps.scala:276
  And I provide value for Refund Reason as Test Refund                                                                       # PaymentSteps.scala:136
  And I click on Continue button                                                                                             # StepDef.scala:185
  And I access Repayment CYA page                                                                                            # PaymentSteps.scala:355
  Then I should be on Repayment CYA Page                                                                                     # EligibilityQuestionSteps.scala:85
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/repayment/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/repayment/method" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: f48d359bde971f8f0e72d2d0c39d64a9
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:97)
  at ✽.I should be on Repayment CYA Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RepaymentJourneys.feature:277)

  When I click Continue button                                                                                               # StepDef.scala:182
  Then I should be on Repayment Incomplete Error Page                                                                        # EligibilityQuestionSteps.scala:85
  When I click Report Pillar 2 Top-up Taxes link                                                                             # StepDef.scala:523
  Then I should navigate to Dashboard page                                                                                   # EligibilityQuestionSteps.scala:53
  When I click the browser back button                                                                                       # StepDef.scala:543
  Then I should be on Repayment Incomplete Error Page                                                                        # EligibilityQuestionSteps.scala:85
  When I select back link                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should be on Repayment CYA Page                                                                                     # EligibilityQuestionSteps.scala:85
  When I click Continue button                                                                                               # StepDef.scala:182
  Then I should be on Repayment Incomplete Error Page                                                                        # EligibilityQuestionSteps.scala:85
  When I click go back and complete all the required answers link                                                            # StepDef.scala:523
  Then I should navigate to Repayment Guidance Page                                                                          # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                            # StepDef.scala:185
  And I click on Continue button                                                                                             # StepDef.scala:185
  Then I should navigate to Agent Repayment Reason Page                                                                      # EligibilityQuestionSteps.scala:53

    Embedding 6_-_Organisation_User_navigates_to_error_page_when_repayment_submission_API_fails_to_submit_data_to_ETMP.png [image/png 192361 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/repayment/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/repayment/method" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: f48d359bde971f8f0e72d2d0c39d64a9

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:97)
  at ✽.I should be on Repayment CYA Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RepaymentJourneys.feature:277)



13:20:03.057 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
13:20:03.058 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
13:20:03.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
13:20:03.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
13:20:03.060 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
13:20:03.060 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
13:20:03.061 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
13:20:03.061 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
13:20:03.061 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
13:20:03.061 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
13:20:03.062 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 7 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP        # src/test/resources/features/RepaymentJourneys.feature:295
  Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service   # StepDef.scala:580
  And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service # StepDef.scala:588
  Then I should be on ASA Pillar2 Input Page                                                                       # EligibilityQuestionSteps.scala:85
  And I provide ASA Pillar2 ID as XMPLR0012345674                                                                  # ASAStepDef.scala:38
  And I click on Continue button                                                                                   # StepDef.scala:185
  Then I should navigate to ASA Confirmation Page                                                                  # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                                                   # StepDef.scala:185
  Then I should navigate to ASA Dashboard page                                                                     # EligibilityQuestionSteps.scala:53
  When I click Request a repayment link                                                                            # StepDef.scala:523
  Then I should navigate to Repayment Guidance Page                                                                # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                  # StepDef.scala:185
  Then I should navigate to Repayment Amount Page                                                                  # EligibilityQuestionSteps.scala:53
  When I provide Refund Amount as 100.00                                                                           # PaymentSteps.scala:276
  And I provide value for Refund Reason as Test Refund                                                             # PaymentSteps.scala:136
  And I click on Continue button                                                                                   # StepDef.scala:185
  And I access Repayment CYA page                                                                                  # PaymentSteps.scala:355
  Then I should be on Repayment CYA Page                                                                           # EligibilityQuestionSteps.scala:85
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/repayment/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/repayment/method" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: f48d359bde971f8f0e72d2d0c39d64a9
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:97)
  at ✽.I should be on Repayment CYA Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RepaymentJourneys.feature:312)

  When I click Continue button                                                                                     # StepDef.scala:182
  Then I should be on Repayment Incomplete Error Page                                                              # EligibilityQuestionSteps.scala:85
  When I click Report Pillar 2 Top-up Taxes link                                                                   # StepDef.scala:523
  Then I should navigate to ASA Dashboard page                                                                     # EligibilityQuestionSteps.scala:53
  When I click the browser back button                                                                             # StepDef.scala:543
  Then I should be on Repayment Incomplete Error Page                                                              # EligibilityQuestionSteps.scala:85
  When I select back link                                                                                          # EligibilityQuestionSteps.scala:38
  Then I should be on Repayment CYA Page                                                                           # EligibilityQuestionSteps.scala:85
  When I click Continue button                                                                                     # StepDef.scala:182
  Then I should be on Repayment Incomplete Error Page                                                              # EligibilityQuestionSteps.scala:85
  When I click go back and complete all the required answers link                                                  # StepDef.scala:523
  Then I should navigate to Repayment Guidance Page                                                                # EligibilityQuestionSteps.scala:53

    Embedding 7_-_Agent_User_navigates_to_error_page_when_repayment_submission_API_fails_to_submit_data_to_ETMP.png [image/png 192479 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/repayment/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/repayment/method" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: f48d359bde971f8f0e72d2d0c39d64a9

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:97)
  at ✽.I should be on Repayment CYA Page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RepaymentJourneys.feature:312)


13:14:41.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
13:14:41.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
13:14:41.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
13:14:41.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
13:14:41.655 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
13:14:41.655 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
13:14:41.656 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
13:14:41.660 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
13:14:41.660 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
13:14:41.660 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
13:14:41.661 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch1
Scenario: 1 - User navigates to next eligibility question page by selecting yes option # src/test/resources/features/EligiblityQuestionsPage.feature:7
  Given I clear the cache                                                              # StepDef.scala:143
  Given I am on UPE EQ Page                                                            # StepDef.scala:236
  When I continue without selecting an option                                          # EligibilityQuestionSteps.scala:101
  When I choose Yes and continue                                                       # EligibilityQuestionSteps.scala:28
  Then I should navigate to business EQ page                                           # EligibilityQuestionSteps.scala:53
  When I choose Yes and continue                                                       # EligibilityQuestionSteps.scala:28
  Then I should navigate to Global gross revenue                                       # EligibilityQuestionSteps.scala:53
  When I continue without selecting an option                                          # EligibilityQuestionSteps.scala:101
  When I choose Yes and continue                                                       # EligibilityQuestionSteps.scala:28
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [f48d359bde971f8f0e72d2d0c39d64a9, clickElement {id=f.88CE7C6AE0F50AD34C74D4FBFA9E675E.d.675DCD59C3D043AAB9C39AE766F612CC.e.159}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (f48d359bde971f8f0e72d2d0c39d64a9)] -> id: value_0]
Session ID: f48d359bde971f8f0e72d2d0c39d64a9
  at jdk.internal.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  at org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)
  at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:215)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)
  at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:544)
  at org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:223)
  at org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:76)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$1(EligibilityQuestionSteps.scala:30)
  at ✽.I choose Yes and continue(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/EligiblityQuestionsPage.feature:16)

  Then I should navigate to confirmation page                                          # EligibilityQuestionSteps.scala:53
  When I click Report Pillar 2 Top-up Taxes link                                       # StepDef.scala:523
  Then I should navigate to guidance page                                              # EligibilityQuestionSteps.scala:53
  When I click the browser back button                                                 # StepDef.scala:543
  Then I should be on confirmation page                                                # EligibilityQuestionSteps.scala:85
  When I continue                                                                      # EligibilityQuestionSteps.scala:101
  Then I should be on auth-login page                                                  # EligibilityQuestionSteps.scala:85

    Embedding 1_-_User_navigates_to_next_eligibility_question_page_by_selecting_yes_option.png [image/png 231978 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [f48d359bde971f8f0e72d2d0c39d64a9, clickElement {id=f.88CE7C6AE0F50AD34C74D4FBFA9E675E.d.675DCD59C3D043AAB9C39AE766F612CC.e.159}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51526}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:51526/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (f48d359bde971f8f0e72d2d0c39d64a9)] -> id: value_0]
Session ID: f48d359bde971f8f0e72d2d0c39d64a9

  at jdk.internal.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  at org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)
  at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)
  at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:215)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)
  at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)
  at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:544)
  at org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:223)
  at org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:76)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$1(EligibilityQuestionSteps.scala:30)
  at ✽.I choose Yes and continue(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/EligiblityQuestionsPage.feature:16)

