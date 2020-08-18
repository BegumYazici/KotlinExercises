package exercies.dependencyInjection

class Customer(private val iDeveloper: IDeveloper) {

    private val developer = iDeveloper

    fun createApp() {
        developer.doApplication()
    }
}