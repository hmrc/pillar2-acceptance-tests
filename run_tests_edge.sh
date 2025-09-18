#!/usr/bin/env bash

# Default values
ENV="staging"
BROWSER="edge"

# Optionally allow overriding via arguments
if [ -n "$1" ]; then
  ENV="$1"
fi

# Check for EDGE_DRIVER_PATH
if [ -z "$EDGE_DRIVER_PATH" ]; then
    echo "ERROR: EDGE_DRIVER_PATH is not set."
    echo "Please run: export EDGE_DRIVER_PATH=/path/to/msedgedriver"
    exit 1
fi

echo "Running Edge tests with driver: $EDGE_DRIVER_PATH"
echo "Environment: $ENV"

sbt clean -Dbrowser="$BROWSER" -Denvironment="$ENV" -Dwebdriver.edge.driver="$EDGE_DRIVER_PATH" "testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner" testReport
