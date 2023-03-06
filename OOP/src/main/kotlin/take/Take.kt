package take

import kotlin.random.Random

fun main() {

  val number = Random.nextInt(100)
  val evenOrNull = number.takeIf { it % 2 == 0 }

  println(evenOrNull)

  val oddOrNull = number.takeUnless { it % 2 == 0 }

  println(oddOrNull)

  //////////////////////////////////////////////////////////

  val numbers = listOf(3, 56, 45, 67, 89, 0, 2, 6, 78)
  println(numbers)

  val newNumbers = arrayListOf<Int>()
  for (n in numbers) {
    n.takeIf { it % 2 == 0 }
      ?.let { newNumbers.add(it) }
  }

  println(newNumbers)

  val clients = listOf("Bob", "Alex", "Carlo", "Dan")
  println(clients)

  val newClients = arrayListOf<String>()
  for (client in clients) {
    client.takeUnless { it[0] == 'A' }
      ?.let { newClients.add(it) }
  }

  println(newClients)
}