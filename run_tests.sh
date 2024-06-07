#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport
