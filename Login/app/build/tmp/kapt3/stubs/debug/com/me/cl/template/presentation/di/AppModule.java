package com.me.cl.template.presentation.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/me/cl/template/presentation/di/AppModule;", "", "()V", "provideRoomDataBase", "Lcom/me/cl/template/framework/data/local/room/AppDatabase;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module(includes = {com.me.cl.template.presentation.di.ViewModelModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.me.cl.template.framework.data.local.room.AppDatabase provideRoomDataBase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}