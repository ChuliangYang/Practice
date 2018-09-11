package com.me.cl.template.framework.di;

import java.lang.System;

/**
 * * Helper class to automatically inject fragments if they implement [Injectable].
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/me/cl/template/framework/di/DaggerAutoInjector;", "", "()V", "handleActivity", "", "activity", "Landroid/app/Activity;", "inject", "application", "Lcom/me/cl/template/MyApplication;", "app_debug"})
public final class DaggerAutoInjector {
    public static final com.me.cl.template.framework.di.DaggerAutoInjector INSTANCE = null;
    
    public final void inject(@org.jetbrains.annotations.NotNull()
    com.me.cl.template.MyApplication application) {
    }
    
    private final void handleActivity(android.app.Activity activity) {
    }
    
    private DaggerAutoInjector() {
        super();
    }
}