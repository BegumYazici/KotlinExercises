package headfirstkotlinexamples.chapter11

fun main(args: Array<String>) {
    val x = 20
    val y = 2.3

    val lam1 = {x: Int -> x}
    println(lam1(x + 6))  //26

    val lamdaDeneme: (Double,Int) -> Double = {a,b -> a+b}

    val lam2: (Double) -> Double
    lam2 = {(it * 2) + 5}
    println(lam2(y))  //9.6

    val lam3: (Double,Double) -> Unit
    lam3 = {x,y -> println(x + y)}
    lam3.invoke(y,y)  //4.6
    //lam3(y,y)  //4.6

    var lam4 = {y: Int -> (y/2).toDouble()}
    print(lam4(x))  //10.0
    lam4 = { it + 6.3}
    print(lam4(7))  //13.3


    var addFive = {x: Int -> x+5}

    val addInts = {x: Int, y: Int -> x+y}
    val result = addInts(6,7)
    println(result)

    val addTwo : (Int) -> Int = {x -> x + 2}
    val addTwoEquals : (Int) -> Int = {it + 2} //if lambda exp has one parameter and assign the left side
    // val add = {it + 2} the code wont compile because the compiler cant infer its type

    val sum = {x: Int, y: Double -> (x + y )}
    println(sum(4,4.3))
}