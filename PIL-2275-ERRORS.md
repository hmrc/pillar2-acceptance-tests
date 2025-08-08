11:03:39.208 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:03:39.209 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:03:39.209 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:03:39.210 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:03:39.210 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:03:39.210 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:03:39.211 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:03:39.211 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:03:39.212 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:03:39.212 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:03:39.212 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 1 - Create a new subscription with UPE NoID Flow and NFM No Id flow to validate Contact Details                                                                                    # src/test/resources/features/ContactDetailsAndRegistration.feature:7
  Given Organisation User logs in as upe with credId ContactDetails for Pillar2                                                                                                              # StepDef.scala:69
  Then I should be on UPE business page                                                                                                                                                      # EligibilityQuestionSteps.scala:64
  When I select option No and continue to next                                                                                                                                               # StepDef.scala:518
  Then I should navigate to input-upe-name page                                                                                                                                              # EligibilityQuestionSteps.scala:53
  When I enter UPE name as Test                                                                                                                                                              # UPEPageSteps.scala:26
  When I enter Address as:                                                                                                                                                                   # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                |
    | addressLine1 | Address Line 1       |
    | addressLine3 | City                 |
    | postalCode   | EH5 5WY              |
    | countryCode  | United Arab Emirates |
  When I enter UPE Person/Team name as UPE Test                                                                                                                                              # UPEPageSteps.scala:26
  When I enter UPE Email address as test&upe@email.com                                                                                                                                       # UPEPageSteps.scala:26
  When I select option Yes and continue to next                                                                                                                                              # StepDef.scala:518
  And I enter Telephone Number as 123456                                                                                                                                                     # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                                                                             # StepDef.scala:176
  When I click Add filing member details link                                                                                                                                                # StepDef.scala:514
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Add filing member details (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Add filing member details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:24)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Add filing member details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Add filing member details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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

  When I select No option and continue to next                                                                                                                                               # StepDef.scala:526
  When I click Add further group details link                                                                                                                                                # StepDef.scala:514
  When I select option In the UK and outside the UK in further details group status page                                                                                                     # UPEPageSteps.scala:290
  When I enter account period as:                                                                                                                                                            # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE   |
    | startDate.day   | 15      |
    | startDate.month | jan     |
    | startDate.year  | 2024    |
    | endDate.day     | 15      |
    | endDate.month   | january |
    | endDate.year    | 2025    |
  And I click on Continue button                                                                                                                                                             # StepDef.scala:176
  Then The Task Add contact details status should be Not started                                                                                                                             # TaskListPageSteps.scala:58
  When I click Add contact details link                                                                                                                                                      # StepDef.scala:514
  Then I should navigate to Contact details guidance page                                                                                                                                    # EligibilityQuestionSteps.scala:53
  And The caption must be Contact details                                                                                                                                                    # StepDef.scala:504
  And The Heading should be We need contact details for the filing member                                                                                                                    # StepDef.scala:146
  And The Body content should be We need the contact details for the filing member of this group so we can contact the right person or team when about compliance for Pillar 2 Top-up Taxes. # StepDef.scala:161
  And The Body content should be These may be different to any contact details you have already provided during this registration.                                                           # StepDef.scala:161
  When I click on Continue button                                                                                                                                                            # StepDef.scala:176
  Then I should navigate to Contact details display page                                                                                                                                     # EligibilityQuestionSteps.scala:53
  And The Heading should be Saved contact                                                                                                                                                    # StepDef.scala:146
  And I should see the contact details row 1 as UPE Test on use contact page                                                                                                                 # StepDef.scala:538
  And I should see the contact details row 2 as test&upe@email.com on use contact page                                                                                                       # StepDef.scala:538
  And I should see the contact details row 3 as 123456 on use contact page                                                                                                                   # StepDef.scala:538
  When I select option No and continue to next                                                                                                                                               # StepDef.scala:518
  Then I should navigate to Contact details input name page                                                                                                                                  # EligibilityQuestionSteps.scala:53
  When I enter Contact Name as Contact Name Test                                                                                                                                             # UPEPageSteps.scala:26
  Then I should navigate to Contact details input email page                                                                                                                                 # EligibilityQuestionSteps.scala:53
  When I enter Contact Email as testContact@email.com                                                                                                                                        # UPEPageSteps.scala:26
  Then I should navigate to Contact details telephone page                                                                                                                                   # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                                                                                                               # StepDef.scala:518
  Then I should navigate to Second Contact details page                                                                                                                                      # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Contact details telephone page                                                                                                                                   # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                                                                                                                              # StepDef.scala:518
  Then I should navigate to Contact details input telephone page                                                                                                                             # EligibilityQuestionSteps.scala:53
  When I enter Contact Telephone as 1234554                                                                                                                                                  # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                                                                             # StepDef.scala:176
  Then I should navigate to Second Contact details page                                                                                                                                      # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                                                                                                               # StepDef.scala:518
  Then I should navigate to Contact address input page                                                                                                                                       # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Second Contact details page                                                                                                                                      # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                                                                                                                              # StepDef.scala:518
  Then I should navigate to Second Contact name page                                                                                                                                         # EligibilityQuestionSteps.scala:53
  When I enter Second Contact Name as Second Contact Name Test                                                                                                                               # UPEPageSteps.scala:26
  Then I should navigate to Second Contact email page                                                                                                                                        # EligibilityQuestionSteps.scala:53
  When I enter Second Contact Email as secondContact@email.com                                                                                                                               # UPEPageSteps.scala:26
  Then I should navigate to Second Contact number page                                                                                                                                       # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                                                                                                                              # StepDef.scala:518
  Then I should navigate to Second Contact Input page                                                                                                                                        # EligibilityQuestionSteps.scala:53
  When I enter Second Contact Input as 1234554                                                                                                                                               # UPEPageSteps.scala:26
  Then I should navigate to Contact address input page                                                                                                                                       # EligibilityQuestionSteps.scala:53
  When I enter Address as:                                                                                                                                                                   # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE          |
    | addressLine1 | Address Line 1 |
    | addressLine3 | City           |
    | postalCode   | EH5 5WY        |
    | countryCode  | United Kingdom |
  Then I should navigate to Contact details Check answers page                                                                                                                               # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should be on Contact address input page                                                                                                                                             # EligibilityQuestionSteps.scala:64
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should be on Second Contact Input page                                                                                                                                              # EligibilityQuestionSteps.scala:64
  And I should see the Second Contact Input field is pre-populated with 1234554                                                                                                              # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should be on Second Contact number page                                                                                                                                             # EligibilityQuestionSteps.scala:64
  And I should see the answer Yes remain selected                                                                                                                                            # UPEPageSteps.scala:204
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the Second Contact Email field is pre-populated with secondContact@email.com                                                                                              # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the Second Contact Name field is pre-populated with Second Contact Name Test                                                                                              # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Second Contact details page                                                                                                                                      # EligibilityQuestionSteps.scala:53
  And I should see the answer Yes remain selected                                                                                                                                            # UPEPageSteps.scala:204
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the Contact Telephone field is pre-populated with 1234554                                                                                                                 # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the answer Yes remain selected                                                                                                                                            # UPEPageSteps.scala:204
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the Contact Email field is pre-populated with testContact@email.com                                                                                                       # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  And I should see the Contact Name field is pre-populated with Contact Name Test                                                                                                            # UPEPageSteps.scala:212
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Contact details display page                                                                                                                                     # EligibilityQuestionSteps.scala:53
  And I should see the answer No remain selected                                                                                                                                             # UPEPageSteps.scala:204
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Contact details guidance page                                                                                                                                    # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                                                                                                    # EligibilityQuestionSteps.scala:38
  Then I should navigate to Task list page                                                                                                                                                   # EligibilityQuestionSteps.scala:53
  Then The Task Edit contact details status should be Completed                                                                                                                              # TaskListPageSteps.scala:58
  And The Task Check your answers status should be Not started                                                                                                                               # TaskListPageSteps.scala:58

    Embedding 1_-_Create_a_new_subscription_with_UPE_NoID_Flow_and_NFM_No_Id_flow_to_validate_Contact_Details.png [image/png 243600 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Add filing member details (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Add filing member details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:24)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Add filing member details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Add filing member details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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


11:04:04.936 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:04:04.939 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:04:04.939 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:04:04.941 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 2 - Check you Answers Page Validations                                                         # src/test/resources/features/ContactDetailsAndRegistration.feature:121
  Given Organisation User navigates to Contact Details check your answer page with credId ContactDetails # StepDef.scala:115
  Then I should be on Contact details Check answers page                                                 # EligibilityQuestionSteps.scala:64
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/contact-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/restart-error" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on Contact details Check answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:123)

  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                            | VALUE                    |
    | Contact name                                   | Contact Name Test        |
    | Email address                                  | testContact@email.com    |
    | Can we contact the primary contact by phone?   | Yes                      |
    | Primary phone number                           | 1234554                  |
    | Do you have a second contact?                  | Yes                      |
    | Second contact name                            | Second Contact Name Test |
    | Second contact email address                   | secondContact@email.com  |
    | Can we contact the secondary contact by phone? | Yes                      |
    | Second contact phone number                    | 1234554                  |
    | Address                                        | Address Line 1           |
    | Address                                        | City                     |
    | Address                                        | EH5 5WY                  |
    | Address                                        | United Kingdom           |
  When I click on change link for Contact Name                                                           # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Name as Contact $ Name Change                                                      # UPEPageSteps.scala:26
  Then I should navigate to Contact details Check answers page                                           # EligibilityQuestionSteps.scala:53
  When I click on change link for Email address                                                          # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Email as email&change@test.com                                                     # UPEPageSteps.scala:26
  Then I should navigate to Contact details Check answers page                                           # EligibilityQuestionSteps.scala:53
  When I click on change link for Phone number                                                           # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Telephone as 1234555                                                               # UPEPageSteps.scala:26
  When I click on change link for Second Contact Name                                                    # ChangeYourAnswersPageSteps.scala:95
  And I enter Second Contact Name as Second Contact Name Change                                          # UPEPageSteps.scala:26
  When I click on change link for Second Contact Email                                                   # ChangeYourAnswersPageSteps.scala:95
  And I enter Second Contact Email as secondContact&change@email.com                                     # UPEPageSteps.scala:26
  When I click on change link for Second Contact Phone number                                            # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Telephone as 71235643                                                              # UPEPageSteps.scala:26
  When I click on change link for Address                                                                # ChangeYourAnswersPageSteps.scala:95
  And I enter Address Line 1 as Address Change                                                           # UPEPageSteps.scala:26
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should see details as below:                                                                    # ChangeYourAnswersPageSteps.scala:42
    | KEY                                            | VALUE                          |
    | Contact name                                   | Contact $ Name Change          |
    | Email address                                  | email&change@test.com          |
    | Primary phone number                           | 1234555                        |
    | Second contact name                            | Second Contact Name Change     |
    | Second contact email address                   | secondContact&change@email.com |
    | Can we contact the secondary contact by phone? | Yes                            |
    | Second contact phone number                    | 71235643                       |
    | Address                                        | Address Change                 |
  And I click on Continue button                                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link                               # StepDef.scala:514
  Then I should be on Review answers page                                                                # EligibilityQuestionSteps.scala:64
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                           | VALUE                          |
    | Name                                          | Test                           |
    | Address                                       | Address Line 1                 |
    | Address                                       | City                           |
    | Address                                       | United Arab Emirates           |
    | Contact name                                  | UPE Test                       |
    | Email address                                 | test&upe@email.com             |
    | Can we contact by phone?                      | Yes                            |
    | Phone number                                  | 123456                         |
    | Is there a nominated filing member            | No                             |
    | Where are the entities in your group located? | In the UK and outside the UK   |
    | Start date                                    | 15 January 2024                |
    | End date                                      | 15 January 2025                |
    | Do you have a second contact?                 | Yes                            |
    | Second contact name                           | Second Contact Name Change     |
    | Second contact email address                  | secondContact&change@email.com |
    | Second contact phone number                   | 71235643                       |
  When I click Report Pillar 2 Top-up Taxes link                                                         # StepDef.scala:514
  Then I should navigate to Task list page                                                               # EligibilityQuestionSteps.scala:53
  When I click Edit contact details link                                                                 # StepDef.scala:514
  Then I should navigate to Contact details guidance page                                                # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                        # StepDef.scala:176
  Then I should navigate to Contact details display page                                                 # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                                          # StepDef.scala:518
  Then I should navigate to Second Contact details page                                                  # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                           # StepDef.scala:518
  Then I should navigate to Contact address input page                                                   # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                        # StepDef.scala:176
  Then I should be on Contact details Check answers page                                                 # EligibilityQuestionSteps.scala:64
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                           | VALUE          |
    | Do you have a second contact? | No             |
    | Address                       | Address Change |
  And I click on Continue button                                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link                               # StepDef.scala:514
  Then I should be on Review answers page                                                                # EligibilityQuestionSteps.scala:64
  And I should see row 12 value UPE Test                                                                 # ChangeYourAnswersPageSteps.scala:32
  And I should see row 13 value test&upe@email.com                                                       # ChangeYourAnswersPageSteps.scala:32
  And I should see row 14 value Yes                                                                      # ChangeYourAnswersPageSteps.scala:32
  And I should see row 15 value 123456                                                                   # ChangeYourAnswersPageSteps.scala:32
  And I should see row 16 value No                                                                       # ChangeYourAnswersPageSteps.scala:32
  And I should see row 17 value Address Change                                                           # ChangeYourAnswersPageSteps.scala:32

    Embedding 2_-_Check_you_Answers_Page_Validations.png [image/png 214928 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/contact-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/restart-error" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on Contact details Check answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:123)


11:04:04.936 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:04:04.938 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:04:04.939 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:04:04.939 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:04:04.940 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:04:04.941 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 2 - Check you Answers Page Validations                                                         # src/test/resources/features/ContactDetailsAndRegistration.feature:121
  Given Organisation User navigates to Contact Details check your answer page with credId ContactDetails # StepDef.scala:115
  Then I should be on Contact details Check answers page                                                 # EligibilityQuestionSteps.scala:64
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/contact-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/restart-error" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on Contact details Check answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:123)

  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                            | VALUE                    |
    | Contact name                                   | Contact Name Test        |
    | Email address                                  | testContact@email.com    |
    | Can we contact the primary contact by phone?   | Yes                      |
    | Primary phone number                           | 1234554                  |
    | Do you have a second contact?                  | Yes                      |
    | Second contact name                            | Second Contact Name Test |
    | Second contact email address                   | secondContact@email.com  |
    | Can we contact the secondary contact by phone? | Yes                      |
    | Second contact phone number                    | 1234554                  |
    | Address                                        | Address Line 1           |
    | Address                                        | City                     |
    | Address                                        | EH5 5WY                  |
    | Address                                        | United Kingdom           |
  When I click on change link for Contact Name                                                           # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Name as Contact $ Name Change                                                      # UPEPageSteps.scala:26
  Then I should navigate to Contact details Check answers page                                           # EligibilityQuestionSteps.scala:53
  When I click on change link for Email address                                                          # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Email as email&change@test.com                                                     # UPEPageSteps.scala:26
  Then I should navigate to Contact details Check answers page                                           # EligibilityQuestionSteps.scala:53
  When I click on change link for Phone number                                                           # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Telephone as 1234555                                                               # UPEPageSteps.scala:26
  When I click on change link for Second Contact Name                                                    # ChangeYourAnswersPageSteps.scala:95
  And I enter Second Contact Name as Second Contact Name Change                                          # UPEPageSteps.scala:26
  When I click on change link for Second Contact Email                                                   # ChangeYourAnswersPageSteps.scala:95
  And I enter Second Contact Email as secondContact&change@email.com                                     # UPEPageSteps.scala:26
  When I click on change link for Second Contact Phone number                                            # ChangeYourAnswersPageSteps.scala:95
  And I enter Contact Telephone as 71235643                                                              # UPEPageSteps.scala:26
  When I click on change link for Address                                                                # ChangeYourAnswersPageSteps.scala:95
  And I enter Address Line 1 as Address Change                                                           # UPEPageSteps.scala:26
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should see details as below:                                                                    # ChangeYourAnswersPageSteps.scala:42
    | KEY                                            | VALUE                          |
    | Contact name                                   | Contact $ Name Change          |
    | Email address                                  | email&change@test.com          |
    | Primary phone number                           | 1234555                        |
    | Second contact name                            | Second Contact Name Change     |
    | Second contact email address                   | secondContact&change@email.com |
    | Can we contact the secondary contact by phone? | Yes                            |
    | Second contact phone number                    | 71235643                       |
    | Address                                        | Address Change                 |
  And I click on Continue button                                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link                               # StepDef.scala:514
  Then I should be on Review answers page                                                                # EligibilityQuestionSteps.scala:64
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                           | VALUE                          |
    | Name                                          | Test                           |
    | Address                                       | Address Line 1                 |
    | Address                                       | City                           |
    | Address                                       | United Arab Emirates           |
    | Contact name                                  | UPE Test                       |
    | Email address                                 | test&upe@email.com             |
    | Can we contact by phone?                      | Yes                            |
    | Phone number                                  | 123456                         |
    | Is there a nominated filing member            | No                             |
    | Where are the entities in your group located? | In the UK and outside the UK   |
    | Start date                                    | 15 January 2024                |
    | End date                                      | 15 January 2025                |
    | Do you have a second contact?                 | Yes                            |
    | Second contact name                           | Second Contact Name Change     |
    | Second contact email address                  | secondContact&change@email.com |
    | Second contact phone number                   | 71235643                       |
  When I click Report Pillar 2 Top-up Taxes link                                                         # StepDef.scala:514
  Then I should navigate to Task list page                                                               # EligibilityQuestionSteps.scala:53
  When I click Edit contact details link                                                                 # StepDef.scala:514
  Then I should navigate to Contact details guidance page                                                # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                        # StepDef.scala:176
  Then I should navigate to Contact details display page                                                 # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                                          # StepDef.scala:518
  Then I should navigate to Second Contact details page                                                  # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                           # StepDef.scala:518
  Then I should navigate to Contact address input page                                                   # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                        # StepDef.scala:176
  Then I should be on Contact details Check answers page                                                 # EligibilityQuestionSteps.scala:64
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                           | VALUE          |
    | Do you have a second contact? | No             |
    | Address                       | Address Change |
  And I click on Continue button                                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link                               # StepDef.scala:514
  Then I should be on Review answers page                                                                # EligibilityQuestionSteps.scala:64
  And I should see row 12 value UPE Test                                                                 # ChangeYourAnswersPageSteps.scala:32
  And I should see row 13 value test&upe@email.com                                                       # ChangeYourAnswersPageSteps.scala:32
  And I should see row 14 value Yes                                                                      # ChangeYourAnswersPageSteps.scala:32
  And I should see row 15 value 123456                                                                   # ChangeYourAnswersPageSteps.scala:32
  And I should see row 16 value No                                                                       # ChangeYourAnswersPageSteps.scala:32
  And I should see row 17 value Address Change                                                           # ChangeYourAnswersPageSteps.scala:32

    Embedding 2_-_Check_you_Answers_Page_Validations.png [image/png 214928 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/contact-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/restart-error" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on Contact details Check answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:123)

11:04:26.983 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:04:26.984 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:04:26.989 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:04:26.992 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:04:27.005 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:04:27.010 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:04:27.027 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:04:27.028 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:04:27.028 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:04:27.028 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:04:27.028 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page. # src/test/resources/features/ContactDetailsAndRegistration.feature:340
  Given Organisation User logs in without Pillar2 enrolment                                                                                                              # StepDef.scala:62
  When I select option Yes and continue to next                                                                                                                          # StepDef.scala:518
  Then I should be on UPE entity type page                                                                                                                               # EligibilityQuestionSteps.scala:64
  When I select option UK limited company and continue to GRS page                                                                                                       # UPEPageSteps.scala:275
  When I registered successfully with BV enabled                                                                                                                         # UPEPageSteps.scala:298
  And I click on Save&Continue button                                                                                                                                    # UPEPageSteps.scala:331
  When I click Add filing member details link                                                                                                                            # StepDef.scala:514
  When I select Yes option and continue to next                                                                                                                          # StepDef.scala:526
  When I select option Yes and continue to next                                                                                                                          # StepDef.scala:518
  When I select option UK limited company and continue to GRS page                                                                                                       # UPEPageSteps.scala:275
  When I registered successfully with BV enabled                                                                                                                         # UPEPageSteps.scala:298
  And The json response Body should contain the status "registrationStatus" : "REGISTERED"                                                                               # UPEPageSteps.scala:326
  And I click on Save&Continue button                                                                                                                                    # UPEPageSteps.scala:331
  When I click Add further group details link                                                                                                                            # StepDef.scala:514
  When I select option Only in the UK in further details group status page                                                                                               # UPEPageSteps.scala:290
  When I enter account period as:                                                                                                                                        # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 15    |
    | startDate.month | 1     |
    | startDate.year  | 2024  |
    | endDate.day     | 15    |
    | endDate.month   | 1     |
    | endDate.year    | 2025  |
  And I click on Continue button                                                                                                                                         # StepDef.scala:176
  When I click Add contact details link                                                                                                                                  # StepDef.scala:514
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Add contact details (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Add contact details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:365)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Add contact details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Add contact details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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

  Then I should navigate to Contact details guidance page                                                                                                                # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                                                                        # StepDef.scala:176
  When I enter Contact Name as Contact Name Test                                                                                                                         # UPEPageSteps.scala:26
  When I enter Contact Email as testContact@email.com                                                                                                                    # UPEPageSteps.scala:26
  When I select option Yes and continue to next                                                                                                                          # StepDef.scala:518
  When I enter Contact Telephone as 1234554                                                                                                                              # UPEPageSteps.scala:26
  When I select option No and continue to next                                                                                                                           # StepDef.scala:518
  When I enter Address as:                                                                                                                                               # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                  |
    | addressLine1 | Address Line 1 Contact |
    | addressLine3 | City Contact           |
    | postalCode   | EH5 5WY                |
    | countryCode  | United Kingdom         |
  Then I should navigate to Contact details Check answers page                                                                                                           # EligibilityQuestionSteps.scala:53
  And I should see row 5 key Do you have a second contact?                                                                                                               # ChangeYourAnswersPageSteps.scala:28
  And I should see row 5 value No                                                                                                                                        # ChangeYourAnswersPageSteps.scala:32
  And I click on Continue button                                                                                                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link                                                                                               # StepDef.scala:514
  Then I should navigate to Review answers page                                                                                                                          # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                                                                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                         | VALUE                     |
    | Company                     | Test Example Company Name |
    | Company Registration Number | 76543210                  |
    | Unique Taxpayer Reference   | 1234567890                |
  And I should see row 4 key Is there a nominated filing member                                                                                                          # ChangeYourAnswersPageSteps.scala:28
  And I should see row 5 key Company                                                                                                                                     # ChangeYourAnswersPageSteps.scala:28
  And I should see row 6 key Company Registration Number                                                                                                                 # ChangeYourAnswersPageSteps.scala:28
  And I should see row 7 key Unique Taxpayer Reference                                                                                                                   # ChangeYourAnswersPageSteps.scala:28
  And I should see row 4 value Yes                                                                                                                                       # ChangeYourAnswersPageSteps.scala:32
  And I should see row 5 value Test Example Company Name                                                                                                                 # ChangeYourAnswersPageSteps.scala:32
  And I should see row 6 value 76543210                                                                                                                                  # ChangeYourAnswersPageSteps.scala:32
  And I should see row 7 value 1234567890                                                                                                                                # ChangeYourAnswersPageSteps.scala:32
  And I should see row 16 key Do you have a second contact?                                                                                                              # ChangeYourAnswersPageSteps.scala:28
  And I should see row 16 value No                                                                                                                                       # ChangeYourAnswersPageSteps.scala:32
  And I click on Save&Continue button                                                                                                                                    # UPEPageSteps.scala:331
  Then I should navigate to Registration Duplication KB Page                                                                                                             # EligibilityQuestionSteps.scala:53
  And I click on Save&Continue button                                                                                                                                    # UPEPageSteps.scala:331
  When I select No option and continue to next                                                                                                                           # StepDef.scala:526
  Then I should navigate to Review answers page                                                                                                                          # EligibilityQuestionSteps.scala:53
  And I should see row 4 key Is there a nominated filing member                                                                                                          # ChangeYourAnswersPageSteps.scala:28
  And I should see row 4 value No                                                                                                                                        # ChangeYourAnswersPageSteps.scala:32
  And I click on Save&Continue button                                                                                                                                    # UPEPageSteps.scala:331
  Then I should be redirect to Registration processing page                                                                                                              # EligibilityQuestionSteps.scala:78
  Then I should navigate to Registration confirmation page                                                                                                               # EligibilityQuestionSteps.scala:53
  And I click the browser back button                                                                                                                                    # StepDef.scala:534
  Then I should navigate to Registration return error page                                                                                                               # EligibilityQuestionSteps.scala:53
  And I click report and manage your Pillar 2 Top-up Taxes. link                                                                                                         # StepDef.scala:514
  And I should be on Dashboard page                                                                                                                                      # EligibilityQuestionSteps.scala:64
  And I click the browser back button                                                                                                                                    # StepDef.scala:534
  Then I should be on Registration return error page                                                                                                                     # EligibilityQuestionSteps.scala:64
  And I click Sign out link                                                                                                                                              # StepDef.scala:514
  When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service                                              # StepDef.scala:571
  Then I should be on Dashboard page                                                                                                                                     # EligibilityQuestionSteps.scala:64

    Embedding 4_-_Validate_subscription_journey_from_knock_back_page_for_duplicate_details_on_registration_for_UPE_and_NFM_GRS_flows,_verify_registration_confirmation_page..png [image/png 205275 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Add contact details (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Add contact details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:365)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Add contact details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Add contact details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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

11:04:52.297 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:04:52.300 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:04:52.304 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:04:52.320 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:04:52.321 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:04:52.321 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:04:52.325 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:04:52.326 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:04:52.326 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:04:52.326 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:04:52.326 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows # src/test/resources/features/ContactDetailsAndRegistration.feature:421
  Given Organisation User logs in without Pillar2 enrolment                                                             # StepDef.scala:62
  When I select option Yes and continue to next                                                                         # StepDef.scala:518
  Then I should be on UPE entity type page                                                                              # EligibilityQuestionSteps.scala:64
  When I select option UK limited company and continue to GRS page                                                      # UPEPageSteps.scala:275
  When I registered successfully with BV enabled                                                                        # UPEPageSteps.scala:298
  And I click on Save&Continue button                                                                                   # UPEPageSteps.scala:331
  When I click Add filing member details link                                                                           # StepDef.scala:514
  When I select Yes option and continue to next                                                                         # StepDef.scala:526
  When I select option Yes and continue to next                                                                         # StepDef.scala:518
  When I select option UK limited company and continue to GRS page                                                      # UPEPageSteps.scala:275
  When I registered successfully with BV enabled                                                                        # UPEPageSteps.scala:298
  And The json response Body should contain the status "registrationStatus" : "REGISTERED"                              # UPEPageSteps.scala:326
  And I click on Save&Continue button                                                                                   # UPEPageSteps.scala:331
  When I click Add further group details link                                                                           # StepDef.scala:514
  When I select option In the UK and outside the UK in further details group status page                                # UPEPageSteps.scala:290
  When I enter account period as:                                                                                       # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 15    |
    | startDate.month | 1     |
    | startDate.year  | 2024  |
    | endDate.day     | 15    |
    | endDate.month   | 1     |
    | endDate.year    | 2025  |
  And I click on Continue button                                                                                        # StepDef.scala:176
  When I click Add contact details link                                                                                 # StepDef.scala:514
  Then I should navigate to Contact details guidance page                                                               # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                       # StepDef.scala:176
  When I enter Contact Name as Contact Name Test                                                                        # UPEPageSteps.scala:26
  When I enter Contact Email as testContact@email.com                                                                   # UPEPageSteps.scala:26
  When I select option Yes and continue to next                                                                         # StepDef.scala:518
  When I enter Contact Telephone as 1234554                                                                             # UPEPageSteps.scala:26
  When I select option No and continue to next                                                                          # StepDef.scala:518
  When I enter Address as:                                                                                              # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                  |
    | addressLine1 | Address Line 1 Contact |
    | addressLine3 | City Contact           |
    | postalCode   | EH5 5WY                |
    | countryCode  | United Kingdom         |
  Then I should navigate to Contact details Check answers page                                                          # EligibilityQuestionSteps.scala:53
  And I should see row 5 key Do you have a second contact?                                                              # ChangeYourAnswersPageSteps.scala:28
  And I should see row 5 value No                                                                                       # ChangeYourAnswersPageSteps.scala:32
  And I click on Continue button                                                                                        # StepDef.scala:176
  When I click Check your answers before submitting your registration link                                              # StepDef.scala:514
  Then I should navigate to Review answers page                                                                         # EligibilityQuestionSteps.scala:53
  And I click on Save&Continue button                                                                                   # UPEPageSteps.scala:331
  Then I should navigate to Registration Duplication KB Page                                                            # EligibilityQuestionSteps.scala:53
  When I click Report Pillar 2 Top-up Taxes link                                                                        # StepDef.scala:514
  Then The Task Edit filing member details status should be Completed                                                   # TaskListPageSteps.scala:58
  When I click Check your answers before submitting your registration link                                              # StepDef.scala:514
  Then I should navigate to Review answers page                                                                         # EligibilityQuestionSteps.scala:53
  And I click on Save&Continue button                                                                                   # UPEPageSteps.scala:331
  Then I should navigate to Registration Duplication KB Page                                                            # EligibilityQuestionSteps.scala:53
  When I select Yes option and continue to next                                                                         # StepDef.scala:526
  Then I should navigate to NFM details page                                                                            # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                                          # StepDef.scala:518
  When I enter NFM name as NFM Test KB                                                                                  # UPEPageSteps.scala:26
  When I enter Address as:                                                                                              # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                |
    | addressLine1 | Address Line 1 CYA   |
    | addressLine3 | City CYA             |
    | postalCode   | EH5 5WY              |
    | countryCode  | United Arab Emirates |
  When I click on Continue button                                                                                       # StepDef.scala:176
  When I enter NFM Contact name as Contact CYA                                                                          # UPEPageSteps.scala:26
  When I enter NFM Contact Email as testcya@email.com                                                                   # UPEPageSteps.scala:26
  Then I should navigate to NFM Telephone page                                                                          # EligibilityQuestionSteps.scala:53
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/phone". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/telephone" (tried for 8 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:50)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:41)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:55)
  at ✽.I should navigate to NFM Telephone page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:487)

  When I select option No and continue to next                                                                          # StepDef.scala:518
  Then I should navigate to NFM Check your answers page                                                                 # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                       # StepDef.scala:176
  Then I should be on Task list page                                                                                    # EligibilityQuestionSteps.scala:64
  When I click Check your answers before submitting your registration link                                              # StepDef.scala:514
  Then I should navigate to Review answers page                                                                         # EligibilityQuestionSteps.scala:53
  And I click on Save&Continue button                                                                                   # UPEPageSteps.scala:331
  Then I should be redirect to Registration processing page                                                             # EligibilityQuestionSteps.scala:78
  And I should navigate to Registration confirmation page                                                               # EligibilityQuestionSteps.scala:53

    Embedding 5_-_Validate_Yes_journey_from_knock_back_page_for_duplicate_details_on_registration_for_UPE_and_NFM_GRS_flows.png [image/png 213382 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/phone". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/telephone" (tried for 8 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:50)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:41)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:55)
  at ✽.I should navigate to NFM Telephone page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:487)


11:05:17.409 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:05:17.424 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:05:17.425 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:05:17.427 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:05:17.428 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:05:17.432 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:05:17.435 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:05:17.436 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:05:17.438 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:05:17.439 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:05:17.440 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests
Scenario: 6 - UPE No Id journey navigation to registration in progress page              # src/test/resources/features/ContactDetailsAndRegistration.feature:498
  Given Organisation User logs in without Pillar2 enrolment                              # StepDef.scala:62
  Then I should be on UPE business page                                                  # EligibilityQuestionSteps.scala:64
  When I select option No and continue to next                                           # StepDef.scala:518
  Then I should navigate to input-upe-name page                                          # EligibilityQuestionSteps.scala:53
  When I enter UPE name as Medium Processing Corp                                        # UPEPageSteps.scala:26
  Then I should navigate to input-upe-address page                                       # EligibilityQuestionSteps.scala:53
  When I enter Address as:                                                               # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                |
    | addressLine1 | Address Line 1 UPE   |
    | addressLine3 | City UPE             |
    | postalCode   | Invalid              |
    | countryCode  | United Arab Emirates |
  And I click on Continue button                                                         # StepDef.scala:176
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.31F730A3FEFA3BED890833E555FD0EC1.e.3408}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:511)

  Then I should navigate to UPE Contact person/team Name page                            # EligibilityQuestionSteps.scala:53
  When I enter UPE Person/Team name as Medium Processing                                 # UPEPageSteps.scala:26
  Then I should navigate to UPE Contact Email page                                       # EligibilityQuestionSteps.scala:53
  When I enter UPE Email address as testcontactupe@email.com                             # UPEPageSteps.scala:26
  Then I should navigate to UPE Telephone page                                           # EligibilityQuestionSteps.scala:53
  When I select option Yes and continue to next                                          # StepDef.scala:518
  Then I should navigate to input telephone page                                         # EligibilityQuestionSteps.scala:53
  And I enter Telephone Number as 1234569                                                # UPEPageSteps.scala:26
  Then I should be on Check your answers page                                            # EligibilityQuestionSteps.scala:64
  And I should see details as below:                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                      | VALUE                    |
    | Name                     | Medium Processing Corp   |
    | Address                  | Address Line 1 UPE       |
    | Address                  | City UPE                 |
    | Address                  | INVALID                  |
    | Address                  | United Arab Emirates     |
    | Contact name             | Medium Processing        |
    | Email address            | testcontactupe@email.com |
    | Can we contact by phone? | Yes                      |
    | Phone number             | 1234569                  |
  When I click on Continue button                                                        # StepDef.scala:176
  Then I should navigate to Task list page                                               # EligibilityQuestionSteps.scala:53
  When I click Add filing member details link                                            # StepDef.scala:514
  Then I should navigate to NFM registration page                                        # EligibilityQuestionSteps.scala:53
  When I select No option and continue to next                                           # StepDef.scala:526
  Then I should navigate to Task list page                                               # EligibilityQuestionSteps.scala:53
  And The Task Edit filing member details status should be Completed                     # TaskListPageSteps.scala:58
  When I click Add further group details link                                            # StepDef.scala:514
  Then I should navigate to MNE or domestic page                                         # EligibilityQuestionSteps.scala:53
  When I select option In the UK and outside the UK in further details group status page # UPEPageSteps.scala:290
  And I click on Continue button                                                         # StepDef.scala:176
  Then I should navigate to Group accounting period page                                 # EligibilityQuestionSteps.scala:53
  When I enter account period as:                                                        # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 15    |
    | startDate.month | 1     |
    | startDate.year  | 2024  |
    | endDate.day     | 15    |
    | endDate.month   | 1     |
    | endDate.year    | 2025  |
  Then I should navigate to FD check your answers page                                   # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                         # StepDef.scala:176
  Then I should navigate to Task list page                                               # EligibilityQuestionSteps.scala:53
  When I click Add contact details link                                                  # StepDef.scala:514
  Then I should navigate to Contact details guidance page                                # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                        # StepDef.scala:176
  When I select option Yes and continue to next                                          # StepDef.scala:518
  Then I should navigate to Second Contact details page                                  # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                           # StepDef.scala:518
  Then I should navigate to Contact address input page                                   # EligibilityQuestionSteps.scala:53
  When I enter Address as:                                                               # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE          |
    | addressLine1 | Address Line 1 |
    | addressLine3 | City           |
    | postalCode   | EH5 5WY        |
    | countryCode  | United Kingdom |
  Then I should navigate to Contact details Check answers page                           # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                         # StepDef.scala:176
  When I click Check your answers before submitting your registration link               # StepDef.scala:514
  Then I should navigate to Review answers page                                          # EligibilityQuestionSteps.scala:53
  And I click on Save&Continue button                                                    # UPEPageSteps.scala:331
  Then I should navigate to Registration confirmation page                               # EligibilityQuestionSteps.scala:53
  And I click report and manage your Pillar 2 Top-up Taxes link                          # StepDef.scala:514
  Then I should be on Registration In Progress page                                      # EligibilityQuestionSteps.scala:64
  And The Heading should be Your registration is in progress                             # StepDef.scala:146
  When I refresh the registration in progress page                                       # StepDef.scala:588
  Then I should be on Dashboard page                                                     # EligibilityQuestionSteps.scala:64

    Embedding 6_-_UPE_No_Id_journey_navigation_to_registration_in_progress_page.png [image/png 219850 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.31F730A3FEFA3BED890833E555FD0EC1.e.3408}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/ContactDetailsAndRegistration.feature:511)

