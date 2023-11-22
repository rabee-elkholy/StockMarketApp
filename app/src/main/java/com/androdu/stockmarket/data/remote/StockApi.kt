package com.androdu.stockmarket.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apikey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "QAAMHFDR74A83V22"
        const val BASE_URL = "https://alphavantage.co"
    }
}