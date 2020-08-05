package exercies.deneme

fun main(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //1-Create a filter that gets all the curries and sorts them by string length.
    val filteredAllElements=spices.asSequence().filter { true }
    println(filteredAllElements.toList().sortedBy { it.length })

    //2-Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    val filteredSpecialElements=spices.asSequence().filter { it.startsWith("c") && it.endsWith("e") }
    println(filteredSpecialElements.toList())

    //3-Take the first three elements of the list and return the ones that start with 'c'.
    val filteredTakeMethodUsage=spices.take(3).asSequence().filter { it.startsWith("c") }
    println(filteredTakeMethodUsage.toList())





}