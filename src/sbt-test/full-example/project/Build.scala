import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.alpinenow"
  val buildVersion      = "0.1"
  val buildScalaVersion = "2.10.3"

  val buildSettings = Defaults.defaultSettings ++ Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion,
    testListeners <<= (target, streams).map((t, s) => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath))),
    libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
  )
}

object FullBuild extends Build {
  lazy val root = Project (
    "cdap2",
    file ("."),
    settings = BuildSettings.buildSettings
  ) 
}

