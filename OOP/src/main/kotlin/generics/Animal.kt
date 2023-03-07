package generics

import kotlin.random.Random

fun main() {
  for (i in 1..10) {
    val animal = getAnimal()
    (animal as? Cat)?.purr()
    (animal as? Dog)?.bark()
  }
}

abstract class Animal {
}

class Cat : Animal() {

  fun purr() {
    println("Cat says purr")
  }
}

class Dog : Animal() {

  fun bark() {
    println("Dog say wof")
  }
}

fun getAnimal(): Animal {
  if (Random.nextBoolean()) {
    return Cat()
  }

  return Dog()
}
