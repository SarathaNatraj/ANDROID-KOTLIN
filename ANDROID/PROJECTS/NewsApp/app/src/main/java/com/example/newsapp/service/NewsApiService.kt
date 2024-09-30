package com.example.newsapp.service
import com.example.newsapp.models.NewsResponse
import retrofit2.http.*


interface NewsApiService {
    //similar to GetMapping
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("category") category: String,
        @Query("apiKey") apiKey: String = "22da1bd49c7a4d0485caff0cd6ab9cc1",
        @Query("country") country: String = "us"
    ): NewsResponse
}
