package inheritance

fun main() {

    val son = Son()
    son.printName()
}

open class Father {

    open val name: String = "Father"
    val lastName: String = "Lastname"

    open fun printName() {
        println("My name is $name $lastName")
    }
}

class Son : Father() {

    override val name = "Son"

    override fun printName() {
        super.printName()
        println("Father is named ${super.name} ${super.lastName}")
    }
}
