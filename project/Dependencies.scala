import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"          %% "ui-test-runner"        % "0.30.0",
    "org.slf4j"             % "slf4j-simple"          % "1.7.36",
    "org.scalatest"        %% "scalatest"             % "3.2.18",
    "org.scalatestplus"    %% "selenium-4-12"         % "3.2.17.0",
    "com.vladsch.flexmark"  % "flexmark-all"          % "0.64.8",
    "io.cucumber"          %% "cucumber-scala"        % "8.20.0",
    "io.cucumber"           % "cucumber-junit"        % "7.15.0",
    "junit"                 % "junit"                 % "4.13.2",
    "com.novocode"          % "junit-interface"       % "0.11",
    "com.typesafe"          % "config"                % "1.4.2"
  ).map(_ % Test)

}
