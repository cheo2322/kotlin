package standardFunctions

fun main() {

  val car = Car().run {
    speed = 80
    drive()
    println("Car is running")
    this
  }

  println(car)

  run {
    val car2 = Car()
    car2.speed = 40
    car2.drive()
  }

//  println(car2) => Impossible because the variable is out of scope
}
