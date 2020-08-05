package kotlinbook.chapter6

fun main(args: Array<String>) {

    var coffeeMakerObject = CoffeeMaker()
    coffeeMakerObject.consumePower()

}
abstract class Appliance{        //abstract class'ların basına superclass olması ıcın 'open' yazmaya gerek yok.
    var pluggedln = true
    abstract val color: String

    abstract fun consumePower()       //abstract fonk govdesiz olmak zorundadır.
}

class CoffeeMaker : Appliance(){
    override val color =""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming Power")
    }

    fun fillWithWater(){
        println("Fill the water")
    }

    fun makeCoffee(){
        println("Make the coffee")
    }
}