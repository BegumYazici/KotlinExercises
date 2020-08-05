package designpatternsbook.observerPattern2

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}

interface Display {
    fun display()
}

class CurrentConditionsDisplay(weatherData: Subject) : Observer, Display {
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

class StaticsDisplay(weatherData: Subject) : Observer, Display {
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

class ForecastDisplay(weatherData: Subject) : Observer, Display {
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