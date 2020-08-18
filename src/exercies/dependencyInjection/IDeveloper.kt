package exercies.dependencyInjection

interface IDeveloper {
    fun doApplication() {
        println("Do application!")
    }
}

class IOSDeveloper : IDeveloper {
    override fun doApplication() {
        println("Ios developer do application!")
    }
}

class AndroidDeveloper : IDeveloper {
    override fun doApplication() {
        println("Android Developer do application!")
    }
}