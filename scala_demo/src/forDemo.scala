import scala.util.control.Breaks.{break, breakable}

object forDemo {
  def main(args: Array[String]): Unit = {
    breakable{
      var n = 10
      for(c<- "Hello World"){
        if(n==5) break
        print(c)
        n -=1
      }
    }

    for(i <- 1 to 9;j<- 1 to 9){
      if (j ==9 ){
        println(i*j)
      }else{
        print(i*j + " ")
      }
    }

    for (x<- 1 to 20 if x%2==0)println(x)
  }
}
