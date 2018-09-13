package com.me.cl.datingapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RetrofitFactory.buildRetrofit().create(DateService::class.java).apply {
            getDate().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe {

            }
        }
    }
}