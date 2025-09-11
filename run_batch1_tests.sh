#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

tags="@batch1 and not @ignore"
echo "*** running on $ENVIRONMENT using $BROWSER for tags '$tags' ***"

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dcucumber.filter.tags="@batch1 and not @ignore and not @tests" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport
