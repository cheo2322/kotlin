package standardFunctions

fun main() {
  val car = Car().apply {
    speed = 65
    drive()
  }
    .also { car ->
      println("The car has been started")
      println("Car info: speed=${car.speed}")
    }

  println(car)
}
