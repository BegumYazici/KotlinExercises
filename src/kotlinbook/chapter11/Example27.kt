package kotlinbook.chapter11

fun myFun(x : Int = 6 , y : (Int) -> Int) : Int {

    return y(x)
}

fun myFun2(x : Int = 6, y : (Int) -> Int = {it}){

    //return y.invoke(x)
}

fun myFun3(x : Int = 6, y : (Int) -> Int = {x : Int -> x + 6}) : Int {

    return y(x)
}