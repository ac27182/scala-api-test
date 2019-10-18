lazy val root = (project in file("."))
  .settings(
    name := "scala-api-test",
    version := "1.0",
    scalaVersion := "2.12.10",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      "org.http4s" %% "http4s-blaze-server" % "0.20.8",
      "org.http4s" %% "http4s-blaze-client" % "0.20.8",
      "org.http4s" %% "http4s-circe" % "0.20.8",
      "org.http4s" %% "http4s-dsl" % "0.20.8"
    ),
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0")
  )

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)
