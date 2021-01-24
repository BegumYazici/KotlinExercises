package headfirstkotlinexamples.chapter12

data class Groceries(val name : String, val category : String,val unit: String, val unitPrice: Double,
                     val quantity: Int)

fun main(args: Array<String>) {

    val groceries = listOf<Groceries>(Groceries("Tomatoes","Vegetable","lb",3.0,3),
            Groceries("Mushrooms","Vegetable","lb",4.0,1),
            Groceries("Bagels","Bakery","Pack",1.5,2),
            Groceries("Olive oil","Pantry","Bottle",6.0,1),
            Groceries("Ice cream","Frozen","Pack",3.0,2))

    //listemizin içinde int veya string veri yapıları olmazsa biz listedeki max ve min elemanları max ve min metodları ile bulamayız.
    //Kriter ekleyip o kritere göre bulabiliriz. Bunun için de maxBy ve minBy yapıları lambda parametresi verilerek kullanılır.
    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }  //lamda tek parametre aldıgı icin bu sekilde gosterilebilr.
    println("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    //sumBy geriye Int donerken, sumByDouble geriye Double deger donmektedir.
    val sumQuantity = groceries.sumBy { it.quantity }
    println("SumQuantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble { it.unitPrice * it.quantity }
    println("TotalPrice: $totalPrice")

    //filter filtreleme sonucunu yeni bir listede tutar. Map fonk ise filtrelenmis sonucu istenilen kosula gore
    //degistirerek yeni bir liste olusturur,listenin orjinali aynı kalır.
    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    val notBagels = groceries.filterNot { it.name == "Bagels" }
    println("notBagels: $notBagels")
}

//SOR !! Satır 16