package basicalgorithmexercises

fun main(args: Array<String>) {

    findFrequencyOfCharacter("This is a frequency example!",'a')
}

fun findFrequencyOfCharacter(word: String, ch : Char){

    var frequency = 0

    for(i in 0..word.length-1){
        if(word[i] == ch){
            frequency++
        }
    }

    println("Frequency of $ch = $frequency")
}