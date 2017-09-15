
// Project name
name := "sankul_rawat_hw1"

version := "1.0"

description := "Cloud HW1, Sankul Rawat"

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false
crossPaths := false

libraryDependencies ++= Seq(
 // http://mvnrepository.com/artifact/junit/junit
"junit" % "junit" % "4.12",

  // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
 "org.junit.jupiter" % "junit-jupiter-engine" % "5.0.0-M1" % "test",

// https://mvnrepository.com/artifact/org.json/json
"org.json" % "json" % "20170516",

// https://mvnrepository.com/artifact/com.jtattoo/JTattoo
"com.jtattoo" % "JTattoo" % "1.6.11",

  // https://mvnrepository.com/artifact/pircbot/pircbot
"pircbot" % "pircbot" % "1.5.0",
// https://mvnrepository.com/artifact/org.imgscalr/imgscalr-lib
"org.imgscalr" % "imgscalr-lib" % "4.2",

"com.novocode" % "junit-interface" % "0.11" % "test"
)
/*
//docs https://github.com/sbt/junit-interface
testOptions += Tests.Argument(TestFrameworks.JUnit
  //tests to run, Only individual test case names are matched
  //, --tests=<REGEXPS>
)
*/
testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

