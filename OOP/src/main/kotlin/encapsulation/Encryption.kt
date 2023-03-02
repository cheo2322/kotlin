package encapsulation

fun main() {
    val myLock = EncryptionLock(40)

    println("Does the key 70 unlock my lock? ${myLock.unlock(70)}")
    println("Does the key 40 unlock my lock? ${myLock.unlock(70)}")
}

class EncryptionLock(private val privateKey: Int) {

    fun unlock(publicKey: Int) = formula(publicKey) == privateKey

    private fun formula(publicKey: Int) = publicKey / 2 + 5
}