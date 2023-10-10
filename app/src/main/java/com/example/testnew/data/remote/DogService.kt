package com.example.testnew


import com.example.testnew.utils.Constants
import retrofit2.Response
import retrofit2.http.GET


interface DogService {

    @GET(Constants.RANDOM_URL)
    suspend fun getDog(): Response<DogResponse>
}
