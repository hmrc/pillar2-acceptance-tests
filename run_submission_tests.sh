#!/bin/bash -e
browser="chrome"
if [ $# -gt 0  ];
then
  browser="$1"
fi

environment="local"

sbt -Denvironment="$environment" -Dbrowser="$browser" -Dcucumber.filter.tags="@p2tests" clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner'
