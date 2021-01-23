package designpatternsbook.factoryPattern.examp2

interface Holiday {
    val holidayType: String
    val holidayPricePerPerson: Int
    val holidayLength: Int

    fun holidayInfo()
}

class CultureHoliday(private val bodyCount: Int) : Holiday {
    override val holidayType: String = "Culture holiday"
    override val holidayPricePerPerson: Int = 100
    override val holidayLength: Int = 5

    private val totalPrice = holidayPricePerPerson * bodyCount

    override fun holidayInfo() {
        println("You've booked $holidayType for $holidayLength days and just for £$totalPrice, happy holidays!")
    }
}

class CruiseHoliday(private val bodyCount: Int) : Holiday {
    override val holidayType: String = "Cruise holiday"
    override val holidayPricePerPerson: Int = 150
    override val holidayLength: Int = 10

    private val totalPrice = holidayPricePerPerson * bodyCount

    override fun holidayInfo() {
        println("You've booked $holidayType for $holidayLength days and just for £$totalPrice, happy holidays!")
    }
}