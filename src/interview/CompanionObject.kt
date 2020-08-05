package interview


class Foo {
    init {
        println("constructor")
    }

    companion object {
        val a = kotlin.run {
            println("companion object")
        }
    }
}

