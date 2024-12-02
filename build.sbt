scalaVersion := scalaV.v3

libraryDependencies ++= libScalax.`jsoup`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-adt`.value

scalafmtOnCompile := true

Global / onChangedBuildSource := ReloadOnSourceChanges
