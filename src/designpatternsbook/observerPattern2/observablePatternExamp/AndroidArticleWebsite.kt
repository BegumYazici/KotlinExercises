package designpatternsbook.observerPattern2.observablePatternExamp

//The interface, the IObservable,
//is responsible for holding the information about all of the observers and sending update events to them.
interface IObservable {
    val observers: ArrayList<IObserver>

    fun addObserver(observer: IObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: IObserver) {
        observers.remove(observer)
    }

    fun sendNotification() {
        observers.forEach {
            it.update()
        }
    }
}

class AndroidWebsiteNewsLetter : IObservable{

    override val observers: ArrayList<IObserver> = ArrayList()

    override fun addObserver(observer: IObserver) {
        super.addObserver(observer)
    }

    var newestArticleUrl = ""
        set(value) {
            field = value
            sendNotification()
        }
}