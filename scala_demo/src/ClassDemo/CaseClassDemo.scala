package ClassDemo

import scala.util.Random

/**
  * 在Scala中，样例类是一种特殊的类，可用于模式匹配。
  * case class 是多例的，后面要跟构造参数
  * case object是单例的
  *
  * */
case class SubmitTask(id:String,name:String)
case class HeartBeat(time:Long)
case object CheckTimeOutTask

object CaseClassDemo extends App {
  val arr = Array(CheckTimeOutTask,HeartBeat(12333),SubmitTask("0001","task-001"))
  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id,name)=>{
      println(s"$id, $name")
  }
    case HeartBeat(time)=>{
      println(time)
    }
    case CheckTimeOutTask=>{
      println("Check!!")
    }
  }
}
