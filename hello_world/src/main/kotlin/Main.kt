const val CAT = "cat"

fun main(args: Array<String>) {
//    val cat = "Fluffy"
//    println("My $CAT's name is \"$cat\"")
//
////    println("Input something")
////    val userInput = readlnOrNull() ?: ""
////    println("Result is: ${userInput.toInt() * 3}")
//
//    println(Random.nextInt())
//    println(Random.nextInt(6))
//    println(Random.nextInt(20, 25))
//
//    println(Random.nextDouble(1.0))
//    println(Random.nextDouble(-2.0, 1.0))
//
////    println("Your birth year: ")
////    val userInput = readlnOrNull() ?: ""
////    println("Result is: ${2023 - userInput.toInt()}")
//
//    val number = 3.4
//    println(number::class.java)
//
//    val number2 = 4
//    println(number2::class.java)
//
//    println((number * number2)::class.java)
//
//    val a = -7000000000
//    val b = a.toInt()
//    println(b)
//
//    val s = "xd $b"
//    println(s)
//
//    var cats = 5;
//    println("Now I have ${cats++} ${CAT}s")
//    println(cats)
//
//    val c: Short = 5
//    val d = 290
//    val e = c * d
//
//    println(e::class.java)
//
//    var amount = 19.99
//    amount *= 1.055 * 1.055 * 1.055 * 1.055 * 1.055
//    println(amount)
//
//    val cows = 3
//    val produces = true
//    val children = 2
//
//    println(cows <= 5 && produces || children >= 2)
//
//    val herName = "Any"
//    var hisName: String? = "Name"
//
//    println("$herName, ${hisName?.length}, ${hisName?.length?.compareTo(4)}")
//
//    hisName = null
//
//    println("$herName, $hisName, ${hisName?.length}")
//    println("$herName, $hisName, ${hisName?.length?.plus(3)?.compareTo(3)}")
//
////    println("Your number here: ")
////    val userInput = readlnOrNull()
////    val toDouble = userInput?.toDouble()?.times(7)
////    val toString = toDouble.toString()
////    println("$toString, ${toString.length}")
//
//    var catName2: String? = null
//    println("Name of the cat: ${catName2 ?: "This cat has no name"}")
//    println("Length of the cat: ${catName2?.length ?: 0}")
//
//    catName2 = "Gatasio"
//    println("Name of the cat: ${catName2 ?: "This cat has no name"}")
//    println("Length of the cat: ${catName2.length ?: 0}")
//    println(catName2!!.length)
//
//    val test = readlnOrNull()
//    try {
//        println(test?.toInt())
//    } catch (e: Exception) {
//        e.printStackTrace()
//        println("An exception has occurred:\n$e")
//    } finally {
//        println("Execution completed!")
//    }

//    val colors: ArrayList<String?> = arrayListOf("red", "green", "blue", "yellow", "red", null)
//    println(colors)
////    println(colors[7])
//
//    colors.add("black")
//    println(colors)
//
//    val moreColors: ArrayList<String> = arrayListOf("pink", "gray")
//    colors.addAll(moreColors)
//    println(colors)
//
//    colors.remove(null)
//    colors.removeAll(moreColors)
//
//    println(colors)
//
//    colors.removeAt(0)
//
//    println(colors)
//
//    val list = listOf<String>()
//    println(list)
//
//    val set = setOf(1, 2, 1)
//    println("$set, ${set.size}")
//
//    val map = mapOf(Pair(1, "one"), Pair(2, "second"))
//    println(map)
//
//    val map2 = mapOf<Int?, String?>(Pair(null, "null2"), Pair(10, "ten"), Pair(null, "any"))
//    println(map2)
//    println(map2[null])

//    val animal = "cat"
//
//    val action: String =
//        when (animal) {
//            "cat" -> {
//                "pet it"
//            }
//
//            "dog" -> {
//                "feed it"
//            }
//
//            else -> {
//                "google it"
//            }
//        }
//
//    println("When you meet a $animal you should $action")

//    println(any(1))

//    val myLambda = { name: String -> println("Hello $name") } // Lambda
    val names = arrayListOf("A", "B", "C")

//    sayHello(names, myLambda) // High Order Function
//
//    sayHello(names) { name: String -> println("Hello $name") } // A different way, same result

    names.filter { it.length < 4 }
        .forEach { println(it) }
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}

fun any(number: Int = 0, number2: Double = 0.0): Int {
    return number + 1
}

fun any(): Int {
    return 0
}
