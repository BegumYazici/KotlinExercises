package headfirstkotlinexamples.chapter12

fun main(args: Array<String>) {

    val myMap = mapOf<String,Int>("A" to 4,"B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0

    x1 = myMap.keys.fold(""){x, y -> x + y} //x= "" === ABCDE
    x2= myMap.entries.fold(0){x,y -> x * y.value} //x = 0  ===0

    println("$x1 $x2")
}