package headfirstdesignpatternsexamples.factoryPattern.examp2

fun main(args: Array<String>) {

    val holidayFactory = HolidayFactory()
    holidayFactory.planHoliday(3,HolidayType.CULTURE).holidayInfo()
}