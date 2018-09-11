package com.me.cl.template.framework.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0002\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0012H&J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u001d\u0010\u0017\u001a\u0004\u0018\u00018\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/me/cl/template/framework/data/remote/RemoteSource;", "ResultType", "", "()V", "result", "Landroid/arch/lifecycle/MediatorLiveData;", "Lcom/me/cl/template/framework/data/DataResource;", "getResult", "()Landroid/arch/lifecycle/MediatorLiveData;", "fetchFromRemote", "", "dbResult", "(Ljava/lang/Object;)V", "needFetch", "", "data", "(Ljava/lang/Object;)Z", "obtainFromLocal", "Landroid/arch/lifecycle/LiveData;", "obtainFromRemote", "Lcom/me/cl/template/framework/data/remote/NetworkResponse;", "onRemoteFetchFailed", "onRemoteFetchSuccess", "processResponse", "response", "Lcom/me/cl/template/framework/data/remote/ResponseSuccess;", "(Lcom/me/cl/template/framework/data/remote/ResponseSuccess;)Ljava/lang/Object;", "saveRemoteResult", "toLiveData", "app_debug"})
public abstract class RemoteSource<ResultType extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MediatorLiveData<com.me.cl.template.framework.data.DataResource<ResultType>> result = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MediatorLiveData<com.me.cl.template.framework.data.DataResource<ResultType>> getResult() {
        return null;
    }
    
    private final void fetchFromRemote(ResultType dbResult) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.DataResource<ResultType>> toLiveData() {
        return null;
    }
    
    public void onRemoteFetchSuccess() {
    }
    
    public void onRemoteFetchFailed() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public ResultType processResponse(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.framework.data.remote.ResponseSuccess<ResultType> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.arch.lifecycle.LiveData<ResultType> obtainFromLocal();
    
    public abstract boolean needFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.arch.lifecycle.LiveData<com.me.cl.template.framework.data.remote.NetworkResponse<ResultType>> obtainFromRemote();
    
    public abstract void saveRemoteResult(@org.jetbrains.annotations.Nullable()
    ResultType result);
    
    public RemoteSource() {
        super();
    }
}