package ClassDemo

object PartialFuncDemo {
  def func1: PartialFunction[String,Int]={
    case "one" => 1
    case "two" => 2
    case _ => -1

  }

  def func2(num:String):Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println("------------")
    println(func2("one1"))
  }

}
