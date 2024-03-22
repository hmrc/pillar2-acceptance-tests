echo "Running ZAP tests"

sbt -Dbrowser=remote-chrome -Denvironment=local -Dzap.proxy=true clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.ZapRunner' testReport