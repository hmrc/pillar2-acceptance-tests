#!/usr/bin/env bash

browser="chrome"
if [ $# -gt 0  ];
then
  browser="$1"
fi

environment="local"

export ZAP_FORWARD_ENABLE="true"
export ZAP_FORWARD_PORTS=$(lsof -i -P | grep LISTEN | grep :$PORT | grep java | awk '{ print $9}' | sed 's/\*://g' | paste -sd " " -)

export ZAP_LOCAL_ALERT_FILTERS="${PWD}/alert-filters.json"


(
  cd $WORKSPACE/dast-config-manager
  make local-zap-running
)

echo "Running tests..."
echo "=========================================="
echo "Browser:              ${browser}"
echo "Env:                  ${environment}"
echo "ZAP Proxy Required:   true"
echo "ZAP alert filters:    ${ZAP_LOCAL_ALERT_FILTERS}"
echo "=========================================="


echo "Running tests via ZAP proxy..."
sbt -Dbrowser=$browser -Denvironment=$environment -Dzap.proxy=true clean test

(
  cd $WORKSPACE/dast-config-manager
  make local-zap-stop
)