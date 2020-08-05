package kotlinbook.chapter3

import java.lang.Math.random

fun main(args: Array<String>) {

    println("Oyun basliyor...")
    val oyuncuDizim = arrayOf("Scissors", "Paper", "Rock")

    val arraySize = oyuncuDizim.size

    //Random(2).nextInt()
    val randomDeger = (random() * arraySize).toInt()
    println("Oyuncu-1 = " + oyuncuDizim[randomDeger])
    val bilgElemani = oyuncuDizim[randomDeger]

    println("Oyuncu seciniz...Elemanlar ")
    for (i in oyuncuDizim) {
        print(i + " ")
    }

    println()

    var benimElemanim = readLine().toString()    //Ekrana girilen degeri alır.

    var tanimliDeger = false

    //Kullanıcı tanımlı deger girerse
    for(j in oyuncuDizim) {

        if (benimElemanim == j) {
            tanimliDeger = true
        }
    }

    println("Oyuncu-2 = $benimElemanim")

    //Tanımlı deger kullanıcı tarafından girilmediyse
    while (tanimliDeger == false) {
        println("Tanimli bir deger girmediniz. Tekrar deger giriniz")
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

    var kazanan : String? = null

    if((bilgElemani == "Scissors" && benimElemanim == "Paper") || (bilgElemani == "Paper" && benimElemanim == "Scissors")){
        kazanan = "Scissors"
        println("Kazanan = $kazanan")
    }else if((bilgElemani == "Scissors" && benimElemanim == "Rock") || (bilgElemani == "Rock" && benimElemanim == "Scissors")){
        kazanan = "Rock"
        println("Kazanan = $kazanan")
    }else if((bilgElemani == "Paper" && benimElemanim == "Rock") || (bilgElemani == "Rock" && benimElemanim == "Paper")){
        kazanan = "Paper"
        println("Kazanan = $kazanan")
    }else{
        println("Kisiler kendileriyle eslesmistir!")
    }

    println("Game Over...")
}