package designpatternsbook.factoryPattern

open class Pizza {
    open var name: String = ""
    open var dough: String = ""
    open var sauce: String = ""
    private val toppingsList = arrayListOf<String>()

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        for (topping in toppingsList) {
            println(" $topping")
        }
    }

    open fun bake() {
        println("Bake for 25 min at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }
}

class NYStyleCheesePizza : Pizza {
    constructor(name: String, dough: String, sauce: String) : super() {
        this.name = name
        this.dough = dough
        this.sauce = sauce
    }

    override var name: String
        get() = super.name
        set(value) {
            "NY style pizza"
        }

    override var dough: String
        get() = super.dough
        set(value) {
            "Thin crust dough"
        }

    override var sauce: String
        get() = super.sauce
        set(value) {
            "Marinara Sauce"
        }
}

class ChicagoStyleCheesePizza : Pizza {
    constructor(name: String, dough: String, sauce: String) : super() {
        this.name = name
        this.dough = dough
        this.sauce = sauce
    }

    override var name: String
        get() = super.name
        set(value) {
            "Chicago style pizza"
        }

    override var dough: String
        get() = super.dough
        set(value) {
            "Extra Thick crust dough"
        }

    override var sauce: String
        get() = super.sauce
        set(value) {
            "Plum Tomatoes Sauce"
        }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}