fun main() {

//    val myCar = Car()
//    val yourCar = Car()
//
//    myCar.model = "BMW"
//    yourCar.model = "Toyota"
//
//    myCar.topSeed = 140
//    myCar.start()
//    myCar.drive(50)
//
//    yourCar.start()
//    yourCar.drive(60)

    val math = Math()
    println(math.add(1, 2))
    println(math.sub(1, 2))
    println(math.mul(1, 2))
    println(math.div(1, 2.0))
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

class Math {
    fun add(a: Int, b: Int) = a + b

    fun sub(a: Int, b: Int) = a - b

    fun mul(a: Int, b: Int) = a * b

    fun div(a: Int, b: Double): Double = a / b
}
