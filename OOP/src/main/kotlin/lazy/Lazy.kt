package lazy

import kotlin.random.Random

fun main() {
  val someLargeVariable: String by lazy { "Some large value" }

  if (Random.nextBoolean()) {
    println(someLargeVariable)
  }
}
