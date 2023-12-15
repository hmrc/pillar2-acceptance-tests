
# pillar2-acceptance-tests

####Acceptance tests for Pillar2 Application Features
This repository is the automated acceptance tests for Pillar2 Application which include below pages:
## Examples
* https://www.staging.tax.service.gov.uk/auth-login-stub/gg-sign-in
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/trading-business-confirmation
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/check-your-answers
* https://staging.tax.service.gov.uk/report-pillar2-top-up-taxes/eligibility/activities-within-the-uk
* https://staging.tax.service.gov.uk/report-pillar2-top-up-taxes/eligibility/kb-in-the-uk-ineligible
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/eligibility/global-gross-revenue
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/eligibility/kb-750-ineligible
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/eligibility/confirmation
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/task-list/register-for-global-minimum-tax
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/match-hmrc-records
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/registered-in-uk
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/uk-based/org-type
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/input-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/input-address
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/input-business-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/input-email
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/input-telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/ultimate-parent/no-id/check-answers
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/nominate
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/registered-in-uk
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/input-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/input-business-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/input-email
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/input-telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/business-matching/filing-member/no-id/check-answers
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/further-details/group-status
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/further-details/accounting-period
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/further-details/check-answers
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/content
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/use-contact
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/input-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/input-email
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/second-contact
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/second-input-name
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/second-input-email
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/second-telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/second-input-telephone
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/address/input
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/contact-details/check-answers
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/review-submit/check-answers
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/review-submit/confirmation
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/pillar2-top-up-tax-home
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/manage-account/contact-details/summary
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/manage-account/further-details/change-group-status
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/manage-account/further-details/change-accounting-period
* https://www.staging.tax.service.gov.uk/report-pillar2-top-up-taxes/manage-account/account-details/summary

####The structure of the project is as follows:
```
├── src
│   └── test
│       ├── resources
│       │   ├── features      # The Cucumber feature files
│       │   ├── application.conf  
│       │   ├── cucumber.properties
│       │   └── testdata
│       └── scala
│           └── uk
│               └── gov
│                   └── hmrc
│                       └── test
│                             └── ui
│                               │  └── conf
│                               │       └── TestConfiguration
│                               └── cucumber
│                               │       └── runner             #The different runners to start the tests 
│                               │       │      └── Runner
│                               │       │      └── SoloRunner
│                               │       │      └── ZapRunner
│                               │       └── stepdefs     # The step definitions
│                               │       │      └── BaseStepDef       # shutdown hooks
│                               │       │      └── CommonFunctions   # common step definitions
│                               │       │      └── StepDef           # combined step definitions
│                               │       │      └── Hooks             # start up and tear down methods for tests
│                               │       │      └── Page1             # step definition methods of Page1  
│                               │       │      └── Page2             # step definition methods of Page1 
│                               │       │      :
│                               │       │      :
│                               │       └── Check       # The shared test utils
│                               │       └── Find        # The shared test utils
│                               │       └── Forms       # The shared test utils
│                               │       └── Input       # The shared test utils
│                               │       └── Nav         # The shared test utils
│                               │       └── PageObject  # The shared test utils
│                               │       └── Wait        # The shared test utils
│                               └── driver
│                               │      └── BrowserDriver # setup webdriver object
│                               └── pages
│                                     └── BasePage     # common page methods
│                                     └── Page1        # page methods
│                                     └── Page2
│                                     :
│                                     :
|
└── target
│     └── test-reports
│        └── html-report      # The Cucumber report and test run screenshots
├── .gitignore                   # To ensure that certain files not tracked by Git remain untracked
├── .build.sbt                   # script file to build the project
├── LICENCE                      # License details
├── README.md                    # Read me file
├── run_accessibility_tests.sh   # Script file to run acaccessibility tests  
├── run_solo.sh                  
├── run_tests.sh                 # Script file to run acceptance tests      
├── run_zap_tests.sh             # Script file to run security tests on jenkins
└── run_zap_tests_local.sh       # Script file to run security tests on local
```

It is built using the following:
- Cucumber(BDD),
- Selenium-WebDriver,
- SBT (build tool),
- Scala

###Getting started
- Ensure that you have installed IntelliJ Idea
- Once you have installed IntelliJ IDEA, install plugins: Cucumber for scala, Gherkin.
- Make sure you have cloned the below respositories
  - https://github.com/hmrc/pillar2-frontend
  - https://github.com/hmrc/pillar2
  - https://github.com/hmrc/pillar2-stubs
  - https://github.com/hmrc/pillar2-acceptance-tests
  
### Running the Test Suite

    Acceptance tests for Pillar2 Service
    =========================================

    How to use this ?
    -----------------
    1. Clone the project to a directory of your choice
    2. Import the project in IntelliJ
    3. Navigate to the directory where you have the cloned pillar2-frontend project. Run below command to use testonly route locally:
      `sbt "run -Dplay.http.router=testOnlyDoNotUseInAppConf.Routes 10050"
    4. On a terminal instance run: `sm --start PILLAR2_ALL`  
    5. Navigate to the directory where you have the cloned pillar2 acceptance testes project
    6. Run: `./run_tests.sh`
    
    IntelliJ 
    ---------
    - Create a new JUnit task and set the class to uk.gov.hmrc.test.ui.cucumber.runner
    - Change use "classpath of module" to pillar2-acceptance-tests     

###Source code formatting
We use Scalafmt to format our code base.

In case of contribution and you are an IntelliJ user, you should install the scalafmt plugin, select Scalafmt 
as Formatter and flag the checkbox "Reformat on file save" (_Settings -> Editor -> Code Style -> Scala). 
You can format your code by using the alt+shift+L or option+command+L shortcut

Format at project level under src/test

`sbt test:scalafmt`

#### Run acceptance tests locally and on Jenkins
`./run_tests.sh`

#### Run security tests locally
To run zap tests for any of the services, download from https://www.zaproxy.org/download/, extract and execute the 
following in the root of the extracted folder:

`./zap.sh -daemon -config api.disablekey=true -port 11000`
and run

`./run_zap_tests_local.sh`

#### Run security tests on jenkins
`./run_zap_tests.sh`

#### Run accessibility tests locally
`./run_accessibility_tests.sh`


### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").