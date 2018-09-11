package com.me.cl.template.presentation.ui.base;

import java.lang.System;

/**
 * * Created by CL on 9/10/18.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/me/cl/template/presentation/ui/base/InjectableFragmentActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "Lcom/me/cl/template/framework/di/Injectable;", "()V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "supportFragmentInjector", "app_debug"})
public class InjectableFragmentActivity extends android.support.v7.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector, com.me.cl.template.framework.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> dispatchingAndroidInjector;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    public InjectableFragmentActivity() {
        super();
    }
}