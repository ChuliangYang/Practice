package com.me.cl.template.framework.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/me/cl/template/framework/data/remote/NetworkResponse;", "T", "", "()V", "Companion", "app_debug"})
public class NetworkResponse<T extends java.lang.Object> {
    public static final com.me.cl.template.framework.data.remote.NetworkResponse.Companion Companion = null;
    
    public NetworkResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\f\"\u0004\b\u0001\u0010\u00052\b\u0010\r\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0012\"\u0004\b\u0001\u0010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/me/cl/template/framework/data/remote/NetworkResponse$Companion;", "", "()V", "Failed", "Lcom/me/cl/template/framework/data/remote/ResponseFailed;", "T", "errorCode", "", "errorMessage", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/me/cl/template/framework/data/remote/ResponseFailed;", "Success", "Lcom/me/cl/template/framework/data/remote/ResponseSuccess;", "result", "(Ljava/lang/Object;)Lcom/me/cl/template/framework/data/remote/ResponseSuccess;", "create", "throwable", "", "Lcom/me/cl/template/framework/data/remote/NetworkResponse;", "response", "Lretrofit2/Response;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.me.cl.template.framework.data.remote.ResponseSuccess<T> Success(@org.jetbrains.annotations.Nullable()
        T result) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.me.cl.template.framework.data.remote.ResponseFailed<T> Failed(@org.jetbrains.annotations.Nullable()
        java.lang.Integer errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.me.cl.template.framework.data.remote.NetworkResponse<T> create(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> response) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.me.cl.template.framework.data.remote.ResponseFailed<T> create(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}