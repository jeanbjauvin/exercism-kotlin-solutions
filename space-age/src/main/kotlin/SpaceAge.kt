class SpaceAge(val seconds: Long) {

    val EARTH_YEAR: Long = 31_557_600

    fun onEarth(): Double = getSpaceAge(1.0)

    fun onMercury(): Double = getSpaceAge(0.2408467)

    fun onVenus(): Double = getSpaceAge(0.61519726)

    fun onMars(): Double = getSpaceAge(1.8808158)

    fun onJupiter(): Double = getSpaceAge(11.862615)

    fun onSaturn(): Double = getSpaceAge(29.447498)

    fun onUranus(): Double = getSpaceAge(84.016846)

    fun onNeptune(): Double = getSpaceAge(164.79132)

    private fun getSpaceAge(coefficient: Double): Double = Math.round((this.seconds / (EARTH_YEAR * coefficient)) * 100) / 100.0

}
