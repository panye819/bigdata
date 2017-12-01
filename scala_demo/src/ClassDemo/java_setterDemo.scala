package ClassDemo
/**
  * Scala的getter和setter方法的命名与Java是不同的，是field和filed_=的方式
  * 如果要让Scala自动生成Java风格的getter和setter方法，只要给filed添加@BeanProperty
  * 注解即可
  * 此时会生成四个方法
  * */

class car{
//  @BeanProperty
  var status = ""
}
object java_setterDemo {

}
