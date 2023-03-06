package standardFunctions

fun main() {

  val animals = listOf("dog", "cat", "mouse", "bear", "zebra")
  animals.map { it.length }
    .filter { it > 3 }
//    .let { filteredList ->
//      println(filteredList)
//      println("Size of list is ${filteredList.size}")
//    }
    .let(::println)

  val name = readlnOrNull()
  name?.let {
    println("Your name is $it")
  }
}
