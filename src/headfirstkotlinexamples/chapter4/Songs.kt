package headfirstkotlinexamples.chapter4

fun main(args: Array<String>) {

    val songOne = Song("title1","artist1")
    val songTwo = Song("title2","artist2")
    val songThree = Song("title3","artist3")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}

class Song(val title : String, val artist: String){

    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
}