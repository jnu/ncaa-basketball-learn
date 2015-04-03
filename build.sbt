name := "NCAA Basketball Learn"

version := "0.0.1"

scalaVersion := "2.10.4"

resolvers += "cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.5.0-cdh5.2.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.1" % "provided" exclude("javax.jms", "jms") exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri")
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.2.1"  % "provided" exclude("javax.jms", "jms") exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri")
libraryDependencies += "ai.h2o" %% "sparkling-water-core" % "0.2.9" exclude("javax.jms", "jms") exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri") exclude("javax.servlet", "servlet-api") exclude("stax", "stax-api") exclude("org.apache.xmlbeans","xmlbeans")
