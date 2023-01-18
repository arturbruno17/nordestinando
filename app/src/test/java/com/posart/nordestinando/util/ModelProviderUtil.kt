package com.posart.nordestinando.util

import com.posart.nordestinando.model.*

val MYTHS = listOf(
    Myth(1L, "Boitatá", "Boitatá", "Boitatá", "Maranhão"),
    Myth(2L, "Caipora", "Caipora", "Caipora", "Ceará")
)

val ARTS = listOf(
    Art(1L, "Boi", "Boi", "Boi", "Mestre Vitalino", "17/04/2005"),
    Art(
        2L,
        "Cangaceiro",
        "Cangaceiro",
        "Cangaceiro",
        "Mestre Vitalino",
        "17/04/2005"
    ),
)

val DIALECT = listOf(
    Dialect(1L, "Lá ele", "Lá ele", "Bahia"),
    Dialect(2L, "Ai dento", "Ai dento", "Ceará")
)

val FOODS = listOf(
    Food(1L, "Acarajé", "Acarajé", "Acarajé", "Bahia"),
    Food(2L, "Pamonha", "Pamonha", "Pamonha", "Ceará")
)

val TOURIST_SPOTS = listOf(
    TouristSpot(
        1L,
        "Pico Alto",
        "Pico Alto",
        "Pico Alto",
        Location("Ceará", "Pacoti")
    ),
    TouristSpot(
        2L,
        "Serra do Gurguri",
        "Serra do Gurguri",
        "Serra do Gurguri",
        Location("Ceará", "Redenção")
    ),
)