package com.example.consumerferiado

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/api/feriados/v1/2024") // ver se colocar uma variavel
    suspend fun getFeriados(): Response<List<ApiFeriadoResponse>>

}