// eclipse plugin
resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "latest.integration")

// idea plugin
resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.3.0-SNAPSHOT")

// scalariform
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "latest.integration")

