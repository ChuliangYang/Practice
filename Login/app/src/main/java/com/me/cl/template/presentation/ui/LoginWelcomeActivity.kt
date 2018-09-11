package com.me.cl.template.presentation.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.me.cl.template.R
import com.me.cl.template.databinding.ContentWelcomeBinding
import com.me.cl.template.framework.di.Injectable
import com.me.cl.template.presentation.viewmodel.LoginViewModel
import javax.inject.Inject

class LoginWelcomeActivity : AppCompatActivity(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onBackPressed() {
        super.onBackPressed()
        val `in` = Intent(this@LoginWelcomeActivity, MainActivity::class.java)
        `in`.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

        startActivity(`in`)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
        DataBindingUtil.setContentView<ContentWelcomeBinding>(this, R.layout.content_welcome).apply {
            intent.getStringExtra("email").let {
                if (it.isNotEmpty()) {
                    viewModel.searchUser(it).observe(this@LoginWelcomeActivity, Observer {
                        if (it?.isSuccess() == true) {
                            user = it.original
                        } else {

                        }
                    })
                }
            }
        }

    }
}
