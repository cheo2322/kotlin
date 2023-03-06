package otherClasses

fun main() {
  val user = User("A", "a@b.c", "1234")
  println(user)
}

data class User(
  val name: String,
  val email: String,
  val password: String
)
