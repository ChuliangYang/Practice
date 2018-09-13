package com.me.cl.datingapp

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by CL on 9/12/18.
 */
interface DateService {
    @GET("matchSample.json")
    fun getDate(): Observable<Date>
}