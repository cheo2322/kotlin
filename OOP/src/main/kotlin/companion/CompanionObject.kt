package companion

import kotlin.random.Random

fun main() {
    println(Car.providerDrivingInstructions())

    val course = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseMetaInformation()

    /////////////////////////////////////////////////

    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)

    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)
}

class Car {

    companion object {
        fun providerDrivingInstructions(): String {
            return "Drive safe"
        }
    }
}

class KotlinCourse {

    fun getCourseInfo() {
        println("Kotlin is a Java based language")
    }

    companion object {
        fun getCourseMetaInformation() {
            println("Kotlin is not a difficult language to learn")
        }
    }
}

class Lock(key: Key) {

    private val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    private fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if (key.secretCode == secretCode) {
            println("Lock is open")
        } else {
            println("Key is not correct")
        }
    }
}

class Key {

    var secretCode: String = ""
        set(value) {
            if (field == "") {
                field = value
            }
        }
}
