#!/bin/bash
if ! sh run_dependencies.sh; then
    echo "Failed to start BrowserStack"
    exit 1
fi

sleep 0.1000
#ENV="local"
#
#pids=`pidof BrowserStackLocal`
#if [ pids ]; then
#  echo "BrowserStackLocal process found."
#  else
#  echo "BrowserStackLocal process not found. You must run 'run_browserstackbinary.sh' in another terminal first."
#  exit -1
#fi
#
#if [ "$1" = "local" ] || [ "$1" = "qa" ] || [ "$1" = "staging" ]
#then
#    ENV="$1"
#fi
#echo "Environment : $ENV"
#
## Use this to choose which browser configurations to run against.
##declare -a setups=("")
#
#declare -a setups=("BS_Win11_Chrome_v112")
#
#for setup in "${setups[@]}"; do
#    echo "******************** Loading config from $setup.json ********************"
#    sbt -Dlogback.configurationFile=logback.xml -Dbrowser=browserstack -Dbrowserstack.username="srikanth_4gzJk9" -Dbrowserstack.key="hgWQP4jwtByP5DpZhJ3J" -DtestDevice="$setup" -Denvironment="$ENV" 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStackTests'
username="srikanth_4gzJk9"
automatekey="hgWQP4jwtByP5DpZhJ3J"
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.project="Pillar2" -Dbrowserstack.build="Pillar2" -Dbrowserstack.username=${username} -Dbrowserstack.key=${automatekey} -Dbrowserstack.browser_version="112" -Dbrowserstack.browser="Chrome" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="11" 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.BrowserStackRunner'
#done