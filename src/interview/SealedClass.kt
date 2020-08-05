package interview

sealed class Color{
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}

fun eval(c: Color) =
        when (c) {
            is Color.Red -> println("Paint in Red Color")
            is Color.Orange -> println("Paint in Orange Color")
            is Color.Blue -> println("Paint in Blue Color")
        }

fun main(args: Array<String>) {
    val r = Color.Red()
    eval(r)
}