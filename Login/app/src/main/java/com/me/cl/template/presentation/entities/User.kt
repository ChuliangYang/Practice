package com.me.cl.template.presentation.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by CL on 9/10/18.
 */
@Entity(tableName = "Users")
data class User(
        @PrimaryKey
        val email:String,
        val passWord:String,
        val name:String,
        var phoneNumber:Int?=null
)