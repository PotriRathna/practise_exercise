package org.example
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.log4j.{Level, Logger}
object Firstpgrm {
  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate();

    println("First SparkContext:")
    println("APP Name :" + spark.sparkContext.appName)
    println("Deploy Mode :" + spark.sparkContext.deployMode)
    println("Master :" + spark.sparkContext.master)

    val sparkSession2 = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample-test")
      .getOrCreate();

    println("Second SparkContext:")
    println("APP Name :" + sparkSession2.sparkContext.appName);
    println("Deploy Mode :" + sparkSession2.sparkContext.deployMode);
    println("Master :" + sparkSession2.sparkContext.master);
  }
}
