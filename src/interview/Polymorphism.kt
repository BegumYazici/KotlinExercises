package interview

open class Parent {

    open fun print() {
        print("parent class")
    }
}

class Subclass1 : Parent() {

    override fun print() {
        println("subclass1")
    }
}

class Subclass2 : Parent() {

    override fun print() {
        print("subclass2")
    }
}

fun main(args: Array<String>) {
    var parent: Parent

    val deneme = Deneme(5)

    parent = Subclass1()
    parent.print()

    parent = Subclass2()
    parent.print()
}

class Deneme(val a: Int) {

    constructor(a:Int, b: String) : this(a) {
        print(b)
    }
}