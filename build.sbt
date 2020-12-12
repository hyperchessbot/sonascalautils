ThisBuild / organization := "io.github.hyperchessbot"
ThisBuild / organizationName := "hyperchessbot"
ThisBuild / organizationHomepage := Some(url("https://github.com/hyperchessbot/scalautils/"))
ThisBuild / version := "1.0.0"

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/hyperchessbot/scalautils.git"),
    "scm:git@github.com/hyperchessbot/scalautils.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "hyperbot",
    name  = "Hyper Bot",
    email = "hyperchessbot@gmail.com",
    url   = url("https://github.com/hyperchessbot/scalautils")
  )
)

ThisBuild / description := "Scala utils."
ThisBuild / licenses := List("MIT" -> new URL("https://opensource.org/licenses/MIT"))
ThisBuild / homepage := Some(url("https://github.com/hyperchessbot/scalautils"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  /*if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else */Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credentials")