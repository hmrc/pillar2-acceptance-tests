#!/usr/bin/env bash

browser="chrome"
if [ $# -gt 0  ];
then
  browser="$1"
fi

environment="local"

sbt -Denvironment="$environment" -Dbrowser="$browser"  clean 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.ZapRunner'
