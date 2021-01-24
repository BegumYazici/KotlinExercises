package headfirstkotlinexamples.chapter4

class DVDPlayer(var hasRecorder: Boolean){
    fun recordDVD(){
        if(hasRecorder){
            println("DVD recording")
        }
    }

    fun playDVD(){
        println("Playing DVD")
    }
}

fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}