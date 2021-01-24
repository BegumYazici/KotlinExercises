package headfirstkotlinexamples.chapter9

data class Recipe3(var name: String)

fun main(args: Array<String>) {
    var mShoppingList3 = mutableListOf<String>("Tea","Eggs","Milk")
    println("mShoppingList original : $mShoppingList3")
    val extraShopping = listOf<String>("Cookies","Sugar","Eggs")
    mShoppingList3.addAll(extraShopping)   //listelerimizi birleştirdik.
    println("mShoppingList items : $mShoppingList3")
    if(mShoppingList3.contains("Tea")){
        mShoppingList3.set(mShoppingList3.indexOf("Tea"),"Coffee") //Guncelleme işlemi
    }
    mShoppingList3.sort()  //Sıralama islemi a -> z
    println("mShoppingList sorted : $mShoppingList3")
    mShoppingList3.reverse()  //Tersten yazdır
    println("mShoppingList reversed : $mShoppingList3")

    val mShoppingSet = mShoppingList3.toMutableSet()   //Mutable listimiz mutable sete cevrildi.
    println("mShoppingSet : $mShoppingSet")

    val moreShopping = setOf("Chives","Spinach","Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items : $mShoppingSet")
    mShoppingList3 = mShoppingSet.toMutableList()
    println("mShoppingList new version : $mShoppingList3")

    //Data classımızdan obje olusturuyoruz
    val r1 = Recipe3("Chicken Soup")
    val r2 = Recipe3("Quinoa Salad")
    val r3 = Recipe3("Thai Curry")
    val r4 = Recipe3("Jambalaya")
    val r5 = Recipe3("Sausage Rolls")

    val mRecipeMap = mutableMapOf<String,Recipe3>("Recipe1" to r1,"Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original : $mRecipeMap")
    val recipesToAdd = mapOf<String,Recipe3>("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated : $mRecipeMap")

    if(mRecipeMap.containsKey("Recipe1")){
        println("Recipe1 is : ${mRecipeMap.getValue("Recipe1")}")
    }
}