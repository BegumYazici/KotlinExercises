package exercies.dependencyInjection

fun main(args: Array<String>) {

    val androidDeveloper = AndroidDeveloper()
    val iosDeveloper = IOSDeveloper()
    val customer = Customer(androidDeveloper)
    val customer2 = Customer(iosDeveloper)

    customer.createApp()
    customer2.createApp()

}