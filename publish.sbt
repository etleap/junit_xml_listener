publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

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
      <id>chesterxgchen</id>
      <name>Chester Chen</name>
      <url>https://github.com/chesterxgchen</url>
    </developer>
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

