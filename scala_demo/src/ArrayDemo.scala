import scala.collection.mutable.ArrayBuffer

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    //创建数组
    val arr = new Array[Int](10)

    val arr1 = Array[Int](8)
    val arr2 = Array("hadoop","storm","spark")
    println(arr.toBuffer)
    println(arr1.toBuffer)
    println(arr2.toBuffer)
    println(arr2(2))

    //变长数组
    val ab = new ArrayBuffer[Int](8)
    ab += 1
    println(ab)
    //追加多个元素
    ab += (2,3,4,5)
    println(ab)
    //追加一个数组
    ab ++= Array(6,7)
    println(ab)
    //追加一个数组缓冲
    ab ++= ArrayBuffer(8,9)
    println(ab)
    //在数组的某个位置插入元素用insert
    ab.insert(0,-1,0)
    //删除数组某个位置的元素用remove
    ab.remove(8,1)
    println(ab)
    for(x<- ab) print(x)
    println(" ")
    for (i<- (0 until ab.length).reverse) print(ab(i))
    println(" ")
    val arr3 = Array(1,2,3,4,5,6,7,8,9)
    val v3 = arr3.filter(_ %2==0).map(_ *10)
    for (x <- v3) print(x + " ")
    //数组常用方法
    print(v3.sum+ " ")
    val arr4 = Array(1,20,3,4,61,7)
    val v4 = arr4.sorted
    for(x <- v4) print(x + " ")
    val v5 = arr4.sortWith(_<_)
    for(x <- v5) print(x + " ")
    val v6 = arr4.sortWith(_>_)
    for(x <- v6) print(x + " ")


  }
}
