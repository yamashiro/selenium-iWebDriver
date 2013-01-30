import sbt._
import Keys._

object MyBuild extends Build {
  lazy val root = Project(
    id = "selenium",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "selenium",
      scalaVersion := "2.10.0",
      version := "0.1-SNAPSHOT",
      resolvers += ScalaToolsSnapshots,
      scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked"),
      javacOptions ++= Seq("-encoding", "UTF-8", "-deprecation"),
      resolvers ++= Seq(
        "Twitter Repository" at "http://maven.twttr.com/",
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
        "Akka Repository" at "http://scalablesolutions.se/akka/repository",
        "Scala Tools Repository" at "http://scala-tools.org/repo-releases"
      ),
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2" % "1.13" % "test",
        "org.seleniumhq.selenium" % "selenium-java" % "2.28.0" % "test"
      )
    )

  )


}
