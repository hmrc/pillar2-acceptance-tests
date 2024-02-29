echo "Running ZAP tests"

sbt -Dbrowser=remote-chrome -Denvironment=local -Dzap.proxy=true -Dcucumber.filter.tags="@p2zap" clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner'