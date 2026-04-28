lazy val testSuite = (project in file("."))
  .disablePlugins(JUnitXmlReportPlugin) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .enablePlugins(ScalafixPlugin)
  .settings(
    name         := "pillar2-acceptance-tests",
    version      := "0.1.0",
    scalaVersion := "3.3.6",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test,
    semanticdbEnabled := true
  )

addCommandAlias("prePrChecks", ";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check")
addCommandAlias("lint", ";scalafmtAll;scalafmtSbt;scalafixAll")
