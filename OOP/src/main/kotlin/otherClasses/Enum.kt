package otherClasses

fun main() {

  val color = Color.RED

  when (color) {
    Color.RED -> println("You chose red")
    Color.GREEN -> println("You chose green")
    Color.BLUE -> println("You chose blue")
  }

  println(Color.RED.timesUsed)
  println(Color.GREEN.name)
  println(Color.BLUE.ordinal)
}

enum class Color(val timesUsed: Int) {
  RED(0),
  GREEN(2),
  BLUE(5)
}
