/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package gradle.spark.quickstart

import org.apache.spark.sql.{DataFrame, Dataset, SparkSession}

object App {
  def main(args: Array[String]): Unit = {
    some().show()
  }

  def some(): Dataset[Int] = {
    val spark = SparkSession
      .builder()
      .appName("test")
      .master("local")
      .getOrCreate()
    import spark.implicits._
    spark
      .sql("SELECT 1")
      .toDF()
      .as[Int]
  }
}
