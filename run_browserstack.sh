#!/bin/bash
ENV="local"
if [ "$1" = "qa" ] || [ "$1" = "staging" ]
then
    ENV="$1"
fi
echo "Environment : $ENV"
OS="`uname`"
case $OS in
  'Linux')
echo "BrowserStackLocal instances:"
pidof BrowserStackLocal
if pidof BrowserStackLocal; then
  echo "BrowserStackLocal running already"
else
	if [ -f ./BrowserStackLocal ];
	then
	   echo "File BrowserStackLocal exists."
	else
	   	wget https://www.browserstack.com/browserstack-local/BrowserStackLocal-linux-x64.zip
  	    unzip BrowserStackLocal-linux-x64.zip
	fi
    . ./src/test/resources/browserConfig.properties
  echo "username : $username"
  ./BrowserStackLocal --key $automatekey &
fi
;;
  'Darwin')
  echo "running Broswerstack on Mac"
  	if [ -f ./BrowserStackLocal ];
  	then
  	   echo "File BrowserStackLocal exists."
  	else
  	    echo "downloading mac osx browsetstack driver..."
  	   	curl -O https://www.browserstack.com/browserstack-local/BrowserStackLocal-darwin-x64.zip
    	unzip BrowserStackLocal-darwin-x64.zip
  	fi
    . ./src/test/resources/browserConfig.properties
  echo "username : $username"
   ./BrowserStackLocal --key $automatekey &
      ;;
  *) ;;
esac

function checkCode() {
if [ $1 != 0 ]
then
    buildfailed="failed"
fi
}

function checkFailed() {
if [ "$buildfailed" = "failed" ]
then
    exit +1
fi

}

sbt -Dbrowser=browserstack -Dbrowserstack.project="Pillar2" -Dbrowserstack.build="Pillar2" -Dbrowserstack.username="srikanth_4gzJk9" -Dbrowserstack.key="hgWQP4jwtByP5DpZhJ3J"  -Denvironment="$ENV" -Dbrowserstack.idleTimeout="150" -Dbrowserstack.browser_version="112" -Dbrowserstack.browser="Chrome" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="11" 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.BrowserStackTestRunner'
vhjklkjjkl;kmn'\\\ll;'''''''';l,                  b  nbb b '