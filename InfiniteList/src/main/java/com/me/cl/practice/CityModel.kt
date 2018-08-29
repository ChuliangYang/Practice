package com.me.cl.practice

/**
 * Created by CL on 8/28/18.
 */
data class CityModel(
        var city: String? = null,
        var growth_from_2000_to_2013: String? = null,
        var latitude: Double = 0.toDouble(),
        var longitude: Double = 0.toDouble(),
        var population: String? = null,
        var rank: String? = null,
        var state: String? = null
)
