package exercies.shopping

fun main(args: Array<String>) {
    val webSite = WebSite()

    webSite.disableWebsite()

    val user = User("begum")
    webSite.visitWebSite(user)

    webSite.setActivatedListener(object: WebSiteListener{
        override fun webSiteActivated() {
            println("Website activated.")
            webSite.visitWebSite(user)
        }
    } )

    webSite.enabledWebsite()
}