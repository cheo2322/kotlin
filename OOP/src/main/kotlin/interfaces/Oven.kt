package interfaces

fun main() {

  val oven: Oven = Bosch()
  oven.turnOn()
  oven.cook(150)
  oven.turnOff()
}

interface Oven {

  val temperature: Int

  fun turnOn()

  fun turnOff()

  fun cook(temp: Int) {
    println("Cooking at $temp degrees")
  }
}

class Bosch : Oven {
  override val temperature = 180

  override fun turnOn() {
    println("Turning on")
  }

  override fun turnOff() {
    println("Turning off")
  }
}
