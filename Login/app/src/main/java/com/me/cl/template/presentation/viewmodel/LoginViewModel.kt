package com.me.cl.template.presentation.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.me.cl.template.framework.data.DataResource
import com.me.cl.template.framework.viewmodel.BaseViewModel
import com.me.cl.template.framework.viewmodel.reuseWhenAlive
import com.me.cl.template.presentation.entities.User
import com.me.cl.template.presentation.repos.LoginRepository
import javax.inject.Inject

/**
 * Created by CL on 9/10/18.
 */
class LoginViewModel @Inject constructor(var loginRepository: LoginRepository) : BaseViewModel(loginRepository) {
    fun checkSignInInvalid(userName: String, pwd: String): LiveData<DataResource<User>> {
        reuseWhenAlive {
            val mutableLiveData = MutableLiveData<DataResource<User>>()
            if (userName.isEmpty() || pwd.isEmpty()) {
                return mutableLiveData.apply {
                    value = DataResource.failed("Input invalid")
                }
            }
            return loginRepository.searchUser(userName, pwd)
        }
    }

    fun checkNewAccountInvalid(userName: String, email: String, pwd: String, phone: String): LiveData<DataResource<*>> {
        reuseWhenAlive {
            val mutableLiveData = MutableLiveData<DataResource<*>>()
            if (userName.isEmpty() || email.isEmpty() || pwd.isEmpty()) {
                return mutableLiveData.apply {
                    value = DataResource.failed<Any>("Input invalid")
                }
            }
            return loginRepository.signUp(User(email, pwd, userName, if (phone.isEmpty()) null else phone.toInt())) as LiveData<DataResource<*>>
        }
    }

    fun searchUser(email: String?): LiveData<DataResource<User>> {
        reuseWhenAlive {
            val mutableLiveData = MutableLiveData<DataResource<User>>()
            if (email.isNullOrEmpty()){
                return mutableLiveData.apply {
                    value = DataResource.Absent()
                }
            }
             return loginRepository.searchUser(email?:"")
        }
    }

}