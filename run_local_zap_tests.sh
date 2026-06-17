#!/usr/bin/env bash

TEST_TAG="${TEST_TAG:-AcceptanceTests}"
set -euo pipefail

BROWSER="${1:-chrome}"
ENVIRONMENT="${2:-local}"
DAST_DIR="${DAST_DIR:-${WORKSPACE:-$HOME/workspace}/dast-config-manager}"

for tool in git docker sbt sm2 ifconfig make; do
  command -v "$tool" >/dev/null || {
    echo "Missing required tool: $tool"
    exit 1
  }
done

[[ -d "$DAST_DIR" ]] || {
  echo "Missing dast-config-manager at: $DAST_DIR"
  exit 1
}


export ZAP_FAIL_ON_SEVERITY="${ZAP_FAIL_ON_SEVERITY:-Low}"
export ZAP_FORWARD_ENABLE=true
export ZAP_FORWARD_PORTS
ZAP_FORWARD_PORTS="$(sm2 -s --format-plain | awk '$NF ~ /PASS|BOOT/ && $3 ~ /^[0-9]+$/ { print $3 }' | paste -sd " " -) 10050"

[[ -n "$ZAP_FORWARD_PORTS" ]] || {
  echo "No running service ports found. Start services first."
  exit 1
}

[[ -f alert-filters.json ]] && export ZAP_LOCAL_ALERT_FILTERS="$PWD/alert-filters.json"

trap 'cd "$DAST_DIR" && make local-zap-stop || true' EXIT

(
  cd "$DAST_DIR"
  git pull --ff-only
  make local-zap-running
  echo "Forwarding ports to ZAP: $ZAP_FORWARD_PORTS"
)

sbt \
  -Dbrowser="$BROWSER" \
  -Denvironment="$ENVIRONMENT" \
  -Dsecurity.assessment=true \
  "testOnly uk.gov.hmrc.test.ui.specs.* -- -n ${TEST_TAG}"

echo "DAST report: $DAST_DIR/target/dast-reports/index.html"