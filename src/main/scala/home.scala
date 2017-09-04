package in.steeltown.lib

import org.apache.spark.sql.{ DataFrame, SparkSession }
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._
import org.apache.spark.sql.functions.col

object tryspk  {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
   .builder
   .appName("SparkSQL")
   .master("local[*]")
   .config("spark.sql.warehouse.dir", "file:///d:/temp") // Necessary to work around a Windows bug in Spark 2.0.0; omit if you're not on Windows.
   .getOrCreate()

   import spark.implicits._

      val vk = Seq(("adam",20),("sam",19)).toDF("name","age")
      vk.select(length($"name")).show()
  vk.write.mode("overwrite").csv("d://Users/vk.csv")
  }

}
