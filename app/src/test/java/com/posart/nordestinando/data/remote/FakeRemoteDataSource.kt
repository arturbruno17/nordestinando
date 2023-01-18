package com.posart.nordestinando.data.remote

import com.posart.nordestinando.data.DataSource
import com.posart.nordestinando.model.*
import com.posart.nordestinando.util.*

class FakeRemoteDataSource : DataSource {

    private val myths = MYTHS
    private val arts = ARTS
    private val foods = FOODS
    private val touristSpots = TOURIST_SPOTS
    private val dialect = DIALECT

    override suspend fun getAllMyths(): List<Myth> = myths

    override suspend fun filterMythByName(name: String): List<Myth> {
        return myths.filter {
            it.name == name
        }
    }

    override suspend fun filterMythByState(state: String): List<Myth> {
       return myths.filter {
           it.state == state
       }
    }

    override suspend fun getAllArts(): List<Art> = arts

    override suspend fun filterArtByName(name: String): List<Art> {
        return arts.filter {
            it.name == name
        }
    }

    override suspend fun filterArtByAuthor(authorName: String): List<Art> {
        return arts.filter {
            it.author == authorName
        }
    }

    override suspend fun getAllTypicalFoods(): List<Food> = foods

    override suspend fun filterTypicalFoodByName(name: String): List<Food> {
        return foods.filter { it.name == name }
    }

    override suspend fun filterTypicalFoodByState(state: String): List<Food> {
        return foods.filter { it.state == state }
    }

    override suspend fun getAllTouristSpots(): List<TouristSpot> = touristSpots

    override suspend fun filterTouristSpotByName(name: String): List<TouristSpot> {
        return touristSpots.filter {
            it.name == name
        }
    }

    override suspend fun filterTouristSpotByLocation(
        state: String,
        city: String?
    ): List<TouristSpot> {
        return touristSpots.filter { touristSpots ->
            city?.let {
                return@filter (touristSpots.location.state == state) && (touristSpots.location.city == it)
            }
            touristSpots.location.state== state
        }
    }

    override suspend fun getAllExpressions(): List<Dialect> = dialect

    override suspend fun filterExpressionByName(name: String): List<Dialect> {
        return dialect.filter {
            it.name == name
        }
    }

    override suspend fun filterExpressionByState(state: String): List<Dialect> {
        return dialect.filter {
            it.state == state
        }
    }
}