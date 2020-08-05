package exercies.deneme

fun main(args: Array<String>) {

}

fun shouldChangeWater(day : String, tempature : Int = 22, dirty : Int = 20) : Boolean{

    val isTooHot = tempature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when{
        isTooHot(tempature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(tempature: Int) : Boolean = tempature > 30

fun isDirty(dirty: Int) : Boolean = dirty > 30

fun isSunday(day: String) : Boolean = day == "Sunday"