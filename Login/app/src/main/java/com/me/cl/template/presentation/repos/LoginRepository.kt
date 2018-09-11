package com.me.cl.template.presentation.repos

import android.arch.lifecycle.LiveData
import com.me.cl.template.framework.data.DataResource
import com.me.cl.template.framework.data.local.room.dao.UserDao
import com.me.cl.template.framework.data.repo.BaseRepository
import com.me.cl.template.framework.data.transform.ReactUtil
import com.me.cl.template.presentation.entities.User
import javax.inject.Inject

/**
 * Created by CL on 9/10/18.
 */
class LoginRepository @Inject constructor(var userDao:UserDao):BaseRepository() {
        fun searchUser(username:String, pwd:String):LiveData<DataResource<User>>{
           return ReactUtil.toLiveDataResource(userDao.searchUser(username,pwd))
        }

        fun signUp(user:User):LiveData<DataResource<Long>>{
            return ReactUtil.toLiveDataResource{
                userDao.insertUser(user)
            }
        }

        fun searchUser(username:String):LiveData<DataResource<User>>{
            return ReactUtil.toLiveDataResource(userDao.searchUser(username))
        }
}