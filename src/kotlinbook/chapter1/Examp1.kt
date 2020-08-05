package kotlinbook.chapter1

fun main(args: Array<String>) {

    //val name = "Cormoron"
    var x = 3
    x *= 10
    println("x is $x.")

    while (x>20) {
        x -= 1
        println("x is now $x.")
    }

    for (i in 1..10){
        x += 1
        println("x is now $x.")
    }

    var x2 = 4
    while(x2 >3){
        println(x2)
        x2 -= 1
    }

    var z = 27
    while (z == 10){
        println(z)
        z += 6
    }
}