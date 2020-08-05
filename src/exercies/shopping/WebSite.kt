package exercies.shopping

class WebSite {

    private var isActive = true

    private var activatedListener: WebSiteListener? = null

    fun visitWebSite(user: User){
        if(isActive){
            println("${user.name} is visiting the website.")
        }else{
            println("The website is passive")
        }
    }

    fun disableWebsite(){
        isActive = false
    }

    fun setActivatedListener(activated : WebSiteListener){
        activatedListener = activated
    }

    fun enabledWebsite(){
        isActive = true
        activatedListener?.webSiteActivated()    //null degilse
    }
}