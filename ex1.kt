fun secretHandshake(input: Int): List<String> {
    val output = mutableListOf<String>()
    if (input % 2 != 0) output.add("\"wink\"")
    if ((input / 2) % 2 != 0) output.add("\"double blink\"")
    if ((input / 4) % 2 != 0) output.add("\"close your eyes\"")
    if ((input / 8) % 2 != 0) output.add("\"jump\"")
    if ((input / 16) % 2 != 0) output.reverse()
    return output
}

fun main() {
     println("Secret Handshake")
     print("Enter a decimal number: ")
     val input: Int = readLine()!!.toInt()
     print("Binary number: ")
     println(Integer.toBinaryString(input))
     print("Handshake: ")
     println(secretHandshake(input))
}
