class Person(val name: String, val age: Int) {
  def greet(): Unit = println(s"Hello, my name is $name and I am $age years old.")
}

object NEW {
  def main(args: Array[String]): Unit = {
    val p = new Person("Tarun", 28)
    p.greet()
  }
}
