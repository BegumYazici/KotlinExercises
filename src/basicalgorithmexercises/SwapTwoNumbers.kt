package basicalgorithmexercises

fun main(args: Array<String>) {

    swapNumbersWithTemp()

    swapNumbers()
}


fun swapNumbersWithTemp(){

    var firstNumber = 10.4f
    var secondNumber = 3.92f

    val temp = secondNumber
    secondNumber = firstNumber
    firstNumber = temp


    println("$firstNumber, $secondNumber")
}

fun swapNumbers(){

    var firstNumber = 12
    var secondNumber = 25

    firstNumber = firstNumber.minus(secondNumber) //-13
    secondNumber = firstNumber.plus(secondNumber)
    firstNumber = secondNumber.minus(firstNumber)

    println("$firstNumber, $secondNumber")
}