11:05:25.750 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:05:25.760 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:05:25.762 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:05:25.763 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:05:25.766 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:05:25.767 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:05:25.768 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:05:25.769 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:05:25.769 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:05:25.772 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:05:25.772 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch1
Scenario: 2 - User navigates to group details page and validates the data                                                    # src/test/resources/features/DashboardPage.feature:42
  Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service # StepDef.scala:571
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:64
  When I click View and amend group details link                                                                             # StepDef.scala:514
  Then I should navigate to accounts summary page                                                                            # EligibilityQuestionSteps.scala:53
  And the page title should be Group details - Report Pillar 2 Top-up Taxes - GOV.UK                                         # StepDef.scala:509
  And The Heading should be Group details                                                                                    # StepDef.scala:146
  And I should see row 1 key Where are the entities in your group located?                                                   # ChangeYourAnswersPageSteps.scala:28
  And I should see row 2 key Group’s accounting period                                                                       # ChangeYourAnswersPageSteps.scala:28
  And I should see row 3 key Start date                                                                                      # ChangeYourAnswersPageSteps.scala:28
  And I should see row 4 key End date                                                                                        # ChangeYourAnswersPageSteps.scala:28
  And I should see row 1 value In the UK and outside the UK                                                                  # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value 6 January 2024                                                                                # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 6 April 2025                                                                                  # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the FD Group Status                                                               # ChangeYourAnswersPageSteps.scala:60
  And The caption must be Group details                                                                                      # StepDef.scala:504
  When I select option Only in the UK in further details group status page                                                   # UPEPageSteps.scala:290
  Then I should navigate to accounts summary page                                                                            # EligibilityQuestionSteps.scala:53
  And I should see row 1 value Only in the UK                                                                                # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the Accounting Period                                                             # ChangeYourAnswersPageSteps.scala:60
  When I enter account period as:                                                                                            # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 5     |
    | startDate.month | 5     |
    | startDate.year  | 2025  |
    | endDate.day     | 5     |
    | endDate.month   | 6     |
    | endDate.year    | 2026  |
  And I should see row 3 value 5 May 2025                                                                                    # ChangeYourAnswersPageSteps.scala:32
      java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0
  at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
  at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
  at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
  at java.base/java.util.Objects.checkIndex(Objects.java:372)
  at java.base/java.util.ArrayList.get(ArrayList.java:459)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$2(ChangeYourAnswersPageSteps.scala:34)
  at ✽.I should see row 3 value 5 May 2025(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:70)

  And I should see row 4 value 5 June 2026                                                                                   # ChangeYourAnswersPageSteps.scala:32
  And I click on Continue button                                                                                             # StepDef.scala:176
  Then I should be redirected to "Manage Account processing Page" or "Dashboard page"                                        # RFMPagesStepDef.scala:347
  And I should be on Dashboard page                                                                                          # EligibilityQuestionSteps.scala:64

    Embedding 2_-_User_navigates_to_group_details_page_and_validates_the_data.png [image/png 221323 bytes]


java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0

  at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
  at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
  at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
  at java.base/java.util.Objects.checkIndex(Objects.java:372)
  at java.base/java.util.ArrayList.get(ArrayList.java:459)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$2(ChangeYourAnswersPageSteps.scala:34)
  at ✽.I should see row 3 value 5 May 2025(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:70)


