name := "NCAA Basketball Learn"

version := "0.0.1"

scalaVersion := "2.10.4"

resolvers += "cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.1"
libraryDependencies += "ai.h2o" %% "sparkling-water-core" % "0.2.9"
