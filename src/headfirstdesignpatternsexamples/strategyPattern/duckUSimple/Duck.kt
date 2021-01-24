package headfirstdesignpatternsexamples.strategyPattern.duckUSimple

open class Duck {

    private var flyBehavior: FlyBehavior? = null
    private var quackBehavior: QuackBehavior? = null

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    open fun setFlyBehavior(flyBehavior: FlyBehavior){
        this.flyBehavior = flyBehavior
    }

    open fun setQuackBehavior(quackBehavior: QuackBehavior){
        this.quackBehavior = quackBehavior
    }

    fun swim() {
        println("All duck can swim")
    }

    open fun display() {
        println("Looks like just a duck")
    }
}


class MallarDuck : Duck(){
    override fun display() {
        println("Looks like Mallar duck")
    }
}

class ModelDuck : Duck(){
    override fun display() {
        println("Looks like Model duck")
    }
}