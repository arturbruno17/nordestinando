package com.posart.nordestinando.data.remote

import com.posart.nordestinando.data.DataSource
import com.posart.nordestinando.model.*
import com.posart.nordestinando.util.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeRemoteDataSource : DataSource {

    private val myths = MYTHS
    private val arts = ARTS
    private val foods = FOODS
    private val touristSpots = TOURIST_SPOTS
    private val dialect = DIALECT

    override fun getAllMyths(): Flow<List<Myth>> = flow { emit(myths) }

    override fun filterMythByName(name: String): Flow<List<Myth>> =
        flow {
            emit(myths.filter {
                it.name == name
            })
        }


    override fun filterMythByState(state: String): Flow<List<Myth>> =
        flow {
            emit(myths.filter {
                it.state == state
            })
        }

    override fun getAllArts(): Flow<List<Art>> = flow { emit(arts) }

    override fun filterArtByName(name: String): Flow<List<Art>> =
        flow {
            emit(arts.filter {
                it.name == name
            })
        }

    override fun filterArtByAuthor(authorName: String): Flow<List<Art>> =
        flow {
            emit(arts.filter {
                it.author == authorName
            })
        }

    override fun getAllTypicalFoods(): Flow<List<Food>> = flow { emit(foods) }

    override fun filterTypicalFoodByName(name: String): Flow<List<Food>> =
        flow {
            emit(foods.filter {
                it.name == name
            })
        }

    override fun filterTypicalFoodByState(state: String): Flow<List<Food>> =
        flow {
            emit(foods.filter {
                it.state == state
            })
        }

    override fun getAllTouristSpots(): Flow<List<TouristSpot>> = flow { emit(touristSpots) }

    override fun filterTouristSpotByName(name: String): Flow<List<TouristSpot>> =
        flow {
            emit(touristSpots.filter {
                it.name == name
            })
        }

    override fun filterTouristSpotByLocation(
        state: String,
        city: String?
    ): Flow<List<TouristSpot>> =
        flow {
            emit(touristSpots.filter { touristSpot ->
                city?.let {
                    return@filter (touristSpot.location.state == state) && (touristSpot.location.city == it)
                }
                touristSpot.location.state== state
            })
        }

    override fun getAllExpressions(): Flow<List<Dialect>> = flow { emit(dialect) }

    override fun filterExpressionByName(name: String): Flow<List<Dialect>> =
        flow {
            emit(dialect.filter {
                it.name == name
            })
        }

    override fun filterExpressionByState(state: String): Flow<List<Dialect>> =
        flow {
            emit(dialect.filter {
                it.state == state
            })
        }
}