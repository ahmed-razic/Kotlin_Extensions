class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

object Constants {
    const val CONSTANT2 = "object constant"
}

fun main() {
    val foo = Constants.CONSTANT2
}
