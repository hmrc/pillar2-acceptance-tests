#!/usr/bin/env bash

BROWSER=$1
ENVIRONMENT=$2

sbt clean -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dsecurity.assessment=true "testOnly uk.gov.hmrc.test.ui.specs.* -- -n AcceptanceTests" testReport