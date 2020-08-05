package designpatternsbook.observerPattern2

fun main(args: Array<String>) {

    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val staticsDisplay = StaticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(70.0f,49.5f,50.8f)
}