package com.me.cl.template.framework.data.local.room.dao;

import java.lang.System;

/**
 * * Created by CL on 9/10/18.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/me/cl/template/framework/data/local/room/dao/UserDao;", "", "insertUser", "", "user", "Lcom/me/cl/template/presentation/entities/User;", "(Lcom/me/cl/template/presentation/entities/User;)Ljava/lang/Long;", "searchUser", "Landroid/arch/lifecycle/LiveData;", "email", "", "pwd", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Long insertUser(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.presentation.entities.User user);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from Users where email = :email and passWord = :pwd")
    public abstract android.arch.lifecycle.LiveData<com.me.cl.template.presentation.entities.User> searchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from Users where email = :email")
    public abstract android.arch.lifecycle.LiveData<com.me.cl.template.presentation.entities.User> searchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}