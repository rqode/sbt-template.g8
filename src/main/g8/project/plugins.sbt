resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

// works only with sbt 0.13
// addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

// another more versatile packager - requires enabling in build.sbt
// - https://github.com/sbt/sbt-native-packager
// - http://fruzenshtein.com/how-to-build-deploy-scala-application/
//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.2")
