package interview

abstract class ExercisesAbstractClass {
    //properties
    val a: Int = 0
    val name: String = "Begum"
    //concrete
    fun showName(name: String) {
        println(name)
    }
    //abstract method
    abstract fun showMyExamScore()
}

interface WindowBehavior {
    fun openWindow()
    fun closeWindow()
}

class A : ExercisesAbstractClass(), WindowBehavior {
    override fun openWindow() {
        println("open window")
    }

    override fun closeWindow() {
        println("close window")
    }

    override fun showMyExamScore() {
        println("Show my exam score")
    }
}

fun main(args: Array<String>) {

    val windowBehavior : WindowBehavior = object :WindowBehavior{
        override fun openWindow() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun closeWindow() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }
}