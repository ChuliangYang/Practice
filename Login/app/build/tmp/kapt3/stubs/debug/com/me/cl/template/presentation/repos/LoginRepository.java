package com.me.cl.template.presentation.repos;

import java.lang.System;

/**
 * * Created by CL on 9/10/18.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t2\u0006\u0010\u0011\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/me/cl/template/presentation/repos/LoginRepository;", "Lcom/me/cl/template/framework/data/repo/BaseRepository;", "userDao", "Lcom/me/cl/template/framework/data/local/room/dao/UserDao;", "(Lcom/me/cl/template/framework/data/local/room/dao/UserDao;)V", "getUserDao", "()Lcom/me/cl/template/framework/data/local/room/dao/UserDao;", "setUserDao", "searchUser", "Landroid/arch/lifecycle/LiveData;", "Lcom/me/cl/template/framework/data/DataResource;", "Lcom/me/cl/template/presentation/entities/User;", "username", "", "pwd", "signUp", "", "user", "app_debug"})
public final class LoginRepository extends com.me.cl.template.framework.data.repo.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private com.me.cl.template.framework.data.local.room.dao.UserDao userDao;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<com.me.cl.template.presentation.entities.User>> searchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<java.lang.Long>> signUp(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.presentation.entities.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<com.me.cl.template.presentation.entities.User>> searchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.me.cl.template.framework.data.local.room.dao.UserDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.framework.data.local.room.dao.UserDao p0) {
    }
    
    @javax.inject.Inject()
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.framework.data.local.room.dao.UserDao userDao) {
        super();
    }
}