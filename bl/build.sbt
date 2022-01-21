name := "scalaTest"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter" % "2.5.7",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)