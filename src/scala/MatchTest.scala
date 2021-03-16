package scala

/**
 * Scala 模式匹配
 */
object MatchTest {

  def main(args: Array[String]): Unit = {
    println(matchTest2(4))

    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }

  def matchTest2(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case _: Int => "scala.Int"
    case _ => "many"
  }

  // 使用样例类
  val alice: Person = Person("Alice", 25)
  val bob: Person = Person("Bob", 32)
  val charlie: Person = Person("Charlie", 32)

  for (person <- List(alice, bob, charlie)) {
    person match {
      case Person("Alice", 25) => println("Hi Alice!")
      case Person("Bob", 32) => println("Hi Bob!")
      case Person(name, age) =>
        println("Age: " + age + " year, name: " + name + "?")
    }
  }

  // 样例类
  case class Person(name: String, age: Int)

}

