// Generated by Dagger (https://google.github.io/dagger).
package com.me.cl.template.presentation.di;

import com.me.cl.template.framework.data.local.room.AppDatabase;
import com.me.cl.template.framework.data.local.room.dao.UserDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ViewModelModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final Provider<AppDatabase> dataBaseProvider;

  public ViewModelModule_ProvideUserDaoFactory(Provider<AppDatabase> dataBaseProvider) {
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public UserDao get() {
    return provideInstance(dataBaseProvider);
  }

  public static UserDao provideInstance(Provider<AppDatabase> dataBaseProvider) {
    return proxyProvideUserDao(dataBaseProvider.get());
  }

  public static ViewModelModule_ProvideUserDaoFactory create(
      Provider<AppDatabase> dataBaseProvider) {
    return new ViewModelModule_ProvideUserDaoFactory(dataBaseProvider);
  }

  public static UserDao proxyProvideUserDao(AppDatabase dataBase) {
    return Preconditions.checkNotNull(
        ViewModelModule.provideUserDao(dataBase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}