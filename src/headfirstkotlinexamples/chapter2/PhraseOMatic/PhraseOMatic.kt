package headfirstkotlinexamples.chapter2.PhraseOMatic

import java.lang.Math.random

fun main(args: Array<String>) {

    val wordArray1 = arrayOf("24/7","multi-tier","B-to-B","dynamic","pervasive")
    val wordArray2 = arrayOf("empowered","leveraged","aligned","targeted")
    val wordArray3 = arrayOf("process","paradigm","solution","portal","vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 =(random() * arraySize1).toInt()
    val rand2 =(random() * arraySize2).toInt()
    val rand3 =(random() * arraySize3).toInt()
    println("$rand1 $rand2 $rand3")
    println(random())

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)

    var randomValue =(Math.random()*10).toInt()
    println(randomValue)
}