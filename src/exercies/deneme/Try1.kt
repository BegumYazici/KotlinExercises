package exercies.deneme

import java.util.*

fun main(args: Array<String>) {

     dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Time is stopped")
    }
}