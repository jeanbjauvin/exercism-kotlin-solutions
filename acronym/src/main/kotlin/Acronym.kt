import kotlin.coroutines.experimental.EmptyCoroutineContext.fold

object Acronym {

    fun generate(phrase: String): String {
        return phrase.replaceAfter(":", "")
                .mapTo(mutableListOf<String>(), { char -> if (char.isLetter()) char.toString() else " " })
                .joinToString(separator = "")
                .split(" ")
                .map { it.capitalize() }
                .joinToString(separator = " ")
                .fold("", { acc, char -> if (char.isUpperCase()) acc + char else acc })
    }
}
