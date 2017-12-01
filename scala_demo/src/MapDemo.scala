import scala.collection.mutable.Map
object MapDemo {

  def main(args: Array[String]): Unit = {

    val m1 = Map("a" -> 1,"b"-> 2)
    print(m1("a")+ " ")
    print(m1("b")+ " ")
    m1("k")=20
    print(m1("k")+ " ")
    print(m1)
    //    print(m1.+("k"->20))

    //元组转映射
    val arr = Array(("a",1),("b",2))
    val m2 = arr.toMap
    print(m2+" ")

    //拉链操作
    //如果两个数组的元素个数不一致，拉链操作后生成的数组的长度为较小的那个数组的元素个数
    val a = Array("a","b","c")
    val b = Array(1,2,3,4)
    val c = a.zip(b)
    print(c.toBuffer)

    //map键值反转
    val m3 = Map("a"->1,"b"->2)
    val m4 = for ((key,value)<- m2) yield (value,key)
    print(m4+" ")

  }

}
