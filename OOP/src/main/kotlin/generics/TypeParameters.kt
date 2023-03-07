package generics

fun main() {
  val chef = Chef<Apple>()
  chef.cook(Apple())

  val chef2 = Chef<Banana>()
  chef2.cook(Banana())
}

abstract class Fruit {

  abstract fun peel()
}

class Apple : Fruit() {

  override fun peel() {
    println("Peeling the apple")
  }
}

class Banana : Fruit() {

  override fun peel() {
    println("Peeling the banana")
  }
}

class Chef<T : Fruit> {

  fun cook(item: T) {
    item.peel()
  }
}
