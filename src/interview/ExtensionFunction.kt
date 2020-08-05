package interview

class Car(val model: String) {

    fun startEngine() {
        println("Car is working...")
    }

    fun Car.neverStopped() {

        println("Car is stopping...")

    }
}

fun Car.stopEngine() {

    val x = "nejfnfe"

    println("Car is stopping...")

}

val String.a: Int
    get() = 44


fun main(args: Array<String>) {

    val car = Car("Mercedes CLA")
    car.startEngine()
    car.stopEngine()

    "dfdfdf".a
}