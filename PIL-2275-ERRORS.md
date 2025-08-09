07:35:57.967 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
07:35:57.973 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
07:35:57.973 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
07:35:57.974 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
07:35:57.974 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
07:35:57.975 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
07:35:57.977 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
07:35:57.978 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
07:35:57.978 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
07:35:57.978 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
07:35:57.978 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey # src/test/resources/features/RFMSecurity&ErrorValidations.feature:7
  Given Organisation User logs in without Pillar2 enrolment                                                                    # StepDef.scala:62
  And I access RFM start page                                                                                                  # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                                               # StepDef.scala:185
  When I provide RFM pillar2 id as XEPLR0123456400                                                                             # RFMPagesStepDef.scala:79
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XEPLR0123456400(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:11)

  When I enter registration date as:                                                                                           # RFMPagesStepDef.scala:343
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  And I click on Continue button                                                                                               # StepDef.scala:185
  Then I should navigate to RFM journey recovery page                                                                          # EligibilityQuestionSteps.scala:53
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:333
  And I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link                               # StepDef.scala:523
  Then I should be on RFM start page                                                                                           # EligibilityQuestionSteps.scala:85
  And I click on Continue button                                                                                               # StepDef.scala:185
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:333
  And I provide RFM pillar2 id as XEPLR0123456222                                                                              # RFMPagesStepDef.scala:79
  Then I should be on RFM Registration Date Page                                                                               # EligibilityQuestionSteps.scala:85
  When Registration Day is entered as 27                                                                                       # RFMPagesStepDef.scala:221
  And I click on Continue button                                                                                               # StepDef.scala:185
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:333
  And I click on Continue button                                                                                               # StepDef.scala:185
  Then I should navigate to RFM No record Match Error Page                                                                     # EligibilityQuestionSteps.scala:53
  And I select back link                                                                                                       # EligibilityQuestionSteps.scala:38
  Then I should be on RFM CYA Page                                                                                             # EligibilityQuestionSteps.scala:85
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:333
  When I click change link for RFM Pillar 2 Top-up Taxes ID                                                                    # RFMPagesStepDef.scala:263
  And I provide RFM pillar2 id as XEPLR0123456404                                                                              # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                               # StepDef.scala:185
  Then I should navigate to RFM No record Match Error Page                                                                     # EligibilityQuestionSteps.scala:53
  And I click go back to try again using different details. link                                                               # StepDef.scala:523
  Then I should be on RFM enter pillar2 id page                                                                                # EligibilityQuestionSteps.scala:85
  And I provide RFM pillar2 id as XMPLR0123456111                                                                              # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                               # StepDef.scala:185
  And I should see row 1 value XMPLR0123456111                                                                                 # ChangeYourAnswersPageSteps.scala:32
  And I click Sign out link                                                                                                    # StepDef.scala:523

    Embedding 1_-_Verify_Journey_recovery_page_and_error_handling_on_submission_of_Pillar_id_and_registration_date_for_RFM_journey.png [image/png 195621 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XEPLR0123456400(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:11)



07:36:45.355 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
07:36:45.355 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
07:36:45.356 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
07:36:45.356 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
07:36:45.356 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
07:36:45.356 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
07:36:45.357 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
07:36:45.357 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
07:36:45.358 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
07:36:45.358 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
07:36:45.358 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch2
Scenario: 4 - Verify Security questions are not pre populated for RFM journey    # src/test/resources/features/RFMSecurity&ErrorValidations.feature:134
  Given Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2 # RFMPagesStepDef.scala:300
  Then I should be on RFM enter pillar2 id page                                  # EligibilityQuestionSteps.scala:85
  When I provide RFM pillar2 id as XMPLR0123456789                               # RFMPagesStepDef.scala:79
  When I enter registration date as:                                             # RFMPagesStepDef.scala:343
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                           # UPEPageSteps.scala:331
  Then I should be on RFM Saving Progress Page                                   # EligibilityQuestionSteps.scala:85
  When I select back link                                                        # EligibilityQuestionSteps.scala:38
  Then I should be on RFM CYA Page                                               # EligibilityQuestionSteps.scala:85
  When I click on Continue button                                                # StepDef.scala:185
  Then I access RFM corporate position page                                      # RFMPagesStepDef.scala:42
  When I select corp position as UPE                                             # RFMPagesStepDef.scala:287
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_0 (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:289)
  at ✽.I select corp position as UPE(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:149)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_0"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [69d6dc66844653cb7eafd1e4e795ce58, findElement {value=value_0, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58
  at jdk.internal.reflect.GeneratedConstructorAccessor22.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:289)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:287)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$2.applyOrElse(StepDsl.scala:60)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$2.applyOrElse(StepDsl.scala:58)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

  Then I should be on RFM Contact Guidance page                                  # EligibilityQuestionSteps.scala:85
  When I click on Continue button                                                # StepDef.scala:185
  And I provide RFM contact name as RFM test contact                             # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                              # RFMPagesStepDef.scala:79
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable           # RFMPagesStepDef.scala:333
  And I click Sign out link                                                      # StepDef.scala:523
  And Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2   # RFMPagesStepDef.scala:300
  Then I access RFM start page                                                   # RFMPagesStepDef.scala:42
  And I click on Continue button                                                 # StepDef.scala:185
  Then I should be on RFM enter pillar2 id page                                  # EligibilityQuestionSteps.scala:85
  And The caption must be Replace filing member                                  # StepDef.scala:513
  And The Heading should be Enter the group’s Pillar 2 Top-up Taxes ID           # StepDef.scala:146
  And I should see RFM Pillar2 Id field as blank                                 # RFMPagesStepDef.scala:307
  Then I provide RFM pillar2 id as XMPLR0123456789                               # RFMPagesStepDef.scala:79
  Then I should be on RFM Registration Date Page                                 # EligibilityQuestionSteps.scala:85
  And I should see RFM Registration Day field as blank                           # RFMPagesStepDef.scala:307
  And I should see RFM Registration Month field as blank                         # RFMPagesStepDef.scala:307
  And I should see RFM Registration Year field as blank                          # RFMPagesStepDef.scala:307
  When I enter registration date as:                                             # RFMPagesStepDef.scala:343
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                           # UPEPageSteps.scala:331
  Then I should be on RFM Saving Progress Page                                   # EligibilityQuestionSteps.scala:85
  When I click on Continue button                                                # StepDef.scala:185
  Then I access RFM corporate position page                                      # RFMPagesStepDef.scala:42
  And I should see the corporate position UPE remain selected                    # RFMPagesStepDef.scala:75

    Embedding 4_-_Verify_Security_questions_are_not_pre_populated_for_RFM_journey.png [image/png 212684 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_0 (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:289)
  at ✽.I select corp position as UPE(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:149)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_0"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [69d6dc66844653cb7eafd1e4e795ce58, findElement {value=value_0, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58
  at jdk.internal.reflect.GeneratedConstructorAccessor22.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:289)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:287)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$2.applyOrElse(StepDsl.scala:60)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$2.applyOrElse(StepDsl.scala:58)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)



