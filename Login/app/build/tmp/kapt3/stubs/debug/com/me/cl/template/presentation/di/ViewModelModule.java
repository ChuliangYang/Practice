package com.me.cl.template.presentation.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/me/cl/template/presentation/di/ViewModelModule;", "", "()V", "bindCityListViewModel", "Landroid/arch/lifecycle/ViewModel;", "loginViewModel", "Lcom/me/cl/template/presentation/viewmodel/LoginViewModel;", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/me/cl/template/framework/viewmodel/MyViewModelFactory;", "Companion", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    public static final com.me.cl.template.presentation.di.ViewModelModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.me.cl.template.framework.di.ViewModelKey(value = com.me.cl.template.presentation.viewmodel.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindCityListViewModel(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.presentation.viewmodel.LoginViewModel loginViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.framework.viewmodel.MyViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.me.cl.template.framework.data.local.room.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.framework.data.local.room.AppDatabase dataBase) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/me/cl/template/presentation/di/ViewModelModule$Companion;", "", "()V", "provideUserDao", "Lcom/me/cl/template/framework/data/local/room/dao/UserDao;", "dataBase", "Lcom/me/cl/template/framework/data/local/room/AppDatabase;", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.me.cl.template.framework.data.local.room.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
        com.me.cl.template.framework.data.local.room.AppDatabase dataBase) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}