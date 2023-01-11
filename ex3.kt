fun WordCount(phrase: String): Map<String, Int> {
    val pattern = Regex("\\b\\d+\\b|\\b[A-z]+'[A-z]+|\\b[A-z]+\\b")
    val words = pattern.findAll(phrase).toList().map { it.value }
    return words.associateWith { word -> words.filter { word == it }.size }
}

fun main() {
    print("Enter a phrase: ")
    val text: String = readLine()!!
    println(WordCount(text))
}
