package scala

object MethodTest {

  def main(args: Array[String]): Unit = {
    println(sum(1, 2))
    printMe()
  }

  def sum(a: Int, b: Int): Int = {
    return a + b
  }

  def printMe(): Unit = {
    println("hello scala!")
  }

}
