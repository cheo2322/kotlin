package standardFunctions

fun main() {
  val car = Car().apply {
    speed = 65
    drive()
  }

  println(car)
}
