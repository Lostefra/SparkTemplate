name := "SparkTemplate"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.3"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

scalacOptions := Seq("-target:jvm-1.8")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % sparkVersion % Provided
)

