import scala.collection.mutable._

/**
* scala的集合有三大类：序列Seq、集Set、映射Map,所有的集合都扩展自Iterable特质。
  * 在Scala中集合有可变(mutable)和不可变(immutable)两种类型，immutable类型的集和在初始化
  * 之后就不能改变了(注意与val修饰的变量进行区别)
*
* */
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的集合
    val lst1 = List(1,2,3)
    //将0插入到lst1的前面生成一个新的List
    val lst2 = 0 :: lst1
    val lst3 = lst1.::(0)
    val lst4 = 0 +: lst1
    val lst5 = lst1.+:(0)

    print(lst1+" "+lst2+" "+lst3+" "+lst4+" "+lst5+" ")
    println("==========================================")
    //将一个元素添加到lst1的后面产生一个新的集合
    val lst6 = lst1 :+ 3
    print(lst6+" ")
    println("==========================================")
    //将两个list合成一个新的list
    val lst0 = List(4,5,6)
    val lst7 = lst1 ++ lst0
    print(lst7+" ")
    println("==========================================")
    //将lst0插入到lst1前面生成一个新的集合
    val lst8 = lst1 ++: lst0
    print(lst8+" ")
    println("==========================================")
    //将lst0插入到lst1后面生成一个新的集合
//    val lst9 = lst1 :++ lst0
//    print(lst8+" ")
    println("==========================================")

    val lb = ListBuffer(1,2)
    val lb1 = lb += 3
    val lb2 = ListBuffer(4,5)
    val lb3 = lb1 ++ lb2
//    val lb2 = lb.append(3)
//    val lb3 = lb.append(4,5,6,7)
    print(lb1+" "+lb2+" "+lb3+" ")


  }

}
