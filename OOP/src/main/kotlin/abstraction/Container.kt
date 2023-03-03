package abstraction

fun main() {

  val container = Bottle()
  container.fill()
  container.pour()
}

abstract class Container {

  abstract fun pour()
}

class Bottle : Container() {

  fun fill() {
    println("Filling bottle")
  }

  override fun pour() {
    println("Pouring bottle")
  }
}

class Jug : Container() {
  override fun pour() {
    println("Pouring jug")
  }

}
