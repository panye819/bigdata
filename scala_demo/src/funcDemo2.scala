object funcDemo2 {
  def main(args: Array[String]): Unit = {
    /**
      * 在Scala中，定义函数时，如果函数体直接包裹在了花括号里面，而没有使用=连接
      * ，则函数的返回值类型是unit。这样的函数就被称之为过程。
      * 过程通常用于不需要返回值的函数。
      *
      * 过程还有一种写法，就是将函数的返回值类型定义为Unit
      * */

    def sayHello(name:String){print("Hello, "+name)}
    val res1 = sayHello("Tom")
    print(res1)



  }
}
