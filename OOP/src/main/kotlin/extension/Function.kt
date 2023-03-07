package extension

fun main() {

  val name = "Michael"
  println(name.slim())
  println(name.betterLength)
}

fun String.slim(): String {
  return this.substring(1, length - 1)
}

val String.betterLength: Int
  get() {
    println("Getting the better length")
    return 200
  }
