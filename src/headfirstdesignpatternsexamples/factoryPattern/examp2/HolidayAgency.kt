package headfirstdesignpatternsexamples.factoryPattern.examp2

abstract class HolidayAgency {
    abstract fun createHoliday(bodyCount: Int): Holiday
}

class CultureHolidayAgency : HolidayAgency(){
    override fun createHoliday(bodyCount: Int): Holiday {
        return CultureHoliday(bodyCount)
    }
}

class CruiseHolidayAgency : HolidayAgency(){
    override fun createHoliday(bodyCount: Int): Holiday {
        return CruiseHoliday(bodyCount)
    }
}

enum class HolidayType{
    CRUISE, CULTURE
}

class HolidayFactory{
    private val cultureHolidayAgency = CultureHolidayAgency()
    private val cruiseHolidayAgency = CruiseHolidayAgency()

    fun planHoliday(count : Int, holidayType: HolidayType) : Holiday {
        return when(holidayType){
            HolidayType.CRUISE -> cruiseHolidayAgency.createHoliday(count)
            HolidayType.CULTURE -> cultureHolidayAgency.createHoliday(count)
        }
    }
}
