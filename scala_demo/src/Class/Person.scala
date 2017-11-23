package Class

class Person {

  //
  val id = "9527"

  var name : String = "张飞"


}


//伴生对象
object  Person{
  def main(args: Array[String]): Unit = {
    val p = new Person
    print(p.id+" "+p.name)
    println()
//    p.id = "1234"
    p.name = "关羽"
    print(p.id+" "+p.name)
    println()
  }
}
