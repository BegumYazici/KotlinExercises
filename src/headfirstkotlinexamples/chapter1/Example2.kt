package headfirstkotlinexamples.chapter1

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

   /* var x = 1
    println("Before the loop x=$x")

    while (x<4){
        println("In the loop. x = $x")
        x = x+1
    }

    println("After the loop. x=$x")  */
    val x=3
    val y=1
    if(x>y){
        println("x is greater than y")
    }
    println("This line runs no matter what")

    val fishName = "fish name"
    when(fishName.length){
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("Ok fish name")
    }

    val dizi = arrayOf("begum",2)
    println(Arrays.toString(dizi))

    val array = Array(7){1000.0.pow(it)}

    val numbers = intArrayOf(11,12,13,14,15)
    val mList = mutableListOf<String>()

    for(i in numbers){
        mList.add(i.toString())
    }

    println(mList)

    for(x in 0..100 step 7){
        print(x)
        print(" ")
    }
}

class Person(val x: (Int)->String) {

    fun cagır(){
        val deger = x(12)
        print(deger)
    }
}

class Okul() {
    fun a2(t:Int, x: ()->Int){

    }

    fun b(){
        val person2 =Person { rakam:Int -> "begum $rakam" }
    }
}