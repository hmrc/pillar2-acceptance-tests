#!/usr/bin/env bash

ENV="local"
BROWSER="chrome"

tags="@batch2 and not @ignore"
echo "*** running on $ENVIRONMENT using $BROWSER for tags '$tags' ***"

sbt -Dlogback.configurationFile=logback.xml -Dbrowser=$BROWSER -Denvironment=$ENV -Daccessibility.test=true "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerBatch2" testReport