[![Build Status](https://api.travis-ci.org/AlpineNow/junit_xml_listener.png?branch=master)](https://travis-ci.org/AlpineNow/junit_xml_listener)


About
-----
The Junit XML Listener is a simple sbt test listener plugin that collects the results of test runs and writes them to an xml file formatted like the output of a JUnit run.
This allows the test results to be displayed in any tool that can display JUnit results (e.g. Jenkins)

Requirements
------------

* sbt 0.13.1

Installation
------------

Add the following lines to either ~/.sbt/plugins/build.sbt (user-specific) or project/plugins/build.sbt (project-specific):

    addSbtPlugin("com.alpinenow" % "junit_xml_listener" % "0.5.0")

This will add the dependency to the plugin. The next step is to configure your build to output the XML. The following will output the XML in target/test-reports:

    testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))

Note that the line as shown is enough in a *.sbt file. In *.scala files (full configuration), you must collect the result of the expression into the settings of all projects that should produce the XML output.

Examples
--------
For a basic project template using sbt, see the [simple-example](https://github.com/AlpineNow/junit_xml_listener/tree/master/src/sbt-test/simple-example) project.

For using full configuration example with `Build.scala`, see the [full-example](https://github.com/AlpineNow/junit_xml_listener/tree/master/src/sbt-test/full-example) project.

Version History
---------------

* 0.5 Supported sbt 0.13.1, and fixed the issue of that the time duration is always set to 0s. 
* 0.4 First version published to maven central (snapshots)
* 0.3 Merge of Ismael Juma's adjustments for sbt 0.10+
* 0.2 Added handling of skipped tests (thanks to Johannes Rudolph)
* 0.1 Initial release
