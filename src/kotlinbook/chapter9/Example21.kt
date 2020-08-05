package kotlinbook.chapter9

fun main(args: Array<String>) {

    val petsLiam = listOf<String>("Cat","Dog","Fish","Fish")
    val petsSophia = listOf<String>("Cat","Owl")
    val petsNoah = listOf<String>("Dog","Dove","Dog","Dove")
    val petsEmily = listOf<String>("Hedgehog")

    //Butun petleri ıceren bir liste yap
    var mPetsEveryoneList = mutableListOf<String>()
    mPetsEveryoneList.addAll(petsLiam)
    mPetsEveryoneList.addAll(petsEmily)
    mPetsEveryoneList.addAll(petsNoah)
    mPetsEveryoneList.addAll(petsSophia)

    println("mPetsEveryoneList item : $mPetsEveryoneList and size is: ${mPetsEveryoneList.size}")

    //kac farklı tip hayvan oldugu bilgisi
    //listemi set e donustururum
    var mPetsEveryoneSet=mPetsEveryoneList.toMutableSet()
    println("mPetsEveryoneSet item : $mPetsEveryoneSet and size is: ${mPetsEveryoneSet.size}")

    //sıralama
    val petList=mPetsEveryoneSet.toMutableList()
    petList.sort()
    println(petList)
}