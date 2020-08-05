package designpatternsbook.theStrategyPattern1.duckUSimple

interface QuackBehavior {
    fun quack()
}

class Quack() : QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}

class Squeak() : QuackBehavior {
    override fun quack() {
        println("Squeak")
    }
}

class MuteQuack(): QuackBehavior {

    override fun quack() {
        println("<<Silence>>")
    }
}