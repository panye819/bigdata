package ClassDemo


/**
  *
  *
  * */
class People(val id : String ,var name :String) {
      def showID: Unit ={
        print("The ID is :"+id)
      }
      def showName: Unit ={
        print("The Name is :"+name)
      }
}

object People{
  def main(args: Array[String]): Unit = {
    val p = new People("0325","BlueBell")
    println(p.id)
    println(p.name)
//    p.id = "0819"
    p.name = "FlyPiG8308"
    println(p.id)
    println(p.name)

//    p.showID
//    println()
//    p.showName


  }
}
