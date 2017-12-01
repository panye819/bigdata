package ClassDemo

class Student{
  private var myName = "leo"
  def name = "Your name is : "+myName
  /**
    * 如果希望能够自己对getter和setter进行控制，则可以自定义getter和setter方法
    * 自定义setter方法的时候一定要注意Scala的语法限制，签名、=、参数之间不能有空格
    *
    * */
  def name_=(newValue:String): Unit ={
//    print("You can not edit your name!!!")
      myName = newValue

  }

}
/**
  * 如果只是希望拥有简单的getter和setter方法，那么就按照Scala提供的语法规则，
  * 根据需求为field选择合适的修饰符就好：
  *   var val private private[this]
  * */
object getter_setterDemo {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student
    print(stu1.name)
    println()
    stu1.name_=("Jack")
    println()
    print(stu1.name)

  }
}
