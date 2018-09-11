package com.me.cl.template.framework.data.local.room.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.me.cl.template.presentation.entities.User

/**
 * Created by CL on 9/10/18.
 */
@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User):Long?

    @Query("select * from Users where email = :email and passWord = :pwd")
    fun searchUser(email:String,pwd:String):LiveData<User?>

    @Query("select * from Users where email = :email")
    fun searchUser(email:String):LiveData<User?>
}