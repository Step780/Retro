package com.example.retro

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("meow")
    fun getFile(): Call<UrlImageModel>
}