object ParralComputeDemo {
  def main(args: Array[String]): Unit = {
    val lst0 = List(1,2,3,4,5,6,7,8,9,10)
    val lst1 = lst0.sum
    print("The sum is : "+lst1+" ")
    println()

    val lst2 = lst0.par.reduce(_+_)

    print("The result is : "+lst2+" ")
    println()



  }

}
