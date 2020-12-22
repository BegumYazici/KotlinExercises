package designpatternsbook.observerPattern

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}

interface Display {
    fun display()
}

class CurrentConditionsDisplay(weatherData: Observable) : Observer, Display {
    var temperature: Float? = null
    var pressure: Float? = null
    var humidity: Float? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("****Current Conditions Display****")
        println("Temperature : $temperature")
        println("Humidity : $humidity")
        println("Pressure : $pressure")
    }
}

class StaticsDisplay(weatherData: Observable) : Observer, Display {
    var temperature: Float? = null
    var pressure: Float? = null
    var humidity: Float? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("****Statics Display****")
        println("Temperature : $temperature")
        println("Humidity : $humidity")
        println("Pressure : $pressure")
    }
}

class ForecastDisplay(weatherData: Observable) : Observer, Display {
    var temperature: Float? = null
    var pressure: Float? = null
    var humidity: Float? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("****Forecast Display****")
        println("Temperature : $temperature")
        println("Humidity : $humidity")
        println("Pressure : $pressure")
    }
}

fun main(args: Array<String>) {

    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val staticsDisplay = StaticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(70.0f,49.5f,50.8f)
}