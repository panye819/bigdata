import scala.io.Source._
object lazyDemo {
  def main(args: Array[String]): Unit = {
    /**
      * lazy
      * 在Scala中，提供了lazy值得特性，也就说，如果将一个变量声明为lazy，则只有
      * 在第一次使用该变量时，变量对应的表达式才会发生计算
      * 这种特性对于特别耗时的计算操作特别有用，比如打开文件进行IO，进行网络IO等
      * */
lazy val lines = fromFile("/root/demo.txt").mkString
    val line_1 = fromFile("/root/demo.txt").mkString


  }
}
