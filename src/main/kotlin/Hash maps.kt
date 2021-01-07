fun main() {

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures["red sores"])

    println(cures.getOrDefault("white-spots", "nothing found"))
    println(cures.getOrDefault("white spots", "nothing found"))

    println(cures.getOrElse("red sores") {"found cure on this web page: www.cure.com"})
    println(cures.getOrElse("red-sores") {"found cure on this web page: www.cure.com"})

    makeMutableHash()
}

fun makeMutableHash() {
    val inventory = mutableMapOf("fish net" to 1)
    println("-------------------------------------")
    println(inventory.toString())

    inventory.put("tank scrubber", 3)

    println("-------------------------------------")
    println(inventory.toString())
}