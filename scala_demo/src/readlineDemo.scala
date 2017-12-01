import scala.io.StdIn
object readlineDemo {
  def main(args: Array[String]): Unit = {
    val name = scala.io.StdIn.readLine("Please input your name!")
    print("Please input your age")
    val age = scala.io.StdIn.readInt()
    if(age>18){
      printf("Hi,%s,you are %d years old ,so you legal to play our greatful games!",name,age)
    }else{
      printf("Sorry,%s,you are not adult ,you are %d years old,you are illegal to come here!",name,age)
    }

  }
}
