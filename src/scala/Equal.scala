package scala

/**
 * Scala Trait(特征)
 */
trait Equal {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2(xc: Int, yc: Int) extends Equal {

  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point2] && obj.asInstanceOf[Point2].x == x

}

object Test {

  def main(args: Array[String]) {
    val p1 = new Point2(2, 3)
    val p2 = new Point2(2, 4)
    val p3 = new Point2(3, 3)

    println(p1.isNotEqual(p2)) // false
    println(p1.isNotEqual(p3)) // true
    println(p1.isNotEqual(2)) // true
  }
}