val scalafixSettings = Seq(
  semanticdbEnabled := true,                       // enable SemanticDB
  semanticdbVersion := scalafixSemanticdb.revision // "4.4.0"
)

lazy val root = (project in file("."))
  .disablePlugins(
    JUnitXmlReportPlugin
  ) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .enablePlugins(ScalafixPlugin)
  .settings(
    name         := "pillar2-acceptance-tests",
    version      := "0.1.0",
    scalaVersion := "2.13.12",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test,
    // The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
    Test / testOptions := Seq.empty,
    scalafixSettings
  ).aggregate(uiTests, apiTests)

lazy val uiTests = (project in file("./ui-tests")).disablePlugins(
  JUnitXmlReportPlugin
) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .enablePlugins(ScalafixPlugin)
  .settings(
    name         := "pillar2-ui-acceptance-tests",
    scalaVersion := "2.13.12",
    version      := "0.1.0",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test,
    Test / testOptions := Seq.empty,
    scalafixSettings
  )

lazy val apiTests = (project in file("./api-tests")).disablePlugins(
  JUnitXmlReportPlugin
) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .enablePlugins(ScalafixPlugin)
  .settings(
    name         := "pillar2-api-acceptance-tests",
    scalaVersion := "2.13.12",
    version      := "0.1.0",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test,
    Test / testOptions := Seq.empty,
    scalafixSettings
  )

addCommandAlias(
  "prePrChecks",
  ";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check"
)
addCommandAlias("lint", ";scalafmtAll;scalafmtSbt;scalafixAll")
