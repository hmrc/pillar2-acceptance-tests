#!/usr/bin/env bash

BROWSER=${1:-chrome}
ENV=${2:-local}

sbt clean -Dbrowser=$BROWSER -Denv=$ENV "testOnly findyourninumberacceptancetests.specs.*" testReport