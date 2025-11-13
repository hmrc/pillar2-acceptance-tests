#!/usr/bin/env bash

#ENV="local"
#BROWSER="chrome"
#
#sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport

BROWSER=$1
ENVIRONMENT=$2

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dsecurity.assessment=false "testOnly uk.gov.hmrc.test.ui.specs.* -- -n AcceptanceTests" testReport