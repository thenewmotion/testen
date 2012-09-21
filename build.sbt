organization := "com.thenewmotion"

name := "testen"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.specs2"  %% "specs2"            % "1.12.1",
  "net.liftweb" %  "lift-webkit_2.9.1" % "2.4",
  "net.liftweb" %  "lift-common_2.9.1" % "2.4",
  "org.mockito" %  "mockito-all"       % "1.9.0"
)

releaseSettings