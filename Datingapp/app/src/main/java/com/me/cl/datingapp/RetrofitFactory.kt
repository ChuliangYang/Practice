package com.me.cl.datingapp

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by CL on 9/12/18.
 */
object RetrofitFactory {
    lateinit var retrofit:Retrofit

    fun buildRetrofit():Retrofit{
        if(::retrofit.isInitialized) return retrofit
        return Retrofit.Builder().baseUrl("http://www.dodsoneng.com/").addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()
    }
}