#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

tags="@batch2 and not @ignore"
echo "*** running on $ENVIRONMENT using $BROWSER for tags '$tags' ***"

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerBatch2" testReport
