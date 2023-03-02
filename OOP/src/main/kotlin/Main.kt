fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Car {
    var model: String? = null
    var topSeed = 100

    fun start() {
        println("Starting the model $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}
