// import scalariform.formatter.preferences._
// import com.typesafe.sbt.SbtScalariform
// import com.typesafe.sbt.SbtScalariform.ScalariformKeys

name := "tryspk"

version := "1.0"

//scalaVersion := "2.12.2"
scalaVersion := "2.11.8"
//sparkVersion := "2.1.0"

//sparkComponents ++= Seq("sql", "hive")

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.0"//%"provided"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.0.0"