11:05:29.480 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:05:29.481 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:05:29.481 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:05:29.482 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:05:29.482 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:05:29.483 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:05:29.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:05:29.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:05:29.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:05:29.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:05:29.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch1
Scenario: 3 - User navigates to amend contact details page and validates the data                                            # src/test/resources/features/DashboardPage.feature:77
  Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service # StepDef.scala:571
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:64
  And I should see User details in dashboard page                                                                            # PaymentSteps.scala:40
  When I click View and amend contact details link                                                                           # StepDef.scala:514
  Then I should navigate to contact details summary page                                                                     # EligibilityQuestionSteps.scala:53
  When I click on change link for Contact Name                                                                               # ChangeYourAnswersPageSteps.scala:95
  When I enter Contact Name as Contact Name Test #                                                                           # UPEPageSteps.scala:26
  Then I should navigate to contact details summary page                                                                     # EligibilityQuestionSteps.scala:53
  When I click on change link for Email address                                                                              # ChangeYourAnswersPageSteps.scala:95
  When I enter Contact Email as contact*@email.com                                                                           # UPEPageSteps.scala:26
  When I click on change link for Phone number                                                                               # ChangeYourAnswersPageSteps.scala:95
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: a[href*='/change-input-phone'] (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByCss(Find.scala:43)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$9(ChangeYourAnswersPageSteps.scala:102)
  at ✽.I click on change link for Phone number(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:88)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"a[href*='/change-input-phone']"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=a[href*='/change-input-phone'], using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByCss(Find.scala:43)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$9(ChangeYourAnswersPageSteps.scala:102)
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

  When I enter Telephone Number as 123456789                                                                                 # UPEPageSteps.scala:26
  When I click on change link for Do you have a second contact?                                                              # ChangeYourAnswersPageSteps.scala:95
  When I select option No and continue to next                                                                               # StepDef.scala:518
  When I click on change link for Do you have a second contact?                                                              # ChangeYourAnswersPageSteps.scala:95
  When I select option Yes and continue to next                                                                              # StepDef.scala:518
  When I enter Second Contact Name as Second Contact £ Name Test                                                             # UPEPageSteps.scala:26
  When I enter Second Contact Email as second&Contact@email.com                                                              # UPEPageSteps.scala:26
  When I select option Yes and continue to next                                                                              # StepDef.scala:518
  When I enter Second Contact Input as 1234554878                                                                            # UPEPageSteps.scala:26
  When I click on change link for Dashboard Address                                                                          # ChangeYourAnswersPageSteps.scala:95
  When I enter Address Line 1 as Test Address Line 1                                                                         # UPEPageSteps.scala:26
  When I enter Address Line 2 as Test Address Line 2                                                                         # UPEPageSteps.scala:26
  And I enter City as Test City                                                                                              # UPEPageSteps.scala:26
  And I enter Region as Test Region                                                                                          # UPEPageSteps.scala:26
  And I enter Postal Code as EH5 5WY                                                                                         # UPEPageSteps.scala:26
  And I click on Continue button                                                                                             # StepDef.scala:176
  Then I should navigate to contact details summary page                                                                     # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                            # StepDef.scala:176
  Then I should be redirected to "Manage Contact processing Page" or "Dashboard page"                                        # RFMPagesStepDef.scala:347
  And I should be on Dashboard page                                                                                          # EligibilityQuestionSteps.scala:64

    Embedding 3_-_User_navigates_to_amend_contact_details_page_and_validates_the_data.png [image/png 242753 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: a[href*='/change-input-phone'] (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByCss(Find.scala:43)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$9(ChangeYourAnswersPageSteps.scala:102)
  at ✽.I click on change link for Phone number(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:88)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"a[href*='/change-input-phone']"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=a[href*='/change-input-phone'], using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByCss(Find.scala:43)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$9(ChangeYourAnswersPageSteps.scala:102)
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


11:07:50.619 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:07:50.659 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:07:50.670 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:07:50.671 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:07:50.675 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:07:50.675 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:07:50.679 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:07:50.680 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:07:50.680 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:07:50.680 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:07:50.680 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 7 - Make successful payment as Organisation user                                                                   # src/test/resources/features/DashboardPage.feature:219
  Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service # StepDef.scala:571
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:64
  When I click Make a payment link                                                                                           # StepDef.scala:514
  Then I should navigate to Make a payment page                                                                              # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                            # StepDef.scala:176
11:08:00.693 [main] INFO uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$ -- Instantiating Browser: chrome
  Then I make successful payment                                                                                             # PaymentSteps.scala:394
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //label[contains(text(), 'What is the name of your bank?')] (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$37(PaymentSteps.scala:397)
  at ✽.I make successful payment(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:225)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//label[contains(text(), 'What is the name of your bank?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//label[contains(text(), 'What is the name of your bank?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$37(PaymentSteps.scala:397)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:48)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:47)
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

  And I should navigate to Transaction History Page                                                                          # EligibilityQuestionSteps.scala:53
  When I click Report Pillar 2 Top-up Taxes link                                                                             # StepDef.scala:514
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:64

    Embedding 7_-_Make_successful_payment_as_Organisation_user.png [image/png 207053 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //label[contains(text(), 'What is the name of your bank?')] (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$37(PaymentSteps.scala:397)
  at ✽.I make successful payment(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:225)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//label[contains(text(), 'What is the name of your bank?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//label[contains(text(), 'What is the name of your bank?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$37(PaymentSteps.scala:397)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:48)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:47)
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


11:08:23.578 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:08:23.587 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:08:23.590 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:08:23.592 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:08:23.596 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:08:23.599 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:08:23.605 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:08:23.608 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:08:23.608 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:08:23.609 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:08:23.610 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 8 - Make successful payment as Agent                                                                     # src/test/resources/features/DashboardPage.feature:232
  Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service   # StepDef.scala:571
  And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service # StepDef.scala:579
  Then I should be on ASA Pillar2 Input Page                                                                       # EligibilityQuestionSteps.scala:64
  And I provide ASA Pillar2 ID as XMPLR0012345674                                                                  # ASAStepDef.scala:38
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: .govuk-input (tried for 15 second(s) with 500 milliseconds interval)
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef.$anonfun$new$3(ASAStepDef.scala:42)
  at ✽.I provide ASA Pillar2 ID as XMPLR0012345674(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:236)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".govuk-input"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=.govuk-input, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef.$anonfun$new$3(ASAStepDef.scala:42)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

  And I click on Continue button                                                                                   # StepDef.scala:176
  Then I should navigate to ASA Confirmation Page                                                                  # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                                                   # StepDef.scala:176
  Then I should navigate to ASA Dashboard page                                                                     # EligibilityQuestionSteps.scala:53
  And I can see Agent Services Account link                                                                        # StepDef.scala:601
  When I click Make a payment link                                                                                 # StepDef.scala:514
  Then I should navigate to Make a payment page                                                                    # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                  # StepDef.scala:176
  Then I make successful payment                                                                                   # PaymentSteps.scala:394
  And I should navigate to Transaction History Page                                                                # EligibilityQuestionSteps.scala:53
  When I click Report Pillar 2 Top-up Taxes link                                                                   # StepDef.scala:514
  Then I should be on Dashboard page                                                                               # EligibilityQuestionSteps.scala:64

    Embedding 8_-_Make_successful_payment_as_Agent.png [image/png 249758 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: .govuk-input (tried for 15 second(s) with 500 milliseconds interval)

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef.$anonfun$new$3(ASAStepDef.scala:42)
  at ✽.I provide ASA Pillar2 ID as XMPLR0012345674(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:236)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".govuk-input"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=.govuk-input, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef.$anonfun$new$3(ASAStepDef.scala:42)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)


11:08:42.466 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:08:42.476 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:08:42.477 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:08:42.478 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:08:42.480 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:08:42.483 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:08:42.486 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:08:42.487 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:08:42.488 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:08:42.488 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:08:42.489 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 9 - Back journey from Get ready to approve your payment page                                                       # src/test/resources/features/DashboardPage.feature:251
  Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service # StepDef.scala:571
  Then I should be on Dashboard page                                                                                         # EligibilityQuestionSteps.scala:64
  When I click Make a payment link                                                                                           # StepDef.scala:514
  Then I should navigate to Make a payment page                                                                              # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                            # StepDef.scala:176
  And I go till Get ready to approve your payment page                                                                       # PaymentSteps.scala:406
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //label[contains(text(), 'What is the name of your bank?')] (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$38(PaymentSteps.scala:409)
  at ✽.I go till Get ready to approve your payment page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:257)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//label[contains(text(), 'What is the name of your bank?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//label[contains(text(), 'What is the name of your bank?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$38(PaymentSteps.scala:409)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:48)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:47)
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

  Then I should be able to navigate back to make a payment page                                                              # PaymentSteps.scala:415
  Then I should navigate to Make a payment page                                                                              # EligibilityQuestionSteps.scala:53

    Embedding 9_-_Back_journey_from_Get_ready_to_approve_your_payment_page.png [image/png 207053 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //label[contains(text(), 'What is the name of your bank?')] (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$38(PaymentSteps.scala:409)
  at ✽.I go till Get ready to approve your payment page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/DashboardPage.feature:257)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//label[contains(text(), 'What is the name of your bank?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//label[contains(text(), 'What is the name of your bank?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElement(Wait.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementByXpathContainsText(Wait.scala:37)
  at uk.gov.hmrc.test.ui.pages.OnlinePaymentPages$.enterBankNameAndClickContinueOnChooseBankPage(OnlinePaymentPages.scala:45)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps.$anonfun$new$38(PaymentSteps.scala:409)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:48)
  at io.cucumber.scala.StepDsl$StepBody$$anonfun$apply$1.applyOrElse(StepDsl.scala:47)
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


11:09:39.057 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:09:39.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:09:39.059 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:09:39.061 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:09:39.067 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:09:39.069 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:09:39.073 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:09:39.073 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:09:39.074 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:09:39.074 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:09:39.074 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch1
Scenario: 1 - User navigates to check your answer page answering all the questions of Further Details Page                                                                                                                      # src/test/resources/features/FurtherDetailsTask.feature:7
  Given Organisation User logs in as upe with credId FDTask for Pillar2                                                                                                                                                         # StepDef.scala:69
  When I select option Yes and continue to next                                                                                                                                                                                 # StepDef.scala:518
  When I select option UK limited company and continue to GRS page                                                                                                                                                              # UPEPageSteps.scala:275
  When I registered successfully with BV enabled                                                                                                                                                                                # UPEPageSteps.scala:298
  And I click on Save&Continue button                                                                                                                                                                                           # UPEPageSteps.scala:331
  When I click Add filing member details link                                                                                                                                                                                   # StepDef.scala:514
  When I select No option and continue to next                                                                                                                                                                                  # StepDef.scala:526
  When I click Add further group details link                                                                                                                                                                                   # StepDef.scala:514
  Then I should navigate to MNE or domestic page                                                                                                                                                                                # EligibilityQuestionSteps.scala:53
  And The caption must be Group details                                                                                                                                                                                         # StepDef.scala:504
  And The Heading should be Entity locations                                                                                                                                                                                    # StepDef.scala:146
  And The Body content should be You must consider the locations of all the entities within your group.                                                                                                                         # StepDef.scala:161
  And The Body content should be The entity locations determine which Pillar 2 Top-up Taxes your group needs to report for.                                                                                                     # StepDef.scala:161
  And The Body content should be There are two Pillar 2 Top-up Taxes in the UK:                                                                                                                                                 # StepDef.scala:161
  And The Body content should be Multinational Top-up Tax                                                                                                                                                                       # StepDef.scala:161
  And The Body content should be Domestic Top-up Tax                                                                                                                                                                            # StepDef.scala:161
  And The Body content should be Groups with entities that are located only in the UK will register to report for Domestic Top-up Tax.                                                                                          # StepDef.scala:161
  And The Body content should be Groups with entities that are located in the UK and outside the UK will register to report for both Domestic Top-up Tax and Multinational Top-up Tax.                                          # StepDef.scala:161
  And The Body content should be If any future changes occur that affect the location of the entities within your group, you must amend these details within your account.                                                      # StepDef.scala:161
  And The field heading should be Where are the entities in your group located?                                                                                                                                                 # UPEPageSteps.scala:339
  And I click on Continue button                                                                                                                                                                                                # StepDef.scala:176
  Then I should see error message Select if the group has entities located only in the UK or in the UK and outside the UK on the Further Details Group Status Page                                                              # StepDef.scala:260
  When I select option In the UK and outside the UK in further details group status page                                                                                                                                        # UPEPageSteps.scala:290
  When I select back link                                                                                                                                                                                                       # EligibilityQuestionSteps.scala:38
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.2E3BFE39401DA43121B7773BA7D180B2.e.123}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-back-link]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$2(EligibilityQuestionSteps.scala:40)
  at ✽.I select back link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:31)

  Then I should navigate to MNE or domestic page                                                                                                                                                                                # EligibilityQuestionSteps.scala:53
  And I should see the option In the UK and outside the UK remain selected                                                                                                                                                      # UPEPageSteps.scala:208
  When I select back link                                                                                                                                                                                                       # EligibilityQuestionSteps.scala:38
  And I select back link                                                                                                                                                                                                        # EligibilityQuestionSteps.scala:38
  And The Task Add further group details status should be In progress                                                                                                                                                           # TaskListPageSteps.scala:58
  When I click Add further group details link                                                                                                                                                                                   # StepDef.scala:514
  Then I should navigate to MNE or domestic page                                                                                                                                                                                # EligibilityQuestionSteps.scala:53
  When I select option Only in the UK in further details group status page                                                                                                                                                      # UPEPageSteps.scala:290
  Then I should navigate to Group accounting period page                                                                                                                                                                        # EligibilityQuestionSteps.scala:53
  And The caption must be Group details                                                                                                                                                                                         # StepDef.scala:504
  And The Heading should be When did the group’s first accounting period start and end after 31 December 2023?                                                                                                                  # StepDef.scala:146
  And The Body content should be This is the first accounting period the group uses for their consolidated financial statements, following the implementation of Pillar 2 Top-up Taxes in the UK, on or after 31 December 2023. # StepDef.scala:161
  And I click on Continue button                                                                                                                                                                                                # StepDef.scala:176
  Then I should see error message Enter the start date of the group’s accounting period on the Group Accounting Period Start Date Page                                                                                          # StepDef.scala:260
  Then I should see error message Enter the end date of the group’s accounting period on the Group Accounting Period End Date Page                                                                                              # StepDef.scala:260
  When I enter account period as:                                                                                                                                                                                               # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 30    |
    | startDate.month | 12    |
    | startDate.year  | 2023  |
  Then I should see error message Start date must be on or after 31 December 2023 on the Group Accounting Period Start Date Page                                                                                                # StepDef.scala:260
  When I enter account period as:                                                                                                                                                                                               # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 15    |
    | startDate.month | 1     |
    | startDate.year  | 2024  |
    | endDate.day     | 14    |
    | endDate.month   | 1     |
    | endDate.year    | 2024  |
  Then I should see error message End date must be after the start date on the Group Accounting Period End Date Page                                                                                                            # StepDef.scala:260
  When I enter account period as:                                                                                                                                                                                               # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 1     |
    | startDate.month | 15    |
    | startDate.year  | 2024  |
    | endDate.day     | 12    |
    | endDate.month   | 20    |
    | endDate.year    | 2024  |
  Then I should see error message Start date must be a real date on the Group Accounting Period Start Date Page                                                                                                                 # StepDef.scala:260
  And I should see error message End date must be a real date on the Group Accounting Period End Date Page                                                                                                                      # StepDef.scala:260
  When I enter account period as:                                                                                                                                                                                               # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 15    |
    | startDate.month | 1     |
    | startDate.year  | 2024  |
    | endDate.day     | 15    |
    | endDate.month   | 1     |
    | endDate.year    | 2025  |
  Then I should navigate to FD check your answers page                                                                                                                                                                          # EligibilityQuestionSteps.scala:53
  And The caption must be Group details                                                                                                                                                                                         # StepDef.scala:504
  And The Heading should be Check your answers for further group details                                                                                                                                                        # StepDef.scala:146
  And I should see row 1 key Where are the entities in your group located?                                                                                                                                                      # ChangeYourAnswersPageSteps.scala:28
  And I should see row 2 key Group’s consolidated accounting period                                                                                                                                                             # ChangeYourAnswersPageSteps.scala:28
  And I should see row 3 key Start date                                                                                                                                                                                         # ChangeYourAnswersPageSteps.scala:28
  And I should see row 4 key End date                                                                                                                                                                                           # ChangeYourAnswersPageSteps.scala:28
  And I should see row 1 value Only in the UK                                                                                                                                                                                   # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value 15 January 2024                                                                                                                                                                                  # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 15 January 2025                                                                                                                                                                                  # ChangeYourAnswersPageSteps.scala:32
  When I select back link                                                                                                                                                                                                       # EligibilityQuestionSteps.scala:38
  Then I should navigate to Group accounting period page                                                                                                                                                                        # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                                                                                                                               # StepDef.scala:176
  Then I should be on FD check your answers page                                                                                                                                                                                # EligibilityQuestionSteps.scala:64
  When I click on Continue button                                                                                                                                                                                               # StepDef.scala:176
  Then I should be on Task list page                                                                                                                                                                                            # EligibilityQuestionSteps.scala:64
  And The Task Edit further group details status should be Completed                                                                                                                                                            # TaskListPageSteps.scala:58
  When I click Sign out link                                                                                                                                                                                                    # StepDef.scala:514
  Then I am on feedback survey page                                                                                                                                                                                             # UPEPageSteps.scala:200
  When Organisation User logs in with credId FDTask for Pillar2                                                                                                                                                                 # StepDef.scala:76
  And The Task Edit further group details status should be Completed                                                                                                                                                            # TaskListPageSteps.scala:58
  When I click Edit further group details link                                                                                                                                                                                  # StepDef.scala:514
  Then I should navigate to MNE or domestic page                                                                                                                                                                                # EligibilityQuestionSteps.scala:53
  And I should see the option Only in the UK remain selected                                                                                                                                                                    # UPEPageSteps.scala:208
  When I click on Continue button                                                                                                                                                                                               # StepDef.scala:176
  Then I should navigate to Group accounting period page                                                                                                                                                                        # EligibilityQuestionSteps.scala:53
  And I should see date field Start Day is pre-populated with 15                                                                                                                                                                # SubscriptionJourneySteps.scala:69
  And I should see date field Start Month is pre-populated with 1                                                                                                                                                               # SubscriptionJourneySteps.scala:69
  And I should see date field Start Year is pre-populated with 2024                                                                                                                                                             # SubscriptionJourneySteps.scala:69
  And I should see date field End Day is pre-populated with 15                                                                                                                                                                  # SubscriptionJourneySteps.scala:69
  And I should see date field End Month is pre-populated with 1                                                                                                                                                                 # SubscriptionJourneySteps.scala:69
  And I should see date field End Year is pre-populated with 2025                                                                                                                                                               # SubscriptionJourneySteps.scala:69
  When I select back link                                                                                                                                                                                                       # EligibilityQuestionSteps.scala:38
  Then I should navigate to MNE or domestic page                                                                                                                                                                                # EligibilityQuestionSteps.scala:53

    Embedding 1_-_User_navigates_to_check_your_answer_page_answering_all_the_questions_of_Further_Details_Page.png [image/png 268213 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.2E3BFE39401DA43121B7773BA7D180B2.e.123}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-back-link]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByCss(Input.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$2(EligibilityQuestionSteps.scala:40)
  at ✽.I select back link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:31)


