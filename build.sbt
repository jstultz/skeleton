lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.1.7" % "test",
      "org.scalamock" %% "scalamock-scalatest-support" % "3.2.1" % "test"
    )
  )
