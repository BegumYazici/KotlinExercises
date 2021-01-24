package headfirstdesignpatternsexamples.strategyPattern.duckUSimple

fun main(args: Array<String>) {

    val mallarDuck : Duck = MallarDuck()

    mallarDuck.display()
    mallarDuck.swim()
    mallarDuck.setFlyBehavior(FlyWithWings())
    mallarDuck.performFly()
    mallarDuck.performQuack()

    println("***********")

    val modelDuck : Duck = ModelDuck()

    modelDuck.setFlyBehavior(FlyNoWay())
    modelDuck.performFly()
    modelDuck.setFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()
}