#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

tags="@p2tests and not @ignore"
echo "*** running on $ENVIRONMENT using $BROWSER for tags '$tags' ***"

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dcucumber.filter.tags="@p2tests" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport
