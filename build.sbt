name := "sample-project"
organization := "com.michaelpollmeier"
scalaVersion := "2.13.6"

libraryDependencies += "com.michaelpollmeier" %% "sample-intermediate-dependency" % "0.0.2"

resolvers += Resolver.mavenLocal
