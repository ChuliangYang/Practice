package com.me.cl.practice.api

import com.me.cl.practice.CityModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header

/**
 * Created by CL on 8/28/18.
 */
interface CityService {
    @GET("9bd008fd9412d425f7fd0325d08a1d30/raw/1bd3ef5d7b8b11875bf78b8fa3088533c29bd530/gistfile1.txt")
    fun getCityList(@Header("page") page:Int=0):Observable<List<CityModel>>
}