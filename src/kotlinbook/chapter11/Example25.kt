package kotlinbook.chapter11

fun main(args: Array<String>) {

    val options = arrayOf("Red", "Amber", "Green")
    var crossWalk : String = options[(Math.random()*(options.size)).toInt()]
    println(crossWalk)
    if(crossWalk == "Green"){
        println("Walk!")
    }

    unless(crossWalk == "Green"){
        println("Stop")
    }
}

fun unless(condition : Boolean, code: () -> Unit){
    if(condition == true){
        code.invoke()
    }
}