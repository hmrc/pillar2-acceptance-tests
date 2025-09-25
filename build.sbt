val scalafixSettings = Seq(
  semanticdbEnabled := true,                       // enable SemanticDB
  semanticdbVersion := scalafixSemanticdb.revision // "4.4.0"
)

lazy val testSuite = (project in file("."))
  .disablePlugins(
    JUnitXmlReportPlugin
  ) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .enablePlugins(ScalafixPlugin)
  .settings(
    name         := "pillar2-acceptance-tests",
    version      := "0.1.0",
    scalaVersion := "2.13.16",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test,
    libraryDependencies += "org.seleniumhq.selenium" % "selenium-devtools-v138" % "4.35.0",
    libraryDependencies += "org.seleniumhq.selenium" % "selenium-support" % "4.24.0",
    libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "4.24.0",
    Test / testOptions := Seq.empty,
    scalafixSettings
  )

addCommandAlias("prePrChecks", ";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check")
addCommandAlias("lint", ";scalafmtAll;scalafmtSbt;scalafixAll")
