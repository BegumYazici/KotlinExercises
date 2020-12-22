package designpatternsbook.factoryPattern

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        var pizza = Pizza()
        pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    abstract fun createPizza(type: String): Pizza
}

class NYPizzaStore : PizzaStore(){
    override fun createPizza(type: String): Pizza {
        TODO("Not yet implemented")
    }
}

class ChicagoPizzaStore: PizzaStore(){
    override fun createPizza(type: String): Pizza {
        TODO("Not yet implemented")
    }
}