fun main() {

    val myCar = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.topSeed = 140
    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(60)
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
