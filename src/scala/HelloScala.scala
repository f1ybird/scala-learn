package scala

object HelloScala {

  def main(args: Array[String]): Unit = {
    println("hello\tscala")

    //    var myVar: String = "Foo"
    //    val myVal: String = "Bar"

    var myVar = 10
    val myVal = "Bar"

    val pa = (40, "Foo")

    println(pa)

  }

  /**
   * 私有(Private)成员
   */
  class Outer {

    class Inner {

      private def f() {
        println("f")
      }

      class InnerMost {
        f() // 正确
      }

    }

    //    (new Inner).f() //错误
  }


  /**
   * 保护(Protected)成员
   */
  class Super {

    protected def f() {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //    (new Super).f() //错误
  }


  /**
   * 公共(Public)成员
   */
  class Outer2 {

    class Inner {

      def f() {
        println("f")
      }

      class InnerMost {
        f() // 正确
      }

    }

    (new Inner).f() // 正确因为 f() 是 public
  }


  /**
   * 作用域保护
   */
  //  package bobsrockets {
  //    package navigation {
  //      private[bobsrockets] class Navigator {
  //        protected[navigation] def useStarChart() {}
  //
  //        class LegOfJourney {
  //          private[Navigator] val distance = 100
  //        }
  //
  //        private[this] var speed = 200
  //      }
  //    }
  //
  //    package launch {
  //      import navigation._
  //      object Vehicle {
  //        private[launch] val guide = new Navigator
  //      }
  //    }
  //  }

}
