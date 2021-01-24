package headfirstkotlinexamples.chapter2

fun main(args: Array<String>) {

    println("Game is starting...")
    val oyuncuDizim = arrayOf("Scissors", "Paper", "Rock")

    var bilgElemani = getGameChoice(oyuncuDizim)
    var benimElemanim :String = getUserChoice(oyuncuDizim).capitalize()

    var tanimliDeger = false

    //Kullanıcı tanımlı deger girerse
    for (j in oyuncuDizim) {

        if (benimElemanim.equals(j)) {
            tanimliDeger = true
        }
    }
    //Tanımlı deger kullanıcı tarafından girilmediyse
    while (tanimliDeger == false) {
        println("You must enter a valid choice.")
        for (i in oyuncuDizim) {
            print(i + " ")
        }
        println()

        benimElemanim = readLine().toString()

        for (j in oyuncuDizim) {

            if (benimElemanim.equals(j)) {
                tanimliDeger = true
            }
        }
    }

    printResult(bilgElemani,benimElemanim)

    println("Game Over...")
}

fun getGameChoice(oyuncuDizim : Array<String>) : String {
    //val randomNumber = Random(2).nextInt()
    val size = oyuncuDizim.size
    val randomNumber = (Math.random()*size).toInt()
    println("Computer's choise is -> ${oyuncuDizim[randomNumber]}")
    return oyuncuDizim[randomNumber]
    //return oyuncuDizim[(Math.random()*oyuncuDizim.size).toInt()]
}

fun getUserChoice(oyuncuDizim: Array<String>) : String{
    print("Please enter one of the following:")
    for (i in oyuncuDizim) {
        print(i + " ")
    }
    println()

    return readLine().toString()
}

fun printResult(bilgElemani: String, benimElemanim: String) : Unit{

    var kazanan : String? = null
    if((bilgElemani == "Scissors" && benimElemanim == "Paper") || (bilgElemani == "Paper" && benimElemanim == "Scissors")){
        kazanan = "Scissors"
        if(kazanan.equals(bilgElemani)){
            kazanan = "You win!"
        }else{
            kazanan = "I win!"
        }
        println("You chose $bilgElemani. I chose $benimElemanim. $kazanan ")
    }else if((bilgElemani == "Scissors" && benimElemanim == "Rock") || (bilgElemani == "Rock" && benimElemanim == "Scissors")){
        kazanan = "Rock"
        if(kazanan.equals(bilgElemani)){
            kazanan = "You win!"
        }else{
            kazanan = "I win!"
        }
        println("You chose $bilgElemani. I chose $benimElemanim. $kazanan ")
    }else if((bilgElemani == "Paper" && benimElemanim == "Rock") || (bilgElemani == "Rock" && benimElemanim == "Paper")){
        kazanan = "Paper"
        if(kazanan.equals(bilgElemani)){
            kazanan = "You win!"
        }else{
            kazanan = "I win!"
        }
        println("You chose $bilgElemani. I chose $benimElemanim. $kazanan ")
    }else{
        println("You chose $bilgElemani. I chose $benimElemanim. Tie!")
    }
}