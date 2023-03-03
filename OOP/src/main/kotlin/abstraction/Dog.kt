package abstraction

fun main() {

  val pug: Dog = Pug("Pug")
  pug.bark()
  pug.run()
  pug.play()

  val bassetHound: Dog = BassetHound("BassetHound")
  bassetHound.bark()
  bassetHound.run()
  bassetHound.play()

  val chihuahua: Dog = Chihuahua("Pug")
  chihuahua.bark()
  chihuahua.run()
  chihuahua.play()
}

abstract class Dog(name: String) {

  abstract fun bark()

  abstract fun run()

  abstract fun play()
}

class Pug(private val name: String) : Dog(name) {
  override fun bark() {
    println("$name cannot bark")
  }

  override fun run() {
    println("$name can run")
  }

  override fun play() {
    println("$name can play")
  }
}

class BassetHound(private val name: String) : Dog(name) {
  override fun bark() {
    println("$name can bark")
  }

  override fun run() {
    println("$name cannot run")
  }

  override fun play() {
    println("$name can play")
  }
}


class Chihuahua(private val name: String) : Dog(name) {
  override fun bark() {
    println("$name can bark")
  }

  override fun run() {
    println("$name can run")
  }

  override fun play() {
    println("$name cannot play")
  }
}
