object funcDemo {
  def main(args: Array[String]): Unit = {

    //在Scala中定义函数时，需要定义函数的函数名、参数、函数体
    def sayHello(name:String,age:Int): Unit ={
      if(age >=18){
        printf("Hi %s, you are a big boy!!!",name)
        println()
      }else{
        printf("Hi %s, you are a little boy!!!",name)
        println()
      }
    }
/**
  * scala 要求必须给出所有参数的类型，但是不一定会给出函数返回值类型，只要右侧的函数体
  * 不包含递归的语句，Scala就可以自己根据右侧的表达式推断出返回值类型。
  * 与Java不同，不用return返回值。
  * */
    sayHello("tom",18)
    sayHello("jerry",20)
    sayHello("jack",10)

    //递归函数-阶乘
    def fib(n:Int):Int={
      if (n<=1) 1
      else
        n*fib(n-1)
    }
    val res = fib(5)
    print(res)
    println()
    /**
      * 变长参数
      * */
    def sum(nums:Int*):Int ={
      var result = 0
      for (num <- nums){
        result += num
      }
      result

    }
    val res1 = sum(1 to 100: _*)
    print(res1)

  }

}
