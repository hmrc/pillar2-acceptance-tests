import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner" % "0.54.0",
    "org.slf4j"            % "slf4j-simple"   % "2.0.17",
    "org.scalatest"       %% "scalatest"      % "3.2.20",
    "org.scalatestplus"   %% "selenium-4-41"  % "3.2.20.0",
    "com.vladsch.flexmark" % "flexmark-all"   % "0.64.8",
    "com.typesafe"         % "config"         % "1.4.6"
  ).map(_ % Test)

}
