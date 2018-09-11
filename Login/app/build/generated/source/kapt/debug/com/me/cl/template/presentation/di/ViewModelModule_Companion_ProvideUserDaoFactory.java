// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.di;

import com.me.cl.template.framework.data.local.room.AppDatabase;
import com.me.cl.template.framework.data.local.room.dao.UserDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ViewModelModule_Companion_ProvideUserDaoFactory implements Factory<UserDao> {
  private final ViewModelModule.Companion module;

  private final Provider<AppDatabase> dataBaseProvider;

  public ViewModelModule_Companion_ProvideUserDaoFactory(
      ViewModelModule.Companion module, Provider<AppDatabase> dataBaseProvider) {
    this.module = module;
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public UserDao get() {
    return provideInstance(module, dataBaseProvider);
  }

  public static UserDao provideInstance(
      ViewModelModule.Companion module, Provider<AppDatabase> dataBaseProvider) {
    return proxyProvideUserDao(module, dataBaseProvider.get());
  }

  public static ViewModelModule_Companion_ProvideUserDaoFactory create(
      ViewModelModule.Companion module, Provider<AppDatabase> dataBaseProvider) {
    return new ViewModelModule_Companion_ProvideUserDaoFactory(module, dataBaseProvider);
  }

  public static UserDao proxyProvideUserDao(
      ViewModelModule.Companion instance, AppDatabase dataBase) {
    return Preconditions.checkNotNull(
        instance.provideUserDao(dataBase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
