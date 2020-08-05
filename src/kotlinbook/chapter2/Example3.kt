package kotlinbook.chapter2

fun main(args: Array<String>) {

    var x: Int = 65  // 65.2
    var isPunk = true
    var message = "Hello"  // var message = 'Hello'
    var y = 7
    var z : Int = y
    y += 50
    var s : Short
    var bigNum : Long = y.toLong()
    var b : Byte = 2
    var smallNum = b.toShort()
    b=smallNum.toByte()   //b=smallNum
    isPunk = false  //isPunk = "false"
    var k = y.toDouble()
    b=k.toByte()
    s=0b10001
}