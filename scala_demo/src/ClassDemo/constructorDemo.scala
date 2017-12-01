package ClassDemo
/**
  *Scala中，可以给类定义多个辅助constructor，类似Java中的构造函数重载
  * 辅助constructor之间可以互相调用，而且必须第一行调用主constructor
  * */
class StudentDemo{
  private var name = ""
  private var age = 0
  def this(name:String){
    this()
    this.name = name
  }
  def this(name:String,age:Int){
    this(name)
    this.age = age
  }
}
object constructorDemo {
  def main(args: Array[String]): Unit = {
    val sd1 = new StudentDemo
    val sd2 = new StudentDemo("Tom")
    val sd3 = new StudentDemo("Jerry",30)

    println(sd1)
    println(sd2)
    println(sd3)

  }

}
