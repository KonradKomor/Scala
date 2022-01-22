ThisBuild / organization := "pl.ka.erp"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.8"
ThisBuild / exportJars := true


lazy val root = (project in file("."))
  .aggregate(bl, db, ws)

lazy val bl = (project in file("bl"))
  .settings(
    name := "bl",
    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter" % "2.5.7",
      "org.scalatest" %% "scalatest" % "3.0.8" % Test
    ))

lazy val db = (project in file("db"))
  .settings(name := "db").dependsOn(bl)

lazy val ws = (project in file("ws"))
  .settings(name := "ws").dependsOn(db)

