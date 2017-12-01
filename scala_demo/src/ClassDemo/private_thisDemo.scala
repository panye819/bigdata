package ClassDemo
/**
  * 如果将field使用private来修饰，那么代表这个field是类私有的，在类的方法中可以直接
  * 访问类的其他对象的private field
  *
  * 这种情况下，如果不希望field被其他对象访问到，那么可以使用private[this]，意味着对象
  * 私有的filed，只有本对象内可以访问到
  *
  * */

class Teacher{
  private var myAge = 0
  def age_=(newValue:Int): Unit ={
    if(newValue>0) myAge = newValue
    else print("Illegal age!")
  }
  def age = myAge

}

object private_thisDemo {
  def main(args: Array[String]): Unit = {
    val t1 = new Teacher
    t1.age_=(22)
    print(t1.age)
    t1.age_=(0)
    println()
    print(t1.age)


  }

}
