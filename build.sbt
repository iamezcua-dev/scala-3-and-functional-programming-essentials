val scala3Version = "3.8.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-3-and-functional-programming-essentials-rtjvm",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.3.0" % Test
  )

scalacOptions += "-deprecation"
