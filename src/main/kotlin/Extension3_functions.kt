fun main() {
    println("Does it have spaces".hasSpaces())
    println("Does-it-have-spaces".hasSpaces())
    println("Does it have spaces".hasSpaces2())

    val myClass = AquariumPlant("green", 10)

    println(myClass.isRed())
    println(myClass.isGreen())
}


fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' '}
    return found != null
}

fun String.hasSpaces2() = find {it == ' '} != null

class AquariumPlant(val color: String, private val size: Int) { }

fun AquariumPlant.isRed() = color == "red"
fun AquariumPlant.isGreen() = color == "green"
//fun AquariumPlant.isBig() = size == 10


