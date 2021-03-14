package scala

/**
 * 运算符测试
 */
object OperatTest {

  def main(args: Array[String]): Unit = {
    //    var a = 10
    //    var b = 20
    //    var c = 25
    //    var d = 25
    //    // 算术运算符
    //    println("a + b = " + (a + b)) // 30
    //    println("a - b = " + (a - b)) // -10
    //    println("a * b = " + (a * b)) // 200
    //    println("b / a = " + (b / a)) // 2
    //    println("b % a = " + (b % a)) // 0
    //    println("c % a = " + (c % a)) // 5
    //
    //    // 关系运算符
    //    println("a == b = " + (a == b)) // false
    //    println("a != b = " + (a != b)) // true
    //    println("a > b = " + (a > b)) // false
    //    println("a < b = " + (a < b)) // true
    //    println("b >= a = " + (b >= a)) // true
    //    println("b <= a = " + (b <= a)) // false
    //
    //    // 逻辑运算符
    //    var al = true
    //    var bl = false
    //    println("al && bl = " + (al && bl)) // false
    //    println("al || bl = " + (al || bl)) // true
    //    println("!(al && bl) = " + !(al && bl)) // true

    // 位运算符
    //    var a = 60
    //    /* 60 = 0011 1100 */
    //    var b = 13
    //    /* 13 = 0000 1101 */
    //    var c = 0
    //
    //    c = a & b /* 12 = 0000 1100 */
    //    println(s"a & b =$c")
    //
    //    c = a | b /* 61 = 0011 1101 */
    //    println("a | b = " + c)
    //
    //    c = a ^ b /* 49 = 0011 0001 */
    //    println("a ^ b = " + c)
    //
    //    c = ~a /* -61 = 1100 0011 */
    //    println("~a = " + c)
    //
    //    c = a << 2 /* 240 = 1111 0000 */
    //    println("a << 2 = " + c)
    //
    //    c = a >> 2 /* 15 = 1111 */
    //    println("a >> 2  = " + c)
    //
    //    c = a >>> 2 /* 15 = 0000 1111 */
    //    println("a >>> 2 = " + c)

    // 赋值运算符
    var a = 10
    var b = 20
    var c = 0

    c = a + b
    println("c = a + b  = " + c)

    c += a
    println("c += a  = " + c)

    c -= a
    println("c -= a = " + c)

    c *= a
    println("c *= a = " + c)

    a = 10
    c = 15
    c /= a
    println("c /= a  = " + c)

    a = 10
    c = 15
    c %= a
    println("c %= a  = " + c)

    c <<= 2
    println("c <<= 2  = " + c)

    c >>= 2
    println("c >>= 2  = " + c)

    c >>= a
    println("c >>= a  = " + c)

    c &= a
    println("c &= 2  = " + c)

    c ^= a
    println("c ^= a  = " + c)

    c |= a
    println("c |= a  = " + c)

  }

}
