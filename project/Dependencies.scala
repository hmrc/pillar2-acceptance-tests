import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"          %% "ui-test-runner"        % "0.46.0",
    "org.slf4j"             % "slf4j-simple"          % "1.7.36",
    "org.scalatest"        %% "scalatest"             % "3.2.17",
    "org.scalatestplus"    %% "selenium-4-12"         % "3.2.17.0",
    "com.vladsch.flexmark"  % "flexmark-all"          % "0.62.2",
    "com.typesafe"          % "config"                % "1.4.2"
  ).map(_ % Test)

}
