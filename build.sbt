ThisBuild / organization := "pl.ka.erp"
ThisBuild / version      := "0.1"
ThisBuild / scalaVersion := "2.13.8"
ThisBuild / exportJars := true


lazy val root = (project in file("."))
  .aggregate(bl,db,ws)

lazy val bl = (project in file("bl"))

lazy val db = (project in file("db")).dependsOn(bl)

lazy val ws = (project in file("ws")).dependsOn(db)

