lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT",
      javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
      // For project with only Java sources. In order to compile Scala sources, remove the following two lines.
      crossPaths := false,
      autoScalaLibrary := false
    )),
    name := "TestAutomation",
    libraryDependencies ++= Seq(
      "io.vavr" % "vavr" % "0.9.2",
      "junit" % "junit" % "4.12" % "test",
      "com.codeborne" % "selenide" % "4.12.2",
      "org.seleniumhq.selenium" % "selenium-java" % "3.13.0" % "test",
      "io.cucumber" % "cucumber-java" % "2.0.0",
      "io.cucumber" % "cucumber-core" % "2.0.0",
      "io.cucumber" % "cucumber-junit" % "2.0.0" % Test,
      "io.cucumber" % "gherkin" % "5.1.0"
    )
  )