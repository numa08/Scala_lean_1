import scalariform.formatter.preferences._

name := "scala_lean_1"

version := "0.1.0"

scalaVersion := "2.10.0"

scalariformSettings

ScalariformKeys.preferences := FormattingPreferences()
  .setPreference(AlignSingleLineCaseStatements, true)
