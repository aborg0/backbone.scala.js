//import SonatypeKeys._

//sonatypeSettings

// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

organization := "com.mind_era"

name := "backbone-scala-js"

version := "0.0.10000"

scalaVersion := "2.11.6"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies += "com.mind_era" %%% "underscore-scala-js" % "0.0.10700"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += "org.webjars" % "backbonejs" % "1.0.0-1" / "backbone.js"

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