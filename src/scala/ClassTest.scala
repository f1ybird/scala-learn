package scala

object ClassTest {

  def main(args: Array[String]): Unit = {
    val point = new Point(10, 10)
    point.move(10, 10)

    println("-------")

    val location = new Location(10, 10, 10)
    location.move(10, 10, 10)
  }
}


/**
 * 基类
 *
 * @param xc
 * @param yc
 */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x);
    println("y 的坐标点: " + y);
  }
}

/**
 * 子类，继承基类Point
 *
 * @param xc
 * @param yc
 * @param zc
 */
class Location(var xc: Int, var yc: Int, var zc: Int) extends Point(xc, yc) {

  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点: " + x)
    println("y 的坐标点: " + y)
    println("z 的坐标点: " + z)
  }

}