organization := "com.github.jw3"

name := "bdi"

version := "0.1-SNAPSHOT"

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.7"

scalacOptions += "-target:jvm-1.8"

libraryDependencies := Seq(
    "io.reactivex" %% "rxscala" % "0.25.0",
    "org.openrdf.sesame" % "sesame-model" % "4.0.1",
    "com.typesafe.akka" %% "akka-actor" % "2.4.0",
    "com.typesafe.akka" %% "akka-slf4j" % "2.4.0" % Runtime,

    "org.scalatest" %% "scalatest" % "2.2.5" % Test,
    "com.typesafe.akka" %% "akka-testkit" % "2.4.0" % Test,
    "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % Test
)