fun main() {

    val myCar = Car("BMW", 140)
    val yourCar = Car("Toyota", 190)

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(60)

    val math = Math()
    println(math.add(1, 2))
    println(math.sub(1, 2))
    println(math.mul(1, 2))
    println(math.div(1, 2.0))

    DatabaseAccess.connected = true
    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }

    println("Database is connected: ${DatabaseAccess.connected}")

    val anotherCar = AnotherCar()
    anotherCar.speed = 100

    println("car.name ${anotherCar.name}")
    println("car.speed ${anotherCar.speed}")
}

class Car {

    var model: String? = null
    var topSpeed = 100

    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    fun start() {
        println("Starting the model $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}

class AnotherCar {
    var name = ""
    var speed: Int = 0
        set(value) {
            name = "High speed car $value"
            field = value
        }
}

class Math {
    fun add(a: Int, b: Int) = a + b

    fun sub(a: Int, b: Int) = a - b

    fun mul(a: Int, b: Int) = a * b

    fun div(a: Int, b: Double): Double = a / b
}

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Database connected")
    }

    fun disconnect() {
        connected = false
        println("Databases disconnected")
    }
}
