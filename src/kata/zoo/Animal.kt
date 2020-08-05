package kata.zoo

abstract class Animal(val name : String) {

    init {
        println("animal")
    }

    var hungryState : Int = 0

    abstract val eatCapacity : Int

    abstract fun makeNoise()
}