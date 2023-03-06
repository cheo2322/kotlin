package take

import kotlin.random.Random

fun main() {

  val number = Random.nextInt(100)
  val evenOrNull = number.takeIf { it % 2 == 0 }

  println(evenOrNull)

  val oddOrNull = number.takeUnless { it % 2 == 0 }

  println(oddOrNull)
}