07:39:11.224 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
07:39:11.228 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
07:39:11.229 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
07:39:11.230 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
07:39:11.230 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
07:39:11.231 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
07:39:11.232 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
07:39:11.232 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
07:39:11.232 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
07:39:11.232 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
07:39:11.232 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account # src/test/resources/features/RFMnfmNoIDFlow.feature:273
  Given Organisation User logs in without Pillar2 enrolment                                          # StepDef.scala:62
  And I access RFM start page                                                                        # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                     # StepDef.scala:185
  When I provide RFM pillar2 id as XMPLR0123456789                                                   # RFMPagesStepDef.scala:79
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:277)

  When I enter registration date as:                                                                 # RFMPagesStepDef.scala:343
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                               # UPEPageSteps.scala:331
  When I click on Continue button                                                                    # StepDef.scala:185
  When I select corp position as NFM                                                                 # RFMPagesStepDef.scala:287
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
  Then I should be redirect to RFM processing page                                                   # EligibilityQuestionSteps.scala:110
  And I should see Report Pillar 2 Top-up Taxes text is not clickable                                # RFMPagesStepDef.scala:333
  And I should be on RFM Confirmation Page                                                           # EligibilityQuestionSteps.scala:85
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                         # StepDef.scala:566
  And I can see Print this page link                                                                 # StepDef.scala:610
  When I click report and manage your group's Pillar 2 Top-up Taxes link                             # StepDef.scala:523
  Then I should be on Dashboard page                                                                 # EligibilityQuestionSteps.scala:85

    Embedding 5_-_Verify_that_New_NFM_can_replace_existing_FM_through_NO_ID_flow_on_the_Pillar_2_account.png [image/png 195621 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58121}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:58121/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 69d6dc66844653cb7eafd1e4e795ce58

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:56)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:277)



