package kata.zoo.pet

import kata.zoo.Flyable

class Pigeon : Pet("Pigeon"), Flyable {

    init {
        println("pigeon")
    }

    override val eatCapacity: Int = 12

    override fun makeNoise() {
        super.makeNoise()
        println("Pigeon making noise...")
    }

    override fun feed() {
        super.feed()
        println("Pigeon is feeding")
    }

    override fun fly(metre: Int) {
        println("Pigeon is flying")
    }
}