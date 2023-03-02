package inheritance

fun main() {
    val myDog = Corgi()
    myDog.size = 10

    println(myDog.size)
    myDog.bark()
    myDog.play()
}

open class Dog {

    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Playing")
    }
}

class Corgi : Dog() {

}
