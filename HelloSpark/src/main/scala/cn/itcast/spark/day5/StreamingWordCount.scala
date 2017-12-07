package cn.itcast.spark.day5

import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

object StreamingWordCount {
  def main(args: Array[String]): Unit = {

    //设置日志级别，调整到WARN
    LoggerLevels.setStreamingLogLevels()
    //设置配置
    val conf = new SparkConf().setAppName("StreamingWordCount").setMaster("local[2]")
    //val sc = new SparkContext(conf)
    val ssc = new StreamingContext(conf,Seconds(15))

    //接收数据
    val ds = ssc.socketTextStream("127.0.0.1",8888)
    //Dstream是一个特殊的RDD
    val result = ds.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)
    //打印结果
    result.print()
    //启动进程
    ssc.start()
    //进程等待关闭
    ssc.awaitTermination()

  }

}
