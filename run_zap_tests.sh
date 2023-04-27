#!/usr/bin/env bash

set -e

browser="chrome"
if [ $# -gt 0  ];
then
  browser="$1"
fi

environment="local"
tags="@ZAP"

echo "*** running on $environment using $browser for tags '$tags' ***"

sbt -Dzap.proxy=true -Denvironment="$environment" -Dbrowser="$browser" -Dcucumber.options="--tags '$tags'" clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner'

sbt 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Pillar2ZapTestRunner'
