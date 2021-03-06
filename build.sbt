//import SonatypeKeys._

//sonatypeSettings

// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

organization := "com.mind_era"

name := "backbone-scala-js"

version := "0.0.10000"

scalaVersion := "2.11.7"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

//libraryDependencies += "com.mind_era" %%% "underscore-scala-js" % "0.0.10700"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % "test"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0-M6" % "test"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += RuntimeDOM % "test"

jsDependencies += "org.webjars" % "underscorejs" % "1.8.3" / "underscore.js"

jsDependencies += "org.webjars" % "backbonejs" % "1.0.0-1" / "backbone.js" dependsOn "underscore.js"

skip in packageJSDependencies := false

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds",
  "-language:reflectiveCalls",
  "-Xlint",
//  "-Xfatal-warnings",
  "-Yno-adapted-args",
//  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

//publishMavenStyle := true

pomIncludeRepository := { x => false }

//credentials += Credentials(Path.userHome / ".ivy2" / "sonatype.credentials")