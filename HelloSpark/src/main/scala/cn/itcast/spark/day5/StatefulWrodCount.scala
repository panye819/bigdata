package cn.itcast.spark.day5

import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

object StatefulWordCount {
  def main(args: Array[String]): Unit = {
    //设置日志级别，调整到WARN
    LoggerLevels.setStreamingLogLevels()

    val conf = new SparkConf().setAppName("StatefulWordCount").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val ssc = new StreamingContext(sc,Seconds(5))


    val ds = ssc.socketTextStream("127.0.0.1",9999)
    val result = ds.flatMap(_.split(" ")).map((_,1)).updateStateByKey()
  }
}
