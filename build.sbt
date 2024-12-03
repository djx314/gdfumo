scalaVersion := scalaV.v213

libraryDependencies ++= libScalax.`jsoup`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`cats-core`.value

scalafmtOnCompile := true

Global / onChangedBuildSource := ReloadOnSourceChanges
