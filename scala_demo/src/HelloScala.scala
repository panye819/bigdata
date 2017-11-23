object HelloScala {
  def main(args: Array[String]): Unit = {
/*    println("Hello Scala!")
    println("Hello scala again!")
  val res1 = Range(1,10)
    for (i <- res1){
      println(i)
    }


    for (i <- 1 to 3;j <- 1 to 3 if i != j){
      println((10*i +j) + " ")
    println()
    }

    val t = for(i<- 1 to 10) yield  i*10
    println(t)



    val a2 = a1.filter(_ %2 == 0)
    println(a2)

  val a1 = Array(1,2,3,4,5,6,7,8,9)

    for(i <- 0 until(a1.length)) println(a1(i)) */

    //定义方法
    def m1(x: Int, y: Int): Int = x * y

    println(m1(3,4))

    //定义函数
    val f2 = (x: Int) => x + 10
    val f1 = (x: Int) => x * 10

    val func1 = (x: Int,y: Double) => (y, x)
    val func2: (Int, Double) => (Double, Int) ={(a,b) => (b, a)}



    println(f2(100))

    val r = 1 to 10

    val r1 = r.map(f2)
    print(r1)
    println("===========")
    val r2 = r.map(f1)
    print(r2)
    println("===========")
    val v1 = func1(2,3.0)
    val v2 = func2(2,3.0)

    println(v1)
    println(v2)

    //方法转换为函数
    def m2(x:Int,y:Int): Int = x + y
    println(m2(1,3))

    val f3 = m2 _
    println(f3(1,4))


  }
}
