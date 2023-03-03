package polymorphism

fun main() {
  val mom = Mom()
  val daughter = Daughter()

  mom.say("hi")
  mom.say()
  mom.say(4)
  mom.say("Hello daughter")
  mom.say("Hello daughter", 2)

  daughter.say("hello")
}

open class Mom {

  fun say() {
    println("Mom says hi, how are you?")
  }

  open fun say(message: String) {
    println("Mom says $message")
  }

  fun say(times: Int) {
    for (i in 0..times) {
      println("Mom says hi")
    }
  }

  fun say(message: String, times: Int) {
    for (i in 0..times) {
      println("Mom says $message")
    }
  }

}

class Daughter : Mom() {

  override fun say(message: String) {
    println("Daughter says $message")
  }

}