11:09:43.431 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:09:43.433 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:09:43.433 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:09:43.437 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:09:43.438 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:09:43.439 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 2 - Change all the details from Furthers details check your answers page       # src/test/resources/features/FurtherDetailsTask.feature:116
  Given Organisation User navigates to FD check your answer page with credId FDTask      # StepDef.scala:115
  Then I should be on FD check your answers page                                         # EligibilityQuestionSteps.scala:64
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/further-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/incomplete" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on FD check your answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:118)

  When I click on change hyperlink next to the FD Group Status                           # ChangeYourAnswersPageSteps.scala:60
  When I select option In the UK and outside the UK in further details group status page # UPEPageSteps.scala:290
  Then I should be on FD check your answers page                                         # EligibilityQuestionSteps.scala:64
  And I should see row 1 value In the UK and outside the UK                              # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the Accounting Period                         # ChangeYourAnswersPageSteps.scala:60
  When I enter account period as:                                                        # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 5     |
    | startDate.month | 5     |
    | startDate.year  | 2025  |
    | endDate.day     | 5     |
    | endDate.month   | 6     |
    | endDate.year    | 2026  |
  And I should see row 3 value 5 May 2025                                                # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 5 June 2026                                               # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 5 June 2026                                               # ChangeYourAnswersPageSteps.scala:32

    Embedding 2_-_Change_all_the_details_from_Furthers_details_check_your_answers_page.png [image/png 241806 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/further-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/incomplete" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on FD check your answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:118)


11:09:43.431 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:09:43.433 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:09:43.433 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:09:43.437 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:09:43.438 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:09:43.439 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:09:43.445 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 2 - Change all the details from Furthers details check your answers page       # src/test/resources/features/FurtherDetailsTask.feature:116
  Given Organisation User navigates to FD check your answer page with credId FDTask      # StepDef.scala:115
  Then I should be on FD check your answers page                                         # EligibilityQuestionSteps.scala:64
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/further-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/incomplete" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on FD check your answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:118)

  When I click on change hyperlink next to the FD Group Status                           # ChangeYourAnswersPageSteps.scala:60
  When I select option In the UK and outside the UK in further details group status page # UPEPageSteps.scala:290
  Then I should be on FD check your answers page                                         # EligibilityQuestionSteps.scala:64
  And I should see row 1 value In the UK and outside the UK                              # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the Accounting Period                         # ChangeYourAnswersPageSteps.scala:60
  When I enter account period as:                                                        # SubscriptionJourneySteps.scala:30
    | KEY             | VALUE |
    | startDate.day   | 5     |
    | startDate.month | 5     |
    | startDate.year  | 2025  |
    | endDate.day     | 5     |
    | endDate.month   | 6     |
    | endDate.year    | 2026  |
  And I should see row 3 value 5 May 2025                                                # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 5 June 2026                                               # ChangeYourAnswersPageSteps.scala:32
  And I should see row 4 value 5 June 2026                                               # ChangeYourAnswersPageSteps.scala:32

    Embedding 2_-_Change_all_the_details_from_Furthers_details_check_your_answers_page.png [image/png 241806 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/further-details/check-answers". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/error/incomplete" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on FD check your answers page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/FurtherDetailsTask.feature:118)

11:10:30.616 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:10:30.618 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:10:30.619 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:10:30.621 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:10:30.622 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:10:30.623 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:10:30.626 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:10:30.628 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:10:30.629 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:10:30.629 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:10:30.630 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch1
Scenario: 2 - Verify change answers for all NFM No ID journey pages and Verify back links # src/test/resources/features/NFMNoIDFlowPages.feature:66
  Given Organisation User logs in with credId NFMCYA for Pillar2                          # StepDef.scala:76
  When I click Edit filing member details link                                            # StepDef.scala:514
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Edit filing member details (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Edit filing member details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/NFMNoIDFlowPages.feature:68)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Edit filing member details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Edit filing member details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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

  When I click on Continue button                                                         # StepDef.scala:176
  And I should see the answer No remain selected                                          # UPEPageSteps.scala:204
  Then I click on Continue button                                                         # StepDef.scala:176
  Then I should navigate to NFM Name page                                                 # EligibilityQuestionSteps.scala:53
  And I should see the NFM name field is pre-populated with Test CYA                      # UPEPageSteps.scala:212
  Then I click on Continue button                                                         # StepDef.scala:176
  And I should see the Address Line 1 field is pre-populated with Address Line 1 CYA      # UPEPageSteps.scala:212
  Then I click on Continue button                                                         # StepDef.scala:176
  And I should see the NFM Contact name field is pre-populated with Contact CYA           # UPEPageSteps.scala:212
  Then I click on Continue button                                                         # StepDef.scala:176
  And I should see the NFM Contact Email field is pre-populated with testcya@email.com    # UPEPageSteps.scala:212
  Then I click on Continue button                                                         # StepDef.scala:176
  And I should see the answer Yes remain selected                                         # UPEPageSteps.scala:204
  Then I click on Continue button                                                         # StepDef.scala:176
  Then I should see the NFM Telephone number field is pre-populated with 1234569          # UPEPageSteps.scala:212
  Then I click on Continue button                                                         # StepDef.scala:176
  When I click on change hyperlink next to the NFM Name                                   # ChangeYourAnswersPageSteps.scala:60
  And I enter NFM name as Name () Change %^                                               # UPEPageSteps.scala:26
  And I should see row 1 value Name () Change %^                                          # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the NFM Address                                # ChangeYourAnswersPageSteps.scala:60
  And I enter Address Line 1 as Change& Address /                                         # UPEPageSteps.scala:26
  And I click on Continue button                                                          # StepDef.scala:176
  And I should see row 2 value Change& Address /                                          # ChangeYourAnswersPageSteps.scala:32
  And I should see row 2 value City CYA                                                   # ChangeYourAnswersPageSteps.scala:32
  And I should see row 2 value United Arab Emirates                                       # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the NFM Contact Name                           # ChangeYourAnswersPageSteps.scala:60
  And I enter NFM Contact name as Change Contact $ Person ~                               # UPEPageSteps.scala:26
  And I should see row 3 value Change Contact $ Person ~                                  # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the NFM Email Address                          # ChangeYourAnswersPageSteps.scala:60
  And I enter NFM Contact Email as changetest&*@email.com                                 # UPEPageSteps.scala:26
  And I should see row 4 value changetest&*@email.com                                     # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the NFM Telephone Number                       # ChangeYourAnswersPageSteps.scala:60
  And I enter NFM Telephone Number as 12345679                                            # UPEPageSteps.scala:26
  And I should see row 6 value 12345679                                                   # ChangeYourAnswersPageSteps.scala:32
  When I click on change hyperlink next to the NFM Telephone Contact                      # ChangeYourAnswersPageSteps.scala:60
  And I select option No and continue to next                                             # StepDef.scala:518
  And I should see row 5 value No                                                         # ChangeYourAnswersPageSteps.scala:32

    Embedding 2_-_Verify_change_answers_for_all_NFM_No_ID_journey_pages_and_Verify_back_links.png [image/png 266689 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.linkText: Edit filing member details (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at ✽.I click Edit filing member details link(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/NFMNoIDFlowPages.feature:68)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Edit filing member details"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=Edit filing member details, using=link text}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findByLinkText(Find.scala:49)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickByLinkText(Input.scala:33)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41(StepDef.scala:515)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$41$adapted(StepDef.scala:514)
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


11:10:51.651 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:10:51.652 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:10:51.652 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:10:51.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:10:51.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:10:51.653 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:10:51.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:10:51.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:10:51.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:10:51.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:10:51.654 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch2
Scenario: 3 - Validate different error messages for NFM no ID journey pages                                                                                                     # src/test/resources/features/NFMNoIDFlowPages.feature:108
  Given Organisation User logs in without Pillar2 enrolment                                                                                                                     # StepDef.scala:62
  And I select option Yes and continue to next                                                                                                                                  # StepDef.scala:518
  And I select option UK limited company and continue to GRS page                                                                                                               # UPEPageSteps.scala:275
  And I registered successfully with BV enabled                                                                                                                                 # UPEPageSteps.scala:298
  When I click on Save&Continue button                                                                                                                                          # UPEPageSteps.scala:331
  When I click Add filing member details link                                                                                                                                   # StepDef.scala:514
  When I select Yes option and continue to next                                                                                                                                 # StepDef.scala:526
  Then I should navigate to NFM details page                                                                                                                                    # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                                                                               # StepDef.scala:176
  Then I should see NFM error message Select yes if the nominated filing member is registered in the UK on the NFM details page Element                                         # NFMPageSteps.scala:42
  When I select option No and continue to next                                                                                                                                  # StepDef.scala:518
  Then I should navigate to NFM Name page                                                                                                                                       # EligibilityQuestionSteps.scala:53
  When I enter NFM name as Test nfmName                                                                                                                                         # UPEPageSteps.scala:26
  Then I should navigate to NFM Address page                                                                                                                                    # EligibilityQuestionSteps.scala:53
  When I enter Address Line 1 as Test Address Line 1                                                                                                                            # UPEPageSteps.scala:26
  And I enter Address Line 2 as Test Address Line 2                                                                                                                             # UPEPageSteps.scala:26
  And I enter Region as Region                                                                                                                                                  # UPEPageSteps.scala:26
  And I enter City as Test City                                                                                                                                                 # UPEPageSteps.scala:26
  When I enter Postal Code as 1334445                                                                                                                                           # UPEPageSteps.scala:26
  And I enter Country as Australia                                                                                                                                              # UPEPageSteps.scala:26
  And I click on Country selected                                                                                                                                               # StepDef.scala:197
  And I click on Continue button                                                                                                                                                # StepDef.scala:176
  Then I should navigate to NFM Contact Name page                                                                                                                               # EligibilityQuestionSteps.scala:53
  When I enter NFM Contact name as NFM Contact                                                                                                                                  # UPEPageSteps.scala:26
  When I click on Continue button                                                                                                                                               # StepDef.scala:176
  Then I should navigate to NFM Contact Email page                                                                                                                              # EligibilityQuestionSteps.scala:53
  And the page title should be What is the email address? - Report Pillar 2 Top-up Taxes - GOV.UK                                                                               # StepDef.scala:509
  When I click on Continue button                                                                                                                                               # StepDef.scala:176
  Then I should see NFM error message Enter the email address for NFM Contact on the Input NFM Contact Email Element                                                            # NFMPageSteps.scala:42
  When I enter NFM Contact Email as incorrect email                                                                                                                             # UPEPageSteps.scala:26
  Then I should see NFM error message Enter an email address in the correct format, like name@example.com on the Input NFM Contact Email Element                                # NFMPageSteps.scala:42
  When I enter NFM Contact Email as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com # UPEPageSteps.scala:26
  Then I should see NFM error message Email address must be 132 characters or less on the Input NFM Contact Email Element                                                       # NFMPageSteps.scala:42
  And I enter NFM Contact Email as test@email.com                                                                                                                               # UPEPageSteps.scala:26
  Then I should navigate to NFM Telephone page                                                                                                                                  # EligibilityQuestionSteps.scala:53
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/phone". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/telephone" (tried for 8 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:50)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:41)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:55)
  at ✽.I should navigate to NFM Telephone page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/NFMNoIDFlowPages.feature:143)

  And the page title should be Can we contact by phone? - Report Pillar 2 Top-up Taxes - GOV.UK                                                                                 # StepDef.scala:509
  When I click on Continue button                                                                                                                                               # StepDef.scala:176
  Then I should see error message Select yes if we can contact NFM Contact by phone on the NFM Telephone Page                                                                   # StepDef.scala:260
  When I select option Yes and continue to next                                                                                                                                 # StepDef.scala:518
  Then I should navigate to input nfm telephone page                                                                                                                            # EligibilityQuestionSteps.scala:53
  When I click on Continue button                                                                                                                                               # StepDef.scala:176
  When I enter NFM Telephone Number as 9923-456                                                                                                                                 # UPEPageSteps.scala:26
  When I click on change hyperlink next to the NFM Telephone Contact                                                                                                            # ChangeYourAnswersPageSteps.scala:60
  And I select option No and continue to next                                                                                                                                   # StepDef.scala:518
  And I should see row 5 value No                                                                                                                                               # ChangeYourAnswersPageSteps.scala:32
  And I select back link                                                                                                                                                        # EligibilityQuestionSteps.scala:38
  Then I should see the answer No remain selected                                                                                                                               # UPEPageSteps.scala:204
  And I click on Continue button                                                                                                                                                # StepDef.scala:176
  And I click on Continue button                                                                                                                                                # StepDef.scala:176
  Then The Task Edit filing member details status should be Completed                                                                                                           # TaskListPageSteps.scala:58

    Embedding 3_-_Validate_different_error_messages_for_NFM_no_ID_journey_pages.png [image/png 211344 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to be "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/phone". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/telephone" (tried for 8 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrlToBeVisible(Wait.scala:50)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationToPage(Check.scala:41)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$5(EligibilityQuestionSteps.scala:55)
  at ✽.I should navigate to NFM Telephone page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/NFMNoIDFlowPages.feature:143)

