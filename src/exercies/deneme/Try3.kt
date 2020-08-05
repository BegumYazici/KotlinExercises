package exercies.deneme

fun main(args: Array<String>) {

    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

    println("\nYour fortune is: ${getFortuneCookie()}")
}

fun getFortuneCookie() : String{

    val fortuneList = listOf<String>("\"You will have a great day!\"\n" +
            "\"Things will go well for you today.\"\n" +
            "\"Enjoy a wonderful day of success.\"\n" +
            "\"Be humble and all will turn out well.\"\n" +
            "\"Today is a good day for exercising restraint.\"\n" +
            "\"Take it easy and enjoy life!\"\n" +
            "\"Treasure your friends because they are your greatest fortune.\"")

    print("\"Enter your birthday...")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortuneList[birthday.rem(fortuneList.size)]   //rem??
}