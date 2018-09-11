package com.me.cl.template.framework.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014R,\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/me/cl/template/framework/viewmodel/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "repo", "Lcom/me/cl/template/framework/data/repo/BaseRepository;", "(Lcom/me/cl/template/framework/data/repo/BaseRepository;)V", "cache", "", "", "", "getCache", "()Ljava/util/Map;", "setCache", "(Ljava/util/Map;)V", "getRepo", "()Lcom/me/cl/template/framework/data/repo/BaseRepository;", "onCleared", "", "app_debug"})
public class BaseViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.Object> cache;
    @org.jetbrains.annotations.Nullable()
    private final com.me.cl.template.framework.data.repo.BaseRepository repo = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getCache() {
        return null;
    }
    
    public final void setCache(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.me.cl.template.framework.data.repo.BaseRepository getRepo() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.Nullable()
    com.me.cl.template.framework.data.repo.BaseRepository repo) {
        super();
    }
    
    public BaseViewModel() {
        super();
    }
}