package com.posart.nordestinando.data.remote

import com.posart.nordestinando.model.Art
import com.posart.nordestinando.model.Location
import com.posart.nordestinando.model.Myth
import com.posart.nordestinando.model.TouristSpot
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(ExperimentalCoroutinesApi::class)
class RemoteDataSourceTest {

    private lateinit var fakeRemoteDataSource: FakeRemoteDataSource

    @Before
    fun setUp() {
        fakeRemoteDataSource = FakeRemoteDataSource()
    }

    @Test
    fun `given a myth, when search a myth by name, must return the correct myth`() = runTest {

        val nameMyth = "Boitatá"
        val expectedResult = listOf(Myth(1L, "Boitatá", "Boitatá", "Boitatá", "Maranhão"))

        val result = fakeRemoteDataSource.filterMythByName(nameMyth).first()

        assert(expectedResult == result)
    }

    @Test
    fun `given a myth name that doesn't exist, when search it, must return an empty list`() =
        runTest {

            val nameMyth = "Curupira"
            val expectedResult = emptyList<Myth>()

            val result = fakeRemoteDataSource.filterMythByName(nameMyth).first()

            assert(expectedResult == result)
        }

    @Test
    fun `given a myth state, when search it, must return myth list`() = runTest {

        val stateMyth = "Ceará"
        val expectedResult = listOf(Myth(2L, "Caipora", "Caipora", "Caipora", "Ceará"))

        val result = fakeRemoteDataSource.filterMythByState(stateMyth).first()

        assert(expectedResult == result)
    }

    @Test
    fun `given a myth state that doesn't exist, when search it, must return empty list`() =
        runTest {

            val stateMyth = "Alagoas"
            val expectedResult = emptyList<Myth>()

            val result = fakeRemoteDataSource.filterMythByState(stateMyth).first()

            assert(expectedResult == result)
        }

    @Test
    fun `given a art author, when search it, must return art list`() = runTest {

        val authorName = "Mestre Vitalino"

        val expectedResult = listOf(
            Art(1L, "Boi", "Boi", "Boi", "Mestre Vitalino", "17/04/2005"),
            Art(
                2L,
                "Cangaceiro",
                "Cangaceiro",
                "Cangaceiro",
                "Mestre Vitalino",
                "17/04/2005"
            )
        )

        val result = fakeRemoteDataSource.filterArtByAuthor(authorName).first()

        assert(expectedResult == result)
    }

    @Test
    fun `given a art author that doesn't exist, when search it, must return empty list`() =
        runTest {

            val authorName = "Picasso"
            val expectedResult = emptyList<Myth>()

            val result = fakeRemoteDataSource.filterArtByAuthor(authorName).first()

            assert(expectedResult == result)
        }


    @Test
    fun `given a tourist spot state, when search it, must return tourist spot list`() = runTest {

        val stateTouristSpot = "Ceará"

        val expectedResult = listOf(
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
            )
        )

        val result = fakeRemoteDataSource.filterTouristSpotByLocation(stateTouristSpot).first()

        assert(expectedResult == result)
    }

    @Test
    fun `given a tourist spot state and city, when search it, must return tourist spot list`() =
        runTest {

            val stateTouristSpot = "Ceará"
            val cityTouristSpot = "Redenção"

            val expectedResult = listOf(
                TouristSpot(
                    2L,
                    "Serra do Gurguri",
                    "Serra do Gurguri",
                    "Serra do Gurguri",
                    Location("Ceará", "Redenção")
                )
            )

            val result =
                fakeRemoteDataSource.filterTouristSpotByLocation(stateTouristSpot, cityTouristSpot).first()

            assert(expectedResult == result)
        }

    @Test
    fun `given a tourist spot state that doesn't exists, when search it, must return tourist spot list`() =
        runTest {

            val stateTouristSpot = "Alagoas"
            val expectedResult = emptyList<TouristSpot>()


            val result = fakeRemoteDataSource.filterTouristSpotByLocation(stateTouristSpot).first()

            assert(expectedResult == result)
        }

    @Test
    fun `given a tourist spot state and city that doesn't exists, when search it, must return tourist spot list`() =
        runTest {

            val stateTouristSpot = "Rio Grande do Norte"
            val cityTouristSpot = "Natal"

            val expectedResult = emptyList<TouristSpot>()

            val result =
                fakeRemoteDataSource.filterTouristSpotByLocation(stateTouristSpot, cityTouristSpot).first()

            assert(expectedResult == result)
        }

}