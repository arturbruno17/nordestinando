package com.posart.nordestinando.data.remote

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.posart.nordestinando.data.DataSource
import com.posart.nordestinando.model.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

object RemoteDataSource : DataSource {
    override fun getAllMyths(): Flow<List<Myth>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("myths")
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Myth>()
                    for (document in it) {
                        result.add(document.toObject(Myth::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterMythByName(name: String): Flow<List<Myth>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("myths")
                .whereEqualTo("name", name)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Myth>()
                    for (document in it) {
                        result.add(document.toObject(Myth::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterMythByState(state: String): Flow<List<Myth>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("myths")
                .whereEqualTo("state", state)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Myth>()
                    for (document in it) {
                        result.add(document.toObject(Myth::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun getAllArts(): Flow<List<Art>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("arts")
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Art>()
                    for (document in it) {
                        result.add(document.toObject(Art::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterArtByName(name: String): Flow<List<Art>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("arts")
                .whereEqualTo("name", name)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Art>()
                    for (document in it) {
                        result.add(document.toObject(Art::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterArtByAuthor(authorName: String): Flow<List<Art>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("arts")
                .whereEqualTo("author", authorName)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Art>()
                    for (document in it) {
                        result.add(document.toObject(Art::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun getAllTypicalFoods(): Flow<List<Food>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("foods")
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Food>()
                    for (document in it) {
                        result.add(document.toObject(Food::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterTypicalFoodByName(name: String): Flow<List<Food>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("foods")
                .whereEqualTo("name", name)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Food>()
                    for (document in it) {
                        result.add(document.toObject(Food::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterTypicalFoodByState(state: String): Flow<List<Food>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("foods")
                .whereEqualTo("state", state)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<Food>()
                    for (document in it) {
                        result.add(document.toObject(Food::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun getAllTouristSpots(): Flow<List<TouristSpot>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("tourist_spots")
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<TouristSpot>()
                    for (document in it) {
                        result.add(document.toObject(TouristSpot::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }

    override fun filterTouristSpotByName(name: String): Flow<List<TouristSpot>> = callbackFlow {
        try {
            Firebase.firestore
                .collection("tourist_spots")
                .whereEqualTo("name", name)
                .get()
                .addOnSuccessListener {
                    val result = mutableListOf<TouristSpot>()
                    for (document in it) {
                        result.add(document.toObject(TouristSpot::class.java))
                    }
                    trySend(result)
                }
                .addOnFailureListener {
                    trySend(emptyList())
                }
        } catch (e: Throwable) {
            close(e)
        }
    }
    override fun filterTouristSpotByLocation(
        state: String,
        city: String?
    ): Flow<List<TouristSpot>> = callbackFlow {
        try {
            if (city != null) {
                Firebase.firestore
                    .collection("tourist_spots")
                    .whereEqualTo("location.state", state)
                    .whereEqualTo("location.city", city)
                    .get()
                    .addOnSuccessListener {
                        val result = mutableListOf<TouristSpot>()
                        for (document in it) {
                            result.add(document.toObject(TouristSpot::class.java))
                        }
                        trySend(result)
                    }
                    .addOnFailureListener {
                        trySend(emptyList())
                    }
            } else {
                Firebase.firestore
                    .collection("tourist_spots")
                    .whereEqualTo("location.state", state)
                    .get()
                    .addOnSuccessListener {
                        val result = mutableListOf<TouristSpot>()
                        for (document in it) {
                            result.add(document.toObject(TouristSpot::class.java))
                        }
                        trySend(result)
                    }
                    .addOnFailureListener {
                        trySend(emptyList())
                    }
            }

        } catch (e: Throwable) {
            close(e)
        }
    }
    override fun getAllExpressions(): Flow<List<Dialect>> = callbackFlow {
        Firebase.firestore
            .collection("dialect")
            .get()
            .addOnSuccessListener {
                val result = mutableListOf<Dialect>()
                for (document in it) {
                    result.add(document.toObject(Dialect::class.java))
                }
                trySend(result)
            }
            .addOnFailureListener {
                trySend(emptyList())
            }
    }

    override fun filterExpressionByName(name: String): Flow<List<Dialect>> = callbackFlow {
        Firebase.firestore
            .collection("dialect")
            .whereEqualTo("name", name)
            .get()
            .addOnSuccessListener {
                val result = mutableListOf<Dialect>()
                for (document in it) {
                    result.add(document.toObject(Dialect::class.java))
                }
                trySend(result)
            }
            .addOnFailureListener {
                trySend(emptyList())
            }
    }

    override fun filterExpressionByState(state: String): Flow<List<Dialect>> = callbackFlow {
        Firebase.firestore
            .collection("dialect")
            .whereEqualTo("state", state)
            .get()
            .addOnSuccessListener {
                val result = mutableListOf<Dialect>()
                for (document in it) {
                    result.add(document.toObject(Dialect::class.java))
                }
                trySend(result)
            }
            .addOnFailureListener {
                trySend(emptyList())
            }
    }


}