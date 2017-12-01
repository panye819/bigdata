package ClassDemo

class Person {

  //用val修饰的变量是只读变量，有getter,无setter
  //相当于Java中用final修饰的变量
  val id = "9527"

  //用户var修饰的变量既有getter也有setter
  var name : String = "关羽"

  //类私有字段，只能在类的内部使用
  private var gender : String = "Male"

  //对象私有字段，访问权限更加严格的，Person类的方法只能访问到当前对象的字段
  //只能在类的内部使用
  private[this] val pet = "小强"

  def printPet: Unit ={
    print(pet)
  }



}


//伴生对象
object  Person{
  def main(args: Array[String]): Unit = {
    val p = new Person
    print(p.id+" "+p.name+" "+p.gender)
    println()
//    p.id = "1234"
    p.name = "小乔"
    p.gender = "Female"
    print(p.id+" "+p.name+" "+p.gender)
    println()
    p.printPet
  }
}
