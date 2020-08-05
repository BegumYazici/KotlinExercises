package kotlinbook.chapter11

fun main(args: Array<String>) {

  /*  val addFive = {x : Int -> x+5}
    println("Pass 6 to addFive func, result is ${addFive(6)}")

    val addInts = {x : Int, y: Int -> x+y}
    val result = addInts.invoke(6,7)
    println("Pass 6,7 to addInts, result is $result")

    val intLamda : (Int,Int) -> Int = {x,y -> x*y}
    println("Pass 10,11 to intLamda, result is ${intLamda(10,11)}")

    val addSeven : (Int) -> Int = {it + 7}  //eger lambda tek bir parametreye sahipse it kullanılabilir.
    println("Pass 12 to addSeven, result is ${addSeven(12)}")

    val myLamda : () -> Unit = {println("Hi!")}
    myLamda()  */

    //convert(20.0,{it -> it * 1.8 + 32}) // = convert(20.0) {it * 1.8 + 32}
    // convertFive { it * 1.8 + 32 }

    println("Convert 2.5 kg to Pounds : ${getConversionLambda("KgsToPounds")(2.5)}")

    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLamda = getConversionLambda("PoundsToUSTons")

    val kgsToUSTonsLambda=combine(kgsToPoundsLambda,poundsToUSTonsLamda)

    val value = 17.4
    println("$value kgs is ${convert(value,kgsToUSTonsLambda)} US Tons")

}

typealias DoubleConversion = (Double) -> Double

fun convert(x : Double, converter : DoubleConversion) : Double {

    val result = converter(x)
    println("$x is converted to $result")
    return result
}
/*fun convertFive(converter : (Int) -> Double) : Double {

    val result = converter(5)
    println("5 is converted to $result")
    return result
} */

fun getConversionLambda(str : String) : DoubleConversion{

    if(str == "CentigradeToFahrenheit"){
        return { it * 1.8 + 32}
    }else if(str == "KgsToPounds"){
        return { it * 2.04623}
    }else if(str == "PoundsToUSTons"){
        return {it / 2000.0}
    }else{
        return {it}
    }
}

fun combine(lamda1 : DoubleConversion,
            lamda2 : DoubleConversion) : DoubleConversion{

    return { x : Double -> lamda2(lamda1(x))}
}
