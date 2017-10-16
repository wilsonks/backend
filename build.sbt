import sbt.Keys.fullClasspath
import sbtassembly.AssemblyPlugin.autoImport.assemblyOption



lazy val root = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(moduleSettings)
  .settings(libraryDependencies += jdbc)
  .settings(libraryDependencies += ehcache)
  .settings(libraryDependencies += ws)
  .settings(libraryDependencies += evolutions)
  .settings(libraryDependencies += library("macwire"))
  .settings(libraryDependencies += library("postgresql"))
  .settings(libraryDependencies += library("scalikejdbc"))
  .settings(libraryDependencies += library("scalikejdbc-config"))
  .settings(libraryDependencies += library("logback-classic"))
  .settings(libraryDependencies += library("jBCrypt"))
  .settings(libraryDependencies += library("scalatestplus-play"))
  .settings(libraryDependencies += library("slf4j-jul"))
  .settings(libraryDependencies += library("mockito-core"))
  .settings(
    mainClass in assembly := Some("play.core.server.NettyServer"),
    assemblyJarName in assembly := "reporting-backend-1.0.jar",
    assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = true, includeDependency = true),
    fullClasspath in assembly += Attributed.blank(PlayKeys.playPackageAssets.value),
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
    }
  )



lazy val library = Map(
  "macwire" -> "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided",
  "postgresql" -> "org.postgresql" % "postgresql" % "42.1.1",
  "scalikejdbc" -> "org.scalikejdbc" %% "scalikejdbc" % "3.0.0",
  "scalikejdbc-config" -> "org.scalikejdbc" %% "scalikejdbc-config"  % "3.0.0",
  "logback-classic" -> "ch.qos.logback"  %  "logback-classic" % "1.2.3",
  "jBCrypt" -> "de.svenkubiak" % "jBCrypt" % "0.4.1",
  "scalatestplus-play" -> "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % "test",
  "slf4j-jul" -> "org.slf4j" % "jul-to-slf4j" % "1.7.25",
  "mockito-core" -> "org.mockito" % "mockito-core" % "2.7.22" % "test")

//lazy val versions = Map(
//  "device" -> "0.5.8",
//  "display" -> "0.7.3",
//  "gdx" -> "1.9.6")

lazy val aggregateSettings = sharedSettings ++ noPublish ++ noSources

lazy val moduleSettings = sharedSettings ++ publishSettings

lazy val sharedSettings = Seq(
  name := """reporting-backend""",
  version := "0.0.1",
  organization := "backend",
  licenses += ("Tykhe Software License Agreement" -> url("https://tykhegaming.github.io/LICENSE.txt")),
  credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
  updateOptions := updateOptions.value.withCachedResolution(true),
  scalaVersion := "2.12.2",
  crossScalaVersions := Seq("2.11.11", "2.12.2"),
  pipelineStages := Seq(digest),
  javacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, majorVersion)) if majorVersion <= 11 => Seq("-source", "1.6", "-target", "1.6")
    case _                                             => Seq("-source", "1.8", "-target", "1.8")
  }),
  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, majorVersion)) if majorVersion <= 11 => Seq("-target:jvm-1.6")
    case _                                             => Seq.empty
  }),
  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, majorVersion)) if majorVersion >= 11 => Seq(

      "-Xlint:adapted-args", // warn if an argument list is modified to match the receiver
      "-Xlint:nullary-unit", // warn when nullary methods return Unit
      "-Xlint:inaccessible", // warn about inaccessible types in method signatures
      "-Xlint:nullary-override", // warn when non-nullary `def f()' overrides nullary `def f'
      "-Xlint:infer-any", // warn when a type argument is inferred to be `Any`
      "-Xlint:missing-interpolator", // a string literal appears to be missing an interpolator id
      "-Xlint:doc-detached", // a ScalaDoc comment appears to be detached from its element
      "-Xlint:private-shadow", // a private field (or class parameter) shadows a superclass field
      "-Xlint:type-parameter-shadow", // a local type parameter shadows a type already in scope
      "-Xlint:poly-implicit-overload", // parameterized overloaded implicit methods are not visible as view bounds
      "-Xlint:option-implicit", // Option.apply used implicit view
      "-Xlint:delayedinit-select", // Selecting member of DelayedInit
      "-Xlint:by-name-right-associative", // By-name parameter of right associative operator
      "-Xlint:package-object-classes", // Class or object defined in package object
      "-Xlint:unsound-match" // Pattern match may not be typesafe
    )
    case _                                             => Seq.empty
  }),
  scalacOptions ++= Seq(
    "-unchecked", // enable additional warnings where generated code depends on assumptions
    "-deprecation", // emit warning for usages of deprecated APIs
    "-feature", // emit warning usages of features that should be imported explicitly
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-Ywarn-inaccessible"),
  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 10))           => Seq()
    case Some((2, n)) if n >= 11 => Seq(
      "-Xexperimental", // for SAM support in 2.11
      "-Ywarn-unused-import")
  }),
  scalacOptions in(Compile, console) ~= {
    _.filterNot("-Ywarn-unused-import" == _)
  },
  scalacOptions in(Test, console) ~= {
    _.filterNot("-Ywarn-unused-import" == _)
  },
  autoAPIMappings := true,
  scalacOptions in(Compile, doc) ~= (_ filterNot (_ == "-Xfatal-warnings")), // filter fatal warnings to release
  scalacOptions in ThisBuild ++= Seq(
    "-sourcepath", file(".").getAbsolutePath.replaceAll("[.]$", "") // used by the doc-source-url feature to resolve source file path
  ))

lazy val publishSettings = Seq(
  publishMavenStyle := true,
  publishTo := Option("Tykhe Artifactory" at "http://repo-desktop:8081/artifactory/" + (
    if (isSnapshot.value) s"tykhe-snapshots;build.timestamp=${new java.util.Date().getTime}" else "tykhe-releases")))

lazy val noPublish = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false,
  publishTo := None)

lazy val noSources = Seq(
  autoScalaLibrary := false,
  aggregate in update := false,
  sourcesInBase := false,
  sources in Compile := Seq.empty)

