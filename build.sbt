scalaVersion := scalaV.v213

libraryDependencies ++= libScalax.`jsoup`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`javet`.value
libraryDependencies ++= libScalax.`javet-node-windows-x86_64`.value
libraryDependencies ++= libScalax.`circe`.value
libraryDependencies ++= libScalax.`circe-extras`.value

run / fork := true

scalafmtOnCompile := true
scalacOptions += "-Ymacro-annotations"

Global / onChangedBuildSource := ReloadOnSourceChanges
