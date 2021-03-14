package scala

/**
 * 循环语法测试
 */
object LoopTest {

  def main(args: Array[String]): Unit = {
    val x = 10
    if (x < 20) {
      println("x < 20")
    }

    if (x < 20) {
      println("x 小于 20")
    } else {
      println("x 大于 20")
    }

    if (x == 10) {
      println("X 的值为 10")
    } else if (x == 20) {
      println("X 的值为 20")
    } else if (x == 30) {
      println("X 的值为 30")
    } else {
      println("无法判断 X 的值")
    }

    var xx = 30
    var yy = 10

    if (xx == 30) {
      if (yy == 10) {
        println("XX = 30 , YY = 10")
      }
    }

    val a = 10;
    // 无限循环
    while (true) {
      println("a 的值为 : " + a);
    }

  }

}
