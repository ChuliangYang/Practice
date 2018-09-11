package com.me.cl.template.framework.data.local.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.me.cl.template.framework.data.local.room.dao.UserDao
import com.me.cl.template.presentation.entities.User

/**
 * Created by CL on 9/10/18.
 */
@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase:RoomDatabase(){
    abstract fun userDao(): UserDao
}