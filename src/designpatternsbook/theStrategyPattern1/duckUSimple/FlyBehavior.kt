package designpatternsbook.theStrategyPattern1.duckUSimple

interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I can fly with my wings!")
    }
}

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("I can not fly!")
    }
}

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}