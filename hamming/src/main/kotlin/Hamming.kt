object Hamming {
    fun compute(rightStrand: String, leftStrand: String): Int {
        require (rightStrand.length == leftStrand.length, {
            "leftStrand and rightStrand must be of equal length."
        })
        return rightStrand.zip(leftStrand).count { it.first != it.second }
    }
}
