package scala

/**
 * 集合测试
 */
object CollectionTest {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val set = Set(1, 2, 3, 4, 4, 5)
    val map = Map("zhang" -> "san", "li" -> "si", "wang" -> "wu")
    val tuple = (10, "tuple")
    // 定义 Option
    val opt: Option[Int] = Some(5)
    println(opt.foreach(println))

    val it = Iterator("baidu", "google", "apple", "tesla", "tencent")
    while (it.hasNext) {
      println(it.next())
    }

    println(set.max)
    println(set.min)
    println(it.length)
    println(it.size)

    val it2 = Iterator("baidu2", "google", "apple", "tesla", "tencent")

    val newit = it.++(it2)
    println(newit)

    println(it2.contains("baidu2"))

    val d1 = it.duplicate._1
    while (d1.hasNext) {
      println(d1)
    }

    val d2 = it.duplicate._2
    while (d2.hasNext) {
      println(d2)
    }

    val seq = it.toSeq
    for (elem <- seq) {
      println(elem)
    }
  }

}
