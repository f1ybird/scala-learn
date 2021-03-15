package scala

object StringTest {

  val greeting: String = "hello world"

  def main(args: Array[String]): Unit = {
    println(greeting)

    var buf = new StringBuilder
    buf.append("123").append("456")
    println(buf)

    var str1 = "菜鸟教程官网：";
    var str2 = "www.runoob.com";
    var str3 = "菜鸟教程的 Slogan 为：";
    var str4 = "学的不仅是技术，更是梦想！";
    println(str1 + str2);
    println(str3.concat(str4));

    var z = new Array[String](3)
    var zz = Array("Baidu", "Ali", "Tencent")
    z(0) = "Runoob"
    z(1) = "Baidu"
    z(4 / 2) = "Google"
    println(z)

    // 数组练习
    var myList = Array(1, 2, 4, 6, 9, 5)

    // 输出所有数组元素
    for (elem <- myList) {
      println(elem)
    }

    // 计算数组所有元素的总和
    var total = 0
    for (elem <- myList.indices) {
      total += myList(elem)
    }
    println(s"total = $total")

    println(myList.max)

    // 多维数组

    // 二维数组
    val myMatrix = Array.ofDim[Int](9, 9)

    // 创建矩阵初始化
    for (i <- 0 to 8) {
      for (j <- 0 to 8) {
        myMatrix(i)(j) = j
      }
    }

    // 打印二维阵列
    for (i <- 0 to 8) {
      for (j <- 0 to 8) {
        print(" " + myMatrix(i)(j))
      }
      println();
    }
  }

  // 合并数组
  var myList1: Array[Int] = Array(1, 2, 3, 4, 5)
  var myList2: Array[Int] = Array(6, 7, 8, 9, 110)
  var myList3: Array[Int] = Array.concat(myList1, myList2)
  for (elem <- myList3) {
    println("--" + elem)
  }

  // 区间数组
  var myList11: Array[Int] = Array.range(10, 20, 2)
  var myList22: Array[Int] = Array.range(10, 20)

  // 输出所有数组元素
  for (x <- myList11) {
    print(" " + x)
  }

  println()

  for (x <- myList22) {
    print(" " + x)
  }

}