11:11:23.680 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:11:23.683 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:11:23.685 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:11:23.687 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:11:23.689 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:11:23.690 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:11:23.693 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:11:23.694 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:11:23.694 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:11:23.694 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:11:23.694 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 2 - Verify that New NFM can replace existing FM through GRS registration flow on the Pillar 2 account and validations # src/test/resources/features/RFMGRSflowPages.feature:43
  Given Organisation User logs in without Pillar2 enrolment                                                                     # StepDef.scala:62
  And I access RFM start page                                                                                                   # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                                                # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                                              # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                                            # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  Then I should be on RFM CYA Page                                                                                              # EligibilityQuestionSteps.scala:64
  When I click on Save&Continue button                                                                                          # UPEPageSteps.scala:331
  When I click on Continue button                                                                                               # StepDef.scala:176
  When I select corp position as NFM                                                                                            # RFMPagesStepDef.scala:285
  When I click on Continue button                                                                                               # StepDef.scala:176
  And I select option Yes and continue to next                                                                                  # StepDef.scala:518
  Then I should be on RFM UK based entity type page                                                                             # EligibilityQuestionSteps.scala:64
  When I select option UK limited company and continue to GRS page                                                              # UPEPageSteps.scala:275
  And I click on Save&Continue button                                                                                           # UPEPageSteps.scala:331
  Then I should be on RFM Contact Guidance page                                                                                 # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                                                                # StepDef.scala:176
  Then I should navigate to RFM Contact Detail Page                                                                             # EligibilityQuestionSteps.scala:53
  When I provide RFM contact name as RFM test contact                                                                           # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                                             # RFMPagesStepDef.scala:79
  And I select option Yes and continue to next                                                                                  # StepDef.scala:518
  When I provide RFM contact number as 01632960001                                                                              # RFMPagesStepDef.scala:79
  And I select option No and continue to next                                                                                   # StepDef.scala:518
  When I enter Address as:                                                                                                      # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should navigate to RFM Final Review Page                                                                               # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Change Second Contact Preference                                                             # RFMPagesStepDef.scala:261
  And I select option Yes and continue to next                                                                                  # StepDef.scala:518
  When I provide RFM contact name as RFM second test contact                                                                    # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfmsecondcontact@email.com                                                                # RFMPagesStepDef.scala:79
  When I select option Yes and continue to next                                                                                 # StepDef.scala:518
  When I provide RFM second contact number as 09872960001                                                                       # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Final Review Page                                                                               # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                                                                            # ChangeYourAnswersPageSteps.scala:42
    | KEY                                            | VALUE                      |
    | Company                                        | Test Example Company Name  |
    | Company Registration Number                    | 76543210                   |
    | Unique Taxpayer Reference                      | 1234567890                 |
    | Do you have a secondary contact?               | Yes                        |
    | Second contact name                            | RFM second test contact    |
    | Second contact email address                   | rfmsecondcontact@email.com |
    | Can we contact the secondary contact by phone? | Yes                        |
    | Second contact phone number                    | 09872960001                |
      org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//dt[contains(text(), 'Can we contact the secondary contact by phone?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//dt[contains(text(), 'Can we contact the secondary contact by phone?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$5(ChangeYourAnswersPageSteps.scala:47)
  at ✽.I should see details as below:(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:84)

  When I click change link for RFM New NFM Name                                                                                 # RFMPagesStepDef.scala:261
  And I provide RFM contact name as RFM test contact change                                                                     # RFMPagesStepDef.scala:79
  And I should see the row 5 value RFM test contact change                                                                      # RFMPagesStepDef.scala:293
  When I click change link for RFM New RFM CYA Change Contact preference                                                        # RFMPagesStepDef.scala:261
  And I select option No and continue to next                                                                                   # StepDef.scala:518
  When I click change link for RFM Change Address                                                                               # RFMPagesStepDef.scala:261
  And I enter Address Line 1 as Address Line 1 CYA change                                                                       # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                                                               # EligibilityQuestionSteps.scala:53
  And I should see the row 13 value Address Line 1 CYA change                                                                   # RFMPagesStepDef.scala:293
  And I should see Print this page link on Review answers page                                                                  # StepDef.scala:618
  And I click on Continue button                                                                                                # StepDef.scala:176
  And I should be redirect to RFM processing page                                                                               # EligibilityQuestionSteps.scala:78
  Then I should navigate to RFM Confirmation Page                                                                               # EligibilityQuestionSteps.scala:53

    Embedding 2_-_Verify_that_New_NFM_can_replace_existing_FM_through_GRS_registration_flow_on_the_Pillar_2_account_and_validations.png [image/png 259817 bytes]


org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//dt[contains(text(), 'Can we contact the secondary contact by phone?')]"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=//dt[contains(text(), 'Can we contact the secondary contact by phone?')], using=xpath}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps.$anonfun$new$5(ChangeYourAnswersPageSteps.scala:47)
  at ✽.I should see details as below:(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:84)

11:11:32.889 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:11:32.890 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:11:32.890 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:11:32.891 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:11:32.891 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:11:32.891 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:11:32.892 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:11:32.892 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:11:32.892 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:11:32.892 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:11:32.892 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 3 - User registration as Limited liability partnership failed with party type mismatch error # src/test/resources/features/RFMGRSflowPages.feature:110
  Given Organisation User logs in without Pillar2 enrolment                                            # StepDef.scala:62
  And I access RFM start page                                                                          # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                       # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                     # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                   # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  Then I should be on RFM CYA Page                                                                     # EligibilityQuestionSteps.scala:64
  When I click on Save&Continue button                                                                 # UPEPageSteps.scala:331
  And I click on Continue button                                                                       # StepDef.scala:176
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.6D213AF218E305E93E6E05978E895102.e.2387}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:122)

  When I select corp position as NFM                                                                   # RFMPagesStepDef.scala:285
  When I click on Continue button                                                                      # StepDef.scala:176
  And I select option Yes and continue to next                                                         # StepDef.scala:518
  When I select option Limited liability partnership and continue to GRS page                          # UPEPageSteps.scala:275
  Then I should navigate to RFM LLP GRS page                                                           # EligibilityQuestionSteps.scala:53
  When registration is unsuccessful with party type mismatch error                                     # UPEPageSteps.scala:309
  And I click on Save&Continue button                                                                  # UPEPageSteps.scala:331
  Then I should be on RFM GRS Registration Mismatch Error Page                                         # EligibilityQuestionSteps.scala:64
  When I click go back to select the entity type link                                                  # StepDef.scala:514
  Then I should be on RFM UK based entity type page                                                    # EligibilityQuestionSteps.scala:64
  When I select option Limited liability partnership and continue to GRS page                          # UPEPageSteps.scala:275
  Then I should navigate to RFM LLP GRS page                                                           # EligibilityQuestionSteps.scala:53

    Embedding 3_-_User_registration_as_Limited_liability_partnership_failed_with_party_type_mismatch_error.png [image/png 237950 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.6D213AF218E305E93E6E05978E895102.e.2387}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:122)


11:11:34.724 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:11:34.724 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:11:34.725 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:11:34.725 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:11:34.726 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:11:34.726 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:11:34.727 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:11:34.728 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:11:34.729 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:11:34.729 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:11:34.730 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 4 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation # src/test/resources/features/RFMGRSflowPages.feature:137
  Given Organisation User logs in without Pillar2 enrolment                                                                  # StepDef.scala:62
  And I access RFM start page                                                                                                # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                                             # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                                           # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                                         # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                                                       # UPEPageSteps.scala:331
  And I click on Continue button                                                                                             # StepDef.scala:176
  When I select corp position as NFM                                                                                         # RFMPagesStepDef.scala:285
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_1 (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at ✽.I select corp position as NFM(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:149)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_1"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=value_1, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:285)
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

  And I click on Continue button                                                                                             # StepDef.scala:176
  And I select option Yes and continue to next                                                                               # StepDef.scala:518
  When I select option UK limited company and continue to GRS page                                                           # UPEPageSteps.scala:275
  Then I should navigate to RFM UK limited Company GRSPage                                                                   # EligibilityQuestionSteps.scala:53
  When registration is unsuccessful with identifiers not match error                                                         # UPEPageSteps.scala:309
  And I click on Save&Continue button                                                                                        # UPEPageSteps.scala:331
  Then I should be on RFM GRS Registration Not Called Error Page                                                             # EligibilityQuestionSteps.scala:64
  When I click Go back to select the entity type link                                                                        # StepDef.scala:514
  Then I should be on RFM UK based entity type page                                                                          # EligibilityQuestionSteps.scala:64
  When I select option Entity type not listed and continue to Name page                                                      # UPEPageSteps.scala:283
  Then I should be on RFM New NFM Contact Name Page                                                                          # EligibilityQuestionSteps.scala:64

    Embedding 4_-_User_registration_as_UK_limited_company_failed_with_identifiers_mismatch_error_and_entity_type_page_validation.png [image/png 237950 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_1 (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at ✽.I select corp position as NFM(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMGRSflowPages.feature:149)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_1"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=value_1, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:285)
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


11:11:56.901 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:11:56.902 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:11:56.907 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:11:56.910 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:11:56.915 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:11:56.916 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:11:56.918 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:11:56.919 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:11:56.919 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:11:56.919 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:11:56.920 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey # src/test/resources/features/RFMSecurity&ErrorValidations.feature:7
  Given Organisation User logs in with rfm URL to Pillar2                                                                      # RFMPagesStepDef.scala:32
  When I provide RFM pillar2 id as XEPLR0123456400                                                                             # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                                           # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  And I click on Continue button                                                                                               # StepDef.scala:176
  Then I should navigate to RFM journey recovery page                                                                          # EligibilityQuestionSteps.scala:53
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:331
  And I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link                               # StepDef.scala:514
  Then I should be on RFM start page                                                                                           # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                                                               # StepDef.scala:176
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:331
  And I provide RFM pillar2 id as XEPLR0123456222                                                                              # RFMPagesStepDef.scala:79
  Then I should be on RFM Registration Date Page                                                                               # EligibilityQuestionSteps.scala:64
  When Registration Day is entered as 27                                                                                       # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                               # StepDef.scala:176
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:331
  And I click on Continue button                                                                                               # StepDef.scala:176
  Then I should navigate to RFM No record Match Error Page                                                                     # EligibilityQuestionSteps.scala:53
  And I select back link                                                                                                       # EligibilityQuestionSteps.scala:38
  Then I should be on RFM CYA Page                                                                                             # EligibilityQuestionSteps.scala:64
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                                                         # RFMPagesStepDef.scala:331
  When I click change link for RFM Pillar 2 Top-up Taxes ID                                                                    # RFMPagesStepDef.scala:261
  And I provide RFM pillar2 id as XEPLR0123456404                                                                              # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                               # StepDef.scala:176
  Then I should navigate to RFM No record Match Error Page                                                                     # EligibilityQuestionSteps.scala:53
  And I click go back to try again using different details. link                                                               # StepDef.scala:514
  Then I should be on RFM enter pillar2 id page                                                                                # EligibilityQuestionSteps.scala:64
  And I provide RFM pillar2 id as XMPLR0123456111                                                                              # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                               # StepDef.scala:176
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.0A473EAE354B840148ADB3B51EAD8AA1.e.2651}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:39)

  And I should see row 1 value XMPLR0123456111                                                                                 # ChangeYourAnswersPageSteps.scala:32
  And I click Sign out link                                                                                                    # StepDef.scala:514

    Embedding 1_-_Verify_Journey_recovery_page_and_error_handling_on_submission_of_Pillar_id_and_registration_date_for_RFM_journey.png [image/png 244291 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.0A473EAE354B840148ADB3B51EAD8AA1.e.2651}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: .govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.InitialGuidancePage$.clickContinue(InitialGuidancePage.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef.$anonfun$new$24(StepDef.scala:177)
  at ✽.I click on Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:39)

11:12:20.412 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:12:20.414 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:12:20.416 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:12:20.417 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:12:20.418 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:12:20.421 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:12:20.430 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:12:20.431 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:12:20.432 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:12:20.433 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:12:20.434 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 3 - Verify Incomplete data error                                                     # src/test/resources/features/RFMSecurity&ErrorValidations.feature:86
  Given Organisation User logs in without Pillar2 enrolment                                    # StepDef.scala:62
  And I access RFM start page                                                                  # RFMPagesStepDef.scala:42
  And I click on Continue button                                                               # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                             # RFMPagesStepDef.scala:79
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:90)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

  When I enter registration date as:                                                           # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                         # UPEPageSteps.scala:331
  And I access RFM corporate position page                                                     # RFMPagesStepDef.scala:42
  When I select corp position as NFM                                                           # RFMPagesStepDef.scala:285
  When I click on Continue button                                                              # StepDef.scala:176
  And I select option No and continue to next                                                  # StepDef.scala:518
  When I provide RFM New NFM Name as Test CYA                                                  # RFMPagesStepDef.scala:79
  When I enter Address as:                                                                     # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  And I continue to RFM contact name Page                                                      # RFMPagesStepDef.scala:335
  And I provide RFM contact name as RFM test contact                                           # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                            # RFMPagesStepDef.scala:79
  And I select option No and continue to next                                                  # StepDef.scala:518
  And I select option No and continue to next                                                  # StepDef.scala:518
  When I enter Address as:                                                                     # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should navigate to RFM Final Review Page                                              # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Change Second Contact Preference                            # RFMPagesStepDef.scala:261
  And I select option Yes and continue to next                                                 # StepDef.scala:518
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                         # RFMPagesStepDef.scala:331
  When I select back link                                                                      # EligibilityQuestionSteps.scala:38
  When I select back link                                                                      # EligibilityQuestionSteps.scala:38
  And I click on Continue button                                                               # StepDef.scala:176
  Then I should navigate to RFM incomplete task error page                                     # EligibilityQuestionSteps.scala:53
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable                         # RFMPagesStepDef.scala:331
  When I click replace the filing member for a Pillar 2 Top-up Taxes account to try again link # StepDef.scala:514
  Then I should be on RFM Final Review Page                                                    # EligibilityQuestionSteps.scala:64

    Embedding 3_-_Verify_Incomplete_data_error.png [image/png 194242 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:90)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)


