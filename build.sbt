sbtPlugin := true

name := "junit_xml_listener"

description := "A simple plugin that outputs JUnit-Style XML Files that contain Test results."

sbtVersion := "0.13.1"

scalaVersion := "2.10.3"

publishMavenStyle := true

organization := "com.alpinenow"

version := "0.4.2-SNAPSHOT"

scalacOptions := Seq("-deprecation", "-unchecked")

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/AlpineNow/junit_xml_listener</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/AlpineNow/junit_xml_listener.git</url>
    <connection>scm:git:git://github.com/AlpineNow/junit_xml_listener.git</connection>
  </scm>
  <developers>
  <developer>
    <id>dbtsai</id>
    <name>DB Tsai</name>
    <url>http://www.dbtsai.com/</url>
  </developer>
  <developer>
    <id>chenkelmann</id>
    <name>Christoph Henkelmann</name>
    <url>http://henkelmann.eu/</url>
  </developer>    
  </developers>)


