#!/bin/bash -e

ENV="local"
BROWSER="chrome"

sbt -Dlogback.configurationFile=logback.xml -Dbrowser=$BROWSER -Denvironment=$ENV -Daccessibility.test=true "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport