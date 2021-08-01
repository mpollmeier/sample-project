name := "sample-project"
organization := "com.michaelpollmeier"
scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "com.michaelpollmeier" %% "sample-intermediate-dependency" % "0.0.2",
  "com.michaelpollmeier" %% "sample-intermediate-dependency2" % "0.0.1",
)

resolvers += Resolver.mavenLocal
