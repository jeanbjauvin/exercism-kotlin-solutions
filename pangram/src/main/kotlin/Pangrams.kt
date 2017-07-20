object Pangrams {
    fun isPangram(sentence: String): Boolean {
        val (alpha, _) = sentence.toLowerCase().partition { it.isLetter() }
        return alpha.toList().distinct().size == 26
    }
}
