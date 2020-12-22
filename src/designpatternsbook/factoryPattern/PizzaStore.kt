package designpatternsbook.factoryPattern

abstract class PizzaStore {

    fun orderPizza(type: String): Pizza {
        val pizza : Pizza = createPizza(type)

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
        if(type == "cheese"){
            return NYStyleCheesePizza()
        }else if(type == "pepperoni"){
            return NYStylePepperoniPizza()
        }
        return NYStyleCheesePizza()
    }
}

class ChicagoPizzaStore: PizzaStore(){
    override fun createPizza(type: String): Pizza {
        return ChicagoStyleCheesePizza()
    }
}