package designpatternsbook.observerPattern

interface Observable {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}

class WeatherData : Observable {
    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null

    private val observerList: MutableList<Observer> = mutableListOf()

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        val index = observerList.indexOf(observer)
        if (index >= 0) {
            observerList.remove(observer)
        }
    }

    override fun notifyObservers() {
        for (observer in observerList) {
            observer.update(temperature!!, humidity!!, pressure!!)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature  = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}