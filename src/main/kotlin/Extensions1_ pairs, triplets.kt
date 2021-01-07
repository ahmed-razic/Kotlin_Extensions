//Create Pairs and Triplets

fun main() {
    val fish = listOf("salmon", "mackerel", "tuna", "trout")

    val twoLists = fish.partition { isFreshWater(it) }

    println("freshwater: ${twoLists.first}")
    println("saltwater: ${twoLists.second}")

    println(twoLists)

    println("-----------------------------------------------")
    createPairs()
    println("-----------------------------------------------")
    createTriplets()
    println("-----------------------------------------------")
    createPairsInPair()

}

fun isFreshWater(fish: String): Boolean {
    var result: Boolean = false
    if(fish == "salmon" || fish == "trout") result = true

    return result
}

fun createPairs() {
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} is used for ${equipment.second}")
    println(equipment)
}

fun createTriplets() {
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())
}

fun createPairsInPair() {
    val equipment = "fish net" to "catching fish"
    //val equipment2 = ("fish net" to "catching fish") to "equipment"
    val equipment2 = equipment to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")
}



