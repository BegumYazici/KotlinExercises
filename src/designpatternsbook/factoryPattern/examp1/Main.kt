package designpatternsbook.factoryPattern.examp1

fun main(args: Array<String>) {

    val nyStorePizzaStore = NYPizzaStore()
    val chicagoPizzaStore = ChicagoPizzaStore()

    val nyPizza = nyStorePizzaStore.orderPizza("cheese")
    nyPizza.prepare()
    nyPizza.bake()
    nyPizza.cut()
    println("Ethan ordered a ${nyPizza.name}")

    val chicagoPizza = chicagoPizzaStore.orderPizza("cheese")
    println("Joel ordered a ${chicagoPizza.name} ")
}