package kotlinbook.chapter8

fun main(args: Array<String>) {

    var myCats2 : Array<Cat2?> = arrayOf(Cat2("Misty"),Cat2("Socks"))

    for(cat2 in myCats2){
        print("${cat2?.name}: ")    // print("${cat2!!.name}") only safe-call usage.
        cat2?.Meow()
    }
}
class Cat2(var name:String? = null ){
    fun Meow(){
        println("Meow!")
    }
}