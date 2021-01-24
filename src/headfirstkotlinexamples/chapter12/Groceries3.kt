package headfirstkotlinexamples.chapter12

data class Grocery3(val name: String, val category : String,val unit: String, val unitPrice: Double,
                    val quantity: Int)

fun main(args: Array<String>) {

    val groceries3 = listOf<Groceries2>(Groceries2("Tomatoes","Vegetable","lb",3.0,3),
            Groceries2("Mushrooms","Vegetable","lb",4.0,1), //item
            Groceries2("Bagels","Bakery","Pack",1.5,2), //item
            Groceries2("Olive oil","Pantry","Bottle",6.0,1),  //item...
            Groceries2("Ice cream","Frozen","Pack",3.0,2))

    groceries3.groupBy { it.category }.forEach {    //geriye map doner
        println(it.key)
        it.value.forEach { println("  ${it.name}") }
    }

    val ints = listOf<Int>(1,2,3,4)
    val sumOfInts = ints.fold(0){runningSum, item -> runningSum + item} //runningSum=0 default value
    println("sumOfInts: $sumOfInts")  // =10

    val productOfInts = ints.fold(1){runningProduct, item -> runningProduct * item}  //item=1,2,3,4
    println("productOfInts: $productOfInts")  //=24

    val names = groceries3.fold(""){string, item -> string + " ${item.name}"}  //string = ""
    println("names: $names")

    val changeFrom50 = groceries3.fold(50.0){change, item -> change - item.unitPrice * item.quantity}  //SOR!!!
    println("changeFrom50: $changeFrom50")
}
//NOT! = forEach, fold and groupBy are designed to work with Iterables.
//reduce = fold (reduce func not necessary initial value)