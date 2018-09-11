package com.me.cl.template.framework.api;

import java.lang.System;

/**
 * * A Retrofit adapter that converts the Call into a LiveData of NetworkResponse.
 * * @param <R>
 * </R> 
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00030\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/me/cl/template/framework/api/LiveDataCallAdapter;", "R", "Lretrofit2/CallAdapter;", "Landroid/arch/lifecycle/LiveData;", "Lcom/me/cl/template/framework/data/remote/NetworkResponse;", "responseType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "adapt", "call", "Lretrofit2/Call;", "app_debug"})
public final class LiveDataCallAdapter<R extends java.lang.Object> implements retrofit2.CallAdapter<R, android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.remote.NetworkResponse<R>>> {
    private final java.lang.reflect.Type responseType = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.reflect.Type responseType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.remote.NetworkResponse<R>> adapt(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<R> call) {
        return null;
    }
    
    public LiveDataCallAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type responseType) {
        super();
    }
}