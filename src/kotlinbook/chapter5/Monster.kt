package kotlinbook.chapter5

fun main(args: Array<String>) {

    val m = arrayOf(Vampyre(),Dragon(), Monster())
    for(item in m){
        item.frighten()
    }
}

open class Monster{

    open fun frighten() : Boolean {
        println("Aargh!")
        return true
    }
}

class Vampyre : Monster(){

    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return false
    }
}

class Dragon : Monster(){

    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }
}