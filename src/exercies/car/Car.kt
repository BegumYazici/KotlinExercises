package exercies.car

class Car(private val carListener: CarListener) {

    fun spentAllFuel(){
        println("All fuel has finished.")
        carListener.onFuelFinished()
    }

    //fonk olustururken parametrelerin önüne val var yazılmaz.
}