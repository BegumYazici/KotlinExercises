package kotlinbook.chapter2

fun main(args: Array<String>) {

    for(i in 1..10){
        println(i)
    }

    for(j in 2 until 5){
        println(j)
    }

    for(x in 15 downTo 1){
        println(x)
    }

    for(k in 1..100 step 3) println(k)

    var x = 0
    var y= 20

    for(outer in 1..3){  //1-2-3
        for(inner in 4 downTo 2){  //4-3-2
            y++
            println("y=" + y)  //21 - 22 -23 - 22 -23-24 - 23-24-25
            x +=3
            println("x=" + x)  //3 -6 - 9 -12 -15 -18 - 21-24-27
        }
        y -=2
    }
    println("$x $y")
}

fun doSomething(msg:String, i:Int) :Unit{
    if(i>0){
        var x =0
        while (x<i){
            println(msg)
            x =x+1
        }
    }
}

fun timesThree(x:Int) : Int = x*3

fun maxValue(args: Array<Int>) : Int{
    var max = args[0]
    var x=1
    while(x<args.size){
        var item = args[x]
        max = if(max>= item) max else item
        x=x+1
    }
    return max
}