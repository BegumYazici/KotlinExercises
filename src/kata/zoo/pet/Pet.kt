package kata.zoo.pet

import kata.zoo.Animal

abstract class Pet(name: String) : Animal(name) {

    init {
        println("pet")
    }

    open fun feed(){
        println("my pet is feeding")
    }

    override fun makeNoise() {
        println("Pet making noise...")
    }
}