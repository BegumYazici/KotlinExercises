package kotlinbook.chapter12

data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)

fun main(args: Array<String>) {

    val ints = listOf<Int>(1,2,3,4,5)

    val pizzas = listOf<Pizza>(Pizza("Sunny Chicken",4.5,4),
            Pizza("Goat and Nut",4.0,1),
            Pizza("Tropical",3.0,2),
            Pizza("The Garden",3.5,3))

    val minInt = ints.min()  //Liste int veriler tuttugu için min methodu ile en kucuk degere erişilebilir.
    val minInt2 =ints.minBy { it }  //minBy kullanılıcaksa sadece it yazılması yeterlidir.
    val minInt3 = ints.minBy ({ int: Int -> int})
    val sumInts = ints.sum()
    val sumInts2 = ints.sumBy { it }
    val sumInts3 = ints.sumByDouble { int : Int -> int.toDouble() }
    val sumInts4 = ints.sumByDouble ({ it.toDouble() })

    val lowPrice = pizzas.minBy { it.pricePerSlice }
    val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }
    val highQuantity2 = pizzas.maxBy { it.quantity }
    val totalPrice = pizzas.sumByDouble { it.pricePerSlice * it.quantity }

    val doubleInts = ints.map { it * 2 }
    println("doubleInts: $doubleInts")
}

//High-Order Func
//1-minBy,maxBy (Geriye int doner)
//2-sumBy (Geriye int doner),sumByDouble (Geriye double doner)
//3-filter (Geriye genellikle list doner) (Filtreler)
//4-map (Geriye list doner) (degisiklik yapar)
//5-forEach
//6-groupBy(Geriye map doner) (paremetre olarak tek bir degisken alır)
//7-fold(baslangıc degeri atar ve islemi oyle yapar. İki parametre alır.)