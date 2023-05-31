
# pillar2-acceptance-tests

Acceptance tests for Pillar2 Application Features

## Examples
Pages in the application Testing
* https://www.staging.tax.service.gov.uk/auth-login-stub/gg-sign-in
* https://www.staging.tax.service.gov.uk/pillar-two
* https://www.staging.tax.service.gov.uk/pillar-two/trading-business-confirmation
* https://www.staging.tax.service.gov.uk/pillar-two/check-your-answers
* https://staging.tax.service.gov.uk/pillar-two/eligibility/activities-within-the-uk
* https://staging.tax.service.gov.uk/pillar-two/eligibility/kb-in-the-uk-ineligible
* https://www.staging.tax.service.gov.uk/pillar-two/eligibility/global-gross-revenue
* https://www.staging.tax.service.gov.uk/pillar-two/eligibility/kb-750-ineligible
* https://www.staging.tax.service.gov.uk/pillar-two/eligibility/confirmation

### Running the Test Suite

    Acceptance tests for Pillar2 Service
    =========================================

    How to use this ?
    --------

    1. Clone the project to a directory of your choice
    2. On a terminal instance run: `sm --start PILLAR2_ALL`
    3. Navigate to the directory where you have the cloned project
    4. Run: `./run_tests.sh`
    
    IntelliJ 
    ---------
    
    Create a new JUnit task and set the class to uk.gov.hmrc.test.ui.cucumber.runner
    Change use "classpath of module" to pillar2-acceptance-tests     

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").