package basicalgorithmexercises

//We give you a string and you have to reverse this string and say how many character this string has?

fun main(args: Array<String>) {

    val result = isThisWordPalindrom("aaa")

    if (result) {
        println("These words are palindrom")
    } else {
        println("These words aren't palindrom")
    }
}


fun isThisWordPalindrom(word: String): Boolean {

    val reverseWord = StringBuilder()


    for (i in word.length - 1 downTo 0) {
        reverseWord.append(word[i])
    }


    return reverseWord.toString() == word
}