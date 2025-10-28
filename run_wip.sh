#!/bin/bash -e
DEFAULT_BROWSER=chrome
BROWSER_TYPE=$1
ENV=$2

if [ -z "$BROWSER_TYPE" ]; then
    echo "BROWSER_TYPE value not set, defaulting to $DEFAULT_BROWSER..."
    echo ""
fi

# Scalafmt checks have been separated from the test command to avoid OutOfMemoryError in Jenkins - TO ADD BACK IN
#sbt scalafmtAll
#sbt scalafmtCheckAll scalafmtSbtCheck

# -n Wip Runs only the tests tagged as Wip in the specs package.
sbt -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Denv="${ENV:=staging}" "testOnly uk.gov.hmrc.test.ui.specs.* -- -n Wip"