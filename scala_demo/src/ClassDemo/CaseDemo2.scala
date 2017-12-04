package ClassDemo


object CaseDemo2 extends App {
  val arr = Array(1,0,5,3)

  arr match {
    case Array(1,x,y)=>println(x+" "+y)
    case Array(0,1,5)=>println("Only 0")
    case Array(0,_*)=>println("0...")
    case _ => println("something else")
  }
  println("-----------------------------")
  val lst = List(0,3,111)
  lst match{
    case 0::Nil => println("Only 0")
    case x::y::Nil => println(s"x: $x y: $y")
    case 0::a => println("Start With 0...")
    case _ => println("Something else")
  }
  println("-----------------------------")
  val tup = (6,3,5)
  tup match {
    case (1,x,y) => println(s"Hello $x, $y")
    case (_,z,5) => println(z)
    case _ => println("Something else")
  }
}
