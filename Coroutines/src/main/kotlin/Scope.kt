import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {
  println("Program execution will now block")

  runBlocking {
    launch {
      delay(1000L)
      println("A task from runBlocking")
    }

    GlobalScope.launch {
      delay(500L)
      println("Task from GlobalScope")
    }

    coroutineScope {
      launch {
        delay(1500L)
        println("A task from coroutineScope")
      }
    }
  }

  println("Program execution will now continue")
}