11:12:36.981 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:12:36.983 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:12:36.983 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:12:36.983 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:12:36.984 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:12:36.984 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:12:36.985 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:12:36.985 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:12:36.985 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:12:36.985 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:12:36.985 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @zap_accessibility @batch2
Scenario: 4 - Verify Security questions are not pre populated for RFM journey    # src/test/resources/features/RFMSecurity&ErrorValidations.feature:132
  Given Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2 # RFMPagesStepDef.scala:298
  Then I should be on RFM enter pillar2 id page                                  # EligibilityQuestionSteps.scala:64
  When I provide RFM pillar2 id as XMPLR0123456789                               # RFMPagesStepDef.scala:79
  When I enter registration date as:                                             # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                           # UPEPageSteps.scala:331
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.088D181A2E3E9F2DA47CD774AA2338F6.e.3116}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: button.govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.UPEEntityTypePage$.clickContinue(UPEEntityTypePage.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps.$anonfun$new$15(UPEPageSteps.scala:331)
  at ✽.I click on Save&Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:141)

  Then I should be on RFM Saving Progress Page                                   # EligibilityQuestionSteps.scala:64
  When I select back link                                                        # EligibilityQuestionSteps.scala:38
  Then I should be on RFM CYA Page                                               # EligibilityQuestionSteps.scala:64
  When I click on Continue button                                                # StepDef.scala:176
  Then I access RFM corporate position page                                      # RFMPagesStepDef.scala:42
  When I select corp position as UPE                                             # RFMPagesStepDef.scala:285
  Then I should be on RFM Contact Guidance page                                  # EligibilityQuestionSteps.scala:64
  When I click on Continue button                                                # StepDef.scala:176
  And I provide RFM contact name as RFM test contact                             # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                              # RFMPagesStepDef.scala:79
  Then I should see Report Pillar 2 Top-up Taxes text is not clickable           # RFMPagesStepDef.scala:331
  And I click Sign out link                                                      # StepDef.scala:514
  And Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2   # RFMPagesStepDef.scala:298
  Then I access RFM start page                                                   # RFMPagesStepDef.scala:42
  And I click on Continue button                                                 # StepDef.scala:176
  Then I should be on RFM enter pillar2 id page                                  # EligibilityQuestionSteps.scala:64
  And The caption must be Replace filing member                                  # StepDef.scala:504
  And The Heading should be Enter the group’s Pillar 2 Top-up Taxes ID           # StepDef.scala:146
  And I should see RFM Pillar2 Id field as blank                                 # RFMPagesStepDef.scala:305
  Then I provide RFM pillar2 id as XMPLR0123456789                               # RFMPagesStepDef.scala:79
  Then I should be on RFM Registration Date Page                                 # EligibilityQuestionSteps.scala:64
  And I should see RFM Registration Day field as blank                           # RFMPagesStepDef.scala:305
  And I should see RFM Registration Month field as blank                         # RFMPagesStepDef.scala:305
  And I should see RFM Registration Year field as blank                          # RFMPagesStepDef.scala:305
  When I enter registration date as:                                             # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                           # UPEPageSteps.scala:331
  Then I should be on RFM Saving Progress Page                                   # EligibilityQuestionSteps.scala:64
  When I click on Continue button                                                # StepDef.scala:176
  Then I access RFM corporate position page                                      # RFMPagesStepDef.scala:42
  And I should see the corporate position UPE remain selected                    # RFMPagesStepDef.scala:75

    Embedding 4_-_Verify_Security_questions_are_not_pre_populated_for_RFM_journey.png [image/png 228048 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.088D181A2E3E9F2DA47CD774AA2338F6.e.3116}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: button.govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.UPEEntityTypePage$.clickContinue(UPEEntityTypePage.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps.$anonfun$new$15(UPEPageSteps.scala:331)
  at ✽.I click on Save&Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMSecurity&ErrorValidations.feature:141)



11:12:51.720 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:12:51.723 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:12:51.725 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:12:51.726 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:12:51.729 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:12:51.730 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:12:51.732 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:12:51.733 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:12:51.733 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:12:51.733 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:12:51.734 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 6 - Verify RFM start page and error validations on Enter pillar2 ID and Registration date page                                       # src/test/resources/features/RFMStartPage&KBValidations.feature:85
  Given I clear the cache                                                                                                                      # StepDef.scala:143
  Given Organisation User logs in without Pillar2 enrolment                                                                                    # StepDef.scala:62
  And I access RFM start page                                                                                                                  # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should be on RFM enter pillar2 id page                                                                                                # EligibilityQuestionSteps.scala:64
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on RFM enter pillar2 id page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMStartPage&KBValidations.feature:90)

  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Enter the group’s Pillar 2 Top-up Taxes ID on the RFM enter pillar2 id Page                               # RFMPagesStepDef.scala:115
  When I provide RFM pillar2 id as AXMPLR0123456785                                                                                            # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Pillar 2 Top-up Taxes ID must be 15 characters on the RFM enter pillar2 id Page                           # RFMPagesStepDef.scala:115
  When I provide RFM pillar2 id as a0000000909090                                                                                              # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Pillar 2 Top-up Taxes ID must be 15 characters on the RFM enter pillar2 id Page                           # RFMPagesStepDef.scala:115
  When I provide RFM pillar2 id as 0MPLR0123456789                                                                                             # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Enter the group’s Pillar 2 Top-up Taxes ID in the correct format on the RFM enter pillar2 id Page         # RFMPagesStepDef.scala:115
  When I provide RFM pillar2 id as XMplr0123456789                                                                                             # RFMPagesStepDef.scala:79
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should be on RFM Registration Date Page                                                                                               # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Enter the registration date to the Report Pillar 2 Top-up Taxes service on the RFM Registration Date Page # RFMPagesStepDef.scala:115
  When Registration Day is entered as 15                                                                                                       # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a month and year on the RFM Registration Date Page                         # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  And Registration Month is entered as 1                                                                                                       # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a day and year on the RFM Registration Date Page                           # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a day and month on the RFM Registration Date Page                          # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 15                                                                                                       # RFMPagesStepDef.scala:219
  And Registration Month is entered as 1                                                                                                       # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a year on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 15                                                                                                       # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a month on the RFM Registration Date Page                                  # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Month is entered as 1                                                                                                      # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must include a day on the RFM Registration Date Page                                    # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 0                                                                                                        # RFMPagesStepDef.scala:219
  When Registration Month is entered as 0                                                                                                      # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 1                                                                                                        # RFMPagesStepDef.scala:219
  When Registration Month is entered as aa                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as y2024                                                                                                    # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as aa                                                                                                       # RFMPagesStepDef.scala:219
  When Registration Month is entered as m3                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as y2024                                                                                                    # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 1                                                                                                        # RFMPagesStepDef.scala:219
  When Registration Month is entered as aa                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as y2024                                                                                                    # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 32                                                                                                       # RFMPagesStepDef.scala:219
  When Registration Month is entered as 11                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 10                                                                                                       # RFMPagesStepDef.scala:219
  When Registration Month is entered as 13                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2024                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 10                                                                                                       # RFMPagesStepDef.scala:219
  When Registration Month is entered as 10                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as 20244                                                                                                    # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be a real date on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  And I enter future date                                                                                                                      # RFMPagesStepDef.scala:238
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be in the past on the RFM Registration Date Page                                   # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584
  When Registration Day is entered as 10                                                                                                       # RFMPagesStepDef.scala:219
  When Registration Month is entered as 10                                                                                                     # RFMPagesStepDef.scala:219
  And Registration Year is entered as 2023                                                                                                     # RFMPagesStepDef.scala:219
  And I click on Continue button                                                                                                               # StepDef.scala:176
  Then I should see an error message Registration date must be on or after 31 December 2023 on the RFM Registration Date Page                  # RFMPagesStepDef.scala:115
  When I refresh the page                                                                                                                      # StepDef.scala:584

    Embedding 6_-_Verify_RFM_start_page_and_error_validations_on_Enter_pillar2_ID_and_Registration_date_page.png [image/png 227275 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for url to contain "http://localhost:10050/report-pillar2-top-up-taxes/replace-filing-member/security/enter-pillar2-id". Current url: "http://localhost:10050/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk" (tried for 15 second(s) with 500 milliseconds interval)
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForUrl(Wait.scala:55)
  at uk.gov.hmrc.test.ui.cucumber.Check$.assertNavigationUrl(Check.scala:44)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps.$anonfun$new$7(EligibilityQuestionSteps.scala:66)
  at ✽.I should be on RFM enter pillar2 id page(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMStartPage&KBValidations.feature:90)


11:13:20.474 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:13:20.477 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:13:20.479 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:13:20.479 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:13:20.481 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:13:20.483 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:13:20.483 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:13:20.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:13:20.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:13:20.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:13:20.484 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey # src/test/resources/features/RFMnfmNoIDFlow.feature:53
  Given I clear the cache                                                                                # StepDef.scala:143
  When Organisation User logs in with rfm URL to Pillar2                                                 # RFMPagesStepDef.scala:32
  And I access RFM start page                                                                            # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                         # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                       # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                     # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                                   # UPEPageSteps.scala:331
  When I click on Continue button                                                                        # StepDef.scala:176
  When I select corp position as UPE                                                                     # RFMPagesStepDef.scala:285
  And I click on Continue button                                                                         # StepDef.scala:176
  When I provide RFM contact name as RFM test contact                                                    # RFMPagesStepDef.scala:79
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:88)
  at ✽.I provide RFM contact name as RFM test contact(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:68)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:88)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

  When I provide RFM contact email as rfm@email.com                                                      # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Contact Number Page                                                      # EligibilityQuestionSteps.scala:53
  When I select option No and continue to next                                                           # StepDef.scala:518
  And I select option No and continue to next                                                            # StepDef.scala:518
  When I enter Address as:                                                                               # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see row 1 key Position in the group’s corporate structure                                 # ChangeYourAnswersPageSteps.scala:28
  And I should see row 1 value Ultimate Parent Entity (UPE)                                              # ChangeYourAnswersPageSteps.scala:32
  When I click change link for RFM Corporate Position                                                    # RFMPagesStepDef.scala:261
  When I select corp position as NFM                                                                     # RFMPagesStepDef.scala:285
  And I click on Continue button                                                                         # StepDef.scala:176
  When I select option No and continue to next                                                           # StepDef.scala:518
  And I click on Continue button                                                                         # StepDef.scala:176
  When I provide RFM New NFM Name as Test CYA                                                            # RFMPagesStepDef.scala:79
  Then I should navigate to RFM New NFM Contact Address Page                                             # EligibilityQuestionSteps.scala:53
  When I enter Address as:                                                                               # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE                |
    | addressLine1 | Address Line 1 & CYA |
    | addressLine3 | City CYA             |
    | postalCode   | EH5 5WY              |
    | countryCode  | Australia            |
  Then I should be on RFM No ID CYA Page                                                                 # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  When I select back link                                                                                # EligibilityQuestionSteps.scala:38
  Then I should be on RFM No ID CYA Page                                                                 # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                                                     # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Name                                        | Test CYA                    |
    | Address                                     | Address Line 1 & CYA        |
    | Address                                     | City CYA                    |
    | Address                                     | EH55WY                      |
    | Address                                     | Australia                   |
  When I click change link for RFM Input Name                                                            # RFMPagesStepDef.scala:261
  When I provide RFM New NFM Name as Test Change                                                         # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Input Address                                                         # RFMPagesStepDef.scala:261
  And I enter Address Line 1 as Address Line 1 Change                                                    # UPEPageSteps.scala:26
  And I enter City as City Change                                                                        # UPEPageSteps.scala:26
  And I enter Postal Code as EH75WK                                                                      # UPEPageSteps.scala:26
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                                        # EligibilityQuestionSteps.scala:53
  And I should see row 3 value Address Line 1 Change                                                     # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value City Change                                                               # ChangeYourAnswersPageSteps.scala:32
  And I should see row 3 value EH75WK                                                                    # ChangeYourAnswersPageSteps.scala:32
  And I click on Continue button                                                                         # StepDef.scala:176
  Then I should be redirect to RFM processing page                                                       # EligibilityQuestionSteps.scala:78
  And I should be on RFM Confirmation Page                                                               # EligibilityQuestionSteps.scala:64
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                             # StepDef.scala:557
  And I can see Print this page link                                                                     # StepDef.scala:601
  When I click the browser back button                                                                   # StepDef.scala:534
  Then I should navigate to RFM No Return Back Error Page                                                # EligibilityQuestionSteps.scala:53
  And I click report and manage your Pillar 2 Top-up Taxes link                                          # StepDef.scala:514
  Then I should be on Dashboard page                                                                     # EligibilityQuestionSteps.scala:64

    Embedding 2_-_Validating_RFM_final_submission_for_RFM_as_selecting_UPE_then_changed_to_NFM_No_ID_journey.png [image/png 246527 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:88)
  at ✽.I provide RFM contact name as RFM test contact(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:68)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:88)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

11:13:39.217 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:13:39.218 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:13:39.220 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:13:39.220 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:13:39.220 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:13:39.221 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:13:39.222 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:13:39.222 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:13:39.222 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:13:39.222 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:13:39.222 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch2
Scenario: 3 - Validating RFM Check your answers page navigations   # src/test/resources/features/RFMnfmNoIDFlow.feature:133
  Given Organisation User logs in with rfm URL to Pillar2          # RFMPagesStepDef.scala:32
  And I access RFM start page                                      # RFMPagesStepDef.scala:42
  And I click on Continue button                                   # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                 # RFMPagesStepDef.scala:79
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clearElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.FBE132C8E12E3C15A5CF4112B5865E73.e.4552}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: #value]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:129)
  at uk.gov.hmrc.test.ui.cucumber.Input$.sendKeysByCss(Input.scala:64)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:137)

  When I enter registration date as:                               # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                             # UPEPageSteps.scala:331
  When I click on Continue button                                  # StepDef.scala:176
  When I select corp position as UPE                               # RFMPagesStepDef.scala:285
  And I click on Continue button                                   # StepDef.scala:176
  When I provide RFM contact name as RFM test contact              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                # RFMPagesStepDef.scala:79
  When I select option No and continue to next                     # StepDef.scala:518
  And I select option No and continue to next                      # StepDef.scala:518
  When I enter Address as:                                         # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  Then I should navigate to RFM Final Review Page                  # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Corporate Position              # RFMPagesStepDef.scala:261
  And I select corp position as NFM                                # RFMPagesStepDef.scala:285
  Then I should be on New NFM guidance page                        # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                   # StepDef.scala:176
  Then I should be on RFM registered in UK page                    # EligibilityQuestionSteps.scala:64
  When I select option Yes and continue to next                    # StepDef.scala:518
  Then I should be on RFM UK based entity type page                # EligibilityQuestionSteps.scala:64
  When I select option UK limited company and continue to GRS page # UPEPageSteps.scala:275
  Then I should navigate to RFM UK limited Company GRSPage         # EligibilityQuestionSteps.scala:53
  When I navigate back to RFM CYA Page from GRS Page               # RFMPagesStepDef.scala:325
  Then I should navigate to RFM Final Review Page                  # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Corporate Position              # RFMPagesStepDef.scala:261
  And I click on Continue button                                   # StepDef.scala:176
  Then I should be on New NFM guidance page                        # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                   # StepDef.scala:176
  Then I should be on RFM registered in UK page                    # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                   # StepDef.scala:176
  Then I should be on RFM UK based entity type page                # EligibilityQuestionSteps.scala:64

    Embedding 3_-_Validating_RFM_Check_your_answers_page_navigations.png [image/png 248890 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clearElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.FBE132C8E12E3C15A5CF4112B5865E73.e.4552}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: #value]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:129)
  at uk.gov.hmrc.test.ui.cucumber.Input$.sendKeysByCss(Input.scala:64)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:84)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:137)

