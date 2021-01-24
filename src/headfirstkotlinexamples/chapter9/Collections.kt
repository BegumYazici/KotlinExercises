package headfirstkotlinexamples.chapter9

fun main(args: Array<String>) {

    var mShoppingList = mutableListOf<String>("Tea","Eggs","Milk")
    println("mShoppingList original : $mShoppingList")
    val extraShopping = listOf<String>("Cookies","Sugar","Eggs")
    mShoppingList.addAll(extraShopping)   //ilk mutableliste ikinci list eklenmiş oldu.
    println("mShoppingList item add : $mShoppingList")

    if(mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")   //tea indexli yere coffee yaz. set,guncelleme islemi
    }

    mShoppingList.sort()  //sıralama
    println("mShoppingList sorted : $mShoppingList")
    mShoppingList.reverse()   //tersten yazdırma
    println("mShoppingList reversed : $mShoppingList")

    //mShopping listemizi mutable bir sete kopyalama islemi yaptık.  mutablelist --donustur--> mutableset
    val mShoppingSet=mShoppingList.toMutableSet()
    println("mShoppingSet : $mShoppingSet")
    //set olusturduk
    val moreShopping = setOf("Chives","Spinach","Milk")
    //moreShopping setimizi mShopping mutable setimize ekledik
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items add: $mShoppingSet")
    //mShoppingSet i mutable liste donusturmusuz.
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version : $mShoppingList")
}

//Collections : List,Set,Map