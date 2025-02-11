// A Box class specifically for Int values
class Box(value: Int) {
  def getValue: Int = value
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating a Box for Int
    val intBox = new Box(10)    // Box for Int values

    // Print the value
    println(intBox.getValue)   // Output: 10
  }
}
