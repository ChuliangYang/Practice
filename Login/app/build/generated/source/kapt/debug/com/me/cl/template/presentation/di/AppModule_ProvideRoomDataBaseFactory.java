// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.di;

import android.app.Application;
import com.me.cl.template.framework.data.local.room.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideRoomDataBaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideRoomDataBaseFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideInstance(module, applicationProvider);
  }

  public static AppDatabase provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideRoomDataBase(module, applicationProvider.get());
  }

  public static AppModule_ProvideRoomDataBaseFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideRoomDataBaseFactory(module, applicationProvider);
  }

  public static AppDatabase proxyProvideRoomDataBase(AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideRoomDataBase(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}