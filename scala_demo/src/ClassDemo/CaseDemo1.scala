package ClassDemo

import scala.util.Random

object CaseDemo1 extends App {
  val arr = Array("cls","bdls","jizels","mameils")
  val name = arr(Random.nextInt(arr.length))
  println(name)
  name match {
    case "cls" => println("cls")
    case "bdls" => println("dhyjy")
    case "jizels" => println("jizemingbu")
    case _ => println("some teacher else")
  }


}
