package com.me.cl.template.presentation.viewmodel;

import java.lang.System;

/**
 * * Created by CL on 9/10/18.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"Lcom/me/cl/template/presentation/viewmodel/LoginViewModel;", "Lcom/me/cl/template/framework/viewmodel/BaseViewModel;", "loginRepository", "Lcom/me/cl/template/presentation/repos/LoginRepository;", "(Lcom/me/cl/template/presentation/repos/LoginRepository;)V", "getLoginRepository", "()Lcom/me/cl/template/presentation/repos/LoginRepository;", "setLoginRepository", "checkNewAccountInvalid", "Landroid/arch/lifecycle/LiveData;", "Lcom/me/cl/template/framework/data/DataResource;", "userName", "", "email", "pwd", "phone", "checkSignInInvalid", "Lcom/me/cl/template/presentation/entities/User;", "searchUser", "app_debug"})
public final class LoginViewModel extends com.me.cl.template.framework.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.me.cl.template.presentation.repos.LoginRepository loginRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<com.me.cl.template.presentation.entities.User>> checkSignInInvalid(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<?>> checkNewAccountInvalid(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<com.me.cl.template.presentation.entities.User>> searchUser(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.me.cl.template.presentation.repos.LoginRepository getLoginRepository() {
        return null;
    }
    
    public final void setLoginRepository(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.presentation.repos.LoginRepository p0) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.presentation.repos.LoginRepository loginRepository) {
        super(null);
    }
}