//Destructuring pairs and triplets

fun main() {
    val equipment = "fish net" to "catching fish"
    //println(equipment)
    //println(equipment.first)
    //println(equipment.second)

    val (tool, use) = equipment
    println("$tool is used for $use")


    val numbers2 = Triple(10, 100, 100)

    val(n1, n2, n3) = numbers2
    println("$n1, $n2, $n3")
}