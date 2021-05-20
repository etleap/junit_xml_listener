name := "Simple sbt Project"

version := "0.1"

scalaVersion := "2.12.13"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))
