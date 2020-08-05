package exercies.deneme

import java.util.*

fun main(args: Array<String>) {

   /* if (args[0].toInt() < 12) println("Good morning, Kotlin")
    else println("Good night, Kotlin" )   */

    var rDay=randomDay()
    println(rDay)

    println(randomNumber())

}

fun randomDay(): String{
    val weekDays = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday")
    return weekDays[Random().nextInt(7)]  //0-6 arası
}

fun randomNumber() : Int{
    val number = listOf<Int>(12,4,16,0,86,374,28,77)
    return number[Random().nextInt(8)]
}