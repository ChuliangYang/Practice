package com.me.cl.template.presentation.ui

import android.os.Bundle
import com.me.cl.template.R
import com.me.cl.template.presentation.ui.base.InjectableFragmentActivity

class MainActivity : InjectableFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
//        setSupportActionBar(toolbar)

        savedInstanceState?:let {
            supportFragmentManager.beginTransaction().add(R.id.fl_container, MainActivityFragment.newInstance(), MainActivityFragment.Tag).commit()
        }
    }
}
