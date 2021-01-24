package headfirstkotlinexamples.chapter4

fun main(args: Array<String>) {

    var t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}

class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    }
}