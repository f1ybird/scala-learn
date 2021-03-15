package scala

class Person {
  var name = ""

  override def toString: String = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {

  var salary = 0.0

  override def toString: String = super.toString + "[salary=" + salary + "]"
}

object ExtendsTest extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}