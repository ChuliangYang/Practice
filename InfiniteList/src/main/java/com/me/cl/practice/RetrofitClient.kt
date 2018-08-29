package com.me.cl.practice

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by CL on 8/28/18.
 */
object RetrofitClient {
    lateinit var retrofit: Retrofit
    fun getInstance(): Retrofit {
        return if (::retrofit.isInitialized) {
            retrofit
        } else {
            retrofit = Retrofit.Builder().baseUrl("https://gist.github.com/ChuliangYang/").client(OkHttpClient.Builder().apply {
//                addNetworkInterceptor(HttpLoggingInterceptor().apply {
//                    level = HttpLoggingInterceptor.Level.BASIC
//                })
                addNetworkInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            }.build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()
            retrofit
        }
    }
}