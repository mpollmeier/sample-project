name := "sample-project"
ThisBuild/scalaVersion := "2.13.6"

libraryDependencies += "com.michaelpollmeier" %% "sample-dependency" % "0.0.2"
ThisBuild/libraryDependencies += "com.michaelpollmeier" %% "sample-dependency" % "0.0.1"

val subproject1 = project
dependsOn(subproject1)
