package ClassDemo
/**
  *内部类
  *
  * */
import scala.collection.mutable.ArrayBuffer

class Class{
  class Student(val name:String){

  }
  val Students = new ArrayBuffer[Student]
  def getStudent(name:String) ={
    new Student(name)
  }
}
object internalClassDemo {
  def main(args: Array[String]): Unit = {
    val c1 = new Class
    val s1 = c1.getStudent("leo")
    val res1 = c1.Students += s1

  }
}
