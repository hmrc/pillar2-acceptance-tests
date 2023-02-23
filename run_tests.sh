#!/bin/bash -e
browser="chrome"
if [ $# -gt 0  ];
then
  browser="$1"
fi

environment="local"
tags="not @ignore"
if [ $# -gt 1 -a "$2" != "$environment" ];
then
  environment="$2"
  tags="@smoke"
fi

sbt -Denvironment="$environment" -Dbrowser="$browser" -Dcucumber.options="--tags '$tags'" clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner'
