package com.posart.nordestinando.repositories

import com.posart.nordestinando.data.DataSource
import com.posart.nordestinando.model.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext

class NordestinandoRepositoryImpl(
    private val remoteDataSource: DataSource,
    private val ioDispatcher: CoroutineDispatcher
) : NordestinandoRepository {
    override suspend fun getAllMyths(): List<Myth> =
        withContext(ioDispatcher) {
            remoteDataSource.getAllMyths().first()
        }


    override suspend fun filterMythByName(name: String): List<Myth> =
        withContext(ioDispatcher) {
            remoteDataSource.filterMythByName(name).first()
        }

    override suspend fun filterMythByState(state: String): List<Myth> =
        withContext(ioDispatcher) {
            remoteDataSource.filterMythByState(state).first()
        }


    override suspend fun getAllArts(): List<Art> =
        withContext(ioDispatcher) {
            remoteDataSource.getAllArts().first()
        }


    override suspend fun filterArtByName(name: String): List<Art> =
        withContext(ioDispatcher) {
            remoteDataSource.filterArtByName(name).first()
        }


    override suspend fun filterArtByAuthor(authorName: String): List<Art> =
        withContext(ioDispatcher) {
            remoteDataSource.filterArtByAuthor(authorName).first()
        }


    override suspend fun getAllTypicalFoods(): List<Food> =
        withContext(ioDispatcher) {
            remoteDataSource.getAllTypicalFoods().first()
        }


    override suspend fun filterTypicalFoodByName(name: String): List<Food> =
        withContext(ioDispatcher) {
            remoteDataSource.filterTypicalFoodByName(name).first()
        }


    override suspend fun filterTypicalFoodByState(state: String): List<Food> =
        withContext(ioDispatcher) {
            remoteDataSource.filterTypicalFoodByState(state).first()
        }


    override suspend fun getAllTouristSpots(): List<TouristSpot> =
        withContext(ioDispatcher) {
            remoteDataSource.getAllTouristSpots().first()
        }

    override suspend fun filterTouristSpotByName(name: String): List<TouristSpot> =
        withContext(ioDispatcher) {
            remoteDataSource.filterTouristSpotByName(name).first()
        }


    override suspend fun filterTouristSpotByLocation(
        state: String,
        city: String?
    ): List<TouristSpot> =
        withContext(ioDispatcher) {
            remoteDataSource.filterTouristSpotByLocation(state, city).first()
        }


    override suspend fun getAllExpressions(): List<Dialect> =
        withContext(ioDispatcher) {
            remoteDataSource.getAllExpressions().first()
        }


    override suspend fun filterExpressionByName(name: String): List<Dialect> =
        withContext(ioDispatcher) {
            remoteDataSource.filterExpressionByName(name).first()
        }


    override suspend fun filterExpressionByState(state: String): List<Dialect> =
        withContext(ioDispatcher) {
            remoteDataSource.filterExpressionByState(state).first()
        }
}