11:13:40.816 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:13:40.818 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:13:40.821 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:13:40.825 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:13:40.830 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:13:40.834 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:13:40.839 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:13:40.840 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:13:40.841 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:13:40.843 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:13:40.843 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 4 - Validating RFM Check your answers page for UPE/NFM journey Responses # src/test/resources/features/RFMnfmNoIDFlow.feature:178
  Given Organisation User logs in with rfm URL to Pillar2                          # RFMPagesStepDef.scala:32
  And I access RFM start page                                                      # RFMPagesStepDef.scala:42
  And I click on Continue button                                                   # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                 # RFMPagesStepDef.scala:79
  When I enter registration date as:                                               # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                             # UPEPageSteps.scala:331
      org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.33E2ACBDF3D0165377934351ADB1E4A3.e.4656}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: button.govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31
  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.UPEEntityTypePage$.clickContinue(UPEEntityTypePage.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps.$anonfun$new$15(UPEPageSteps.scala:331)
  at ✽.I click on Save&Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:188)

  And I access RFM corporate position page                                         # RFMPagesStepDef.scala:42
  When I select corp position as UPE                                               # RFMPagesStepDef.scala:285
  And I click on Continue button                                                   # StepDef.scala:176
  When I provide RFM contact name as RFM test contact                              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                # RFMPagesStepDef.scala:79
  When I select option No and continue to next                                     # StepDef.scala:518
  And I select option No and continue to next                                      # StepDef.scala:518
  When I enter Address as:                                                         # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | RFM Address Line 1 |
    | addressLine3 | RFM City           |
    | postalCode   | EH5 5WY            |
    | countryCode  | United Kingdom     |
  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:261
  When I select corp position as NFM                                               # RFMPagesStepDef.scala:285
  And I click on Continue button                                                   # StepDef.scala:176
  When I select option No and continue to next                                     # StepDef.scala:518
  When I provide RFM New NFM Name as Test CYA                                      # RFMPagesStepDef.scala:79
  When I enter Address as:                                                         # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should be on RFM No ID CYA Page                                           # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  When I select back link                                                          # EligibilityQuestionSteps.scala:38
  Then I should be on RFM No ID CYA Page                                           # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Name                                        | Test CYA                    |
    | Address                                     | Address Line 1 CYA          |
    | Address                                     | City CYA                    |
    | Address                                     | EH55WY                      |
    | Address                                     | Australia                   |
  When I click change link for RFM Input Name                                      # RFMPagesStepDef.scala:261
  When I provide RFM New NFM Name as Test Change                                   # RFMPagesStepDef.scala:79
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  When I click change link for RFM Input Address                                   # RFMPagesStepDef.scala:261
  And I enter Address Line 1 as Address Line 1 Change                              # UPEPageSteps.scala:26
  And I enter City as City Change                                                  # UPEPageSteps.scala:26
  And I enter Postal Code as EH75WK                                                # UPEPageSteps.scala:26
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY     | VALUE                 |
    | Address | Address Line 1 Change |
    | Address | City Change           |
    | Address | EH75WK                |
  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:261
  When I select corp position as UPE                                               # RFMPagesStepDef.scala:285
  And I should see row 1 value Ultimate Parent Entity (UPE)                        # ChangeYourAnswersPageSteps.scala:32
  When I click change link for RFM Corporate Position                              # RFMPagesStepDef.scala:261
  When I select corp position as NFM                                               # RFMPagesStepDef.scala:285
  And I click on Continue button                                                   # StepDef.scala:176
  When I select option Yes and continue to next                                    # StepDef.scala:518
  When I select option UK limited company and continue to GRS page                 # UPEPageSteps.scala:275
  Then I should navigate to RFM UK limited Company GRSPage                         # EligibilityQuestionSteps.scala:53
  When I registered successfully with BV enabled                                   # UPEPageSteps.scala:298
  And I click on Save&Continue button                                              # UPEPageSteps.scala:331
  Then I should be on RFM Contact Guidance page                                    # EligibilityQuestionSteps.scala:64
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Contact Detail Page                                # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Contact Email Page                                 # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Contact Number Page                                # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should navigate to RFM Second Contact Question Page                       # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                   # StepDef.scala:176
  Then I should be on RFM Contact Address Page                                     # EligibilityQuestionSteps.scala:64
  When I click on Continue button                                                  # StepDef.scala:176
  Then I should navigate to RFM Final Review Page                                  # EligibilityQuestionSteps.scala:53
  And I should see details as below:                                               # ChangeYourAnswersPageSteps.scala:42
    | KEY                                         | VALUE                       |
    | Position in the group’s corporate structure | New nominated filing member |
    | Company                                     | Test Example Company Name   |
    | Company Registration Number                 | 76543210                    |
    | Unique Taxpayer Reference                   | 1234567890                  |

    Embedding 4_-_Validating_RFM_Check_your_answers_page_for_UPE/NFM_journey_Responses.png [image/png 228048 bytes]


org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, clickElement {id=f.FA8DFEB0D77DAA016A3D370C4A467EE2.d.33E2ACBDF3D0165377934351ADB1E4A3.e.4656}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Element: [[ChromeDriver: chrome on mac (02e5d86ea557b9973ebef36212803f31)] -> css selector: button.govuk-button]
Session ID: 02e5d86ea557b9973ebef36212803f31

  at jdk.internal.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)
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
  at uk.gov.hmrc.test.ui.pages.UPEEntityTypePage$.clickContinue(UPEEntityTypePage.scala:35)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps.$anonfun$new$15(UPEPageSteps.scala:331)
  at ✽.I click on Save&Continue button(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:188)

11:13:43.778 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:13:43.779 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:13:43.779 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:13:43.779 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:13:43.780 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:13:43.780 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:13:43.781 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:13:43.781 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:13:43.781 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:13:43.781 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:13:43.781 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account # src/test/resources/features/RFMnfmNoIDFlow.feature:274
  Given Organisation User logs in without Pillar2 enrolment                                          # StepDef.scala:62
  And I access RFM start page                                                                        # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                     # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                   # RFMPagesStepDef.scala:79
  When I enter registration date as:                                                                 # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                               # UPEPageSteps.scala:331
  When I click on Continue button                                                                    # StepDef.scala:176
  When I select corp position as NFM                                                                 # RFMPagesStepDef.scala:285
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_1 (tried for 20 second(s) with 250 milliseconds interval)
  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at ✽.I select corp position as NFM(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:286)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_1"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=value_1, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:285)
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

  When I click on Continue button                                                                    # StepDef.scala:176
  And I select option No and continue to next                                                        # StepDef.scala:518
  When I provide RFM New NFM Name as Test CYA                                                        # RFMPagesStepDef.scala:79
  When I enter Address as:                                                                           # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  And I click on Continue button                                                                     # StepDef.scala:176
  And I click on Continue button                                                                     # StepDef.scala:176
  When I provide RFM contact name as RFM test contact                                                # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                  # RFMPagesStepDef.scala:79
  And I select option No and continue to next                                                        # StepDef.scala:518
  And I select option No and continue to next                                                        # StepDef.scala:518
  When I enter Address as:                                                                           # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  Then I should navigate to RFM Final Review Page                                                    # EligibilityQuestionSteps.scala:53
  And I click on Continue button                                                                     # StepDef.scala:176
  Then I should be redirect to RFM processing page                                                   # EligibilityQuestionSteps.scala:78
  And I should see Report Pillar 2 Top-up Taxes text is not clickable                                # RFMPagesStepDef.scala:331
  And I should be on RFM Confirmation Page                                                           # EligibilityQuestionSteps.scala:64
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                         # StepDef.scala:557
  And I can see Print this page link                                                                 # StepDef.scala:601
  When I click report and manage your group's Pillar 2 Top-up Taxes link                             # StepDef.scala:514
  Then I should be on Dashboard page                                                                 # EligibilityQuestionSteps.scala:64

    Embedding 5_-_Verify_that_New_NFM_can_replace_existing_FM_through_NO_ID_flow_on_the_Pillar_2_account.png [image/png 237950 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.id: value_1 (tried for 20 second(s) with 250 milliseconds interval)

  at org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:265)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Find$.find(Find.scala:30)
  at uk.gov.hmrc.test.ui.cucumber.Find$.findById(Find.scala:39)
  at uk.gov.hmrc.test.ui.cucumber.Input$.clickById(Input.scala:31)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at ✽.I select corp position as NFM(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:286)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value_1"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=value_1, using=id}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14(RFMPagesStepDef.scala:288)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$14$adapted(RFMPagesStepDef.scala:285)
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

11:14:06.422 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.SubscriptionJourneySteps -- Instantiating Browser: chrome
11:14:06.423 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.UPEPageSteps -- Instantiating Browser: chrome
11:14:06.423 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef -- Instantiating Browser: chrome
11:14:06.423 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.PaymentSteps -- Instantiating Browser: chrome
11:14:06.424 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.Pillar2SubmissionSteps -- Instantiating Browser: chrome
11:14:06.424 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.StepDef -- Instantiating Browser: chrome
11:14:06.425 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.TaskListPageSteps -- Instantiating Browser: chrome
11:14:06.425 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ChangeYourAnswersPageSteps -- Instantiating Browser: chrome
11:14:06.425 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.ASAStepDef -- Instantiating Browser: chrome
11:14:06.425 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.NFMPageSteps -- Instantiating Browser: chrome
11:14:06.426 [main] INFO uk.gov.hmrc.test.ui.cucumber.stepdefs.EligibilityQuestionSteps -- Instantiating Browser: chrome

@tests @batch3
Scenario: 6 - Verify that UPE can replace existing FM on the Pillar 2 account                                                      # src/test/resources/features/RFMnfmNoIDFlow.feature:319
  Given Organisation User logs in without Pillar2 enrolment                                                                        # StepDef.scala:62
  And I access RFM start page                                                                                                      # RFMPagesStepDef.scala:42
  And I click on Continue button                                                                                                   # StepDef.scala:176
  When I provide RFM pillar2 id as XMPLR0123456789                                                                                 # RFMPagesStepDef.scala:79
      org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)
  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:323)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)

  When I enter registration date as:                                                                                               # RFMPagesStepDef.scala:341
    | KEY                       | VALUE |
    | rfmRegistrationDate.day   | 31    |
    | rfmRegistrationDate.month | 1     |
    | rfmRegistrationDate.year  | 2024  |
  When I click on Save&Continue button                                                                                             # UPEPageSteps.scala:331
  And I click on Continue button                                                                                                   # StepDef.scala:176
  When I select corp position as UPE                                                                                               # RFMPagesStepDef.scala:285
  When I click on Continue button                                                                                                  # StepDef.scala:176
  When I provide RFM contact name as RFM test contact                                                                              # RFMPagesStepDef.scala:79
  When I provide RFM contact email as rfm@email.com                                                                                # RFMPagesStepDef.scala:79
  And I select option Yes and continue to next                                                                                     # StepDef.scala:518
  When I provide RFM contact number as 01632960001                                                                                 # RFMPagesStepDef.scala:79
  And I select option Yes and continue to next                                                                                     # StepDef.scala:518
  And I click on Continue button                                                                                                   # StepDef.scala:176
  Then I should see an error message Enter name of the person or team we should contact on the RFM second contact name Page        # RFMPagesStepDef.scala:115
  When I provide RFM contact name as RFM second test contact                                                                       # RFMPagesStepDef.scala:79
  When I click on Continue button                                                                                                  # StepDef.scala:176
  Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page # RFMPagesStepDef.scala:115
  When I provide RFM contact email as rfmsecondcontact@email.com                                                                   # RFMPagesStepDef.scala:79
  Then I click on Continue button                                                                                                  # StepDef.scala:176
  Then I should see an error message Select yes if we can contact RFM second test contact by phone on the RFM input telephone Page # RFMPagesStepDef.scala:115
  When I select option Yes and continue to next                                                                                    # StepDef.scala:518
  When I provide RFM second contact number as 09872960001                                                                          # RFMPagesStepDef.scala:79
  When I enter Address as:                                                                                                         # EligibilityQuestionSteps.scala:58
    | KEY          | VALUE              |
    | addressLine1 | Address Line 1 CYA |
    | addressLine3 | City CYA           |
    | postalCode   | EH5 5WY            |
    | countryCode  | Australia          |
  And I should see the row 1 value Ultimate Parent Entity (UPE)                                                                    # RFMPagesStepDef.scala:293
  When I click on change link for Contact Name                                                                                     # ChangeYourAnswersPageSteps.scala:95
  When I enter Contact Name as 400                                                                                                 # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                   # StepDef.scala:176
  Then I should be redirected to "RFM processing page" or "Amend API error Page for RFM"                                           # RFMPagesStepDef.scala:347
  When I click to replace the filing member for a Pillar 2 Top-up Taxes account to try again link                                  # StepDef.scala:514
  Then I should navigate to RFM Final Review Page                                                                                  # EligibilityQuestionSteps.scala:53
  When I click on change link for Contact Name                                                                                     # ChangeYourAnswersPageSteps.scala:95
  When I enter Contact Name as test name                                                                                           # UPEPageSteps.scala:26
  And I click on Continue button                                                                                                   # StepDef.scala:176
  And I should navigate to RFM Confirmation Page                                                                                   # EligibilityQuestionSteps.scala:53
  And I should see report and manage your group's Pillar 2 Top-up Taxes link                                                       # StepDef.scala:557
  And I can see Print this page link                                                                                               # StepDef.scala:601
  When I click report and manage your group's Pillar 2 Top-up Taxes link                                                           # StepDef.scala:514
  Then I should be on Dashboard page                                                                                               # EligibilityQuestionSteps.scala:64

    Embedding 6_-_Verify_that_UPE_can_replace_existing_FM_on_the_Pillar_2_account.png [image/png 227206 bytes]


org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #value (tried for 15 second(s) with 500 milliseconds interval)

  at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at ✽.I provide RFM pillar2 id as XMPLR0123456789(file:///Users/olkuy/workspace/PIL-2275/pillar2-acceptance-tests/src/test/resources/features/RFMnfmNoIDFlow.feature:323)
Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#value"}
  (Session info: chrome=136.0.7103.113)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.33.0', revision: '2c6aaad03a'
System info: os.name: 'Mac OS X', os.arch: 'aarch64', os.version: '15.6', java.version: '11.0.19'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [02e5d86ea557b9973ebef36212803f31, findElement {value=#value, using=css selector}]
Capabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 136.0.7103.113, chrome: {chromedriverVersion: 136.0.7103.113 (76fa3c17824..., userDataDir: /var/folders/hf/lnyf1q6x6w1...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63515}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: mac, proxy: Proxy(), se:cdp: ws://localhost:63515/devtoo..., se:cdpVersion: 136.0.7103.113, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 02e5d86ea557b9973ebef36212803f31
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
  at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
  at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)
  at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:171)
  at org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:168)
  at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)
  at uk.gov.hmrc.test.ui.cucumber.Wait$.waitForElementToPresentByCssSelector(Wait.scala:60)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6(RFMPagesStepDef.scala:83)
  at uk.gov.hmrc.test.ui.cucumber.stepdefs.RFMPagesStepDef.$anonfun$new$6$adapted(RFMPagesStepDef.scala:79)
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
  at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
  at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:231)
  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:55)






