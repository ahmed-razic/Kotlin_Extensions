fun main() {
    val list = mutableListOf<Int>(1, 3, 5, 7, 9)
    println(list)

    list.add(11)
    println(list)
    list.add(1, 2)
    println(list)
    list.removeAt(1)
    println(list)
    println(list.reversed())
    println(list)
    println(list.contains(2))
    println(list.contains(1))

    val list2 = list.subList(2, 5)
    println(list2)

    println(list.sum())

    val list3 = listOf("a", "bb", "ccc", "dddd")
    println(list3.sumBy { it.length })

    for(s in list3.listIterator()) {
        println("$s")
    }

    for(s in list3.listIterator()) {
        print("$s ")
    }
}