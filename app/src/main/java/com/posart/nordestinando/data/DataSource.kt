package com.posart.nordestinando.data

import com.posart.nordestinando.model.*
import kotlinx.coroutines.flow.Flow

interface DataSource {
    fun getAllMyths(): Flow<List<Myth>>
    fun filterMythByName(name: String): Flow<List<Myth>>
    fun filterMythByState(state: String): Flow<List<Myth>>

    fun getAllArts(): Flow<List<Art>>
    fun filterArtByName(name: String): Flow<List<Art>>
    fun filterArtByAuthor(authorName: String): Flow<List<Art>>

    fun getAllTypicalFoods(): Flow<List<Food>>
    fun filterTypicalFoodByName(name: String): Flow<List<Food>>
    fun filterTypicalFoodByState(state: String): Flow<List<Food>>

    fun getAllTouristSpots(): Flow<List<TouristSpot>>
    fun filterTouristSpotByName(name: String): Flow<List<TouristSpot>>
    fun filterTouristSpotByLocation(state: String, city: String? = null): Flow<List<TouristSpot>>
    fun getAllExpressions(): Flow<List<Dialect>>
    fun filterExpressionByName(name: String): Flow<List<Dialect>>
    fun filterExpressionByState(state: String): Flow<List<Dialect>>
}