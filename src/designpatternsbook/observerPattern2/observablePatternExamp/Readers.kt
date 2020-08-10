package designpatternsbook.observerPattern2.observablePatternExamp

interface IObserver{

    fun update()
}

class AndroidWebsiteReader(private var newsletter: AndroidWebsiteNewsLetter) : IObserver {

    init {
        newsletter.addObserver(this)
    }

    override fun update() {
        println("New Android article: ${newsletter.newestArticleUrl}")
    }
}

fun main(args: Array<String>) {

    val androidWebsiteNewsLetter = AndroidWebsiteNewsLetter()
    val androidWebsiteReader = AndroidWebsiteReader(androidWebsiteNewsLetter)

    androidWebsiteNewsLetter.newestArticleUrl = "www.iamlearningkotlin.com"

}