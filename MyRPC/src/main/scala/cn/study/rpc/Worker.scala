package cn.study.rpc

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
/**
  * 1、先建立连接
  * 2、拿到master的代理对象
  * 3、向master发送消息
  * 4、master向worker返回消息
  * */
class Worker(val masterHost:String,val masterPort:Int) extends Actor{
  var master :ActorSelection = _


  //建立连接
  override def preStart(): Unit = {
    master = context.actorSelection(s"akka.tcp://MasterSystem@$masterHost:$masterPort/user/Master")
    master !"connect"
  }

  override def receive: Receive = {
    case "reply" => {
      println("A replay from master...")
    }

  }
}

object Worker{
  def main(args: Array[String]): Unit = {
    val host = "127.0.0.1"
    val port = "19999".toInt
    val masterHost = "127.0.0.1"
    val masterPort = "18888".toInt
    //准备配置
    val configStr =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = "$host"
         |akka.remote.netty.tcp.port = "$port"
      """.stripMargin
    val config = ConfigFactory.parseString(configStr)
    //ActorSystem老大，负责创建和监控下面的Actor
    val actorSystem = ActorSystem("WorkerSystem",config)
    //创建Actor
    actorSystem.actorOf(Props(new Worker(masterHost,masterPort)),"Worker")
    actorSystem.awaitTermination()


  }
}
