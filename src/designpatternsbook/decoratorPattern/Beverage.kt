package designpatternsbook.decoratorPattern

abstract class Beverage {

    lateinit var description : String

    abstract fun cost() : Double
}

class Decaf : Beverage() {
    override fun cost(): Double {
        return 4.0
    }

}