07:42:45.573 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
07:42:45.574 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
07:42:45.574 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
07:42:45.574 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
07:42:45.575 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
07:42:45.576 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
07:42:45.576 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
07:42:45.577 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
07:42:45.577 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
07:42:45.577 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
07:42:45.577 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 4 - Verify the link on page can't be found page                                                                    # src/test/resources/features/SubscriptionAndErrorValidations.feature:175
  Given Organisation User logs in without Pillar2 enrolment                                                                  # StepDef.scala:62
  And I access random page                                                                                                   # StepDef.scala:606
  And The Heading should be This page can’t be found                                                                         # StepDef.scala:146
      org.scalatest.exceptions.TestFailedException: "Is the Ultimate Parent Entity registered in the UK?" did not include substring "This page can’t be found"
  at org.scalatest.matchers.MatchersHelper$.indicateFailure(MatchersHelper.scala:392)
  at org.scalatest.matchers.should.Matchers$ShouldMethodHelperClass.shouldMatcher(Matchers.scala:7304)
  at org.scalatest.matchers.should.Matchers$AnyShouldWrapper.should(Matchers.scala:7347)
  at uk.gov.hmrc.test.ui.cucumber.Check$.checkH1(Check.scala:27)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$18(StepDef.scala:156)
  at ✽.The Heading should be This page can’t be found(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/SubscriptionAndErrorValidations.feature:178)

  And The Body content should be Please check that you have entered the correct web address.                                 # StepDef.scala:170
  And The Body content should be You must return to your Pillar 2 Top-up Taxes registration and complete the required tasks. # StepDef.scala:170
  Then I click return to your Pillar 2 Top-up Taxes registration link                                                        # StepDef.scala:523
  Then I should see task list sections                                                                                       # TaskListPageSteps.scala:27
  And The Task Add Ultimate Parent Entity details status should be Not started                                               # TaskListPageSteps.scala:58

    Embedding 4_-_Verify_the_link_on_page_can't_be_found_page.png [image/png 188779 bytes]


org.scalatest.exceptions.TestFailedException: "Is the Ultimate Parent Entity registered in the UK?" did not include substring "This page can’t be found"

  at org.scalatest.matchers.MatchersHelper$.indicateFailure(MatchersHelper.scala:392)
  at org.scalatest.matchers.should.Matchers$ShouldMethodHelperClass.shouldMatcher(Matchers.scala:7304)
  at org.scalatest.matchers.should.Matchers$AnyShouldWrapper.should(Matchers.scala:7347)
  at uk.gov.hmrc.test.ui.cucumber.Check$.checkH1(Check.scala:27)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$18(StepDef.scala:156)
  at ✽.The Heading should be This page can’t be found(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/SubscriptionAndErrorValidations.feature:178)

