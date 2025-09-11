#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dcucumber.filter.tags="@newTests and not @ignore and not @tests" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport
