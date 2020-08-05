package exercies.car

fun main(args: Array<String>) {

    val car = Car(object: CarListener{
        override fun onFuelFinished() {
            println("Fuel has finished.")
        }
    })

    car.spentAllFuel()
}