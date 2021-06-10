name := "automationpractice-acceptance-tests"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "4.0.0-alpha-4",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.scala-lang" % "scala-library" % "2.11.7",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.4",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "info.cukes" % "cucumber-picocontainer" % "1.2.4",
  "junit" % "junit" % "4.13.1" % "test",
  "org.scalautils" % "scalautils_2.11" % "2.1.7",
  "org.apache.commons" % "commons-lang3" % "3.8.1",
  "io.github.bonigarcia" % "webdrivermanager" % "3.8.1",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "com.github.javafaker" % "javafaker" % "1.0.2"
  )
