package kotlinbook.chapter9

fun main(args: Array<String>) {

    //Listeler sıralıdır ve aynı elemana birden fazla kez sahip olabilir. Null değer alabilir.
    val shopping = listOf<String>("Tea","Eggs","Milk")  //Liste olusturduk.

    println("Listenin boyutu: ${shopping.size}")
    println("Listenin birinci elemani: ${shopping.get(0)}")

    if(shopping.contains("Tea")){
        println("Tea elemanı listemizde vardır ve indexi ${shopping.indexOf("Tea")}")
    }

    //MutableList yapısı listeye benzer tek farkı değiştirilebilir olmasıdır.(add,remove,set...)
    val mShopping = mutableListOf<String>("Tea","Eggs")
    mShopping.add("Milk")  //ekleme metodu
    mShopping.add(3,"Water")  //index vererek eleman ekleme
    println("Mutable listin guncel boyutu : ${mShopping.size}")

    mShopping.removeAt(1)  //1. indexli elemanı siler ve diğer elemanları da bos yere göre kaydırır.
    mShopping.remove("Water")  //eleman ismine göre silme islemi yapar.

    if(mShopping.size > 0){
        mShopping.set(0,"Coffee")  //Guncelleme islemini index vererek yapar.
    }

    mShopping.sort()  //a->b ye kucukten->buyuge sıralama yapar.
    println("Mutable listimini sıralanmıs hali: $mShopping")

    println("Mutable listimini tersten sıralanmıs hali:")
    mShopping.reverse()
    for(item in mShopping){
        println(item)
    }
    println("Mutable listimini random karıstırılmıs hali:")
    mShopping.shuffle()
    for(item in mShopping){
        println(item)
    }

    val toAdd = mutableListOf<String>("Jam","Sugar")
    mShopping.addAll(toAdd)  //tüm elemanlar eklendi
    println("Mutable listin guncel boyutu : ${mShopping.size}")
    for(item in mShopping){
        println(item)
    }

    val toRemove = mutableListOf<String>("Milk","Sugar")
    mShopping.removeAll(toRemove)   //belirtilen elemanları siler
    for(item in mShopping){
        println(item)
    }

    mShopping.clear()  //tum elemanları siler
}
