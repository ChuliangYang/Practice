package com.me.cl.template.presentation.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/me/cl/template/presentation/di/MainActivitySubComponentModule;", "", "()V", "mainActivityInjector", "Lcom/me/cl/template/presentation/ui/MainActivity;", "welcomeActivityInjector", "Lcom/me/cl/template/presentation/ui/LoginWelcomeActivity;", "app_debug"})
@dagger.Module()
public abstract class MainActivitySubComponentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.me.cl.template.presentation.di.MainActivityModule.class, com.me.cl.template.presentation.di.MainActivityFragmentSubComponentModule.class})
    public abstract com.me.cl.template.presentation.ui.MainActivity mainActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.me.cl.template.presentation.ui.LoginWelcomeActivity welcomeActivityInjector();
    
    public MainActivitySubComponentModule() {
        super();
    }
}