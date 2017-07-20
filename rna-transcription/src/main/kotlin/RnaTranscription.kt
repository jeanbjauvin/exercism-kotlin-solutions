fun transcribeToRna(dna: String): String = dna.map { nucleotideToComplement(it) } .joinToString(separator = "")


private fun nucleotideToComplement(nucleotide: Char): Char = when (nucleotide) {
    'C' -> 'G'
    'G' -> 'C'
    'T' -> 'A'
    'A' -> 'U'
    else -> Char.MIN_SURROGATE
}
