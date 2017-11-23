object WordCountDemo {
  def main(args: Array[String]): Unit = {

    //定义原始数据
    val lines = List("hello tom hello jerry","hello tom kitty hello hello")
    //
    val words = lines.flatMap(_.split(" "))
    print(words+" ")
    println()
    //
    val wordsAndOne = words.map((_,1))
    print(wordsAndOne+" ")
    println()
    val grouped = wordsAndOne.groupBy(_._1)
    print(grouped+" ")
    println()
    val result = grouped.map(t => (t._1,t._2.size))
    print(result+" ")
    println()
    val finalResult = result.toList.sortBy(_._2).reverse
    print(finalResult+" ")
    println()

  }

}
