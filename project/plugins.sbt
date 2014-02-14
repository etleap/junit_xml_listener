addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

libraryDependencies <+= sbtVersion(v => "org.scala-sbt" % "scripted-plugin" % v)
