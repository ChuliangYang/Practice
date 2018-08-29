package com.me.cl.practice

import android.app.Application

/**
 * Created by CL on 8/28/18.
 */
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        RetrofitClient.getInstance()
    }
}