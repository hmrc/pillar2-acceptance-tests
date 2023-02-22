#!/usr/bin/env bash

set -e

environment="local"
tags="not @smoke and not @externalTest_canned_data"
if [ $# -gt 0 -a "$1" != "$environment" ];
then
  environment="$1"
  tags="not @ignore and not @externalTest_canned_data"
fi

echo "*** running on $environment for tags '$tags' ***"
sbt -Dhttp.proxyHost=localhost -Dhttp.proxyPort=11000 -Denvironment="$environment" -Dcucumber.options="--tags '$tags'" clean "testOnly uk.gov.hmrc.test.ui.cucumber.runner.ZapRunner"
