package inheritance

fun main() {
    val myLaptop = Laptop()

    val myApple = Apple()
    myApple.screenSize = 13
    myApple.name = "Apple MacBook"

    myLaptop.run()
    myApple.run()
}

open class Laptop {

    var screenSize = 15
    var speed = 100
    var name = "Generic Laptop"

    fun run() {
        println("Running laptop $name with screen $screenSize and speed $speed")
    }
}

class Apple : Laptop() {

}
