package ClassDemo

/**
  *Scala中，主constructor是与类名放在一起的，与Java不同
  * 而且类中，没有定义在任何方法或者是代码块之中的代码，就是主constructor的代码
  * 这点感觉没有Java那么清晰
  * 主constructor中还可以通过使用默认参数，来给参数默认的值
  * 如果主constructor传入的参数什么修饰都没有，那么如果类内部的方法使用到了，则会声明为
  * private[this]；否则没有该field，就只能被constructor代码使用
  * */
class StudentDemo2(val name:String="Jack",val age:Int=20){
  println("Your name is  "+name+", Your age is  "+age)
}

object mainConstructorDemo {
  def main(args: Array[String]): Unit = {
    val sd1 = new StudentDemo2()
    val sd3 = new StudentDemo2("Jerry",30)
  }

}
