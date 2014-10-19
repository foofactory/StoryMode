import play.PlayJava

name := """story-mode"""

version := "1.0"

lazy val root = (project in file(".")).addPlugins(PlayJava)

libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.3",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootswatch-spacelab" % "3.2.0-1",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "com.orientechnologies" % "orientdb-graphdb" % "2.0-M2",
  "org.webjars" % "d3js" % "3.4.11",
  "org.webjars" % "jquery" % "1.11.1",
  "org.webjars" % "angularjs-nvd3-directives" % "0.0.7-1",
  "org.webjars" % "angularjs" % "1.3.0" exclude("org.webjars", "jquery")
)