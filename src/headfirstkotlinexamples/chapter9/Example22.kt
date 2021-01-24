package headfirstkotlinexamples.chapter9

fun main(args: Array<String>) {

    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Holds values in no particular order."
    val def2 = "Holds key/value pairs."
    val def3 = "Holds values in a sequence"
    val def4 = "Can be updated"
    val def5 = "Can't be updated"
    val def6 = "Can be resized"
    val def7 = "Can't be resized"

    val glossary = mapOf(term4 to "$def3 $def4 $def6",
            term7 to "$def1 $def5 $def7",
            term1 to "$def3 $def4 $def7")

    for((key,value) in glossary)  println("$key: $value")

    val wordTranslate = mapOf<Int,String>(1 to "one", 2 to "two", 3 to "three", 4 to "four")
    for((key2, value2) in wordTranslate){
        println("$key2: $value2")
    }
}