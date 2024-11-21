import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"  % "0.42.0",
    "uk.gov.hmrc"         %% "api-test-runner" % "0.7.0",
    "org.slf4j"            % "slf4j-simple"    % "1.7.36",
    "org.scalatest"       %% "scalatest"       % "3.2.17",
    "org.scalatestplus"   %% "selenium-4-12"   % "3.2.17.0",
    "org.playframework"   %% "play-json"       % "3.0.4",
    "org.scalaj"          %% "scalaj-http"     % "2.4.2",
    "com.vladsch.flexmark" % "flexmark-all"    % "0.62.2",
    "io.cucumber"         %% "cucumber-scala"  % "8.25.0",
    "io.cucumber"          % "cucumber-junit"  % "7.20.1",
    "junit"                % "junit"           % "4.13.2",
    "com.novocode"         % "junit-interface" % "0.11",
    "com.typesafe"         % "config"          % "1.4.3"
  ).map(_ % Test)

}
