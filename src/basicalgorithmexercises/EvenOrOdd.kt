package basicalgorithmexercises

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val number = reader.nextInt()

    evenOrOdd(number)
}


fun evenOrOdd(number: Int) {

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}