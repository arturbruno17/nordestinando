package com.posart.nordestinando.model

data class TouristSpot(
    val id: Long,
    val name: String,
    val description: String,
    val image: String,
    val location: Location
)

data class Location(val state: String, val city: String)
