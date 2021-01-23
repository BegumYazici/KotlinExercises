package designpatternsbook.factoryPattern.examp1

import java.util.*

abstract class Pizza {
    abstract var name: String
    abstract var dough: String
    abstract var sauce: String
    abstract val toppingsList: ArrayList<String>

    fun prepare() {
        println("Preparing $name")
        println("Tossing $dough...")
        println("Adding $sauce...")
        println("Adding $toppingsList: ")
        for (topping in toppingsList) {
            println(" $topping")
        }
    }

    fun bake() {
        println("Bake for 25 min at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }
}

class NYStyleCheesePizza : Pizza() {

    override var name: String = "NY style pizza"
    override var dough: String = "Thin crust dough"
    override var sauce: String = "Marinara Sauce"
    override val toppingsList: ArrayList<String> = arrayListOf()

    init {
        toppingsList.add("Grated Reggiano Cheese")
    }

}

class ChicagoStyleCheesePizza : Pizza() {

    override var name: String = "Chicago style pizza"
    override var dough: String = "Extra Thick crust dough"
    override var sauce: String = "Plum Tomatoes Sauce"
    override val toppingsList: ArrayList<String> = arrayListOf()

    init {
        toppingsList.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}

class NYStylePepperoniPizza : Pizza(){

    override var name: String = "Pepperoni style pizza"
    override var dough: String = "Extra Thick crust dough"
    override var sauce: String = "Plum Tomatoes Sauce"
    override val toppingsList: ArrayList<String> = arrayListOf()

    init {
        toppingsList.add("Shredded Mozzarella Cheese")
    }

}
