package companion

fun main() {
    println(Car.providerDrivingInstructions())

    val course = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseMetaInformation()
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
