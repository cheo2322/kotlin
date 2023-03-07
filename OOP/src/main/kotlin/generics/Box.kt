package generics

fun main() {
  val myBox = Box<String>()
  myBox.display("a")

  val carBox = Box<Car>()
  carBox.display(Car())

  val newBox = NewBox<Int, Float>()
  newBox.display(0, 0.3f)
}

class Box<T> {

  fun display(item: T) {
    println("Object is ${item.toString()}")
  }
}

class NewBox<T, U> {

  fun display(item1: T, item2: U) {
    println(item1)
    println(item2)
  }
}

class Car {

}
