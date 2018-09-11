package com.me.cl.template.presentation.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.me.cl.template.R
import com.me.cl.template.framework.di.Injectable
import com.me.cl.template.presentation.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.fragment_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import javax.inject.Inject



class MainActivityFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var flipState=FlipState.Front

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
        btn_login.setOnClickListener {
            til_name.visibility=View.INVISIBLE
            clearAllInput()
            if(flipState==FlipState.Back){
                vf_action.showNext()
                flipState=FlipState.Front
            }

        }

        btn_sign_up.setOnClickListener {
            til_name.visibility=View.VISIBLE
            clearAllInput()
            if(flipState==FlipState.Front){
                vf_action.showNext()
                flipState=FlipState.Back
            }
        }

        bt_sign_in.setOnClickListener {
            viewModel.checkSignInInvalid(til_email.editText?.text.toString(),til_pwd.editText?.text.toString()).observe(this, Observer {
                if(it?.isSuccess()==true){
                    activity?.run{
                        startActivity<LoginWelcomeActivity>("email" to it.original?.email)
                    }
                }else{
                    activity?.toast(it?.extraMessage?:"")
                }
            })
        }

        bt_create.setOnClickListener {
            viewModel.checkNewAccountInvalid(til_name.editText?.text.toString(),til_email.editText?.text.toString(),til_pwd.editText?.text.toString(),et_phone.text.toString())
                    .observe(this, Observer {
                        if(it?.isSuccess()==true){
                            btn_login.performClick()
                        }else{
                            activity?.toast(it?.extraMessage?:"")
                        }
                    })
        }
    }

    private fun clearAllInput(){
        til_name.editText?.setText("")
        til_email.editText?.setText("")
        til_pwd.editText?.setText("")
        et_phone.setText("")
    }

    companion object {
        val Tag=this::class.toString()
        fun newInstance(): MainActivityFragment {
            return MainActivityFragment().apply {
               Bundle().apply {

               }.let {
                   arguments=it
               }
            }
        }
    }
}

enum class FlipState{
    Front,Back
}
