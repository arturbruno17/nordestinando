package com.posart.nordestinando.data

import com.posart.nordestinando.model.*

interface DataSource {
    suspend fun getAllMyths(): List<Myth>
    suspend fun filterMythByName(name: String): List<Myth>
    suspend fun filterMythByState(state: String): List<Myth>

    suspend fun getAllArts(): List<Art>
    suspend fun filterArtByName(name: String): List<Art>
    suspend fun filterArtByAuthor(authorName: String): List<Art>

    suspend fun getAllTypicalFoods(): List<Food>
    suspend fun filterTypicalFoodByName(name: String): List<Food>
    suspend fun filterTypicalFoodByState(state: String): List<Food>

    suspend fun getAllTouristSpots(): List<TouristSpot>
    suspend fun filterTouristSpotByName(name: String): List<TouristSpot>
    suspend fun filterTouristSpotByLocation(state: String, city: String? = null): List<TouristSpot>
    suspend fun getAllExpressions(): List<Dialect>
    suspend fun filterExpressionByName(name: String): List<Dialect>
    suspend fun filterExpressionByState(state: String): List<Dialect>
}